import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;

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
		
		// Show the question in a GUI
		GUI MyGUI = new GUI();
		MyGUI.setSize(1500, 1500);
		MyGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyGUI.setVisible(true);
		JButton OptionA = new JButton("A"); 
		JOptionPane QuestionPane = new JOptionPane();
		QuestionPane.showMessageDialog(null, question, "Atif's TriviaGame", JOptionPane.PLAIN_MESSAGE);
	
	
	}
		
}
	