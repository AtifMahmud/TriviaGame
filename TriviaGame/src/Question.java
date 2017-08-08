import java.util.*;
import java.io.*;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.CardLayout;

public class Question{
    public static String question; 
	public static String OptionA;
	public static String OptionB;
	public static String OptionC;
	public static String OptionD;
	public static String correctOption;
	JPanel QuestionPanel;
	public GUI MyGUI;
	
	
	// Constructor for a new question
	public Question (String question, String OptionA, String OptionB, String OptionC, String OptionD, String correctOption){
		this.question = question;
		this.OptionA = OptionA;
		this.OptionB = OptionB;
		this.OptionC = OptionC;
		this.OptionD = OptionD;
		this.correctOption = correctOption;
	
		JPanel QuestionPanel = new JPanel();
		QuestionPanel.setLayout(new CardLayout());
		JTextField QuestionText = new JTextField(question);
		JButton A = new JButton(OptionA);
		JButton B = new JButton(OptionB);
		JButton C = new JButton(OptionC);
		JButton D = new JButton(OptionD);
		JButton correct = new JButton(correctOption);
		
		QuestionPanel.add(QuestionText);
		QuestionPanel.add(A);
		QuestionPanel.add(B);
		QuestionPanel.add(C);
		QuestionPanel.add(D);
		QuestionPanel.add(correct);
	
	}
}
	