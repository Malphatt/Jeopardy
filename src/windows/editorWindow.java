package windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import components.modelPanel;
import components.roundedButton;
import components.roundedTextBox;

public class editorWindow {
	
	public JFrame frame;
	
		public modelPanel menuPanel = new modelPanel();
			public roundedButton buttonAddQuestion = new roundedButton("Add Question");
			public roundedButton buttonAddTiebreakerQuestion = new roundedButton("Add Tiebreaker Question");
			public roundedButton buttonAddFinalQuestion = new roundedButton("Add Final Question");
			
		public modelPanel addQuestionPanel = new modelPanel();
			public roundedButton buttonBackFromAddQuestion = new roundedButton("Back");
			public roundedButton buttonSubmitAddQuestion = new roundedButton("Submit");
			
			private final JLabel addQuestionCategoryLabel = new JLabel("Category Name:");
			public roundedTextBox addQuestionCategoryTextBox = new roundedTextBox();
			
			private final JLabel addQuestionQuestionsLabel = new JLabel("Questions");
				private final JLabel addQuestionQuestionLabel = new JLabel("Question");
				private final JLabel addQuestionAnswerLabel = new JLabel("Answer");
				private final JLabel addQuestionPictureLabel = new JLabel("Picture Settings");
				private final JLabel addQuestionPicturePathLabel = new JLabel("Picture Path");
				private final JLabel addQuestionPictureAnswerLabel = new JLabel("(Answer Picture)");
				private final JLabel addQuestionPictureAnswerPathLabel = new JLabel("(Picture Answer Path)");
				
				private final JLabel addQuestionWorthLabel1 = new JLabel("1:");
				public roundedTextBox addQuestionQuestionTextBox1 = new roundedTextBox();
				public roundedTextBox addQuestionAnswerTextBox1 = new roundedTextBox();
				public JLabel addQuestionPictureButton1 = new JLabel("❌");
				public roundedButton addQuestionPictureButtonBrowse1 = new roundedButton("Browse");
				public JLabel addQuestionPicturePath1 = new JLabel("");
				public roundedButton addQuestionPictureAnswerButtonBrowse1 = new roundedButton("Browse");
				public JLabel addQuestionPictureAnswerPath1 = new JLabel("");

				private final JLabel addQuestionWorthLabel2 = new JLabel("2:");
				public roundedTextBox addQuestionQuestionTextBox2 = new roundedTextBox();
				public roundedTextBox addQuestionAnswerTextBox2 = new roundedTextBox();
				public JLabel addQuestionPictureButton2 = new JLabel("❌");
				public roundedButton addQuestionPictureButtonBrowse2 = new roundedButton("Browse");
				public JLabel addQuestionPicturePath2 = new JLabel("");
				public roundedButton addQuestionPictureAnswerButtonBrowse2 = new roundedButton("Browse");
				public JLabel addQuestionPictureAnswerPath2 = new JLabel("");

				private final JLabel addQuestionWorthLabel3 = new JLabel("3:");
				public roundedTextBox addQuestionQuestionTextBox3 = new roundedTextBox();
				public roundedTextBox addQuestionAnswerTextBox3 = new roundedTextBox();
				public JLabel addQuestionPictureButton3 = new JLabel("❌");
				public roundedButton addQuestionPictureButtonBrowse3 = new roundedButton("Browse");
				public JLabel addQuestionPicturePath3 = new JLabel("");
				public roundedButton addQuestionPictureAnswerButtonBrowse3 = new roundedButton("Browse");
				public JLabel addQuestionPictureAnswerPath3 = new JLabel("");

				private final JLabel addQuestionWorthLabel4 = new JLabel("4:");
				public roundedTextBox addQuestionQuestionTextBox4 = new roundedTextBox();
				public roundedTextBox addQuestionAnswerTextBox4 = new roundedTextBox();
				public JLabel addQuestionPictureButton4 = new JLabel("❌");
				public roundedButton addQuestionPictureButtonBrowse4 = new roundedButton("Browse");
				public JLabel addQuestionPicturePath4 = new JLabel("");
				public roundedButton addQuestionPictureAnswerButtonBrowse4 = new roundedButton("Browse");
				public JLabel addQuestionPictureAnswerPath4 = new JLabel("");

				private final JLabel addQuestionWorthLabel5 = new JLabel("5:");
				public roundedTextBox addQuestionQuestionTextBox5 = new roundedTextBox();
				public roundedTextBox addQuestionAnswerTextBox5 = new roundedTextBox();
				public JLabel addQuestionPictureButton5 = new JLabel("❌");
				public roundedButton addQuestionPictureButtonBrowse5 = new roundedButton("Browse");
				public JLabel addQuestionPicturePath5 = new JLabel("");
				public roundedButton addQuestionPictureAnswerButtonBrowse5 = new roundedButton("Browse");
				public JLabel addQuestionPictureAnswerPath5 = new JLabel("");
				
		public modelPanel addTiebreakerQuestionPanel = new modelPanel();
			public roundedButton buttonBackFromAddTiebreakerQuestion = new roundedButton("Back");
			public roundedButton buttonSubmitAddTiebreakerQuestion = new roundedButton("Submit");

			private final JLabel addTiebreakerLabel = new JLabel("Add Tiebreaker Question");
			
			private final JLabel addTiebreakerQuestionLabel = new JLabel("Question");
			public roundedTextBox addTiebreakerQuestionTextBox = new roundedTextBox();
			private final JLabel addTiebreakerAnswerLabel = new JLabel("Answer");
			public roundedTextBox addTiebreakerAnswerTextBox = new roundedTextBox();
				
		public modelPanel addFinalCategoryPanel = new modelPanel();
			public roundedButton buttonBackFromAddFinalCategory = new roundedButton("Back");
			public roundedButton buttonSubmitAddFinalCategory = new roundedButton("Submit");

			private final JLabel addFinalCategoryLabel = new JLabel("Add Final Category");
				
				String[] noneList = {"None"};
				private JLabel addFinalCategoryNameLabel = new JLabel("Category Name");
				public roundedTextBox addFinalCategoryNameTextBox = new roundedTextBox();

				private JLabel addFinalQuestionLabel = new JLabel("Question");
				private JLabel addFinalAnswerLabel = new JLabel("Answer & Worth");
				private JLabel addFinalAnswerEditorLabel = new JLabel("Answer Editor");
				
				public roundedTextBox addFinalQuestionTextBox1 = new roundedTextBox();
				private roundedTextBox addFinalAnswerTextBox1 = new roundedTextBox();
				private roundedTextBox addFinalAnswerWorthTextBox1 = new roundedTextBox();
				public roundedButton addFinalQuestionButtonAddAnswer1 = new roundedButton("Add");
				private JComboBox<?> addFinalQuestionAnswersComboBox1 = new JComboBox<Object>(noneList);
				private JLabel finalCategoryAnswersWorthTotalTitleLabel1 = new JLabel("Total:");
				private JLabel finalCategoryAnswersWorthTotalLabel1 = new JLabel("0");
				public roundedButton addFinalQuestionButtonRemoveAnswer1 = new roundedButton("Remove");
				public roundedButton addFinalQuestionButtonClearAnswers1 = new roundedButton("Clear");
				
				public roundedTextBox addFinalQuestionTextBox2 = new roundedTextBox();
				private roundedTextBox addFinalAnswerTextBox2 = new roundedTextBox();
				private roundedTextBox addFinalAnswerWorthTextBox2 = new roundedTextBox();
				public roundedButton addFinalQuestionButtonAddAnswer2 = new roundedButton("Add");
				private JComboBox<?> addFinalQuestionAnswersComboBox2 = new JComboBox<Object>(noneList);
				private JLabel finalCategoryAnswersWorthTotalTitleLabel2 = new JLabel("Total:");
				private JLabel finalCategoryAnswersWorthTotalLabel2 = new JLabel("0");
				public roundedButton addFinalQuestionButtonRemoveAnswer2 = new roundedButton("Remove");
				public roundedButton addFinalQuestionButtonClearAnswers2 = new roundedButton("Clear");
				
				public roundedTextBox addFinalQuestionTextBox3 = new roundedTextBox();
				private roundedTextBox addFinalAnswerTextBox3 = new roundedTextBox();
				private roundedTextBox addFinalAnswerWorthTextBox3 = new roundedTextBox();
				public roundedButton addFinalQuestionButtonAddAnswer3 = new roundedButton("Add");
				private JComboBox<?> addFinalQuestionAnswersComboBox3 = new JComboBox<Object>(noneList);
				private JLabel finalCategoryAnswersWorthTotalTitleLabel3 = new JLabel("Total:");
				private JLabel finalCategoryAnswersWorthTotalLabel3 = new JLabel("0");
				public roundedButton addFinalQuestionButtonRemoveAnswer3 = new roundedButton("Remove");
				public roundedButton addFinalQuestionButtonClearAnswers3 = new roundedButton("Clear");
				
				public roundedTextBox addFinalQuestionTextBox4 = new roundedTextBox();
				private roundedTextBox addFinalAnswerTextBox4 = new roundedTextBox();
				private roundedTextBox addFinalAnswerWorthTextBox4 = new roundedTextBox();
				public roundedButton addFinalQuestionButtonAddAnswer4 = new roundedButton("Add");
				private JComboBox<?> addFinalQuestionAnswersComboBox4 = new JComboBox<Object>(noneList);
				private JLabel finalCategoryAnswersWorthTotalTitleLabel4 = new JLabel("Total:");
				private JLabel finalCategoryAnswersWorthTotalLabel4 = new JLabel("0");
				public roundedButton addFinalQuestionButtonRemoveAnswer4 = new roundedButton("Remove");
				public roundedButton addFinalQuestionButtonClearAnswers4 = new roundedButton("Clear");
				
