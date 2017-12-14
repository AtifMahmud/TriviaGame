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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.SwingUtilities;
import java.awt.CardLayout;


public class Main extends JFrame {
	
	public static int score = 0;
	public static volatile int start;
	public static boolean run;
	
	public static void main (String [] args)  throws Exception {
		
		Question NewQuestion;
	    String Question; 
		String OptionA;
		String OptionB;
		String OptionC;
		String OptionD;
		String CorrectOption; 	
		ArrayList <Question> QuestionList = new ArrayList <Question>(); // the arraylist to hold the questions
		ArrayList <QuestionPanel> PanelList = new ArrayList <QuestionPanel>(); // the arraylist to hold all the question panels 
		CardLayout card = new CardLayout();
		 	
			// One case where we need the try-catch block is if the file doesn't exist	
		 	try {
				FileReader QuestionFile = new FileReader ("E:/Programming/TriviaGame/TriviaGame/src/QuestionBank.txt");	
				BufferedReader Reader = new BufferedReader(QuestionFile);
				FileReader LineReader = new FileReader("E:/Programming/TriviaGame/TriviaGame/src/QuestionBank.txt");
				
				// Find out why doing LineReader on QuestionFile gave Question Fields as null
     		    // To count the number of questions in the text file, Source: https://stackoverflow.com/questions/453018/number-of-lines-in-a-file-in-java
				LineNumberReader LineNumber = new LineNumberReader(LineReader);	
				LineNumber.skip(Long.MAX_VALUE);                               // Not sure why this line here; ask someone
				int numQuestions = (LineNumber.getLineNumber() + 1) / 6;       // +1 because it starts counting at 0, divide by 6 because 6 lines per question
			    LineNumber.close();                                           
				
				// Construct a new Question object and add it to the ArrayList
				for (int j=0; j < numQuestions; j++){ 	
					Question = Reader.readLine(); 
					OptionA =  Reader.readLine();
					OptionB =  Reader.readLine();
					OptionC =  Reader.readLine();
				    OptionD =  Reader.readLine();
					CorrectOption = Reader.readLine();
					NewQuestion = new Question(Question, OptionA, OptionB, OptionC, OptionD, CorrectOption);
					QuestionList.add(NewQuestion);
				}
			} // try ends here
		  
		    catch (IOException e){
				JOptionPane.showMessageDialog(null, "We have encountered an error. Please confirm that the QuestionFile has not been removed from the game directory.\n\n");
				e.printStackTrace();
				System.exit(0);            // Add this to prevent program from running further when we hit the exception
		  } 
		 	
		  JPanel Content = new JPanel();
		  Content.setLayout(card);
		 	
		 // Create a panel from each question and add it to panel list: Should I make panel at once when making the Question objects?	 
		 for (int i=0; i < QuestionList.size(); ++i) {
			 Question QuestionForPanel = QuestionList.get(i);
			 QuestionPanel NewPanel = new QuestionPanel (QuestionForPanel.Question, QuestionForPanel.OptionA, QuestionForPanel.OptionB, // line break here
					 					QuestionForPanel.OptionC, QuestionForPanel.OptionD, QuestionForPanel.CorrectOption);
			 PanelList.add(NewPanel);
			 Content.add(NewPanel, Integer.toString(i));
			 
		 }
		 
		 // Set up the JFame, ContentPanel, and QuestionPanel
		 MainMenu MainMenu = new MainMenu();
		 GUI GameGUI = new GUI();
	     GameGUI.add(MainMenu);
		 GameGUI.setVisible(true);  
		 
		
		 
		 while (start == 0) {
			 Thread.sleep(500);
			 if(start != 0) break;
		 }
		 
		 GameGUI.remove(MainMenu);
		 GameGUI.add(Content);
		 GameGUI.repaint();
		 GameGUI.revalidate();
		 
		 for (int i =0; i < 15; i++) {
			run = true;
			while(run) {
				card.show(Content, Integer.toString(i));
				if(run == false) {
					Thread.sleep(500);
					break;
				}
				continue;
			}
		 }
		
		
		 System.exit(0);
		 
		// This will ensure main runs once the mouse event is detected 
		// Event Dispatching Thread: Figure out what it is for
		 SwingUtilities.invokeLater(new Runnable(){
				@Override
				public void run(){
					new Main();
				}
			});
		}
}