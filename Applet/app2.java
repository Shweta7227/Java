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
 public class app2 extends Applet {
     public void init() {
         // TODO start asynchronous download of heavy resources
     }
     public void paint(Graphics g){
         int x[]={900,800,1000};
         int y[]={100,500,500};
         int a[]={800,878,878,800};
         int s[]={500,500,800,900};
         int n[]={1000,922,922,1000};
         int k[]={900,1600,1600,1000};
         int w[]={100,100,500,500};
         g.setColor(Color.black);
         g.fillRect(1000, 500, 600, 400);
         g.setColor(Color.red);
         g.fillRect(800, 500, 200, 400);
         g.setColor(Color.black);
         g.fillPolygon(x, y, 3);
         g.setColor(Color.RED);
         g.fillPolygon(k, w, 4);
         g.setColor(Color.red);
         g.fillOval(878, 350, 50, 50);
         g.setColor(Color.YELLOW);
         g.fillPolygon(a, s, 4);
         g.setColor(Color.YELLOW);
         g.fillPolygon(n, s, 4);
         
         
     }
 
     // TODO overwrite start(), stop() and destroy() methods
 }
 