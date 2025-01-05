/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.applet.Applet;
 import java.awt.Button;
 import java.awt.Color;
 import java.awt.Label;
 import java.awt.TextField;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 
 
 /**
  *
  * @author Shweta Sindhu
  */
 public class app10 extends Applet implements ActionListener {
 
     /**
      * Initialization method that will be called after the applet is loaded into
      * the browser.
      */
     Label l;
     Button b1;
     TextField t,t2;
     int i =0;
     public void init() {
         t=new TextField();
         t2=new TextField();
         l = new Label("String");
         b1 = new Button("Count");
         setBackground(Color.WHITE);
         add(l);
         add(t);
         add(t2);
         add(b1);
         b1.addActionListener(this);
         // TODO start asynchronous download of heavy resources
     }
     public void actionPerformed(ActionEvent e){
        i=t.getSelectionEnd();
        t2.setText(Integer.toString(i));
     } 
 
     // TODO overwrite start(), stop() and destroy() methods
 }
 