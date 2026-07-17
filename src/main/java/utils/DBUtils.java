package utils;


import java.sql.ResultSet;

import java.sql.Statement;

import database.DBConnection;



public class DBUtils {



public static String getUserName(
        int userId){


String name = "";



try{


Statement statement =
DBConnection
.getConnection()
.createStatement();



ResultSet result =
statement.executeQuery(

"SELECT name FROM users WHERE id="
+userId

);



while(result.next()){


name =
result.getString("name");


}



}
catch(Exception e){

e.printStackTrace();

}



return name;


}


}
