package database;


import java.sql.Connection;

import java.sql.DriverManager;

import java.util.Properties;


import utils.ConfigReader;



public class DBConnection {



private static Connection connection;



public static Connection getConnection(){



try{


Properties properties =
ConfigReader.loadProperties();



connection =
DriverManager.getConnection(

properties.getProperty("db.url"),

properties.getProperty("db.username"),

properties.getProperty("db.password")

);



}
catch(Exception e){

e.printStackTrace();

}



return connection;


}


}
