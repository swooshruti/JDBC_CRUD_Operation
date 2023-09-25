package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    static Connection con;

    public static Connection createC(){

        try{
            ///create the connection
            Class.forName("com.mysql.cj.jdbc.Driver");

            String user="root";
            String password="tiger";
            String url="jdbc:mysql://localhost:3306/student_management";


            con=DriverManager.getConnection(url,user,password);


        }
        catch(Exception e){
            e.printStackTrace();
        }


        return con;
    }



}
