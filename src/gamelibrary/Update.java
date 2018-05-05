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
    
    
    public static void main(String[] args) throws SQLException{
        Connection c1=DriverManager.getConnection("jdbc:mtsql://localhost:3306/Alex");
        Statement s=c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=s.executeQuery("SELECT * FROM library");
    } 
    
}
