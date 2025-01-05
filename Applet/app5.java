        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.applet.Applet;
 import java.awt.Color;
 import java.awt.Graphics;
 import java.awt.event.KeyEvent;
 import java.awt.event.KeyListener;
 
 /**
  *
  * @author Shweta Sindhu
  */
 public class app5 extends Applet implements KeyListener{
 
    int x =100;
     public void init() {
         // TODO start asynchronous download of heavy resources
         setSize(1000,1000);
         setBackground(Color.BLACK);
         this.addKeyListener(this);
     }
    @Override
     public void paint(Graphics g){
         g.setColor(Color.GRAY);
         g.fillRect(x, 800, 300, 50);
     }
    @Override
     public void keyPressed(KeyEvent e){
         if(e.getKeyChar()=='A'& x>=60){
             x-=50;
             repaint();
             
         }
         else if(e.getKeyChar()=='S' & x<=950){
             x+=50;
             repaint();
         }
     }
        
     @Override
     public void keyTyped(KeyEvent e) {
         
     }
 
 
     @Override
     public void keyReleased(KeyEvent e) {
        
     }
 
    
 }
 