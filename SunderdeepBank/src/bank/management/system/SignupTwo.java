
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
//import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener
{
    long random;
    String Formno;
    JTextField panText,aadharText;
    JRadioButton yes,no,syes,sno;
    JComboBox category,religion,income,occupation,qualification,nominees;
    String cn,pn;
    JButton next;
    SignupTwo(String Formno)
    {
        this.Formno=Formno;
        
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
        
        setTitle("New Account Application Form Page:2 ");
        
        JLabel additionaldetails=new JLabel("Page 2:Additional Details ");
        additionaldetails.setFont(new Font("Arial",Font.BOLD,38));
        additionaldetails.setBounds(140,20,600,40);
        image.add(additionaldetails);
        
        JLabel personaldetails=new JLabel("Additional Details");
        personaldetails.setFont(new Font("Arial",Font.BOLD,20));
        personaldetails.setBounds(290,80,400,30);
        image.add(personaldetails);
        
        JLabel rel=new JLabel("Religion :");
        rel.setFont(new Font("Arial",Font.BOLD,18));
        rel.setBounds(100,140,100,30);
        image.add(rel);
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        
        religion=new JComboBox(valReligion);
        religion.setFont(new Font("Raleway",Font.BOLD,15));
        religion.setBounds(300,140,380,30);
        religion.setBackground(Color.WHITE);
        image.add(religion);
        
        
        
        JLabel cat=new JLabel("Category :");
        cat.setFont(new Font("Arial",Font.BOLD,18));
        cat.setBounds(100,190,200,30);
        image.add(cat);
        String valCategory[]={"General","OBC","SC","ST","Other",};
        
        category=new JComboBox(valCategory);
        category.setFont(new Font("Raleway",Font.BOLD,15));
        category.setBounds(300,190,380,30);
        category.setBackground(Color.WHITE);
        image.add(category);
        
        
        
        JLabel inc=new JLabel("Income :");
        inc.setFont(new Font("Arial",Font.BOLD,18));
        inc.setBounds(100,240,200,30);
        image.add(inc);
        
        String valIncome[]={"Less than lakh","1-2Lakh per year","5-10 Lakh per year","more than 10lakh"};
        income=new JComboBox(valIncome);
        income.setFont(new Font("Arial",Font.BOLD,15));
        
        income.setBounds(300,240,380,30);
        income.setForeground(new Color(105,105,105));
        income.setBackground(Color.WHITE);
        image.add(income);
        
        
        
        
        JLabel nom=new JLabel("Nominee :");
        nom.setFont(new Font("Arial",Font.BOLD,18));
        nom.setBounds(100,290,200,30);
        image.add(nom);
        
        String valnom[]={"No","Yes"};
        nominees=new JComboBox(valnom);
        nominees.setFont(new Font("Arial",Font.BOLD,15));
        nominees.setBounds(300,290,380,30);
        
        nominees.setBackground(Color.WHITE);
        image.add(nominees);
        
        
        
        JLabel qual=new JLabel("Qualification :");
        qual.setFont(new Font("Arial",Font.BOLD,18));
        qual.setBounds(100,340,200,30);
        image.add(qual);
        
        String valQualification[]={"Matriculation","Intermediate","Graduate","Masters"};
        qualification=new JComboBox(valQualification);
        
        qualification.setFont(new Font("Raleway",Font.BOLD,15));
        qualification.setBounds(300,340,380,30);
        qualification.setBackground(Color.white);
        image.add(qualification);
        
        JLabel occ=new JLabel("Occupation:");
        occ.setFont(new Font("Arial",Font.BOLD,18));
        occ.setBounds(100,390,200,30);
        image.add(occ);
        
        String valOccupation[]={"Salary","Self Salary","Student"};
        occupation=new JComboBox(valOccupation);
        occupation.setFont(new Font("Arial",Font.BOLD,15));
        occupation.setBounds(300,390,380,30);
        occupation.setBackground(Color.WHITE);
        image.add(occupation);
       
        
        
        JLabel pan=new JLabel("Pan No :");
        pan.setFont(new Font("Arial",Font.BOLD,18));
        pan.setBounds(100,430,200,30);
        image.add(pan);
        
        panText=new JTextField();
        panText.setFont(new Font("Raleway",Font.BOLD,15));
        panText.setBounds(300,430,380,30);
        image.add(panText);
        
        JLabel aadhar=new JLabel("Aadhar No :");
        aadhar.setFont(new Font("Arial",Font.BOLD,18));
        aadhar.setBounds(100,480,200,30);
        image.add(aadhar);
        
        aadharText=new JTextField();
        aadharText.setFont(new Font("Raleway",Font.BOLD,15));
        aadharText.setBounds(300,480,380,30);
        image.add(aadharText);
        
        JLabel sen=new JLabel("Senior Citizen :");
        sen.setFont(new Font("Arial",Font.BOLD,18));
        sen.setBounds(100,530,200,30);
        image.add(sen);
        
       
        syes=new JRadioButton("Yes");
        sno=new JRadioButton("No");
        
  
        syes.setBackground(Color.WHITE);
        sno.setBackground(Color.WHITE);
        syes.setFont(new Font("Raleway",Font.BOLD,15));
        syes.setBounds(300,530,100,30);
        sno.setFont(new Font("Raleway",Font.BOLD,15));
        sno.setBounds(450,530,100,30);
        
        ButtonGroup sgroup=new ButtonGroup();
        sgroup.add(syes);
        sgroup.add(sno);
        image.add(syes);
        image.add(sno);
        
        
        
        JLabel exi=new JLabel("Existing Account :");
        exi.setFont(new Font("Arial",Font.BOLD,18));
        exi.setBounds(100,580,200,30);
        image.add(exi);
        
        yes=new JRadioButton("Yes");
        no=new JRadioButton("No");
        
  
        yes.setBackground(Color.WHITE);
        no.setBackground(Color.WHITE);
        yes.setFont(new Font("Raleway",Font.BOLD,15));
        yes.setBounds(300,580,100,30);
        no.setFont(new Font("Raleway",Font.BOLD,15));
        no.setBounds(450,580,100,30);
        
        ButtonGroup group=new ButtonGroup();
        group.add(yes);
        group.add(no);
        image.add(yes);
        image.add(no);
        
        
        
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
    public void actionPerformed(ActionEvent ae)
    {
        String formno=""+random;
        String sreligion=(String) religion.getSelectedItem();
        String scategory=(String) category.getSelectedItem();
        String sincome=(String) income.getSelectedItem();
        
        String snominees=(String) nominees.getSelectedItem();
        String squalification=(String) qualification.getSelectedItem();
        String soccupation=(String) occupation.getSelectedItem();
        String pan=panText.getText();
        String aadhar=aadharText.getText();
        String ssenior=null;
        String sexisting=null;
        if(yes.isSelected())
        {
            ssenior="Yes";
        }
        else if (no.isSelected())
        { 
            ssenior="No";
        }
        
        if(syes.isSelected())
        {
            sexisting="Yes";
        }
        else if (sno.isSelected())
        {
            sexisting="No";
        }
        try
        {
            if(pan.equals("") | aadhar.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Required Field Cannot be Empty");
            }
            else
            {
                conn c=new conn();
                String query=("insert into signuptwo values('"+Formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+snominees+"','"+squalification+"','"+soccupation+"','"+pan+"','"+aadhar+"','"+sexisting+"','"+ssenior+"')");
                c.s.executeUpdate(query);
                
                setVisible(false);
                new signupThree(Formno).setVisible(true);
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }
       
        
        
      
    }
    
    
    
    
    public static void main(String args[])
    {
        new SignupTwo("");
    }
    
}
