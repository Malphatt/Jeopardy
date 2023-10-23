package components;

public class FinalQuestion {
	private int cachedId;
	private String category = "Final Jeopardy";
	private String question = "Question";
	private String[] answers;
	private int[] answersWorth;
	
	public FinalQuestion(int id) {
		setCachedId(id);
	}
	
	public String getCategory() {return category;}
	
	public void setQuestion(String question) {this.question = question;}
	public String getQuestion() {return question;}
	
	public void setAnswers(String[] answers) {this.answers = answers;}
	public String[] getAnswers() {return answers;}
	
	public void setAnswersWorth(int[] answersWorth) {this.answersWorth = answersWorth;}
	public int[] getAnswersWorth() {return answersWorth;}
	
	private void setCachedId(int id) {this.cachedId = id;}
	public int getCachedId() {return cachedId;}
}
