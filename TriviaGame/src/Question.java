public class Question{
    private String Question; 
	private String OptionA;
	private String OptionB;
	private String OptionC;
	private String OptionD;
	private String CorrectOption;
	private GUI MyGUI;
	
	// Constructor for a new question
	public Question (String Question, String OptionA, String OptionB, String OptionC, String OptionD, String CorrectOption){
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
	
	public String getOptionD(){
		return this.OptionD;
	}
	
	public String getCorrectOption() {
		return this.CorrectOption;
	}
	
}
	