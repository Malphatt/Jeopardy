package windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import components.modelPanel;
import components.roundedButton;
import components.roundedPane;
import components.roundedTextBox;

public class adminWindow {

	public JFrame frame;
	
		public final modelPanel menuPanel = new modelPanel();
			public final JLabel buttonOpenEditor = new JLabel("🔧");
			public final roundedPane menuBanner = new roundedPane("How Many Players Would You Like?");
				public final JLabel selectCategoriesTitle = new JLabel("Select The Game Categories");
				String[] noneList = {"None"};
				public final JLabel selectGame1Heading = new JLabel("Game 1");
					public JComboBox<?> selectGame1Category1 = new JComboBox<Object>(noneList);
					public JComboBox<?> selectGame1Category2 = new JComboBox<Object>(noneList);
					public JComboBox<?> selectGame1Category3 = new JComboBox<Object>(noneList);
					public JComboBox<?> selectGame1Category4 = new JComboBox<Object>(noneList);
					public JComboBox<?> selectGame1Category5 = new JComboBox<Object>(noneList);
					public JComboBox<?> selectGame1Category6 = new JComboBox<Object>(noneList);
				
				public final JLabel selectGame2Heading = new JLabel("Game 2");
					public JComboBox<?> selectGame2Category1 = new JComboBox<Object>(noneList);
					public JComboBox<?> selectGame2Category2 = new JComboBox<Object>(noneList);
					public JComboBox<?> selectGame2Category3 = new JComboBox<Object>(noneList);
					public JComboBox<?> selectGame2Category4 = new JComboBox<Object>(noneList);
					public JComboBox<?> selectGame2Category5 = new JComboBox<Object>(noneList);
					public JComboBox<?> selectGame2Category6 = new JComboBox<Object>(noneList);
					
				public final JLabel selectGame3Heading = new JLabel("Final Jeopardy");
					public JComboBox<?> selectFinalJeopardy = new JComboBox<Object>(noneList);
				
				public final roundedButton selectPlayerCount3 = new roundedButton("3 Players");
				public final roundedButton selectPlayerCount4 = new roundedButton("4 Players");
				public final roundedButton selectPlayerCount5 = new roundedButton("5 Players");
				
				public roundedTextBox setPlayerName1 = new roundedTextBox("Player 1");
				public roundedTextBox setPlayerName2 = new roundedTextBox("Player 2");
				public roundedTextBox setPlayerName3 = new roundedTextBox("Player 3");
				public roundedTextBox setPlayerName4 = new roundedTextBox("Player 4");
				public roundedTextBox setPlayerName5 = new roundedTextBox("Player 5");
			public final roundedButton buttonContinue = new roundedButton("Continue");
			public final roundedButton buttonBack = new roundedButton("Back");
		
		
		public final modelPanel gamePanel = new modelPanel();
			JLabel title = new JLabel("JEOPARDY");
			public final roundedButton buttonC1 = new roundedButton("C1");
				public final roundedButton buttonC1R1 = new roundedButton("100");
				public final roundedButton buttonC1R2 = new roundedButton("200");
				public final roundedButton buttonC1R3 = new roundedButton("300");
				public final roundedButton buttonC1R4 = new roundedButton("400");
				public final roundedButton buttonC1R5 = new roundedButton("500");
			public final roundedButton buttonC2 = new roundedButton("C2");
				public final roundedButton buttonC2R1 = new roundedButton("100");
				public final roundedButton buttonC2R2 = new roundedButton("200");
				public final roundedButton buttonC2R3 = new roundedButton("300");
				public final roundedButton buttonC2R4 = new roundedButton("400");
				public final roundedButton buttonC2R5 = new roundedButton("500");
			public final roundedButton buttonC3 = new roundedButton("C3");
				public final roundedButton buttonC3R1 = new roundedButton("100");
				public final roundedButton buttonC3R2 = new roundedButton("200");
				public final roundedButton buttonC3R3 = new roundedButton("300");
				public final roundedButton buttonC3R4 = new roundedButton("400");
				public final roundedButton buttonC3R5 = new roundedButton("500");
			public final roundedButton buttonC4 = new roundedButton("C4");
				public final roundedButton buttonC4R1 = new roundedButton("100");
				public final roundedButton buttonC4R2 = new roundedButton("200");
				public final roundedButton buttonC4R3 = new roundedButton("300");
				public final roundedButton buttonC4R4 = new roundedButton("400");
				public final roundedButton buttonC4R5 = new roundedButton("500");
			public final roundedButton buttonC5 = new roundedButton("C5");
				public final roundedButton buttonC5R1 = new roundedButton("100");
				public final roundedButton buttonC5R2 = new roundedButton("200");
				public final roundedButton buttonC5R3 = new roundedButton("300");
				public final roundedButton buttonC5R4 = new roundedButton("400");
				public final roundedButton buttonC5R5 = new roundedButton("500");
			public final roundedButton buttonC6 = new roundedButton("C6");
				public final roundedButton buttonC6R1 = new roundedButton("100");
				public final roundedButton buttonC6R2 = new roundedButton("200");
				public final roundedButton buttonC6R3 = new roundedButton("300");
				public final roundedButton buttonC6R4 = new roundedButton("400");
				public final roundedButton buttonC6R5 = new roundedButton("500");
				
