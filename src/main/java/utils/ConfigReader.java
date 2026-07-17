package utils;


import java.io.FileInputStream;

import java.util.Properties;



public class ConfigReader {



public static Properties loadProperties(){


    Properties properties =
            new Properties();


    try{


        FileInputStream file =
        new FileInputStream(
        "src/main/resources/database.properties");


        properties.load(file);



    }
    catch(Exception e){

        e.printStackTrace();

    }


    return properties;


}


}
