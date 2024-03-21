
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class signupThree extends JFrame implements ActionListener
{
    JRadioButton b1,b2,b3,b4;
    JButton cancel,next;
    JLabel type,card,number,services,pin,pinnumber,pindetail,carddetail;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String Formno;
    signupThree(String Formno)
    {
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        
        this.Formno=Formno;
        getContentPane().setBackground(Color.WHITE);
        setSize(900,850);
        setVisible(true);
        setLocation(300,40);
        setTitle("Account Details");
        setLayout(null);
        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(280,40,300,30);
        image.add(l1);
        
        type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,18));
        type.setBounds(120,100,200,30);
        image.add(type);
        
        b1=new JRadioButton("Saving Account");
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.setBounds(120,150,200,20);
        b2=new JRadioButton("Current Account");
        b2.setFont(new Font("Raleway",Font.BOLD,14));
        b2.setBounds(120,180,200,20);
        b3=new JRadioButton("Fixed Deposit Account");
        b3.setFont(new Font("Raleway",Font.BOLD,14));
        b3.setBounds(350,150,200,20);
        b4=new JRadioButton("Recurring Account");
        b4.setFont(new Font("Raleway",Font.BOLD,14));
        b4.setBounds(350,180,200,20);
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        
        image.add(b1);
        image.add(b2);
        image.add(b3);
        image.add(b4);
        ButtonGroup group=new ButtonGroup();
        group.add(b1);
        group.add(b2);
        group.add(b3);
        group.add(b4);
        
        card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,18));
        card.setBounds(120,240,200,30);
        image.add(card);
        
        number=new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,18));
        number.setBounds(320,240,300,30);
        image.add(number);
        carddetail=new JLabel("Your 16 digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(120,280,300,20);
        image.add(carddetail);
        pin=new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD,18));
        pin.setBounds(120,320,300,30);
        image.add(pin);
        pindetail=new JLabel("Your 4 Digit PIN Number");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(120,340,300,20);
        image.add(pindetail);
        
        pinnumber=new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway",Font.BOLD,18));
        pinnumber.setBounds(320,320,300,30);
        image.add(pinnumber);
        
        services=new JLabel("Services Required");
        services.setFont(new Font("Raleway",Font.BOLD,18));
        services.setBounds(120,380,300,20);
        image.add(services);
        
        c1=new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        c1.setBounds(120,420,200,20);
        c1.setBackground(Color.WHITE);
        image.add(c1);
        c2=new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,12));
        c2.setBounds(120,460,200,20);
        c2.setBackground(Color.WHITE);
        image.add(c2);
       
        
        c3=new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        c3.setBackground(Color.WHITE);
        c3.setBounds(120,500,200,20);
        image.add(c3);
        c4=new JCheckBox("E-Mails Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        c4.setBackground(Color.WHITE);
        c4.setBounds(320,420,200,20);
        image.add(c4);
        c5=new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        c5.setBackground(Color.WHITE);
        c5.setBounds(320,460,200,20);
        image.add(c5);
        c6=new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,14));
        c6.setBackground(Color.WHITE);
        c6.setBounds(320,500,200,20);
        image.add(c6);
        
        c7=new JCheckBox("I Hereby declare that the above entered details are correct to the best of our knowledge");
        c7.setFont(new Font("Raleway",Font.BOLD,14));
        c7.setBackground(Color.WHITE);
        c7.setBounds(120,580,800,20);
        image.add(c7);
        next=new JButton("Next");
        cancel=new JButton("Cancel");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(320,640,100,30);
        next.addActionListener(this);
        image.add(next);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(480,640,100,30);
        cancel.addActionListener(this);
        image.add(cancel);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == next)
        {
            String accountType=null;
            if(b1.isSelected())
            {
                accountType="Saving Account";
            }
            if(b2.isSelected())
            {
                accountType="Current Account";
            }
            if(b3.isSelected())
            {
                accountType="Fixed deposit Account";
            }
            if(b4.isSelected())
            {
                accountType="Reccuring Account";
            }
            
            Random random=new Random();
            String cardnumber=""+ Math.abs((random.nextLong()%9000000L)+5690192020000000L);
            String pinnumber=""+ Math.abs((random.nextLong()%9000L)+1000L);
            String facility="";
            if(c1.isSelected())
            {
                facility=facility +" ATM Card";
                
            }
            if(c2.isSelected())
            {
                facility=facility +" Internet Banking";
                
            }
            if(c3.isSelected())
            {
                facility=facility+" Mobile Banking";
                
            }
            if(c4.isSelected())
            {
                facility=facility+" Email & SMS Alerts";
                
            }
            if(c5.isSelected())
            {
                facility=facility+" Cheque Book";
                
            }
            if(c6.isSelected())
            {
                facility=facility+" E-Statement";
                
            }
            if(ae.getSource()==next)
            {
            
            
            
            
            try
            {
                if(accountType.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Account Type is required");
                }
                else
                {
                conn c=new conn();
                String query1="insert into signupthree values('"+Formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                String query2="insert into login values('"+Formno+"','"+cardnumber+"','"+pinnumber+"')";
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null, "Card Number :"+cardnumber+"\nPin :"+pinnumber);
                
                
                
                }
               
            } catch(Exception e){
                System.out.print(e);
                
            }
            setVisible(false);
            new signupfour(cardnumber,pinnumber).setVisible(true);
            }
        
        }
        
        else if(ae.getSource()==cancel)
        {
            setVisible(false);
            
        }    
                
                    
                
    }
    
    
    public static void main(String args[])
    {
        new signupThree("");
    }
    
}
