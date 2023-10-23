package scripts;

import java.util.ArrayList;
import java.util.Arrays;

import components.FinalQuestion;
import components.Question;
import components.TiebreakerQuestion;

public class questionSystem {
	
	private Question C1R1;
	private Question C1R2;
	private Question C1R3;
	private Question C1R4;
	private Question C1R5;
	
	private Question C2R1;
	private Question C2R2;
	private Question C2R3;
	private Question C2R4;
	private Question C2R5;
	
	private Question C3R1;
	private Question C3R2;
	private Question C3R3;
	private Question C3R4;
	private Question C3R5;
	
	private Question C4R1;
	private Question C4R2;
	private Question C4R3;
	private Question C4R4;
	private Question C4R5;
	
	private Question C5R1;
	private Question C5R2;
	private Question C5R3;
	private Question C5R4;
	private Question C5R5;
	
	private Question C6R1;
	private Question C6R2;
	private Question C6R3;
	private Question C6R4;
	private Question C6R5;
			
	private Question currentQuestion;
	
	private sql sql;
	
	private int[] categoryIds;
	private String[] categoryNames;
	
	private TiebreakerQuestion[] tiebreakerQuestions;
	private TiebreakerQuestion currentTiebreakerQuestion;
	private int tiebreakerQuestionIndex;
	
	private FinalQuestion finalQuestion1;
	private FinalQuestion finalQuestion2;
	private FinalQuestion finalQuestion3;
	private FinalQuestion finalQuestion4;
	private FinalQuestion finalQuestion5;
	
	private FinalQuestion currentFinalQuestion;
	private int currentPlayerTurn;
	private boolean isReveal;

	private String[] savedAnswers1;
	private String[] savedAnswers2;
	
	private boolean[] revealedAnswers;
	private boolean[] revealedWorths;
	
	private int[] finalCategoryIds;
	private String[] finalCategoryNames;
	
	
 	public questionSystem(sql sql) {
 		this.sql = sql;
 		resetAll();
	}
 	
 	public void resetAll() {
 		C1R1 = new Question("C1R1", 1);	C1R2 = new Question("C1R2", 2);	C1R3 = new Question("C1R3", 3);	C1R4 = new Question("C1R4", 4);	C1R5 = new Question("C1R5", 5);
 		C2R1 = new Question("C2R1", 1);	C2R2 = new Question("C2R2", 2);	C2R3 = new Question("C2R3", 3); C2R4 = new Question("C2R4", 4); C2R5 = new Question("C2R5", 5);
 		C3R1 = new Question("C3R1", 1); C3R2 = new Question("C3R2", 2); C3R3 = new Question("C3R3", 3); C3R4 = new Question("C3R4", 4); C3R5 = new Question("C3R5", 5);
 		C4R1 = new Question("C4R1", 1); C4R2 = new Question("C4R2", 2); C4R3 = new Question("C4R3", 3); C4R4 = new Question("C4R4", 4); C4R5 = new Question("C4R5", 5);
 		C5R1 = new Question("C5R1", 1); C5R2 = new Question("C5R2", 2); C5R3 = new Question("C5R3", 3); C5R4 = new Question("C5R4", 4); C5R5 = new Question("C5R5", 5);
 		C6R1 = new Question("C6R1", 1); C6R2 = new Question("C6R2", 2); C6R3 = new Question("C6R3", 3); C6R4 = new Question("C6R4", 4); C6R5 = new Question("C6R5", 5);

 		currentQuestion = null;
 		
 		resetTiebreakerIndex();
 		fetchTiebreakerQuestions();
 		
 		finalQuestion1 = new FinalQuestion(1);
 		finalQuestion2 = new FinalQuestion(2);
 		finalQuestion3 = new FinalQuestion(3);
 		finalQuestion4 = new FinalQuestion(4);
 		finalQuestion5 = new FinalQuestion(5);
 		
 		currentFinalQuestion = null;
 		currentPlayerTurn = 1;
 		
 		savedAnswers1 = new String[] {"","","","",""};
 		savedAnswers2 = new String[] {"","","","",""};
 		
 		setReveal(false);
 		
 		revealedAnswers = new boolean[] {false,false,false,false,false};
 		revealedWorths = new boolean[] {false,false,false,false,false};
 	}
 	
