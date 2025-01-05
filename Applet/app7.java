/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.applet.Applet;
 import java.awt.Button;
 import java.awt.Color;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 
 /**
  *
  * @author Shweta Sindhu
  */
 public class app7 extends Applet implements ActionListener {
 
     /**
      * Initialization method that will be called after the applet is loaded into
      * the browser.
      */
     
     Button b1;
     int i =0;
     public void init() {
         // TODO start asynchronous download of heavy resources
         b1= new Button("CHANGE COLOR");
         add(b1);
         b1.addActionListener(this);
         setBackground(Color.BLACK);
     }
     public void actionPerformed(ActionEvent e){
        Color x[]={Color.BLUE,Color.RED,Color.PINK,Color.GREEN,Color.DARK_GRAY};
         
         setBackground(x[i]);
         i+=1;
             
     
         
         
     }
     
 }
 