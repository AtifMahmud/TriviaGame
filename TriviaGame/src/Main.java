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
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.util.Random;
import java.io.*;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.SwingConstants;
import javax.sound.sampled.*;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.font.*;

public class Main extends JFrame {
	
	public static int score = 0;
	
	public static void main (String [] args)  throws Exception {
		
		Question NewQuestion;
	    String Question; 
		String OptionA;
		String OptionB;
		String OptionC;
		String OptionD;
		String CorrectOption; 	
		ArrayList <Question> QuestionList = new ArrayList <Question>(); // the arraylist to hold the questions
		
		
			//Dimension FrameSize = new Dimension(500, 500);
			//Dimension ButtonSize = new Dimension(20,10);
			
			//JFrame Frame = new JFrame();
			//JPanel ContentPanel = new JPanel();
			
			//CardLayout card = new CardLayout();
			//ContentPanel.setLayout(card);
			
			//JButton A = null,B=null,C=null,D = null;
			
			//Font QuestionFont = new Font("Arial", Font.BOLD, 20);
			
		 	
		 	
			// One case where we need the try-catch block is if the file doesn't exist
			
		 	try {
				FileReader questionFile = new FileReader ("D:/Serious/Academic/Programming and Software/Java/TriviaGame/TriviaGame/src/QuestionBank.txt");	
				BufferedReader reader = new BufferedReader(questionFile);
			
				
			    // To count the number of questions in the text file, Source: https://stackoverflow.com/questions/453018/number-of-lines-in-a-file-in-java
				
				LineNumberReader LineNumber = new LineNumberReader(questionFile);	
				LineNumber.skip(Long.MAX_VALUE);                               // Not sure why this line here; ask someone
				int numQuestions = (LineNumber.getLineNumber() + 1) / 6;       // +1 because it starts counting at 0, divide by 6 because 6 lines per question
				LineNumber.close();
				
				
				// Construct a new Question object and add it to the ArrayList
				
				for (int j=0; j < numQuestions; j++){ 	
						Question = reader.readLine();
						OptionA =  reader.readLine();
						OptionB =  reader.readLine();
						OptionC =  reader.readLine();
					    OptionD =  reader.readLine();
					    CorrectOption = reader.readLine();
					    NewQuestion = new Question(Question, OptionA, OptionB, OptionC, OptionD, CorrectOption);
					    QuestionList.add(NewQuestion);
				}
			} // try ends here
		  
			
		    catch (IOException e){
				JOptionPane.showMessageDialog(null, "We have encountered an error. Please confirm that the QuestionFile has not been removed from the game directory.\n\n");
				System.exit(0);            // Add this to prevent program from running further when we hit the exception
		  } 
			
		
		/*  Frame.add(ContentPanel);
			Frame.setSize(FrameSize);
			ContentPanel.setSize(FrameSize);
			Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			Frame.setVisible(true);
		*/
	
//==================================================================================================================			
			/**
			 * This will ensure main runs once the mouse event is detected 
			 */
			
			SwingUtilities.invokeLater(new Runnable(){
					@Override
					public void run(){
						new Main();
					}
				});
	
		}
	
}