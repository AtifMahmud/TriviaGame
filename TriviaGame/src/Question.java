public class Question{
    public String Question; 
	public String OptionA;
	public String OptionB;
	public String OptionC;
	public String OptionD;
	public String CorrectOption;
	public GUI MyGUI;
	
	// Constructor for a new question
	public Question (String Question, String OptionA, String OptionB, String OptionC, String OptionD, String CorrectOption){
		this.Question = Question;
		this.OptionA = OptionA;
		this.OptionB = OptionB;
		this.OptionC = OptionC;
		this.OptionD = OptionD;
		this.CorrectOption = CorrectOption;

	}
}
	