/**
 * Project: TriviaGame
 * 
 * Description: Plays a game of trivia with the user 
 * 
 * File: Question.java: Contains constructor, accessor, and mutators for the Question objects.
 * 
 * @author Atif Mahmud
 * @Date 2nd June 2017
 * 
 */

public class Question {
    private String Question; 
	private String OptionA;
	private String OptionB;
	private String OptionC;
	private String OptionD;
	private String CorrectOption;
	
	public Question (String Question, String OptionA, String OptionB, String OptionC, String OptionD, String CorrectOption) {
		this.Question = Question;
		this.OptionA = OptionA;
		this.OptionB = OptionB;
		this.OptionC = OptionC;
		this.OptionD = OptionD;
		this.CorrectOption = CorrectOption;
	}
	
	public String getQuestion() {
		return this.Question;
	}
	
	public String getOptionA() {
		return this.OptionA;
	}
	
	public String getOptionB() {
		return this.OptionB;
	}
	
	public String getOptionC() {
		return this.OptionC;
	}
	
	public String getOptionD() {
		return this.OptionD;
	}
	
	public String getCorrectOption() {
		return this.CorrectOption;
	}
	
	public void setQuestion(String Question) {
		this.Question = Question;
	}
	
	public void setOptionA(String OptionA) {
		this.OptionA = OptionA;
	}
	
	public void setOptionB(String OptionB) {
		this.OptionB = OptionB;
	}
	
	public void setOptionC(String OptionC) {
		this.OptionC = OptionC;
	}
	
	public void setOptionD(String OptionD) {
		this.OptionD = OptionD;
	}
	
	public void setCorrectOption(String CorrectOption) {
		this.CorrectOption = CorrectOption;
	}
	
}
	