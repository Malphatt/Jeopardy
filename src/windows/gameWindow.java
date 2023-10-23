package windows;

import javax.swing.JFrame;

import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import components.modelPanel;
import components.roundedButton;

import java.awt.Color;
import java.awt.Font;

public class gameWindow {

	public JFrame frame;
		public final modelPanel menuPanel = new modelPanel();
			JLabel menuTitle = new JLabel("JEOPARDY");
	
		public final modelPanel gamePanel = new modelPanel();
			JLabel title = new JLabel("JEOPARDY");
			public final roundedButton buttonC1 = new roundedButton("C1");
				private final roundedButton buttonC1R1 = new roundedButton("100");
				private final roundedButton buttonC1R2 = new roundedButton("200");
				private final roundedButton buttonC1R3 = new roundedButton("300");
				private final roundedButton buttonC1R4 = new roundedButton("400");
				private final roundedButton buttonC1R5 = new roundedButton("500");
			public final roundedButton buttonC2 = new roundedButton("C2");
				private final roundedButton buttonC2R1 = new roundedButton("100");
				private final roundedButton buttonC2R2 = new roundedButton("200");
				private final roundedButton buttonC2R3 = new roundedButton("300");
				private final roundedButton buttonC2R4 = new roundedButton("400");
				private final roundedButton buttonC2R5 = new roundedButton("500");
			public final roundedButton buttonC3 = new roundedButton("C3");
				private final roundedButton buttonC3R1 = new roundedButton("100");
				private final roundedButton buttonC3R2 = new roundedButton("200");
				private final roundedButton buttonC3R3 = new roundedButton("300");
				private final roundedButton buttonC3R4 = new roundedButton("400");
				private final roundedButton buttonC3R5 = new roundedButton("500");
			public final roundedButton buttonC4 = new roundedButton("C4");
				private final roundedButton buttonC4R1 = new roundedButton("100");
				private final roundedButton buttonC4R2 = new roundedButton("200");
				private final roundedButton buttonC4R3 = new roundedButton("300");
				private final roundedButton buttonC4R4 = new roundedButton("400");
				private final roundedButton buttonC4R5 = new roundedButton("500");
			public final roundedButton buttonC5 = new roundedButton("C5");
				private final roundedButton buttonC5R1 = new roundedButton("100");
				private final roundedButton buttonC5R2 = new roundedButton("200");
				private final roundedButton buttonC5R3 = new roundedButton("300");
				private final roundedButton buttonC5R4 = new roundedButton("400");
				private final roundedButton buttonC5R5 = new roundedButton("500");
			public final roundedButton buttonC6 = new roundedButton("C6");
				private final roundedButton buttonC6R1 = new roundedButton("100");
				private final roundedButton buttonC6R2 = new roundedButton("200");
				private final roundedButton buttonC6R3 = new roundedButton("300");
				private final roundedButton buttonC6R4 = new roundedButton("400");
				private final roundedButton buttonC6R5 = new roundedButton("500");

		public final modelPanel questionPanel = new modelPanel();
			public JLabel questionTitle = new JLabel("Category Name");
			public JLabel questionWorthTitle = new JLabel("Worth");
			public final modelPanel questionPicturePanel = new modelPanel();
				public JLabel questionPicture = new JLabel();
			public final modelPanel questionLabelPanel = new modelPanel();
				public JLabel questionLabel = new JLabel("Question");
		
		public final modelPanel answerPanel = new modelPanel();
			public JLabel answerTitle = new JLabel("Category Name");
			public JLabel answerWorthTitle = new JLabel("Worth");
			public final modelPanel answerPicturePanel = new modelPanel();
				public JLabel answerPicture = new JLabel();
			public final modelPanel answerLabelPanel = new modelPanel();
				public JLabel answerLabel = new JLabel("Answer");
				
		public final modelPanel finalMenuPanel = new modelPanel();
			private JLabel finalMenuPanelTitle = new JLabel("Final Jeopardy");
			
		public final modelPanel finalPanel = new modelPanel();
			private JLabel finalPanelTitle = new JLabel("Final Jeopardy");
			private final modelPanel finalPlayer1Answer1Panel = new modelPanel();
			private final modelPanel finalPlayer1Answer1InnerPanel = new modelPanel();
				public JLabel finalPlayer1Answer1Label = new JLabel("Answer");
				private final modelPanel finalPlayer1Answer1Seperator = new modelPanel();
				public JLabel finalPlayer1Answer1WorthLabel = new JLabel("0");
			private final modelPanel finalPlayer1Answer2Panel = new modelPanel();
			private final modelPanel finalPlayer1Answer2InnerPanel = new modelPanel();
				public JLabel finalPlayer1Answer2Label = new JLabel("Answer");
				private final modelPanel finalPlayer1Answer2Seperator = new modelPanel();
				public JLabel finalPlayer1Answer2WorthLabel = new JLabel("0");
			private final modelPanel finalPlayer1Answer3Panel = new modelPanel();
			private final modelPanel finalPlayer1Answer3InnerPanel = new modelPanel();
				public JLabel finalPlayer1Answer3Label = new JLabel("Answer");
				private final modelPanel finalPlayer1Answer3Seperator = new modelPanel();
				public JLabel finalPlayer1Answer3WorthLabel = new JLabel("0");
			private final modelPanel finalPlayer1Answer4Panel = new modelPanel();
			private final modelPanel finalPlayer1Answer4InnerPanel = new modelPanel();
				public JLabel finalPlayer1Answer4Label = new JLabel("Answer");
				private final modelPanel finalPlayer1Answer4Seperator = new modelPanel();
				public JLabel finalPlayer1Answer4WorthLabel = new JLabel("0");
			private final modelPanel finalPlayer1Answer5Panel = new modelPanel();
			private final modelPanel finalPlayer1Answer5InnerPanel = new modelPanel();
				public JLabel finalPlayer1Answer5Label = new JLabel("Answer");
				private final modelPanel finalPlayer1Answer5Seperator = new modelPanel();
				public JLabel finalPlayer1Answer5WorthLabel = new JLabel("0");

			private final modelPanel finalPlayer2Answer1Panel = new modelPanel();
			private final modelPanel finalPlayer2Answer1InnerPanel = new modelPanel();
				public JLabel finalPlayer2Answer1Label = new JLabel("Answer");
				private final modelPanel finalPlayer2Answer1Seperator = new modelPanel();
				public JLabel finalPlayer2Answer1WorthLabel = new JLabel("0");
			private final modelPanel finalPlayer2Answer2Panel = new modelPanel();
			private final modelPanel finalPlayer2Answer2InnerPanel = new modelPanel();
				public JLabel finalPlayer2Answer2Label = new JLabel("Answer");
				private final modelPanel finalPlayer2Answer2Seperator = new modelPanel();
				public JLabel finalPlayer2Answer2WorthLabel = new JLabel("0");
			private final modelPanel finalPlayer2Answer3Panel = new modelPanel();
			private final modelPanel finalPlayer2Answer3InnerPanel = new modelPanel();
				public JLabel finalPlayer2Answer3Label = new JLabel("Answer");
				private final modelPanel finalPlayer2Answer3Seperator = new modelPanel();
				public JLabel finalPlayer2Answer3WorthLabel = new JLabel("0");
			private final modelPanel finalPlayer2Answer4Panel = new modelPanel();
			private final modelPanel finalPlayer2Answer4InnerPanel = new modelPanel();
				public JLabel finalPlayer2Answer4Label = new JLabel("Answer");
				private final modelPanel finalPlayer2Answer4Seperator = new modelPanel();
				public JLabel finalPlayer2Answer4WorthLabel = new JLabel("0");
			private final modelPanel finalPlayer2Answer5Panel = new modelPanel();
			private final modelPanel finalPlayer2Answer5InnerPanel = new modelPanel();
				public JLabel finalPlayer2Answer5Label = new JLabel("Answer");
				private final modelPanel finalPlayer2Answer5Seperator = new modelPanel();
				public JLabel finalPlayer2Answer5WorthLabel = new JLabel("0");
				
