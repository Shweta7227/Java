/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.applet.Applet;
 import java.awt.Button;
 import java.awt.Color;
 import java.awt.Graphics;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 
 /**
  *
  * @author Shweta Sindhu
  */
 public class app8 extends Applet implements ActionListener {
 
     /**
      * Initialization method that will be called after the applet is loaded into
      * the browser.
      */
     Button b1,b2;
     public void init() {
         // TODO start asynchronous download of heavy resources
          b1 = new Button("RECTANGLE");
          b2 = new Button("Oval");
         setBackground(Color.YELLOW);
         add(b1);
         add(b2);
         b1.addActionListener(this);
         b2.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e)
     {
         Graphics g =this.getGraphics();
         if(e.getSource()==b1){
            
             g.setColor(Color.red);
             g.fillRect(800, 500, 500, 100);
         }
         else {
             
             g.setColor(Color.red);
             g.fillOval(800, 500, 500, 500);
         }
     }
 
     // TODO overwrite start(), stop() and destroy() methods
 }
 