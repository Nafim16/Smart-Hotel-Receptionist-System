package error;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;


public class RockPaperScissor extends JFrame {
	
	JButton computerChoice; JLabel result, ComputerScore, UserScore;
	int userScore = 0,computerScore = 0;
			
	public RockPaperScissor() {
		
		JLabel score = new JLabel("Score");
		score.setBounds(460,0,100,100);
		score.setFont((new Font("Arial",Font.BOLD,16)));
		add(score);
		
		ComputerScore = new JLabel();
		ComputerScore.setText("Computer : 0");
		ComputerScore.setBounds(460,15,100,100);
		ComputerScore.setFont((new Font("Arial",Font.BOLD,15)));
		add(ComputerScore);
		
		UserScore = new JLabel();
		UserScore.setText("User : 0");
		UserScore.setBounds(460,30,100,100);
		UserScore.setFont((new Font("Arial",Font.BOLD,15)));
		add(UserScore);
				
		JLabel cl = new JLabel("Computer");
		cl.setBounds(260,180,100,100);
		add(cl);
		
		JLabel vs = new JLabel("VS");
		vs.setBounds(280,200,100,100);
		add(vs);
		
		JLabel pl = new JLabel("Player");
		pl.setBounds(268,220,100,100);
		add(pl);
				
		computerChoice =  new JButton();
		computerChoice.setBounds(240,90,100,100);
		computerChoice.setBackground(Color.DARK_GRAY);
		computerChoice.setForeground(Color.white);
		add(computerChoice);
				
		result = new JLabel();
		result.setBounds(275,400,100,100);
		add(result);
		
		JButton b1 = new JButton("Rock");
		b1.setBounds(150,300,80,80);
		b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);
		add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate("Rock");
			}
		});
		
		JButton b2 = new JButton("Paper");
		b2.setBounds(250,300,80,80);
		b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.white);
		add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate("Paper");
			}
		});
		
		JButton b3 = new JButton("Scissor");
		b3.setBounds(350,300,80,80);
		b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.white);
		add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate("Scissor");
			}
		});
		
		
		JButton b4 = new JButton("Exit");
		b4.setBounds(480,500,80,30);
		b4.setBackground(Color.DARK_GRAY);
        b4.setForeground(Color.white);
		add(b4);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AfterPayment(null,null);	
			}
		});
		
		
		
		setTitle("Entertainment");
		setSize(600, 600);
        setDefaultCloseOperation(3);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
		
	}
	
	public void calculate(String player) {
		
		String[] list = {"Rock", "Paper", "Scissor"};
		int random=GRandom();
		String computer = list[random];
		
		computerChoice.setText(computer);
		if(random==0) {
			computerChoice.setText("Rock");
		}
		else if(random==1) {
			computerChoice.setText("Paper");
		}
		else {
			computerChoice.setText("Scissor");
		}
		
		
		String res = "";
		if(player.equals(computer)) {
			res="Draw";
		}
		else if(player.equals("Rock") && computer.equals("Paper")) {
			res = "You lose";
			computerScore++;
		}
		else if(player.equals("Rock") && computer.equals("Scissor")) {
			res = "You Win";
			userScore++;
		}
		else if(player.equals("Paper") && computer.equals("Rock")) {
			res = "You Win";
			userScore++;
		}
		else if(player.equals("Paper") && computer.equals("Scissor")) {
			res = "You Lose";
			computerScore++;
		}
		else if(player.equals("Scissor") && computer.equals("Rock")) {
			res = "You lose";
			computerScore++;
		}
		else if(player.equals("scissor") && computer.equals("Paper")) {
			res = "You Win";
			userScore++;
		}
		result.setText(res);
		UserScore.setText("Player : "+userScore);
		ComputerScore.setText("Computer : "+computerScore);			
	}
	
	int GRandom() {
		int max=3;
		int min=0;
		Random random = new Random();
		return min + random.nextInt(max-min);		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		new RockPaperScissor();
	}

}
