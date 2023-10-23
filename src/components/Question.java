package components;

public class Question {
	
	private String cachedId;
	private String category = "Category";
	private String question = "Question";
	private String answer = "Answer";
	private int worth;
	private boolean isPictureQuestion = false;
	private String questionPictureUrl = "Question Picture URL";
	private String answerPictureUrl = "Answer Picture URL";
	
	public Question(String id, int worth) {
		setCachedId(id);
		setWorth(worth);
	}
	
	public void setCategory(String category) {this.category = category;}
	public String getCategory() {return category;}
	
	public void setQuestion(String question) {this.question = question;}
	public String getQuestion() {return question;}
	
	public void setAnswer(String answer) {this.answer = answer;}
	public String getAnswer() {return answer;}
	
	private void setWorth(int worth) {this.worth = worth;}
	public int getWorth() {return worth * 100;}
	
	public void setPictureQuestion(boolean isPictureQuestion) {this.isPictureQuestion = isPictureQuestion;}
	public boolean isPictureQuestion() {return isPictureQuestion;}
	
	public void setQuestionPictureUrl(String questionPictureUrl) {this.questionPictureUrl = questionPictureUrl;}
	public String getQuestionPictureUrl() {return questionPictureUrl;}
	public void setAnswerPictureUrl(String answerPictureUrl) {this.answerPictureUrl = answerPictureUrl;}
	public String getAnswerPictureUrl() {return answerPictureUrl;}

	private void setCachedId(String id) {this.cachedId = id;}
	public String getCachedId() {return cachedId;}
}
