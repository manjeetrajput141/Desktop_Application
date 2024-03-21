
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
//import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameText,fnameText,emailText,addressText,cityText,pinText,stateText;
    JRadioButton male,female,married,unmarried,other;
//    JDateChooser dateChooser;
    JButton next,back;
    String Formno;
    JLabel FormnoText;
    
    
    SignupOne()
            
    {
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.jpg"));
        Image i2 = i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 850, 800);
        add(image);
        setLayout(null);
        Random ran=new Random();
        random=Math.abs((ran.nextLong()%9000L)+1000L);
        Formno=""+random;
        FormnoText=new JLabel("APPLICATION FORM NO. "+random);
        FormnoText.setFont(new Font("Arial",Font.BOLD,38));
        FormnoText.setBounds(140,20,600,40);
        image.add(FormnoText);
        
        JLabel personaldetails=new JLabel("Page 1:Perrsonal Details");
        personaldetails.setFont(new Font("Arial",Font.BOLD,20));
        personaldetails.setBounds(290,80,400,30);
        image.add(personaldetails);
        
        JLabel name=new JLabel("Name :");
        name.setFont(new Font("Arial",Font.BOLD,18));
        name.setBounds(100,140,100,30);
        image.add(name);
        
        nameText=new JTextField();
        nameText.setFont(new Font("Raleway",Font.BOLD,15));
        nameText.setBounds(300,140,380,30);
        image.add(nameText);
        
        JLabel fname=new JLabel("Father Name :");
        fname.setFont(new Font("Arial",Font.BOLD,18));
        fname.setBounds(100,190,200,30);
        image.add(fname);
        
        fnameText=new JTextField();
        fnameText.setFont(new Font("Raleway",Font.BOLD,15));
        fnameText.setBounds(300,190,380,30);
        image.add(fnameText);
        
        JLabel dob=new JLabel("Date Of Birth :");
        dob.setFont(new Font("Arial",Font.BOLD,18));
        dob.setBounds(100,240,200,30);
        image.add(dob);
        
//        dateChooser=new JDateChooser();
//        dateChooser.setBounds(300,240,380,30);
//        dateChooser.setForeground(new Color(105,105,105));
//        image.add(dateChooser);
        
        
        
        
        JLabel gender=new JLabel("Gender :");
        gender.setFont(new Font("Arial",Font.BOLD,18));
        gender.setBounds(100,290,200,30);
        image.add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        female=new JRadioButton("Female");
        female.setBounds(400,290,120,30);
        male.setBackground(Color.WHITE);
        female.setBackground(Color.WHITE);
        image.add(male);
        image.add(female);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        
        JLabel email=new JLabel("Email Address :");
        email.setFont(new Font("Arial",Font.BOLD,18));
        email.setBounds(100,340,200,30);
        image.add(email);
        
        emailText=new JTextField();
        emailText.setFont(new Font("Raleway",Font.BOLD,15));
        emailText.setBounds(300,340,380,30);
        image.add(emailText);
        
        JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("Arial",Font.BOLD,18));
        marital.setBounds(100,390,200,30);
        image.add(marital);
        
        married=new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        unmarried=new JRadioButton("UnMarried");
        unmarried.setBounds(400,390,150,30);
        unmarried.setBackground(Color.WHITE);
        married.setBackground(Color.WHITE);
        image.add(married);
        image.add(unmarried);
        other=new JRadioButton("Other");
        other.setBackground(Color.WHITE);
        other.setBounds(550,390,60,30);
        image.add(other);
        
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        
        JLabel address=new JLabel("Address :");
        address.setFont(new Font("Arial",Font.BOLD,18));
        address.setBounds(100,430,200,30);
        image.add(address);
        
        addressText=new JTextField();
        addressText.setFont(new Font("Raleway",Font.BOLD,15));
        addressText.setBounds(300,430,380,30);
        image.add(addressText);
        
        JLabel city=new JLabel("City :");
        city.setFont(new Font("Arial",Font.BOLD,18));
        city.setBounds(100,480,200,30);
        image.add(city);
        
        cityText=new JTextField();
        cityText.setFont(new Font("Raleway",Font.BOLD,15));
        cityText.setBounds(300,480,380,30);
        image.add(cityText);
        
        JLabel state=new JLabel("State :");
        state.setFont(new Font("Arial",Font.BOLD,18));
        state.setBounds(100,530,200,30);
        image.add(state);
        
        stateText=new JTextField();
        stateText.setFont(new Font("Raleway",Font.BOLD,15));
        stateText.setBounds(300,530,380,30);
        image.add(stateText);
        
        
        JLabel pincode=new JLabel("Pincode :");
        pincode.setFont(new Font("Arial",Font.BOLD,18));
        pincode.setBounds(100,580,200,30);
        image.add(pincode);
        
        pinText=new JTextField();
        pinText.setFont(new Font("Raleway",Font.BOLD,15));
        pinText.setBounds(300,580,380,30);
        image.add(pinText);
        
       back=new JButton("Back");
       back.setFont(new Font("Raleway",Font.BOLD,12));
       back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       
       back.setBounds(300,630,120,30);
       back.addActionListener(this);
       image.add(back);
        
        
        
        
       next=new JButton("Next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setBounds(560,630,120,30);
       next.addActionListener(this);
       image.add(next);
       
        
        
    
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(350,10);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            
            
            
            
            
        String formno=""+random;
        String name=nameText.getText();
        String fname=fnameText.getText();
        String dob="14May";
        String gender=null;
        
        
        
        if(ae.getSource()==next)
        {
          if(male.isSelected())
        {
            gender="Male";
        } else if (female.isSelected())
        {
            gender="Female";
            
        }
        String email=emailText.getText();
        String marital=null;
         if(married.isSelected())
        {
            gender="Married";
        } else if (unmarried.isSelected())
        {
            gender="UnMarried";
            
        }
        else if(other.isSelected()){
            gender="Other";
            
        }
         String address=addressText.getText();
         String city=cityText.getText();
         String state=stateText.getText();
         String pin=pinText.getText();
          if(name.equals("") | fname.equals(""))
             {
                 JOptionPane.showMessageDialog(null, "Required Field Not Null");
             }
             
             else if(address.equals("") | email.equals(""))
             {
                 JOptionPane.showMessageDialog(null, "Required Field Not Null");
             }
             else if( city.equals("") | state.equals("") )
             {
                 JOptionPane.showMessageDialog(null, "Required Field Not Null");
             }
             else if(pin.equals("") | dob.equals(""))
             {
                 JOptionPane.showMessageDialog(null, "Required Field Not Null");
             }
             else{
                 conn c=new conn();
                 String q="insert into signup values ('"+Formno+"', '"+name+"', '"+fname+"', '"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                 c.s.executeUpdate(q);
                 
                 setVisible(false);
                 new SignupTwo(Formno).setVisible(true);
             }
         
         
            
             }
             else if(ae.getSource()==back)
             {
                 setVisible(false);
                 new Login().setVisible(true);
             }
             
             
             
         } catch (Exception e)
         {
             System.out.print(e);
         }
                
        
    }
    
    public static void main(String args[])
    {
        new SignupOne();
    }
    
}
