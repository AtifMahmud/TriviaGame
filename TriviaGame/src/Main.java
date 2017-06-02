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
import java.util.Arrays;


public class Main {
	
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
	
			questionArray[j] = new Question (q, A, B, C, D, correct); // Construct the new question from the fields
	}
	
	
	// Ask the questions, in a random order
	
	
	for (int i=0; i < 5; ++i){
		Random rand = new Random();   // Keep it here, to generate new number everytime
		Question.askQuestion(questionArray[rand.nextInt(5)]); // Ask a random indexed question
		//questionArray = ArrayUtils.removeElement(questionArray, questionArray[rand.nextInt(5)]);
	}
}

}
