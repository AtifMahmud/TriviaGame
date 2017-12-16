package game;
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
	/**
	 * 
	 */
	private static final long serialVersionUID = 75504576578493095L;
	
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
		
		this.setQuestion(Question);
		this.setOptionA(OptionA);
		this.setOptionB(OptionB);
		this.setOptionC(OptionC);
		this.setOptionD(OptionD);
		this.setCorrect(CorrectOption);
		
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

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getOptionA() {
		return OptionA;
	}

	public void setOptionA(String optionA) {
		OptionA = optionA;
	}

	public String getOptionB() {
		return OptionB;
	}

	public void setOptionB(String optionB) {
		OptionB = optionB;
	}

	public String getOptionC() {
		return OptionC;
	}

	public void setOptionC(String optionC) {
		OptionC = optionC;
	}

	public String getOptionD() {
		return OptionD;
	}

	public void setOptionD(String optionD) {
		OptionD = optionD;
	}

	public String getCorrect() {
		return Correct;
	}

	public void setCorrect(String correct) {
		Correct = correct;
	}

	public static Dimension getButtonSize() {
		return ButtonSize;
	}

	public static void setButtonSize(Dimension buttonSize) {
		ButtonSize = buttonSize;
	}

	public static Font getButtonFont() {
		return ButtonFont;
	}

	public static void setButtonFont(Font buttonFont) {
		ButtonFont = buttonFont;
	}
}