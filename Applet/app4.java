/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.applet.Applet;
 import java.awt.Button;
 import java.awt.Label;
 import java.awt.TextField;
 import java.awt.event.ActionEvent;
 import java.awt.Choice;
 import java.awt.event.ActionListener;
 
 public class app4 extends Applet implements ActionListener
 {
     Label l1,l2,l3;
     TextField a,b,result;
     Button b1,b5;
     Choice ch;
     public void init() {
         // TODO start asynchronous download of heavy resources
         l1 = new Label("A");
         l2 = new Label("B");
         l3 = new Label("C");
         a =  new TextField();
         b = new TextField();
         result = new TextField();
         ch = new Choice();
         b1 = new Button("Submit");
         b5 = new Button("Clear");
         add(l1);
         add(a);
         add(l2);
         add(b);
         add(l3);
         add(result);
         add(ch);
         ch.add("+");
         ch.add("-");
         ch.add("*");
         ch.add("/");
         
         add(b1);
         add(b5);     
         b1.addActionListener(this);
         b5.addActionListener(this);
     }
     
     @Override
     public void actionPerformed(ActionEvent e)
     {
         int x=0;
         int y=0;
         int z=0;
          x = Integer.parseInt(a.getText());
          y = Integer.parseInt(b.getText());
         if(e.getSource()==b1)
         {
         if(ch.getSelectedItem()=="+")
         {
             z = x+y; 
         }
         else if (ch.getSelectedItem()=="-"){
            z = x-y;
             
         }
         else if (ch.getSelectedItem()=="*"){
             z = x*y;
             
         }
         else 
         {
             
              z = x/y;
             
         }
         result.setText(Integer.toString(z)); 
         }
         else
         {
             a.setText("");
             b.setText("");
             result.setText("");
         }  
         }
     }
     
 
 
 