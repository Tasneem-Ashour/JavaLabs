package org.example;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataBase.createTable(new Person());
     //Reflection.getFilesNmaeAndType();
    }
}