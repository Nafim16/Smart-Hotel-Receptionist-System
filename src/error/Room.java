package error;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Room extends JFrame{
	
	public Room() {
		
		JPanel p1 = new JPanel();
		p1.setBounds(5,5,280,180);
		p1.setBackground(Color.DARK_GRAY);
		add(p1);
		
		JPanel p2 = new JPanel();
		p2.setBounds(295,5,280,180);
		p2.setBackground(Color.DARK_GRAY);
		add(p2);
		
		JPanel p3 = new JPanel();
		p3.setBounds(585,5,280,180);
		p3.setBackground(Color.DARK_GRAY);
		add(p3);
		
		JPanel p4 = new JPanel();
		p4.setBounds(875,5,280,180);
		p4.setBackground(Color.DARK_GRAY);
		add(p4);
		
		JPanel p5 = new JPanel();
		p5.setBounds(5,195,280,180);
		p5.setBackground(Color.DARK_GRAY);
		add(p5);
		
		JPanel p6 = new JPanel();
		p6.setBounds(295,195,280,180);
		p6.setBackground(Color.DARK_GRAY);
		add(p6);
		
		JPanel p7 = new JPanel();
		p7.setBounds(585,195,280,180);
		p7.setBackground(Color.DARK_GRAY);
		add(p7);
		
		JPanel p8 = new JPanel();
		p8.setBounds(875,195,280,180);
		p8.setBackground(Color.DARK_GRAY);
		add(p8);
				
		JPanel p9 = new JPanel();
		p9.setBounds(5,385,280,180);
		p9.setBackground(Color.DARK_GRAY);
		add(p9);
		
		JPanel p10 = new JPanel();
		p10.setBounds(295,385,280,180);
		p10.setBackground(Color.DARK_GRAY);
		add(p10);
		
		JPanel p11 = new JPanel();
		p11.setBounds(585,385,280,180);
		p11.setBackground(Color.DARK_GRAY);
		add(p11);
		
		JPanel p12 = new JPanel();
		p12.setBounds(875,385,280,180);
		p12.setBackground(Color.DARK_GRAY);
		add(p12);
		
		JPanel p13 = new JPanel();
		p13.setBounds(5,575,280,180);
		p13.setBackground(Color.DARK_GRAY);
		add(p13);
		
		JPanel p14 = new JPanel();
		p14.setBounds(295,575,280,180);
		p14.setBackground(Color.DARK_GRAY);
		add(p14);
		
		JPanel p15 = new JPanel();
		p15.setBounds(585,575,280,180);
		p15.setBackground(Color.DARK_GRAY);
		add(p15);
		
		JPanel p16 = new JPanel();
		p16.setBounds(875,575,280,180);
		p16.setBackground(Color.DARK_GRAY);
		add(p16);
		
		setSize(1180,810);
	    setDefaultCloseOperation(3);
	    setLayout(null);
	    setVisible(true);
	    setResizable(false);
	    setLocationRelativeTo(null);
	    
	}
	
	public static void main(String[] args) {

		new Room();

	}

}
