package org.example;

import java.sql.*;

public class SqlStatement {
    static Connection con = JDBCConnection.getConnection();
    static PreparedStatement preparedStatement;
    static ResultSet rs;

    public static void select() throws SQLException {
        String query = "select concat(firstName,\" \",LastName) as `Full Name` from user;";
        preparedStatement = con.prepareStatement(query);
        rs = preparedStatement.executeQuery();
        ResultSetMetaData resultSetMetaData = rs.getMetaData();
        int columnNumber = resultSetMetaData.getColumnCount();
        while (rs.next()) {
            String printQuery = "";
            for (int i = 1; i <= columnNumber; i++) {
                printQuery += rs.getString(i) + ".";

            }
            System.out.println(printQuery);
        }


    }
}
