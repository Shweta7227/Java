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
 public class app12 extends Applet implements ActionListener {
 
     /**
      * Initialization method that will be called after the applet is loaded into
      * the browser.
      */
     Button b1;
     int i=0;
     public void init() {
         // TODO start asynchronous download of heavy resources
         setBackground(Color.GRAY);
         b1 = new Button("CHANGE COLOR");
         add(b1);
         b1.addActionListener(this);
     }
 
     @Override
     public void actionPerformed(ActionEvent e) {
          Color c[]={Color.BLUE,Color.BLACK,Color.YELLOW,Color.GREEN};
               setBackground(c[i]);
               i+=1;
        }
     }
    
    
         
 
     // TODO overwrite start(), stop() and destroy() methods
 
 