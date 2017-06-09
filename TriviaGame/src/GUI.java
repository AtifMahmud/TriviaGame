import javax.swing.BoxLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
	public int gameScore;
	
	public JButton A;
	public JButton B;
	public JButton C;
	public JButton D;
	public JTextField Q;
	public JTextField score = new JTextField(Integer.toString(gameScore));
	
	
	public  GUI(){
		super("Atif's TriviaGame");
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		A = new JButton();
		B = new JButton();
		C = new JButton();
		D = new JButton();
		
		TheHandler handler = new TheHandler();
		A.addMouseListener(handler);
		B.addMouseListener(handler);
		C.addMouseListener(handler);
		D.addMouseListener(handler);
		
	}
	
	public class TheHandler implements MouseListener{
		
		// Implementing the abstract methods: some of them are empty because we don't need them
		
		public void mouseClicked(MouseEvent event){
				System.out.println("Clicked");
				JOptionPane.showMessageDialog(null, "Clicked");
			
		}
		
		public void mousePressed(MouseEvent event){
			System.out.println("Pressed");
			JOptionPane.showMessageDialog(null, "Pressed");
		
		}
		
		public void mouseReleased(MouseEvent event){
			System.out.println("Released");
			JOptionPane.showMessageDialog(null, "Released");
		
		}
		
		public void mouseEntered(MouseEvent event){
			System.out.println("Entered");
			JOptionPane.showMessageDialog(null, "Entered");
		
		}
		
		public void mouseExited(MouseEvent event){
			System.out.println("Exited");
			JOptionPane.showMessageDialog(null, "Exited");
		
		}
		
	}
}
