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
 public class app11 extends Applet {
 
     /**
      * Initialization method that will be called after the applet is loaded into
      * the browser.
      */
     public void init() {
         // TODO start asynchronous download of heavy resources
         setBackground(Color.BLACK);
     }
     public void paint(Graphics g){
         int x[]={700,600,800};
         int y[]={300,500,500};
         g.setColor(Color.red);
         g.fillRect(200, 300, 100, 200);
         g.fillOval(400, 350, 100, 100);
         g.fillPolygon(x, y, 3);
         g.drawArc(900, 350, 150, 50, 0, -180);
     }
 
     // TODO overwrite start(), stop() and destroy() methods
 }
 