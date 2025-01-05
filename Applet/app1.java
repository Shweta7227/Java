/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.applet.Applet;
 import java.awt.Color;
 import java.awt.Graphics;
 import java.awt.Font;
 public class app1 extends Applet {
     public void init() 
     {
         setBackground(Color.BLUE);
     }
     
     public void paint(Graphics g){
         int j =100;
         Font f = new Font("Arial",Font.ITALIC,40);
         g.setFont(f);
         g.setColor(Color.black);
         for(int i=0;i<=10;i++)
         {
             g.drawString("Shweta Sindhu", 400, j);
             j+=50;
         }
         
     }
 }
 