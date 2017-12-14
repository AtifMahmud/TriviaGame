/**
 * Project: TriviaGame
 * 
 * Description: Plays a game of trivia with the user 
 * 
 * File: GUI.java: Part of "View" of the MVC framework. Builds a JFrame to mount the other parts of the game as JPanels
 * 
 * @author Atif Mahmud
 * @Date 2nd June 2017
 * 
 */

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class GUI extends JFrame {

	// Automatically generated UID
	private static final long serialVersionUID = 6411499808530678723L;

	public  GUI(){
		super("Atif's TriviaGame");	
		setSize(new Dimension(1920,1080));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(false);
		setIconImage(new ImageIcon("question_mark1600.png").getImage());
	}
}
