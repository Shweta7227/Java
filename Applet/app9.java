/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.applet.Applet;
 import java.awt.Color;
 import java.awt.event.MouseEvent;
 import java.awt.event.MouseListener;
 
 /**
  *
  * @author Shweta Sindhu
  */
 public class app9 extends Applet implements MouseListener {
 
     /**
      * Initialization method that will be called after the applet is loaded into
      * the browser.
      */
     int i=0;
     public void init() {
         // TODO start asynchronous download of heavy resources
         setBackground(Color.BLACK);
         this.addMouseListener(this);
     }
     public void mouseClicked(MouseEvent e){
         Color c[]={Color.BLUE,Color.BLACK,Color.BLUE,Color.BLACK};
         setBackground(c[i]);
         i+=1;
     }
     
 
     // TODO overwrite start(), stop() and destroy() methods
 
     @Override
     public void mousePressed(MouseEvent e) {
         //To change body of generated methods, choose Tools | Templates.
     }
 
     @Override
     public void mouseReleased(MouseEvent e) {
         
     }
 
     @Override
     public void mouseEntered(MouseEvent e) {
         
     }
 
     @Override
     public void mouseExited(MouseEvent e) {
 
     }
 }
 