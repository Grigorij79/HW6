package org.example;

public class Main {


    public static void main(String[] args) {

        Database database = Database.getInstance();
        //new DatabaseInitService().initDB(database);


        database.executeUpdate("DROP TABLE project_worker");
        database.executeUpdate("DROP TABLE project");
        database.executeUpdate("DROP TABLE client");
        database.executeUpdate("DROP TABLE worker");

        // List<MaxProjectCountClient> maxProjectCountClients = new DatabaseQueryService().findMaxProjectsClient();
    }

}