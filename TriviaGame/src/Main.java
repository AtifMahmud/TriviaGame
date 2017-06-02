/**
 * This program plays a simple Trivia Game with the users and keeps track of the score.
 * The questions, the answer choices are stored in a text document in a predefined format. 
 * The program reads line by line from the file and constructs the questions by initializing the appropriate fields
 * 
 * 
 * @author Atif Mahmud
 * @Date 2nd June 2017
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main (String [] args) throws Exception{
		 final int numQuestions;
		
		 // Prompt the user for number of questions
		System.out.println("Hello, Welcome to Atif's TriviaGame. Please enter the number of questions you'd like to be asked. Choose a number between 1 and 5\n\n");
		Scanner numScan = new Scanner(System.in);
		numQuestions = numScan.nextInt();
		
		ArrayList <Question> questionList = new ArrayList<Question>(); // An array of 150 Questions
		FileReader questionFile = new FileReader ("D:/Serious/Academic/Programming and Software/Java/TriviaGame/TriviaGame/src/QuestionBank.txt");	
		BufferedReader reader = new BufferedReader(questionFile);
	
		
	for (int j=0; j < numQuestions; ++j){ // Read the fields of the question
		
			String q = reader.readLine();
			String A = reader.readLine();
			String B = reader.readLine();
			String C = reader.readLine();
			String D = reader.readLine();
			String correct = reader.readLine();
	
			questionList.add(new Question (q, A, B, C, D, correct)); // Construct the new question from the fields and add to the list
	}
	
	
	// Ask the questions, in a random order
	for (int i=0; i < numQuestions; ++i){
		//Random rand = new Random();   // Keep it here, to generate new number everytime
		//int index = rand.nextInt(numQuestion);
		Question.askQuestion(questionList.get(i)); // Ask a random indexed question
		//questionList.remove(rand.nextInt(index)); // Remove it to prevent it being asked again
	}
}

}
