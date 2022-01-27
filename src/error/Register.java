package error;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class Register extends JFrame {
	
	
    public Register(Connection c, Statement s){
        
        JPanel hp=new JPanel();
        hp.setBackground(Color.LIGHT_GRAY);
        hp.setBounds(5,5,475,60);
        add(hp);
        
        JLabel l= new JLabel("Registration");
        l.setFont((new Font("Arial",Font.BOLD,35)));
        hp.add(l);
        
        JLabel namelabel=new JLabel("Full Name :");
        namelabel.setBounds(30,70,100,25);
        namelabel.setFont((new Font("Arial",Font.BOLD,15)));
        add(namelabel);
        
        JTextField nameTxt=new JTextField();
        nameTxt.setBounds(130,70,250,25);
        nameTxt.setFont((new Font("Arial",Font.BOLD,15)));
        add(nameTxt);
        
        JLabel usernamelabel=new JLabel("User Name: ");
        usernamelabel.setBounds(30,110,100,25);
        usernamelabel.setFont((new Font("Arial",Font.BOLD,15)));
        add(usernamelabel);
        
        JTextField usernameTxt=new JTextField();
        usernameTxt.setBounds(130,110,250,25);
        usernameTxt.setFont((new Font("Arial",Font.BOLD,15)));
        add(usernameTxt);
        
        JLabel emaillabel=new JLabel("Email: ");
        emaillabel.setBounds(30,150,100,25);
        emaillabel.setFont((new Font("Arial",Font.BOLD,15)));
        add(emaillabel);
        
        JTextField emailTxt=new JTextField();
        emailTxt.setBounds(130,150,250,25);
        emailTxt.setFont((new Font("Arial",Font.BOLD,15)));
        add(emailTxt);
        
        JLabel Passwordlabel=new JLabel("Password: ");
        Passwordlabel.setBounds(30,190,100,25);
        Passwordlabel.setFont((new Font("Arial",Font.BOLD,15)));
        add(Passwordlabel);
        
        JTextField PasswordTxt=new JTextField();
        PasswordTxt.setBounds(130,190,250,25);
        PasswordTxt.setFont((new Font("Arial",Font.BOLD,15)));
        add(PasswordTxt);
        
        JLabel phonelabel=new JLabel("Mobile No: ");
        phonelabel.setBounds(30,230,100,25);
        phonelabel.setFont((new Font("Arial",Font.BOLD,15)));
        add( phonelabel);
        
        JTextField  phoneTxt=new JTextField();
        phoneTxt.setBounds(130,230,250,25);
        phoneTxt.setFont((new Font("Arial",Font.BOLD,15)));
        add( phoneTxt);
        
        JLabel Addresslabel=new JLabel("Address: ");
        Addresslabel.setBounds(30,270,100,25);
        Addresslabel.setFont((new Font("Arial",Font.BOLD,15)));
        add(Addresslabel);
        
        JTextField AddressTxt=new JTextField();
        AddressTxt.setBounds(130,270,250,25);
        AddressTxt.setFont((new Font("Arial",Font.BOLD,15)));
        add(AddressTxt);
        
        JButton b = new JButton("Register");
	    b.setBounds(320, 310, 90, 30);
	    b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.white);
	    add(b);
	    b.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		try {
	    			String fullname = nameTxt.getText();
		    		String username = usernameTxt.getText();
		    		String email = emailTxt.getText();
		    		String pass = PasswordTxt.getText();
		    		String n = phoneTxt.getText();
		    		int phone = Integer.parseInt(n);
		    		String add = AddressTxt.getText();
		    		
		    		String q = "insert into info values('"+fullname+"', '"+username+"', '"+email+"', '"+pass+"', '"+phone+"', '"+add+"')";
		    		s.executeUpdate(q);
		    		//s.close();
		    		//c.close();
		    		
	    		}catch(Exception x) {
	    			
	    		}
	    		JOptionPane.showMessageDialog(null, "Registration Successful", "Please Press Ok to Login",JOptionPane.CLOSED_OPTION);
	    		dispose();
	    		new Login(c,s);

	    	}
	    });
	    
	    JButton b2 = new JButton("Back");
	    b2.setBounds(130, 310, 90, 30);
	    b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.white);
	    add(b2);
	    b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login(c,s);
				
				
			}
	    	
	    });
        setTitle("Registration");
        setSize(500, 460);
        setDefaultCloseOperation(3);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        
    }
    
    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/UserInfo", "root", null);
    	Statement s = c.createStatement();
    	
        new Register(c,s);
    }
}