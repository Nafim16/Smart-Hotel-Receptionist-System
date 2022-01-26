package error;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AfterPayment extends JFrame {
	
	public AfterPayment(Connection c, Statement s){
		
		JLabel l1 = new JLabel("Payment Successful");
		l1.setFont((new Font("Times New Roman",Font.BOLD,25)));
        l1.setForeground (Color.BLACK);
        l1.setBounds(130,20,250,30);
        add(l1);
        
        JLabel l2 = new JLabel("Your Room is getting ready!!!");
		l2.setFont((new Font("Times New Roman",Font.BOLD,20)));
        l2.setForeground (Color.DARK_GRAY);
        l2.setBounds(110,90,270,30);
        add(l2);
        
        JButton b1 = new JButton(" Play Game ");
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);
        b1.setBounds(60,180,100,30);
        add(b1);
        b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new RockPaperScissor();				
			}   	
        });
        
        
        JButton b2 = new JButton("Logout");
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.white);
        b2.setBounds(320,180,100,30);
        add(b2);
        b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login(c,s);				
			} 	
        });
				
		setTitle("AfterPayment");
	    setSize(500, 300);
	    setDefaultCloseOperation(3);
	    setLayout(null);
	    setVisible(true);
	    setResizable(false);
	    setLocationRelativeTo(null);
		
	}

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo", "root", null);
    	Statement s = c.createStatement();
		new AfterPayment(c,s);
		

	}

}
