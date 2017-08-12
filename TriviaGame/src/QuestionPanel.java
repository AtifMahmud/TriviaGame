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
	
		c.anchor = GridBagConstraints.CENTER;
		
		
		
		d.gridx = 0;
		d.gridy = 0;
		add(QuestionLabel, d);
		
		c.gridx = 0;
		c.gridy = 0;
		
		c.gridx = 0;
		c.gridy = 60;
		add(ButtonA, c);
		
		c.gridx = 0;
		c.gridy = 90;
		add(ButtonB, c);
		
		c.gridx = 0;
		c.gridy = 120;
		add(ButtonC, c);
	
		c.gridx = 0;
		c.gridy = 150;
		add(ButtonD, c);
		
		ButtonA.setBackground(Color.LIGHT_GRAY);
		ButtonB.setBackground(Color.LIGHT_GRAY);
		ButtonC.setBackground(Color.LIGHT_GRAY);
		ButtonD.setBackground(Color.LIGHT_GRAY);
		
		ButtonA.setPreferredSize(ButtonSize);
		ButtonB.setPreferredSize(ButtonSize);
		ButtonC.setPreferredSize(ButtonSize);
		ButtonD.setPreferredSize(ButtonSize);
		
		ButtonA.setFont(ButtonFont);
		ButtonB.setFont(ButtonFont);
		ButtonC.setFont(ButtonFont);
		ButtonD.setFont(ButtonFont);
		
		
		setBackground(Color.WHITE);
	
	}
}