				public roundedTextBox addFinalQuestionTextBox5 = new roundedTextBox();
				private roundedTextBox addFinalAnswerTextBox5 = new roundedTextBox();
				private roundedTextBox addFinalAnswerWorthTextBox5 = new roundedTextBox();
				public roundedButton addFinalQuestionButtonAddAnswer5 = new roundedButton("Add");
				private JComboBox<?> addFinalQuestionAnswersComboBox5 = new JComboBox<Object>(noneList);
				private JLabel finalCategoryAnswersWorthTotalTitleLabel5 = new JLabel("Total:");
				private JLabel finalCategoryAnswersWorthTotalLabel5 = new JLabel("0");
				public roundedButton addFinalQuestionButtonRemoveAnswer5 = new roundedButton("Remove");
				public roundedButton addFinalQuestionButtonClearAnswers5 = new roundedButton("Clear");
			
			
				private ArrayList<String> finalCategoryAnswers1 = new ArrayList<String>();
				private ArrayList<Integer> finalCategoryAnswersWorth1 = new ArrayList<Integer>();
				private int finalCategoryAnswersWorthTotal1;
				private ArrayList<String> finalCategoryAnswers2 = new ArrayList<String>();
				private ArrayList<Integer> finalCategoryAnswersWorth2 = new ArrayList<Integer>();
				private int finalCategoryAnswersWorthTotal2;
				private ArrayList<String> finalCategoryAnswers3 = new ArrayList<String>();
				private ArrayList<Integer> finalCategoryAnswersWorth3 = new ArrayList<Integer>();
				private int finalCategoryAnswersWorthTotal3;
				private ArrayList<String> finalCategoryAnswers4 = new ArrayList<String>();
				private ArrayList<Integer> finalCategoryAnswersWorth4 = new ArrayList<Integer>();
				private int finalCategoryAnswersWorthTotal4;
				private ArrayList<String> finalCategoryAnswers5 = new ArrayList<String>();
				private ArrayList<Integer> finalCategoryAnswersWorth5 = new ArrayList<Integer>();
				private int finalCategoryAnswersWorthTotal5;

	public editorWindow() {
		frame = new JFrame("JEOPARDY Editor");
		frame.setSize(356, 319);
		frame.setLocation(800, 200);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "\\Assets\\crown.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		initialize();
	}
	
	private void initialize() {
		menuPanel.setBounds(0, 0, 340, 280);
		menuPanel.setLayout(null);
		frame.getContentPane().add(menuPanel);
		
			buttonAddQuestion.setBounds(10, 10, 320, 80);
			buttonAddQuestion.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			buttonAddQuestion.setColor(Color.decode("#e1b173"));
			buttonAddQuestion.setTextColor(Color.decode("#38075d"));
			menuPanel.add(buttonAddQuestion);
		
			buttonAddTiebreakerQuestion.setBounds(10, 100, 320, 80);
			buttonAddTiebreakerQuestion.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			buttonAddTiebreakerQuestion.setColor(Color.decode("#e1b173"));
			buttonAddTiebreakerQuestion.setTextColor(Color.decode("#38075d"));
			menuPanel.add(buttonAddTiebreakerQuestion);

			buttonAddFinalQuestion.setBounds(10, 190, 320, 80);
			buttonAddFinalQuestion.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			buttonAddFinalQuestion.setColor(Color.decode("#e1b173"));
			buttonAddFinalQuestion.setTextColor(Color.decode("#38075d"));
			menuPanel.add(buttonAddFinalQuestion);
			
	//Question Panel
		addQuestionPanel.setBounds(0, 0, 1320, 470);
		addQuestionPanel.setLayout(null);
		frame.getContentPane().add(addQuestionPanel);
		
			buttonBackFromAddQuestion.setBounds(10, 10, 80, 40);
			buttonBackFromAddQuestion.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			buttonBackFromAddQuestion.setColor(Color.decode("#e1b173"));
			buttonBackFromAddQuestion.setTextColor(Color.decode("#38075d"));
			addQuestionPanel.add(buttonBackFromAddQuestion);
		
			buttonSubmitAddQuestion.setBounds(1190, 10, 120, 40);
			buttonSubmitAddQuestion.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			buttonSubmitAddQuestion.setColor(Color.decode("#e1b173"));
			buttonSubmitAddQuestion.setTextColor(Color.decode("#38075d"));
			addQuestionPanel.add(buttonSubmitAddQuestion);
			
			addQuestionCategoryLabel.setBounds(360, 60, 200, 40);
			addQuestionCategoryLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
			addQuestionCategoryLabel.setForeground(Color.decode("#e1b173"));
			addQuestionPanel.add(addQuestionCategoryLabel);
			
			addQuestionCategoryTextBox.setBounds(760, 60, 240, 40);
			addQuestionCategoryTextBox.setHorizontalAlignment(JTextField.LEFT);
			addQuestionCategoryTextBox.setInset(10);
			addQuestionPanel.add(addQuestionCategoryTextBox);
			
				addQuestionQuestionsLabel.setBounds(60, 100, 1220, 40);
				addQuestionQuestionsLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
				addQuestionQuestionsLabel.setHorizontalAlignment(JLabel.CENTER);
				addQuestionQuestionsLabel.setForeground(Color.decode("#e1b173"));
				addQuestionPanel.add(addQuestionQuestionsLabel);
				
				addQuestionWorthLabel1.setBounds(60, 180, 80, 20);
				addQuestionWorthLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				addQuestionWorthLabel1.setForeground(Color.decode("#e1b173"));
				addQuestionPanel.add(addQuestionWorthLabel1);
				
				addQuestionWorthLabel2.setBounds(60, 220, 80, 40);
				addQuestionWorthLabel2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				addQuestionWorthLabel2.setForeground(Color.decode("#e1b173"));
				addQuestionPanel.add(addQuestionWorthLabel2);
				
				addQuestionWorthLabel3.setBounds(60, 270, 80, 40);
				addQuestionWorthLabel3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				addQuestionWorthLabel3.setForeground(Color.decode("#e1b173"));
				addQuestionPanel.add(addQuestionWorthLabel3);

				addQuestionWorthLabel4.setBounds(60, 320, 80, 40);
				addQuestionWorthLabel4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				addQuestionWorthLabel4.setForeground(Color.decode("#e1b173"));
				addQuestionPanel.add(addQuestionWorthLabel4);

				addQuestionWorthLabel5.setBounds(60, 370, 80, 40);
				addQuestionWorthLabel5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				addQuestionWorthLabel5.setForeground(Color.decode("#e1b173"));
				addQuestionPanel.add(addQuestionWorthLabel5);
					
				
				addQuestionQuestionLabel.setBounds(90, 140, 220, 20);
				addQuestionQuestionLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				addQuestionQuestionLabel.setHorizontalAlignment(JLabel.CENTER);
				addQuestionQuestionLabel.setForeground(Color.decode("#e1b173"));
				addQuestionPanel.add(addQuestionQuestionLabel);
			
					addQuestionQuestionTextBox1.setBounds(90, 170, 220, 40);
					addQuestionQuestionTextBox1.setHorizontalAlignment(JTextField.LEFT);
					addQuestionQuestionTextBox1.setInset(10);
					addQuestionPanel.add(addQuestionQuestionTextBox1);
					
					addQuestionQuestionTextBox2.setBounds(90, 220, 220, 40);
					addQuestionQuestionTextBox2.setHorizontalAlignment(JTextField.LEFT);
					addQuestionQuestionTextBox2.setInset(10);
					addQuestionPanel.add(addQuestionQuestionTextBox2);

					addQuestionQuestionTextBox3.setBounds(90, 270, 220, 40);
					addQuestionQuestionTextBox3.setHorizontalAlignment(JTextField.LEFT);
					addQuestionQuestionTextBox3.setInset(10);
					addQuestionPanel.add(addQuestionQuestionTextBox3);

					addQuestionQuestionTextBox4.setBounds(90, 320, 220, 40);
					addQuestionQuestionTextBox4.setHorizontalAlignment(JTextField.LEFT);
					addQuestionQuestionTextBox4.setInset(10);
					addQuestionPanel.add(addQuestionQuestionTextBox4);

					addQuestionQuestionTextBox5.setBounds(90, 370, 220, 40);
					addQuestionQuestionTextBox5.setHorizontalAlignment(JTextField.LEFT);
					addQuestionQuestionTextBox5.setInset(10);
					addQuestionPanel.add(addQuestionQuestionTextBox5);
				
					
				addQuestionAnswerLabel.setBounds(320, 140, 220, 20);
				addQuestionAnswerLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				addQuestionAnswerLabel.setHorizontalAlignment(JLabel.CENTER);
				addQuestionAnswerLabel.setForeground(Color.decode("#e1b173"));
				addQuestionPanel.add(addQuestionAnswerLabel);
				
					addQuestionAnswerTextBox1.setBounds(320, 170, 220, 40);
					addQuestionAnswerTextBox1.setHorizontalAlignment(JTextField.LEFT);
					addQuestionAnswerTextBox1.setInset(10);
					addQuestionPanel.add(addQuestionAnswerTextBox1);
				
					addQuestionAnswerTextBox2.setBounds(320, 220, 220, 40);
					addQuestionAnswerTextBox2.setHorizontalAlignment(JTextField.LEFT);
					addQuestionAnswerTextBox2.setInset(10);
					addQuestionPanel.add(addQuestionAnswerTextBox2);
				
					addQuestionAnswerTextBox3.setBounds(320, 270, 220, 40);
					addQuestionAnswerTextBox3.setHorizontalAlignment(JTextField.LEFT);
					addQuestionAnswerTextBox3.setInset(10);
					addQuestionPanel.add(addQuestionAnswerTextBox3);
					
					addQuestionAnswerTextBox4.setBounds(320, 320, 220, 40);
					addQuestionAnswerTextBox4.setHorizontalAlignment(JTextField.LEFT);
					addQuestionAnswerTextBox4.setInset(10);
					addQuestionPanel.add(addQuestionAnswerTextBox4);
				
					addQuestionAnswerTextBox5.setBounds(320, 370, 220, 40);
					addQuestionAnswerTextBox5.setHorizontalAlignment(JTextField.LEFT);
					addQuestionAnswerTextBox5.setInset(10);
					addQuestionPanel.add(addQuestionAnswerTextBox5);
					
				
				addQuestionPictureLabel.setBounds(550, 140, 170, 20);
				addQuestionPictureLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				addQuestionPictureLabel.setHorizontalAlignment(JLabel.CENTER);
				addQuestionPictureLabel.setForeground(Color.decode("#e1b173"));
				addQuestionPanel.add(addQuestionPictureLabel);
					
					addQuestionPictureButton1.setBounds(550, 170, 60, 40);
					addQuestionPictureButton1.setFont(new Font("Segoe UI Emoji", Font.BOLD, 15));
					addQuestionPictureButton1.setHorizontalAlignment(JLabel.CENTER);
					addQuestionPictureButton1.setVerticalAlignment(JLabel.CENTER);
					addQuestionPictureButton1.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPictureButton1);
					
