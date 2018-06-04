/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import java.io.*;
import java.sql.*;

/**
 *
 * @author Alex
 */
public class Update {
    public ObjectOutputStream oos;
    public FileOutputStream fos;
    public Update() throws FileNotFoundException, IOException{
        fos=new FileOutputStream("gamelibrary");
        oos=new ObjectOutputStream(fos);
    
    }
    
    
    public static Connection getConnection() throws Exception {
        try{
            String driver="com.mysql.jdbc.Driver";
            Class.forName(driver);
           
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lib?useSSL=true","root",""); //password to be completed
            System.out.println("Connected");
            return conn;
            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return null;
        
    }
    
    
    public static void main(String[] args) throws Exception{
       
        getConnection();
    } 
    
}