		public final modelPanel questionPanel = new modelPanel();
			private modelPanel answerLabelPanel = new modelPanel();
				public JLabel answerLabel = new JLabel("Answer");
				public roundedButton questionButtonShowAnswer = new roundedButton("Show Answer");
				public roundedButton questionButtonBack = new roundedButton("Back");
				public roundedButton questionButtonContinue = new roundedButton("Continue");
			private modelPanel questionPlayer1Panel = new modelPanel();
				public JLabel questionPlayer1Name = new JLabel("Player 1");
					public roundedButton questionPlayer1Add = new roundedButton("Add");
					public roundedButton questionPlayer1Remove = new roundedButton("Remove");
			private modelPanel questionPlayer2Panel = new modelPanel();
				public JLabel questionPlayer2Name = new JLabel("Player 2");
					public roundedButton questionPlayer2Add = new roundedButton("Add");
					public roundedButton questionPlayer2Remove = new roundedButton("Remove");
			private modelPanel questionPlayer3Panel = new modelPanel();
				public JLabel questionPlayer3Name = new JLabel("Player 3");
					public roundedButton questionPlayer3Add = new roundedButton("Add");
					public roundedButton questionPlayer3Remove = new roundedButton("Remove");
			private modelPanel questionPlayer4Panel = new modelPanel();
				public JLabel questionPlayer4Name = new JLabel("Player 4");
					public roundedButton questionPlayer4Add = new roundedButton("Add");
					public roundedButton questionPlayer4Remove = new roundedButton("Remove");
			private modelPanel questionPlayer5Panel = new modelPanel();
				public JLabel questionPlayer5Name = new JLabel("Player 5");
					public roundedButton questionPlayer5Add = new roundedButton("Add");
					public roundedButton questionPlayer5Remove = new roundedButton("Remove");
					
		public final modelPanel finalMenuPanel = new modelPanel();
			private JLabel finalQuestionTitle = new JLabel("Final Jeopardy");
			public JLabel finalQuestionNumberTitle = new JLabel("0");
			private final modelPanel finalQuestionPanel = new modelPanel();
				public JLabel finalQuestionLabel = new JLabel("Question");
				public roundedButton finalQuestionButtonBack = new roundedButton("Back");
				public roundedTextBox finalAnswerTextBox = new roundedTextBox(true);
				public roundedButton finalQuestionButtonContinue = new roundedButton("Continue");
				

		public final modelPanel finalRevealPanel = new modelPanel();
			private JLabel finalRevealQuestionTitle = new JLabel("Final Jeopardy");
			public JLabel finalRevealQuestionNumberTitle = new JLabel("0");
			private final modelPanel finalRevealQuestionPanel = new modelPanel();
				public JLabel finalRevealQuestionLabel = new JLabel("Question");
				public roundedButton finalRevealQuestionButtonBack = new roundedButton("Back");
				private JLabel finalRevealShowTitle = new JLabel("Show Answer & Worth");
				public roundedButton finalRevealShowAnswer = new roundedButton("Answer");
				public roundedButton finalRevealShowWorth = new roundedButton("Worth");
				public roundedButton finalRevealQuestionButtonContinue = new roundedButton("Continue");
				
		public final modelPanel resultsPanel = new modelPanel();
			public roundedButton buttonPlayAgain = new roundedButton("Play Again");
				

	public adminWindow() {
		frame = new JFrame("JEOPARDY Admin");
		frame.setLocation(800, 200);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "\\Assets\\crown.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		initializeMenu();
		initializeGame();
		initializeFinalGame();
		setPlayerCount(3);
	}

	private void initializeMenu() {
			menuPanel.setBounds(0, 0, 640, 450);
			menuPanel.setLayout(null);
			frame.getContentPane().add(menuPanel);
			
				buttonOpenEditor.setBounds(5, 410, 50, 50);
				buttonOpenEditor.setFont(new Font("Segoe UI Emoji", Font.BOLD, 20));
				buttonOpenEditor.setForeground(Color.decode("#e1b173"));
				menuPanel.add(buttonOpenEditor);
				
				selectCategoriesTitle.setBounds(10, 10, 620, 50);
				selectCategoriesTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				selectCategoriesTitle.setForeground(Color.decode("#e1b173"));
				selectCategoriesTitle.setHorizontalAlignment(SwingConstants.CENTER);
				menuPanel.add(selectCategoriesTitle);
				
				selectGame1Heading.setBounds(60, 70, 520, 30);
				selectGame1Heading.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
				selectGame1Heading.setForeground(Color.decode("#e1b173"));
				selectGame1Heading.setHorizontalAlignment(SwingConstants.LEFT);
				menuPanel.add(selectGame1Heading);
				
					selectGame1Category1.setBounds(70, 110, 160, 30);
					menuPanel.add(selectGame1Category1);
					
					selectGame1Category2.setBounds(240, 110, 160, 30);
					menuPanel.add(selectGame1Category2);
					
					selectGame1Category3.setBounds(410, 110, 160, 30);
					menuPanel.add(selectGame1Category3);
					
					selectGame1Category4.setBounds(70, 150, 160, 30);
					menuPanel.add(selectGame1Category4);
					
					selectGame1Category5.setBounds(240, 150, 160, 30);
					menuPanel.add(selectGame1Category5);
					
					selectGame1Category6.setBounds(410, 150, 160, 30);
					menuPanel.add(selectGame1Category6);
				
				selectGame2Heading.setBounds(60, 190, 520, 30);
				selectGame2Heading.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
				selectGame2Heading.setForeground(Color.decode("#e1b173"));
				selectGame2Heading.setHorizontalAlignment(SwingConstants.LEFT);
				menuPanel.add(selectGame2Heading);
				
					selectGame2Category1.setBounds(70, 230, 160, 30);
					menuPanel.add(selectGame2Category1);
					
					selectGame2Category2.setBounds(240, 230, 160, 30);
					menuPanel.add(selectGame2Category2);
					
					selectGame2Category3.setBounds(410, 230, 160, 30);
					menuPanel.add(selectGame2Category3);
					
					selectGame2Category4.setBounds(70, 270, 160, 30);
					menuPanel.add(selectGame2Category4);
					
					selectGame2Category5.setBounds(240, 270, 160, 30);
					menuPanel.add(selectGame2Category5);
					
					selectGame2Category6.setBounds(410, 270, 160, 30);
					menuPanel.add(selectGame2Category6);
				
				selectGame3Heading.setBounds(70, 320, 220, 30);
				selectGame3Heading.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
				selectGame3Heading.setForeground(Color.decode("#e1b173"));
				selectGame3Heading.setHorizontalAlignment(SwingConstants.CENTER);
				menuPanel.add(selectGame3Heading);
				
					selectFinalJeopardy.setBounds(350, 320, 220, 30);
					menuPanel.add(selectFinalJeopardy);
				
				menuBanner.setBounds(10, 10, 620, 260);
				menuBanner.setRadius(100);
				menuBanner.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				menuPanel.add(menuBanner);
				
					selectPlayerCount3.setBounds(10, 280, 200, 75);
					selectPlayerCount3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
					selectPlayerCount3.setColor(Color.decode("#e1b173"));
					selectPlayerCount3.setTextColor(Color.decode("#38075d"));
					menuPanel.add(selectPlayerCount3);
					
					selectPlayerCount4.setBounds(220, 280, 200, 75);
					selectPlayerCount4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
					selectPlayerCount4.setColor(Color.decode("#e1b173"));
					selectPlayerCount4.setTextColor(Color.decode("#38075d"));
					menuPanel.add(selectPlayerCount4);
					
					selectPlayerCount5.setBounds(430, 280, 200, 75);
					selectPlayerCount5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
					selectPlayerCount5.setColor(Color.decode("#e1b173"));
					selectPlayerCount5.setTextColor(Color.decode("#38075d"));
					menuPanel.add(selectPlayerCount5);
					
					setPlayerName1.setBounds(10, 280, 200, 75);
					menuPanel.add(setPlayerName1);
					
					setPlayerName2.setBounds(220, 280, 200, 75);
					menuPanel.add(setPlayerName2);
					
					setPlayerName3.setBounds(430, 280, 200, 75);
					menuPanel.add(setPlayerName3);
					
					setPlayerName4.setBounds(110, 365, 200, 75);
					menuPanel.add(setPlayerName4);
					
					setPlayerName5.setBounds(320, 365, 200, 75);
					menuPanel.add(setPlayerName5);

				buttonBack.setBounds(10, 365, 300, 75);
				buttonBack.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
				buttonBack.setColor(Color.decode("#e1b173"));
				buttonBack.setTextColor(Color.decode("#38075d"));
				menuPanel.add(buttonBack);

				buttonContinue.setBounds(330, 365, 300, 75);
				buttonContinue.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
				buttonContinue.setColor(Color.decode("#e1b173"));
				buttonContinue.setTextColor(Color.decode("#38075d"));
				menuPanel.add(buttonContinue);
	}
	