						addQuestionPictureButtonBrowse1.setBounds(620, 170, 100, 40);
						addQuestionPictureButtonBrowse1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addQuestionPictureButtonBrowse1.setEnabled(false); addQuestionPictureButtonBrowse1.setSelectable(false);
						addQuestionPanel.add(addQuestionPictureButtonBrowse1);
					
					addQuestionPictureButton2.setBounds(550, 220, 60, 40);
					addQuestionPictureButton2.setFont(new Font("Segoe UI Emoji", Font.BOLD, 15));
					addQuestionPictureButton2.setHorizontalAlignment(JLabel.CENTER);
					addQuestionPictureButton2.setVerticalAlignment(JLabel.CENTER);
					addQuestionPictureButton2.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPictureButton2);
					
						addQuestionPictureButtonBrowse2.setBounds(620, 220, 100, 40);
						addQuestionPictureButtonBrowse2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addQuestionPictureButtonBrowse2.setEnabled(false); addQuestionPictureButtonBrowse2.setSelectable(false);
						addQuestionPanel.add(addQuestionPictureButtonBrowse2);
					
					addQuestionPictureButton3.setBounds(550, 270, 60, 40);
					addQuestionPictureButton3.setFont(new Font("Segoe UI Emoji", Font.BOLD, 15));
					addQuestionPictureButton3.setHorizontalAlignment(JLabel.CENTER);
					addQuestionPictureButton3.setVerticalAlignment(JLabel.CENTER);
					addQuestionPictureButton3.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPictureButton3);
					
						addQuestionPictureButtonBrowse3.setBounds(620, 270, 100, 40);
						addQuestionPictureButtonBrowse3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addQuestionPictureButtonBrowse3.setEnabled(false); addQuestionPictureButtonBrowse3.setSelectable(false);
						addQuestionPanel.add(addQuestionPictureButtonBrowse3);
					
					addQuestionPictureButton4.setBounds(550, 320, 60, 40);
					addQuestionPictureButton4.setFont(new Font("Segoe UI Emoji", Font.BOLD, 15));
					addQuestionPictureButton4.setHorizontalAlignment(JLabel.CENTER);
					addQuestionPictureButton4.setVerticalAlignment(JLabel.CENTER);
					addQuestionPictureButton4.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPictureButton4);
					
						addQuestionPictureButtonBrowse4.setBounds(620, 320, 100, 40);
						addQuestionPictureButtonBrowse4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addQuestionPictureButtonBrowse4.setEnabled(false); addQuestionPictureButtonBrowse4.setSelectable(false);
						addQuestionPanel.add(addQuestionPictureButtonBrowse4);
					
					addQuestionPictureButton5.setBounds(550, 370, 60, 40);
					addQuestionPictureButton5.setFont(new Font("Segoe UI Emoji", Font.BOLD, 15));
					addQuestionPictureButton5.setHorizontalAlignment(JLabel.CENTER);
					addQuestionPictureButton5.setVerticalAlignment(JLabel.CENTER);
					addQuestionPictureButton5.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPictureButton5);
					
						addQuestionPictureButtonBrowse5.setBounds(620, 370, 100, 40);
						addQuestionPictureButtonBrowse5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addQuestionPictureButtonBrowse5.setEnabled(false); addQuestionPictureButtonBrowse5.setSelectable(false);
						addQuestionPanel.add(addQuestionPictureButtonBrowse5);
						
				addQuestionPicturePathLabel.setBounds(730, 140, 200, 20);
				addQuestionPicturePathLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				addQuestionPicturePathLabel.setHorizontalAlignment(JLabel.LEFT);
				addQuestionPicturePathLabel.setForeground(Color.decode("#e1b173"));
				addQuestionPanel.add(addQuestionPicturePathLabel);
				
					addQuestionPicturePath1.setBounds(750, 170, 180, 40);
					addQuestionPicturePath1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
					addQuestionPicturePath1.setHorizontalAlignment(JLabel.LEFT);
					addQuestionPicturePath1.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPicturePath1);
				
					addQuestionPicturePath2.setBounds(750, 220, 180, 40);
					addQuestionPicturePath2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
					addQuestionPicturePath2.setHorizontalAlignment(JLabel.LEFT);
					addQuestionPicturePath2.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPicturePath2);
				
					addQuestionPicturePath3.setBounds(750, 270, 180, 40);
					addQuestionPicturePath3.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
					addQuestionPicturePath3.setHorizontalAlignment(JLabel.LEFT);
					addQuestionPicturePath3.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPicturePath3);
				
					addQuestionPicturePath4.setBounds(750, 320, 180, 40);
					addQuestionPicturePath4.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
					addQuestionPicturePath4.setHorizontalAlignment(JLabel.LEFT);
					addQuestionPicturePath4.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPicturePath4);
				
					addQuestionPicturePath5.setBounds(750, 370, 180, 40);
					addQuestionPicturePath5.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
					addQuestionPicturePath5.setHorizontalAlignment(JLabel.LEFT);
					addQuestionPicturePath5.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPicturePath5);
					

				addQuestionPictureAnswerLabel.setBounds(940, 140, 120, 20);
				addQuestionPictureAnswerLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				addQuestionPictureAnswerLabel.setHorizontalAlignment(JLabel.CENTER);
				addQuestionPictureAnswerLabel.setForeground(Color.decode("#e1b173"));
				addQuestionPanel.add(addQuestionPictureAnswerLabel);
				
					addQuestionPictureAnswerButtonBrowse1.setBounds(940, 170, 120, 40);
					addQuestionPictureAnswerButtonBrowse1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
					addQuestionPictureAnswerButtonBrowse1.setEnabled(false); addQuestionPictureAnswerButtonBrowse1.setSelectable(false);
					addQuestionPanel.add(addQuestionPictureAnswerButtonBrowse1);
				
					addQuestionPictureAnswerButtonBrowse2.setBounds(940, 220, 120, 40);
					addQuestionPictureAnswerButtonBrowse2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
					addQuestionPictureAnswerButtonBrowse2.setEnabled(false); addQuestionPictureAnswerButtonBrowse2.setSelectable(false);
					addQuestionPanel.add(addQuestionPictureAnswerButtonBrowse2);
				
					addQuestionPictureAnswerButtonBrowse3.setBounds(940, 270, 120, 40);
					addQuestionPictureAnswerButtonBrowse3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
					addQuestionPictureAnswerButtonBrowse3.setEnabled(false); addQuestionPictureAnswerButtonBrowse3.setSelectable(false);
					addQuestionPanel.add(addQuestionPictureAnswerButtonBrowse3);
				
					addQuestionPictureAnswerButtonBrowse4.setBounds(940, 320, 120, 40);
					addQuestionPictureAnswerButtonBrowse4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
					addQuestionPictureAnswerButtonBrowse4.setEnabled(false); addQuestionPictureAnswerButtonBrowse4.setSelectable(false);
					addQuestionPanel.add(addQuestionPictureAnswerButtonBrowse4);
				
					addQuestionPictureAnswerButtonBrowse5.setBounds(940, 370, 120, 40);
					addQuestionPictureAnswerButtonBrowse5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
					addQuestionPictureAnswerButtonBrowse5.setEnabled(false); addQuestionPictureAnswerButtonBrowse5.setSelectable(false);
					addQuestionPanel.add(addQuestionPictureAnswerButtonBrowse5);
					
				addQuestionPictureAnswerPathLabel.setBounds(1070, 140, 200, 20);
				addQuestionPictureAnswerPathLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				addQuestionPictureAnswerPathLabel.setHorizontalAlignment(JLabel.LEFT);
				addQuestionPictureAnswerPathLabel.setForeground(Color.decode("#e1b173"));
				addQuestionPanel.add(addQuestionPictureAnswerPathLabel);
				
					addQuestionPictureAnswerPath1.setBounds(1090, 170, 180, 40);
					addQuestionPictureAnswerPath1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
					addQuestionPictureAnswerPath1.setHorizontalAlignment(JLabel.LEFT);
					addQuestionPictureAnswerPath1.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPictureAnswerPath1);
				
					addQuestionPictureAnswerPath2.setBounds(1090, 220, 180, 40);
					addQuestionPictureAnswerPath2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
					addQuestionPictureAnswerPath2.setHorizontalAlignment(JLabel.LEFT);
					addQuestionPictureAnswerPath2.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPictureAnswerPath2);
				
					addQuestionPictureAnswerPath3.setBounds(1090, 270, 180, 40);
					addQuestionPictureAnswerPath3.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
					addQuestionPictureAnswerPath3.setHorizontalAlignment(JLabel.LEFT);
					addQuestionPictureAnswerPath3.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPictureAnswerPath3);
				
					addQuestionPictureAnswerPath4.setBounds(1090, 320, 180, 40);
					addQuestionPictureAnswerPath4.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
					addQuestionPictureAnswerPath4.setHorizontalAlignment(JLabel.LEFT);
					addQuestionPictureAnswerPath4.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPictureAnswerPath4);
				
					addQuestionPictureAnswerPath5.setBounds(1090, 370, 180, 40);
					addQuestionPictureAnswerPath5.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
					addQuestionPictureAnswerPath5.setHorizontalAlignment(JLabel.LEFT);
					addQuestionPictureAnswerPath5.setForeground(Color.decode("#e1b173"));
					addQuestionPanel.add(addQuestionPictureAnswerPath5);
					
	//Tiebreaker Question Panel
		addTiebreakerQuestionPanel.setBounds(0, 0, 690, 300);
		addTiebreakerQuestionPanel.setLayout(null);
		frame.getContentPane().add(addTiebreakerQuestionPanel);
		
			buttonBackFromAddTiebreakerQuestion.setBounds(10, 10, 80, 40);
			buttonBackFromAddTiebreakerQuestion.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			buttonBackFromAddTiebreakerQuestion.setColor(Color.decode("#e1b173"));
			buttonBackFromAddTiebreakerQuestion.setTextColor(Color.decode("#38075d"));
			addTiebreakerQuestionPanel.add(buttonBackFromAddTiebreakerQuestion);
			
			buttonSubmitAddTiebreakerQuestion.setBounds(560, 10, 120, 40);
			buttonSubmitAddTiebreakerQuestion.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			buttonSubmitAddTiebreakerQuestion.setColor(Color.decode("#e1b173"));
			buttonSubmitAddTiebreakerQuestion.setTextColor(Color.decode("#38075d"));
			addTiebreakerQuestionPanel.add(buttonSubmitAddTiebreakerQuestion);
			
			addTiebreakerLabel.setBounds(100, 30, 450, 40);
			addTiebreakerLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
			addTiebreakerLabel.setHorizontalAlignment(JLabel.CENTER);
			addTiebreakerLabel.setForeground(Color.decode("#e1b173"));
			addTiebreakerQuestionPanel.add(addTiebreakerLabel);
			
				addTiebreakerQuestionLabel.setBounds(100, 100, 220, 40);
				addTiebreakerQuestionLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				addTiebreakerQuestionLabel.setHorizontalAlignment(JLabel.CENTER);
				addTiebreakerQuestionLabel.setForeground(Color.decode("#e1b173"));
				addTiebreakerQuestionPanel.add(addTiebreakerQuestionLabel);
				
					addTiebreakerQuestionTextBox.setBounds(100, 160, 220, 40);
					addTiebreakerQuestionTextBox.setHorizontalAlignment(JTextField.LEFT);
					addTiebreakerQuestionTextBox.setInset(10);
					addTiebreakerQuestionPanel.add(addTiebreakerQuestionTextBox);
				
				addTiebreakerAnswerLabel.setBounds(330, 100, 220, 40);
				addTiebreakerAnswerLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				addTiebreakerAnswerLabel.setHorizontalAlignment(JLabel.CENTER);
				addTiebreakerAnswerLabel.setForeground(Color.decode("#e1b173"));
				addTiebreakerQuestionPanel.add(addTiebreakerAnswerLabel);
				
					addTiebreakerAnswerTextBox.setBounds(330, 160, 220, 40);
					addTiebreakerAnswerTextBox.setHorizontalAlignment(JTextField.LEFT);
					addTiebreakerAnswerTextBox.setInset(10);
					addTiebreakerQuestionPanel.add(addTiebreakerAnswerTextBox);
		
	//Final Question Panel
		addFinalCategoryPanel.setBounds(0, 0, 1070, 510);
		addFinalCategoryPanel.setLayout(null);
		frame.getContentPane().add(addFinalCategoryPanel);
		
			buttonBackFromAddFinalCategory.setBounds(10, 10, 80, 40);
			buttonBackFromAddFinalCategory.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			buttonBackFromAddFinalCategory.setColor(Color.decode("#e1b173"));
			buttonBackFromAddFinalCategory.setTextColor(Color.decode("#38075d"));
			addFinalCategoryPanel.add(buttonBackFromAddFinalCategory);
			
			buttonSubmitAddFinalCategory.setBounds(940, 10, 120, 40);
			buttonSubmitAddFinalCategory.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			buttonSubmitAddFinalCategory.setColor(Color.decode("#e1b173"));
			buttonSubmitAddFinalCategory.setTextColor(Color.decode("#38075d"));
			addFinalCategoryPanel.add(buttonSubmitAddFinalCategory);

			addFinalCategoryLabel.setBounds(100, 30, 830, 40);
			addFinalCategoryLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
			addFinalCategoryLabel.setHorizontalAlignment(JLabel.CENTER);
			addFinalCategoryLabel.setForeground(Color.decode("#e1b173"));
			addFinalCategoryPanel.add(addFinalCategoryLabel);
			
				addFinalCategoryNameLabel.setBounds(300, 80, 250, 40);
				addFinalCategoryNameLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				addFinalCategoryNameLabel.setForeground(Color.decode("#e1b173"));
				addFinalCategoryPanel.add(addFinalCategoryNameLabel);
				
				addFinalCategoryNameTextBox.setBounds(520, 80, 250, 40);
				addFinalCategoryNameTextBox.setHorizontalAlignment(JTextField.LEFT);
				addFinalCategoryNameTextBox.setInset(10);
				addFinalCategoryPanel.add(addFinalCategoryNameTextBox);

					addFinalQuestionLabel.setBounds(100, 140, 220, 20);
					addFinalQuestionLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
					addFinalQuestionLabel.setHorizontalAlignment(JLabel.CENTER);
					addFinalQuestionLabel.setForeground(Color.decode("#e1b173"));
					addFinalCategoryPanel.add(addFinalQuestionLabel);

					addFinalAnswerLabel.setBounds(330, 140, 220, 20);
					addFinalAnswerLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
					addFinalAnswerLabel.setHorizontalAlignment(JLabel.CENTER);
					addFinalAnswerLabel.setForeground(Color.decode("#e1b173"));
					addFinalCategoryPanel.add(addFinalAnswerLabel);

					addFinalAnswerEditorLabel.setBounds(560, 140, 410, 20);
					addFinalAnswerEditorLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
					addFinalAnswerEditorLabel.setHorizontalAlignment(JLabel.CENTER);
					addFinalAnswerEditorLabel.setForeground(Color.decode("#e1b173"));
					addFinalCategoryPanel.add(addFinalAnswerEditorLabel);
					
						addFinalQuestionTextBox1.setBounds(100, 170, 220, 40);
						addFinalQuestionTextBox1.setHorizontalAlignment(JTextField.LEFT);
						addFinalQuestionTextBox1.setInset(10);
						addFinalCategoryPanel.add(addFinalQuestionTextBox1);
			
						addFinalAnswerTextBox1.setBounds(330, 170, 150, 40);
						addFinalAnswerTextBox1.setHorizontalAlignment(JTextField.LEFT);
						addFinalAnswerTextBox1.setInset(10);
						addFinalCategoryPanel.add(addFinalAnswerTextBox1);
			
						addFinalAnswerWorthTextBox1.setBounds(490, 170, 60, 40);
						addFinalAnswerWorthTextBox1.setHorizontalAlignment(JTextField.RIGHT);
						addFinalAnswerWorthTextBox1.setInset(10);
						addFinalCategoryPanel.add(addFinalAnswerWorthTextBox1);
					
						addFinalQuestionButtonAddAnswer1.setBounds(560, 170, 80, 40);
						addFinalQuestionButtonAddAnswer1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonAddAnswer1);

						finalCategoryAnswersWorthTotalTitleLabel1.setBounds(660, 170, 45, 20);
						finalCategoryAnswersWorthTotalTitleLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
						finalCategoryAnswersWorthTotalTitleLabel1.setHorizontalAlignment(JLabel.LEFT);
						finalCategoryAnswersWorthTotalTitleLabel1.setForeground(Color.decode("#e1b173"));
						addFinalCategoryPanel.add(finalCategoryAnswersWorthTotalTitleLabel1);

						finalCategoryAnswersWorthTotalLabel1.setBounds(715, 170, 25, 20);
						finalCategoryAnswersWorthTotalLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
						finalCategoryAnswersWorthTotalLabel1.setHorizontalAlignment(JLabel.RIGHT);
						finalCategoryAnswersWorthTotalLabel1.setForeground(Color.decode("#e1b173"));
						addFinalCategoryPanel.add(finalCategoryAnswersWorthTotalLabel1);
					
						addFinalQuestionAnswersComboBox1.setBounds(650, 190, 120, 20);
						addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox1);
					
						addFinalQuestionButtonRemoveAnswer1.setBounds(780, 170, 100, 40);
						addFinalQuestionButtonRemoveAnswer1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonRemoveAnswer1);
					
						addFinalQuestionButtonClearAnswers1.setBounds(890, 170, 80, 40);
						addFinalQuestionButtonClearAnswers1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonClearAnswers1);

						
						addFinalQuestionTextBox2.setBounds(100, 220, 220, 40);
						addFinalQuestionTextBox2.setHorizontalAlignment(JTextField.LEFT);
						addFinalQuestionTextBox2.setInset(10);
						addFinalCategoryPanel.add(addFinalQuestionTextBox2);
			
						addFinalAnswerTextBox2.setBounds(330, 220, 150, 40);
						addFinalAnswerTextBox2.setHorizontalAlignment(JTextField.LEFT);
						addFinalAnswerTextBox2.setInset(10);
						addFinalCategoryPanel.add(addFinalAnswerTextBox2);
			
						addFinalAnswerWorthTextBox2.setBounds(490, 220, 60, 40);
						addFinalAnswerWorthTextBox2.setHorizontalAlignment(JTextField.RIGHT);
						addFinalAnswerWorthTextBox2.setInset(10);
						addFinalCategoryPanel.add(addFinalAnswerWorthTextBox2);
					
						addFinalQuestionButtonAddAnswer2.setBounds(560, 220, 80, 40);
						addFinalQuestionButtonAddAnswer2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonAddAnswer2);

						finalCategoryAnswersWorthTotalTitleLabel2.setBounds(660, 220, 45, 20);
						finalCategoryAnswersWorthTotalTitleLabel2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
						finalCategoryAnswersWorthTotalTitleLabel2.setHorizontalAlignment(JLabel.LEFT);
						finalCategoryAnswersWorthTotalTitleLabel2.setForeground(Color.decode("#e1b173"));
						addFinalCategoryPanel.add(finalCategoryAnswersWorthTotalTitleLabel2);

						finalCategoryAnswersWorthTotalLabel2.setBounds(715, 220, 25, 20);
						finalCategoryAnswersWorthTotalLabel2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
						finalCategoryAnswersWorthTotalLabel2.setHorizontalAlignment(JLabel.RIGHT);
						finalCategoryAnswersWorthTotalLabel2.setForeground(Color.decode("#e1b173"));
						addFinalCategoryPanel.add(finalCategoryAnswersWorthTotalLabel2);
					
						addFinalQuestionAnswersComboBox2.setBounds(650, 240, 120, 20);
						addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox2);
					
						addFinalQuestionButtonRemoveAnswer2.setBounds(780, 220, 100, 40);
						addFinalQuestionButtonRemoveAnswer2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonRemoveAnswer2);
					
						addFinalQuestionButtonClearAnswers2.setBounds(890, 220, 80, 40);
						addFinalQuestionButtonClearAnswers2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonClearAnswers2);

						
						addFinalQuestionTextBox3.setBounds(100, 270, 220, 40);
						addFinalQuestionTextBox3.setHorizontalAlignment(JTextField.LEFT);
						addFinalQuestionTextBox3.setInset(10);
						addFinalCategoryPanel.add(addFinalQuestionTextBox3);
			
						addFinalAnswerTextBox3.setBounds(330, 270, 150, 40);
						addFinalAnswerTextBox3.setHorizontalAlignment(JTextField.LEFT);
						addFinalAnswerTextBox3.setInset(10);
						addFinalCategoryPanel.add(addFinalAnswerTextBox3);
			
						addFinalAnswerWorthTextBox3.setBounds(490, 270, 60, 40);
						addFinalAnswerWorthTextBox3.setHorizontalAlignment(JTextField.RIGHT);
						addFinalAnswerWorthTextBox3.setInset(10);
						addFinalCategoryPanel.add(addFinalAnswerWorthTextBox3);
					
						addFinalQuestionButtonAddAnswer3.setBounds(560, 270, 80, 40);
						addFinalQuestionButtonAddAnswer3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonAddAnswer3);

						finalCategoryAnswersWorthTotalTitleLabel3.setBounds(660, 270, 45, 20);
						finalCategoryAnswersWorthTotalTitleLabel3.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
						finalCategoryAnswersWorthTotalTitleLabel3.setHorizontalAlignment(JLabel.LEFT);
						finalCategoryAnswersWorthTotalTitleLabel3.setForeground(Color.decode("#e1b173"));
						addFinalCategoryPanel.add(finalCategoryAnswersWorthTotalTitleLabel3);

						finalCategoryAnswersWorthTotalLabel3.setBounds(715, 270, 25, 20);
						finalCategoryAnswersWorthTotalLabel3.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
						finalCategoryAnswersWorthTotalLabel3.setHorizontalAlignment(JLabel.RIGHT);
						finalCategoryAnswersWorthTotalLabel3.setForeground(Color.decode("#e1b173"));
						addFinalCategoryPanel.add(finalCategoryAnswersWorthTotalLabel3);
					
						addFinalQuestionAnswersComboBox3.setBounds(650, 290, 120, 20);
						addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox3);
					
						addFinalQuestionButtonRemoveAnswer3.setBounds(780, 270, 100, 40);
						addFinalQuestionButtonRemoveAnswer3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonRemoveAnswer3);
					
						addFinalQuestionButtonClearAnswers3.setBounds(890, 270, 80, 40);
						addFinalQuestionButtonClearAnswers3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonClearAnswers3);

						
						addFinalQuestionTextBox4.setBounds(100, 320, 220, 40);
						addFinalQuestionTextBox4.setHorizontalAlignment(JTextField.LEFT);
						addFinalQuestionTextBox4.setInset(10);
						addFinalCategoryPanel.add(addFinalQuestionTextBox4);
			
						addFinalAnswerTextBox4.setBounds(330, 320, 150, 40);
						addFinalAnswerTextBox4.setHorizontalAlignment(JTextField.LEFT);
						addFinalAnswerTextBox4.setInset(10);
						addFinalCategoryPanel.add(addFinalAnswerTextBox4);
			
						addFinalAnswerWorthTextBox4.setBounds(490, 320, 60, 40);
						addFinalAnswerWorthTextBox4.setHorizontalAlignment(JTextField.RIGHT);
						addFinalAnswerWorthTextBox4.setInset(10);
						addFinalCategoryPanel.add(addFinalAnswerWorthTextBox4);
					
						addFinalQuestionButtonAddAnswer4.setBounds(560, 320, 80, 40);
						addFinalQuestionButtonAddAnswer4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonAddAnswer4);

						finalCategoryAnswersWorthTotalTitleLabel4.setBounds(660, 320, 45, 20);
						finalCategoryAnswersWorthTotalTitleLabel4.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
						finalCategoryAnswersWorthTotalTitleLabel4.setHorizontalAlignment(JLabel.LEFT);
						finalCategoryAnswersWorthTotalTitleLabel4.setForeground(Color.decode("#e1b173"));
						addFinalCategoryPanel.add(finalCategoryAnswersWorthTotalTitleLabel4);

						finalCategoryAnswersWorthTotalLabel4.setBounds(715, 320, 25, 20);
						finalCategoryAnswersWorthTotalLabel4.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
						finalCategoryAnswersWorthTotalLabel4.setHorizontalAlignment(JLabel.RIGHT);
						finalCategoryAnswersWorthTotalLabel4.setForeground(Color.decode("#e1b173"));
						addFinalCategoryPanel.add(finalCategoryAnswersWorthTotalLabel4);
					
						addFinalQuestionAnswersComboBox4.setBounds(650, 340, 120, 20);
						addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox4);
					
						addFinalQuestionButtonRemoveAnswer4.setBounds(780, 320, 100, 40);
						addFinalQuestionButtonRemoveAnswer4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonRemoveAnswer4);
					
						addFinalQuestionButtonClearAnswers4.setBounds(890, 320, 80, 40);
						addFinalQuestionButtonClearAnswers4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonClearAnswers4);

						
						addFinalQuestionTextBox5.setBounds(100, 370, 220, 40);
						addFinalQuestionTextBox5.setHorizontalAlignment(JTextField.LEFT);
						addFinalQuestionTextBox5.setInset(10);
						addFinalCategoryPanel.add(addFinalQuestionTextBox5);
			
						addFinalAnswerTextBox5.setBounds(330, 370, 150, 40);
						addFinalAnswerTextBox5.setHorizontalAlignment(JTextField.LEFT);
						addFinalAnswerTextBox5.setInset(10);
						addFinalCategoryPanel.add(addFinalAnswerTextBox5);
			
						addFinalAnswerWorthTextBox5.setBounds(490, 370, 60, 40);
						addFinalAnswerWorthTextBox5.setHorizontalAlignment(JTextField.RIGHT);
						addFinalAnswerWorthTextBox5.setInset(10);
						addFinalCategoryPanel.add(addFinalAnswerWorthTextBox5);
					
						addFinalQuestionButtonAddAnswer5.setBounds(560, 370, 80, 40);
						addFinalQuestionButtonAddAnswer5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonAddAnswer5);

						finalCategoryAnswersWorthTotalTitleLabel5.setBounds(660, 370, 45, 20);
						finalCategoryAnswersWorthTotalTitleLabel5.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
						finalCategoryAnswersWorthTotalTitleLabel5.setHorizontalAlignment(JLabel.LEFT);
						finalCategoryAnswersWorthTotalTitleLabel5.setForeground(Color.decode("#e1b173"));
						addFinalCategoryPanel.add(finalCategoryAnswersWorthTotalTitleLabel5);

						finalCategoryAnswersWorthTotalLabel5.setBounds(715, 370, 25, 20);
						finalCategoryAnswersWorthTotalLabel5.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
						finalCategoryAnswersWorthTotalLabel5.setHorizontalAlignment(JLabel.RIGHT);
						finalCategoryAnswersWorthTotalLabel5.setForeground(Color.decode("#e1b173"));
						addFinalCategoryPanel.add(finalCategoryAnswersWorthTotalLabel5);
					
						addFinalQuestionAnswersComboBox5.setBounds(650, 390, 120, 20);
						addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox5);
					
						addFinalQuestionButtonRemoveAnswer5.setBounds(780, 370, 100, 40);
						addFinalQuestionButtonRemoveAnswer5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonRemoveAnswer5);
					
						addFinalQuestionButtonClearAnswers5.setBounds(890, 370, 80, 40);
						addFinalQuestionButtonClearAnswers5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
						addFinalCategoryPanel.add(addFinalQuestionButtonClearAnswers5);
	}
	
	public boolean clearAll(String editorArea) {
		if (editorArea.equals("addQuestion")) {
			return true;
		} else
		if (editorArea.equals("addTiebreakerQuestion")) {
			return true;
		} else
		if (editorArea.equals("addFinalCategory")) {
			addFinalCategoryNameTextBox.setText("");
			addFinalQuestionTextBox1.setText("");
			addFinalQuestionTextBox2.setText("");
			addFinalQuestionTextBox3.setText("");
			addFinalQuestionTextBox4.setText("");
			addFinalQuestionTextBox5.setText("");
			
			addFinalAnswerTextBox1.setText("");
			addFinalAnswerTextBox2.setText("");
			addFinalAnswerTextBox3.setText("");
			addFinalAnswerTextBox4.setText("");
			addFinalAnswerTextBox5.setText("");
			
			addFinalAnswerWorthTextBox1.setText("");
			addFinalAnswerWorthTextBox2.setText("");
			addFinalAnswerWorthTextBox3.setText("");
			addFinalAnswerWorthTextBox4.setText("");
			addFinalAnswerWorthTextBox5.setText("");
			
			clearFinalCategoryAnswers(1);
			clearFinalCategoryAnswers(2);
			clearFinalCategoryAnswers(3);
			clearFinalCategoryAnswers(4);
			clearFinalCategoryAnswers(5);
			
			return true;
		} else {return false;}
	}

	public boolean addFinalCategoryAnswer(int questionNumber) {
		Rectangle tempBounds;
		ArrayList<String> comboBoxData = new ArrayList<String>();
		
		switch (questionNumber) {
			case 1:
				if (addFinalAnswerTextBox1.getText() == "" || addFinalAnswerWorthTextBox1.getText() == "") {return false;}
				
				try {Integer.parseInt(addFinalAnswerWorthTextBox1.getText());}
				catch (Exception e) {return false;}
				
				if (
					addFinalAnswerTextBox1.getText().contains(",") ||
					Integer.parseInt(addFinalAnswerWorthTextBox1.getText()) < 1 ||
					Integer.parseInt(addFinalAnswerWorthTextBox1.getText()) > 100 ||
					(finalCategoryAnswersWorthTotal1 + Integer.parseInt(addFinalAnswerWorthTextBox1.getText())) > 100
				) {return false;}
				
				finalCategoryAnswers1.add(addFinalAnswerTextBox1.getText());
				finalCategoryAnswersWorth1.add(Integer.parseInt(addFinalAnswerWorthTextBox1.getText()));
				finalCategoryAnswersWorthTotal1 += Integer.parseInt(addFinalAnswerWorthTextBox1.getText());
				
				for (int i = 0; i < finalCategoryAnswers1.size(); i++) {
					comboBoxData.add(finalCategoryAnswers1.get(i)
							+ " (" + Integer.toString(finalCategoryAnswersWorth1.get(i)) + ")");
				}
				
				tempBounds = addFinalQuestionAnswersComboBox1.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox1);
				addFinalQuestionAnswersComboBox1 = new JComboBox<Object>(comboBoxData.toArray());
				addFinalQuestionAnswersComboBox1.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox1);
				addFinalQuestionAnswersComboBox1.setSelectedIndex(0);
				
				finalCategoryAnswersWorthTotalLabel1.setText(Integer.toString(finalCategoryAnswersWorthTotal1));
				addFinalAnswerTextBox1.setText("");
				addFinalAnswerWorthTextBox1.setText("");
				
				addFinalQuestionButtonRemoveAnswer1.setEnabled(true);
				addFinalQuestionButtonRemoveAnswer1.setSelectable(true);
				addFinalQuestionButtonClearAnswers1.setEnabled(true);
				addFinalQuestionButtonClearAnswers1.setSelectable(true);
				
				if (finalCategoryAnswersWorthTotal1 == 100) {
					addFinalQuestionButtonAddAnswer1.setEnabled(false);
					addFinalQuestionButtonAddAnswer1.setSelectable(false);
				}
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox1);
				break;
				
			case 2:
				if (addFinalAnswerTextBox2.getText() == "" || addFinalAnswerWorthTextBox2.getText() == "") {return false;}
				
				try {Integer.parseInt(addFinalAnswerWorthTextBox2.getText());}
				catch (Exception e) {return false;}
				
				if (Integer.parseInt(addFinalAnswerWorthTextBox2.getText()) < 1 || Integer.parseInt(addFinalAnswerWorthTextBox2.getText()) > 100 || (finalCategoryAnswersWorthTotal2 + Integer.parseInt(addFinalAnswerWorthTextBox2.getText())) > 100) {return false;}
				
				finalCategoryAnswers2.add(addFinalAnswerTextBox2.getText());
				finalCategoryAnswersWorth2.add(Integer.parseInt(addFinalAnswerWorthTextBox2.getText()));
				finalCategoryAnswersWorthTotal2 += Integer.parseInt(addFinalAnswerWorthTextBox2.getText());
				
				for (int i = 0; i < finalCategoryAnswers2.size(); i++) {
					comboBoxData.add(finalCategoryAnswers2.get(i)
							+ " (" + Integer.toString(finalCategoryAnswersWorth2.get(i)) + ")");
				}
				
				tempBounds = addFinalQuestionAnswersComboBox2.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox2);
				addFinalQuestionAnswersComboBox2 = new JComboBox<Object>(comboBoxData.toArray());
				addFinalQuestionAnswersComboBox2.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox2);
				addFinalQuestionAnswersComboBox2.setSelectedIndex(0);
				
				finalCategoryAnswersWorthTotalLabel2.setText(Integer.toString(finalCategoryAnswersWorthTotal2));
				addFinalAnswerTextBox2.setText("");
				addFinalAnswerWorthTextBox2.setText("");
				
				addFinalQuestionButtonRemoveAnswer2.setEnabled(true);
				addFinalQuestionButtonRemoveAnswer2.setSelectable(true);
				addFinalQuestionButtonClearAnswers2.setEnabled(true);
				addFinalQuestionButtonClearAnswers2.setSelectable(true);
				
				if (finalCategoryAnswersWorthTotal2 == 100) {
					addFinalQuestionButtonAddAnswer2.setEnabled(false);
					addFinalQuestionButtonAddAnswer2.setSelectable(false);
				}
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox2);
				break;
				
			case 3:
				if (addFinalAnswerTextBox3.getText() == "" || addFinalAnswerWorthTextBox3.getText() == "") {return false;}
				
				try {Integer.parseInt(addFinalAnswerWorthTextBox3.getText());}
				catch (Exception e) {return false;}
				
				if (Integer.parseInt(addFinalAnswerWorthTextBox3.getText()) < 1 || Integer.parseInt(addFinalAnswerWorthTextBox3.getText()) > 100 || (finalCategoryAnswersWorthTotal3 + Integer.parseInt(addFinalAnswerWorthTextBox3.getText())) > 100) {return false;}
				
				finalCategoryAnswers3.add(addFinalAnswerTextBox3.getText());
				finalCategoryAnswersWorth3.add(Integer.parseInt(addFinalAnswerWorthTextBox3.getText()));
				finalCategoryAnswersWorthTotal3 += Integer.parseInt(addFinalAnswerWorthTextBox3.getText());
				
				for (int i = 0; i < finalCategoryAnswers3.size(); i++) {
					comboBoxData.add(finalCategoryAnswers3.get(i)
							+ " (" + Integer.toString(finalCategoryAnswersWorth3.get(i)) + ")");
				}
				
				tempBounds = addFinalQuestionAnswersComboBox3.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox3);
				addFinalQuestionAnswersComboBox3 = new JComboBox<Object>(comboBoxData.toArray());
				addFinalQuestionAnswersComboBox3.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox3);
				addFinalQuestionAnswersComboBox3.setSelectedIndex(0);
				
				finalCategoryAnswersWorthTotalLabel3.setText(Integer.toString(finalCategoryAnswersWorthTotal3));
				addFinalAnswerTextBox3.setText("");
				addFinalAnswerWorthTextBox3.setText("");
				
				addFinalQuestionButtonRemoveAnswer3.setEnabled(true);
				addFinalQuestionButtonRemoveAnswer3.setSelectable(true);
				addFinalQuestionButtonClearAnswers3.setEnabled(true);
				addFinalQuestionButtonClearAnswers3.setSelectable(true);
				
				if (finalCategoryAnswersWorthTotal3 == 100) {
					addFinalQuestionButtonAddAnswer3.setEnabled(false);
					addFinalQuestionButtonAddAnswer3.setSelectable(false);
				}
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox3);
				break;
				
			case 4:
				if (addFinalAnswerTextBox4.getText() == "" || addFinalAnswerWorthTextBox4.getText() == "") {return false;}
				
				try {Integer.parseInt(addFinalAnswerWorthTextBox4.getText());}
				catch (Exception e) {return false;}
				
				if (Integer.parseInt(addFinalAnswerWorthTextBox4.getText()) < 1 || Integer.parseInt(addFinalAnswerWorthTextBox4.getText()) > 100 || (finalCategoryAnswersWorthTotal4 + Integer.parseInt(addFinalAnswerWorthTextBox4.getText())) > 100) {return false;}
				
				finalCategoryAnswers4.add(addFinalAnswerTextBox4.getText());
				finalCategoryAnswersWorth4.add(Integer.parseInt(addFinalAnswerWorthTextBox4.getText()));
				finalCategoryAnswersWorthTotal4 += Integer.parseInt(addFinalAnswerWorthTextBox4.getText());
				
				for (int i = 0; i < finalCategoryAnswers4.size(); i++) {
					comboBoxData.add(finalCategoryAnswers4.get(i)
							+ " (" + Integer.toString(finalCategoryAnswersWorth4.get(i)) + ")");
				}
				
				tempBounds = addFinalQuestionAnswersComboBox4.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox4);
				addFinalQuestionAnswersComboBox4 = new JComboBox<Object>(comboBoxData.toArray());
				addFinalQuestionAnswersComboBox4.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox4);
				addFinalQuestionAnswersComboBox4.setSelectedIndex(0);
				
				finalCategoryAnswersWorthTotalLabel4.setText(Integer.toString(finalCategoryAnswersWorthTotal4));
				addFinalAnswerTextBox4.setText("");
				addFinalAnswerWorthTextBox4.setText("");
				
				addFinalQuestionButtonRemoveAnswer4.setEnabled(true);
				addFinalQuestionButtonRemoveAnswer4.setSelectable(true);
				addFinalQuestionButtonClearAnswers4.setEnabled(true);
				addFinalQuestionButtonClearAnswers4.setSelectable(true);
				
				if (finalCategoryAnswersWorthTotal4 == 100) {
					addFinalQuestionButtonAddAnswer4.setEnabled(false);
					addFinalQuestionButtonAddAnswer4.setSelectable(false);
				}
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox4);
				break;
				
			case 5:
				if (addFinalAnswerTextBox5.getText() == "" || addFinalAnswerWorthTextBox5.getText() == "") {return false;}
				
				try {Integer.parseInt(addFinalAnswerWorthTextBox5.getText());}
				catch (Exception e) {return false;}
				
				if (Integer.parseInt(addFinalAnswerWorthTextBox5.getText()) < 1 || Integer.parseInt(addFinalAnswerWorthTextBox5.getText()) > 100 || (finalCategoryAnswersWorthTotal5 + Integer.parseInt(addFinalAnswerWorthTextBox5.getText())) > 100) {return false;}
				
				finalCategoryAnswers5.add(addFinalAnswerTextBox5.getText());
				finalCategoryAnswersWorth5.add(Integer.parseInt(addFinalAnswerWorthTextBox5.getText()));
				finalCategoryAnswersWorthTotal5 += Integer.parseInt(addFinalAnswerWorthTextBox5.getText());
				
				for (int i = 0; i < finalCategoryAnswers5.size(); i++) {
					comboBoxData.add(finalCategoryAnswers5.get(i)
							+ " (" + Integer.toString(finalCategoryAnswersWorth5.get(i)) + ")");
				}
				
				tempBounds = addFinalQuestionAnswersComboBox5.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox5);
				addFinalQuestionAnswersComboBox5 = new JComboBox<Object>(comboBoxData.toArray());
				addFinalQuestionAnswersComboBox5.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox5);
				addFinalQuestionAnswersComboBox5.setSelectedIndex(0);
				
				finalCategoryAnswersWorthTotalLabel5.setText(Integer.toString(finalCategoryAnswersWorthTotal5));
				addFinalAnswerTextBox5.setText("");
				addFinalAnswerWorthTextBox5.setText("");
				
				addFinalQuestionButtonRemoveAnswer5.setEnabled(true);
				addFinalQuestionButtonRemoveAnswer5.setSelectable(true);
				addFinalQuestionButtonClearAnswers5.setEnabled(true);
				addFinalQuestionButtonClearAnswers5.setSelectable(true);
				
				if (finalCategoryAnswersWorthTotal5 == 100) {
					addFinalQuestionButtonAddAnswer5.setEnabled(false);
					addFinalQuestionButtonAddAnswer5.setSelectable(false);
				}
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox5);
				break;
				
			default:	return false;
		}
		
		return true;
	}
	public boolean removeFinalCategoryAnswer(int questionNumber) {
		Rectangle tempBounds;
		ArrayList<String> comboBoxData = new ArrayList<String>();
		
		switch (questionNumber) {
			case 1:
				if (finalCategoryAnswers1.size() == 0) {return false;}
				
				finalCategoryAnswersWorthTotal1 -= finalCategoryAnswersWorth1.get(addFinalQuestionAnswersComboBox1.getSelectedIndex());
				finalCategoryAnswers1.remove(addFinalQuestionAnswersComboBox1.getSelectedIndex());
				finalCategoryAnswersWorth1.remove(addFinalQuestionAnswersComboBox1.getSelectedIndex());
				
				for (int i = 0; i < finalCategoryAnswers1.size(); i++) {
					comboBoxData.add(finalCategoryAnswers1.get(i)
							+ " (" + Integer.toString(finalCategoryAnswersWorth1.get(i)) + ")");
				}
				
				tempBounds = addFinalQuestionAnswersComboBox1.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox1);
				if (finalCategoryAnswers1.size() > 0) {addFinalQuestionAnswersComboBox1 = new JComboBox<Object>(comboBoxData.toArray());}
				else {
					addFinalQuestionAnswersComboBox1 = new JComboBox<Object>(noneList);
					
					addFinalQuestionButtonRemoveAnswer1.setEnabled(false);
					addFinalQuestionButtonRemoveAnswer1.setSelectable(false);
					addFinalQuestionButtonClearAnswers1.setEnabled(false);
					addFinalQuestionButtonClearAnswers1.setSelectable(false);
				}
				addFinalQuestionAnswersComboBox1.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox1);
				addFinalQuestionAnswersComboBox1.setSelectedIndex(0);
				
				finalCategoryAnswersWorthTotalLabel1.setText(Integer.toString(finalCategoryAnswersWorthTotal1));
				addFinalQuestionButtonAddAnswer1.setEnabled(true);
				addFinalQuestionButtonAddAnswer1.setSelectable(true);
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox1);
				break;
				
			case 2:
				if (finalCategoryAnswers2.size() == 0) {return false;}
				
				finalCategoryAnswersWorthTotal2 -= finalCategoryAnswersWorth2.get(addFinalQuestionAnswersComboBox2.getSelectedIndex());
				finalCategoryAnswers2.remove(addFinalQuestionAnswersComboBox2.getSelectedIndex());
				finalCategoryAnswersWorth2.remove(addFinalQuestionAnswersComboBox2.getSelectedIndex());
				
				for (int i = 0; i < finalCategoryAnswers2.size(); i++) {
					comboBoxData.add(finalCategoryAnswers2.get(i)
							+ " (" + Integer.toString(finalCategoryAnswersWorth2.get(i)) + ")");
				}
				
				tempBounds = addFinalQuestionAnswersComboBox2.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox2);
				if (finalCategoryAnswers2.size() > 0) {addFinalQuestionAnswersComboBox2 = new JComboBox<Object>(comboBoxData.toArray());}
				else {
					addFinalQuestionAnswersComboBox2 = new JComboBox<Object>(noneList);
					
					addFinalQuestionButtonRemoveAnswer2.setEnabled(false);
					addFinalQuestionButtonRemoveAnswer2.setSelectable(false);
					addFinalQuestionButtonClearAnswers2.setEnabled(false);
					addFinalQuestionButtonClearAnswers2.setSelectable(false);
				}
				addFinalQuestionAnswersComboBox2.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox2);
				addFinalQuestionAnswersComboBox2.setSelectedIndex(0);
				
				finalCategoryAnswersWorthTotalLabel2.setText(Integer.toString(finalCategoryAnswersWorthTotal2));
				addFinalQuestionButtonAddAnswer2.setEnabled(true);
				addFinalQuestionButtonAddAnswer2.setSelectable(true);
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox2);
				break;
				
			case 3:
				if (finalCategoryAnswers3.size() == 0) {return false;}
				
				finalCategoryAnswersWorthTotal3 -= finalCategoryAnswersWorth3.get(addFinalQuestionAnswersComboBox3.getSelectedIndex());
				finalCategoryAnswers3.remove(addFinalQuestionAnswersComboBox3.getSelectedIndex());
				finalCategoryAnswersWorth3.remove(addFinalQuestionAnswersComboBox3.getSelectedIndex());
				
				for (int i = 0; i < finalCategoryAnswers3.size(); i++) {
					comboBoxData.add(finalCategoryAnswers3.get(i)
							+ " (" + Integer.toString(finalCategoryAnswersWorth3.get(i)) + ")");
				}
				
				tempBounds = addFinalQuestionAnswersComboBox3.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox3);
				if (finalCategoryAnswers3.size() > 0) {addFinalQuestionAnswersComboBox3 = new JComboBox<Object>(comboBoxData.toArray());}
				else {
					addFinalQuestionAnswersComboBox3 = new JComboBox<Object>(noneList);
					
					addFinalQuestionButtonRemoveAnswer3.setEnabled(false);
					addFinalQuestionButtonRemoveAnswer3.setSelectable(false);
					addFinalQuestionButtonClearAnswers3.setEnabled(false);
					addFinalQuestionButtonClearAnswers3.setSelectable(false);
				}
				addFinalQuestionAnswersComboBox3.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox3);
				addFinalQuestionAnswersComboBox3.setSelectedIndex(0);
				
				finalCategoryAnswersWorthTotalLabel3.setText(Integer.toString(finalCategoryAnswersWorthTotal3));
				addFinalQuestionButtonAddAnswer3.setEnabled(true);
				addFinalQuestionButtonAddAnswer3.setSelectable(true);
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox3);
				break;
				
			case 4:
				if (finalCategoryAnswers4.size() == 0) {return false;}
				
				finalCategoryAnswersWorthTotal4 -= finalCategoryAnswersWorth4.get(addFinalQuestionAnswersComboBox4.getSelectedIndex());
				finalCategoryAnswers4.remove(addFinalQuestionAnswersComboBox4.getSelectedIndex());
				finalCategoryAnswersWorth4.remove(addFinalQuestionAnswersComboBox4.getSelectedIndex());
				
				for (int i = 0; i < finalCategoryAnswers4.size(); i++) {
					comboBoxData.add(finalCategoryAnswers4.get(i)
							+ " (" + Integer.toString(finalCategoryAnswersWorth4.get(i)) + ")");
				}
				
				tempBounds = addFinalQuestionAnswersComboBox4.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox4);
				if (finalCategoryAnswers4.size() > 0) {addFinalQuestionAnswersComboBox4 = new JComboBox<Object>(comboBoxData.toArray());}
				else {
					addFinalQuestionAnswersComboBox4 = new JComboBox<Object>(noneList);
					
					addFinalQuestionButtonRemoveAnswer4.setEnabled(false);
					addFinalQuestionButtonRemoveAnswer4.setSelectable(false);
					addFinalQuestionButtonClearAnswers4.setEnabled(false);
					addFinalQuestionButtonClearAnswers4.setSelectable(false);
				}
				addFinalQuestionAnswersComboBox4.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox4);
				addFinalQuestionAnswersComboBox4.setSelectedIndex(0);
				
				finalCategoryAnswersWorthTotalLabel4.setText(Integer.toString(finalCategoryAnswersWorthTotal4));
				addFinalQuestionButtonAddAnswer4.setEnabled(true);
				addFinalQuestionButtonAddAnswer4.setSelectable(true);
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox4);
				break;
				
			case 5:
				if (finalCategoryAnswers5.size() == 0) {return false;}
				
				finalCategoryAnswersWorthTotal5 -= finalCategoryAnswersWorth5.get(addFinalQuestionAnswersComboBox5.getSelectedIndex());
				finalCategoryAnswers5.remove(addFinalQuestionAnswersComboBox5.getSelectedIndex());
				finalCategoryAnswersWorth5.remove(addFinalQuestionAnswersComboBox5.getSelectedIndex());
				
				for (int i = 0; i < finalCategoryAnswers5.size(); i++) {
					comboBoxData.add(finalCategoryAnswers5.get(i)
							+ " (" + Integer.toString(finalCategoryAnswersWorth5.get(i)) + ")");
				}
				
				tempBounds = addFinalQuestionAnswersComboBox5.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox5);
				if (finalCategoryAnswers5.size() > 0) {addFinalQuestionAnswersComboBox5 = new JComboBox<Object>(comboBoxData.toArray());}
				else {
					addFinalQuestionAnswersComboBox5 = new JComboBox<Object>(noneList);
					
					addFinalQuestionButtonRemoveAnswer5.setEnabled(false);
					addFinalQuestionButtonRemoveAnswer5.setSelectable(false);
					addFinalQuestionButtonClearAnswers5.setEnabled(false);
					addFinalQuestionButtonClearAnswers5.setSelectable(false);
				}
				addFinalQuestionAnswersComboBox5.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox5);
				addFinalQuestionAnswersComboBox5.setSelectedIndex(0);
				
				finalCategoryAnswersWorthTotalLabel5.setText(Integer.toString(finalCategoryAnswersWorthTotal5));
				addFinalQuestionButtonAddAnswer5.setEnabled(true);
				addFinalQuestionButtonAddAnswer5.setSelectable(true);
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox5);
				break;
				
			default:	return false;
		}
		
		return true;
	}
	public void clearFinalCategoryAnswers(int questionNumber) {
		Rectangle tempBounds;
		
		switch (questionNumber) {
			case 1:
				tempBounds = addFinalQuestionAnswersComboBox1.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox1);
				addFinalQuestionAnswersComboBox1 = new JComboBox<Object>(noneList);
				addFinalQuestionAnswersComboBox1.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox1);
				addFinalQuestionAnswersComboBox1.setSelectedIndex(0);
				
				finalCategoryAnswers1 = new ArrayList<String>();
				finalCategoryAnswersWorth1 = new ArrayList<Integer>();
				finalCategoryAnswersWorthTotal1 = 0;
				finalCategoryAnswersWorthTotalLabel1.setText(Integer.toString(finalCategoryAnswersWorthTotal1));
				
				addFinalQuestionButtonAddAnswer1.setEnabled(true);
				addFinalQuestionButtonAddAnswer1.setSelectable(true);
				addFinalQuestionButtonRemoveAnswer1.setEnabled(false);
				addFinalQuestionButtonRemoveAnswer1.setSelectable(false);
				addFinalQuestionButtonClearAnswers1.setEnabled(false);
				addFinalQuestionButtonClearAnswers1.setSelectable(false);
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox1);
				break;
				
			case 2:
				tempBounds = addFinalQuestionAnswersComboBox2.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox2);
				addFinalQuestionAnswersComboBox2 = new JComboBox<Object>(noneList);
				addFinalQuestionAnswersComboBox2.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox2);
				addFinalQuestionAnswersComboBox2.setSelectedIndex(0);
				
				finalCategoryAnswers2 = new ArrayList<String>();
				finalCategoryAnswersWorth2 = new ArrayList<Integer>();
				finalCategoryAnswersWorthTotal2 = 0;
				finalCategoryAnswersWorthTotalLabel2.setText(Integer.toString(finalCategoryAnswersWorthTotal2));

				addFinalQuestionButtonAddAnswer2.setEnabled(true);
				addFinalQuestionButtonAddAnswer2.setSelectable(true);
				addFinalQuestionButtonRemoveAnswer2.setEnabled(false);
				addFinalQuestionButtonRemoveAnswer2.setSelectable(false);
				addFinalQuestionButtonClearAnswers2.setEnabled(false);
				addFinalQuestionButtonClearAnswers2.setSelectable(false);
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox2);
				break;
				
			case 3:
				tempBounds = addFinalQuestionAnswersComboBox3.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox3);
				addFinalQuestionAnswersComboBox3 = new JComboBox<Object>(noneList);
				addFinalQuestionAnswersComboBox3.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox3);
				addFinalQuestionAnswersComboBox3.setSelectedIndex(0);
				
				finalCategoryAnswers3 = new ArrayList<String>();
				finalCategoryAnswersWorth3 = new ArrayList<Integer>();
				finalCategoryAnswersWorthTotal3 = 0;
				finalCategoryAnswersWorthTotalLabel3.setText(Integer.toString(finalCategoryAnswersWorthTotal3));

				addFinalQuestionButtonAddAnswer3.setEnabled(true);
				addFinalQuestionButtonAddAnswer3.setSelectable(true);
				addFinalQuestionButtonRemoveAnswer3.setEnabled(false);
				addFinalQuestionButtonRemoveAnswer3.setSelectable(false);
				addFinalQuestionButtonClearAnswers3.setEnabled(false);
				addFinalQuestionButtonClearAnswers3.setSelectable(false);
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox3);
				break;
				
			case 4:
				tempBounds = addFinalQuestionAnswersComboBox4.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox4);
				addFinalQuestionAnswersComboBox4 = new JComboBox<Object>(noneList);
				addFinalQuestionAnswersComboBox4.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox4);
				addFinalQuestionAnswersComboBox4.setSelectedIndex(0);
				
				finalCategoryAnswers4 = new ArrayList<String>();
				finalCategoryAnswersWorth4 = new ArrayList<Integer>();
				finalCategoryAnswersWorthTotal4 = 0;
				finalCategoryAnswersWorthTotalLabel4.setText(Integer.toString(finalCategoryAnswersWorthTotal4));

				addFinalQuestionButtonAddAnswer4.setEnabled(true);
				addFinalQuestionButtonAddAnswer4.setSelectable(true);
				addFinalQuestionButtonRemoveAnswer4.setEnabled(false);
				addFinalQuestionButtonRemoveAnswer4.setSelectable(false);
				addFinalQuestionButtonClearAnswers4.setEnabled(false);
				addFinalQuestionButtonClearAnswers4.setSelectable(false);
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox4);
				break;
				
			case 5:
				tempBounds = addFinalQuestionAnswersComboBox5.getBounds();
				addFinalCategoryPanel.remove(addFinalQuestionAnswersComboBox5);
				addFinalQuestionAnswersComboBox5 = new JComboBox<Object>(noneList);
				addFinalQuestionAnswersComboBox5.setBounds(tempBounds);
				addFinalCategoryPanel.add(addFinalQuestionAnswersComboBox5);
				addFinalQuestionAnswersComboBox5.setSelectedIndex(0);
				
				finalCategoryAnswers5 = new ArrayList<String>();
				finalCategoryAnswersWorth5 = new ArrayList<Integer>();
				finalCategoryAnswersWorthTotal5 = 0;
				finalCategoryAnswersWorthTotalLabel5.setText(Integer.toString(finalCategoryAnswersWorthTotal5));

				addFinalQuestionButtonAddAnswer5.setEnabled(true);
				addFinalQuestionButtonAddAnswer5.setSelectable(true);
				addFinalQuestionButtonRemoveAnswer5.setEnabled(false);
				addFinalQuestionButtonRemoveAnswer5.setSelectable(false);
				addFinalQuestionButtonClearAnswers5.setEnabled(false);
				addFinalQuestionButtonClearAnswers5.setSelectable(false);
				
				SwingUtilities.updateComponentTreeUI(addFinalQuestionAnswersComboBox5);
				break;
				
			default:	return;
		}
	}

	public String getAnswersToString(int questionNumber) {
		String finalCategoryAnswersString = "";
		

		if (questionNumber == 1 && finalCategoryAnswersWorthTotal1 == 100) {
			finalCategoryAnswersString = finalCategoryAnswers1.get(0).toLowerCase();
			for (int i = 1; i < finalCategoryAnswers1.size(); i++) {
				finalCategoryAnswersString += ("," + finalCategoryAnswers1.get(i).toLowerCase());
			}
		} else
		if (questionNumber == 2 && finalCategoryAnswersWorthTotal2 == 100) {
			finalCategoryAnswersString = finalCategoryAnswers2.get(0).toLowerCase();
			for (int i = 1; i < finalCategoryAnswers2.size(); i++) {
				finalCategoryAnswersString += ("," + finalCategoryAnswers2.get(i).toLowerCase());
			}
		} else
		if (questionNumber == 3 && finalCategoryAnswersWorthTotal3 == 100) {
			finalCategoryAnswersString = finalCategoryAnswers3.get(0).toLowerCase();
			for (int i = 1; i < finalCategoryAnswers3.size(); i++) {
				finalCategoryAnswersString += ("," + finalCategoryAnswers3.get(i).toLowerCase());
			}
		} else
		if (questionNumber == 4 && finalCategoryAnswersWorthTotal4 == 100) {
			finalCategoryAnswersString = finalCategoryAnswers4.get(0).toLowerCase();
			for (int i = 1; i < finalCategoryAnswers4.size(); i++) {
				finalCategoryAnswersString += ("," + finalCategoryAnswers4.get(i).toLowerCase());
			}
		} else
		if (questionNumber == 5 && finalCategoryAnswersWorthTotal5 == 100) {
			finalCategoryAnswersString = finalCategoryAnswers5.get(0).toLowerCase();
			for (int i = 1; i < finalCategoryAnswers5.size(); i++) {
				finalCategoryAnswersString += ("," + finalCategoryAnswers5.get(i).toLowerCase());
			}
		}
		
		return finalCategoryAnswersString;
	}
	public String getAnswersWorthToString(int questionNumber) {
		String finalCategoryAnswersWorthString = "";
		
		if (questionNumber == 1 && finalCategoryAnswersWorthTotal1 == 100) {
			finalCategoryAnswersWorthString = Integer.toString(finalCategoryAnswersWorth1.get(0));
			for (int i = 1; i < finalCategoryAnswersWorth1.size(); i++) {
				finalCategoryAnswersWorthString += ("," + Integer.toString(finalCategoryAnswersWorth1.get(i)));
			}
		} else
		if (questionNumber == 2 && finalCategoryAnswersWorthTotal2 == 100) {
			finalCategoryAnswersWorthString = Integer.toString(finalCategoryAnswersWorth2.get(0));
			for (int i = 1; i < finalCategoryAnswersWorth2.size(); i++) {
				finalCategoryAnswersWorthString += ("," + Integer.toString(finalCategoryAnswersWorth2.get(i)));
			}
		} else
		if (questionNumber == 3 && finalCategoryAnswersWorthTotal3 == 100) {
			finalCategoryAnswersWorthString = Integer.toString(finalCategoryAnswersWorth3.get(0));
			for (int i = 1; i < finalCategoryAnswersWorth3.size(); i++) {
				finalCategoryAnswersWorthString += ("," + Integer.toString(finalCategoryAnswersWorth3.get(i)));
			}
		} else
		if (questionNumber == 4 && finalCategoryAnswersWorthTotal4 == 100) {
			finalCategoryAnswersWorthString = Integer.toString(finalCategoryAnswersWorth4.get(0));
			for (int i = 1; i < finalCategoryAnswersWorth4.size(); i++) {
				finalCategoryAnswersWorthString += ("," + Integer.toString(finalCategoryAnswersWorth4.get(i)));
			}
		} else
		if (questionNumber == 5 && finalCategoryAnswersWorthTotal5 == 100) {
			finalCategoryAnswersWorthString = Integer.toString(finalCategoryAnswersWorth5.get(0));
			for (int i = 1; i < finalCategoryAnswersWorth5.size(); i++) {
				finalCategoryAnswersWorthString += ("," + Integer.toString(finalCategoryAnswersWorth5.get(i)));
			}
		}
		
		return finalCategoryAnswersWorthString;
	}
}
