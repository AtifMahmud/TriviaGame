import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Question {
    public String question; 
	public String OptionA;
	public String OptionB;
	public String OptionC;
	public String OptionD;
	public String correctOption;
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
		String toAsk = question.question + "\n" + "A) " + question.OptionA + "\n" + "B) " + question.OptionB 
				+ "\n" + "C) " + question.OptionC +  "\n" + "D) " + question.OptionD;
		JButton OptionA = new JButton("A"); 
		JOptionPane QuestionPane = new JOptionPane();
		QuestionPane.showMessageDialog(null, toAsk, "Atif's TriviaGame", JOptionPane.PLAIN_MESSAGE);
	
	
		
		// Take in the user input
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		
		
		// Check if correct; if so, increment score
		if(userInput.equals(question.correctOption)){
			System.out.println("Correct!\n");
			score++;
		}
		
		else {
			System.out.println("Wrong\n");
		}
		
		System.out.printf("Score = %d\n\n", score );  // Print out the score
	}	
}
	