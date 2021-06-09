//Name: Ayoub
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
public class MyFrame extends JFrame {
   
   private static int count;
   private JButton buttonInc;
   private JButton buttonDec;
   private JButton reset;
   private JLabel label;
   private JTextField field;
   public MyFrame() {
      ActionListener listener = new MyActionListener();
      count = 0;
      buttonInc = new JButton("Increment");
      buttonInc.setBackground(Color.BLUE);
      buttonInc.addActionListener(listener);
      buttonDec = new JButton("Decrement");
      buttonDec.setBackground(Color.GREEN);
      buttonDec.addActionListener(listener);
      reset = new JButton("Reset");
      reset.setBackground(Color.PINK);
      reset.addActionListener(listener);
           
      label = new JLabel("Count: ");
           
      field = new JTextField(10);
      field.setText(""+count);
           
      JPanel panel = new JPanel();
      panel.add(label);
      panel.add(field);
      panel.add(buttonInc);
      panel.add(buttonDec);
      panel.add(reset);
      panel.setBackground(Color.RED);
      add(panel);
      setSize(500, 500);
   }
   class MyActionListener implements ActionListener{
      public void actionPerformed(ActionEvent event)
      {
         if(event.getSource() == buttonInc) {
            count++;
         } else if(event.getSource() == buttonDec) {
            count--;
         } else if(event.getSource() == reset) {
            count = 0;
          
         }
         field.setText(""+count);
      }
   } 
}