		public final modelPanel resultsPanel = new modelPanel();
			public JLabel resultLabel = new JLabel("<Player_Name> Wins!");
			
	
	public gameWindow() {
		initializeGame();
		initializeFinal();
	}

	private void initializeGame() {
		frame = new JFrame("JEOPARDY");
		frame.setBounds(35, 100, 2486, 1219);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "\\Assets\\crown.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
			menuPanel.setBounds(0, 0, 2470, 1180);
			menuPanel.setLayout(null);
			frame.getContentPane().add(menuPanel);
			
				menuTitle.setBounds(10, 400, 2450, 500);
				menuTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 200));
				menuTitle.setForeground(Color.decode("#e1b173"));
				menuTitle.setHorizontalAlignment(SwingConstants.CENTER);
				menuPanel.add(menuTitle);
		
			gamePanel.setBounds(0, 0, 2470, 1180);
			gamePanel.setLayout(null);
			frame.getContentPane().add(gamePanel);
			
				title.setBounds(10, 11, 2450, 200);
				title.setFont(new Font("Comic Sans MS", Font.BOLD, 100));
				title.setForeground(Color.decode("#e1b173"));
				title.setHorizontalAlignment(SwingConstants.CENTER);
				gamePanel.add(title);
				
				buttonC1.setBounds(10, 220, 400, 150);
				buttonC1.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
				buttonC1.setTextColor(Color.decode("#FFFFFF"));
				buttonC1.setSelectable(false);
				gamePanel.add(buttonC1);
				
					buttonC1R1.setBounds(10, 380, 400, 150);
					buttonC1R1.setSelectable(false);
					gamePanel.add(buttonC1R1);
					
					buttonC1R2.setBounds(10, 540, 400, 150);
					buttonC1R2.setSelectable(false);
					gamePanel.add(buttonC1R2);
					
					buttonC1R3.setBounds(10, 700, 400, 150);
					buttonC1R3.setSelectable(false);
					gamePanel.add(buttonC1R3);
					
					buttonC1R4.setBounds(10, 860, 400, 150);
					buttonC1R4.setSelectable(false);
					gamePanel.add(buttonC1R4);
					
					buttonC1R5.setBounds(10, 1020, 400, 150);
					buttonC1R5.setSelectable(false);
					gamePanel.add(buttonC1R5);
				
				buttonC2.setBounds(420, 222, 400, 150);
				buttonC2.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
				buttonC2.setTextColor(Color.decode("#FFFFFF"));
				buttonC2.setSelectable(false);
				gamePanel.add(buttonC2);
		
					buttonC2R1.setBounds(420, 380, 400, 150);
					buttonC2R1.setSelectable(false);
					gamePanel.add(buttonC2R1);
					
					buttonC2R2.setBounds(420, 540, 400, 150);
					buttonC2R2.setSelectable(false);
					gamePanel.add(buttonC2R2);
					
					buttonC2R3.setBounds(420, 700, 400, 150);
					buttonC2R3.setSelectable(false);
					gamePanel.add(buttonC2R3);
					
					buttonC2R4.setBounds(420, 860, 400, 150);
					buttonC2R4.setSelectable(false);
					gamePanel.add(buttonC2R4);
					
					buttonC2R5.setBounds(420, 1020, 400, 150);
					buttonC2R5.setSelectable(false);
					gamePanel.add(buttonC2R5);
				
				buttonC3.setBounds(830, 222, 400, 150);
				buttonC3.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
				buttonC3.setTextColor(Color.decode("#FFFFFF"));
				buttonC3.setSelectable(false);
				gamePanel.add(buttonC3);
		
					buttonC3R1.setBounds(830, 380, 400, 150);
					buttonC3R1.setSelectable(false);
					gamePanel.add(buttonC3R1);
					
					buttonC3R2.setBounds(830, 540, 400, 150);
					buttonC3R2.setSelectable(false);
					gamePanel.add(buttonC3R2);
					
					buttonC3R3.setBounds(830, 700, 400, 150);
					buttonC3R3.setSelectable(false);
					gamePanel.add(buttonC3R3);
					
					buttonC3R4.setBounds(830, 860, 400, 150);
					buttonC3R4.setSelectable(false);
					gamePanel.add(buttonC3R4);
					
					buttonC3R5.setBounds(830, 1020, 400, 150);
					buttonC3R5.setSelectable(false);
					gamePanel.add(buttonC3R5);
				
				buttonC4.setBounds(1240, 222, 400, 150);
				buttonC4.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
				buttonC4.setTextColor(Color.decode("#FFFFFF"));
				buttonC4.setSelectable(false);
				gamePanel.add(buttonC4);
		
					buttonC4R1.setBounds(1240, 380, 400, 150);
					buttonC4R1.setSelectable(false);
					gamePanel.add(buttonC4R1);
					
					buttonC4R2.setBounds(1240, 540, 400, 150);
					buttonC4R2.setSelectable(false);
					gamePanel.add(buttonC4R2);
					
					buttonC4R3.setBounds(1240, 700, 400, 150);
					buttonC4R3.setSelectable(false);
					gamePanel.add(buttonC4R3);
					
					buttonC4R4.setBounds(1240, 860, 400, 150);
					buttonC4R4.setSelectable(false);
					gamePanel.add(buttonC4R4);
					
					buttonC4R5.setBounds(1240, 1020, 400, 150);
					buttonC4R5.setSelectable(false);
					gamePanel.add(buttonC4R5);
				
				buttonC5.setBounds(1650, 222, 400, 150);
				buttonC5.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
				buttonC5.setTextColor(Color.decode("#FFFFFF"));
				buttonC5.setSelectable(false);
				gamePanel.add(buttonC5);
		
					buttonC5R1.setBounds(1650, 380, 400, 150);
					buttonC5R1.setSelectable(false);
					gamePanel.add(buttonC5R1);
					
					buttonC5R2.setBounds(1650, 540, 400, 150);
					buttonC5R2.setSelectable(false);
					gamePanel.add(buttonC5R2);
					
					buttonC5R3.setBounds(1650, 700, 400, 150);
					buttonC5R3.setSelectable(false);
					gamePanel.add(buttonC5R3);
					
					buttonC5R4.setBounds(1650, 860, 400, 150);
					buttonC5R4.setSelectable(false);
					gamePanel.add(buttonC5R4);
					
					buttonC5R5.setBounds(1650, 1020, 400, 150);
					buttonC5R5.setSelectable(false);
					gamePanel.add(buttonC5R5);
				
				buttonC6.setBounds(2060, 222, 400, 150);
				buttonC6.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
				buttonC6.setTextColor(Color.decode("#FFFFFF"));
				buttonC6.setSelectable(false);
				gamePanel.add(buttonC6);
		
					buttonC6R1.setBounds(2060, 380, 400, 150);
					buttonC6R1.setSelectable(false);
					gamePanel.add(buttonC6R1);
					
					buttonC6R2.setBounds(2060, 540, 400, 150);
					buttonC6R2.setSelectable(false);
					gamePanel.add(buttonC6R2);
					
					buttonC6R3.setBounds(2060, 700, 400, 150);
					buttonC6R3.setSelectable(false);
					gamePanel.add(buttonC6R3);
					
					buttonC6R4.setBounds(2060, 860, 400, 150);
					buttonC6R4.setSelectable(false);
					gamePanel.add(buttonC6R4);
					
					buttonC6R5.setBounds(2060, 1020, 400, 150);
					buttonC6R5.setSelectable(false);
					gamePanel.add(buttonC6R5);
					
			questionPanel.setBounds(0, 0, 2470, 1180);
			questionPanel.setLayout(null);
			frame.getContentPane().add(questionPanel);
			
				questionTitle.setBounds(10, 10, 2450, 140);
				questionTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
				questionTitle.setForeground(Color.decode("#e1b173"));
				questionTitle.setHorizontalAlignment(SwingConstants.CENTER);
				questionPanel.add(questionTitle);
				
				questionWorthTitle.setBounds(10, 160, 2450, 40);
				questionWorthTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				questionWorthTitle.setForeground(Color.decode("#e1b173"));
				questionWorthTitle.setHorizontalAlignment(SwingConstants.CENTER);
				questionPanel.add(questionWorthTitle);
				
				questionPicturePanel.setBounds(10, 220, 1220, 950);
				questionPicturePanel.setLayout(null);
				questionPicturePanel.setColor(Color.decode("#e1b173"));
				questionPicturePanel.setRadius(100);
				questionPanel.add(questionPicturePanel);
				
					questionPicture.setBounds(60, 60, 1100, 830);
					questionPicture.setHorizontalAlignment(SwingConstants.CENTER);
					questionPicture.setVerticalAlignment(SwingConstants.CENTER);
					questionPicturePanel.add(questionPicture);
			
				questionLabelPanel.setBounds(10, 220, 2450, 950);
				questionLabelPanel.setLayout(null);
				questionLabelPanel.setColor(Color.decode("#e1b173"));
				questionLabelPanel.setRadius(100);
				questionPanel.add(questionLabelPanel);
				
					questionLabel.setBounds(110, 110, 2230, 730);
					questionLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
					questionLabel.setForeground(Color.decode("#38075d"));
					questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
					questionLabelPanel.add(questionLabel);
			
			answerPanel.setBounds(0, 0, 2470, 1180);
			answerPanel.setLayout(null);
			frame.getContentPane().add(answerPanel);
			
				answerTitle.setBounds(10, 10, 2450, 140);
				answerTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 80));
				answerTitle.setForeground(Color.decode("#e1b173"));
				answerTitle.setHorizontalAlignment(SwingConstants.CENTER);
				answerPanel.add(answerTitle);
				
				answerWorthTitle.setBounds(10, 160, 2450, 40);
				answerWorthTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				answerWorthTitle.setForeground(Color.decode("#e1b173"));
				answerWorthTitle.setHorizontalAlignment(SwingConstants.CENTER);
				answerPanel.add(answerWorthTitle);
				
				answerPicturePanel.setBounds(10, 220, 1220, 950);
				answerPicturePanel.setLayout(null);
				answerPicturePanel.setColor(Color.decode("#e1b173"));
				answerPicturePanel.setRadius(100);
				answerPanel.add(answerPicturePanel);
				
					answerPicture.setBounds(60, 60, 1100, 830);
					answerPicture.setHorizontalAlignment(SwingConstants.CENTER);
					answerPicture.setVerticalAlignment(SwingConstants.CENTER);
					answerPicturePanel.add(answerPicture);
				
				answerLabelPanel.setBounds(10, 220, 2450, 950);
				answerLabelPanel.setLayout(null);
				answerLabelPanel.setColor(Color.decode("#e1b173"));
				answerLabelPanel.setRadius(100);
				answerPanel.add(answerLabelPanel);
				
					answerLabel.setBounds(110, 110, 2230, 730);
					answerLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
					answerLabel.setForeground(Color.decode("#38075d"));
					answerLabel.setHorizontalAlignment(SwingConstants.CENTER);
					answerLabelPanel.add(answerLabel);
			
	}
	
	private void initializeFinal() {
		finalMenuPanel.setBounds(0, 0, 2470, 1180);
		finalMenuPanel.setLayout(null);
		frame.getContentPane().add(finalMenuPanel);
		
			finalMenuPanelTitle.setBounds(10, 400, 2450, 500);
			finalMenuPanelTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 200));
			finalMenuPanelTitle.setForeground(Color.decode("#e1b173"));
			finalMenuPanelTitle.setHorizontalAlignment(SwingConstants.CENTER);
			finalMenuPanel.add(finalMenuPanelTitle);
		
		finalPanel.setBounds(0, 0, 2470, 1180);
		finalPanel.setLayout(null);
		frame.getContentPane().add(finalPanel);
		
			finalPanelTitle.setBounds(700, 50, 1070, 200);
			finalPanelTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 100));
			finalPanelTitle.setForeground(Color.decode("#e1b173"));
			finalPanelTitle.setHorizontalAlignment(SwingConstants.CENTER);
			finalPanel.add(finalPanelTitle);
			
			int innerPanelBorderThickness = 10;
		
		// Player 1 Answers
			finalPlayer1Answer1Panel.setBounds(50, 90, 640, 160);
			finalPlayer1Answer1Panel.setColor(Color.decode("#e1b173"));
			finalPlayer1Answer1Panel.setRadius(finalPlayer1Answer1Panel.getHeight());
			finalPanel.add(finalPlayer1Answer1Panel);
		
			finalPlayer1Answer1InnerPanel.setBounds(finalPlayer1Answer1Panel.getX() + innerPanelBorderThickness,
													finalPlayer1Answer1Panel.getY() + innerPanelBorderThickness,
													finalPlayer1Answer1Panel.getWidth() - (2 * innerPanelBorderThickness),
													finalPlayer1Answer1Panel.getHeight() - (2 * innerPanelBorderThickness));
			finalPlayer1Answer1InnerPanel.setColor(Color.decode("#38075d"));
			finalPlayer1Answer1InnerPanel.setRadius(finalPlayer1Answer1InnerPanel.getHeight());
			finalPanel.add(finalPlayer1Answer1InnerPanel);
			
				finalPlayer1Answer1Label.setBounds(	finalPlayer1Answer1InnerPanel.getX() + 50,
													finalPlayer1Answer1InnerPanel.getY() + 25,
													finalPlayer1Answer1InnerPanel.getWidth() - 300,
													finalPlayer1Answer1InnerPanel.getHeight() - 50);
				finalPlayer1Answer1Label.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer1Answer1Label.setForeground(Color.decode("#e1b173"));
				finalPlayer1Answer1Label.setVerticalAlignment(SwingConstants.CENTER);
				finalPlayer1Answer1Label.setHorizontalAlignment(SwingConstants.CENTER);
				finalPanel.add(finalPlayer1Answer1Label);
				
				finalPlayer1Answer1Seperator.setBounds(	finalPlayer1Answer1InnerPanel.getX() + 50 + finalPlayer1Answer1Label.getWidth() + 25 - 2,
														finalPlayer1Answer1InnerPanel.getY() + 25,
														4,
														finalPlayer1Answer1InnerPanel.getHeight() - 50);
				finalPlayer1Answer1Seperator.setColor(Color.decode("#e1b173"));
				finalPlayer1Answer1Seperator.setRadius(finalPlayer1Answer1Seperator.getWidth());
				finalPanel.add(finalPlayer1Answer1Seperator);
				
				finalPlayer1Answer1WorthLabel.setBounds(finalPlayer1Answer1InnerPanel.getX() + 50 + (finalPlayer1Answer1InnerPanel.getWidth() - 200 - 50),
														finalPlayer1Answer1InnerPanel.getY() + 25,
														finalPlayer1Answer1InnerPanel.getWidth() - finalPlayer1Answer1Label.getWidth() - 100,
														finalPlayer1Answer1InnerPanel.getHeight() - 50);
				finalPlayer1Answer1WorthLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer1Answer1WorthLabel.setForeground(Color.decode("#ffffff"));
				finalPlayer1Answer1WorthLabel.setVerticalAlignment(SwingConstants.CENTER);
				finalPlayer1Answer1WorthLabel.setHorizontalAlignment(SwingConstants.CENTER);
				finalPanel.add(finalPlayer1Answer1WorthLabel);
				
				finalPanel.setComponentZOrder(finalPlayer1Answer1Label, 0);
				finalPanel.setComponentZOrder(finalPlayer1Answer1Seperator, 1);
				finalPanel.setComponentZOrder(finalPlayer1Answer1WorthLabel, 2);
				finalPanel.setComponentZOrder(finalPlayer1Answer1InnerPanel, 3);
				finalPanel.setComponentZOrder(finalPlayer1Answer1Panel, 4);
				
			
			finalPlayer1Answer2Panel.setBounds(50, finalPlayer1Answer1Panel.getY() + finalPlayer1Answer1Panel.getHeight() + 50, 640, 160);
			finalPlayer1Answer2Panel.setColor(Color.decode("#e1b173"));
			finalPlayer1Answer2Panel.setRadius(finalPlayer1Answer2Panel.getHeight());
			finalPanel.add(finalPlayer1Answer2Panel);
		
			finalPlayer1Answer2InnerPanel.setBounds(finalPlayer1Answer2Panel.getX() + innerPanelBorderThickness,
													finalPlayer1Answer2Panel.getY() + innerPanelBorderThickness,
													finalPlayer1Answer2Panel.getWidth() - (2 * innerPanelBorderThickness),
													finalPlayer1Answer2Panel.getHeight() - (2 * innerPanelBorderThickness));
			finalPlayer1Answer2InnerPanel.setColor(Color.decode("#38075d"));
			finalPlayer1Answer2InnerPanel.setRadius(finalPlayer1Answer2InnerPanel.getHeight());
			finalPanel.add(finalPlayer1Answer2InnerPanel);
			
				finalPlayer1Answer2Label.setBounds(	finalPlayer1Answer2InnerPanel.getX() + 50,
													finalPlayer1Answer2InnerPanel.getY() + 25,
													finalPlayer1Answer2InnerPanel.getWidth() - 300,
													finalPlayer1Answer2InnerPanel.getHeight() - 50);
				finalPlayer1Answer2Label.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer1Answer2Label.setForeground(Color.decode("#e1b173"));
				finalPlayer1Answer2Label.setVerticalAlignment(SwingConstants.CENTER);
				finalPlayer1Answer2Label.setHorizontalAlignment(SwingConstants.CENTER);
				finalPanel.add(finalPlayer1Answer2Label);
				
				finalPlayer1Answer2Seperator.setBounds(	finalPlayer1Answer2InnerPanel.getX() + 50 + finalPlayer1Answer2Label.getWidth() + 25 - 2,
														finalPlayer1Answer2InnerPanel.getY() + 25,
														4,
														finalPlayer1Answer2InnerPanel.getHeight() - 50);
				finalPlayer1Answer2Seperator.setColor(Color.decode("#e1b173"));
				finalPlayer1Answer2Seperator.setRadius(finalPlayer1Answer2Seperator.getWidth());
				finalPanel.add(finalPlayer1Answer2Seperator);
				
				finalPlayer1Answer2WorthLabel.setBounds(finalPlayer1Answer2InnerPanel.getX() + 50 + (finalPlayer1Answer2InnerPanel.getWidth() - 200 - 50),
														finalPlayer1Answer2InnerPanel.getY() + 25,
														finalPlayer1Answer2InnerPanel.getWidth() - finalPlayer1Answer2Label.getWidth() - 100,
														finalPlayer1Answer2InnerPanel.getHeight() - 50);
				finalPlayer1Answer2WorthLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer1Answer2WorthLabel.setForeground(Color.decode("#ffffff"));
				finalPlayer1Answer2WorthLabel.setVerticalAlignment(SwingConstants.CENTER);
				finalPlayer1Answer2WorthLabel.setHorizontalAlignment(SwingConstants.CENTER);
				finalPanel.add(finalPlayer1Answer2WorthLabel);
				
				finalPanel.setComponentZOrder(finalPlayer1Answer2Label, 0);
				finalPanel.setComponentZOrder(finalPlayer1Answer2Seperator, 1);
				finalPanel.setComponentZOrder(finalPlayer1Answer2WorthLabel, 2);
				finalPanel.setComponentZOrder(finalPlayer1Answer2InnerPanel, 3);
				finalPanel.setComponentZOrder(finalPlayer1Answer2Panel, 4);
			
			
			finalPlayer1Answer3Panel.setBounds(50, finalPlayer1Answer2Panel.getY() + finalPlayer1Answer2Panel.getHeight() + 50, 640, 160);
			finalPlayer1Answer3Panel.setColor(Color.decode("#e1b173"));
			finalPlayer1Answer3Panel.setRadius(finalPlayer1Answer3Panel.getHeight());
			finalPanel.add(finalPlayer1Answer3Panel);
		
			finalPlayer1Answer3InnerPanel.setBounds(finalPlayer1Answer3Panel.getX() + innerPanelBorderThickness,
													finalPlayer1Answer3Panel.getY() + innerPanelBorderThickness,
													finalPlayer1Answer3Panel.getWidth() - (2 * innerPanelBorderThickness),
													finalPlayer1Answer3Panel.getHeight() - (2 * innerPanelBorderThickness));
			finalPlayer1Answer3InnerPanel.setColor(Color.decode("#38075d"));
			finalPlayer1Answer3InnerPanel.setRadius(finalPlayer1Answer3InnerPanel.getHeight());
			finalPanel.add(finalPlayer1Answer3InnerPanel);
			
				finalPlayer1Answer3Label.setBounds(	finalPlayer1Answer3InnerPanel.getX() + 50,
													finalPlayer1Answer3InnerPanel.getY() + 25,
													finalPlayer1Answer3InnerPanel.getWidth() - 300,
													finalPlayer1Answer3InnerPanel.getHeight() - 50);
				finalPlayer1Answer3Label.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer1Answer3Label.setForeground(Color.decode("#e1b173"));
				finalPlayer1Answer3Label.setVerticalAlignment(SwingConstants.CENTER);
				finalPlayer1Answer3Label.setHorizontalAlignment(SwingConstants.CENTER);
				finalPanel.add(finalPlayer1Answer3Label);
				
				finalPlayer1Answer3Seperator.setBounds(	finalPlayer1Answer3InnerPanel.getX() + 50 + finalPlayer1Answer3Label.getWidth() + 25 - 2,
														finalPlayer1Answer3InnerPanel.getY() + 25,
														4,
														finalPlayer1Answer3InnerPanel.getHeight() - 50);
				finalPlayer1Answer3Seperator.setColor(Color.decode("#e1b173"));
				finalPlayer1Answer3Seperator.setRadius(finalPlayer1Answer3Seperator.getWidth());
				finalPanel.add(finalPlayer1Answer3Seperator);
				
				finalPlayer1Answer3WorthLabel.setBounds(finalPlayer1Answer3InnerPanel.getX() + 50 + (finalPlayer1Answer3InnerPanel.getWidth() - 200 - 50),
														finalPlayer1Answer3InnerPanel.getY() + 25,
														finalPlayer1Answer3InnerPanel.getWidth() - finalPlayer1Answer3Label.getWidth() - 100,
														finalPlayer1Answer3InnerPanel.getHeight() - 50);
				finalPlayer1Answer3WorthLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer1Answer3WorthLabel.setForeground(Color.decode("#ffffff"));
				finalPlayer1Answer3WorthLabel.setVerticalAlignment(SwingConstants.CENTER);
				finalPlayer1Answer3WorthLabel.setHorizontalAlignment(SwingConstants.CENTER);
				finalPanel.add(finalPlayer1Answer3WorthLabel);
				
				finalPanel.setComponentZOrder(finalPlayer1Answer3Label, 0);
				finalPanel.setComponentZOrder(finalPlayer1Answer3Seperator, 1);
				finalPanel.setComponentZOrder(finalPlayer1Answer3WorthLabel, 2);
				finalPanel.setComponentZOrder(finalPlayer1Answer3InnerPanel, 3);
				finalPanel.setComponentZOrder(finalPlayer1Answer3Panel, 4);
			
			
			finalPlayer1Answer4Panel.setBounds(50, finalPlayer1Answer3Panel.getY() + finalPlayer1Answer3Panel.getHeight() + 50, 640, 160);
			finalPlayer1Answer4Panel.setColor(Color.decode("#e1b173"));
			finalPlayer1Answer4Panel.setRadius(finalPlayer1Answer4Panel.getHeight());
			finalPanel.add(finalPlayer1Answer4Panel);
		
			finalPlayer1Answer4InnerPanel.setBounds(finalPlayer1Answer4Panel.getX() + innerPanelBorderThickness,
													finalPlayer1Answer4Panel.getY() + innerPanelBorderThickness,
													finalPlayer1Answer4Panel.getWidth() - (2 * innerPanelBorderThickness),
													finalPlayer1Answer4Panel.getHeight() - (2 * innerPanelBorderThickness));
			finalPlayer1Answer4InnerPanel.setColor(Color.decode("#38075d"));
			finalPlayer1Answer4InnerPanel.setRadius(finalPlayer1Answer4InnerPanel.getHeight());
			finalPanel.add(finalPlayer1Answer4InnerPanel);
			
				finalPlayer1Answer4Label.setBounds(	finalPlayer1Answer4InnerPanel.getX() + 50,
													finalPlayer1Answer4InnerPanel.getY() + 25,
													finalPlayer1Answer4InnerPanel.getWidth() - 300,
													finalPlayer1Answer4InnerPanel.getHeight() - 50);
				finalPlayer1Answer4Label.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer1Answer4Label.setForeground(Color.decode("#e1b173"));
				finalPlayer1Answer4Label.setVerticalAlignment(SwingConstants.CENTER);
				finalPlayer1Answer4Label.setHorizontalAlignment(SwingConstants.CENTER);
				finalPanel.add(finalPlayer1Answer4Label);
				
				finalPlayer1Answer4Seperator.setBounds(	finalPlayer1Answer4InnerPanel.getX() + 50 + finalPlayer1Answer4Label.getWidth() + 25 - 2,
														finalPlayer1Answer4InnerPanel.getY() + 25,
														4,
														finalPlayer1Answer4InnerPanel.getHeight() - 50);
				finalPlayer1Answer4Seperator.setColor(Color.decode("#e1b173"));
				finalPlayer1Answer4Seperator.setRadius(finalPlayer1Answer4Seperator.getWidth());
				finalPanel.add(finalPlayer1Answer4Seperator);
				
				finalPlayer1Answer4WorthLabel.setBounds(finalPlayer1Answer4InnerPanel.getX() + 50 + (finalPlayer1Answer4InnerPanel.getWidth() - 200 - 50),
														finalPlayer1Answer4InnerPanel.getY() + 25,
														finalPlayer1Answer4InnerPanel.getWidth() - finalPlayer1Answer4Label.getWidth() - 100,
														finalPlayer1Answer4InnerPanel.getHeight() - 50);
				finalPlayer1Answer4WorthLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer1Answer4WorthLabel.setForeground(Color.decode("#ffffff"));
				finalPlayer1Answer4WorthLabel.setVerticalAlignment(SwingConstants.CENTER);
				finalPlayer1Answer4WorthLabel.setHorizontalAlignment(SwingConstants.CENTER);
				finalPanel.add(finalPlayer1Answer4WorthLabel);
				
				finalPanel.setComponentZOrder(finalPlayer1Answer4Label, 0);
				finalPanel.setComponentZOrder(finalPlayer1Answer4Seperator, 1);
				finalPanel.setComponentZOrder(finalPlayer1Answer4WorthLabel, 2);
				finalPanel.setComponentZOrder(finalPlayer1Answer4InnerPanel, 3);
				finalPanel.setComponentZOrder(finalPlayer1Answer4Panel, 4);
			
			
			finalPlayer1Answer5Panel.setBounds(50, finalPlayer1Answer4Panel.getY() + finalPlayer1Answer4Panel.getHeight() + 50, 640, 160);
			finalPlayer1Answer5Panel.setColor(Color.decode("#e1b173"));
			finalPlayer1Answer5Panel.setRadius(finalPlayer1Answer5Panel.getHeight());
			finalPanel.add(finalPlayer1Answer5Panel);
		
			finalPlayer1Answer5InnerPanel.setBounds(finalPlayer1Answer5Panel.getX() + innerPanelBorderThickness,
													finalPlayer1Answer5Panel.getY() + innerPanelBorderThickness,
													finalPlayer1Answer5Panel.getWidth() - (2 * innerPanelBorderThickness),
													finalPlayer1Answer5Panel.getHeight() - (2 * innerPanelBorderThickness));
			finalPlayer1Answer5InnerPanel.setColor(Color.decode("#38075d"));
			finalPlayer1Answer5InnerPanel.setRadius(finalPlayer1Answer5InnerPanel.getHeight());
			finalPanel.add(finalPlayer1Answer5InnerPanel);
			
				finalPlayer1Answer5Label.setBounds(	finalPlayer1Answer5InnerPanel.getX() + 50,
													finalPlayer1Answer5InnerPanel.getY() + 25,
													finalPlayer1Answer5InnerPanel.getWidth() - 300,
													finalPlayer1Answer5InnerPanel.getHeight() - 50);
				finalPlayer1Answer5Label.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer1Answer5Label.setForeground(Color.decode("#e1b173"));
				finalPlayer1Answer5Label.setVerticalAlignment(SwingConstants.CENTER);
				finalPlayer1Answer5Label.setHorizontalAlignment(SwingConstants.CENTER);
				finalPanel.add(finalPlayer1Answer5Label);
				
				finalPlayer1Answer5Seperator.setBounds(	finalPlayer1Answer5InnerPanel.getX() + 50 + finalPlayer1Answer5Label.getWidth() + 25 - 2,
														finalPlayer1Answer5InnerPanel.getY() + 25,
														4,
														finalPlayer1Answer5InnerPanel.getHeight() - 50);
				finalPlayer1Answer5Seperator.setColor(Color.decode("#e1b173"));
				finalPlayer1Answer5Seperator.setRadius(finalPlayer1Answer5Seperator.getWidth());
				finalPanel.add(finalPlayer1Answer5Seperator);
				
				finalPlayer1Answer5WorthLabel.setBounds(finalPlayer1Answer5InnerPanel.getX() + 50 + (finalPlayer1Answer5InnerPanel.getWidth() - 200 - 50),
														finalPlayer1Answer5InnerPanel.getY() + 25,
														finalPlayer1Answer5InnerPanel.getWidth() - finalPlayer1Answer5Label.getWidth() - 100,
														finalPlayer1Answer5InnerPanel.getHeight() - 50);
				finalPlayer1Answer5WorthLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer1Answer5WorthLabel.setForeground(Color.decode("#ffffff"));
				finalPlayer1Answer5WorthLabel.setVerticalAlignment(SwingConstants.CENTER);
				finalPlayer1Answer5WorthLabel.setHorizontalAlignment(SwingConstants.CENTER);
				finalPanel.add(finalPlayer1Answer5WorthLabel);
				
				finalPanel.setComponentZOrder(finalPlayer1Answer5Label, 0);
				finalPanel.setComponentZOrder(finalPlayer1Answer5Seperator, 1);
				finalPanel.setComponentZOrder(finalPlayer1Answer5WorthLabel, 2);
				finalPanel.setComponentZOrder(finalPlayer1Answer5InnerPanel, 3);
				finalPanel.setComponentZOrder(finalPlayer1Answer5Panel, 4);
				
				

			// Player 2 Answers
				finalPlayer2Answer1Panel.setBounds(1780, 90, 640, 160);
				finalPlayer2Answer1Panel.setColor(Color.decode("#e1b173"));
				finalPlayer2Answer1Panel.setRadius(finalPlayer2Answer1Panel.getHeight());
				finalPanel.add(finalPlayer2Answer1Panel);
			
				finalPlayer2Answer1InnerPanel.setBounds(finalPlayer2Answer1Panel.getX() + innerPanelBorderThickness,
														finalPlayer2Answer1Panel.getY() + innerPanelBorderThickness,
														finalPlayer2Answer1Panel.getWidth() - (2 * innerPanelBorderThickness),
														finalPlayer2Answer1Panel.getHeight() - (2 * innerPanelBorderThickness));
				finalPlayer2Answer1InnerPanel.setColor(Color.decode("#38075d"));
				finalPlayer2Answer1InnerPanel.setRadius(finalPlayer2Answer1InnerPanel.getHeight());
				finalPanel.add(finalPlayer2Answer1InnerPanel);
				
					finalPlayer2Answer1Label.setBounds(	finalPlayer2Answer1InnerPanel.getX() + 50,
														finalPlayer2Answer1InnerPanel.getY() + 25,
														finalPlayer2Answer1InnerPanel.getWidth() - 300,
														finalPlayer2Answer1InnerPanel.getHeight() - 50);
					finalPlayer2Answer1Label.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
					finalPlayer2Answer1Label.setForeground(Color.decode("#e1b173"));
					finalPlayer2Answer1Label.setVerticalAlignment(SwingConstants.CENTER);
					finalPlayer2Answer1Label.setHorizontalAlignment(SwingConstants.CENTER);
					finalPanel.add(finalPlayer2Answer1Label);
					
					finalPlayer2Answer1Seperator.setBounds(	finalPlayer2Answer1InnerPanel.getX() + 50 + finalPlayer2Answer1Label.getWidth() + 25 - 2,
															finalPlayer2Answer1InnerPanel.getY() + 25,
															4,
															finalPlayer2Answer1InnerPanel.getHeight() - 50);
					finalPlayer2Answer1Seperator.setColor(Color.decode("#e1b173"));
					finalPlayer2Answer1Seperator.setRadius(finalPlayer2Answer1Seperator.getWidth());
					finalPanel.add(finalPlayer2Answer1Seperator);
					
					finalPlayer2Answer1WorthLabel.setBounds(finalPlayer2Answer1InnerPanel.getX() + 50 + (finalPlayer2Answer1InnerPanel.getWidth() - 200 - 50),
															finalPlayer2Answer1InnerPanel.getY() + 25,
															finalPlayer2Answer1InnerPanel.getWidth() - finalPlayer2Answer1Label.getWidth() - 100,
															finalPlayer2Answer1InnerPanel.getHeight() - 50);
					finalPlayer2Answer1WorthLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
					finalPlayer2Answer1WorthLabel.setForeground(Color.decode("#ffffff"));
					finalPlayer2Answer1WorthLabel.setVerticalAlignment(SwingConstants.CENTER);
					finalPlayer2Answer1WorthLabel.setHorizontalAlignment(SwingConstants.CENTER);
					finalPanel.add(finalPlayer2Answer1WorthLabel);
					
					finalPanel.setComponentZOrder(finalPlayer2Answer1Label, 0);
					finalPanel.setComponentZOrder(finalPlayer2Answer1Seperator, 1);
					finalPanel.setComponentZOrder(finalPlayer2Answer1WorthLabel, 2);
					finalPanel.setComponentZOrder(finalPlayer2Answer1InnerPanel, 3);
					finalPanel.setComponentZOrder(finalPlayer2Answer1Panel, 4);
					
				
				finalPlayer2Answer2Panel.setBounds(1780, finalPlayer2Answer1Panel.getY() + finalPlayer2Answer1Panel.getHeight() + 50, 640, 160);
				finalPlayer2Answer2Panel.setColor(Color.decode("#e1b173"));
				finalPlayer2Answer2Panel.setRadius(finalPlayer2Answer2Panel.getHeight());
				finalPanel.add(finalPlayer2Answer2Panel);
			
				finalPlayer2Answer2InnerPanel.setBounds(finalPlayer2Answer2Panel.getX() + innerPanelBorderThickness,
														finalPlayer2Answer2Panel.getY() + innerPanelBorderThickness,
														finalPlayer2Answer2Panel.getWidth() - (2 * innerPanelBorderThickness),
														finalPlayer2Answer2Panel.getHeight() - (2 * innerPanelBorderThickness));
				finalPlayer2Answer2InnerPanel.setColor(Color.decode("#38075d"));
				finalPlayer2Answer2InnerPanel.setRadius(finalPlayer2Answer2InnerPanel.getHeight());
				finalPanel.add(finalPlayer2Answer2InnerPanel);
				
					finalPlayer2Answer2Label.setBounds(	finalPlayer2Answer2InnerPanel.getX() + 50,
														finalPlayer2Answer2InnerPanel.getY() + 25,
														finalPlayer2Answer2InnerPanel.getWidth() - 300,
														finalPlayer2Answer2InnerPanel.getHeight() - 50);
					finalPlayer2Answer2Label.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
					finalPlayer2Answer2Label.setForeground(Color.decode("#e1b173"));
					finalPlayer2Answer2Label.setVerticalAlignment(SwingConstants.CENTER);
					finalPlayer2Answer2Label.setHorizontalAlignment(SwingConstants.CENTER);
					finalPanel.add(finalPlayer2Answer2Label);
					
					finalPlayer2Answer2Seperator.setBounds(	finalPlayer2Answer2InnerPanel.getX() + 50 + finalPlayer2Answer2Label.getWidth() + 25 - 2,
															finalPlayer2Answer2InnerPanel.getY() + 25,
															4,
															finalPlayer2Answer2InnerPanel.getHeight() - 50);
					finalPlayer2Answer2Seperator.setColor(Color.decode("#e1b173"));
					finalPlayer2Answer2Seperator.setRadius(finalPlayer2Answer2Seperator.getWidth());
					finalPanel.add(finalPlayer2Answer2Seperator);
					
					finalPlayer2Answer2WorthLabel.setBounds(finalPlayer2Answer2InnerPanel.getX() + 50 + (finalPlayer2Answer2InnerPanel.getWidth() - 200 - 50),
															finalPlayer2Answer2InnerPanel.getY() + 25,
															finalPlayer2Answer2InnerPanel.getWidth() - finalPlayer2Answer2Label.getWidth() - 100,
															finalPlayer2Answer2InnerPanel.getHeight() - 50);
					finalPlayer2Answer2WorthLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
					finalPlayer2Answer2WorthLabel.setForeground(Color.decode("#ffffff"));
					finalPlayer2Answer2WorthLabel.setVerticalAlignment(SwingConstants.CENTER);
					finalPlayer2Answer2WorthLabel.setHorizontalAlignment(SwingConstants.CENTER);
					finalPanel.add(finalPlayer2Answer2WorthLabel);
					
					finalPanel.setComponentZOrder(finalPlayer2Answer2Label, 0);
					finalPanel.setComponentZOrder(finalPlayer2Answer2Seperator, 1);
					finalPanel.setComponentZOrder(finalPlayer2Answer2WorthLabel, 2);
					finalPanel.setComponentZOrder(finalPlayer2Answer2InnerPanel, 3);
					finalPanel.setComponentZOrder(finalPlayer2Answer2Panel, 4);
				
				
				finalPlayer2Answer3Panel.setBounds(1780, finalPlayer2Answer2Panel.getY() + finalPlayer2Answer2Panel.getHeight() + 50, 640, 160);
				finalPlayer2Answer3Panel.setColor(Color.decode("#e1b173"));
				finalPlayer2Answer3Panel.setRadius(finalPlayer2Answer3Panel.getHeight());
				finalPanel.add(finalPlayer2Answer3Panel);
			
				finalPlayer2Answer3InnerPanel.setBounds(finalPlayer2Answer3Panel.getX() + innerPanelBorderThickness,
														finalPlayer2Answer3Panel.getY() + innerPanelBorderThickness,
														finalPlayer2Answer3Panel.getWidth() - (2 * innerPanelBorderThickness),
														finalPlayer2Answer3Panel.getHeight() - (2 * innerPanelBorderThickness));
				finalPlayer2Answer3InnerPanel.setColor(Color.decode("#38075d"));
				finalPlayer2Answer3InnerPanel.setRadius(finalPlayer2Answer3InnerPanel.getHeight());
				finalPanel.add(finalPlayer2Answer3InnerPanel);
				
					finalPlayer2Answer3Label.setBounds(	finalPlayer2Answer3InnerPanel.getX() + 50,
														finalPlayer2Answer3InnerPanel.getY() + 25,
														finalPlayer2Answer3InnerPanel.getWidth() - 300,
														finalPlayer2Answer3InnerPanel.getHeight() - 50);
					finalPlayer2Answer3Label.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
					finalPlayer2Answer3Label.setForeground(Color.decode("#e1b173"));
					finalPlayer2Answer3Label.setVerticalAlignment(SwingConstants.CENTER);
					finalPlayer2Answer3Label.setHorizontalAlignment(SwingConstants.CENTER);
					finalPanel.add(finalPlayer2Answer3Label);
					
					finalPlayer2Answer3Seperator.setBounds(	finalPlayer2Answer3InnerPanel.getX() + 50 + finalPlayer2Answer3Label.getWidth() + 25 - 2,
															finalPlayer2Answer3InnerPanel.getY() + 25,
															4,
															finalPlayer2Answer3InnerPanel.getHeight() - 50);
					finalPlayer2Answer3Seperator.setColor(Color.decode("#e1b173"));
					finalPlayer2Answer3Seperator.setRadius(finalPlayer2Answer3Seperator.getWidth());
					finalPanel.add(finalPlayer2Answer3Seperator);
					
					finalPlayer2Answer3WorthLabel.setBounds(finalPlayer2Answer3InnerPanel.getX() + 50 + (finalPlayer2Answer3InnerPanel.getWidth() - 200 - 50),
															finalPlayer2Answer3InnerPanel.getY() + 25,
															finalPlayer2Answer3InnerPanel.getWidth() - finalPlayer2Answer3Label.getWidth() - 100,
															finalPlayer2Answer3InnerPanel.getHeight() - 50);
					finalPlayer2Answer3WorthLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
					finalPlayer2Answer3WorthLabel.setForeground(Color.decode("#ffffff"));
					finalPlayer2Answer3WorthLabel.setVerticalAlignment(SwingConstants.CENTER);
					finalPlayer2Answer3WorthLabel.setHorizontalAlignment(SwingConstants.CENTER);
					finalPanel.add(finalPlayer2Answer3WorthLabel);
					
					finalPanel.setComponentZOrder(finalPlayer2Answer3Label, 0);
					finalPanel.setComponentZOrder(finalPlayer2Answer3Seperator, 1);
					finalPanel.setComponentZOrder(finalPlayer2Answer3WorthLabel, 2);
					finalPanel.setComponentZOrder(finalPlayer2Answer3InnerPanel, 3);
					finalPanel.setComponentZOrder(finalPlayer2Answer3Panel, 4);
				
				
				finalPlayer2Answer4Panel.setBounds(1780, finalPlayer2Answer3Panel.getY() + finalPlayer2Answer3Panel.getHeight() + 50, 640, 160);
				finalPlayer2Answer4Panel.setColor(Color.decode("#e1b173"));
				finalPlayer2Answer4Panel.setRadius(finalPlayer2Answer4Panel.getHeight());
				finalPanel.add(finalPlayer2Answer4Panel);
			
				finalPlayer2Answer4InnerPanel.setBounds(finalPlayer2Answer4Panel.getX() + innerPanelBorderThickness,
														finalPlayer2Answer4Panel.getY() + innerPanelBorderThickness,
														finalPlayer2Answer4Panel.getWidth() - (2 * innerPanelBorderThickness),
														finalPlayer2Answer4Panel.getHeight() - (2 * innerPanelBorderThickness));
				finalPlayer2Answer4InnerPanel.setColor(Color.decode("#38075d"));
				finalPlayer2Answer4InnerPanel.setRadius(finalPlayer2Answer4InnerPanel.getHeight());
				finalPanel.add(finalPlayer2Answer4InnerPanel);
				
					finalPlayer2Answer4Label.setBounds(	finalPlayer2Answer4InnerPanel.getX() + 50,
														finalPlayer2Answer4InnerPanel.getY() + 25,
														finalPlayer2Answer4InnerPanel.getWidth() - 300,
														finalPlayer2Answer4InnerPanel.getHeight() - 50);
					finalPlayer2Answer4Label.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
					finalPlayer2Answer4Label.setForeground(Color.decode("#e1b173"));
					finalPlayer2Answer4Label.setVerticalAlignment(SwingConstants.CENTER);
					finalPlayer2Answer4Label.setHorizontalAlignment(SwingConstants.CENTER);
					finalPanel.add(finalPlayer2Answer4Label);
					
					finalPlayer2Answer4Seperator.setBounds(	finalPlayer2Answer4InnerPanel.getX() + 50 + finalPlayer2Answer4Label.getWidth() + 25 - 2,
															finalPlayer2Answer4InnerPanel.getY() + 25,
															4,
															finalPlayer2Answer4InnerPanel.getHeight() - 50);
					finalPlayer2Answer4Seperator.setColor(Color.decode("#e1b173"));
					finalPlayer2Answer4Seperator.setRadius(finalPlayer2Answer4Seperator.getWidth());
					finalPanel.add(finalPlayer2Answer4Seperator);
					
					finalPlayer2Answer4WorthLabel.setBounds(finalPlayer2Answer4InnerPanel.getX() + 50 + (finalPlayer2Answer4InnerPanel.getWidth() - 200 - 50),
															finalPlayer2Answer4InnerPanel.getY() + 25,
															finalPlayer2Answer4InnerPanel.getWidth() - finalPlayer2Answer4Label.getWidth() - 100,
															finalPlayer2Answer4InnerPanel.getHeight() - 50);
					finalPlayer2Answer4WorthLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
					finalPlayer2Answer4WorthLabel.setForeground(Color.decode("#ffffff"));
					finalPlayer2Answer4WorthLabel.setVerticalAlignment(SwingConstants.CENTER);
					finalPlayer2Answer4WorthLabel.setHorizontalAlignment(SwingConstants.CENTER);
					finalPanel.add(finalPlayer2Answer4WorthLabel);
					
					finalPanel.setComponentZOrder(finalPlayer2Answer4Label, 0);
					finalPanel.setComponentZOrder(finalPlayer2Answer4Seperator, 1);
					finalPanel.setComponentZOrder(finalPlayer2Answer4WorthLabel, 2);
					finalPanel.setComponentZOrder(finalPlayer2Answer4InnerPanel, 3);
					finalPanel.setComponentZOrder(finalPlayer2Answer4Panel, 4);
				
				
				finalPlayer2Answer5Panel.setBounds(1780, finalPlayer2Answer4Panel.getY() + finalPlayer2Answer4Panel.getHeight() + 50, 640, 160);
				finalPlayer2Answer5Panel.setColor(Color.decode("#e1b173"));
				finalPlayer2Answer5Panel.setRadius(finalPlayer2Answer5Panel.getHeight());
				finalPanel.add(finalPlayer2Answer5Panel);
			
				finalPlayer2Answer5InnerPanel.setBounds(finalPlayer2Answer5Panel.getX() + innerPanelBorderThickness,
														finalPlayer2Answer5Panel.getY() + innerPanelBorderThickness,
														finalPlayer2Answer5Panel.getWidth() - (2 * innerPanelBorderThickness),
														finalPlayer2Answer5Panel.getHeight() - (2 * innerPanelBorderThickness));
				finalPlayer2Answer5InnerPanel.setColor(Color.decode("#38075d"));
				finalPlayer2Answer5InnerPanel.setRadius(finalPlayer2Answer5InnerPanel.getHeight());
				finalPanel.add(finalPlayer2Answer5InnerPanel);
				
					finalPlayer2Answer5Label.setBounds(	finalPlayer2Answer5InnerPanel.getX() + 50,
														finalPlayer2Answer5InnerPanel.getY() + 25,
														finalPlayer2Answer5InnerPanel.getWidth() - 300,
														finalPlayer2Answer5InnerPanel.getHeight() - 50);
					finalPlayer2Answer5Label.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
					finalPlayer2Answer5Label.setForeground(Color.decode("#e1b173"));
					finalPlayer2Answer5Label.setVerticalAlignment(SwingConstants.CENTER);
					finalPlayer2Answer5Label.setHorizontalAlignment(SwingConstants.CENTER);
					finalPanel.add(finalPlayer2Answer5Label);
					
					finalPlayer2Answer5Seperator.setBounds(	finalPlayer2Answer5InnerPanel.getX() + 50 + finalPlayer2Answer5Label.getWidth() + 25 - 2,
															finalPlayer2Answer5InnerPanel.getY() + 25,
															4,
															finalPlayer2Answer5InnerPanel.getHeight() - 50);
					finalPlayer2Answer5Seperator.setColor(Color.decode("#e1b173"));
					finalPlayer2Answer5Seperator.setRadius(finalPlayer2Answer5Seperator.getWidth());
					finalPanel.add(finalPlayer2Answer5Seperator);
					
					finalPlayer2Answer5WorthLabel.setBounds(finalPlayer2Answer5InnerPanel.getX() + 50 + (finalPlayer2Answer5InnerPanel.getWidth() - 200 - 50),
															finalPlayer2Answer5InnerPanel.getY() + 25,
															finalPlayer2Answer5InnerPanel.getWidth() - finalPlayer2Answer5Label.getWidth() - 100,
															finalPlayer2Answer5InnerPanel.getHeight() - 50);
					finalPlayer2Answer5WorthLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
					finalPlayer2Answer5WorthLabel.setForeground(Color.decode("#ffffff"));
					finalPlayer2Answer5WorthLabel.setVerticalAlignment(SwingConstants.CENTER);
					finalPlayer2Answer5WorthLabel.setHorizontalAlignment(SwingConstants.CENTER);
					finalPanel.add(finalPlayer2Answer5WorthLabel);
					
					finalPanel.setComponentZOrder(finalPlayer2Answer5Label, 0);
					finalPanel.setComponentZOrder(finalPlayer2Answer5Seperator, 1);
					finalPanel.setComponentZOrder(finalPlayer2Answer5WorthLabel, 2);
					finalPanel.setComponentZOrder(finalPlayer2Answer5InnerPanel, 3);
					finalPanel.setComponentZOrder(finalPlayer2Answer5Panel, 4);
					

			resultsPanel.setBounds(0, 0, 2470, 1180);
			resultsPanel.setLayout(null);
			frame.getContentPane().add(resultsPanel);
			
				resultLabel.setBounds(100, 100, 2270, 980);
				resultLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 200));
				resultLabel.setForeground(Color.decode("#e1b173"));
				resultLabel.setVerticalAlignment(SwingConstants.CENTER);
				resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
				resultsPanel.add(resultLabel);
				
	}
	
	public void setGame(int gameNumber) {
		buttonC1R1.setEnabled(true);
		buttonC1R2.setEnabled(true);
		buttonC1R3.setEnabled(true);
		buttonC1R4.setEnabled(true);
		buttonC1R5.setEnabled(true);

		buttonC2R1.setEnabled(true);
		buttonC2R2.setEnabled(true);
		buttonC2R3.setEnabled(true);
		buttonC2R4.setEnabled(true);
		buttonC2R5.setEnabled(true);

		buttonC3R1.setEnabled(true);
		buttonC3R2.setEnabled(true);
		buttonC3R3.setEnabled(true);
		buttonC3R4.setEnabled(true);
		buttonC3R5.setEnabled(true);

		buttonC4R1.setEnabled(true);
		buttonC4R2.setEnabled(true);
		buttonC4R3.setEnabled(true);
		buttonC4R4.setEnabled(true);
		buttonC4R5.setEnabled(true);

		buttonC5R1.setEnabled(true);
		buttonC5R2.setEnabled(true);
		buttonC5R3.setEnabled(true);
		buttonC5R4.setEnabled(true);
		buttonC5R5.setEnabled(true);

		buttonC6R1.setEnabled(true);
		buttonC6R2.setEnabled(true);
		buttonC6R3.setEnabled(true);
		buttonC6R4.setEnabled(true);
		buttonC6R5.setEnabled(true);
		
		
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
 			break;
 		case "C1R2":
 			buttonC1R2.setEnabled(false);
 			break;
 		case "C1R3":
 			buttonC1R3.setEnabled(false);
 			break;
 		case "C1R4":
 			buttonC1R4.setEnabled(false);
 			break;
 		case "C1R5":
 			buttonC1R5.setEnabled(false);
 			break;
 			
 		case "C2R1":
 			buttonC2R1.setEnabled(false);
 			break;
 		case "C2R2":
 			buttonC2R2.setEnabled(false);
 			break;
 		case "C2R3":
 			buttonC2R3.setEnabled(false);
 			break;
 		case "C2R4":
 			buttonC2R4.setEnabled(false);
 			break;
 		case "C2R5":
 			buttonC2R5.setEnabled(false);
 			break;
 			
 		case "C3R1":
 			buttonC3R1.setEnabled(false);
 			break;
 		case "C3R2":
 			buttonC3R2.setEnabled(false);
 			break;
 		case "C3R3":
 			buttonC3R3.setEnabled(false);
 			break;
 		case "C3R4":
 			buttonC3R4.setEnabled(false);
 			break;
 		case "C3R5":
 			buttonC3R5.setEnabled(false);
 			break;
 			
 		case "C4R1":
 			buttonC4R1.setEnabled(false);
 			break;
 		case "C4R2":
 			buttonC4R2.setEnabled(false);
 			break;
 		case "C4R3":
 			buttonC4R3.setEnabled(false);
 			break;
 		case "C4R4":
 			buttonC4R4.setEnabled(false);
 			break;
 		case "C4R5":
 			buttonC4R5.setEnabled(false);
 			break;
 			
 		case "C5R1":
 			buttonC5R1.setEnabled(false);
 			break;
 		case "C5R2":
 			buttonC5R2.setEnabled(false);
 			break;
 		case "C5R3":
 			buttonC5R3.setEnabled(false);
 			break;
 		case "C5R4":
 			buttonC5R4.setEnabled(false);
 			break;
 		case "C5R5":
 			buttonC5R5.setEnabled(false);
 			break;
 			
 		case "C6R1":
 			buttonC6R1.setEnabled(false);
 			break;
 		case "C6R2":
 			buttonC6R2.setEnabled(false);
 			break;
 		case "C6R3":
 			buttonC6R3.setEnabled(false);
 			break;
 		case "C6R4":
 			buttonC6R4.setEnabled(false);
 			break;
 		case "C6R5":
 			buttonC6R5.setEnabled(false);
 			break;
		}
	}
}