import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.lang.Integer;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Question{
    public static String question; 
	public static String OptionA;
	public static String OptionB;
	public static String OptionC;
	public static String OptionD;
	public static String correctOption;
	public GUI MyGUI;
	
	// Constructor for a new question
	public Question (String question, String OptionA, String OptionB, String OptionC, String OptionD, String correctOption){
		this.question = question;
		this.OptionA = OptionA;
		this.OptionB = OptionB;
		this.OptionC = OptionC;
		this.OptionD = OptionD;
		this.correctOption = correctOption;
	
		
	
		
		// Set up the questions and buttons for the screen
		
		JLabel ScoreLabel = new JLabel("Score: " + Integer.toString(Main.score));
		JButton A = new JButton(Question.OptionA); 
		JButton B = new JButton(Question.OptionB);
		JButton C = new JButton(Question.OptionC);
		JButton D = new JButton(Question.OptionD);
	

		// Set the dimensions and the font fields
		Dimension d = new Dimension(300, 150);
		Font QuestionFont = new Font("Comic Sans MS", Font.PLAIN, 48);
		
		// Set the QuestionLabel to the desired dimension

		
		// Set the position and size of the buttons
		A.setPreferredSize(d);
		B.setPreferredSize(d);	
		C.setPreferredSize(d);
		D.setPreferredSize(d);
					
		// Set the dimensions and location
		A.setBounds(50, 50, 500, 1000);
		

	}
	

	
	public static void askQuestion(Question question){	
    /*  long startTime = System.currentTimeMillis();
		long elapsedTime  = 0L;
		question.MyGUI.setVisible(true);
        
		if(elapsedTime == 10*1000){
			JOptionPane.showMessageDialog(null, "Time Over");
		}
	*/
		
	    GUI newGUI = new GUI();
		JPanel QuestionPanel = new JPanel(new BorderLayout());
		JLabel QuestionLabel = new JLabel(Question.question);
		QuestionPanel.add(QuestionLabel);
		QuestionPanel.setVisible(true);
		newGUI.add(QuestionPanel);
		newGUI.setVisible(true);
		
	}
		
}
	