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
		
		 JLabel room1= new JLabel("Room Type: NORMAL");
	     room1.setFont((new Font("Arial",Font.BOLD,20)));
	     room1.setForeground (Color.LIGHT_GRAY);
	     p1.add(room1);
	        
	     JLabel room1ac= new JLabel("            AC");
	        room1ac.setFont((new Font("Arial",Font.BOLD,20)));
	        room1ac.setForeground (Color.LIGHT_GRAY);
	        p1.add(room1ac);
	        
	        
	        JLabel room01bed= new JLabel("     Single bed     ");
	        room01bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room01bed.setForeground (Color.LIGHT_GRAY);
	        p1.add(room01bed);
	        
	        
	        JLabel room1price= new JLabel("  Price: 8500    ");
	        room1price.setFont((new Font("Arial",Font.BOLD,20)));
	        room1price.setForeground (Color.LIGHT_GRAY);
	        p1.add(room1price);
	        
	        JLabel room1days= new JLabel("Days of Staying: ");
	        room1days.setFont((new Font("Arial",Font.BOLD,20)));
	        room1days.setForeground (Color.LIGHT_GRAY);
	        p1.add(room1days);
	        
	        JTextField r1t = new JTextField(8);
	        p1.add(r1t);	        
	        
	        JLabel room2= new JLabel("Room Type:NORMAL");
	        room2.setFont((new Font("Arial",Font.BOLD,20)));
	        room2.setForeground (Color.LIGHT_GRAY);
	        p2.add(room2);
	        
	        JLabel room2ac= new JLabel("           AC");
	        room2ac.setFont((new Font("Arial",Font.BOLD,20)));
	        room2ac.setForeground (Color.LIGHT_GRAY);
	        p2.add(room2ac);
	        
	        
	        JLabel room02bed= new JLabel("     Double bed     ");
	        room02bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room02bed.setForeground (Color.LIGHT_GRAY);
	        p2.add(room02bed);
	        
	        
	        JLabel room2price= new JLabel("  Price: 22500    ");
	        room2price.setFont((new Font("Arial",Font.BOLD,20)));
	        room2price.setForeground (Color.LIGHT_GRAY);
	        p2.add(room2price);
	        
	        JLabel room2days= new JLabel("Days of Staying: ");
	        room2days.setFont((new Font("Arial",Font.BOLD,20)));
	        room2days.setForeground (Color.LIGHT_GRAY);
	        p2.add(room2days);
	        
	        JTextField r2t = new JTextField(8);
	        p2.add(r2t);	        
	        
	        JLabel room3= new JLabel("Room Type: COMBO");
	        room3.setFont((new Font("Arial",Font.BOLD,20)));
	        room3.setForeground (Color.LIGHT_GRAY);
	        p3.add(room3);
	        
	        
	        
	        JLabel room03special= new JLabel("  AC Gym  Free Parking  Pool    ");
	        room03special.setFont((new Font("Arial",Font.BOLD,20)));
	        room03special.setForeground (Color.LIGHT_GRAY);
	        p3.add(room03special);
	        
	        
	        JLabel room3price= new JLabel("  Price: 18500    ");
	        room3price.setFont((new Font("Arial",Font.BOLD,20)));
	        room3price.setForeground (Color.LIGHT_GRAY);
	        p3.add(room3price);
	        
	        JLabel room03bed= new JLabel("     Double bed     ");
	        room03bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room03bed.setForeground (Color.LIGHT_GRAY);
	        p3.add(room03bed);
	        
	        
	        JLabel room3r= new JLabel("  Refrigerator    ");
	        room3r.setFont((new Font("Arial",Font.BOLD,20)));
	        room3r.setForeground (Color.LIGHT_GRAY);
	        p3.add(room3r);
	        
	        JLabel room3days= new JLabel("Days of Staying: ");
	        room3days.setFont((new Font("Arial",Font.BOLD,20)));
	        room3days.setForeground (Color.LIGHT_GRAY);
	        p3.add(room3days);
	        
	        JTextField r3t = new JTextField(8);
	        p3.add(r3t);	 
	        
	        
	        JLabel room4= new JLabel("Room Type: NORMAL");
	        room4.setFont((new Font("Arial",Font.BOLD,20)));
	        room4.setForeground (Color.LIGHT_GRAY);
	        p4.add(room4);
	        
	        JLabel room4ac= new JLabel("      NON-AC");
	        room4ac.setFont((new Font("Arial",Font.BOLD,20)));
	        room4ac.setForeground (Color.LIGHT_GRAY);
	        p4.add(room4ac);
	        
	        
	        JLabel room04bed= new JLabel("   Single bed     ");
	        room04bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room04bed.setForeground (Color.LIGHT_GRAY);
	        p4.add(room04bed);
	        
	        
	        JLabel room4price= new JLabel("  Price: 3500    ");
	        room4price.setFont((new Font("Arial",Font.BOLD,20)));
	        room4price.setForeground (Color.LIGHT_GRAY);
	        p4.add(room4price);
	        
	        JLabel room4days= new JLabel("Days of Staying: ");
	        room4days.setFont((new Font("Arial",Font.BOLD,20)));
	        room4days.setForeground (Color.LIGHT_GRAY);
	        p4.add(room4days);
	        
	        JTextField r4t = new JTextField(8);
	        p4.add(r4t);	 
	        
	     
	        
	      
	        JLabel room5= new JLabel("Room Type: Family Pack");
	        room5.setFont((new Font("Arial",Font.BOLD,20)));
	        room5.setForeground (Color.LIGHT_GRAY);
	        p5.add(room5);
	        
	        JLabel room5ac= new JLabel("            AC");
	        room5ac.setFont((new Font("Arial",Font.BOLD,20)));
	        room5ac.setForeground (Color.LIGHT_GRAY);
	        p5.add(room5ac);
	        
	        
	        JLabel room05bed= new JLabel("     Single bed     ");
	        room05bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room05bed.setForeground (Color.LIGHT_GRAY);
	        p5.add(room05bed);
	        
	        
	        JLabel room5price= new JLabel("  Price: 8500    ");
	        room1price.setFont((new Font("Arial",Font.BOLD,20)));
	        room1price.setForeground (Color.LIGHT_GRAY);
	        p5.add(room1price);
	        
	        JLabel room5days= new JLabel("Days of Staying: ");
	        room5days.setFont((new Font("Arial",Font.BOLD,20)));
	        room5days.setForeground (Color.LIGHT_GRAY);
	        p5.add(room1days);
	        
	        JTextField r5t = new JTextField(8);
	        p5.add(r5t);	        
	        
	        JLabel room6= new JLabel("Room Type:NORMAL");
	        room6.setFont((new Font("Arial",Font.BOLD,20)));
	        room6.setForeground (Color.LIGHT_GRAY);
	        p6.add(room6);
	        
	        JLabel room6ac= new JLabel("           AC");
	        room6ac.setFont((new Font("Arial",Font.BOLD,20)));
	        room6ac.setForeground (Color.LIGHT_GRAY);
	        p6.add(room6ac);
	        
	        
	        JLabel room06bed= new JLabel("     Double bed     ");
	        room06bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room06bed.setForeground (Color.LIGHT_GRAY);
	        p6.add(room06bed);
	        
	        
	        JLabel room6price= new JLabel("  Price: 22500    ");
	        room6price.setFont((new Font("Arial",Font.BOLD,20)));
	        room6price.setForeground (Color.LIGHT_GRAY);
	        p6.add(room6price);
	        
	        JLabel room6days= new JLabel("Days of Staying: ");
	        room6days.setFont((new Font("Arial",Font.BOLD,20)));
	        room6days.setForeground (Color.LIGHT_GRAY);
	        p6.add(room6days);
	        
	        JTextField r6t = new JTextField(8);
	        p6.add(r6t);	        
	        
	        JLabel room7= new JLabel("Room Type: COMBO");
	        room7.setFont((new Font("Arial",Font.BOLD,20)));
	        room7.setForeground (Color.LIGHT_GRAY);
	        p7.add(room7);
	        
	        
	        
	        JLabel room07special= new JLabel("  AC Gym  Free Parking  Pool    ");
	        room07special.setFont((new Font("Arial",Font.BOLD,20)));
	        room07special.setForeground (Color.LIGHT_GRAY);
	        p7.add(room07special);
	        
	        
	        JLabel room7price= new JLabel("  Price: 18500    ");
	        room7price.setFont((new Font("Arial",Font.BOLD,20)));
	        room7price.setForeground (Color.LIGHT_GRAY);
	        p7.add(room7price);
	        
	        JLabel room07bed= new JLabel("     Double bed     ");
	        room07bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room07bed.setForeground (Color.LIGHT_GRAY);
	        p7.add(room07bed);
	        
	       
	        
	        JLabel room7days= new JLabel("Days of Staying: ");
	        room7days.setFont((new Font("Arial",Font.BOLD,20)));
	        room7days.setForeground (Color.LIGHT_GRAY);
	        p7.add(room7days);
	        
	        JTextField r7t = new JTextField(8);
	        p7.add(r7t);	 
	        
	        
	        JLabel room8= new JLabel("Room Type: NORMAL");
	        room8.setFont((new Font("Arial",Font.BOLD,20)));
	        room8.setForeground (Color.LIGHT_GRAY);
	        p8.add(room8);
	        
	        JLabel room8ac= new JLabel("      NON-AC");
	        room8ac.setFont((new Font("Arial",Font.BOLD,20)));
	        room8ac.setForeground (Color.LIGHT_GRAY);
	        p8.add(room8ac);
	        
	        
	        JLabel room08bed= new JLabel("   Single bed     ");
	        room08bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room08bed.setForeground (Color.LIGHT_GRAY);
	        p8.add(room08bed);
	        
	        
	        JLabel room8price= new JLabel("  Price: 3500    ");
	        room8price.setFont((new Font("Arial",Font.BOLD,20)));
	        room8price.setForeground (Color.LIGHT_GRAY);
	        p8.add(room8price);
	        
	        JLabel room8days= new JLabel("Days of Staying: ");
	        room8days.setFont((new Font("Arial",Font.BOLD,20)));
	        room8days.setForeground (Color.LIGHT_GRAY);
	        p8.add(room8days);
	        
	        JTextField r8t = new JTextField(8);
	        p8.add(r8t);	 
	        
	     
	        
	      
	        JLabel room9= new JLabel("Room Type: NORMAL");
	        room9.setFont((new Font("Arial",Font.BOLD,20)));
	        room9.setForeground (Color.LIGHT_GRAY);
	        p9.add(room9);
	        
	        JLabel room9ac= new JLabel("          NON - AC");
	        room9ac.setFont((new Font("Arial",Font.BOLD,20)));
	        room9ac.setForeground (Color.LIGHT_GRAY);
	        p9.add(room9ac);
	        
	        JLabel room09bed= new JLabel("   Single bed     ");
	        room09bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room09bed.setForeground (Color.LIGHT_GRAY);
	        p9.add(room09bed);
	        
	        
	        JLabel room9price= new JLabel("  Price: 3500    ");
	        room9price.setFont((new Font("Arial",Font.BOLD,20)));
	        room9price.setForeground (Color.LIGHT_GRAY);
	        p9.add(room9price);
	        
	        JLabel room9days= new JLabel("Days of Staying: ");
	        room9days.setFont((new Font("Arial",Font.BOLD,20)));
	        room9days.setForeground (Color.LIGHT_GRAY);
	        p9.add(room9days);
	        
	        JTextField r9t = new JTextField(8);
	        p9.add(r9t);	 
	        
	        
	        JLabel room10bed= new JLabel("     Single bed     ");
	        room10bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room10bed.setForeground (Color.LIGHT_GRAY);
	        p10.add(room10bed);
	        
	        
	        JLabel room10price= new JLabel("  Price: 8500    ");
	        room10price.setFont((new Font("Arial",Font.BOLD,20)));
	        room10price.setForeground (Color.LIGHT_GRAY);
	        p10.add(room10price);
	        
	        JLabel room10days= new JLabel("Days of Staying: ");
	        room10days.setFont((new Font("Arial",Font.BOLD,20)));
	        room10days.setForeground (Color.LIGHT_GRAY);
	        p10.add(room10days);
	        
	        JTextField r10t = new JTextField(8);
	        p10.add(r10t);	        
	        
	        JLabel room11= new JLabel("Room Type:NORMAL");
	        room11.setFont((new Font("Arial",Font.BOLD,20)));
	        room11.setForeground (Color.LIGHT_GRAY);
	        p11.add(room11);
	        
	        JLabel room11ac= new JLabel("           AC");
	        room11ac.setFont((new Font("Arial",Font.BOLD,20)));
	        room11ac.setForeground (Color.LIGHT_GRAY);
	        p11.add(room11ac);
	        
	        
	        JLabel room11bed= new JLabel("     Double bed     ");
	        room11bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room11bed.setForeground (Color.LIGHT_GRAY);
	        p11.add(room11bed);
	        
	        
	        JLabel room11price= new JLabel("  Price: 22500    ");
	        room11price.setFont((new Font("Arial",Font.BOLD,20)));
	        room11price.setForeground (Color.LIGHT_GRAY);
	        p11.add(room11price);
	        
	        JLabel room11days= new JLabel("Days of Staying: ");
	        room11days.setFont((new Font("Arial",Font.BOLD,20)));
	        room11days.setForeground (Color.LIGHT_GRAY);
	        p11.add(room11days);
	        
	        JTextField r11t = new JTextField(8);
	        p11.add(r11t);	
	        
	        JLabel room12= new JLabel("Room Type: NORMAL");
	        room12.setFont((new Font("Arial",Font.BOLD,20)));
	        room12.setForeground (Color.LIGHT_GRAY);
	        p12.add(room12);
	        
	        JLabel room12ac= new JLabel("      NON-AC");
	        room12ac.setFont((new Font("Arial",Font.BOLD,20)));
	        room12ac.setForeground (Color.LIGHT_GRAY);
	        p12.add(room12ac);
	        
	        
	        JLabel room12bed= new JLabel("   Single bed     ");
	        room12bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room12bed.setForeground (Color.LIGHT_GRAY);
	        p12.add(room12bed);
	        
	        
	        JLabel room12price= new JLabel("  Price: 3500    ");
	        room12price.setFont((new Font("Arial",Font.BOLD,20)));
	        room12price.setForeground (Color.LIGHT_GRAY);
	        p12.add(room12price);
	        
	        JLabel room12days= new JLabel("Days of Staying: ");
	        room12days.setFont((new Font("Arial",Font.BOLD,20)));
	        room12days.setForeground (Color.LIGHT_GRAY);
	        p12.add(room12days);
	        
	        JTextField r12t = new JTextField(8);
	        p12.add(r12t);	 
	        
	        
	        JLabel room13= new JLabel("Room Type: COMBO");
	        room13.setFont((new Font("Arial",Font.BOLD,20)));
	        room13.setForeground (Color.LIGHT_GRAY);
	        p13.add(room13);
	        
	        
	        JLabel room13special= new JLabel("  AC Gym  Free Parking  Pool    ");
	        room13special.setFont((new Font("Arial",Font.BOLD,20)));
	        room13special.setForeground (Color.LIGHT_GRAY);
	        p13.add(room13special);
	        
	        
	        JLabel room13price= new JLabel("  Price: 18500    ");
	        room13price.setFont((new Font("Arial",Font.BOLD,20)));
	        room13price.setForeground (Color.LIGHT_GRAY);
	        p13.add(room13price);
	        
	        JLabel room13bed= new JLabel("     Double bed     ");
	        room13bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room13bed.setForeground (Color.LIGHT_GRAY);
	        p13.add(room13bed);
	        	        
	        JLabel room13days= new JLabel("Days of Staying: ");
	        room13days.setFont((new Font("Arial",Font.BOLD,20)));
	        room13days.setForeground (Color.LIGHT_GRAY);
	        p13.add(room13days);
	        
	        JTextField r13t = new JTextField(8);
	        p13.add(r13t);
	        
	        JLabel room14= new JLabel("Room Type: NORMAL");
	        room14.setFont((new Font("Arial",Font.BOLD,20)));
	        room14.setForeground (Color.LIGHT_GRAY);
	        p14.add(room14);
	        
	        JLabel room14ac= new JLabel("      NON-AC");
	        room14ac.setFont((new Font("Arial",Font.BOLD,20)));
	        room14ac.setForeground (Color.LIGHT_GRAY);
	        p14.add(room14ac);
	        
	        
	        JLabel room14bed= new JLabel("   Single bed     ");
	        room14bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room14bed.setForeground (Color.LIGHT_GRAY);
	        p14.add(room14bed);
	        
	        
	        JLabel room14price= new JLabel("  Price: 3500    ");
	        room14price.setFont((new Font("Arial",Font.BOLD,20)));
	        room13price.setForeground (Color.LIGHT_GRAY);
	        p14.add(room14price);
	        
	        JLabel room14days= new JLabel("Days of Staying: ");
	        room14days.setFont((new Font("Arial",Font.BOLD,20)));
	        room14days.setForeground (Color.LIGHT_GRAY);
	        p14.add(room14days);
	        
	        JTextField r14t = new JTextField(8);
	        p14.add(r14t);	 
	        
	
	        
	        JLabel room15= new JLabel("Room Type: NORMAL");
	        room15.setFont((new Font("Arial",Font.BOLD,20)));
	        room15.setForeground (Color.LIGHT_GRAY);
	        p15.add(room15);
	        
	        JLabel room15ac= new JLabel("      NON-AC");
	        room15ac.setFont((new Font("Arial",Font.BOLD,20)));
	        room15ac.setForeground (Color.LIGHT_GRAY);
	        p15.add(room15ac);
	        
	        
	        JLabel room15bed= new JLabel("   Single bed     ");
	        room15bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room15bed.setForeground (Color.LIGHT_GRAY);
	        p15.add(room15bed);
	        
	        
	        JLabel room15price= new JLabel("  Price: 3500    ");
	        room15price.setFont((new Font("Arial",Font.BOLD,20)));
	        room15price.setForeground (Color.LIGHT_GRAY);
	        p15.add(room15price);
	        
	        
	        
	      	JLabel room15days= new JLabel("Days of Staying: ");
	        room15days.setFont((new Font("Arial",Font.BOLD,20)));
	        room15days.setForeground (Color.LIGHT_GRAY);
	        p15.add(room15days);
	        
	        JTextField r15t = new JTextField(8);
	        p15.add(r15t);	 
	        
	     
	        JLabel room16= new JLabel("Room Type: NORMAL");
	        room16.setFont((new Font("Arial",Font.BOLD,20)));
	        room16.setForeground (Color.LIGHT_GRAY);
	        p16.add(room16);
	        
	        JLabel room16ac= new JLabel("      NON-AC");
	        room16ac.setFont((new Font("Arial",Font.BOLD,20)));
	        room16ac.setForeground (Color.LIGHT_GRAY);
	        p16.add(room16ac);
	        
	        
	        JLabel room16bed= new JLabel("   Single bed     ");
	        room16bed.setFont((new Font("Arial",Font.BOLD,20)));
	        room16bed.setForeground (Color.LIGHT_GRAY);
	        p16.add(room16bed);
	        
	        
	        JLabel room16price= new JLabel("  Price: 3500    ");
	        room16price.setFont((new Font("Arial",Font.BOLD,20)));
	        room16price.setForeground (Color.LIGHT_GRAY);
	        p16.add(room16price);
	        
	        JLabel room16days= new JLabel("Days of Staying: ");
	        room16days.setFont((new Font("Arial",Font.BOLD,20)));
	        room16days.setForeground (Color.LIGHT_GRAY);
	        p16.add(room16days);
	        
	        JTextField r16t = new JTextField(8);
	        p16.add(r16t);	 
	
	        setSize(1200,800);
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
