import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class QuestionPanel extends JPanel{
	String Q;
	String A;
	String B;
	String C;
	String D;
    String Correct;
	
	public QuestionPanel(String Question, String OptionA, String OptionB, String OptionC, String OptionD, String CorrectOption) {
		
		setLayout(new GridLayout(2,2,5,5)); // 2 rows, 2 columns, hgap and vgap of 5
		
		// Are the this.field lines necessary?
		this.Q = Question;
		this.A = OptionA;
		this.B = OptionB;
		this.C = OptionC;
		this.D = OptionD;
		
		JTextField QuestionText = new JTextField(Q);
		JButton ButtonA = new JButton(A);
		JButton ButtonB = new JButton(B);
		JButton ButtonC = new JButton(C);
		JButton ButtonD = new JButton(D);
		
		add(QuestionText);
		add(ButtonA);
		add(ButtonB);
		add(ButtonC);
		add(ButtonD);
	}
}
