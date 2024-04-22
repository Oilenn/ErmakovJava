package ru.elengaupt.jdbctest;

import lombok.AllArgsConstructor;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class DataAccessObject<T> {
    private final DataSource dataSource;
    private final Class<T> cls;

    public void insert(T object) throws SQLException {
        String name = object.getClass().getSimpleName();
        String columns = "(";
        String values = "values(";
        Connection connection = dataSource.getConnection();
        List<Field> fields = Arrays.stream(object.getClass().getFields()).toList();

        StringBuilder sql = new StringBuilder();

        for(int i = 0; i < fields.size(); i++){
            fields.get(i).setAccessible(true);
            columns += fields.getClass().getName() + ", ";
        }
        columns += ")";

        for(int i = 1; i < fields.size() - 1; i++){
            values += "?,";
        }
        values += "?)";

        sql.append("insert into "  + name + columns + values);
        PreparedStatement statement = connection.prepareStatement(sql.toString());

        for(int i = 0; i < fields.size(); i++){
            fields.get(i).setAccessible(true);
            try {
                statement.setObject(i + 1, fields.get(i).get(object));
            } catch(IllegalAccessException e){
                e.printStackTrace();
            }
        }

        statement.execute();
        connection.close();
    }

    public void delete(int id) throws SQLException {
        Connection connection = dataSource.getConnection();
        Class<T> clazz = (Class<T>) getClass().getGenericSuperclass();
        Statement statement = connection.createStatement();

        statement.execute("delete from" + clazz.getSimpleName() + " where Id = " + id);

        connection.close();
    }

    public void delete(T object) throws SQLException {
        Connection connection = dataSource.getConnection();
        String clazz = object.getClass().getSimpleName();
        Statement statement = connection.createStatement();

        try {
            Field id = Object.class.getField("Id");
            statement.execute("delete from" + clazz + " where Id = " + id.get(object));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        };

        connection.close();
    }

    public void update(int id, T object) throws SQLException {
        String name = object.getClass().getSimpleName();
        String values = "set ";
        Connection connection = dataSource.getConnection();
        List<Field> fields = Arrays.stream(object.getClass().getFields()).toList();

        StringBuilder sql = new StringBuilder();

        for(int i = 1; i < fields.size() - 1; i++){
            fields.get(i).setAccessible(true);
            values += fields.get(i).getName() + "= ?, ";
        }
        values += fields.get(fields.size() - 1).getName() + "= ?";

        sql.append("update "  + name + values + "where Id = " + id);
        PreparedStatement statement = connection.prepareStatement(sql.toString());

        for(int i = 0; i < fields.size(); i++){
            fields.get(i).setAccessible(true);
            try {
                statement.setObject(i + 1, fields.get(i).get(object));
            } catch(IllegalAccessException e){
                e.printStackTrace();
            }
        }

        statement.execute();
        connection.close();
    }

    public List<T> getAll() throws SQLException, InstantiationException, IllegalAccessException {
        List<T> result = new ArrayList<>();

        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();


        ResultSet rs = statement.executeQuery("select * from " + cls.getGenericSuperclass().getClass().getSimpleName());

        while(rs.next()) {
            T object = cls.newInstance();
            for(Field field: cls.getDeclaredFields()){
                field.setAccessible(true);
                field.set(object, rs.getObject(field.getName()));
            }
        }

        connection.close();
        return result;
    }

//    public void createTable() throws SQLException {
//        Connection con = dataSource.getConnection();
//
//        Statement statement = con.createStatement();
//        List<Field> fields = Arrays.stream(cls.getFields()).toList();
//
//        StringBuilder sql = new StringBuilder();
//
//        for(int i = 1; i < fields.size() - 1; i++){
//            fields.get(i).setAccessible(true);
//            values += fields.get(i).getName() + "= ?, ";
//        }
//
//        statement.execute("create table" + cls.getSimpleName() +  + " if not exists");
//    }
}
