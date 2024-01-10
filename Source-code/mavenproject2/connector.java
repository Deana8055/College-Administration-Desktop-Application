package com.mycompany.mavenproject2;

import java.sql.*;

public class connector {
    public static void main(String []args) throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.jdbc.Driver");
  
   
    try{
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","arbaz","Deana8055@");
    if(conn==null)
    System.out.println("Connection Failed");
    else
    {System.out.println("Conncection succeed");}
    }catch(SQLException ex){
    System.out.println(ex);
}
    }
}