 	private void initializeGame() {
			gamePanel.setBounds(0, 0, 1030, 540);
			gamePanel.setLayout(null);
			frame.getContentPane().add(gamePanel);
			
				title.setBounds(10, 11, 1010, 100);
				title.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
				title.setForeground(Color.decode("#e1b173"));
				title.setHorizontalAlignment(SwingConstants.CENTER);
				gamePanel.add(title);
				
				buttonC1.setBounds(10, 120, 160, 60);
				buttonC1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
				buttonC1.setTextColor(Color.decode("#FFFFFF"));
				buttonC1.setSelectable(false);
				gamePanel.add(buttonC1);
				
					buttonC1R1.setBounds(10, 190, 160, 60);
					gamePanel.add(buttonC1R1);
					
					buttonC1R2.setBounds(10, 260, 160, 60);
					gamePanel.add(buttonC1R2);
					
					buttonC1R3.setBounds(10, 330, 160, 60);
					gamePanel.add(buttonC1R3);
					
					buttonC1R4.setBounds(10, 400, 160, 60);
					gamePanel.add(buttonC1R4);
					
					buttonC1R5.setBounds(10, 470, 160, 60);
					gamePanel.add(buttonC1R5);
				
				buttonC2.setBounds(180, 120, 160, 60);
				buttonC2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
				buttonC2.setTextColor(Color.decode("#FFFFFF"));
				buttonC2.setSelectable(false);
				gamePanel.add(buttonC2);
		
					buttonC2R1.setBounds(180, 190, 160, 60);
					gamePanel.add(buttonC2R1);
					
					buttonC2R2.setBounds(180, 260, 160, 60);
					gamePanel.add(buttonC2R2);
					
					buttonC2R3.setBounds(180, 330, 160, 60);
					gamePanel.add(buttonC2R3);
					
					buttonC2R4.setBounds(180, 400, 160, 60);
					gamePanel.add(buttonC2R4);
					
					buttonC2R5.setBounds(180, 470, 160, 60);
					gamePanel.add(buttonC2R5);
				
				buttonC3.setBounds(350, 120, 160, 60);
				buttonC3.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
				buttonC3.setTextColor(Color.decode("#FFFFFF"));
				buttonC3.setSelectable(false);
				gamePanel.add(buttonC3);
		
					buttonC3R1.setBounds(350, 190, 160, 60);
					gamePanel.add(buttonC3R1);
					
					buttonC3R2.setBounds(350, 260, 160, 60);
					gamePanel.add(buttonC3R2);
					
					buttonC3R3.setBounds(350, 330, 160, 60);
					gamePanel.add(buttonC3R3);
					
					buttonC3R4.setBounds(350, 400, 160, 60);
					gamePanel.add(buttonC3R4);
					
					buttonC3R5.setBounds(350, 470, 160, 60);
					gamePanel.add(buttonC3R5);
				
				buttonC4.setBounds(520, 120, 160, 60);
				buttonC4.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
				buttonC4.setTextColor(Color.decode("#FFFFFF"));
				buttonC4.setSelectable(false);
				gamePanel.add(buttonC4);
		
					buttonC4R1.setBounds(520, 190, 160, 60);
					gamePanel.add(buttonC4R1);
					
					buttonC4R2.setBounds(520, 260, 160, 60);
					gamePanel.add(buttonC4R2);
					
					buttonC4R3.setBounds(520, 330, 160, 60);
					gamePanel.add(buttonC4R3);
					
					buttonC4R4.setBounds(520, 400, 160, 60);
					gamePanel.add(buttonC4R4);
					
					buttonC4R5.setBounds(520, 470, 160, 60);
					gamePanel.add(buttonC4R5);
				
				buttonC5.setBounds(690, 120, 160, 60);
				buttonC5.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
				buttonC5.setTextColor(Color.decode("#FFFFFF"));
				buttonC5.setSelectable(false);
				gamePanel.add(buttonC5);
		
					buttonC5R1.setBounds(690, 190, 160, 60);
					gamePanel.add(buttonC5R1);
					
					buttonC5R2.setBounds(690, 260, 160, 60);
					gamePanel.add(buttonC5R2);
					
					buttonC5R3.setBounds(690, 330, 160, 60);
					gamePanel.add(buttonC5R3);
					
					buttonC5R4.setBounds(690, 400, 160, 60);
					gamePanel.add(buttonC5R4);
					
					buttonC5R5.setBounds(690, 470, 160, 60);
					gamePanel.add(buttonC5R5);
				
				buttonC6.setBounds(860, 120, 160, 60);
				buttonC6.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
				buttonC6.setTextColor(Color.decode("#FFFFFF"));
				buttonC6.setSelectable(false);
				gamePanel.add(buttonC6);
		
					buttonC6R1.setBounds(860, 190, 160, 60);
					gamePanel.add(buttonC6R1);
					
					buttonC6R2.setBounds(860, 260, 160, 60);
					gamePanel.add(buttonC6R2);
					
					buttonC6R3.setBounds(860, 330, 160, 60);
					gamePanel.add(buttonC6R3);
					
					buttonC6R4.setBounds(860, 400, 160, 60);
					gamePanel.add(buttonC6R4);
					
					buttonC6R5.setBounds(860, 470, 160, 60);
					gamePanel.add(buttonC6R5);
					
			questionPanel.setBounds(0, 0, 1030, 540);
			questionPanel.setLayout(null);
			frame.getContentPane().add(questionPanel);
			
				answerLabelPanel.setBounds(10, 70, 1010, 325);
				answerLabelPanel.setLayout(null);
				answerLabelPanel.setColor(answerLabelPanel.getColor().brighter());
				answerLabelPanel.setRadius(25);
				questionPanel.add(answerLabelPanel);
			
					answerLabel.setBounds(10, 10, 990, 235);
					answerLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
					answerLabel.setForeground(Color.decode("#e1b173"));
					answerLabel.setHorizontalAlignment(SwingConstants.CENTER);
					answerLabelPanel.add(answerLabel);
				
					questionButtonShowAnswer.setBounds(350, 255, 320, 60);
					questionButtonShowAnswer.setFont(new Font(questionButtonShowAnswer.getFont().getName(), questionButtonShowAnswer.getFont().getStyle(), 25));
					answerLabelPanel.add(questionButtonShowAnswer);
					
					questionButtonBack.setBounds(10, 255, 120, 60);
					questionButtonBack.setFont(new Font(questionButtonBack.getFont().getName(), questionButtonBack.getFont().getStyle(), 25));
					questionButtonBack.setColor(Color.decode("#e1b173"));
					questionButtonBack.setTextColor(Color.decode("#38075d"));
					answerLabelPanel.add(questionButtonBack);
					
					questionButtonContinue.setBounds(840, 255, 160, 60);
					questionButtonContinue.setFont(new Font(questionButtonContinue.getFont().getName(), questionButtonContinue.getFont().getStyle(), 25));
					questionButtonContinue.setColor(Color.decode("#e1b173"));
					questionButtonContinue.setTextColor(Color.decode("#38075d"));
					answerLabelPanel.add(questionButtonContinue);
				
				questionPlayer1Panel.setBounds(5, 405, 200, 130);
				questionPlayer1Panel.setLayout(null);
				questionPlayer1Panel.setColor(questionPlayer1Panel.getColor().brighter());
				questionPlayer1Panel.setRadius(25);
				questionPanel.add(questionPlayer1Panel);
				
					questionPlayer1Name.setBounds(10, 10, 182, 60);
					questionPlayer1Name.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
					questionPlayer1Name.setForeground(Color.decode("#e1b173"));
					questionPlayer1Name.setHorizontalAlignment(SwingConstants.CENTER);
					questionPlayer1Panel.add(questionPlayer1Name);
					
					questionPlayer1Add.setBounds(5, 80, 80, 40);
					questionPlayer1Add.setFont(new Font(questionPlayer1Add.getFont().getName(), questionPlayer1Add.getFont().getStyle(), 18));
					questionPlayer1Panel.add(questionPlayer1Add);
					
					questionPlayer1Remove.setBounds(95, 80, 100, 40);
					questionPlayer1Remove.setFont(new Font(questionPlayer1Remove.getFont().getName(), questionPlayer1Remove.getFont().getStyle(), 18));
					questionPlayer1Panel.add(questionPlayer1Remove);
					
				questionPlayer2Panel.setBounds(210, 405, 200, 130);
				questionPlayer2Panel.setLayout(null);
				questionPlayer2Panel.setColor(questionPlayer2Panel.getColor().brighter());
				questionPlayer2Panel.setRadius(25);
				questionPanel.add(questionPlayer2Panel);
				
					questionPlayer2Name.setBounds(10, 10, 182, 60);
					questionPlayer2Name.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
					questionPlayer2Name.setForeground(Color.decode("#e1b173"));
					questionPlayer2Name.setHorizontalAlignment(SwingConstants.CENTER);
					questionPlayer2Panel.add(questionPlayer2Name);
					
					questionPlayer2Add.setBounds(5, 80, 80, 40);
					questionPlayer2Add.setFont(new Font(questionPlayer2Add.getFont().getName(), questionPlayer2Add.getFont().getStyle(), 18));
					questionPlayer2Panel.add(questionPlayer2Add);
					
					questionPlayer2Remove.setBounds(95, 80, 100, 40);
					questionPlayer2Remove.setFont(new Font(questionPlayer2Remove.getFont().getName(), questionPlayer2Remove.getFont().getStyle(), 18));
					questionPlayer2Panel.add(questionPlayer2Remove);
					
				questionPlayer3Panel.setBounds(415, 405, 200, 130);
				questionPlayer3Panel.setLayout(null);
				questionPlayer3Panel.setColor(questionPlayer3Panel.getColor().brighter());
				questionPlayer3Panel.setRadius(25);
				questionPanel.add(questionPlayer3Panel);
				
					questionPlayer3Name.setBounds(10, 10, 182, 60);
					questionPlayer3Name.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
					questionPlayer3Name.setForeground(Color.decode("#e1b173"));
					questionPlayer3Name.setHorizontalAlignment(SwingConstants.CENTER);
					questionPlayer3Panel.add(questionPlayer3Name);
					
					questionPlayer3Add.setBounds(5, 80, 80, 40);
					questionPlayer3Add.setFont(new Font(questionPlayer3Add.getFont().getName(), questionPlayer3Add.getFont().getStyle(), 18));
					questionPlayer3Panel.add(questionPlayer3Add);
					
					questionPlayer3Remove.setBounds(95, 80, 100, 40);
					questionPlayer3Remove.setFont(new Font(questionPlayer3Remove.getFont().getName(), questionPlayer3Remove.getFont().getStyle(), 18));
					questionPlayer3Panel.add(questionPlayer3Remove);
					
				questionPlayer4Panel.setBounds(620, 405, 200, 130);
				questionPlayer4Panel.setLayout(null);
				questionPlayer4Panel.setColor(questionPlayer4Panel.getColor().brighter());
				questionPlayer4Panel.setRadius(25);
				questionPanel.add(questionPlayer4Panel);
				
					questionPlayer4Name.setBounds(10, 10, 182, 60);
					questionPlayer4Name.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
					questionPlayer4Name.setForeground(Color.decode("#e1b173"));
					questionPlayer4Name.setHorizontalAlignment(SwingConstants.CENTER);
					questionPlayer4Panel.add(questionPlayer4Name);
					
					questionPlayer4Add.setBounds(5, 80, 80, 40);
					questionPlayer4Add.setFont(new Font(questionPlayer4Add.getFont().getName(), questionPlayer4Add.getFont().getStyle(), 18));
					questionPlayer4Panel.add(questionPlayer4Add);
					
					questionPlayer4Remove.setBounds(95, 80, 100, 40);
					questionPlayer4Remove.setFont(new Font(questionPlayer4Remove.getFont().getName(), questionPlayer4Remove.getFont().getStyle(), 18));
					questionPlayer4Panel.add(questionPlayer4Remove);
					
				questionPlayer5Panel.setBounds(825, 405, 200, 130);
				questionPlayer5Panel.setLayout(null);
				questionPlayer5Panel.setColor(questionPlayer5Panel.getColor().brighter());
				questionPlayer5Panel.setRadius(25);
				questionPanel.add(questionPlayer5Panel);
				
					questionPlayer5Name.setBounds(10, 10, 180, 60);
					questionPlayer5Name.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
					questionPlayer5Name.setForeground(Color.decode("#e1b173"));
					questionPlayer5Name.setHorizontalAlignment(SwingConstants.CENTER);
					questionPlayer5Panel.add(questionPlayer5Name);
					
					questionPlayer5Add.setBounds(5, 80, 80, 40);
					questionPlayer5Add.setFont(new Font(questionPlayer5Add.getFont().getName(), questionPlayer5Add.getFont().getStyle(), 18));
					questionPlayer5Panel.add(questionPlayer5Add);
					
					questionPlayer5Remove.setBounds(95, 80, 100, 40);
					questionPlayer5Remove.setFont(new Font(questionPlayer5Remove.getFont().getName(), questionPlayer5Remove.getFont().getStyle(), 18));
					questionPlayer5Panel.add(questionPlayer5Remove);
	}
 	
