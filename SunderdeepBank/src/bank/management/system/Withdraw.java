
package bank.management.system;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.ResultSet;
import java.util.Date;



public class Withdraw extends JFrame implements ActionListener 
{
    JButton withdraw,back;
    JTextField amountText;
    String pinnumber;
    String cardnumber;
    int balance;
    
    Withdraw(String cardnumber,String pinnumber)
    {
        this.pinnumber=pinnumber;
        this.cardnumber=cardnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,850,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,850);
        add(image);
        JLabel t=new JLabel("Please Enter Amount:");
        t.setBounds(210,280,300,30);
        t.setFont(new Font("System",Font.BOLD,16));
        t.setForeground(Color.WHITE);
        image.add(t);
        
        amountText=new JTextField();
        amountText.setFont(new Font("Raleway",Font.BOLD,22));
        amountText.setBounds(150,330,350,30);
        image.add(amountText);
        
        withdraw=new JButton("Withdraw");
        withdraw.setFont(new Font("System",Font.BOLD,16));
        withdraw.setBounds(360,440,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back=new JButton("Back");
        back.setFont(new Font("System",Font.BOLD,16));
        back.setBounds(360,470,150,30);
        back.addActionListener(this);
        
        image.add(back);
        
        
        
        
        
        
        setSize(900,850);
        setLocation(300,0);
        setVisible(true);
        
    }
        
    
    
   public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==back)
        {
            setVisible(false);
            new Transcation(cardnumber,pinnumber).setVisible(true);
        }
        if (ae.getSource()==withdraw)
        {
        try{
            
            
            conn c=new conn();
            Date date=new Date();
            String amount=amountText.getText();
         //   String b="select balance from bank where cardnumber=='5690192012749109'";
            ResultSet rs=c.s.executeQuery("select * from bank where pinnumber='"+pinnumber+"'");
            
            while(rs.next())
            {
                if (rs.getString("mode").equals("Deposit"))
                {
                    balance +=Integer.parseInt(rs.getString("balance"));
                }
                else if (rs.getString("mode").equals("Withdraw"))
                {
                    balance -=Integer.parseInt(rs.getString("balance"));
                }
                
            }
            if(ae.getSource()!= back && balance < Integer.parseInt(amount))
            {
                JOptionPane.showMessageDialog(null,"Insufficient Balance");
                return;
                
            }
            
            else
            {
                balance=balance-Integer.parseInt(amount);
                
               
                
                String mode="Withdraw";
                String query2="update bank set balance='"+balance+"' where pinnumber='"+pinnumber+"'";
                String query1="Insert into transaction values('"+cardnumber+"','"+pinnumber+"','"+balance+"','"+amount+"','"+date+"','"+mode+"')";
               // String query2="UPDATE bank SET balance='"+a+"' WHERE cardnumber=='"+cardnumber+"'";
                
                
                    
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                JOptionPane.showMessageDialog(null, "Amount Withdraw Succefffully");
                    
                    
            }
            
        }catch(Exception e)
                {
                   System.out.println(e);
                }
        }
    }
    public static void main(String args[])
    {
        new Withdraw("","");
        
    }
}

                    
      

        
    
    
    
    

