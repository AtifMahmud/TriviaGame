import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuestionPanel extends JPanel{
	JTextField question;
	JButton OptionA;
	JButton OptionB;
	JButton OptionC;
	JButton OptionD;
    String correctOption;
	
	
	public QuestionPanel(JTextField question, JButton A, JButton B, JButton C, JButton D, String correct) {
		this.question = question;
		this.OptionA = A;
		this.OptionB = B;
		this.OptionC = C;
		this.OptionD = D;
		this.correctOption = correct;
		
	}
	
}
