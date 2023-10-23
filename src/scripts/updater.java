package scripts;

public class updater {
	
	private boolean menuState;
	private boolean menuQuestionSelectorState;
	private boolean menuPlayerCountState;
	private boolean menuPlayerNameState;
	private boolean gameState;
	private boolean questionState;
	private boolean answerState;
	private boolean tiebreakerQuestionState;
	private boolean tiebreakerAnswerState;
	private boolean finalMenuState;
	private boolean finalRevealState;
	private boolean resultsState;
	private boolean editorMenuState;
	private boolean editorAddQuestionState;
	private boolean editorAddTiebreakerQuestionState;
	private boolean editorAddFinalCategoryState;
	
	public updater() {
		menuState = false;
		menuQuestionSelectorState = false;
		menuPlayerCountState = false;
		menuPlayerNameState = false;
		gameState = false;
		questionState = false;
		answerState = false;
		tiebreakerQuestionState = false;
		tiebreakerAnswerState = false;
		finalMenuState = false;
		finalRevealState = false;
		resultsState = false;
		editorMenuState = false;
		editorAddQuestionState = false;
		editorAddTiebreakerQuestionState = false;
		editorAddFinalCategoryState = false;
	}
	
	public void show(String element) {
		menuState = false;
		menuQuestionSelectorState = false;
		menuPlayerCountState = false;
		menuPlayerNameState = false;
		gameState = false;
		questionState = false;
		answerState = false;
		tiebreakerQuestionState = false;
		tiebreakerAnswerState = false;
		finalMenuState = false;
		finalRevealState = false;
		resultsState = false;
		editorMenuState = false;
		editorAddQuestionState = false;
		editorAddTiebreakerQuestionState = false;
		editorAddFinalCategoryState = false;
		
		switch (element) {
			case "Menu": 						menuState = true; 							break;
			case "QuestionSelector":			menuQuestionSelectorState = true;			break;
			case "PlayerCount": 				menuPlayerCountState = true; 				break;
			case "PlayerNames": 				menuPlayerNameState = true; 				break;
			case "Game": 						gameState = true; 							break;
			case "Question": 					questionState = true; 						break;
			case "Answer": 						answerState = true; 						break;
			case "TiebreakerQuestion":			tiebreakerQuestionState = true;				break;
			case "TiebreakerAnswer":			tiebreakerAnswerState = true;				break;
			case "FinalMenu":					finalMenuState = true;						break;
			case "FinalReveal":					finalRevealState = true;					break;
			case "Results":						resultsState = true;						break;
			case "EditorMenu": 					editorMenuState = true; 					break;
			case "EditorAddQuestion": 			editorAddQuestionState = true; 				break;
			case "EditorAddTiebreakerQuestion":	editorAddTiebreakerQuestionState = true;	break;
			case "EditorAddFinalCategory": 		editorAddFinalCategoryState = true; 		break;
		}
	}
	public boolean getState(String element) {
		switch (element) {
			case "Menu": 						return menuState;
			case "QuestionSelector":			return menuQuestionSelectorState;
			case "PlayerCount": 				return menuPlayerCountState;
			case "PlayerNames": 				return menuPlayerNameState;
			case "Game": 						return gameState;
			case "Question": 					return questionState;
			case "Answer": 						return answerState;
			case "TiebreakerQuestion":			return tiebreakerQuestionState;
			case "TiebreakerAnswer":			return tiebreakerAnswerState;
			case "FinalMenu":					return finalMenuState;
			case "FinalReveal":					return finalRevealState;
			case "Results":						return resultsState;
			case "EditorMenu": 					return editorMenuState;
			case "EditorAddQuestion": 			return editorAddQuestionState;
			case "EditorAddTiebreakerQuestion":	return editorAddTiebreakerQuestionState;
			case "EditorAddFinalCategory": 		return editorAddFinalCategoryState;
			
			default: 							return false;
		}
	}
}
