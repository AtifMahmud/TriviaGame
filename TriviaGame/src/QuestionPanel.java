import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.font.*;
import java.util.ArrayList;


public class QuestionPanel extends JPanel{
	String Q;
	String A;
	String B;
	String C;
	String D;
    String Correct;
	
	public QuestionPanel(String Question, String OptionA, String OptionB, String OptionC, String OptionD, String CorrectOption) {
		
		Dimension ButtonSize = new Dimension(200,100); // (width, height)
		Font QuestionFont = new Font("Arial", Font.BOLD, 36);
		Font ButtonFont = new Font("Arial", Font.BOLD, 16);
		
		setLayout(new GridBagLayout()); 
		GridBagConstraints d = new GridBagConstraints();
		GridBagConstraints c = new GridBagConstraints();
		
		// Are the this.field lines necessary?
		this.Q = Question;
		this.A = OptionA;
		this.B = OptionB;
		this.C = OptionC;
		this.D = OptionD;
		
		JLabel QuestionLabel = new JLabel(Q);
		QuestionLabel.setFont(QuestionFont);
		
		JButton ButtonA = new JButton(A);
		JButton ButtonB = new JButton(B);
		JButton ButtonC = new JButton(C);
		JButton ButtonD = new JButton(D);
	
		// Make an ArrayList to hold all the buttons to use iterator
		ArrayList <JButton> ButtonList = new ArrayList<JButton>();
		
		ButtonList.add(ButtonA);
		ButtonList.add(ButtonB);
		ButtonList.add(ButtonC);
		ButtonList.add(ButtonD);
	
		c.gridx = 0;
		c.gridy = 0;
		add(QuestionLabel, c);
		c.gridy++;
		add(ButtonA, c);
		c.gridy++;
		add(ButtonB, c);
		c.gridy++;
		add(ButtonC, c);
		c.gridy++;
		add(ButtonD, c);
		
		
		// Designing all the buttons
		for(int i=0; i < ButtonList.size(); ++i) {
			ButtonList.get(i).setBackground(Color.LIGHT_GRAY);
			ButtonList.get(i).setPreferredSize(ButtonSize);
			ButtonList.get(i).setFont(ButtonFont);
		}
		
	
		setBackground(Color.WHITE);
	
	}
}
