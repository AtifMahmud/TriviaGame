import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;

public class Question {
    public static String question; 
	public static String OptionA;
	public static String OptionB;
	public static String OptionC;
	public static String OptionD;
	public static String correctOption;
	public static int score = 0;  // Keeps track of score 
	
	// Constructor for a new question
	public Question (String question, String OptionA, String OptionB, String OptionC, String OptionD, String correctOption){
		this.question = question;
		this.OptionA = OptionA;
		this.OptionB = OptionB;
		this.OptionC = OptionC;
		this.OptionD = OptionD;
		this.correctOption = correctOption;
	
		
	}
	

	public static void askQuestion(Question question){
			
	
		// Set up the window
		GUI MyGUI = new GUI();
		MyGUI.setSize(1500, 1500);
		MyGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyGUI.setVisible(true);
		
		// Set up the questions and buttons for the screen
		JLabel QuestionLabel = new JLabel(question.question);
		JButton OptionA = new JButton(question.OptionA); 
		JButton OptionB = new JButton(question.OptionB);
		JButton OptionC = new JButton(question.OptionC);
		JButton OptionD = new JButton(question.OptionD);

		// Set the dimensions and the font fields
		Dimension d = new Dimension(200, 100);
		Font QuestionFont = new Font("Comic Sans MS", Font.PLAIN, 48);
		
		// Set the QuestionLabel to the desired dimension
		QuestionLabel.setFont(QuestionFont);;
		
		// Set the position and size of the buttons
		OptionA.setPreferredSize(d);
	
		
		OptionB.setPreferredSize(d);
	//	OptionB.setLocation(20, 20);
		
		OptionC.setPreferredSize(d);
		OptionD.setPreferredSize(d);
			
				
		// Add them to the screen
		MyGUI.add(QuestionLabel);
		MyGUI.add(OptionA);
		MyGUI.add(OptionB);
		MyGUI.add(OptionC);
		MyGUI.add(OptionD);
		
		OptionA.setLocation(10, 10);
		OptionB.setLocation(200,200);
		OptionC.setLocation(50, 50);
		OptionD.setLocation(1000,1000);
		
		
	}
		
}
	