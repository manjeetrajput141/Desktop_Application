
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class fastcash extends JFrame implements ActionListener{
   JButton b1,b2,b3,b4,b5,b6,exit; 
   String pinnumber,cardnumber;
    
    fastcash(String cardnumber,String pinnumber)
    {
       
        this.cardnumber=cardnumber;
        this.pinnumber=pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,850,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,850);
        add(image);
        JLabel t=new JLabel("Please Select Your Amount:");
        t.setBounds(210,280,300,30);
        t.setFont(new Font("System",Font.BOLD,16));
        t.setForeground(Color.WHITE);
        image.add(t);
        
      //  JLabel =new JLabel();
        b1=new JButton("100");
        b1.setFont(new Font("System",Font.BOLD,14));
        b1.setBounds(150,380,150,25);
        b1.addActionListener(this);
        image.add(b1);
        
        b2=new JButton("500");
        b2.setFont(new Font("System",Font.BOLD,14));
        b2.setBounds(355,380,150,25);
        b2.addActionListener(this);
        image.add(b2);
        
        b3=new JButton("1000");
        b3.setFont(new Font("System",Font.BOLD,14));
        b3.setBounds(150,410,150,25);
        b2.addActionListener(this);
        image.add(b3);
        
        b4=new JButton("2000");
        b4.setFont(new Font("System",Font.BOLD,14));
        b4.setBounds(355,410,150,25);
        b2.addActionListener(this);
        image.add(b4);
        
        b5=new JButton("5000");
        b5.setFont(new Font("System",Font.BOLD,14));
        b5.setBounds(150,440,150,25);
        b2.addActionListener(this);
        image.add(b5);
        
        b6=new JButton("10000");
        b6.setFont(new Font("System",Font.BOLD,14));
        b6.setBounds(355,440,150,25);
        b2.addActionListener(this);
        image.add(b6);
        
        
        exit=new JButton("Exit");
        exit.setFont(new Font("System",Font.BOLD,14));
        exit.setBounds(355,470,150,25);
        exit.addActionListener(this);
        
        image.add(exit);
        
        
        setSize(900,850);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit)
        {
            setVisible(false);
        }
        else
        {
            
        }
    }
   
    
    public static void main(String args[])
    {
        new fastcash("","");
    }
    
}
