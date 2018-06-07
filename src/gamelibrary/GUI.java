/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

/**
 *
 * @author Alex
 */
public class GUI extends JFrame {
     Connection conn;
    
    
    public JPanel container;
    public JPanel menubar;
    public JLabel platformname;
    public JComboBox platformbox; 
    public JLabel finishlabel;
    public JCheckBox finishbox;
    
    public JPanel mainpanel;
    public JTable table;
    
   public JPanel addpanel;
   public JLabel addlabel;
   public JTextField textbox;
   public JComboBox addplatform;
   public JButton buton;
   public JCheckBox addfinish;
   public JLabel finishtext;
   
   public  Statement statement;
    
    
    public GUI() throws SQLException{
    super("MyGameLibrary");
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    
    finishtext=new JLabel("Finished?");
    addfinish=new JCheckBox();
    addpanel=new JPanel();
    addlabel=new JLabel("Name:");
    textbox=new JTextField(10);
    String[] comb={"PC","PS2","PS3","PS4"};
    addplatform=new JComboBox(comb);
    
    
    
    buton=new JButton("Add"); 
    buton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String temp1= textbox.getText();
                System.out.println(temp1);
                String temp2=(String) addplatform.getSelectedItem();
                System.out.println(temp2);
                boolean temp3=addfinish.isSelected();
                int a;
                if(temp3){
                    a=1; 
                }
                else{
                   a=0;
                }
               
            statement.executeUpdate("INSERT INTO Library (Game,Platform,Finish) VALUES(" +"'" +temp1+ "'"+"," + "'"+ temp2+"'"+ ","+a+");" );
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        
    });
    
     addpanel.add(addlabel);
     addpanel.add(textbox);
     addpanel.add(addplatform);
     addpanel.add(buton);
     addpanel.add(finishtext);
     addpanel.add(addfinish);
     
     
    
    
    container=new JPanel();
    menubar=new JPanel();
    platformname=new JLabel("Platform:");
    String[] platform={"PC","PS2","PS3","PS4"};
    
    
    
    platformbox=new JComboBox(platform);
    platformbox.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
        
    });
    
    
    finishlabel=new JLabel("Finished?");
    
    
    finishbox=new JCheckBox();
    finishbox.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    });
    mainpanel=new JPanel();
    
    
    table=new JTable();
    table.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{
            },
            new String []{"Name","Platform","Finished"}
            
    
    ));
    
    
    
    container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
    add(container);
    
    
    
    //add games to the database(components)
    menubar.setLayout(new FlowLayout());
    menubar.add(platformname);
    menubar.add(platformbox);
    menubar.add(finishlabel);
    menubar.add(finishbox);
    container.add(menubar);
    container.add(addpanel);
    pack();
    
    
    
    
    
    
    
    
    
    
    
}
    
     public Connection getConnection() throws Exception {
        
            String driver="com.mysql.jdbc.Driver";
            Class.forName(driver);
           
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lib?useSSL=true","root",""); //password to be completed
            System.out.println("Connected");
             statement=conn.createStatement();
            return conn;
           
            
            
        
    }
     
    
    public static void main(String[] args) throws SQLException, Exception{
        GUI g=new GUI();
        g.getConnection();
      
        
    }
    

}