 	private void initializeFinalGame() {
		finalMenuPanel.setBounds(0, 0, 1030, 540);
		finalMenuPanel.setLayout(null);
		frame.getContentPane().add(finalMenuPanel);
		
			finalQuestionTitle.setBounds(10, 10, 1010, 40);
			finalQuestionTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
			finalQuestionTitle.setForeground(Color.decode("#e1b173"));
			finalQuestionTitle.setHorizontalAlignment(SwingConstants.CENTER);
			finalMenuPanel.add(finalQuestionTitle);
			
			finalQuestionNumberTitle.setBounds(10, 50, 990, 20);
			finalQuestionNumberTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			finalQuestionNumberTitle.setForeground(Color.decode("#e1b173"));
			finalQuestionNumberTitle.setHorizontalAlignment(SwingConstants.CENTER);
			finalMenuPanel.add(finalQuestionNumberTitle);
		
			finalQuestionPanel.setBounds(50, 80, 930, 440);
			finalQuestionPanel.setLayout(null);
			finalQuestionPanel.setColor(finalQuestionPanel.getColor().brighter());
			finalQuestionPanel.setRadius(100);
			finalMenuPanel.add(finalQuestionPanel);
			
				finalQuestionLabel.setBounds(50, 50, 830, 210);
				finalQuestionLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				finalQuestionLabel.setForeground(Color.decode("#e1b173"));
				finalQuestionLabel.setHorizontalAlignment(SwingConstants.CENTER);
				finalQuestionPanel.add(finalQuestionLabel);
				
				finalQuestionButtonBack.setBounds(50, 330, 160, 60);
				finalQuestionButtonBack.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				finalQuestionButtonBack.setColor(Color.decode("#38075d"));
				finalQuestionButtonBack.setBorderColor(Color.decode("#e1b173"));
				finalQuestionButtonBack.setTextColor(Color.decode("#e1b173"));
				finalQuestionPanel.add(finalQuestionButtonBack);
				
				finalAnswerTextBox.setBounds(305, 345, 320, 60);
				finalAnswerTextBox.setColor(Color.decode("#38075d"));
				finalAnswerTextBox.setBorderColor(Color.decode("#e1b173"));
				finalAnswerTextBox.setTextColor(Color.decode("#e1b173"));
				finalAnswerTextBox.setInset(25);
				finalQuestionPanel.add(finalAnswerTextBox);
				
				finalQuestionButtonContinue.setBounds(720, 330, 160, 60);
				finalQuestionButtonContinue.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				finalQuestionButtonContinue.setColor(Color.decode("#38075d"));
				finalQuestionButtonContinue.setBorderColor(Color.decode("#e1b173"));
				finalQuestionButtonContinue.setTextColor(Color.decode("#e1b173"));
				finalQuestionPanel.add(finalQuestionButtonContinue);

		finalRevealPanel.setBounds(0, 0, 1030, 540);
		finalRevealPanel.setLayout(null);
		frame.getContentPane().add(finalRevealPanel);
		
			finalRevealQuestionTitle.setBounds(10, 10, 1010, 40);
			finalRevealQuestionTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
			finalRevealQuestionTitle.setForeground(Color.decode("#e1b173"));
			finalRevealQuestionTitle.setHorizontalAlignment(SwingConstants.CENTER);
			finalRevealPanel.add(finalRevealQuestionTitle);
			
			finalRevealQuestionNumberTitle.setBounds(10, 50, 990, 20);
			finalRevealQuestionNumberTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			finalRevealQuestionNumberTitle.setForeground(Color.decode("#e1b173"));
			finalRevealQuestionNumberTitle.setHorizontalAlignment(SwingConstants.CENTER);
			finalRevealPanel.add(finalRevealQuestionNumberTitle);
		
			finalRevealQuestionPanel.setBounds(50, 80, 930, 440);
			finalRevealQuestionPanel.setLayout(null);
			finalRevealQuestionPanel.setColor(finalRevealQuestionPanel.getColor().brighter());
			finalRevealQuestionPanel.setRadius(100);
			finalRevealPanel.add(finalRevealQuestionPanel);
			
				finalRevealQuestionLabel.setBounds(50, 50, 830, 210);
				finalRevealQuestionLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				finalRevealQuestionLabel.setForeground(Color.decode("#e1b173"));
				finalRevealQuestionLabel.setHorizontalAlignment(SwingConstants.CENTER);
				finalRevealQuestionPanel.add(finalRevealQuestionLabel);
				
				finalRevealQuestionButtonBack.setBounds(50, 330, 160, 60);
				finalRevealQuestionButtonBack.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				finalRevealQuestionButtonBack.setColor(Color.decode("#38075d"));
				finalRevealQuestionButtonBack.setBorderColor(Color.decode("#e1b173"));
				finalRevealQuestionButtonBack.setTextColor(Color.decode("#e1b173"));
				finalRevealQuestionPanel.add(finalRevealQuestionButtonBack);
				
				finalRevealShowTitle.setBounds(305, 285, 320, 60);
				finalRevealShowTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				finalRevealShowTitle.setForeground(Color.decode("#e1b173"));
				finalRevealShowTitle.setHorizontalAlignment(SwingConstants.CENTER);
				finalRevealQuestionPanel.add(finalRevealShowTitle);
				
				finalRevealShowAnswer.setBounds(305, 345, 180, 60);
				finalRevealShowAnswer.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				finalRevealShowAnswer.setColor(Color.decode("#38075d"));
				finalRevealShowAnswer.setBorderColor(Color.decode("#e1b173"));
				finalRevealShowAnswer.setTextColor(Color.decode("#e1b173"));
				finalRevealQuestionPanel.add(finalRevealShowAnswer);
				
				finalRevealShowWorth.setBounds(490, 345, 135, 60);
				finalRevealShowWorth.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				finalRevealShowWorth.setColor(Color.decode("#38075d"));
				finalRevealShowWorth.setBorderColor(Color.decode("#e1b173"));
				finalRevealShowWorth.setTextColor(Color.decode("#e1b173"));
				finalRevealQuestionPanel.add(finalRevealShowWorth);
				
				finalRevealQuestionButtonContinue.setBounds(720, 330, 160, 60);
				finalRevealQuestionButtonContinue.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
				finalRevealQuestionButtonContinue.setColor(Color.decode("#38075d"));
				finalRevealQuestionButtonContinue.setBorderColor(Color.decode("#e1b173"));
				finalRevealQuestionButtonContinue.setTextColor(Color.decode("#e1b173"));
				finalRevealQuestionPanel.add(finalRevealQuestionButtonContinue);
				
		resultsPanel.setBounds(0, 0, 1030, 540);
		resultsPanel.setLayout(null);
		frame.getContentPane().add(resultsPanel);
		
			buttonPlayAgain.setBounds(215, 195, 600, 150);
			buttonPlayAgain.setFont(new Font("Comic Sans MS", Font.BOLD, 75));
			buttonPlayAgain.setColor(Color.decode("#38075d"));
			buttonPlayAgain.setBorderColor(Color.decode("#e1b173"));
			buttonPlayAgain.setTextColor(Color.decode("#e1b173"));
			resultsPanel.add(buttonPlayAgain);
 	}

