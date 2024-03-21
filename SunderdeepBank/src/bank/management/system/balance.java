package bank.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class balance extends JFrame implements ActionListener
{
    JLabel b;
    JButton exit;
    String bal;
    String cardnumber,pinnumber;
    balance(String cardnumber,String pinnumber)
    {
        setSize(900,900);
        getContentPane().setBackground(Color.WHITE);
        setLocation(300,0);
        
        this.cardnumber=cardnumber;
        this.pinnumber=pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        setVisible(true);
        
        
        JLabel t=new JLabel("Your Account Balance ");
        t.setBounds(220,280,300,30);
        t.setFont(new Font("System",Font.BOLD,18));
        t.setForeground(Color.WHITE);
        image.add(t);
        
            
            
            exit=new JButton("Exit");
            exit.setFont(new Font("System",Font.BOLD,14));
            exit.setBounds(355,470,150,25);
            exit.addActionListener(this);
            image.add(exit);
        
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("Select * from bank where cardnumber='"+cardnumber+"'");
            while(rs.next())
            {
                bal=rs.getString("balance");
                
            }
            JOptionPane.showMessageDialog(null, "'"+bal+"'");
            
            
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit)
        {
            setVisible(false);
            new Transcation(cardnumber,pinnumber).setVisible(true);
        }
    }
       
    
    public static void main(String[] args)
    {
        new balance("","");
    }

    
    
}
