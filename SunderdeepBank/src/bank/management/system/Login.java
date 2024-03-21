package bank.management.system;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login, signup, cancel;
    JTextField cardTextField;
    JPasswordField pinTextField;
    

    Login() {
        setLayout(null);
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image img2 = img1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        setLayout(null);
        setTitle("Automated Teller Machine");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/SLogo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        image.add(label);
        

        JLabel text = new JLabel("SUNDERDEEP BANK");
        text.setFont(new Font("Osward", Font.BOLD, 35));
        text.setBounds(200, 40, 600, 30);
        image.add(text);
        JLabel a = new JLabel("");
        a.setFont(new Font("Osward", Font.BOLD, 35));
        a.setBounds(400, 80, 600, 30);
        image.add(a);
        cardTextField = new JTextField();
        cardTextField.setBounds(350, 150, 250, 30);
        cardTextField.setFont(new Font("Arial",Font.PLAIN,18));
        image.add(cardTextField);

        JLabel cardno = new JLabel("CARD NO :");
        cardno.setFont(new Font("Osward", Font.BOLD, 20));
        cardno.setBounds(200, 150, 150, 40);
        image.add(cardno);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Osward", Font.BOLD, 20));
        pin.setBounds(200, 200, 150, 30);
        image.add(pin);
        pinTextField = new JPasswordField();
        pinTextField.setBounds(350, 200, 250, 30);
        image.add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(350, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        image.add(login);

        cancel = new JButton("CANCEL");
        cancel.setBounds(500, 300, 100, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        image.add(cancel);

        signup = new JButton("SIGN UP");
        signup.setBounds(350, 350, 250, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        image.add(signup);

        getContentPane().setBackground(Color.white);
        
        setLocation(300, 200);
        setUndecorated(false);
    //    AWTUtilities.setWindowShape(frame,new RoundRectangle2D.Double(10,10,100,100,50,50));
        setSize(800, 500);
   //     setShape(new RoundRectangle2D.Double(900, 800, 900, 800, 50, 50));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == cancel) 
        {
            cardTextField.setText("");
            pinTextField.setText("");

        } 
        else if (ae.getSource() == login) 
        {
            conn con=new conn();
            String cardnumber=cardTextField.getText();
            String pinnumber=pinTextField.getText();
            
            
                String query="select * from login Where cardnumber='"+cardnumber+"' and pinnumber='"+pinnumber+"'";
                
            try
            {
                ResultSet rs = con.s.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new Transcation(cardnumber,pinnumber).setVisible(true);
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"Invalid CardNumber or Pin");
                }
                
                
            }catch(Exception e)
            {
                System.out.print(e);
            }
            
            
        }
        else if (ae.getSource() == signup) 
        {
            setVisible(false);
            new SignupOne().setVisible(true);

        }

    }

    public static void main(String[] args) {

        new Login();
    }

}