 	public void fetchCategories() {
 		String[][] categoriesData = sql.getCategories();
			
		categoryIds = new int[categoriesData.length];
		categoryNames = new String[categoriesData.length];
		
		for (int i = 0; i < categoriesData.length; i++) {
			categoryIds[i] = Integer.parseInt(categoriesData[i][0]);
			categoryNames[i] = categoriesData[i][1];
		}
		
		String[][] finalCategoriesData = sql.getFinalCategories();

		finalCategoryIds = new int[finalCategoriesData.length];
		finalCategoryNames = new String[finalCategoriesData.length];
		
		for (int i = 0; i < finalCategoriesData.length; i++) {
			finalCategoryIds[i] = Integer.parseInt(finalCategoriesData[i][0]);
			finalCategoryNames[i] = finalCategoriesData[i][1];
		}
 	}
 	
 	public void fetchTiebreakerQuestions() {
 		String[][] tiebreakerQuestionsData = sql.getTiebreakerQuestions();
 		
 		ArrayList<TiebreakerQuestion> tiebreakerQuestions = new ArrayList<TiebreakerQuestion>();
 		try {
	 		for (String [] tiebreakerQuestionData : tiebreakerQuestionsData) {
	 			tiebreakerQuestions.add(new TiebreakerQuestion(tiebreakerQuestionData[0], tiebreakerQuestionData[1]));
	 		}
	 		
	 		TiebreakerQuestion[] tiebreakerQuestionsObj = new TiebreakerQuestion[tiebreakerQuestions.size()];
	 		for (int i = 0; i < tiebreakerQuestions.size(); i++) {
	 			tiebreakerQuestionsObj[i] = tiebreakerQuestions.get(i);
	 		}
	 		
	 		this.tiebreakerQuestions = tiebreakerQuestionsObj;
 		} catch (Exception e) {
 			System.out.println(e.getMessage());
 		}
 	}
 	
 	public int totalCategories() {return categoryIds.length;}

 	public int getCategoryId(int index) {return categoryIds[index];}
 	public String getCategoryName(int index) {return categoryNames[index];}
 	public String[] getCategoryNames() {return categoryNames;}
 	
 	public int totalFinalCategories() {return finalCategoryIds.length;}
 	
 	public int getFinalCategoryId(int index) {return finalCategoryIds[index];}
 	public String getFinalCategoryName(int index) {return finalCategoryNames[index];}
 	public String[] getFinalCategoryNames() {return finalCategoryNames;}
 	
 	public void resetQuestions() {
 		C1R1 = new Question("C1R1", 1);	C1R2 = new Question("C1R2", 2);	C1R3 = new Question("C1R3", 3);	C1R4 = new Question("C1R4", 4);	C1R5 = new Question("C1R5", 5);
 		C2R1 = new Question("C2R1", 1);	C2R2 = new Question("C2R2", 2);	C2R3 = new Question("C2R3", 3); C2R4 = new Question("C2R4", 4); C2R5 = new Question("C2R5", 5);
 		C3R1 = new Question("C3R1", 1); C3R2 = new Question("C3R2", 2); C3R3 = new Question("C3R3", 3); C3R4 = new Question("C3R4", 4); C3R5 = new Question("C3R5", 5);
 		C4R1 = new Question("C4R1", 1); C4R2 = new Question("C4R2", 2); C4R3 = new Question("C4R3", 3); C4R4 = new Question("C4R4", 4); C4R5 = new Question("C4R5", 5);
 		C5R1 = new Question("C5R1", 1); C5R2 = new Question("C5R2", 2); C5R3 = new Question("C5R3", 3); C5R4 = new Question("C5R4", 4); C5R5 = new Question("C5R5", 5);
 		C6R1 = new Question("C6R1", 1); C6R2 = new Question("C6R2", 2); C6R3 = new Question("C6R3", 3); C6R4 = new Question("C6R4", 4); C6R5 = new Question("C6R5", 5);
 	}
 	
