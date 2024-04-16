package ru.elengaupt.jdbctest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    int id;
    String name;
    Department department;
}