 	public void setPlayerName(int player, String name) {
 		switch (player) {
	 		case 1:	questionPlayer1Name.setText(name);	break;
	 		case 2:	questionPlayer2Name.setText(name);	break;
	 		case 3:	questionPlayer3Name.setText(name);	break;
	 		case 4:	questionPlayer4Name.setText(name);	break;
	 		case 5:	questionPlayer5Name.setText(name);	break;
	 			
 		}
 	}
 	public void setPlayerCount(int count) {
 		if (count == 3) {
 			questionPlayer1Panel.setVisible(true);
 			questionPlayer2Panel.setVisible(true);
 			questionPlayer3Panel.setVisible(true);
 			questionPlayer4Panel.setVisible(false);
 			questionPlayer5Panel.setVisible(false);
 			
 			questionPlayer1Panel.setBounds(110, questionPlayer1Panel.getY(), questionPlayer1Panel.getWidth(), questionPlayer1Panel.getHeight());
 			questionPlayer2Panel.setBounds(415, questionPlayer2Panel.getY(), questionPlayer2Panel.getWidth(), questionPlayer2Panel.getHeight());
 			questionPlayer3Panel.setBounds(720, questionPlayer3Panel.getY(), questionPlayer3Panel.getWidth(), questionPlayer3Panel.getHeight());
 		} else
 		if (count == 4) {
 			questionPlayer1Panel.setVisible(true);
 			questionPlayer2Panel.setVisible(true);
 			questionPlayer3Panel.setVisible(true);
 			questionPlayer4Panel.setVisible(true);
 			questionPlayer5Panel.setVisible(false);
 			
 			questionPlayer1Panel.setBounds(46, questionPlayer1Panel.getY(), questionPlayer1Panel.getWidth(), questionPlayer1Panel.getHeight());
 			questionPlayer2Panel.setBounds(292, questionPlayer2Panel.getY(), questionPlayer2Panel.getWidth(), questionPlayer2Panel.getHeight());
 			questionPlayer3Panel.setBounds(538, questionPlayer3Panel.getY(), questionPlayer3Panel.getWidth(), questionPlayer3Panel.getHeight());
 			questionPlayer4Panel.setBounds(784, questionPlayer4Panel.getY(), questionPlayer4Panel.getWidth(), questionPlayer4Panel.getHeight());
 		} else
 		if (count == 5) {
 			questionPlayer1Panel.setVisible(true);
 			questionPlayer2Panel.setVisible(true);
 			questionPlayer3Panel.setVisible(true);
 			questionPlayer4Panel.setVisible(true);
 			questionPlayer5Panel.setVisible(true);
 			
 			questionPlayer1Panel.setBounds(5, questionPlayer1Panel.getY(), questionPlayer1Panel.getWidth(), questionPlayer1Panel.getHeight());
 			questionPlayer2Panel.setBounds(210, questionPlayer2Panel.getY(), questionPlayer2Panel.getWidth(), questionPlayer2Panel.getHeight());
 			questionPlayer3Panel.setBounds(415, questionPlayer3Panel.getY(), questionPlayer3Panel.getWidth(), questionPlayer3Panel.getHeight());
 			questionPlayer4Panel.setBounds(620, questionPlayer4Panel.getY(), questionPlayer4Panel.getWidth(), questionPlayer4Panel.getHeight());
 			questionPlayer5Panel.setBounds(825, questionPlayer5Panel.getY(), questionPlayer5Panel.getWidth(), questionPlayer5Panel.getHeight());
 		}
 	}

