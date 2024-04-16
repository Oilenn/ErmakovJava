package ru.elengaupt.jdbctest;

import lombok.AllArgsConstructor;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class DataAccessObject<T> {
    private final DataSource dataSource;
    private final Class<T> cls;

    public void insert(T object) throws SQLException {
        Connection con = dataSource.getConnection();
        List<Field> fields = Arrays.stream(object.getClass().getFields()).toList();

        StringBuilder sql = new StringBuilder();
        sql.append("insert into "  + object.getClass().getSimpleName() + "(");

        for(int i = 0; i < fields.size(); i++){
            fields.get(i).setAccessible(true);
            sql.append(fields.getClass().getName()).append(", ");
        }

        sql.append(")");

        PreparedStatement statement = con.prepareStatement(sql + "values(?, ?)");

        for(int i = 0; i < fields.size(); i++){
            fields.get(i).setAccessible(true);

            try {
                statement.setObject(i + 1, fields.get(i).get(object));
            } catch(IllegalAccessException e){
                e.printStackTrace();
            }
        }

        statement.execute();
    }

    public void delete(int id) throws SQLException {
        Connection con = dataSource.getConnection();
        Class<T> clazz = (Class<T>) getClass().getGenericSuperclass();
        Statement statement = con.createStatement();

        statement.execute("delete from" + clazz.getName() + " where Id = " + id);
    }

    public void update(int id, T object) throws SQLException {
        Connection con = dataSource.getConnection();

        PreparedStatement statement = con.prepareStatement("update Employee set Name = ?, Department = ? where Id = ?");

        List<Field> fields = Arrays.stream(object.getClass().getFields()).toList();

        for(int i = 0; i < fields.size(); i++){
            fields.get(i).setAccessible(true);

            try {
                statement.setObject(i + 1, fields.get(i).get(object));
            } catch(IllegalAccessException e){
                e.printStackTrace();
            }
        }


        statement.execute("update Employee set Name = ?, Department = ? where" + id +" = ?");

        for(int i = 0; i < fields.size(); i++){
            fields.get(i).setAccessible(true);

            try {
                statement.setObject(i + 1, fields.get(i + 1).get(object));
            } catch(IllegalAccessException e){
                e.printStackTrace();
            }
        }

    }

    public void getAll(T object) throws SQLException {
        statement.execute("select * from Employee");
    }

    public void createTable() throws SQLException {
        Connection con = dataSource.getConnection();

        Statement statement = con.createStatement();

        statement.execute("create table Employee(int Id, Name varchar(50), Department int) if exists");
    }
}
