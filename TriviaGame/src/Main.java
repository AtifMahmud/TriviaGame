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
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.util.Random;
import java.io.*;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	public static int score = 0;

	
	public static void main (String [] args)  throws Exception {
		 int size = 7;       // Number of questions in the file
		 int numQuestions;
		 
		 
		 try {
			// Prompt the user for number of questions; use JOptionPane
			do{
				numQuestions = Integer.parseInt(JOptionPane.showInputDialog("Welcome to Atif's Game. Please enter number of questions you want to be asked."));
			}
			
			while
				(numQuestions < 1 || numQuestions > 5);
		 }
		 
		 catch(NumberFormatException n){
			 return;
		 }
		
		
		ArrayList <JPanel> questionList = new ArrayList<JPanel>();
		Question ToAsk = null;
		
		// One case where we need the try-catch block is if the file doesn't exist
		try {
			FileReader questionFile = new FileReader ("D:/Serious/Academic/Programming and Software/Java/TriviaGame/TriviaGame/src/QuestionBank.txt");	
			BufferedReader reader = new BufferedReader(questionFile);
		
			// Read the fields of the question, and construct a new one	
			for (int j=0; j < size; j++){ 
					JTextField q = new JTextField(reader.readLine());
					JButton A = new JButton(reader.readLine());
					JButton B = new JButton(reader.readLine());
					JButton C = new JButton(reader.readLine());
					JButton D = new JButton(reader.readLine());
				    String correct = reader.readLine();
				    QuestionPanel AskPanel = new QuestionPanel (q, A, B, C, D, correct);
				    AskPanel.add(q);
				    q.setEditable(false);
					questionList.add(AskPanel); 
					
			}
			
	  }
	  
	    catch (IOException e){
			System.out.println("We've hit a problem. Please try again\n\n");
			System.exit(0);            // Add this to prevent program from running further when we hit the exception
	  } 
		
		Dimension FrameSize = new Dimension(500, 500);
		JFrame Frame = new JFrame();
		Frame.setSize(FrameSize);
		Frame.add(questionList.get(0)); 
		Frame.setVisible(true);
		
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				
			}
		});
		
		
		
	}
	
}
	

