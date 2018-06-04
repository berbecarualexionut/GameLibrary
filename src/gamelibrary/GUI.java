/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 *
 * @author Alex
 */
public class GUI extends JFrame {
    public JPanel container;
    public JPanel menubar;
    public JLabel platformname;
    public JComboBox platformbox; 
    public JLabel finishlabel;
    public JCheckBox finishbox;
    
    public JPanel mainpanel;
    public JTable table;
    
    
    public GUI(){
    super("MyGameLibrary");
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
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
    
    
    menubar.setLayout(new FlowLayout());
    menubar.add(platformname);
    menubar.add(platformbox);
    menubar.add(finishlabel);
    menubar.add(finishbox);
    container.add(menubar);
    pack();
    
    
    
    
    
    
    
    
    
    
    
}
    
    public static void main(String[] args){
        GUI g=new GUI();
        
    }
    

}