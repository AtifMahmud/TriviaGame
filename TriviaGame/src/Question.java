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
	
	
	public static void main (String [] args) throws Exception{
	
		
			Question [] questionArray = new Question [150]; // An array of 150 Questions
			FileReader questionFile = new FileReader ("D:/Serious/Academic/Programming and Software/Java/TriviaGame/TriviaGame/src/QuestionBank.txt");	
			BufferedReader reader = new BufferedReader(questionFile);
		
			
		for (int j=0; j < 5; ++j){ // Read the fields of the question
			
				String q = reader.readLine();
				String A = reader.readLine();
				String B = reader.readLine();
				String C = reader.readLine();
				String D = reader.readLine();
				String correct = reader.readLine();
		
				questionArray[j] = new Question (q, A, B, C, D, correct); // Construct the new question
		}
		
		
		
		for (int i=0; i < 5; ++i){
			askQuestion(questionArray[i]);
		}
}
	
public static void askQuestion(Question question){
	System.out.println(question.question);
	System.out.println(question.OptionA);
	System.out.println(question.OptionB);
	System.out.println(question.OptionC);
	System.out.println(question.OptionD);
	
	Scanner scan = new Scanner(System.in);
	String userInput = scan.next();
	
	if(userInput.equals(question.correctOption)){
		System.out.println("Correct!\n");
		score++;
	}
	
	else{
		System.out.println("Wrong\n");
	}
	
	System.out.printf("Score = %d\n\n", score );
}	
}
	
	

	

