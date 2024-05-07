package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        String connectionUrl =  "jdbc:h2:./test";
        Connection connection = DriverManager.getConnection(connectionUrl);
    }

}