package database;


import java.sql.Connection;
import java.sql.DriverManager;



public class DBConnection {


    private static Connection connection;



    public static Connection getConnection(){


        try{


            connection =
            DriverManager.getConnection(

            "jdbc:mysql://localhost:3306/testdb",

            "root",

            "password"

            );


        }
        catch(Exception e){

            e.printStackTrace();

        }


        return connection;

    }


}
