/*l1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.applet.Applet;
 import java.awt.Button;
 import java.awt.Label;
 import java.awt.TextField;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 
 
 /**
  *
  * @author Shweta Sindhu
  */
 public class app3 extends Applet implements ActionListener 
 {
     Label l1,l2,l3;
     TextField a,b,result;
     Button b1,b2,b3,b4,b5;
     public void init() {
         // TODO start asynchronous download of heavy resources
         l1 = new Label("A");
         l2 = new Label("B");
         l3 = new Label("Result");
         a =  new TextField();
         b = new TextField();
         result = new TextField();
         b1 = new Button("Add");
         b2 = new Button("subtract");
         b3= new Button("Multiply");
         b4 = new Button("Divide");
         b5 = new Button("Clear");
         add(l1);
         add(a);
         add(l2);
         add(b);
         add(l3);
         add(result);
         add(b1);
         add(b2);
         add(b3);
         add(b4);
         add(b5);        
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
     }
     @Override
     public void actionPerformed(ActionEvent e){
         if(e.getSource()==b1){
             int x = Integer.parseInt(a.getText());
             int y = Integer.parseInt(b.getText());
             int z = x+y;
             result.setText(Integer.toString(z));  
         }
         else if (e.getSource()==b2){
             int x = Integer.parseInt(a.getText());
             int y = Integer.parseInt(b.getText());
             int z = x-y;
             result.setText(Integer.toString(z)); 
         }
         else if (e.getSource()==b3){
             int x = Integer.parseInt(a.getText());
             int y = Integer.parseInt(b.getText());
             int z = x*y;
             result.setText(Integer.toString(z)); 
         }
         else if (e.getSource()==b4){
             int x = Integer.parseInt(a.getText());
             int y = Integer.parseInt(b.getText());
             int z = x/y;
             result.setText(Integer.toString(z)); 
         }
         else{
             a.setText("");
             b.setText("");
             result.setText("");
         }
     }
 }
 