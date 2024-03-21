
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transcation extends JFrame implements ActionListener{
   JButton b1,b2,b3,b4,b5,b6,b7; 
   String pinnumber,cardnumber;
    
    Transcation(String cardnumber,String pinnumber)
    {
       
        this.cardnumber=cardnumber;
        this.pinnumber=pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        JLabel t=new JLabel("Please Select Your Transcation:");
        t.setBounds(220,280,300,30);
        t.setFont(new Font("System",Font.BOLD,16));
        t.setForeground(Color.WHITE);
        image.add(t);
        
      //  JLabel =new JLabel();
        b1=new JButton("Deposit");
        b1.setFont(new Font("System",Font.BOLD,14));
        b1.setBounds(165,400,150,25);
        b1.addActionListener(this);
        image.add(b1);
        
        b2=new JButton("Withdraw");
        b2.setFont(new Font("System",Font.BOLD,14));
        b2.setBounds(370,400,150,25);
        b2.addActionListener(this);
        image.add(b2);
        
        b3=new JButton("Fast Cash");
        b3.setFont(new Font("System",Font.BOLD,14));
        b3.setBounds(165,430,150,25);
        b2.addActionListener(this);
        image.add(b3);
        
        b4=new JButton("Balance Enquiry");
        b4.setFont(new Font("System",Font.BOLD,14));
        b4.setBounds(370,430,150,25);
        b4.addActionListener(this);
        image.add(b4);
        
        b5=new JButton("Pin Change");
        b5.setFont(new Font("System",Font.BOLD,14));
        b5.setBounds(165,460,150,25);
        b5.addActionListener(this);
        image.add(b5);
        
        b6=new JButton("Mobile");
        b6.setFont(new Font("System",Font.BOLD,14));
        b6.setBounds(370,460,150,25);
        b6.addActionListener(this);
        image.add(b6);
        
        
        b7=new JButton("Exit");
        b7.setFont(new Font("System",Font.BOLD,14));
        b7.setBounds(370,490,150,25);
        b7.addActionListener(this);
        
        image.add(b7);
        
        
        setSize(900,850);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b7)
        {
            System.exit(0);
        }
        if(ae.getSource()==b1)
        {
            setVisible(false);
            new Deposit(cardnumber,pinnumber).setVisible(true);
            
        }
        if(ae.getSource()==b2)
        {
            setVisible(false);
            new Withdraw(cardnumber,pinnumber).setVisible(true);
            
            
        }
        if(ae.getSource()==b3)
        {
            
        }
        if(ae.getSource()==b4)
        {
            setVisible(false);
            new balance(cardnumber,pinnumber).setVisible(true);
            
        }
        if(ae.getSource()==b5)
        {
            setVisible(false);
            new pinchange(cardnumber,pinnumber).setVisible(true);
            
        }
        if(ae.getSource()==b6)
        {
            
        }
        
    }
    
    public static void main(String args[])
    {
        new Transcation("","");
    }
    
}
