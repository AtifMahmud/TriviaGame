import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.font.*;

public class QuestionPanel extends JPanel{
	String Q;
	String A;
	String B;
	String C;
	String D;
    String Correct;
	
	public QuestionPanel(String Question, String OptionA, String OptionB, String OptionC, String OptionD, String CorrectOption) {
		
		Dimension d = new Dimension(1000,20);
		Font f = new Font("Arial", Font.BOLD, 36);
		
		setLayout(new GridBagLayout()); 
		GridBagConstraints c = new GridBagConstraints();
		
		// Are the this.field lines necessary?
		this.Q = Question;
		this.A = OptionA;
		this.B = OptionB;
		this.C = OptionC;
		this.D = OptionD;
		
		JLabel QuestionLabel = new JLabel(Q);
		QuestionLabel.setFont(f);
		
		JButton ButtonA = new JButton(A);
		JButton ButtonB = new JButton(B);
		JButton ButtonC = new JButton(C);
		JButton ButtonD = new JButton(D);
	
		
		c.gridx = 0;
		c.gridy = 0;
		add(QuestionLabel, c);
		
		c.gridy = 25;
		add(ButtonA, c);
		
		c.gridy++;
		add(ButtonB, c);
		
		c.gridy++;
		add(ButtonC, c);
	
		c.gridy++;
		add(ButtonD, c);
		
		ButtonA.setBackground(Color.LIGHT_GRAY);
		ButtonB.setBackground(Color.LIGHT_GRAY);
		ButtonC.setBackground(Color.LIGHT_GRAY);
		ButtonD.setBackground(Color.LIGHT_GRAY);
		
		setBackground(Color.magenta);
	
	}
}
