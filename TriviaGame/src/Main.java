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
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

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
		
		
		Dimension FrameSize = new Dimension(500, 500);
		Dimension ButtonSize = new Dimension(100,200);
		
		JFrame Frame = new JFrame();
		JPanel ContentPanel = new JPanel();
		
		CardLayout card = new CardLayout();
		ContentPanel.setLayout(card);
		
		JButton A = null,B=null,C=null,D = null;
		
		// One case where we need the try-catch block is if the file doesn't exist
		try {
			FileReader questionFile = new FileReader ("D:/Serious/Academic/Programming and Software/Java/TriviaGame/TriviaGame/src/QuestionBank.txt");	
			BufferedReader reader = new BufferedReader(questionFile);
		
			// Read the fields of the question, and construct a new one	
			for (int j=0; j < size; j++){ 
					JTextField q = new JTextField(reader.readLine());
					A = new JButton(reader.readLine());
					B = new JButton(reader.readLine());
					C = new JButton(reader.readLine());
				    D = new JButton(reader.readLine());
				    String correct = reader.readLine();
				    QuestionPanel AskPanel = new QuestionPanel (q, A, B, C, D, correct);
				    AskPanel.add(q);
				    AskPanel.add(A);
				    AskPanel.add(B);
				    AskPanel.add(C);
				    AskPanel.add(D);
				    AskPanel.setLayout(new BoxLayout(AskPanel, BoxLayout.PAGE_AXIS));
				    A.setSize(ButtonSize);
				    B.setSize(ButtonSize);
				    C.setSize(ButtonSize);
				    D.setSize(ButtonSize);
				    q.setEditable(false);
					questionList.add(AskPanel); 
					A.addActionListener(new ActionListener(){
						@Override
						public void actionPerformed(ActionEvent a) {
							card.show(ContentPanel, "1");
						}
					});	

					B.addActionListener(new ActionListener(){
						@Override
						public void actionPerformed(ActionEvent a) {
							card.show(ContentPanel, "1");
						}
					});	
					
					C.addActionListener(new ActionListener(){
						@Override
						public void actionPerformed(ActionEvent a) {
							card.show(ContentPanel, "1");
						}
					});	
					
					D.addActionListener(new ActionListener(){
						@Override
						public void actionPerformed(ActionEvent a) {
							card.show(ContentPanel, "1");
						}
					});
					
					
			}
		}
	  
			
		
	    catch (IOException e){
			System.out.println("We've hit a problem. Please try again\n\n");
			System.exit(0);            // Add this to prevent program from running further when we hit the exception
	  } 
		
		Frame.add(ContentPanel);
		Frame.setSize(FrameSize);
		Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Frame.setVisible(true);
		ContentPanel.add(questionList.get(5), "1");
		ContentPanel.add(questionList.get(4), "2");
		card.show(ContentPanel, "2");
		
				
		SwingUtilities.invokeLater(new Runnable(){
				@Override
				public void run(){
					new Main();
				}
			});
		
		
		
	
		
		
		
		
	}
	
}
	