	public void setGame(int gameNumber) {
		buttonC1R1.setEnabled(true); buttonC1R1.setSelectable(true);
		buttonC1R2.setEnabled(true); buttonC1R2.setSelectable(true);
		buttonC1R3.setEnabled(true); buttonC1R3.setSelectable(true);
		buttonC1R4.setEnabled(true); buttonC1R4.setSelectable(true);
		buttonC1R5.setEnabled(true); buttonC1R5.setSelectable(true);

		buttonC2R1.setEnabled(true); buttonC2R1.setSelectable(true);
		buttonC2R2.setEnabled(true); buttonC2R2.setSelectable(true);
		buttonC2R3.setEnabled(true); buttonC2R3.setSelectable(true);
		buttonC2R4.setEnabled(true); buttonC2R4.setSelectable(true);
		buttonC2R5.setEnabled(true); buttonC2R5.setSelectable(true);

		buttonC3R1.setEnabled(true); buttonC3R1.setSelectable(true);
		buttonC3R2.setEnabled(true); buttonC3R2.setSelectable(true);
		buttonC3R3.setEnabled(true); buttonC3R3.setSelectable(true);
		buttonC3R4.setEnabled(true); buttonC3R4.setSelectable(true);
		buttonC3R5.setEnabled(true); buttonC3R5.setSelectable(true);

		buttonC4R1.setEnabled(true); buttonC4R1.setSelectable(true);
		buttonC4R2.setEnabled(true); buttonC4R2.setSelectable(true);
		buttonC4R3.setEnabled(true); buttonC4R3.setSelectable(true);
		buttonC4R4.setEnabled(true); buttonC4R4.setSelectable(true);
		buttonC4R5.setEnabled(true); buttonC4R5.setSelectable(true);

		buttonC5R1.setEnabled(true); buttonC5R1.setSelectable(true);
		buttonC5R2.setEnabled(true); buttonC5R2.setSelectable(true);
		buttonC5R3.setEnabled(true); buttonC5R3.setSelectable(true);
		buttonC5R4.setEnabled(true); buttonC5R4.setSelectable(true);
		buttonC5R5.setEnabled(true); buttonC5R5.setSelectable(true);

		buttonC6R1.setEnabled(true); buttonC6R1.setSelectable(true);
		buttonC6R2.setEnabled(true); buttonC6R2.setSelectable(true);
		buttonC6R3.setEnabled(true); buttonC6R3.setSelectable(true);
		buttonC6R4.setEnabled(true); buttonC6R4.setSelectable(true);
		buttonC6R5.setEnabled(true); buttonC6R5.setSelectable(true);
		
		
		switch (gameNumber) {
			case 1:
				buttonC1R1.setText("100");
				buttonC1R2.setText("200");
				buttonC1R3.setText("300");
				buttonC1R4.setText("400");
				buttonC1R5.setText("500");
	
				buttonC2R1.setText("100");
				buttonC2R2.setText("200");
				buttonC2R3.setText("300");
				buttonC2R4.setText("400");
				buttonC2R5.setText("500");
	
				buttonC3R1.setText("100");
				buttonC3R2.setText("200");
				buttonC3R3.setText("300");
				buttonC3R4.setText("400");
				buttonC3R5.setText("500");
	
				buttonC4R1.setText("100");
				buttonC4R2.setText("200");
				buttonC4R3.setText("300");
				buttonC4R4.setText("400");
				buttonC4R5.setText("500");
	
				buttonC5R1.setText("100");
				buttonC5R2.setText("200");
				buttonC5R3.setText("300");
				buttonC5R4.setText("400");
				buttonC5R5.setText("500");
	
				buttonC6R1.setText("100");
				buttonC6R2.setText("200");
				buttonC6R3.setText("300");
				buttonC6R4.setText("400");
				buttonC6R5.setText("500");
				
				questionPlayer1Name.setText(setPlayerName1.getText());
				questionPlayer2Name.setText(setPlayerName2.getText());
				questionPlayer3Name.setText(setPlayerName3.getText());
				questionPlayer4Name.setText(setPlayerName4.getText());
				questionPlayer5Name.setText(setPlayerName5.getText());
				break;
			case 2:
				buttonC1R1.setText("200");
				buttonC1R2.setText("400");
				buttonC1R3.setText("600");
				buttonC1R4.setText("800");
				buttonC1R5.setText("1000");
	
				buttonC2R1.setText("200");
				buttonC2R2.setText("400");
				buttonC2R3.setText("600");
				buttonC2R4.setText("800");
				buttonC2R5.setText("1000");
	
				buttonC3R1.setText("200");
				buttonC3R2.setText("400");
				buttonC3R3.setText("600");
				buttonC3R4.setText("800");
				buttonC3R5.setText("1000");
	
				buttonC4R1.setText("200");
				buttonC4R2.setText("400");
				buttonC4R3.setText("600");
				buttonC4R4.setText("800");
				buttonC4R5.setText("1000");
	
				buttonC5R1.setText("200");
				buttonC5R2.setText("400");
				buttonC5R3.setText("600");
				buttonC5R4.setText("800");
				buttonC5R5.setText("1000");
	
				buttonC6R1.setText("200");
				buttonC6R2.setText("400");
				buttonC6R3.setText("600");
				buttonC6R4.setText("800");
				buttonC6R5.setText("1000");
				break;
			case 3:
				break;
			case 4:
				break;
		}
	}
	
