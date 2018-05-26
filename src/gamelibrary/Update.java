/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import java.io.*;
import java.sql.*;
import javax.activation.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

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
    
    
    public static void main(String[] args) throws SQLException, NamingException{
       Context context = new InitialContext();
        DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/myDB");
        Connection c1;
        c1 = dataSource.getConnection("jdbc:mtsql://localhost:3306/mydata");
        //Statement s=c1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        //ResultSet rs=s.executeQuery("SELECT * FROM library");
        Statement s1=c1.createStatement();
        ResultSet rs=s1.executeQuery("SELECT * FROM Test");
        System.out.println(rs);
    } 
    
}
