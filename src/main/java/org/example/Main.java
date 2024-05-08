package org.example;

import java.sql.Connection;

public class Main {


    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.executeUpdate("CREATE TABLE test_table (name VARCHAR (100))");
        //database.executeUpdate("DROP TABLE test_table");

    }

}