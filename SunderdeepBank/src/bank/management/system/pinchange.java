
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class pinchange extends JFrame implements ActionListener
{
    String pinnumber,cardnumber;
    JButton change,back;
    JPasswordField pin;
    pinchange(String cardnumber,String pinnumber)
    {
        this.cardnumber=cardnumber;
        this.pinnumber=pinnumber;
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
        
        
        JLabel t=new JLabel("Enter Your New Pin");
        t.setBounds(210,280,300,30);
        t.setFont(new Font("System",Font.BOLD,16));
        t.setForeground(Color.WHITE);
        image.add(t);
        
        pin=new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(200,330,250,30);
        image.add(pin);
        
        change=new JButton("Change");
        change.setFont(new Font("System",Font.BOLD,16));
        change.setBounds(360,460,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back=new JButton("Back");
        back.setFont(new Font("System",Font.BOLD,16));
        back.setBounds(360,495,150,30);
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
            new Transcation(cardnumber,pinnumber).setVisible(true);
        }
        else if(ae.getSource()==change)
        {
            String p=pin.getText();
     //       String query1="Update bank set pinnumber='"+p+"' where cardnumber='"+cardnumber+"'";
            
      //      String query2="Update signupthree set pinnumber='"+p+"' where cardnumber='"+cardnumber+"'";
       //     String query3="Update login set pinnumber='"+p+"' where cardnumber='"+cardnumber+"'";
            String query4="Update transaction set pinnumber='"+p+"' where cardnumber='"+cardnumber+"'";
            String query5="Update login set pinnumber='"+p+"' where cardnumber='"+cardnumber+"'";
            try
            {
                conn c=new conn();
       //         c.s.executeUpdate(query1);
         //       c.s.executeUpdate(query2);
           //     c.s.executeUpdate(query3);
                c.s.executeUpdate(query4);
                c.s.executeUpdate(query5);
                
                JOptionPane.showMessageDialog(null, "Pin Changed Succefully");
                
            }catch(Exception e)
            {
                System.out.print(e);
            }
        }
        
    
    }
    
    
    
    public static void main (String[] args)
    {
        new pinchange("","");
        
    }

    
}
