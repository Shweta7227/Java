/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.applet.Applet;
 import java.awt.Color;
 import java.awt.Graphics;
 
 /**
  *
  * @author Shweta Sindhu
  */
 public class app6 extends Applet {
     public void init() {
         setBackground(Color.BLACK);     
     }
     public void paint(Graphics g){
         g.setColor(Color.YELLOW);
         g.fillOval(650, 380, 500, 500);
         g.setColor(Color.BLACK);
         g.fillOval(750, 500, 80, 100);
         g.fillOval(950, 500, 80, 100);
         g.setColor(Color.BLACK);
         g.fillArc(750, 600, 300, 170, 180, 180);
         
         try{
             Thread.sleep(1000);
         }
         catch(InterruptedException ex){ 
         }
         g.setColor(Color.YELLOW);
         g.fillOval(750, 500, 80, 100);
         g.fillOval(950, 500, 80, 100);
         
         try{
             Thread.sleep(1000);
         }
         catch(InterruptedException ex){ 
         }
         g.setColor(Color.BLACK);
         g.fillOval(750, 500, 80, 100);
         g.fillOval(950, 500, 80, 100);   
     }
         
     
 
     // TODO overwrite start(), stop() and destroy() methods
 }
 
