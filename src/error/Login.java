package error;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame {
	
	public Login(Connection c, Statement s) {
		
		JPanel lp=new JPanel();
	    lp.setBackground(Color.PINK);
	    lp.setBounds(5,5,475,80);
	    add(lp);
	    
	    JLabel l= new JLabel("LOGIN");
	    l.setFont((new Font("Arial",Font.BOLD,35)));
	    lp.add(l);
		
	    JLabel namelabel=new JLabel("User Name :");
	    namelabel.setBounds(80,140,100,25);
	    namelabel.setFont((new Font("Arial",Font.BOLD,16)));
	    add(namelabel);
	    
	    JTextField nameTxt=new JTextField();
	    nameTxt.setBounds(180,140,230,25);
	    nameTxt.setFont((new Font("Arial",Font.BOLD,16)));
	    add(nameTxt);
	    
	    JLabel passlabel=new JLabel("Password :");
	    passlabel.setBounds(80,180,100,25);
	    passlabel.setFont((new Font("Arial",Font.BOLD,16)));
	    add(passlabel);
	    
	    JTextField passTxt=new JTextField();
	    passTxt.setBounds(180,180,230,25);
	    passTxt.setFont((new Font("Arial",Font.BOLD,16)));
	    add(passTxt);
	    
	    JButton b1 = new JButton("Login");
	    b1.setBounds(340, 220, 70, 30);
	    b1.setBackground(Color.black);
	    b1.setForeground(Color.red);
	    add(b1);
	    b1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		try {
	    			String username = nameTxt.getText();
	    			String password = passTxt.getText();
	    			PreparedStatement ps = c.prepareStatement("Select username,pass from info where 'username'=? and 'password'=?");
	    			ps.setString(1, username);
	    			ps.setString(2, password);
	    			ResultSet r;
	    			r = ps.executeQuery();
	    
	    			if(r.next()) {
	    				dispose();
		    	    	new Room();
	    			}
	    			else {
		    			JOptionPane.showMessageDialog(null, "Login Failed", "Please check user name or password",JOptionPane.WARNING_MESSAGE);
		    		}	
	    					
	    		}catch(Exception x) {
	    			
	    		}
	    		//dispose();
    	    	//new Room();
	    		
	    	}
	    });
	    
	    JButton b2 = new JButton("Create Account");
	    b2.setBounds(180, 220, 130, 30);
	    b2.setBackground(Color.black);
        b2.setForeground(Color.red);
	    add(b2);
	    b2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		dispose();
	    		new Register(c,s);   		
	    	}
	    });
	    
	    setTitle("Login");
	    setSize(500, 360);
	    setDefaultCloseOperation(3);
	    setLayout(null);
	    setVisible(true);
	    setResizable(false);
	    setLocationRelativeTo(null);
	    
	}	

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo", "root", null);
    	Statement s = c.createStatement();
		new Login(c,s);
		
	}

}