 	public void setQuestions(int sqlCategoryId, int gameCategoryNumber) {
 		int[] questionIds = sql.getQuestionIds(sqlCategoryId);
 		String categoryName = sql.getCategoryName(sqlCategoryId);
 		
 		
 		switch (gameCategoryNumber) {
 			case 1:
 				C1R1.setCategory(categoryName);	C1R1.setQuestion(sql.getQuestion(questionIds[0]));	C1R1.setAnswer(sql.getAnswer(questionIds[0]));	C1R1.setPictureQuestion(sql.isPictureQuestion(questionIds[0]));
 				C1R2.setCategory(categoryName); C1R2.setQuestion(sql.getQuestion(questionIds[1]));	C1R2.setAnswer(sql.getAnswer(questionIds[1]));	C1R2.setPictureQuestion(sql.isPictureQuestion(questionIds[1]));
 				C1R3.setCategory(categoryName); C1R3.setQuestion(sql.getQuestion(questionIds[2]));	C1R3.setAnswer(sql.getAnswer(questionIds[2]));	C1R3.setPictureQuestion(sql.isPictureQuestion(questionIds[2]));
 				C1R4.setCategory(categoryName); C1R4.setQuestion(sql.getQuestion(questionIds[3]));	C1R4.setAnswer(sql.getAnswer(questionIds[3]));	C1R4.setPictureQuestion(sql.isPictureQuestion(questionIds[3]));
 				C1R5.setCategory(categoryName); C1R5.setQuestion(sql.getQuestion(questionIds[4]));	C1R5.setAnswer(sql.getAnswer(questionIds[4]));	C1R5.setPictureQuestion(sql.isPictureQuestion(questionIds[4]));
 				
 				if (C1R1.isPictureQuestion()) {C1R1.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[0])); C1R1.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[0]));}
 				if (C1R2.isPictureQuestion()) {C1R2.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[1])); C1R2.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[1]));}
 				if (C1R3.isPictureQuestion()) {C1R3.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[2])); C1R3.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[2]));}
 				if (C1R4.isPictureQuestion()) {C1R4.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[3])); C1R4.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[3]));}
 				if (C1R5.isPictureQuestion()) {C1R5.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[4])); C1R5.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[4]));}
 				break;
 			case 2:
 				C2R1.setCategory(categoryName);	C2R1.setQuestion(sql.getQuestion(questionIds[0]));	C2R1.setAnswer(sql.getAnswer(questionIds[0]));	C2R1.setPictureQuestion(sql.isPictureQuestion(questionIds[0]));
 				C2R2.setCategory(categoryName); C2R2.setQuestion(sql.getQuestion(questionIds[1]));	C2R2.setAnswer(sql.getAnswer(questionIds[1]));	C2R2.setPictureQuestion(sql.isPictureQuestion(questionIds[1]));
 				C2R3.setCategory(categoryName); C2R3.setQuestion(sql.getQuestion(questionIds[2]));	C2R3.setAnswer(sql.getAnswer(questionIds[2]));	C2R3.setPictureQuestion(sql.isPictureQuestion(questionIds[2]));
 				C2R4.setCategory(categoryName); C2R4.setQuestion(sql.getQuestion(questionIds[3]));	C2R4.setAnswer(sql.getAnswer(questionIds[3]));	C2R4.setPictureQuestion(sql.isPictureQuestion(questionIds[3]));
 				C2R5.setCategory(categoryName); C2R5.setQuestion(sql.getQuestion(questionIds[4]));	C2R5.setAnswer(sql.getAnswer(questionIds[4]));	C2R5.setPictureQuestion(sql.isPictureQuestion(questionIds[4]));
 				
 				if (C2R1.isPictureQuestion()) {C2R1.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[0])); C2R1.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[0]));}
 				if (C2R2.isPictureQuestion()) {C2R2.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[1])); C2R2.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[1]));}
 				if (C2R3.isPictureQuestion()) {C2R3.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[2])); C2R3.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[2]));}
 				if (C2R4.isPictureQuestion()) {C2R4.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[3])); C2R4.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[3]));}
 				if (C2R5.isPictureQuestion()) {C2R5.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[4])); C2R5.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[4]));}
 				break;
 			case 3:
 				C3R1.setCategory(categoryName);	C3R1.setQuestion(sql.getQuestion(questionIds[0]));	C3R1.setAnswer(sql.getAnswer(questionIds[0]));	C3R1.setPictureQuestion(sql.isPictureQuestion(questionIds[0]));
 				C3R2.setCategory(categoryName); C3R2.setQuestion(sql.getQuestion(questionIds[1]));	C3R2.setAnswer(sql.getAnswer(questionIds[1]));	C3R2.setPictureQuestion(sql.isPictureQuestion(questionIds[1]));
 				C3R3.setCategory(categoryName); C3R3.setQuestion(sql.getQuestion(questionIds[2]));	C3R3.setAnswer(sql.getAnswer(questionIds[2]));	C3R3.setPictureQuestion(sql.isPictureQuestion(questionIds[2]));
 				C3R4.setCategory(categoryName); C3R4.setQuestion(sql.getQuestion(questionIds[3]));	C3R4.setAnswer(sql.getAnswer(questionIds[3]));	C3R4.setPictureQuestion(sql.isPictureQuestion(questionIds[3]));
 				C3R5.setCategory(categoryName); C3R5.setQuestion(sql.getQuestion(questionIds[4]));	C3R5.setAnswer(sql.getAnswer(questionIds[4]));	C3R5.setPictureQuestion(sql.isPictureQuestion(questionIds[4]));
 				
 				if (C3R1.isPictureQuestion()) {C3R1.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[0])); C3R1.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[0]));}
 				if (C3R2.isPictureQuestion()) {C3R2.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[1])); C3R2.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[1]));}
 				if (C3R3.isPictureQuestion()) {C3R3.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[2])); C3R3.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[2]));}
 				if (C3R4.isPictureQuestion()) {C3R4.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[3])); C3R4.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[3]));}
 				if (C3R5.isPictureQuestion()) {C3R5.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[4])); C3R5.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[4]));}
 				break;
 			case 4:
 				C4R1.setCategory(categoryName);	C4R1.setQuestion(sql.getQuestion(questionIds[0]));	C4R1.setAnswer(sql.getAnswer(questionIds[0]));	C4R1.setPictureQuestion(sql.isPictureQuestion(questionIds[0]));
 				C4R2.setCategory(categoryName); C4R2.setQuestion(sql.getQuestion(questionIds[1]));	C4R2.setAnswer(sql.getAnswer(questionIds[1]));	C4R2.setPictureQuestion(sql.isPictureQuestion(questionIds[1]));
 				C4R3.setCategory(categoryName); C4R3.setQuestion(sql.getQuestion(questionIds[2]));	C4R3.setAnswer(sql.getAnswer(questionIds[2]));	C4R3.setPictureQuestion(sql.isPictureQuestion(questionIds[2]));
 				C4R4.setCategory(categoryName); C4R4.setQuestion(sql.getQuestion(questionIds[3]));	C4R4.setAnswer(sql.getAnswer(questionIds[3]));	C4R4.setPictureQuestion(sql.isPictureQuestion(questionIds[3]));
 				C4R5.setCategory(categoryName); C4R5.setQuestion(sql.getQuestion(questionIds[4]));	C4R5.setAnswer(sql.getAnswer(questionIds[4]));	C4R5.setPictureQuestion(sql.isPictureQuestion(questionIds[4]));
 				
 				if (C4R1.isPictureQuestion()) {C4R1.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[0])); C4R1.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[0]));}
 				if (C4R2.isPictureQuestion()) {C4R2.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[1])); C4R2.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[1]));}
 				if (C4R3.isPictureQuestion()) {C4R3.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[2])); C4R3.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[2]));}
 				if (C4R4.isPictureQuestion()) {C4R4.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[3])); C4R4.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[3]));}
 				if (C4R5.isPictureQuestion()) {C4R5.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[4])); C4R5.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[4]));}
 				break;
 			case 5:
 				C5R1.setCategory(categoryName);	C5R1.setQuestion(sql.getQuestion(questionIds[0]));	C5R1.setAnswer(sql.getAnswer(questionIds[0]));	C5R1.setPictureQuestion(sql.isPictureQuestion(questionIds[0]));
 				C5R2.setCategory(categoryName); C5R2.setQuestion(sql.getQuestion(questionIds[1]));	C5R2.setAnswer(sql.getAnswer(questionIds[1]));	C5R2.setPictureQuestion(sql.isPictureQuestion(questionIds[1]));
 				C5R3.setCategory(categoryName); C5R3.setQuestion(sql.getQuestion(questionIds[2]));	C5R3.setAnswer(sql.getAnswer(questionIds[2]));	C5R3.setPictureQuestion(sql.isPictureQuestion(questionIds[2]));
 				C5R4.setCategory(categoryName); C5R4.setQuestion(sql.getQuestion(questionIds[3]));	C5R4.setAnswer(sql.getAnswer(questionIds[3]));	C5R4.setPictureQuestion(sql.isPictureQuestion(questionIds[3]));
 				C5R5.setCategory(categoryName); C5R5.setQuestion(sql.getQuestion(questionIds[4]));	C5R5.setAnswer(sql.getAnswer(questionIds[4]));	C5R5.setPictureQuestion(sql.isPictureQuestion(questionIds[4]));
 				
 				if (C5R1.isPictureQuestion()) {C5R1.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[0])); C5R1.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[0]));}
 				if (C5R2.isPictureQuestion()) {C5R2.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[1])); C5R2.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[1]));}
 				if (C5R3.isPictureQuestion()) {C5R3.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[2])); C5R3.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[2]));}
 				if (C5R4.isPictureQuestion()) {C5R4.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[3])); C5R4.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[3]));}
 				if (C5R5.isPictureQuestion()) {C5R5.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[4])); C5R5.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[4]));}
 				break;
 			case 6:
 				C6R1.setCategory(categoryName);	C6R1.setQuestion(sql.getQuestion(questionIds[0]));	C6R1.setAnswer(sql.getAnswer(questionIds[0]));	C6R1.setPictureQuestion(sql.isPictureQuestion(questionIds[0]));
 				C6R2.setCategory(categoryName); C6R2.setQuestion(sql.getQuestion(questionIds[1]));	C6R2.setAnswer(sql.getAnswer(questionIds[1]));	C6R2.setPictureQuestion(sql.isPictureQuestion(questionIds[1]));
 				C6R3.setCategory(categoryName); C6R3.setQuestion(sql.getQuestion(questionIds[2]));	C6R3.setAnswer(sql.getAnswer(questionIds[2]));	C6R3.setPictureQuestion(sql.isPictureQuestion(questionIds[2]));
 				C6R4.setCategory(categoryName); C6R4.setQuestion(sql.getQuestion(questionIds[3]));	C6R4.setAnswer(sql.getAnswer(questionIds[3]));	C6R4.setPictureQuestion(sql.isPictureQuestion(questionIds[3]));
 				C6R5.setCategory(categoryName); C6R5.setQuestion(sql.getQuestion(questionIds[4]));	C6R5.setAnswer(sql.getAnswer(questionIds[4]));	C6R5.setPictureQuestion(sql.isPictureQuestion(questionIds[4]));
 				
 				if (C6R1.isPictureQuestion()) {C6R1.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[0])); C6R1.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[0]));}
 				if (C6R2.isPictureQuestion()) {C6R2.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[1])); C6R2.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[1]));}
 				if (C6R3.isPictureQuestion()) {C6R3.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[2])); C6R3.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[2]));}
 				if (C6R4.isPictureQuestion()) {C6R4.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[3])); C6R4.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[3]));}
 				if (C6R5.isPictureQuestion()) {C6R5.setQuestionPictureUrl(sql.getQuestionPictureUrl(questionIds[4])); C6R5.setAnswerPictureUrl(sql.getAnswerPictureUrl(questionIds[4]));}
 				break;
 			
 			default: break;
 		}
 	}
 	public void setFinalQuestions(int sqlCategoryId) {
 		int[] finalQuestionIds = sql.getFinalQuestionIds(sqlCategoryId);
 		
 		finalQuestion1.setQuestion(sql.getFinalQuestion(finalQuestionIds[0]));	finalQuestion1.setAnswers(sql.getFinalAnswers(finalQuestionIds[0]));	finalQuestion1.setAnswersWorth(sql.getFinalAnswersWorth(finalQuestionIds[0]));
 		finalQuestion2.setQuestion(sql.getFinalQuestion(finalQuestionIds[1]));	finalQuestion2.setAnswers(sql.getFinalAnswers(finalQuestionIds[1]));	finalQuestion2.setAnswersWorth(sql.getFinalAnswersWorth(finalQuestionIds[1]));
 		finalQuestion3.setQuestion(sql.getFinalQuestion(finalQuestionIds[2]));	finalQuestion3.setAnswers(sql.getFinalAnswers(finalQuestionIds[2]));	finalQuestion3.setAnswersWorth(sql.getFinalAnswersWorth(finalQuestionIds[2]));
 		finalQuestion4.setQuestion(sql.getFinalQuestion(finalQuestionIds[3]));	finalQuestion4.setAnswers(sql.getFinalAnswers(finalQuestionIds[3]));	finalQuestion4.setAnswersWorth(sql.getFinalAnswersWorth(finalQuestionIds[3]));
 		finalQuestion5.setQuestion(sql.getFinalQuestion(finalQuestionIds[4]));	finalQuestion5.setAnswers(sql.getFinalAnswers(finalQuestionIds[4]));	finalQuestion5.setAnswersWorth(sql.getFinalAnswersWorth(finalQuestionIds[4]));
 	}
 	
 	private Question getQuestionObj(int C, int R) {
		switch (C) {
			case 1:
				switch (R) {
					case 1: return C1R1;
					case 2: return C1R2;
					case 3: return C1R3;
					case 4: return C1R4;
					case 5: return C1R5;
					
					default: return null;
				}
			case 2:
				switch (R) {
					case 1: return C2R1;
					case 2: return C2R2;
					case 3: return C2R3;
					case 4: return C2R4;
					case 5: return C2R5;
					
					default: return null;
				}
			case 3:
				switch (R) {
					case 1: return C3R1;
					case 2: return C3R2;
					case 3: return C3R3;
					case 4: return C3R4;
					case 5: return C3R5;
					
					default: return null;
				}
			case 4:
				switch (R) {
					case 1: return C4R1;
					case 2: return C4R2;
					case 3: return C4R3;
					case 4: return C4R4;
					case 5: return C4R5;
					
					default: return null;
				}
			case 5:
				switch (R) {
					case 1: return C5R1;
					case 2: return C5R2;
					case 3: return C5R3;
					case 4: return C5R4;
					case 5: return C5R5;
					
					default: return null;
				}
			case 6:
				switch (R) {
					case 1: return C6R1;
					case 2: return C6R2;
					case 3: return C6R3;
					case 4: return C6R4;
					case 5: return C6R5;
					
					default: return null;
				}
				
			default: return null;
		}
	}
 	private FinalQuestion getQuestionObj(int Q) {
 		switch (Q) {
 			case 1: 	return finalQuestion1;
 			case 2: 	return finalQuestion2;
 			case 3: 	return finalQuestion3;
 			case 4: 	return finalQuestion4;
 			case 5: 	return finalQuestion5;
 			
 			default:	return null;
 		}
 	}
 	
	public String getCategory(int C) {
		switch (C) {
			case 1: return C1R1.getCategory();
			case 2: return C2R1.getCategory();
			case 3: return C3R1.getCategory();
			case 4: return C4R1.getCategory();
			case 5: return C5R1.getCategory();
			case 6: return C6R1.getCategory();
			
			default: return "null";
		}
	}
	public String getQuestion(int C, int R) {
		switch (C) {
			case 1:
				switch (R) {
					case 1: return C1R1.getQuestion();
					case 2: return C1R2.getQuestion();
					case 3: return C1R3.getQuestion();
					case 4: return C1R4.getQuestion();
					case 5: return C1R5.getQuestion();
					
					default: return "null";
				}
			case 2:
				switch (R) {
					case 1: return C2R1.getQuestion();
					case 2: return C2R2.getQuestion();
					case 3: return C2R3.getQuestion();
					case 4: return C2R4.getQuestion();
					case 5: return C2R5.getQuestion();
					
					default: return "null";
				}
			case 3:
				switch (R) {
					case 1: return C3R1.getQuestion();
					case 2: return C3R2.getQuestion();
					case 3: return C3R3.getQuestion();
					case 4: return C3R4.getQuestion();
					case 5: return C3R5.getQuestion();
					
					default: return "null";
				}
			case 4:
				switch (R) {
					case 1: return C4R1.getQuestion();
					case 2: return C4R2.getQuestion();
					case 3: return C4R3.getQuestion();
					case 4: return C4R4.getQuestion();
					case 5: return C4R5.getQuestion();
					
					default: return "null";
				}
			case 5:
				switch (R) {
					case 1: return C5R1.getQuestion();
					case 2: return C5R2.getQuestion();
					case 3: return C5R3.getQuestion();
					case 4: return C5R4.getQuestion();
					case 5: return C5R5.getQuestion();
					
					default: return "null";
				}
			case 6:
				switch (R) {
					case 1: return C6R1.getQuestion();
					case 2: return C6R2.getQuestion();
					case 3: return C6R3.getQuestion();
					case 4: return C6R4.getQuestion();
					case 5: return C6R5.getQuestion();
					
					default: return "null";
				}
				
			default: return "null";
		}
	}
	public String getAnswer(int C, int R) {
		switch (C) {
			case 1:
				switch (R) {
					case 1: return C1R1.getAnswer();
					case 2: return C1R2.getAnswer();
					case 3: return C1R3.getAnswer();
					case 4: return C1R4.getAnswer();
					case 5: return C1R5.getAnswer();
					
					default: return "null";
				}
			case 2:
				switch (R) {
					case 1: return C2R1.getAnswer();
					case 2: return C2R2.getAnswer();
					case 3: return C2R3.getAnswer();
					case 4: return C2R4.getAnswer();
					case 5: return C2R5.getAnswer();
					
					default: return "null";
				}
			case 3:
				switch (R) {
					case 1: return C3R1.getAnswer();
					case 2: return C3R2.getAnswer();
					case 3: return C3R3.getAnswer();
					case 4: return C3R4.getAnswer();
					case 5: return C3R5.getAnswer();
					
					default: return "null";
				}
			case 4:
				switch (R) {
					case 1: return C4R1.getAnswer();
					case 2: return C4R2.getAnswer();
					case 3: return C4R3.getAnswer();
					case 4: return C4R4.getAnswer();
					case 5: return C4R5.getAnswer();
					
					default: return "null";
				}
			case 5:
				switch (R) {
					case 1: return C5R1.getAnswer();
					case 2: return C5R2.getAnswer();
					case 3: return C5R3.getAnswer();
					case 4: return C5R4.getAnswer();
					case 5: return C5R5.getAnswer();
					
					default: return "null";
				}
			case 6:
				switch (R) {
					case 1: return C6R1.getAnswer();
					case 2: return C6R2.getAnswer();
					case 3: return C6R3.getAnswer();
					case 4: return C6R4.getAnswer();
					case 5: return C6R5.getAnswer();
					
					default: return "null";
				}
				
			default: return "null";
		}
	}

	public String getQuestion(int Q) {
		switch (Q) {
			case 1:		return finalQuestion1.getQuestion();
			case 2:		return finalQuestion2.getQuestion();
			case 3:		return finalQuestion3.getQuestion();
			case 4:		return finalQuestion4.getQuestion();
			case 5:		return finalQuestion5.getQuestion();
			
			default:	return "null";
		}
	}
	
	public void setCurrentQuestion(int C, int R) {currentQuestion = getQuestionObj(C, R);}
	public void setCurrentQuestion(int Q) {currentFinalQuestion = getQuestionObj(Q);}
	
	public String getCurrentQuestionId() {return currentQuestion.getCachedId();}
	public int getAnswerWorth() {return currentQuestion.getWorth();}
	public boolean isPictureQuestion() {
		if (currentQuestion == null) return false;
		return currentQuestion.isPictureQuestion();
	}
	public String getQuestionPictureUrl() {
		if (!currentQuestion.getQuestionPictureUrl().startsWith("\\")) {return currentQuestion.getQuestionPictureUrl();}
		else {return System.getProperty("user.dir") + currentQuestion.getQuestionPictureUrl();}
	}
	public String getAnswerPictureUrl() {
		if (!currentQuestion.getAnswerPictureUrl().startsWith("\\")) {return currentQuestion.getAnswerPictureUrl();}
		else {return System.getProperty("user.dir") + currentQuestion.getAnswerPictureUrl();}
	}
	
	public void setCurrentTurnFinalPlayerNumber(int currentPlayerTurn) {this.currentPlayerTurn = currentPlayerTurn;}
	public int getCurrentTurnFinalPlayerNumber() {return currentPlayerTurn;}
	
 	public void setSavedAnswer(String answerToSave) {
		switch (getCurrentTurnFinalPlayerNumber()) {
			case 1:		savedAnswers1[getCurrentFinalQuestionId() - 1] = answerToSave;	return;
			case 2:		savedAnswers2[getCurrentFinalQuestionId() - 1] = answerToSave;	return;
				
			default:	return;
		}
	}
	public String getSavedAnswer(int playerNumber, int question) {
		switch (playerNumber) {
			case 1:		return savedAnswers1[question - 1];
			case 2:		return savedAnswers2[question - 1];
				
			default:	return "null";
		}
	}
	
	public void setAnswerRevealed() {revealedAnswers[getCurrentFinalQuestionId() - 1] = true;}
	public void setWorthRevealed() {revealedWorths[getCurrentFinalQuestionId() - 1] = true;}
	public boolean isAnswerRevealed() {return revealedAnswers[getCurrentFinalQuestionId() - 1];}
	public boolean isWorthRevealed() {return revealedWorths[getCurrentFinalQuestionId() - 1];}
	
	public ArrayList<String> getFinalAnswers(int questionNumber) {
		String[] finalAnswers = new String[0];
		
		switch (questionNumber) {
			case 1:		finalAnswers = finalQuestion1.getAnswers();	break;
			case 2:		finalAnswers = finalQuestion2.getAnswers();	break;
			case 3:		finalAnswers = finalQuestion3.getAnswers();	break;
			case 4:		finalAnswers = finalQuestion4.getAnswers();	break;
			case 5:		finalAnswers = finalQuestion5.getAnswers();	break;
		}
		
		return new ArrayList<String>(Arrays.asList(finalAnswers));
	}
	public int getFinalAnswerWorth(int questionNumber, String answer) {
		FinalQuestion questionObj;
		switch (questionNumber) {
			case 1:		questionObj = finalQuestion1;	break;
			case 2:		questionObj = finalQuestion2;	break;
			case 3:		questionObj = finalQuestion3;	break;
			case 4:		questionObj = finalQuestion4;	break;
			case 5:		questionObj = finalQuestion5;	break;
			
			default: 	return 0;
		}
		
		String[] answers = questionObj.getAnswers();
		
		for (int i = 0; i < answers.length; i++) {
			if (answers[i].equals(answer)) {return questionObj.getAnswersWorth()[i];}
		}
		
		return 0;
	}
	
	public TiebreakerQuestion nextTiebreakerQuestion() {
		currentTiebreakerQuestion = tiebreakerQuestions[tiebreakerQuestionIndex];
		tiebreakerQuestionIndex++;
		return currentTiebreakerQuestion;
	}
	
	public void previousFinalQuestion() {
		if (getCurrentFinalQuestionId() <= 1) {return;}
		
		setCurrentQuestion(getCurrentFinalQuestionId() - 1);
	}
	public void nextFinalQuestion() {
		if (isReveal && getCurrentFinalQuestionId() >= 5) {
			setCurrentQuestion(1);
		} else
		if (currentPlayerTurn == 1 && getCurrentFinalQuestionId() >= 5) {
			setCurrentTurnFinalPlayerNumber(2);
			setCurrentQuestion(1);
		}else
		if (currentPlayerTurn == 2 && getCurrentFinalQuestionId() >= 5) {
			setCurrentTurnFinalPlayerNumber(1);
			setCurrentQuestion(1);
		} else {setCurrentQuestion(getCurrentFinalQuestionId() + 1);}
	}
	public int getCurrentFinalQuestionId() {
		try {return currentFinalQuestion.getCachedId();}
		catch (Exception e) {return 0;}
	}
	public void setReveal(boolean isReveal) {this.isReveal = isReveal;}
	
	private void resetTiebreakerIndex() {tiebreakerQuestionIndex = 0;}
}
