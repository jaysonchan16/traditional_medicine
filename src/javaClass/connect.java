/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

/**
 *
 * @author Sheng
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connect {
    private static Connection con;
    private static Statement st;
    
    public static Statement connection(){
        try{
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:medical.db";
            con=DriverManager.getConnection(url);
            st=con.createStatement(); 
            System.out.println("Connection Success");
        }catch(Exception ex){
            System.out.println("Connection Failed");
        }
        
         return st;
    }
    
    public static void main(String[] args){
        connect obj = new connect();
        obj.connection();
    }
}
