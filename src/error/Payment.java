package error;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Payment extends JFrame{
	
	

	public Payment(double p) {
		
		JLabel t = new JLabel("Payment Check");
		t.setFont((new Font("Arial",Font.ITALIC,25)));
        t.setForeground (Color.darkGray);
		t.setBounds(210,0,200,50);
		add(t);
		
		JLabel namel=new JLabel("Customer Name");
		namel.setBounds(20,60,100,30);
		add(namel);
		
		JLabel daysl=new JLabel("Days of Staying");
		daysl.setBounds(20,100,100,30);
		add(daysl);
		
		JTextField namet = new JTextField();
		namet.setBounds(140,60,100,30);
		add(namet);
		
		JTextField dayst = new JTextField();
		dayst.setBounds(140,100,100,30);
		add(dayst);
		
		JLabel ratel=new JLabel("Rate");
		ratel.setBounds(340,60,100,30);
		add(ratel);
		
		JLabel totall=new JLabel("Total Amount");
		totall.setBounds(340,100,100,30);
		add(totall);
		
		JTextField ratet = new JTextField();
		ratet.setBounds(440,60,100,30);
		add(ratet);
		ratet.setEditable(false);
		
		JTextField totalt = new JTextField();
		totalt.setBounds(440,100,100,30);
		add(totalt);
		totalt.setEditable(false);
		
		JLabel pay=new JLabel("Payment Method");
		pay.setFont((new Font("Arial",Font.BOLD,20)));
        pay.setForeground (Color.BLACK);
		pay.setBounds(220,150,200,50);
		add(pay);
		
		JRadioButton rb1 = new JRadioButton(" Cash");
		rb1.setBounds(260,185,100,30);
		add(rb1);
		
		JRadioButton rb2 = new JRadioButton(" Card");
		rb2.setBounds(260,210,100,30);
		add(rb2);
		
		JRadioButton rb3 = new JRadioButton(" Bkash");
		rb3.setBounds(260,235,100,30);
		add(rb3);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
	
		JTextArea tf = new JTextArea();
		tf.setFont((new Font("Arial",Font.ITALIC,17)));
        tf.setForeground (Color.blue);
        tf.setBounds(30,300,510,100);
        add(tf);
        tf.setEditable(false);
		
		JButton b1 = new JButton("Generate Bill");
		b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);
		b1.setBounds(420, 260, 120,30);
        add(b1);
        b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = namet.getText();
				int day = Integer.parseInt(dayst.getText());
				
				double rate=p;			
				String x = null;
				ratet.setText(""+rate);
				
				if(rb1.isSelected()) {
					x = "Cash";
				}
				else if(rb2.isSelected()) {
					x = "Card";
				}
				else if(rb3.isSelected()) {
					x = "Bkash";
				}
				else {
					x = "No payment method selected";
					JOptionPane.showMessageDialog(null, "Payment Failed", "Please Select Payment Method",JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				double tot = (rate*day);
				
				totalt.setText(""+tot);
								
				tf.setText("Hello, "+name+"\nAmount Payable: "+tot+"\nPayment Method: "+x);
	
				
			}
        	
        });
        
        JButton b2 = new JButton("Back");
		b2.setBounds(30, 260, 80,30);
		b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.white);
        add(b2);
        b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Room();				
			}  	
        });
        
        JButton b3 = new JButton("Close");
		b3.setBounds(460, 430, 80,30);
		b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.white);
        add(b3);
        b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AfterPayment(null,null);				
			}  	
        });
        
        
		setTitle("Payment");
		setSize(600, 510);
        setDefaultCloseOperation(3);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);	
	}
	
	
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		double p=0;
		new Payment(p);
		
    	//new AfterPayment(c,s);
	}

}
