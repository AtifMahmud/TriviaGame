import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;
import java.lang.Integer;

public class Question {
    public static String question; 
	public static String OptionA;
	public static String OptionB;
	public static String OptionC;
	public static String OptionD;
	public static String correctOption;
	public static int score;
	public GUI MyGUI;
	
	// Constructor for a new question
	public Question (String question, String OptionA, String OptionB, String OptionC, String OptionD, String correctOption){
		this.question = question;
		this.OptionA = OptionA;
		this.OptionB = OptionB;
		this.OptionC = OptionC;
		this.OptionD = OptionD;
		this.correctOption = correctOption;
	
		score = 0;
		
		MyGUI = new GUI();
		MyGUI.setSize(1500, 1500);
		MyGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyGUI.setVisible(false);
		
		// Set up the questions and buttons for the screen
		JLabel QuestionLabel = new JLabel(Question.question);
		JButton A = new JButton(Question.OptionA); 
		JButton B = new JButton(Question.OptionB);
		JButton C = new JButton(Question.OptionC);
		JButton D = new JButton(Question.OptionD);
	

		// Set the dimensions and the font fields
		Dimension d = new Dimension(200, 100);
		Font QuestionFont = new Font("Comic Sans MS", Font.PLAIN, 48);
		
		// Set the QuestionLabel to the desired dimension
		QuestionLabel.setFont(QuestionFont);;
		
		// Set the position and size of the buttons
		A.setPreferredSize(d);
		B.setPreferredSize(d);	
		C.setPreferredSize(d);
		D.setPreferredSize(d);
			
		TheHandler MyHandler = new TheHandler();
		
		// Add the mouse listeners to the buttons
		A.addMouseListener(MyHandler);
		B.addMouseListener(MyHandler);
		C.addMouseListener(MyHandler);
		D.addMouseListener(MyHandler);
		
		// Add them to the screen
		MyGUI.add(QuestionLabel);
		MyGUI.add(A);
		MyGUI.add(B);
		MyGUI.add(C);
		MyGUI.add(D);
		
		
	

	}
	
	public static void askQuestion(Question question){	
		question.MyGUI.setVisible(true);
		
	}
	
public class TheHandler implements MouseListener{
		
		// Implementing the abstract methods: some of them are empty because we don't need them
		
		public void mouseClicked(MouseEvent event){
				System.out.println("Clicked");
				JOptionPane.showMessageDialog(null, "Clicked");
			
		}
		
		public void mousePressed(MouseEvent event){
			System.out.println("Pressed");
			JOptionPane.showMessageDialog(null, "Pressed");
		
		}
		
		public void mouseReleased(MouseEvent event){
			System.out.println("Released");
			JOptionPane.showMessageDialog(null, "Released");
		
		}
		
		public void mouseEntered(MouseEvent event){
		
		
		}
		
		public void mouseExited(MouseEvent event){
			
		
		}
		
	}
		
}
	