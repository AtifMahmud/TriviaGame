import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.io.*;
import sun.audio.*;

public class QuestionPanel extends JPanel{
	String Question;
	String OptionA;
	String OptionB;
	String OptionC;
	String OptionD;
    String Correct;
	
	public QuestionPanel(String Question, String OptionA, String OptionB, String OptionC, String OptionD, String CorrectOption) {
		
		AudioStream Audio;
		
		Dimension ButtonSize = new Dimension(200,100); // (width, height)
		Font QuestionFont = new Font("Arial", Font.BOLD, 36);
		Font ButtonFont = new Font("Arial", Font.BOLD, 16);
		
		try {
			InputStream In = new FileInputStream("D:/Serious/Academic/Programming and Software/Java/TriviaGame/TriviaGame/src/correct.wav");
			Audio = new AudioStream(In);
			
		
		
		
		
		setLayout(new GridBagLayout()); 
		GridBagConstraints d = new GridBagConstraints();
		GridBagConstraints c = new GridBagConstraints();
		
		// Are the this.field lines necessary?
		this.Question = Question;
		this.OptionA = OptionA;
		this.OptionB = OptionB;
		this.OptionC = OptionC;
		this.OptionD = OptionD;
		this.Correct = CorrectOption;
		
		JLabel QuestionLabel = new JLabel(Question);
		QuestionLabel.setFont(QuestionFont);
		
		JButton A = new JButton(OptionA);
		JButton B = new JButton(OptionB);
		JButton C = new JButton(OptionC);
		JButton D = new JButton(OptionD);
		
	
		// Make an ArrayList to hold all the buttons to use iterator
		ArrayList <JButton> ButtonList = new ArrayList<JButton>();
		
		ButtonList.add(A);
		ButtonList.add(B);
		ButtonList.add(C);
		ButtonList.add(D);
		
		// Add the buttons on GridBagLayout
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
		
		// Designing all the buttons
		for(int i=0; i < ButtonList.size(); ++i) {
			JButton b = ButtonList.get(i);
			b.setBackground(Color.LIGHT_GRAY);
			b.setPreferredSize(ButtonSize);
			b.setFont(ButtonFont);
			
//==================================================================================			
			b.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent event) {
					
					boolean check = (event.getSource().equals(A) && Correct.contains("A")) || // line break
							(event.getSource().equals(B) && Correct.contains("B")) || //  line break
							(event.getSource().equals(C) && Correct.contains("C")) || // line break
							(event.getSource().equals(D) && Correct.contains("D")); //  line break
					
					//System.out.println(event.getSource().toString());
					if(check){
						b.setBackground(Color.GREEN);
						AudioPlayer.player.start(Audio);
						Main.score++;
					
						
					}
					
					else {
						b.setBackground(Color.RED);
					}
					
					Main.run = false;
				}
			});
//==================================================================================			
		}
		setBackground(Color.WHITE);
		
		
	}
		catch (IOException e) {
			
		}
	}
}
