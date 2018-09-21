/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zulu;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Author is Tevin Kinuthia

public class Zulu extends JFrame implements ActionListener {
      //use of the container method
      Container container =getContentPane();
      JLabel usernamelabel=new JLabel("Username");
      JTextField username= new JTextField();
      JLabel passwordLabel= new JLabel("Password");
      JPasswordField password= new JPasswordField();
      JButton login=new JButton("Login");
      JButton cancel= new JButton("cancel");





//creation of a constructor
    public Zulu(){
    
    setLayoutManager();
    addComponentsToContainer();
    setLocationAndSize();
    }
    
    public void setLayoutManager(){
      container.setLayout(null);
    }
    public void setLoactionAndSize(){
    }
    public void addComponentsToContainer(){
    //adding components to conatainer
     container.add(usernamelabel);
      container.add(username);
      container.add(passwordLabel);
      container.add(password);
      container.add(login);
      container.add(cancel);
      
   }
    
    public void setLocationAndSize(){
    usernamelabel.setBounds(50,150,100,30);
    username.setBounds(150,150,150,30);
    passwordLabel.setBounds(50,220,100,30);
    password.setBounds(150,220,150,30);
    login.setBounds(50,300,100,30);
    cancel.setBounds(200,300,100,30);
    
    
    }
    
    public void addActionEvent(){
    //adding action listener to components
    login.addActionListener(this);
    cancel.addActionListener(this);
    
    }
   @Override
   public void actionPerformed(ActionEvent e){}
    //login button verification
   //reset button
   if (e.getSource() == cancel){
   username.setText("");
   password.setText("");
          return null;
   }
       
       
    

    public static void main(String[] args) {
      //initializing the frame and panels
      Zulu zulu1= new Zulu();
      zulu1.setTitle("Zulu log in");
      zulu1.setVisible(true);
      zulu1.setBounds(10,10,370,600);
      zulu1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      zulu1.setResizable(false);
     
    
    
}
}