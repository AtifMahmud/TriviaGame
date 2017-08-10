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
	
/*		JPanel QuestionPanel = new JPanel();
		QuestionPanel.setLayout(new CardLayout());
		JTextField QuestionText = new JTextField(question);
		JButton A = new JButton(OptionA);
		JButton B = new JButton(OptionB);
		JButton C = new JButton(OptionC);
		JButton D = new JButton(OptionD);
		JButton correct = new JButton(correctOption);
		
		QuestionPanel.add(QuestionText);
		QuestionPanel.add(A);
		QuestionPanel.add(B);
		QuestionPanel.add(C);
		QuestionPanel.add(D);
		QuestionPanel.add(correct);
 */
	
	}
}
	