	public void disableQuestion(String question) {
		switch (question) {
 		case "C1R1":
 			buttonC1R1.setEnabled(false);
 			buttonC1R1.setSelectable(false);
 			break;
 		case "C1R2":
 			buttonC1R2.setEnabled(false);
 			buttonC1R2.setSelectable(false);
 			break;
 		case "C1R3":
 			buttonC1R3.setEnabled(false);
 			buttonC1R3.setSelectable(false);
 			break;
 		case "C1R4":
 			buttonC1R4.setEnabled(false);
 			buttonC1R4.setSelectable(false);
 			break;
 		case "C1R5":
 			buttonC1R5.setEnabled(false);
 			buttonC1R5.setSelectable(false);
 			break;
 			
 		case "C2R1":
 			buttonC2R1.setEnabled(false);
 			buttonC2R1.setSelectable(false);
 			break;
 		case "C2R2":
 			buttonC2R2.setEnabled(false);
 			buttonC2R2.setSelectable(false);
 			break;
 		case "C2R3":
 			buttonC2R3.setEnabled(false);
 			buttonC2R3.setSelectable(false);
 			break;
 		case "C2R4":
 			buttonC2R4.setEnabled(false);
 			buttonC2R4.setSelectable(false);
 			break;
 		case "C2R5":
 			buttonC2R5.setEnabled(false);
 			buttonC2R5.setSelectable(false);
 			break;
 			
 		case "C3R1":
 			buttonC3R1.setEnabled(false);
 			buttonC3R1.setSelectable(false);
 			break;
 		case "C3R2":
 			buttonC3R2.setEnabled(false);
 			buttonC3R2.setSelectable(false);
 			break;
 		case "C3R3":
 			buttonC3R3.setEnabled(false);
 			buttonC3R3.setSelectable(false);
 			break;
 		case "C3R4":
 			buttonC3R4.setEnabled(false);
 			buttonC3R4.setSelectable(false);
 			break;
 		case "C3R5":
 			buttonC3R5.setEnabled(false);
 			buttonC3R5.setSelectable(false);
 			break;
 			
 		case "C4R1":
 			buttonC4R1.setEnabled(false);
 			buttonC4R1.setSelectable(false);
 			break;
 		case "C4R2":
 			buttonC4R2.setEnabled(false);
 			buttonC4R2.setSelectable(false);
 			break;
 		case "C4R3":
 			buttonC4R3.setEnabled(false);
 			buttonC4R3.setSelectable(false);
 			break;
 		case "C4R4":
 			buttonC4R4.setEnabled(false);
 			buttonC4R4.setSelectable(false);
 			break;
 		case "C4R5":
 			buttonC4R5.setEnabled(false);
 			buttonC4R5.setSelectable(false);
 			break;
 			
 		case "C5R1":
 			buttonC5R1.setEnabled(false);
 			buttonC5R1.setSelectable(false);
 			break;
 		case "C5R2":
 			buttonC5R2.setEnabled(false);
 			buttonC5R2.setSelectable(false);
 			break;
 		case "C5R3":
 			buttonC5R3.setEnabled(false);
 			buttonC5R3.setSelectable(false);
 			break;
 		case "C5R4":
 			buttonC5R4.setEnabled(false);
 			buttonC5R4.setSelectable(false);
 			break;
 		case "C5R5":
 			buttonC5R5.setEnabled(false);
 			buttonC5R5.setSelectable(false);
 			break;
 			
 		case "C6R1":
 			buttonC6R1.setEnabled(false);
 			buttonC6R1.setSelectable(false);
 			break;
 		case "C6R2":
 			buttonC6R2.setEnabled(false);
 			buttonC6R2.setSelectable(false);
 			break;
 		case "C6R3":
 			buttonC6R3.setEnabled(false);
 			buttonC6R3.setSelectable(false);
 			break;
 		case "C6R4":
 			buttonC6R4.setEnabled(false);
 			buttonC6R4.setSelectable(false);
 			break;
 		case "C6R5":
 			buttonC6R5.setEnabled(false);
 			buttonC6R5.setSelectable(false);
 			break;
		}
	}
}
