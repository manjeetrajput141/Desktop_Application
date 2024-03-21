package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class signupfour extends JFrame implements ActionListener
{
    
    JButton deposit,back;
    String pinnumber,cardnumber;
    JTextField amount;
    
    signupfour(String cardnumber,String pinnumber)
    {
        this.cardnumber=cardnumber;
        this.pinnumber=pinnumber;
        setSize(900,900);
        setLocation(300,0
        );
       // JOptionPane.showMessageDialog(null,"Card Number'"+cardnumber+"'Pin :'"+pinnumber+"'");
        
        this.pinnumber=pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        JLabel header=new JLabel("You have to Add Min Amount 1000 ");
        
        header.setBounds(190,280,300,30);
        header.setFont(new Font("System",Font.BOLD,16));
        header.setForeground(Color.WHITE);
        image.add(header);
        
        JLabel header2=new JLabel("For Succefully Open an Account");
        
        header2.setBounds(190,320,300,30);
        header2.setFont(new Font("System",Font.BOLD,16));
        header2.setForeground(Color.WHITE);
        image.add(header2);
        
        amount=new JTextField();
        amount.setBounds(190,360,300,30);
        image.add(amount);
        
        deposit=new JButton("Deposit");
        deposit.setFont(new Font("System",Font.BOLD,16));
        deposit.setBounds(360,440,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back=new JButton("Back");
        back.setFont(new Font("System",Font.BOLD,16));
        back.setBounds(360,470,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setVisible(true);
        
        
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==back)
        {
            setVisible(false);
            new signupThree(pinnumber).setVisible(true);
        }
        if(ae.getSource()== deposit)
        {
            Date date=new Date();
            String a=amount.getText();
            String mode="Deposit";
            String balance="Insert into bank values('"+cardnumber+"','"+pinnumber+"','"+a+"','"+a+"','"+date+"','"+mode+"')";
            
            
            try
            {
                conn c=new conn();
                c.s.executeUpdate(balance);
                
            }catch(Exception e)
            {
                System.out.print(e);
            }
            setVisible(false);
        }
    }
    
    public static void main(String args[])
    {
        new signupfour("","");
    }
    
}