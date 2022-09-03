package org.example;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    static Statement statement;
    static ResultSet rs;
    static Field[] files = Person.class.getDeclaredFields();

    Connection con = DBConnection.getConnection();

    public static void createTable(Person person) throws SQLException {
         person = new Person();
        System.out.println(Person.class.getSimpleName());
//        String addTable =String.format( "create table if not exists %s ",Person.class.getSimpleName());
//        statement.execute(addTable);
//        for (int i = 0; i < files.length; i++) {
//            String addMetaData = String.format("ALTER TABLE table person column %s %s", files[i].getName(), files[i].getType());
//            statement.execute(addMetaData);
//         System.out.println(String.format("Column %s add",files[i].getName()));
//        }
    }

    public static void insertRecord() {

    }

    public static void printAllRecord() {

    }
}
