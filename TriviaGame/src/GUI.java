import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.ImageIcon;

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
		setSize(new Dimension(1920,1080));
		setDefaultLookAndFeelDecorated(false);
		setIconImage(new ImageIcon("D:/Serious/Academic/Programming and Software/Java/TriviaGame/TriviaGame/src/question_mark1600.png").getImage());
		
	}
}
