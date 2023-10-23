package scripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.sql.PreparedStatement;

public class sql {
	
	private Connection connection;
	private Statement statement;

	public sql() {
		connection = null;
	    try {
	    	connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
	    	statement.executeUpdate("CREATE TABLE IF NOT EXISTS Categories (id INTEGER PRIMARY KEY, "
	    			+ "Category_Name TEXT NOT NULL, Question_1_id INTEGER NOT NULL, Question_2_id INTEGER NOT NULL, "
	    			+ "Question_3_id INTEGER NOT NULL, Question_4_id INTEGER NOT NULL, Question_5_id INTEGER NOT NULL);");
	    	
	    	statement.executeUpdate("CREATE TABLE IF NOT EXISTS Questions (id INTEGER PRIMARY KEY, "
	    			+ "Question TEXT NOT NULL, Answer TEXT NOT NULL, Worth INTEGER NOT NULL, "
	    			+ "Is_Picture_Question BOOLEAN NOT NULL, Question_Picture_URL TEXT NOT NULL, Answer_Picture_URL TEXT NOT NULL);");
	    	
	    	statement.executeUpdate("CREATE TABLE IF NOT EXISTS Tiebreaker_Questions (id INTEGER PRIMARY KEY, "
	    			+ "Question TEXT NOT NULL, Answer TEXT NOT NULL);");
	    	
	    	statement.executeUpdate("CREATE TABLE IF NOT EXISTS Final_Categories (id INTEGER PRIMARY KEY, "
	    			+ "Category_Name TEXT NOT NULL, Question_1_id INTEGER NOT NULL, Question_2_id INTEGER NOT NULL, "
	    			+ "Question_3_id INTEGER NOT NULL, Question_4_id INTEGER NOT NULL, Question_5_id INTEGER NOT NULL);");
	    	
	    	statement.executeUpdate("CREATE TABLE IF NOT EXISTS Final_Questions (id INTEGER PRIMARY KEY, "
	    			+ "Question TEXT NOT NULL, Answer_List TEXT NOT NULL, Worth_List TEXT NOT NULL);");
	    } catch(SQLException e) {
	    	System.err.println(e.getMessage());
	    } finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	
	public String[][] getCategories() {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
			ResultSet rs = statement.executeQuery("SELECT id,Category_Name FROM Categories;");
		
			ArrayList<String[]> categories = new ArrayList<String[]>();
			while (rs.next()) {
				String[] temp = new String[2];
				
				temp[0] = Integer.toString(rs.getInt("id"));
				temp[1] = rs.getString("Category_Name");
				
				categories.add(temp);
			}

			String[][] categoriesArray = new String[categories.size()][2];
			for (int i = 0; i < categories.size(); i++) {
				categoriesArray[i] = categories.get(i);
			}
			
			return categoriesArray;
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return null;
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public String[][] getFinalCategories() {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
			ResultSet rs = statement.executeQuery("SELECT id,Category_Name FROM Final_Categories;");
		
			ArrayList<String[]> categories = new ArrayList<String[]>();
			while (rs.next()) {
				String[] temp = new String[2];
				
				temp[0] = Integer.toString(rs.getInt("id"));
				temp[1] = rs.getString("Category_Name");
				
				categories.add(temp);
			}

			String[][] categoriesArray = new String[categories.size()][2];
			for (int i = 0; i < categories.size(); i++) {
				categoriesArray[i] = categories.get(i);
			}
			
			return categoriesArray;
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return null;
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	
	public int[] getQuestionIds(int categoryId) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
			PreparedStatement stmt = connection.prepareStatement("SELECT Question_1_id,Question_2_id,Question_3_id,Question_4_id,Question_5_id "
					+ "FROM Categories WHERE id=?;");
			
			stmt.setInt(1, categoryId);
			ResultSet rs = stmt.executeQuery();
			
			int[] ids = new int[5];
			
			rs.next();
			ids[0] = rs.getInt("Question_1_id");
			ids[1] = rs.getInt("Question_2_id");
			ids[2] = rs.getInt("Question_3_id");
			ids[3] = rs.getInt("Question_4_id");
			ids[4] = rs.getInt("Question_5_id");
			
			return ids;
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return null;
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public int[] getQuestionIds(String categoryName) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
			PreparedStatement stmt = connection.prepareStatement("SELECT Question_1_id,Question_2_id,Question_3_id,Question_4_id,Question_5_id "
					+ "FROM Categories WHERE Category_Name=?;");
			
			stmt.setString(1, categoryName);
			ResultSet rs = stmt.executeQuery();
			
			int[] ids = new int[5];
			
			rs.next();
			ids[0] = rs.getInt("Question_1_id");
			ids[1] = rs.getInt("Question_2_id");
			ids[2] = rs.getInt("Question_3_id");
			ids[3] = rs.getInt("Question_4_id");
			ids[4] = rs.getInt("Question_5_id");
			
			return ids;
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return null;
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	
	public int[] getFinalQuestionIds(int categoryId) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
			PreparedStatement stmt = connection.prepareStatement("SELECT Question_1_id,Question_2_id,Question_3_id,Question_4_id,Question_5_id "
					+ "FROM Final_Categories WHERE id=?;");
			
			stmt.setInt(1, categoryId);
			ResultSet rs = stmt.executeQuery();
			
			int[] ids = new int[5];
			
			rs.next();
			ids[0] = rs.getInt("Question_1_id");
			ids[1] = rs.getInt("Question_2_id");
			ids[2] = rs.getInt("Question_3_id");
			ids[3] = rs.getInt("Question_4_id");
			ids[4] = rs.getInt("Question_5_id");
			
			return ids;
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return null;
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public int[] getFinalQuestionIds(String categoryName) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
			PreparedStatement stmt = connection.prepareStatement("SELECT Question_1_id,Question_2_id,Question_3_id,Question_4_id,Question_5_id "
					+ "FROM Final_Categories WHERE Category_Name=?;");
			
			stmt.setString(1, categoryName);
			ResultSet rs = stmt.executeQuery();
			
			int[] ids = new int[5];
			
			rs.next();
			ids[0] = rs.getInt("Question_1_id");
			ids[1] = rs.getInt("Question_2_id");
			ids[2] = rs.getInt("Question_3_id");
			ids[3] = rs.getInt("Question_4_id");
			ids[4] = rs.getInt("Question_5_id");
			
			return ids;
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return null;
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	
	public String getCategoryName(int categoryId) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
			PreparedStatement stmt = connection.prepareStatement("SELECT Category_Name FROM Categories WHERE id=?;");
			
			stmt.setInt(1, categoryId);
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			return rs.getString("Category_Name");
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return "Category";
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public String getQuestion(int questionId) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
	    	PreparedStatement stmt = connection.prepareStatement("SELECT Question FROM Questions WHERE id=?;");
			
			stmt.setInt(1, questionId);
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			return rs.getString("Question");
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return "Question";
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public String getAnswer(int questionId) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
	    	PreparedStatement stmt = connection.prepareStatement("SELECT Answer FROM Questions WHERE id=?;");
			
			stmt.setInt(1, questionId);
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			return rs.getString("Answer");
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return "Answer";
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public int getWorth(int questionId) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
	    	PreparedStatement stmt = connection.prepareStatement("SELECT Worth FROM Questions WHERE id=?;");
			
			stmt.setInt(1, questionId);
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			return rs.getInt("Worth");
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return 0;
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public boolean isPictureQuestion(int questionId) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
	    	PreparedStatement stmt = connection.prepareStatement("SELECT Is_Picture_Question FROM Questions WHERE id=?;");
			
			stmt.setInt(1, questionId);
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			return rs.getBoolean("Is_Picture_Question");
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return false;
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public String getQuestionPictureUrl(int questionId) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
	    	PreparedStatement stmt = connection.prepareStatement("SELECT Question_Picture_URL FROM Questions WHERE id=?;");
			
			stmt.setInt(1, questionId);
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			return rs.getString("Question_Picture_URL");
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return "Question_Picture_URL";
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public String getAnswerPictureUrl(int questionId) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
	    	PreparedStatement stmt = connection.prepareStatement("SELECT Answer_Picture_URL FROM Questions WHERE id=?;");
			
			stmt.setInt(1, questionId);
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			return rs.getString("Answer_Picture_URL");
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return "Answer_Picture_URL";
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	
	public String[][] getTiebreakerQuestions() {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);

			PreparedStatement stmt = connection.prepareStatement("SELECT Question,Answer FROM Tiebreaker_Questions;");
			
			ResultSet rs = stmt.executeQuery();
			
			ArrayList<String[]> tiebreakerQuestionsData = new ArrayList<String[]>();
			while (rs.next()) {
				String[] tiebreakerQuestionData = new String[2];
				
				tiebreakerQuestionData[0] = rs.getString("Question");
				tiebreakerQuestionData[1] = rs.getString("Answer");
				
				tiebreakerQuestionsData.add(tiebreakerQuestionData);
			}
			
			Collections.shuffle(tiebreakerQuestionsData);
			
			String[][] tiebreakerQuestionsDataArray = new String[tiebreakerQuestionsData.size()][];
			for (int i = 0; i < tiebreakerQuestionsData.size(); i++) {
				tiebreakerQuestionsDataArray[i] = tiebreakerQuestionsData.get(i);
			}
			
			return tiebreakerQuestionsDataArray;
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return null;
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	
//	public String getFinalCategoryName(int categoryId) {
//		try {
//			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
//	    	statement = connection.createStatement();
//	    	statement.setQueryTimeout(30);
//	    	
//			PreparedStatement stmt = connection.prepareStatement("SELECT Category_Name FROM Final_Categories WHERE id=?;");
//			
//			stmt.setInt(1, categoryId);
//			ResultSet rs = stmt.executeQuery();
//			
//			rs.next();
//			return rs.getString("Category_Name");
//		} catch (SQLException e) {
//	    	System.err.println(e.getMessage());
//	    	return "Category";
//		} finally {
//	    	try {
//	    		if(connection != null)
//	    			connection.close();
//	    	} catch(SQLException e) {
//	    		System.err.println(e.getMessage());
//	    	}
//	    }
//	}
	public String getFinalQuestion(int questionId) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
	    	PreparedStatement stmt = connection.prepareStatement("SELECT Question FROM Final_Questions WHERE id=?;");
			
			stmt.setInt(1, questionId);
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			return rs.getString("Question");
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return "Question";
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public String[] getFinalAnswers(int questionId) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
	    	PreparedStatement stmt = connection.prepareStatement("SELECT Answer_List FROM Final_Questions WHERE id=?;");
			
			stmt.setInt(1, questionId);
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			String strAnswerList = rs.getString("Answer_List");
			
			return strAnswerList.split(",");
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return new String[0];
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public int[] getFinalAnswersWorth(int questionId) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
	    	PreparedStatement stmt = connection.prepareStatement("SELECT Worth_List FROM Final_Questions WHERE id=?;");
			
			stmt.setInt(1, questionId);
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
			String strAnswersWorthList = rs.getString("Worth_List");
			String[] strArrAnswersWorthList = strAnswersWorthList.split(",");
			
			int[] answersWorthList = new int[strArrAnswersWorthList.length];
			for (int i = 0; i < strArrAnswersWorthList.length; i++) {
				answersWorthList[i] = Integer.parseInt(strArrAnswersWorthList[i]);
			}
			
			return answersWorthList;
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return new int[0];
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	
	public boolean addNewCategory(
			String categoryName,
			
			String question1,
			String question2,
			String question3,
			String question4,
			String question5,
			
			String answer1,
			String answer2,
			String answer3,
			String answer4,
			String answer5,
			
			boolean isPicture1,
			boolean isPicture2,
			boolean isPicture3,
			boolean isPicture4,
			boolean isPicture5,
			
			String questionPicturePath1,
			String questionPicturePath2,
			String questionPicturePath3,
			String questionPicturePath4,
			String questionPicturePath5,
			
			String answerPicturePath1,
			String answerPicturePath2,
			String answerPicturePath3,
			String answerPicturePath4,
			String answerPicturePath5
			) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
	    	ResultSet rs;
	    	
	    	PreparedStatement stmtCheckUniqueCategoryName = connection.prepareStatement("SELECT 1 FROM Categories WHERE Category_Name=?;");
	    	
	    	stmtCheckUniqueCategoryName.setString(1, categoryName);
	    	
	    	rs = stmtCheckUniqueCategoryName.executeQuery();
	    	if(rs.next()) {return false;}
	    	
	    	PreparedStatement stmtQuestion = connection.prepareStatement("INSERT INTO Questions Values (?,?,?,1,?,?,?);");
	    	PreparedStatement stmtCheckLastQuestionId = connection.prepareStatement("SELECT id FROM Questions ORDER BY id DESC LIMIT 1;");
	    	
	    	stmtQuestion.setString(2, question1);
	    	stmtQuestion.setString(3, answer1);
	    	stmtQuestion.setBoolean(4, isPicture1);
	    	stmtQuestion.setString(5, questionPicturePath1);
	    	stmtQuestion.setString(6, answerPicturePath1);
	    	stmtQuestion.executeUpdate();
	    	
	    	rs = stmtCheckLastQuestionId.executeQuery();
	    	rs.next();
	    	
	    	int questionId1 = rs.getInt("id");
	    	
	    	stmtQuestion = connection.prepareStatement("INSERT INTO Questions Values (?,?,?,2,?,?,?);");
	    	
	    	stmtQuestion.setString(2, question2);
	    	stmtQuestion.setString(3, answer2);
	    	stmtQuestion.setBoolean(4, isPicture2);
	    	stmtQuestion.setString(5, questionPicturePath2);
	    	stmtQuestion.setString(6, answerPicturePath2);
	    	stmtQuestion.executeUpdate();
	    	
	    	rs = stmtCheckLastQuestionId.executeQuery();
	    	rs.next();
	    	
	    	int questionId2 = rs.getInt("id");
	    	
	    	stmtQuestion = connection.prepareStatement("INSERT INTO Questions Values (?,?,?,3,?,?,?);");
	    	
	    	stmtQuestion.setString(2, question3);
	    	stmtQuestion.setString(3, answer3);
	    	stmtQuestion.setBoolean(4, isPicture3);
	    	stmtQuestion.setString(5, questionPicturePath3);
	    	stmtQuestion.setString(6, answerPicturePath3);
	    	stmtQuestion.executeUpdate();
	    	
	    	rs = stmtCheckLastQuestionId.executeQuery();
	    	rs.next();
	    	
	    	int questionId3 = rs.getInt("id");
	    	
	    	stmtQuestion = connection.prepareStatement("INSERT INTO Questions Values (?,?,?,4,?,?,?);");
	    	
	    	stmtQuestion.setString(2, question4);
	    	stmtQuestion.setString(3, answer4);
	    	stmtQuestion.setBoolean(4, isPicture4);
	    	stmtQuestion.setString(5, questionPicturePath4);
	    	stmtQuestion.setString(6, answerPicturePath4);
	    	stmtQuestion.executeUpdate();
	    	
	    	rs = stmtCheckLastQuestionId.executeQuery();
	    	rs.next();
	    	
	    	int questionId4 = rs.getInt("id");
	    	
	    	stmtQuestion = connection.prepareStatement("INSERT INTO Questions Values (?,?,?,5,?,?,?);");
	    	
	    	stmtQuestion.setString(2, question5);
	    	stmtQuestion.setString(3, answer5);
	    	stmtQuestion.setBoolean(4, isPicture5);
	    	stmtQuestion.setString(5, questionPicturePath5);
	    	stmtQuestion.setString(6, answerPicturePath5);
	    	stmtQuestion.executeUpdate();
	    	
	    	rs = stmtCheckLastQuestionId.executeQuery();
	    	rs.next();
	    	
	    	int questionId5 = rs.getInt("id");
	    	
	    	
	    	PreparedStatement stmtCategory = connection.prepareStatement("INSERT INTO Categories Values (?,?,?,?,?,?,?);");
	    	
	    	stmtCategory.setString(2, categoryName);
	    	stmtCategory.setInt(3, questionId1);
	    	stmtCategory.setInt(4, questionId2);
	    	stmtCategory.setInt(5, questionId3);
	    	stmtCategory.setInt(6, questionId4);
	    	stmtCategory.setInt(7, questionId5);
	    	stmtCategory.executeUpdate();
	    	
	    	return true;
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return false;
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public boolean addNewTiebreakerQuestion(String question, String answer) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	

	    	PreparedStatement stmt = connection.prepareStatement("INSERT INTO Tiebreaker_Questions Values (?,?,?);");
	    	
	    	stmt.setString(2, question);
	    	stmt.setString(3, answer);
	    	stmt.executeUpdate();
	    	
	    	return true;
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return false;
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
	public boolean addNewFinalCategory(
			String categoryName,
			
			String question1,
			String question2,
			String question3,
			String question4,
			String question5,
			
			String answers1,
			String answers2,
			String answers3,
			String answers4,
			String answers5,
			
			String answersWorth1,
			String answersWorth2,
			String answersWorth3,
			String answersWorth4,
			String answersWorth5
			) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:JeopardyDB.db");
	    	statement = connection.createStatement();
	    	statement.setQueryTimeout(30);
	    	
	    	ResultSet rs;
	    	
	    	PreparedStatement stmtCheckUniqueCategoryName = connection.prepareStatement("SELECT 1 FROM Final_Categories WHERE Category_Name=?;");
	    	
	    	stmtCheckUniqueCategoryName.setString(1, categoryName);
	    	
	    	rs = stmtCheckUniqueCategoryName.executeQuery();
	    	if(rs.next()) {return false;}
	    	
	    	PreparedStatement stmtQuestion = connection.prepareStatement("INSERT INTO Final_Questions Values (?,?,?,?);");
	    	PreparedStatement stmtCheckLastQuestionId = connection.prepareStatement("SELECT id FROM Final_Questions ORDER BY id DESC LIMIT 1;");
	    	
	    	stmtQuestion.setString(2, question1);
	    	stmtQuestion.setString(3, answers1);
	    	stmtQuestion.setString(4, answersWorth1);
	    	stmtQuestion.executeUpdate();
	    	
	    	rs = stmtCheckLastQuestionId.executeQuery();
	    	rs.next();
	    	
	    	int questionId1 = rs.getInt("id");
	    	
	    	stmtQuestion.setString(2, question2);
	    	stmtQuestion.setString(3, answers2);
	    	stmtQuestion.setString(4, answersWorth2);
	    	stmtQuestion.executeUpdate();
	    	
	    	rs = stmtCheckLastQuestionId.executeQuery();
	    	rs.next();
	    	
	    	int questionId2 = rs.getInt("id");
	    	
	    	stmtQuestion.setString(2, question3);
	    	stmtQuestion.setString(3, answers3);
	    	stmtQuestion.setString(4, answersWorth3);
	    	stmtQuestion.executeUpdate();
	    	
	    	rs = stmtCheckLastQuestionId.executeQuery();
	    	rs.next();
	    	
	    	int questionId3 = rs.getInt("id");
	    	
	    	stmtQuestion.setString(2, question4);
	    	stmtQuestion.setString(3, answers4);
	    	stmtQuestion.setString(4, answersWorth4);
	    	stmtQuestion.executeUpdate();
	    	
	    	rs = stmtCheckLastQuestionId.executeQuery();
	    	rs.next();
	    	
	    	int questionId4 = rs.getInt("id");
	    	
	    	stmtQuestion.setString(2, question5);
	    	stmtQuestion.setString(3, answers5);
	    	stmtQuestion.setString(4, answersWorth5);
	    	stmtQuestion.executeUpdate();
	    	
	    	rs = stmtCheckLastQuestionId.executeQuery();
	    	rs.next();
	    	
	    	int questionId5 = rs.getInt("id");
	    	
	    	
	    	PreparedStatement stmtCategory = connection.prepareStatement("INSERT INTO Final_Categories Values (?,?,?,?,?,?,?);");
	    	
	    	stmtCategory.setString(2, categoryName);
	    	stmtCategory.setInt(3, questionId1);
	    	stmtCategory.setInt(4, questionId2);
	    	stmtCategory.setInt(5, questionId3);
	    	stmtCategory.setInt(6, questionId4);
	    	stmtCategory.setInt(7, questionId5);
	    	stmtCategory.executeUpdate();
	    	
	    	return true;
		} catch (SQLException e) {
	    	System.err.println(e.getMessage());
	    	return false;
		} finally {
	    	try {
	    		if(connection != null)
	    			connection.close();
	    	} catch(SQLException e) {
	    		System.err.println(e.getMessage());
	    	}
	    }
	}
}
