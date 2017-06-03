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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

import java.io.*;

public class Main {
	
	public static void main (String [] args) throws Exception{
		 int size = 7;       // Number of questions in the file
		 int numQuestions;
		 
		 	// Prompt the user for number of questions
		do{
			System.out.println("Hello, Welcome to Atif's TriviaGame. Please enter the number of questions you'd like to be asked. Choose a number between 1 and 5\n\n");
			Scanner numScan = new Scanner(System.in);
			numQuestions = numScan.nextInt();
		}
		
		while
			(numQuestions < 1 || numQuestions > 5);
		
		ArrayList <Question> questionList = new ArrayList<Question>();
		
		
		// One case where we need the try-catch block is if the file doesn't exist
		try {
			FileReader questionFile = new FileReader ("D:/Serious/Academic/Programming and Software/Java/TriviaGame/TriviaGame/src/QuestionBank.txt");	
			BufferedReader reader = new BufferedReader(questionFile);
		
			// Read the fields of the question, and construct a new one	
			for (int j=0; j < size; j++){ 
					String q = reader.readLine();
					String A = reader.readLine();
					String B = reader.readLine();
					String C = reader.readLine();
					String D = reader.readLine();
					String correct = reader.readLine();
					questionList.add(new Question (q, A, B, C, D, correct)); 
			}
			
	  }
	  
		catch (IOException e){
			System.out.println("We've hit a problem. Please try again\n\n");
			System.exit(0);            // Add this to prevent program from running further when we hit the exception
		} 
		
		
	/* 
	 * Note: Faced a bug where I got out of bounds exception. It was because I didn't account for the fact that
	 * the ArrayList gets smaller everytime I remove and element.
	*/
		
		for (int i=0; i < numQuestions; i++){
			Random rand = new Random();   					// Keep it here, to generate new number everytime
			int index = rand.nextInt(size);                 // Select a number between [0, size): covers all questions
			Question.askQuestion(questionList.get(index));  // Ask a random indexed question
			questionList.remove(index); 					// Remove it to prevent it being asked again
			size--;                     					// Decrement it to account for size change after remove()
		}
	
	}
}
	

