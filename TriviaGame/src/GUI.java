import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Dimension;

public class GUI extends JFrame {

	public String Question;
	public String OptionA;
	public String OptionB;
	public String OptionC;
	public String OptionD;
	public int gameScore;
	
	public JButton A;
	public JButton B;
	public JButton C;
	public JButton D;
	public JTextField Q;
	public JTextField score = new JTextField(Integer.toString(gameScore));
	
	public  GUI(){
		super("Atif's TriviaGame");	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(1000,1000));
	}
}
