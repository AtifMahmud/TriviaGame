import java.util.Scanner;


public class Question {
    public String question; 
	public String OptionA;
	public String OptionB;
	public String OptionC;
	public String OptionD;
	public String correct;
   
	public static int score = 0; 
	
	public static void askQuestion (Question Q){
		
		System.out.println(Q.question);
		System.out.println("A)" + Q.OptionA); System.out.println("     B) " + Q.OptionB);
		System.out.println("C) " + Q.OptionC); System.out.println("     D) " + Q.OptionD);
	
		Scanner reader = new Scanner(System.in);
		String userInput = (reader.next());
		
		
		if (userInput.equals(Q.correct)){
			System.out.println("Correct!");
		    score++;
		 }
		
		else{
			System.out.println("Incorrect!");
		}
		
		System.out.print("Score = ");
		System.out.print(score);
		System.out.print("\n\n\n");
		
	}
	
	
	
	public static void main (String [] args){
		
	
		Question Q1 = new Question(); 
		Q1.question = "Who was the first President of the United States of America?";
		Q1.OptionA = "George Washington";
		Q1.OptionB = "John Adams";
		Q1.OptionC = "Abraham Lincoln";
		Q1.OptionD = "Thomas Jefferson";
		Q1.correct = "A";
		
		Question Q2 = new Question(); 
		Q2.question = "What is the largest continent in the World";
		Q2.OptionA = "South America";
		Q2.OptionB = "Asia";
		Q2.OptionC = "Africa";
		Q2.OptionD = "Europe";
		Q2.correct = "B";
		
		Question Q3 = new Question(); 
		Q3.question = "Who was the first person to climb Mt.Everest?";
		Q3.OptionA = "Musa Ibrahim";
		Q3.OptionB = "Harry Houdini";
		Q3.OptionC = "Sir Edmund Hillary";
		Q3.OptionD = "Sherpa Tenzing Norgay";
		Q3.correct = "C";
		
		Question Q4 = new Question(); 
		Q4.question = "Who invented the lightbulb?";
		Q4.OptionA = "Andre Ampere";
		Q4.OptionB = "Benjamin Franklin";
		Q4.OptionC = "Alexander Graham Bell";
		Q4.OptionD = "Thomas Edison";
		Q4.correct = "D";
		
		
		askQuestion(Q1);
		askQuestion(Q2);
		askQuestion(Q3);
		askQuestion(Q4);
		
	
	}
	
}
