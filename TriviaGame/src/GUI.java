import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
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
	
	}
	
	
}
