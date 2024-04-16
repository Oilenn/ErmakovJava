package ru.elengaupt.jdbctest;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@AllArgsConstructor
public class EmployeeDAO {
    private final DataSource dataSource;

    public void insert(Employee employee) throws SQLException {
        int id = employee.id;

        Connection con = dataSource.getConnection();

        Statement statement = con.prepareStatement("");

        statement.execute("insert into Employee(int Id, Name varchar(50), Department int) " +
                "values(" +
                employee.id + ", "
                + employee.name + ","
                + employee.department.id + ")");
    }

    public void delete(int id) throws SQLException {
        Connection con = dataSource.getConnection();

        Statement statement = con.createStatement();

        statement.execute("delete from Employee where Id = " + id);

    }

    public void update(int id, String name, int department) throws SQLException {
        Connection con = dataSource.getConnection();

        Statement statement = con.createStatement();

        statement.execute("update Employee set Name = " + name + ", Department = " + department + " where Id = " + id);
    }

    public void getAll() throws SQLException {
        Connection con = dataSource.getConnection();

        Statement statement = con.createStatement();

        statement.execute("select * from Employee");
    }

    public void createTable() throws SQLException {
        Connection con = dataSource.getConnection();

        Statement statement = con.createStatement();

        statement.execute("create table Employee(int Id, Name varchar(50), Department int) if exists");
    }
}
