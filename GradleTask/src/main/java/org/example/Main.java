package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
      //  JDBCConnection.getConnection();
        SqlStatement.select();
    }
}