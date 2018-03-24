/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import java.io.*;

/**
 *
 * @author Alex
 */
public class Game implements Serializable {
    private String name;
    private String platform;
    private boolean finish;
    
    public Game(String a,String b,boolean c){
        name=a;
        platform=b;
        finish=c;
        
        
    }
    
    public void setName(String a){
        name=a;
    }
    
   public String getName(){
       return name;
   }
   
   public void setPlatform(String a){
       platform=a;
       
   }
    
   public String getPlatform(){
       return platform;
       
   }
   
   public void setFinish(boolean a){
       finish=a;
   }
   
   public boolean getFinish(){
       return finish;
   }
    
    
}
