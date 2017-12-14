/**
 * Project: TriviaGame
 * 
 * Description: Plays a game of trivia with the user 
 * 
 * File: MainMenu.java: Part of "View" of the MVC framework. Builds a JPanel for the opening screen.
 * 
 * @author Atif Mahmud
 * @Date 2nd June 2017
 * 
 */

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class MainMenu extends JPanel{
	
	public MainMenu(){
	
		setLayout(new GridBagLayout());
		
		Font MainFont = new Font("Arial", Font.BOLD, 24);
		Font ButtonFont = new Font("Arial", Font.BOLD, 16);
		
		JLabel MainText = new JLabel("Welcome to Atif's TriviaGame! Please select an action.");
		MainText.setFont(MainFont); 
		add(MainText);
		
		JButton Start = new JButton("Start");
		Start.setFont(ButtonFont);
		JButton Exit = new JButton("Exit");
		Exit.setFont(ButtonFont);
		
		add(Start);
		add(Exit);
	
		Exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		Start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Main.start = 1;
			}
		});
		
	}
}

