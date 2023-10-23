package components;

public class TiebreakerQuestion {
	
	private String category = "Tiebreaker";
	private String question = "Question";
	private String answer = "Answer";
	
	public TiebreakerQuestion(String question, String answer) {
		setQuestion(question);
		setAnswer(answer);
	}
	
	public String getCategory() {return category;}
	
	private void setQuestion(String question) {this.question = question;}
	public String getQuestion() {return question;}
	
	private void setAnswer(String answer) {this.answer = answer;}
	public String getAnswer() {return answer;}
}
