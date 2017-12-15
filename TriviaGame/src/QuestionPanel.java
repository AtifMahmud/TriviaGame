/**
 * Project: TriviaGame
 * 
 * Description: Plays a game of trivia with the user 
 * 
 * File: QuestionPanel.java: Part of "View" of the MVC framework. Builds a JPanel for the questions
 * 
 * @author Atif Mahmud
 * @Date 2nd June 2017
 * 
 */

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;
import java.awt.event.*;
import java.awt.event.ActionEvent;


public class QuestionPanel extends JPanel{
	private String Question;
	private String OptionA;
	private String OptionB;
	private String OptionC;
	private String OptionD;
    private String Correct;
    
	private static Dimension ButtonSize = new Dimension(200,100); 
	private static Font QuestionFont = new Font("Arial", Font.BOLD, 36);
	private static Font ButtonFont = new Font("Arial", Font.BOLD, 16);
	
	public QuestionPanel(String Question, String OptionA, String OptionB, String OptionC, String OptionD, String CorrectOption) {
		
		setLayout(new GridBagLayout()); 
		GridBagConstraints c = new GridBagConstraints();
		JLabel QuestionLabel = new JLabel(Question);
		QuestionLabel.setFont(QuestionFont);
		setBackground(Color.WHITE);
		
		HashMap <String, JButton> buttons = new HashMap<String, JButton>();
		
		this.Question = Question;
		this.OptionA = OptionA;
		this.OptionB = OptionB;
		this.OptionC = OptionC;
		this.OptionD = OptionD;
		this.Correct = CorrectOption;
		
		JButton A = new JButton(OptionA);
		JButton B = new JButton(OptionB);
		JButton C = new JButton(OptionC);
		JButton D = new JButton(OptionD);
		
		buttons.put("A", A);
		buttons.put("B", B);
		buttons.put("C", C);
		buttons.put("D", D);
		
		c.gridx = 0;
		c.gridy = 0;
		add(QuestionLabel, c);
		c.gridy++;
		add(A, c);
		c.gridy++;
		add(B, c);
		c.gridy++;
		add(C, c);
		c.gridy++;
		add(D, c);
		
		customizeButtons(buttons);		
	}
	
	private static void customizeButtons(HashMap <String, JButton> buttons) {
		
		for(HashMap.Entry<String, JButton> entry: buttons.entrySet()) { 
			
			String name = entry.getKey();
			JButton b = entry.getValue();
			String src = b.getName();
			
			boolean check = name.equals(src);
			
			b.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent event) {
					
					if(check){
						b.setBackground(Color.GREEN);
						Main.incrementScore();	
					}
					
					else {
						b.setBackground(Color.RED);
					}
					
					Main.setRun(false);
				}
			});
		}
	}
}