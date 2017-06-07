import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Dimension;

public class GUI extends JFrame {
	
	
	public String Question;
	public String OptionA;
	public String OptionB;
	public String OptionC;
	public String OptionD;
	
	public JButton A = new JButton(OptionA);
	public JButton B = new JButton(OptionB);
	public JButton C = new JButton(OptionC);
	public JButton D = new JButton(OptionD);
	public JTextField Q = new JTextField(Question);
	
	
	
	
	
	public GUI(){
		super("Atif's TriviaGame");
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
	
	
}
