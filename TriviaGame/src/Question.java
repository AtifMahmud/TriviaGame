import java.util.Scanner;

 

public class Question {
    public String question; 
	public String OptionA;
	public String OptionB;
	public String OptionC;
	public String OptionD;
	public static String correctOption;
	public static int score = 0;  // Keeps track of score 
	
	
	public static void main (String [] args){
		
	// An array of 150 Questions
	Question [] questionArray = new Question [150];
	
	// Initializing the objects
	for(int i=0; i < 150; ++i){
		questionArray[i] = new Question();
	}
	
}
	
	
	
	public static void askQuestion (Question Q){
		
		System.out.println(Q.question);
		System.out.println("A)" + Q.OptionA); System.out.println("B) " + Q.OptionB);
		System.out.println("C) " + Q.OptionC); System.out.println("D) " + Q.OptionD);
	
		Scanner reader = new Scanner(System.in);
		String userInput = (reader.next());
		
		
		if (userInput.equals(Q.correctOption)){
			System.out.println("Correct!");
		    score++;
		 }
		
		else{
			System.out.printf("Incorrect! Correct option was %s\n", Q,correctOption);
		}
		
		System.out.print("Score = ");
		System.out.print(score);
		System.out.print("\n\n\n");
		
	}
	
	
	

	
}
