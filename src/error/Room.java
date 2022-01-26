package error;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Room extends JFrame{
	
	public Room() {
		
		JPanel p1 = new JPanel();
		p1.setBounds(5,5,280,180);
		p1.setBackground(Color.LIGHT_GRAY);
		add(p1);
			
		JPanel p2 = new JPanel();
		p2.setBounds(295,5,280,180);
		p2.setBackground(Color.pink);
		add(p2);
		
		JPanel p3 = new JPanel();
		p3.setBounds(585,5,280,180);
		p3.setBackground(Color.LIGHT_GRAY);
		add(p3);
		
		JPanel p4 = new JPanel();
		p4.setBounds(875,5,280,180);
		p4.setBackground(Color.PINK);
		add(p4);
		
		JPanel p5 = new JPanel();
		p5.setBounds(5,195,280,180);
		p5.setBackground(Color.pink);
		add(p5);
		
		JPanel p6 = new JPanel();
		p6.setBounds(295,195,280,180);
		p6.setBackground(Color.LIGHT_GRAY);
		add(p6);
		
		JPanel p7 = new JPanel();
		p7.setBounds(585,195,280,180);
		p7.setBackground(Color.pink);
		add(p7);
		
		JPanel p8 = new JPanel();
		p8.setBounds(875,195,280,180);
		p8.setBackground(Color.LIGHT_GRAY);
		add(p8);
		
		JPanel p9 = new JPanel();
		p9.setBounds(5,385,280,180);
		p9.setBackground(Color.LIGHT_GRAY);
		add(p9);
		
		JPanel p10 = new JPanel();
		p10.setBounds(295,385,280,180);
		p10.setBackground(Color.PINK);
		add(p10);
		
		JPanel p11 = new JPanel();
		p11.setBounds(585,385,280,180);
		p11.setBackground(Color.LIGHT_GRAY);
		add(p11);
		
		JPanel p12 = new JPanel();
		p12.setBounds(875,385,280,180);
		p12.setBackground(Color.pink);
		add(p12);
		
		JPanel p13 = new JPanel();
		p13.setBounds(5,575,280,180);
		p13.setBackground(Color.PINK);
		add(p13);
		
		JPanel p14 = new JPanel();
		p14.setBounds(295,575,280,180);
		p14.setBackground(Color.LIGHT_GRAY);
		add(p14);
		
		JPanel p15 = new JPanel();
		p15.setBounds(585,575,280,180);
		p15.setBackground(Color.pink);
		add(p15);
		
		JPanel p16 = new JPanel();
		p16.setBounds(875,575,280,180);
		p16.setBackground(Color.LIGHT_GRAY);
		add(p16);
		
		 JLabel room1= new JLabel("Room Type : SINGLE ");
	        room1.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room1.setForeground (Color.DARK_GRAY);
	        p1.add(room1);
	        
	        
	        
	        
	        JLabel room01bed= new JLabel("           Single bed          ");
	        room01bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room01bed.setForeground (Color.DARK_GRAY);
	        p1.add(room01bed);
	        
	        JLabel room1ac= new JLabel("         AC      ");
	        room1ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room1ac.setForeground (Color.DARK_GRAY);
	        p1.add(room1ac);
	        
	        
	        JLabel room1price= new JLabel("             Price: 3500           ");
	        room1price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room1price.setForeground (Color.DARK_GRAY);
	        p1.add(room1price);
	        
	        JButton b1= new JButton ("SELECT");
	        b1.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,16)));
	        b1.setForeground (Color.BLUE);
	        b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 3500;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p1.add(b1);
	        
	        
	        
	        JLabel room2= new JLabel("Room Type:  DOUBLE");
	        room2.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room2.setForeground (Color.DARK_GRAY);
	        p2.add(room2);
	        
	        JLabel room2ac= new JLabel("       NON -  AC    ");
	        room2ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room2ac.setForeground (Color.DARK_GRAY);
	        p2.add(room2ac);
	        
	        
	        JLabel room02bed= new JLabel("     Double bed    ");
	        room02bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room02bed.setForeground (Color.DARK_GRAY);
	        p2.add(room02bed);
	        
	        JLabel room2bed= new JLabel(" Included  Breakfast Lunch Dinner ");
	        room2bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room2bed.setForeground (Color.DARK_GRAY);
	        p2.add(room2bed);
	        
	        
	        JLabel room2price= new JLabel("              Price: 5200             ");
	        room2price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room2price.setForeground (Color.DARK_GRAY);
	        p2.add(room2price);
	        
	        JButton b2= new JButton ("SELECT");
	        b2.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,16)));
	        b2.setForeground (Color.BLUE);
	        b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 5200;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p2.add(b2);        
	        
	        JLabel room3= new JLabel("Room Type : COMBO1  ");
	        room3.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room3.setForeground (Color.DARK_GRAY);
	        p3.add(room3);
	        
	        
	        
	        JLabel room03special= new JLabel("    AC  Gym  Free Parking  Pool    ");
	        room03special.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room03special.setForeground (Color.DARK_GRAY);
	        p3.add(room03special);
	        
	        
	       
	        
	        JLabel room03bed= new JLabel("    Double bed     ");
	        room03bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room03bed.setForeground (Color.DARK_GRAY);
	        p3.add(room03bed);
	        
	        
	        JLabel room3r= new JLabel("       Refrigerator        ");
	        room3r.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room3r.setForeground (Color.DARK_GRAY);
	        p3.add(room3r);
	        
	        JLabel room3price= new JLabel("          Price: 9500                 ");
	        room3price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room3price.setForeground (Color.DARK_GRAY);
	        p3.add(room3price);
	        
	        JButton b3= new JButton ("SELECT");
	        b3.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,16)));
	        b3.setForeground(Color.BLUE);
	        b3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 9500;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p3.add(b3);
	        
	        JLabel room4= new JLabel("Room Type: TRIPLE");
	        room4.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room4.setForeground (Color.DARK_GRAY);
	        p4.add(room4);
	        
	        JLabel room4ac= new JLabel("        NON-AC        ");
	        room4ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room4ac.setForeground (Color.DARK_GRAY);
	        p4.add(room4ac);
	        
	        
	        JLabel room04bed= new JLabel("       Triple Bed        ");
	        room04bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room04bed.setForeground (Color.DARK_GRAY);
	        p4.add(room04bed);
	        
	        
	        JLabel room4price= new JLabel("                   Price: 5500               ");
	        room4price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room4price.setForeground (Color.DARK_GRAY);
	        p4.add(room4price);
	        
	        JButton b4= new JButton ("SELECT");
	        b4.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,18)));
	        b4.setForeground(Color.BLUE);
	        b4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 5500;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p4.add(b4); 
	        
	      
	        JLabel room5= new JLabel("Room Type : TWIN");
	        room5.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room5.setForeground (Color.DARK_GRAY);
	        p5.add(room5);
	        
	        JLabel room5ac= new JLabel("            AC         ");
	        room5ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room5ac.setForeground (Color.DARK_GRAY);
	        p5.add(room5ac);
	        
	        
	        JLabel room05bed= new JLabel("     Two Twin Beds     ");
	        room05bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room05bed.setForeground (Color.DARK_GRAY);
	        p5.add(room05bed);
	        
	        JLabel room5bed= new JLabel("    Complementary BreakFast   ");
	        room5bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room5bed.setForeground (Color.DARK_GRAY);
	        p5.add(room5bed);
	       
	        
	        
	        JLabel room5price= new JLabel("              Price: 8500      ");
	        room5price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room5price.setForeground (Color.DARK_GRAY);
	        p5.add(room5price);
	        
	        JButton b5= new JButton ("SELECT");
	        b5.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,16)));
	        b5.setForeground (Color.BLUE);
	        b5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 8500;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p5.add(b5);      
	        
	        JLabel room6= new JLabel("Room Type : DOUBL2");
	        room6.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room6.setForeground (Color.DARK_GRAY);
	        p6.add(room6);
	        
	        JLabel room6ac= new JLabel("            AC             ");
	        room6ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room6ac.setForeground (Color.DARK_GRAY);
	        p6.add(room6ac);
	        
	        
	        JLabel room06bed= new JLabel("        Double bed     ");
	        room06bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room06bed.setForeground (Color.DARK_GRAY);
	        p6.add(room06bed);
	        
	        JLabel room6bed= new JLabel("    Complementary BreakFast   ");
	        room6bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room6bed.setForeground (Color.DARK_GRAY);
	        p6.add(room6bed);
	        
	        JLabel room6price= new JLabel("          Price:6200              ");
	        room6price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room6price.setForeground (Color.DARK_GRAY);
	        p6.add(room6price);
	        
	        JButton b6= new JButton ("SELECT");
	        b6.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,18)));
	        b6.setForeground(Color.BLUE);
	        b6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 6200;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p6.add(b6);        
	        
	        JLabel room7= new JLabel("Room Type : COMBO2");
	        room7.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room7.setForeground (Color.DARK_GRAY);
	        p7.add(room7);
	        
	        
	        
	        JLabel room07special= new JLabel("    AC Gym  Free Parking  Pool    ");
	        room07special.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,18)));
	        room07special.setForeground (Color.DARK_GRAY);
	        p7.add(room07special);
	   
	        
	        JLabel room07bed= new JLabel("   Double bed  ");
	        room07bed.setFont((new Font("Times_New_Roman",Font.ROMAN_BASELINE,18)));
	        room07bed.setForeground (Color.DARK_GRAY);
	        p7.add(room07bed);
	        
	        JLabel room7bed= new JLabel("Included  Breakfast, Lunch & Dinner");
	        room7bed.setFont((new Font("Times_New_Roman",Font.ROMAN_BASELINE,16)));
	        room7bed.setForeground (Color.DARK_GRAY);
	        p7.add(room7bed);
	        
	        JLabel room7price= new JLabel("        Price: 12000            ");
	        room7price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room7price.setForeground (Color.DARK_GRAY);
	        p7.add(room7price);
	        
	        
	       
	        JButton b7= new JButton ("SELECT");
	        b7.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,14)));
	        b7.setForeground(Color.BLUE);
	        b7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 12000;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p7.add(b7);
	        
	        JLabel room8= new JLabel("Room Type  :  SINGLE2");
	        room8.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room8.setForeground (Color.DARK_GRAY);
	        p8.add(room8);
	        
	        JLabel room8ac= new JLabel("            NON - AC             ");
	        room8ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room8ac.setForeground (Color.DARK_GRAY);
	        p8.add(room8ac);
	        
	        JLabel room08bed= new JLabel("    Single bed     ");
	        room08bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room08bed.setForeground (Color.DARK_GRAY);
	        p8.add(room08bed);
	        
	        JLabel room8bed= new JLabel(" Included    Breakfast  Lunch  ");
	        room8bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room8bed.setForeground (Color.DARK_GRAY);
	        p8.add(room8bed);
	        
	        
	        JLabel room8price= new JLabel("          Price: 3000            ");
	        room8price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room8price.setForeground (Color.DARK_GRAY);
	        p8.add(room8price);
	        
	        JButton b8= new JButton ("SELECT");
	        b8.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,16)));
	        b8.setForeground(Color.BLUE);
	        b8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 3000;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p8.add(b8);
	        
	      
	        JLabel room9= new JLabel("Room Type  :  SINGLE3");
	        room9.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room9.setForeground (Color.DARK_GRAY);
	        p9.add(room9);
	        
	        JLabel room9ac= new JLabel("            NON - AC             ");
	        room9ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room9ac.setForeground (Color.DARK_GRAY);
	        p9.add(room9ac);
	        
	        JLabel room09bed= new JLabel("    Single bed     ");
	        room09bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room09bed.setForeground (Color.DARK_GRAY);
	        p9.add(room09bed);
	        
	        
	        JLabel room9price= new JLabel("          Price: 2700            ");
	        room9price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room9price.setForeground (Color.DARK_GRAY);
	        p9.add(room9price);
	        
	        JButton b9= new JButton ("SELECT");
	        b9.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,18)));
	        b9.setForeground(Color.BLUE);
	        b9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 2700;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p9.add(b9);
	        
	        JLabel room10= new JLabel("Room Type :   TRIPLE2");
	        room10.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room10.setForeground (Color.DARK_GRAY);
	        p10.add(room10);
	        
	        JLabel room10ac= new JLabel("               AC                ");
	        room10ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,18)));
	        room10ac.setForeground (Color.DARK_GRAY);
	        p10.add(room10ac);
	        
	        JLabel room10bed= new JLabel("       Triple bed      ");
	        room10bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room10bed.setForeground (Color.DARK_GRAY);
	        p10.add(room10bed);
	        
	        
	        JLabel room10price= new JLabel("                       Price: 6500                        ");
	        room10price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room10price.setForeground (Color.DARK_GRAY);
	        p10.add(room10price);
	        
	        JButton b10= new JButton ("SELECT");
	        b10.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,18)));
	        b10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 6500;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p10.add(b10);	 
	        b10.setForeground(Color.BLUE);
	        
	        JLabel room11= new JLabel("Room Type :  Family Pack");
	        room11.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room11.setForeground (Color.DARK_GRAY);
	        p11.add(room11);
	        
	        JLabel room11ac= new JLabel("          AC ");
	        room11ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room11ac.setForeground (Color.DARK_GRAY);
	        p11.add(room11ac);
	        
	        
	        JLabel room11bed= new JLabel("   Triple bed     ");
	        room11bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room11bed.setForeground (Color.DARK_GRAY);
	        p11.add(room11bed);
	        
	        JLabel room11b= new JLabel(" Breakfast Lunch Dinner  ");
	        room11b.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room11b.setForeground (Color.DARK_GRAY);
	        p11.add(room11b);
	        
	        JLabel room11s= new JLabel("         Evening Show        ");
	        room11s.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room11s.setForeground (Color.DARK_GRAY);
	        p11.add(room11s);
	        

	        JLabel room11price= new JLabel("             Price: 13500            ");
	        room11price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room11price.setForeground (Color.DARK_GRAY);
	        p11.add(room11price);
	        
	        JButton b11= new JButton ("SELECT");
	        b11.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,16)));
	        b11.setForeground (Color.BLUE);
	        b11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 13500;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        
	        p11.add(b11);	
	        
	        JLabel room12= new JLabel("Room Type : SINGLE4     ");
	        room12.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room12.setForeground (Color.DARK_GRAY);
	        p12.add(room12);
	        
	        JLabel room12ac= new JLabel("         AC");
	        room12ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room12ac.setForeground (Color.DARK_GRAY);
	        p12.add(room12ac);
	        
	        
	        JLabel room12bed= new JLabel("   Single bed     ");
	        room12bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room12bed.setForeground (Color.DARK_GRAY);
	        p12.add(room12bed);
	        
	        JLabel room12b= new JLabel(" Included  Breakfast Lunch Dinner ");
	        room12b.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room12b.setForeground (Color.DARK_GRAY);
	        p12.add(room12b);
	        
	        
	        
	        JLabel room12price= new JLabel("          Price: 4500        ");
	        room12price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room12price.setForeground (Color.DARK_GRAY);
	        p12.add(room12price);
	        
	        JButton b12= new JButton ("SELECT");
	        b12.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,18)));
	        b12.setForeground (Color.BLUE);
	        b12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 4500;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p12.add(b12);
	        
	        
	        JLabel room13= new JLabel("Room Type: COMBO3");
	        room13.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room13.setForeground (Color.DARK_GRAY);
	        p13.add(room13);
	        
	       
	        
	        
	       
	        JLabel room13bed= new JLabel("    Triple bed     ");
	        room13bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room13bed.setForeground (Color.DARK_GRAY);
	        p13.add(room13bed);
	        
	        JLabel room13special= new JLabel(" AC Gym  Free Parking  Pool    ");
	        room13special.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room13special.setForeground (Color.DARK_GRAY);
	        p13.add(room13special);
	        
	        JLabel room13price= new JLabel("  Price: 14500            ");
	        room13price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,22)));
	        room13price.setForeground (Color.DARK_GRAY);
	        p13.add(room13price);
	        
	        
	        JButton b13= new JButton ("SELECT");
	        b13.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,18)));
	        b13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 14500;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p13.add(b13);
	        b13.setForeground(Color.BLUE);
	        
	        
	        JLabel room14= new JLabel("Room Type: TRIPLE3");
	        room14.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room14.setForeground (Color.DARK_GRAY);
	        p14.add(room14);
	        
	        JLabel room14ac= new JLabel("        NON-AC        ");
	        room14ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room14ac.setForeground (Color.DARK_GRAY);
	        p14.add(room14ac);
	        
	        
	        JLabel room14bed= new JLabel("       Triple Bed        ");
	        room14bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room14bed.setForeground (Color.DARK_GRAY);
	        p14.add(room14bed);
	        
	        JLabel room14b= new JLabel("Included  Breakfast, Lunch & Dinner");
	        room14b.setFont((new Font("Times_New_Roman",Font.ROMAN_BASELINE,16)));
	        room14b.setForeground (Color.DARK_GRAY);
	        p14.add(room14b);
	        
	        
	        JLabel room14price= new JLabel("          Price: 6500              ");
	        room14price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room14price.setForeground (Color.DARK_GRAY);
	        p14.add(room14price);
	        
	        JButton b14= new JButton ("SELECT");
	        b14.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,18)));
	        b14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 6500;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        
	        b14.setForeground(Color.BLUE);
	        p14.add(b14); 
	        
	        
	        JLabel room15= new JLabel("Room Type: Connecting Room");
	        room15.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room15.setForeground (Color.DARK_GRAY);
	        p15.add(room15);
	        
	        JLabel room15ac= new JLabel("            AC              ");
	        room15ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room15ac.setForeground (Color.DARK_GRAY);
	        p15.add(room15ac);
	        
	        
	        JLabel room15bed= new JLabel("          Three beds     ");
	        room15bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room15bed.setForeground (Color.DARK_GRAY);
	        p15.add(room15bed);
	        
	        JLabel room15d= new JLabel("    Two Rooms    ");
	        room15d.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room15d.setForeground (Color.DARK_GRAY);
	        p15.add(room15d);
	         
	        JLabel room15price= new JLabel("              Price: 10500          ");
	        room15price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room15price.setForeground (Color.DARK_GRAY);
	        p15.add(room15price);
	        
	        
	        
	        JButton b15= new JButton ("SELECT");
	        b15.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        b15.setForeground (Color.BLUE);
	        b15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 10500;
					dispose();
					new Payment(p);				
				}
	        	
	        });
	        p15.add(b15);	 
	        
	     
	        JLabel room16= new JLabel("Room Type: DOUBLE3");
	        room16.setFont((new Font("Times New Roman",Font.BOLD,20)));
	        room16.setForeground (Color.DARK_GRAY);
	        p16.add(room16);
	        
	        JLabel room16ac= new JLabel("              NON-AC             ");
	        room16ac.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room16ac.setForeground (Color.DARK_GRAY);
	        p16.add(room16ac);
	    
  
	        JLabel room16bed= new JLabel("         Double bed     ");
	        room16bed.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room16bed.setForeground (Color.DARK_GRAY);
	        p16.add(room16bed);
	        
   
	        JLabel room16price= new JLabel("                  Price: 4500                    ");
	        room16price.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,20)));
	        room16price.setForeground (Color.DARK_GRAY);
	        p16.add(room16price);
	        
	        JButton b16= new JButton ("SELECT");
	        b16.setFont((new Font("Times New Roman",Font.ROMAN_BASELINE,15)));
	        b16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double p = 4500;
					dispose();
					new Payment(p);				
				}	        	
	        });
	        
	        b16.setForeground (Color.BLUE);
	        p16.add(b16); 
	        
	     
	      
	        setTitle("Room");
	        setSize(1200,800);
		    setDefaultCloseOperation(3);
		    setLayout(null);
		    setVisible(true);
		    setResizable(false);
		    setLocationRelativeTo(null);
	       

}

	public static void main(String[] args) throws Exception {

		new Room();

	}

}
