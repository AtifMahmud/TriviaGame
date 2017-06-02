import java.util.*;
import java.io.*;


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
	
	// Print out the question to the console
	System.out.println(question.question);
	System.out.println(question.OptionA);
	System.out.println(question.OptionB);
	System.out.println(question.OptionC);
	System.out.println(question.OptionD);
	
	// Take in the user input
	Scanner scan = new Scanner(System.in);
	String userInput = scan.next();
	
	// Check if correct; if so, increment score
	if(userInput.equals(question.correctOption)){
		System.out.println("Correct!\n");
		score++;
	}
	
	else{
		System.out.println("Wrong\n");
	}
	
	System.out.printf("Score = %d\n\n", score );  // Print out the score
}	
}
	
	

	

