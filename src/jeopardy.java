import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import components.TiebreakerQuestion;
import scripts.questionSystem;
import scripts.sql;
import scripts.updater;
import windows.gameWindow;
import windows.scoreWindow;
import windows.adminWindow;
import windows.editorWindow;

public class jeopardy {
	
	private static gameWindow gameWindow;
	private static scoreWindow scoreWindow;
	private static adminWindow adminWindow;
	private static editorWindow editorWindow;
	
	private updater updater = new updater();
	private sql sql;
	private questionSystem questionSystem;
	
	private int game = 0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gameWindow = new gameWindow();
					scoreWindow = new scoreWindow();
					adminWindow = new adminWindow();
					adminWindow.frame.setVisible(true);
					editorWindow = new editorWindow();
					new jeopardy();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public jeopardy() {
		sql = new sql();
		questionSystem = new questionSystem(sql);
		
		show("QuestionSelector");
		listen();
	}
	
	public void listen() {
//Admin Window
	//Menu
		adminWindow.buttonOpenEditor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				show("EditorMenu");
				editorWindow.frame.setVisible(true);
				
				gameWindow.frame.setVisible(false);
				scoreWindow.frame.setVisible(false);
				adminWindow.frame.setVisible(false);
			}
		});
		
		adminWindow.buttonRandomiseCategories.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				int totalCategories = adminWindow.selectGame1Category1.getItemCount();
				
				List<Object> randomisedArray = new ArrayList<Object>();
				for (int i = 0; i < totalCategories; i++) randomisedArray.add(i);
				Collections.shuffle(randomisedArray);
				
				try {
					adminWindow.selectGame1Category1.setSelectedIndex((int) randomisedArray.get(0));	adminWindow.selectGame1Category2.setSelectedIndex((int) randomisedArray.get(1));	adminWindow.selectGame1Category3.setSelectedIndex((int) randomisedArray.get(2));
					adminWindow.selectGame1Category4.setSelectedIndex((int) randomisedArray.get(3));	adminWindow.selectGame1Category5.setSelectedIndex((int) randomisedArray.get(4));	adminWindow.selectGame1Category6.setSelectedIndex((int) randomisedArray.get(5));
	
					adminWindow.selectGame2Category1.setSelectedIndex((int) randomisedArray.get(6));	adminWindow.selectGame2Category2.setSelectedIndex((int) randomisedArray.get(7));	adminWindow.selectGame2Category3.setSelectedIndex((int) randomisedArray.get(8));
					adminWindow.selectGame2Category4.setSelectedIndex((int) randomisedArray.get(9));	adminWindow.selectGame2Category5.setSelectedIndex((int) randomisedArray.get(10));	adminWindow.selectGame2Category6.setSelectedIndex((int) randomisedArray.get(11));
				} catch (Exception e1) {}
			}
		});
		
		adminWindow.selectPlayerCount3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				scoreWindow.setPlayerCount(3);
				adminWindow.setPlayerCount(3);
			}
		});
		adminWindow.selectPlayerCount4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				scoreWindow.setPlayerCount(4);
				adminWindow.setPlayerCount(4);
			}
		});
		adminWindow.selectPlayerCount5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				scoreWindow.setPlayerCount(5);
				adminWindow.setPlayerCount(5);
			}
		});
		
		adminWindow.buttonBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (updater.getState("PlayerCount")) {
					show("QuestionSelector");
				} else
				if (updater.getState("PlayerNames")) {
					show("PlayerCount");
					adminWindow.menuBanner.setText("How Many Players Would You Like?");
					adminWindow.buttonBack.setLocation(10, 365);
					adminWindow.buttonContinue.setLocation(330, 365);
				}
			}
		});
		adminWindow.buttonContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (updater.getState("QuestionSelector")) {
					String[] gameCategories = new String[12];
					
					try {
						gameCategories[0] = adminWindow.selectGame1Category1.getSelectedItem().toString();
						gameCategories[1] = adminWindow.selectGame1Category2.getSelectedItem().toString();
						gameCategories[2] = adminWindow.selectGame1Category3.getSelectedItem().toString();
						gameCategories[3] = adminWindow.selectGame1Category4.getSelectedItem().toString();
						gameCategories[4] = adminWindow.selectGame1Category5.getSelectedItem().toString();
						gameCategories[5] = adminWindow.selectGame1Category6.getSelectedItem().toString();

						gameCategories[6] = adminWindow.selectGame2Category1.getSelectedItem().toString();
						gameCategories[7] = adminWindow.selectGame2Category2.getSelectedItem().toString();
						gameCategories[8] = adminWindow.selectGame2Category3.getSelectedItem().toString();
						gameCategories[9] = adminWindow.selectGame2Category4.getSelectedItem().toString();
						gameCategories[10] = adminWindow.selectGame2Category5.getSelectedItem().toString();
						gameCategories[11] = adminWindow.selectGame2Category6.getSelectedItem().toString();
						
						adminWindow.selectFinalJeopardy.getSelectedItem().toString();
					} catch (Exception e1) {return;}
					
				// Check to see if the chosen categories are unique
					boolean uniqueGameCategories = true;
					for (int i = 0; i < gameCategories.length; i++) {
						for (int j = i + 1; j < gameCategories.length; j++) {
							if (i != j && gameCategories[i] == gameCategories[j]) {
								uniqueGameCategories = false;
								break;
							}
						}
						if (!uniqueGameCategories) {break;}
					}
					
					if (uniqueGameCategories) {show("PlayerCount");}
				} else
				if (updater.getState("PlayerCount")) {
					show("PlayerNames");
					adminWindow.menuBanner.setText("Set The Player Names");
					if (scoreWindow.getPlayerCount() > 3) {
						adminWindow.buttonBack.setLocation(adminWindow.buttonBack.getX(), adminWindow.buttonBack.getY()+85);
						adminWindow.buttonContinue.setLocation(adminWindow.buttonContinue.getX(), adminWindow.buttonContinue.getY()+85);
					}
				} else
				if (updater.getState("PlayerNames")) {
					adminWindow.frame.setVisible(false);
					setGame(1);
					
					questionSystem.setFinalQuestions(questionSystem.getFinalCategoryId(adminWindow.selectFinalJeopardy.getSelectedIndex()));
					
					show("Game");
					adminWindow.frame.setVisible(true);
					
					scoreWindow.setPlayerName(1, adminWindow.setPlayerName1.getText());
					scoreWindow.setPlayerName(2, adminWindow.setPlayerName2.getText());
					scoreWindow.setPlayerName(3, adminWindow.setPlayerName3.getText());
					adminWindow.setPlayerName(1, adminWindow.setPlayerName1.getText());
					adminWindow.setPlayerName(2, adminWindow.setPlayerName2.getText());
					adminWindow.setPlayerName(3, adminWindow.setPlayerName3.getText());
					if (scoreWindow.getPlayerCount() > 4) {
						scoreWindow.setPlayerName(4, adminWindow.setPlayerName4.getText());
						scoreWindow.setPlayerName(5, adminWindow.setPlayerName5.getText());
						adminWindow.setPlayerName(4, adminWindow.setPlayerName4.getText());
						adminWindow.setPlayerName(5, adminWindow.setPlayerName5.getText());
					} else
					if (scoreWindow.getPlayerCount() > 3) {
						scoreWindow.setPlayerName(4, adminWindow.setPlayerName4.getText());
						adminWindow.setPlayerName(4, adminWindow.setPlayerName4.getText());
					}
				}
			}
		});
		
		//Game
		adminWindow.buttonAdjustScores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.buttonAdjustScores.isSelectable()) return;
				
				adminWindow.adjustPlayer1ScoreLabel.setText(scoreWindow.getPlayerName(1) + "'s Score:");
				adminWindow.adjustPlayer2ScoreLabel.setText(scoreWindow.getPlayerName(2) + "'s Score:");
				adminWindow.adjustPlayer3ScoreLabel.setText(scoreWindow.getPlayerName(3) + "'s Score:");
				adminWindow.adjustPlayer4ScoreLabel.setText(scoreWindow.getPlayerName(4) + "'s Score:");
				adminWindow.adjustPlayer5ScoreLabel.setText(scoreWindow.getPlayerName(5) + "'s Score:");
				
				adminWindow.adjustPlayer1ScoreTextBox.setText(Integer.toString(scoreWindow.getPlayerScore(1)));
				adminWindow.adjustPlayer2ScoreTextBox.setText(Integer.toString(scoreWindow.getPlayerScore(2)));
				adminWindow.adjustPlayer3ScoreTextBox.setText(Integer.toString(scoreWindow.getPlayerScore(3)));
				adminWindow.adjustPlayer4ScoreTextBox.setText(Integer.toString(scoreWindow.getPlayerScore(4)));
				adminWindow.adjustPlayer5ScoreTextBox.setText(Integer.toString(scoreWindow.getPlayerScore(5)));
				
				adminWindow.adjustPanel.setVisible(true);
				adminWindow.gamePanel.setVisible(false);
			}
		});
		adminWindow.buttonBackAdjustScores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.buttonBackAdjustScores.isSelectable()) return;

				if (
						!adminWindow.adjustPlayer1ScoreTextBox.getText().equals("") &&
						!adminWindow.adjustPlayer2ScoreTextBox.getText().equals("") &&
						!adminWindow.adjustPlayer3ScoreTextBox.getText().equals("") &&
						!adminWindow.adjustPlayer4ScoreTextBox.getText().equals("") &&
						!adminWindow.adjustPlayer5ScoreTextBox.getText().equals("")
				) {
					try {
						scoreWindow.setPlayerScore(1, Integer.parseInt(adminWindow.adjustPlayer1ScoreTextBox.getText()));
						scoreWindow.setPlayerScore(2, Integer.parseInt(adminWindow.adjustPlayer2ScoreTextBox.getText()));
						scoreWindow.setPlayerScore(3, Integer.parseInt(adminWindow.adjustPlayer3ScoreTextBox.getText()));
						scoreWindow.setPlayerScore(4, Integer.parseInt(adminWindow.adjustPlayer4ScoreTextBox.getText()));
						scoreWindow.setPlayerScore(5, Integer.parseInt(adminWindow.adjustPlayer5ScoreTextBox.getText()));
						
						adminWindow.gamePanel.setVisible(true);
						adminWindow.adjustPanel.setVisible(false);
					} catch (Exception e1) {return;}
				}
			}
		});
		
		//C1
			adminWindow.buttonC1R1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC1R1.isSelectable()) return;
	
					showQuestion(1, 1);
				}
			});
			adminWindow.buttonC1R2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC1R2.isSelectable()) return;
	
					showQuestion(1, 2);
				}
			});
			adminWindow.buttonC1R3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC1R3.isSelectable()) return;
	
					showQuestion(1, 3);
				}
			});
			adminWindow.buttonC1R4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC1R4.isSelectable()) return;
	
					showQuestion(1, 4);
				}
			});
			adminWindow.buttonC1R5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC1R5.isSelectable()) return;
	
					showQuestion(1, 5);
				}
			});
			
		//C2
			adminWindow.buttonC2R1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC2R1.isSelectable()) return;
	
					showQuestion(2, 1);
				}
			});
			adminWindow.buttonC2R2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC2R2.isSelectable()) return;
	
					showQuestion(2, 2);
				}
			});
			adminWindow.buttonC2R3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC2R3.isSelectable()) return;
	
					showQuestion(2, 3);
				}
			});
			adminWindow.buttonC2R4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC2R4.isSelectable()) return;
	
					showQuestion(2, 4);
				}
			});
			adminWindow.buttonC2R5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC2R5.isSelectable()) return;
	
					showQuestion(2, 5);
				}
			});
			
		//C3
			adminWindow.buttonC3R1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC3R1.isSelectable()) return;
	
					showQuestion(3, 1);
				}
			});
			adminWindow.buttonC3R2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC3R2.isSelectable()) return;
	
					showQuestion(3, 2);
				}
			});
			adminWindow.buttonC3R3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC3R3.isSelectable()) return;
	
					showQuestion(3, 3);
				}
			});
			adminWindow.buttonC3R4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC3R4.isSelectable()) return;
	
					showQuestion(3, 4);
				}
			});
			adminWindow.buttonC3R5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC3R5.isSelectable()) return;
	
					showQuestion(3, 5);
				}
			});
			
		//C4
			adminWindow.buttonC4R1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC4R1.isSelectable()) return;
	
					showQuestion(4, 1);
				}
			});
			adminWindow.buttonC4R2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC4R2.isSelectable()) return;
	
					showQuestion(4, 2);
				}
			});
			adminWindow.buttonC4R3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC4R3.isSelectable()) return;
	
					showQuestion(4, 3);
				}
			});
			adminWindow.buttonC4R4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC4R4.isSelectable()) return;
	
					showQuestion(4, 4);
				}
			});
			adminWindow.buttonC4R5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC4R5.isSelectable()) return;
	
					showQuestion(4, 5);
				}
			});
			
		//C5
			adminWindow.buttonC5R1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC5R1.isSelectable()) return;
	
					showQuestion(5, 1);
				}
			});
			adminWindow.buttonC5R2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC5R2.isSelectable()) return;
	
					showQuestion(5, 2);
				}
			});
			adminWindow.buttonC5R3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC5R3.isSelectable()) return;
	
					showQuestion(5, 3);
				}
			});
			adminWindow.buttonC5R4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC5R4.isSelectable()) return;
	
					showQuestion(5, 4);
				}
			});
			adminWindow.buttonC5R5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC5R5.isSelectable()) return;
	
					showQuestion(5, 5);
				}
			});
			
		//C6
			adminWindow.buttonC6R1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC6R1.isSelectable()) return;
	
					showQuestion(6, 1);
				}
			});
			adminWindow.buttonC6R2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC6R2.isSelectable()) return;
	
					showQuestion(6, 2);
				}
			});
			adminWindow.buttonC6R3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC6R3.isSelectable()) return;
	
					showQuestion(6, 3);
				}
			});
			adminWindow.buttonC6R4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC6R4.isSelectable()) return;
	
					showQuestion(6, 4);
				}
			});
			adminWindow.buttonC6R5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					if (!adminWindow.buttonC6R5.isSelectable()) return;
	
					showQuestion(6, 5);
				}
			});
		
	//Question Panel
		adminWindow.questionButtonShowAnswer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.questionButtonShowAnswer.isSelectable()) return;
				
				if (updater.getState("Question")) {
					show("Answer");
					disableCurrentQuestion(true);
				} else
				if (updater.getState("TiebreakerQuestion")) {
					show("TiebreakerAnswer");
				}
		 			
	 			adminWindow.questionPlayer1Add.setEnabled(false); 		adminWindow.questionPlayer1Add.setSelectable(false);
	 			adminWindow.questionPlayer1Remove.setEnabled(false); 	adminWindow.questionPlayer1Remove.setSelectable(false);
	 			adminWindow.questionPlayer2Add.setEnabled(false); 		adminWindow.questionPlayer2Add.setSelectable(false);
	 			adminWindow.questionPlayer2Remove.setEnabled(false); 	adminWindow.questionPlayer2Remove.setSelectable(false);
				adminWindow.questionPlayer3Add.setEnabled(false); 		adminWindow.questionPlayer3Add.setSelectable(false);
				adminWindow.questionPlayer3Remove.setEnabled(false); 	adminWindow.questionPlayer3Remove.setSelectable(false);
				adminWindow.questionPlayer4Add.setEnabled(false); 		adminWindow.questionPlayer4Add.setSelectable(false);
				adminWindow.questionPlayer4Remove.setEnabled(false); 	adminWindow.questionPlayer4Remove.setSelectable(false);
				adminWindow.questionPlayer5Add.setEnabled(false); 		adminWindow.questionPlayer5Add.setSelectable(false);
				adminWindow.questionPlayer5Remove.setEnabled(false); 	adminWindow.questionPlayer5Remove.setSelectable(false);
			}
		});
		adminWindow.questionButtonBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.questionButtonBack.isSelectable()) return;
				
				show("Game");
			}
		});
		adminWindow.questionButtonContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (updater.getState("Answer")) {
					disableCurrentQuestion(true);
					
					show("Game");
				} else
				if (updater.getState("TiebreakerAnswer")) {
					tiebreakerCheck();
				}
			}
		});
		
		
		adminWindow.questionPlayer1Add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.questionPlayer1Add.isSelectable()) return;

				if (updater.getState("Question")) {
					show("Answer");
					
					scoreWindow.addPlayerScore(1, questionSystem.getAnswerWorth() * game);
		 			
		 			adminWindow.questionPlayer1Add.setEnabled(false); 		adminWindow.questionPlayer1Add.setSelectable(false);
		 			adminWindow.questionPlayer1Remove.setEnabled(false); 	adminWindow.questionPlayer1Remove.setSelectable(false);
		 			adminWindow.questionPlayer2Add.setEnabled(false); 		adminWindow.questionPlayer2Add.setSelectable(false);
		 			adminWindow.questionPlayer2Remove.setEnabled(false); 	adminWindow.questionPlayer2Remove.setSelectable(false);
					adminWindow.questionPlayer3Add.setEnabled(false); 		adminWindow.questionPlayer3Add.setSelectable(false);
					adminWindow.questionPlayer3Remove.setEnabled(false); 	adminWindow.questionPlayer3Remove.setSelectable(false);
					adminWindow.questionPlayer4Add.setEnabled(false); 		adminWindow.questionPlayer4Add.setSelectable(false);
					adminWindow.questionPlayer4Remove.setEnabled(false); 	adminWindow.questionPlayer4Remove.setSelectable(false);
					adminWindow.questionPlayer5Add.setEnabled(false); 		adminWindow.questionPlayer5Add.setSelectable(false);
					adminWindow.questionPlayer5Remove.setEnabled(false); 	adminWindow.questionPlayer5Remove.setSelectable(false);
					
					disableCurrentQuestion(true);
				} else
				if (updater.getState("TiebreakerQuestion")) {
					scoreWindow.addPlayerScore(1, 100);
					
		 			adminWindow.questionPlayer1Add.setEnabled(false); 		adminWindow.questionPlayer1Add.setSelectable(false);
		 			adminWindow.questionPlayer1Remove.setEnabled(false); 	adminWindow.questionPlayer1Remove.setSelectable(false);
		 			
		 			tiebreakerAllPointsAssignedCheck();
				}
			}
		});
		adminWindow.questionPlayer1Remove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.questionPlayer1Remove.isSelectable()) return;

				if (updater.getState("Question")) {
					scoreWindow.addPlayerScore(1, -questionSystem.getAnswerWorth() * game);
		 			
					adminWindow.questionPlayer1Add.setEnabled(false); 		adminWindow.questionPlayer1Add.setSelectable(false);
					adminWindow.questionPlayer1Remove.setEnabled(false); 	adminWindow.questionPlayer1Remove.setSelectable(false);
					
					disableCurrentQuestion(false);
				} else
				if (updater.getState("TiebreakerQuestion")) {
					scoreWindow.addPlayerScore(1, -100);
					
		 			adminWindow.questionPlayer1Add.setEnabled(false); 		adminWindow.questionPlayer1Add.setSelectable(false);
		 			adminWindow.questionPlayer1Remove.setEnabled(false); 	adminWindow.questionPlayer1Remove.setSelectable(false);
		 			
		 			tiebreakerAllPointsAssignedCheck();
				}
			}
		});

		adminWindow.questionPlayer2Add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.questionPlayer2Add.isSelectable()) return;

				if (updater.getState("Question")) {
					show("Answer");
					
					scoreWindow.addPlayerScore(2, questionSystem.getAnswerWorth() * game);
		 			
		 			adminWindow.questionPlayer1Add.setEnabled(false); 		adminWindow.questionPlayer1Add.setSelectable(false);
		 			adminWindow.questionPlayer1Remove.setEnabled(false); 	adminWindow.questionPlayer1Remove.setSelectable(false);
		 			adminWindow.questionPlayer2Add.setEnabled(false); 		adminWindow.questionPlayer2Add.setSelectable(false);
		 			adminWindow.questionPlayer2Remove.setEnabled(false); 	adminWindow.questionPlayer2Remove.setSelectable(false);
					adminWindow.questionPlayer3Add.setEnabled(false); 		adminWindow.questionPlayer3Add.setSelectable(false);
					adminWindow.questionPlayer3Remove.setEnabled(false); 	adminWindow.questionPlayer3Remove.setSelectable(false);
					adminWindow.questionPlayer4Add.setEnabled(false); 		adminWindow.questionPlayer4Add.setSelectable(false);
					adminWindow.questionPlayer4Remove.setEnabled(false); 	adminWindow.questionPlayer4Remove.setSelectable(false);
					adminWindow.questionPlayer5Add.setEnabled(false); 		adminWindow.questionPlayer5Add.setSelectable(false);
					adminWindow.questionPlayer5Remove.setEnabled(false); 	adminWindow.questionPlayer5Remove.setSelectable(false);
	
					disableCurrentQuestion(true);
				} else
				if (updater.getState("TiebreakerQuestion")) {
					scoreWindow.addPlayerScore(2, 100);
					
		 			adminWindow.questionPlayer2Add.setEnabled(false); 		adminWindow.questionPlayer2Add.setSelectable(false);
		 			adminWindow.questionPlayer2Remove.setEnabled(false); 	adminWindow.questionPlayer2Remove.setSelectable(false);
		 			
		 			tiebreakerAllPointsAssignedCheck();
				}
			}
		});
		adminWindow.questionPlayer2Remove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.questionPlayer2Remove.isSelectable()) return;

				if (updater.getState("Question")) {
					scoreWindow.addPlayerScore(2, -questionSystem.getAnswerWorth() * game);
		 			
					adminWindow.questionPlayer2Add.setEnabled(false); 		adminWindow.questionPlayer2Add.setSelectable(false);
					adminWindow.questionPlayer2Remove.setEnabled(false); 	adminWindow.questionPlayer2Remove.setSelectable(false);
					
					disableCurrentQuestion(false);
				} else
				if (updater.getState("TiebreakerQuestion")) {
					scoreWindow.addPlayerScore(2, -100);
					
		 			adminWindow.questionPlayer2Add.setEnabled(false); 		adminWindow.questionPlayer2Add.setSelectable(false);
		 			adminWindow.questionPlayer2Remove.setEnabled(false); 	adminWindow.questionPlayer2Remove.setSelectable(false);
		 			
		 			tiebreakerAllPointsAssignedCheck();
				}
			}
		});

		adminWindow.questionPlayer3Add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.questionPlayer3Add.isSelectable()) return;

				if (updater.getState("Question")) {
					show("Answer");
					
					scoreWindow.addPlayerScore(3, questionSystem.getAnswerWorth() * game);
		 			
		 			adminWindow.questionPlayer1Add.setEnabled(false); 		adminWindow.questionPlayer1Add.setSelectable(false);
		 			adminWindow.questionPlayer1Remove.setEnabled(false); 	adminWindow.questionPlayer1Remove.setSelectable(false);
		 			adminWindow.questionPlayer2Add.setEnabled(false); 		adminWindow.questionPlayer2Add.setSelectable(false);
		 			adminWindow.questionPlayer2Remove.setEnabled(false); 	adminWindow.questionPlayer2Remove.setSelectable(false);
					adminWindow.questionPlayer3Add.setEnabled(false); 		adminWindow.questionPlayer3Add.setSelectable(false);
					adminWindow.questionPlayer3Remove.setEnabled(false); 	adminWindow.questionPlayer3Remove.setSelectable(false);
					adminWindow.questionPlayer4Add.setEnabled(false); 		adminWindow.questionPlayer4Add.setSelectable(false);
					adminWindow.questionPlayer4Remove.setEnabled(false); 	adminWindow.questionPlayer4Remove.setSelectable(false);
					adminWindow.questionPlayer5Add.setEnabled(false); 		adminWindow.questionPlayer5Add.setSelectable(false);
					adminWindow.questionPlayer5Remove.setEnabled(false); 	adminWindow.questionPlayer5Remove.setSelectable(false);
	
					disableCurrentQuestion(true);
				} else
				if (updater.getState("TiebreakerQuestion")) {
					scoreWindow.addPlayerScore(3, 100);
					
		 			adminWindow.questionPlayer3Add.setEnabled(false); 		adminWindow.questionPlayer3Add.setSelectable(false);
		 			adminWindow.questionPlayer3Remove.setEnabled(false); 	adminWindow.questionPlayer3Remove.setSelectable(false);
		 			
		 			tiebreakerAllPointsAssignedCheck();
				}
			}
		});
		adminWindow.questionPlayer3Remove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.questionPlayer3Remove.isSelectable()) return;

				if (updater.getState("Question")) {
					scoreWindow.addPlayerScore(3, -questionSystem.getAnswerWorth() * game);
		 			
					adminWindow.questionPlayer3Add.setEnabled(false); 		adminWindow.questionPlayer3Add.setSelectable(false);
					adminWindow.questionPlayer3Remove.setEnabled(false); 	adminWindow.questionPlayer3Remove.setSelectable(false);
					
					disableCurrentQuestion(false);
				} else
				if (updater.getState("TiebreakerQuestion")) {
					scoreWindow.addPlayerScore(3, -100);
					
		 			adminWindow.questionPlayer3Add.setEnabled(false); 		adminWindow.questionPlayer3Add.setSelectable(false);
		 			adminWindow.questionPlayer3Remove.setEnabled(false); 	adminWindow.questionPlayer3Remove.setSelectable(false);
		 			
		 			tiebreakerAllPointsAssignedCheck();
				}
			}
		});

		adminWindow.questionPlayer4Add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.questionPlayer4Add.isSelectable()) return;

				if (updater.getState("Question")) {
					show("Answer");
					
					scoreWindow.addPlayerScore(4, questionSystem.getAnswerWorth() * game);
		 			
		 			adminWindow.questionPlayer1Add.setEnabled(false); 		adminWindow.questionPlayer1Add.setSelectable(false);
		 			adminWindow.questionPlayer1Remove.setEnabled(false); 	adminWindow.questionPlayer1Remove.setSelectable(false);
		 			adminWindow.questionPlayer2Add.setEnabled(false); 		adminWindow.questionPlayer2Add.setSelectable(false);
		 			adminWindow.questionPlayer2Remove.setEnabled(false); 	adminWindow.questionPlayer2Remove.setSelectable(false);
					adminWindow.questionPlayer3Add.setEnabled(false); 		adminWindow.questionPlayer3Add.setSelectable(false);
					adminWindow.questionPlayer3Remove.setEnabled(false); 	adminWindow.questionPlayer3Remove.setSelectable(false);
					adminWindow.questionPlayer4Add.setEnabled(false); 		adminWindow.questionPlayer4Add.setSelectable(false);
					adminWindow.questionPlayer4Remove.setEnabled(false); 	adminWindow.questionPlayer4Remove.setSelectable(false);
					adminWindow.questionPlayer5Add.setEnabled(false); 		adminWindow.questionPlayer5Add.setSelectable(false);
					adminWindow.questionPlayer5Remove.setEnabled(false); 	adminWindow.questionPlayer5Remove.setSelectable(false);
	
					disableCurrentQuestion(true);
				} else
				if (updater.getState("TiebreakerQuestion")) {
					scoreWindow.addPlayerScore(4, 100);
					
		 			adminWindow.questionPlayer4Add.setEnabled(false); 		adminWindow.questionPlayer4Add.setSelectable(false);
		 			adminWindow.questionPlayer4Remove.setEnabled(false); 	adminWindow.questionPlayer4Remove.setSelectable(false);
		 			
		 			tiebreakerAllPointsAssignedCheck();
				}
			}
		});
		adminWindow.questionPlayer4Remove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.questionPlayer4Remove.isSelectable()) return;

				if (updater.getState("Question")) {
					scoreWindow.addPlayerScore(4, -questionSystem.getAnswerWorth() * game);
		 			
					adminWindow.questionPlayer4Add.setEnabled(false); 		adminWindow.questionPlayer4Add.setSelectable(false);
					adminWindow.questionPlayer4Remove.setEnabled(false); 	adminWindow.questionPlayer4Remove.setSelectable(false);
					
					disableCurrentQuestion(false);
				} else
				if (updater.getState("TiebreakerQuestion")) {
					scoreWindow.addPlayerScore(4, -100);
					
		 			adminWindow.questionPlayer4Add.setEnabled(false); 		adminWindow.questionPlayer4Add.setSelectable(false);
		 			adminWindow.questionPlayer4Remove.setEnabled(false); 	adminWindow.questionPlayer4Remove.setSelectable(false);
		 			
		 			tiebreakerAllPointsAssignedCheck();
				}
			}
		});

		adminWindow.questionPlayer5Add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.questionPlayer5Add.isSelectable()) return;

				if (updater.getState("Question")) {
					show("Answer");
					
					scoreWindow.addPlayerScore(5, questionSystem.getAnswerWorth() * game);
		 			
		 			adminWindow.questionPlayer1Add.setEnabled(false); 		adminWindow.questionPlayer1Add.setSelectable(false);
		 			adminWindow.questionPlayer1Remove.setEnabled(false); 	adminWindow.questionPlayer1Remove.setSelectable(false);
		 			adminWindow.questionPlayer2Add.setEnabled(false); 		adminWindow.questionPlayer2Add.setSelectable(false);
		 			adminWindow.questionPlayer2Remove.setEnabled(false); 	adminWindow.questionPlayer2Remove.setSelectable(false);
					adminWindow.questionPlayer3Add.setEnabled(false); 		adminWindow.questionPlayer3Add.setSelectable(false);
					adminWindow.questionPlayer3Remove.setEnabled(false); 	adminWindow.questionPlayer3Remove.setSelectable(false);
					adminWindow.questionPlayer4Add.setEnabled(false); 		adminWindow.questionPlayer4Add.setSelectable(false);
					adminWindow.questionPlayer4Remove.setEnabled(false); 	adminWindow.questionPlayer4Remove.setSelectable(false);
					adminWindow.questionPlayer5Add.setEnabled(false); 		adminWindow.questionPlayer5Add.setSelectable(false);
					adminWindow.questionPlayer5Remove.setEnabled(false); 	adminWindow.questionPlayer5Remove.setSelectable(false);
	
					disableCurrentQuestion(true);
				} else
				if (updater.getState("TiebreakerQuestion")) {
					scoreWindow.addPlayerScore(5, 100);
					
		 			adminWindow.questionPlayer5Add.setEnabled(false); 		adminWindow.questionPlayer5Add.setSelectable(false);
		 			adminWindow.questionPlayer5Remove.setEnabled(false); 	adminWindow.questionPlayer5Remove.setSelectable(false);
		 			
		 			tiebreakerAllPointsAssignedCheck();
				}
			}
		});
		adminWindow.questionPlayer5Remove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.questionPlayer5Remove.isSelectable()) return;
				
				if (updater.getState("Question")) {
					scoreWindow.addPlayerScore(5, -questionSystem.getAnswerWorth() * game);
		 			
					adminWindow.questionPlayer5Add.setEnabled(false); 		adminWindow.questionPlayer5Add.setSelectable(false);
					adminWindow.questionPlayer5Remove.setEnabled(false); 	adminWindow.questionPlayer5Remove.setSelectable(false);
					
					disableCurrentQuestion(false);
				} else
				if (updater.getState("TiebreakerQuestion")) {
					scoreWindow.addPlayerScore(5, -100);
					
		 			adminWindow.questionPlayer5Add.setEnabled(false); 		adminWindow.questionPlayer5Add.setSelectable(false);
		 			adminWindow.questionPlayer5Remove.setEnabled(false); 	adminWindow.questionPlayer5Remove.setSelectable(false);
		 			
		 			tiebreakerAllPointsAssignedCheck();
				}
			}
		});
		
	//Final Question Panel
		adminWindow.finalQuestionButtonBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.finalQuestionButtonContinue.isSelectable()) {return;}
				
				questionSystem.setSavedAnswer(adminWindow.finalAnswerTextBox.getText());

				questionSystem.previousFinalQuestion();
				show("FinalMenu");
			}
		});
		adminWindow.finalQuestionButtonContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.finalQuestionButtonContinue.isSelectable()) {return;}
				
				if (
						questionSystem.getCurrentTurnFinalPlayerNumber() == 2 &&
						
						questionSystem.getSavedAnswer(1, questionSystem.getCurrentFinalQuestionId()).equals(adminWindow.finalAnswerTextBox.getText()) &&
						!adminWindow.finalAnswerTextBox.getText().equals("")
				) {return;}
				
				questionSystem.setSavedAnswer(adminWindow.finalAnswerTextBox.getText());
				
				if (	questionSystem.getCurrentTurnFinalPlayerNumber() == 1 &&
						questionSystem.getCurrentFinalQuestionId() >= 5
				) {
					gameWindow.finalPlayer1Answer1Label.setText(questionSystem.getSavedAnswer(1, 1));
					gameWindow.finalPlayer1Answer2Label.setText(questionSystem.getSavedAnswer(1, 2));
					gameWindow.finalPlayer1Answer3Label.setText(questionSystem.getSavedAnswer(1, 3));
					gameWindow.finalPlayer1Answer4Label.setText(questionSystem.getSavedAnswer(1, 4));
					gameWindow.finalPlayer1Answer5Label.setText(questionSystem.getSavedAnswer(1, 5));
					
					gameWindow.finalPlayer1Answer1WorthLabel.setText(Integer.toString(questionSystem.getFinalAnswerWorth(1, questionSystem.getSavedAnswer(1, 1))));
					gameWindow.finalPlayer1Answer2WorthLabel.setText(Integer.toString(questionSystem.getFinalAnswerWorth(2, questionSystem.getSavedAnswer(1, 2))));
					gameWindow.finalPlayer1Answer3WorthLabel.setText(Integer.toString(questionSystem.getFinalAnswerWorth(3, questionSystem.getSavedAnswer(1, 3))));
					gameWindow.finalPlayer1Answer4WorthLabel.setText(Integer.toString(questionSystem.getFinalAnswerWorth(4, questionSystem.getSavedAnswer(1, 4))));
					gameWindow.finalPlayer1Answer5WorthLabel.setText(Integer.toString(questionSystem.getFinalAnswerWorth(5, questionSystem.getSavedAnswer(1, 5))));
					
					if (gameWindow.finalPlayer1Answer1Label.getText().length() > 12) {
						double lengthToWidthRatio = ((double) (gameWindow.finalPlayer1Answer1Label.getText().length() % 25))
								/ ((double) (gameWindow.finalPlayer1Answer1Label.getWidth() / 10));
						if (40 * lengthToWidthRatio < 20) {lengthToWidthRatio = (double) 20 / (double) 40;}
						gameWindow.finalPlayer1Answer1Label.setFont(new Font("Comic Sans MS", Font.BOLD, (int) Math.round( 40 * lengthToWidthRatio)));
					}
					if (gameWindow.finalPlayer1Answer2Label.getText().length() > 12) {
						double lengthToWidthRatio = ((double) (gameWindow.finalPlayer1Answer2Label.getText().length() % 25))
								/ ((double) (gameWindow.finalPlayer1Answer2Label.getWidth() / 10));
						if (40 * lengthToWidthRatio < 20) {lengthToWidthRatio = (double) 20 / (double) 40;}
						gameWindow.finalPlayer1Answer2Label.setFont(new Font("Comic Sans MS", Font.BOLD, (int) Math.round( 40 * lengthToWidthRatio)));
					}
					if (gameWindow.finalPlayer1Answer3Label.getText().length() > 12) {
						double lengthToWidthRatio = ((double) (gameWindow.finalPlayer1Answer3Label.getText().length() % 25))
								/ ((double) (gameWindow.finalPlayer1Answer3Label.getWidth() / 10));
						if (40 * lengthToWidthRatio < 20) {lengthToWidthRatio = (double) 20 / (double) 40;}
						gameWindow.finalPlayer1Answer3Label.setFont(new Font("Comic Sans MS", Font.BOLD, (int) Math.round( 40 * lengthToWidthRatio)));
					}
					if (gameWindow.finalPlayer1Answer4Label.getText().length() > 12) {
						double lengthToWidthRatio = ((double) (gameWindow.finalPlayer1Answer4Label.getText().length() % 25))
								/ ((double) (gameWindow.finalPlayer1Answer4Label.getWidth() / 10));
						if (40 * lengthToWidthRatio < 20) {lengthToWidthRatio = (double) 20 / (double) 40;}
						gameWindow.finalPlayer1Answer4Label.setFont(new Font("Comic Sans MS", Font.BOLD, (int) Math.round( 40 * lengthToWidthRatio)));
					}
					if (gameWindow.finalPlayer1Answer5Label.getText().length() > 12) {
						double lengthToWidthRatio = ((double) (gameWindow.finalPlayer1Answer5Label.getText().length() % 25))
								/ ((double) (gameWindow.finalPlayer1Answer5Label.getWidth() / 10));
						if (40 * lengthToWidthRatio < 20) {lengthToWidthRatio = (double) 20 / (double) 40;}
						gameWindow.finalPlayer1Answer5Label.setFont(new Font("Comic Sans MS", Font.BOLD, (int) Math.round( 40 * lengthToWidthRatio)));
					}

					questionSystem.nextFinalQuestion();
					show("FinalMenu");
				} else
				if (	questionSystem.getCurrentTurnFinalPlayerNumber() == 2 &&
						questionSystem.getCurrentFinalQuestionId() >= 5
				) {
					gameWindow.finalPlayer2Answer1Label.setText(questionSystem.getSavedAnswer(2, 1));
					gameWindow.finalPlayer2Answer2Label.setText(questionSystem.getSavedAnswer(2, 2));
					gameWindow.finalPlayer2Answer3Label.setText(questionSystem.getSavedAnswer(2, 3));
					gameWindow.finalPlayer2Answer4Label.setText(questionSystem.getSavedAnswer(2, 4));
					gameWindow.finalPlayer2Answer5Label.setText(questionSystem.getSavedAnswer(2, 5));
					
					gameWindow.finalPlayer2Answer1WorthLabel.setText(Integer.toString(questionSystem.getFinalAnswerWorth(1, questionSystem.getSavedAnswer(2, 1))));
					gameWindow.finalPlayer2Answer2WorthLabel.setText(Integer.toString(questionSystem.getFinalAnswerWorth(2, questionSystem.getSavedAnswer(2, 2))));
					gameWindow.finalPlayer2Answer3WorthLabel.setText(Integer.toString(questionSystem.getFinalAnswerWorth(3, questionSystem.getSavedAnswer(2, 3))));
					gameWindow.finalPlayer2Answer4WorthLabel.setText(Integer.toString(questionSystem.getFinalAnswerWorth(4, questionSystem.getSavedAnswer(2, 4))));
					gameWindow.finalPlayer2Answer5WorthLabel.setText(Integer.toString(questionSystem.getFinalAnswerWorth(5, questionSystem.getSavedAnswer(2, 5))));

					if (gameWindow.finalPlayer2Answer1Label.getText().length() > 12) {
						double lengthToWidthRatio = ((double) (gameWindow.finalPlayer2Answer1Label.getText().length() % 25))
								/ ((double) (gameWindow.finalPlayer2Answer1Label.getWidth() / 10));
						if (40 * lengthToWidthRatio < 20) {lengthToWidthRatio = (double) 20 / (double) 40;}
						gameWindow.finalPlayer2Answer1Label.setFont(new Font("Comic Sans MS", Font.BOLD, (int) Math.round( 40 * lengthToWidthRatio)));
					}
					if (gameWindow.finalPlayer2Answer2Label.getText().length() > 12) {
						double lengthToWidthRatio = ((double) (gameWindow.finalPlayer2Answer2Label.getText().length() % 25))
								/ ((double) (gameWindow.finalPlayer2Answer2Label.getWidth() / 10));
						if (40 * lengthToWidthRatio < 20) {lengthToWidthRatio = (double) 20 / (double) 40;}
						gameWindow.finalPlayer2Answer2Label.setFont(new Font("Comic Sans MS", Font.BOLD, (int) Math.round( 40 * lengthToWidthRatio)));
					}
					if (gameWindow.finalPlayer2Answer3Label.getText().length() > 12) {
						double lengthToWidthRatio = ((double) (gameWindow.finalPlayer2Answer3Label.getText().length() % 25))
								/ ((double) (gameWindow.finalPlayer2Answer3Label.getWidth() / 10));
						if (40 * lengthToWidthRatio < 20) {lengthToWidthRatio = (double) 20 / (double) 40;}
						gameWindow.finalPlayer2Answer3Label.setFont(new Font("Comic Sans MS", Font.BOLD, (int) Math.round( 40 * lengthToWidthRatio)));
					}
					if (gameWindow.finalPlayer2Answer4Label.getText().length() > 12) {
						double lengthToWidthRatio = ((double) (gameWindow.finalPlayer2Answer4Label.getText().length() % 25))
								/ ((double) (gameWindow.finalPlayer2Answer4Label.getWidth() / 10));
						if (40 * lengthToWidthRatio < 20) {lengthToWidthRatio = (double) 20 / (double) 40;}
						gameWindow.finalPlayer2Answer4Label.setFont(new Font("Comic Sans MS", Font.BOLD, (int) Math.round( 40 * lengthToWidthRatio)));
					}
					if (gameWindow.finalPlayer2Answer5Label.getText().length() > 12) {
						double lengthToWidthRatio = ((double) (gameWindow.finalPlayer2Answer5Label.getText().length() % 25))
								/ ((double) (gameWindow.finalPlayer2Answer5Label.getWidth() / 10));
						if (40 * lengthToWidthRatio < 20) {lengthToWidthRatio = (double) 20 / (double) 40;}
						gameWindow.finalPlayer2Answer5Label.setFont(new Font("Comic Sans MS", Font.BOLD, (int) Math.round( 40 * lengthToWidthRatio)));
					}
					
					show("FinalReveal");
				} else {
					questionSystem.nextFinalQuestion();
					show("FinalMenu");
				}
			}
		});
		
		adminWindow.finalRevealQuestionButtonBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.finalRevealQuestionButtonBack.isSelectable()) {return;}

				questionSystem.previousFinalQuestion();
				showQuestion(questionSystem.getCurrentFinalQuestionId());
			}
		});
		adminWindow.finalRevealQuestionButtonContinue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.finalRevealQuestionButtonContinue.isSelectable()) {return;}
				
				if (questionSystem.getCurrentFinalQuestionId() >= 5) {show("Results");}

				questionSystem.nextFinalQuestion();
				showQuestion(questionSystem.getCurrentFinalQuestionId());
			}
		});
		adminWindow.finalRevealShowAnswer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.finalRevealShowAnswer.isSelectable()) {return;}
				
				showFinalAnswer(questionSystem.getCurrentFinalQuestionId());
			}
		});
		adminWindow.finalRevealShowWorth.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.finalRevealShowWorth.isSelectable()) {return;}
				
				showFinalWorth(questionSystem.getCurrentFinalQuestionId());
			}
		});
		
	//Results Panel
		adminWindow.buttonPlayAgain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!adminWindow.buttonPlayAgain.isSelectable()) {return;}
				
				resetAll();
			}
		});
		
		
//Editor Window
	//Menu
		editorWindow.buttonAddQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				editorWindow.frame.setSize(1336, 509);
				
				editorWindow.addQuestionCategoryTextBox.setText("");
				editorWindow.addQuestionQuestionTextBox1.setText(""); editorWindow.addQuestionAnswerTextBox1.setText("");
				editorWindow.addQuestionQuestionTextBox2.setText(""); editorWindow.addQuestionAnswerTextBox2.setText("");
				editorWindow.addQuestionQuestionTextBox3.setText(""); editorWindow.addQuestionAnswerTextBox3.setText("");
				editorWindow.addQuestionQuestionTextBox4.setText(""); editorWindow.addQuestionAnswerTextBox4.setText("");
				editorWindow.addQuestionQuestionTextBox5.setText(""); editorWindow.addQuestionAnswerTextBox5.setText("");
				
				editorWindow.addQuestionPictureButton1.setText("❌"); editorWindow.addQuestionPictureButtonBrowse1.setEnabled(false); editorWindow.addQuestionPictureButtonBrowse1.setSelectable(false); editorWindow.addQuestionPictureAnswerButtonBrowse1.setEnabled(false); editorWindow.addQuestionPictureAnswerButtonBrowse1.setSelectable(false);
				editorWindow.addQuestionPictureButton2.setText("❌"); editorWindow.addQuestionPictureButtonBrowse2.setEnabled(false); editorWindow.addQuestionPictureButtonBrowse2.setSelectable(false); editorWindow.addQuestionPictureAnswerButtonBrowse2.setEnabled(false); editorWindow.addQuestionPictureAnswerButtonBrowse2.setSelectable(false);
				editorWindow.addQuestionPictureButton3.setText("❌"); editorWindow.addQuestionPictureButtonBrowse3.setEnabled(false); editorWindow.addQuestionPictureButtonBrowse3.setSelectable(false); editorWindow.addQuestionPictureAnswerButtonBrowse3.setEnabled(false); editorWindow.addQuestionPictureAnswerButtonBrowse3.setSelectable(false);
				editorWindow.addQuestionPictureButton4.setText("❌"); editorWindow.addQuestionPictureButtonBrowse4.setEnabled(false); editorWindow.addQuestionPictureButtonBrowse4.setSelectable(false); editorWindow.addQuestionPictureAnswerButtonBrowse4.setEnabled(false); editorWindow.addQuestionPictureAnswerButtonBrowse4.setSelectable(false);
				editorWindow.addQuestionPictureButton5.setText("❌"); editorWindow.addQuestionPictureButtonBrowse5.setEnabled(false); editorWindow.addQuestionPictureButtonBrowse5.setSelectable(false); editorWindow.addQuestionPictureAnswerButtonBrowse5.setEnabled(false); editorWindow.addQuestionPictureAnswerButtonBrowse5.setSelectable(false);
				
				editorWindow.addQuestionPicturePath1.setText("");
				editorWindow.addQuestionPicturePath2.setText("");
				editorWindow.addQuestionPicturePath3.setText("");
				editorWindow.addQuestionPicturePath4.setText("");
				editorWindow.addQuestionPicturePath5.setText("");
				
				editorWindow.addQuestionPictureAnswerPath1.setText("");
				editorWindow.addQuestionPictureAnswerPath2.setText("");
				editorWindow.addQuestionPictureAnswerPath3.setText("");
				editorWindow.addQuestionPictureAnswerPath4.setText("");
				editorWindow.addQuestionPictureAnswerPath5.setText("");
				
				show("EditorAddQuestion");
			}
		});
		editorWindow.buttonAddTiebreakerQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				editorWindow.frame.setSize(706, 339);

				editorWindow.addTiebreakerQuestionTextBox.setText("");
				editorWindow.addTiebreakerAnswerTextBox.setText("");
				
				show("EditorAddTiebreakerQuestion");
			}
		});
		editorWindow.buttonAddFinalQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (editorWindow.clearAll("addFinalCategory")) {
					editorWindow.frame.setSize(1086, 549);
					show("EditorAddFinalCategory");
				}
			}
		});

	//Add Question
		editorWindow.buttonBackFromAddQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				editorWindow.frame.setSize(356, 319);
				show("EditorMenu");
			}
		});
		editorWindow.buttonSubmitAddQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addQuestionCategoryTextBox.getText().equals("") &&
						
						!editorWindow.addQuestionQuestionTextBox1.getText().equals("") &&
						!editorWindow.addQuestionQuestionTextBox2.getText().equals("") &&
						!editorWindow.addQuestionQuestionTextBox3.getText().equals("") &&
						!editorWindow.addQuestionQuestionTextBox4.getText().equals("") &&
						!editorWindow.addQuestionQuestionTextBox5.getText().equals("") &&
						
						!editorWindow.addQuestionAnswerTextBox1.getText().equals("") &&
						!editorWindow.addQuestionAnswerTextBox2.getText().equals("") &&
						!editorWindow.addQuestionAnswerTextBox3.getText().equals("") &&
						!editorWindow.addQuestionAnswerTextBox4.getText().equals("") &&
						!editorWindow.addQuestionAnswerTextBox5.getText().equals("") &&
						
						(editorWindow.addQuestionPictureButton1.getText() == "❌" || (editorWindow.addQuestionPictureButton1.getText() == "✔" &&
								!editorWindow.addQuestionPicturePath1.getText().equals("None"))) &&
						(editorWindow.addQuestionPictureButton2.getText() == "❌" || (editorWindow.addQuestionPictureButton2.getText() == "✔" &&
								!editorWindow.addQuestionPicturePath2.getText().equals("None"))) &&
						(editorWindow.addQuestionPictureButton3.getText() == "❌" || (editorWindow.addQuestionPictureButton3.getText() == "✔" &&
								!editorWindow.addQuestionPicturePath3.getText().equals("None"))) &&
						(editorWindow.addQuestionPictureButton4.getText() == "❌" || (editorWindow.addQuestionPictureButton4.getText() == "✔" &&
								!editorWindow.addQuestionPicturePath4.getText().equals("None"))) &&
						(editorWindow.addQuestionPictureButton5.getText() == "❌" || (editorWindow.addQuestionPictureButton5.getText() == "✔" &&
								!editorWindow.addQuestionPicturePath5.getText().equals("None")))
						) {
					String questionPicturePath1;
					if (editorWindow.addQuestionPictureButton1.getText().equals("✔")) {
						questionPicturePath1 = editorWindow.addQuestionPicturePath1.getText();
					} else {
						questionPicturePath1 = "None";
					}
					String answerPicturePath1;
					if (editorWindow.addQuestionPictureButton1.getText().equals("✔")) {
						answerPicturePath1 = editorWindow.addQuestionPictureAnswerPath1.getText();
						if (answerPicturePath1.equals("None")) {answerPicturePath1 = questionPicturePath1;}
					} else {
						answerPicturePath1 = "None";
					}
					String questionPicturePath2;
					if (editorWindow.addQuestionPictureButton2.getText().equals("✔")) {
						questionPicturePath2 = editorWindow.addQuestionPicturePath2.getText();
					} else {
						questionPicturePath2 = "None";
					}
					String answerPicturePath2;
					if (editorWindow.addQuestionPictureButton1.getText().equals("✔")) {
						answerPicturePath2 = editorWindow.addQuestionPictureAnswerPath2.getText();
						if (answerPicturePath2.equals("None")) {answerPicturePath2 = questionPicturePath2;}
					} else {
						answerPicturePath2 = "None";
					}
					String questionPicturePath3;
					if (editorWindow.addQuestionPictureButton3.getText().equals("✔")) {
						questionPicturePath3 = editorWindow.addQuestionPicturePath3.getText();
					} else {
						questionPicturePath3 = "None";
					}
					String answerPicturePath3;
					if (editorWindow.addQuestionPictureButton1.getText().equals("✔")) {
						answerPicturePath3 = editorWindow.addQuestionPictureAnswerPath3.getText();
						if (answerPicturePath3.equals("None")) {answerPicturePath3 = questionPicturePath3;}
					} else {
						answerPicturePath3 = "None";
					}
					String questionPicturePath4;
					if (editorWindow.addQuestionPictureButton4.getText().equals("✔")) {
						questionPicturePath4 = editorWindow.addQuestionPicturePath4.getText();
					} else {
						questionPicturePath4 = "None";
					}
					String answerPicturePath4;
					if (editorWindow.addQuestionPictureButton1.getText().equals("✔")) {
						answerPicturePath4 = editorWindow.addQuestionPictureAnswerPath4.getText();
						if (answerPicturePath4.equals("None")) {answerPicturePath4 = questionPicturePath4;}
					} else {
						answerPicturePath4 = "None";
					}
					String questionPicturePath5;
					if (editorWindow.addQuestionPictureButton5.getText().equals("✔")) {
						questionPicturePath5 = editorWindow.addQuestionPicturePath5.getText();
					} else {
						questionPicturePath5 = "None";
					}
					String answerPicturePath5;
					if (editorWindow.addQuestionPictureButton1.getText().equals("✔")) {
						answerPicturePath5 = editorWindow.addQuestionPictureAnswerPath5.getText();
						if (answerPicturePath5.equals("None")) {answerPicturePath5 = questionPicturePath5;}
					} else {
						answerPicturePath5 = "None";
					}
					
					if (sql.addNewCategory(
							editorWindow.addQuestionCategoryTextBox.getText(),
							
							editorWindow.addQuestionQuestionTextBox1.getText(),
							editorWindow.addQuestionQuestionTextBox2.getText(),
							editorWindow.addQuestionQuestionTextBox3.getText(),
							editorWindow.addQuestionQuestionTextBox4.getText(),
							editorWindow.addQuestionQuestionTextBox5.getText(),
							
							editorWindow.addQuestionAnswerTextBox1.getText(),
							editorWindow.addQuestionAnswerTextBox2.getText(),
							editorWindow.addQuestionAnswerTextBox3.getText(),
							editorWindow.addQuestionAnswerTextBox4.getText(),
							editorWindow.addQuestionAnswerTextBox5.getText(),
							
							editorWindow.addQuestionPictureButton1.getText().equals("✔"),
							editorWindow.addQuestionPictureButton2.getText().equals("✔"),
							editorWindow.addQuestionPictureButton3.getText().equals("✔"),
							editorWindow.addQuestionPictureButton4.getText().equals("✔"),
							editorWindow.addQuestionPictureButton5.getText().equals("✔"),
							
							questionPicturePath1,
							questionPicturePath2,
							questionPicturePath3,
							questionPicturePath4,
							questionPicturePath5,
							
							answerPicturePath1,
							answerPicturePath2,
							answerPicturePath3,
							answerPicturePath4,
							answerPicturePath5
							)) {
						editorWindow.frame.setSize(356, 319);
						show("EditorMenu");
					}
				}
			}
		});
		
		editorWindow.addQuestionPictureButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (editorWindow.addQuestionPictureButton1.getText() == "❌") {
					editorWindow.addQuestionPictureButton1.setText("✔");
					editorWindow.addQuestionPictureButtonBrowse1.setEnabled(true); editorWindow.addQuestionPictureButtonBrowse1.setSelectable(true);
					editorWindow.addQuestionPicturePath1.setText("None");
					editorWindow.addQuestionPictureAnswerButtonBrowse1.setEnabled(true); editorWindow.addQuestionPictureAnswerButtonBrowse1.setSelectable(true);
					editorWindow.addQuestionPictureAnswerPath1.setText("None");
				} else
				if (editorWindow.addQuestionPictureButton1.getText() == "✔") {
					editorWindow.addQuestionPictureButton1.setText("❌");
					editorWindow.addQuestionPictureButtonBrowse1.setEnabled(false); editorWindow.addQuestionPictureButtonBrowse1.setSelectable(false);
					editorWindow.addQuestionPicturePath1.setText("");
					editorWindow.addQuestionPictureAnswerButtonBrowse1.setEnabled(false); editorWindow.addQuestionPictureAnswerButtonBrowse1.setSelectable(false);
					editorWindow.addQuestionPictureAnswerPath1.setText("");
				}
			}
		});
		editorWindow.addQuestionPictureButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (editorWindow.addQuestionPictureButton2.getText() == "❌") {
					editorWindow.addQuestionPictureButton2.setText("✔");
					editorWindow.addQuestionPictureButtonBrowse2.setEnabled(true); editorWindow.addQuestionPictureButtonBrowse2.setSelectable(true);
					editorWindow.addQuestionPicturePath2.setText("None");
					editorWindow.addQuestionPictureAnswerButtonBrowse2.setEnabled(true); editorWindow.addQuestionPictureAnswerButtonBrowse2.setSelectable(true);
					editorWindow.addQuestionPictureAnswerPath2.setText("None");
				} else
				if (editorWindow.addQuestionPictureButton2.getText() == "✔") {
					editorWindow.addQuestionPictureButton2.setText("❌");
					editorWindow.addQuestionPictureButtonBrowse2.setEnabled(false); editorWindow.addQuestionPictureButtonBrowse2.setSelectable(false);
					editorWindow.addQuestionPicturePath2.setText("");
					editorWindow.addQuestionPictureAnswerButtonBrowse2.setEnabled(false); editorWindow.addQuestionPictureAnswerButtonBrowse2.setSelectable(false);
					editorWindow.addQuestionPictureAnswerPath2.setText("");
				}
			}
		});
		editorWindow.addQuestionPictureButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (editorWindow.addQuestionPictureButton3.getText() == "❌") {
					editorWindow.addQuestionPictureButton3.setText("✔");
					editorWindow.addQuestionPictureButtonBrowse3.setEnabled(true); editorWindow.addQuestionPictureButtonBrowse3.setSelectable(true);
					editorWindow.addQuestionPicturePath3.setText("None");
					editorWindow.addQuestionPictureAnswerButtonBrowse3.setEnabled(true); editorWindow.addQuestionPictureAnswerButtonBrowse3.setSelectable(true);
					editorWindow.addQuestionPictureAnswerPath3.setText("None");
				} else
				if (editorWindow.addQuestionPictureButton3.getText() == "✔") {
					editorWindow.addQuestionPictureButton3.setText("❌");
					editorWindow.addQuestionPictureButtonBrowse3.setEnabled(false); editorWindow.addQuestionPictureButtonBrowse3.setSelectable(false);
					editorWindow.addQuestionPicturePath3.setText("");
					editorWindow.addQuestionPictureAnswerButtonBrowse3.setEnabled(false); editorWindow.addQuestionPictureAnswerButtonBrowse3.setSelectable(false);
					editorWindow.addQuestionPictureAnswerPath3.setText("");
				}
			}
		});
		editorWindow.addQuestionPictureButton4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (editorWindow.addQuestionPictureButton4.getText() == "❌") {
					editorWindow.addQuestionPictureButton4.setText("✔");
					editorWindow.addQuestionPictureButtonBrowse4.setEnabled(true); editorWindow.addQuestionPictureButtonBrowse4.setSelectable(true);
					editorWindow.addQuestionPicturePath4.setText("None");
					editorWindow.addQuestionPictureAnswerButtonBrowse4.setEnabled(true); editorWindow.addQuestionPictureAnswerButtonBrowse4.setSelectable(true);
					editorWindow.addQuestionPictureAnswerPath4.setText("None");
				} else
				if (editorWindow.addQuestionPictureButton4.getText() == "✔") {
					editorWindow.addQuestionPictureButton4.setText("❌");
					editorWindow.addQuestionPictureButtonBrowse4.setEnabled(false); editorWindow.addQuestionPictureButtonBrowse4.setSelectable(false);
					editorWindow.addQuestionPicturePath4.setText("");
					editorWindow.addQuestionPictureAnswerButtonBrowse4.setEnabled(false); editorWindow.addQuestionPictureAnswerButtonBrowse4.setSelectable(false);
					editorWindow.addQuestionPictureAnswerPath4.setText("");
				}
			}
		});
		editorWindow.addQuestionPictureButton5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (editorWindow.addQuestionPictureButton5.getText() == "❌") {
					editorWindow.addQuestionPictureButton5.setText("✔");
					editorWindow.addQuestionPictureButtonBrowse5.setEnabled(true); editorWindow.addQuestionPictureButtonBrowse5.setSelectable(true);
					editorWindow.addQuestionPicturePath5.setText("None");
					editorWindow.addQuestionPictureAnswerButtonBrowse5.setEnabled(true); editorWindow.addQuestionPictureAnswerButtonBrowse5.setSelectable(true);
					editorWindow.addQuestionPictureAnswerPath5.setText("None");
				} else
				if (editorWindow.addQuestionPictureButton5.getText() == "✔") {
					editorWindow.addQuestionPictureButton5.setText("❌");
					editorWindow.addQuestionPictureButtonBrowse5.setEnabled(false); editorWindow.addQuestionPictureButtonBrowse5.setSelectable(false);
					editorWindow.addQuestionPicturePath5.setText("");
					editorWindow.addQuestionPictureAnswerButtonBrowse5.setEnabled(false); editorWindow.addQuestionPictureAnswerButtonBrowse5.setSelectable(false);
					editorWindow.addQuestionPictureAnswerPath5.setText("");
				}
			}
		});
		
		editorWindow.addQuestionPictureButtonBrowse1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addQuestionPictureButtonBrowse1.isSelectable()) return;
				
                JFileChooser chooser = new JFileChooser(System.getProperty("user.dir") + "\\Question_Pictures");
                if (chooser.showOpenDialog(editorWindow.frame) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    
                    if (file == null) return;
                    
                    String fileName = chooser.getSelectedFile().getAbsolutePath();
                    fileName = fileName.replace(System.getProperty("user.dir"), "");
                    
                    editorWindow.addQuestionPicturePath1.setText(fileName);
                }
				
			}
		});
		editorWindow.addQuestionPictureButtonBrowse2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addQuestionPictureButtonBrowse2.isSelectable()) return;
				
                JFileChooser chooser = new JFileChooser(System.getProperty("user.dir") + "\\Question_Pictures");
                if (chooser.showOpenDialog(editorWindow.frame) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    
                    if (file == null) return;
                    
                    String fileName = chooser.getSelectedFile().getAbsolutePath();
                    fileName = fileName.replace(System.getProperty("user.dir"), "");
                    
                    editorWindow.addQuestionPicturePath2.setText(fileName);
                }
				
			}
		});
		editorWindow.addQuestionPictureButtonBrowse3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addQuestionPictureButtonBrowse3.isSelectable()) return;
				
                JFileChooser chooser = new JFileChooser(System.getProperty("user.dir") + "\\Question_Pictures");
                if (chooser.showOpenDialog(editorWindow.frame) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    
                    if (file == null) return;
                    
                    String fileName = chooser.getSelectedFile().getAbsolutePath();
                    fileName = fileName.replace(System.getProperty("user.dir"), "");
                    
                    editorWindow.addQuestionPicturePath3.setText(fileName);
                }
				
			}
		});
		editorWindow.addQuestionPictureButtonBrowse4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addQuestionPictureButtonBrowse4.isSelectable()) return;
				
                JFileChooser chooser = new JFileChooser(System.getProperty("user.dir") + "\\Question_Pictures");
                if (chooser.showOpenDialog(editorWindow.frame) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    
                    if (file == null) return;
                    
                    String fileName = chooser.getSelectedFile().getAbsolutePath();
                    fileName = fileName.replace(System.getProperty("user.dir"), "");
                    
                    editorWindow.addQuestionPicturePath4.setText(fileName);
                }
				
			}
		});
		editorWindow.addQuestionPictureButtonBrowse5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addQuestionPictureButtonBrowse5.isSelectable()) return;
				
                JFileChooser chooser = new JFileChooser(System.getProperty("user.dir") + "\\Question_Pictures");
                if (chooser.showOpenDialog(editorWindow.frame) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    
                    if (file == null) return;
                    
                    String fileName = chooser.getSelectedFile().getAbsolutePath();
                    fileName = fileName.replace(System.getProperty("user.dir"), "");
                    
                    editorWindow.addQuestionPicturePath5.setText(fileName);
                }
				
			}
		});
		
		editorWindow.addQuestionPictureAnswerButtonBrowse1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addQuestionPictureAnswerButtonBrowse1.isSelectable()) return;
				
                JFileChooser chooser = new JFileChooser(System.getProperty("user.dir") + "\\Question_Pictures");
                if (chooser.showOpenDialog(editorWindow.frame) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    
                    if (file == null) return;
                    
                    String fileName = chooser.getSelectedFile().getAbsolutePath();
                    fileName = fileName.replace(System.getProperty("user.dir"), "");
                    
                    editorWindow.addQuestionPictureAnswerPath1.setText(fileName);
                }
				
			}
		});
		editorWindow.addQuestionPictureAnswerButtonBrowse2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addQuestionPictureAnswerButtonBrowse2.isSelectable()) return;
				
                JFileChooser chooser = new JFileChooser(System.getProperty("user.dir") + "\\Question_Pictures");
                if (chooser.showOpenDialog(editorWindow.frame) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    
                    if (file == null) return;
                    
                    String fileName = chooser.getSelectedFile().getAbsolutePath();
                    fileName = fileName.replace(System.getProperty("user.dir"), "");
                    
                    editorWindow.addQuestionPictureAnswerPath2.setText(fileName);
                }
				
			}
		});
		editorWindow.addQuestionPictureAnswerButtonBrowse3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addQuestionPictureAnswerButtonBrowse3.isSelectable()) return;
				
                JFileChooser chooser = new JFileChooser(System.getProperty("user.dir") + "\\Question_Pictures");
                if (chooser.showOpenDialog(editorWindow.frame) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    
                    if (file == null) return;
                    
                    String fileName = chooser.getSelectedFile().getAbsolutePath();
                    fileName = fileName.replace(System.getProperty("user.dir"), "");
                    
                    editorWindow.addQuestionPictureAnswerPath3.setText(fileName);
                }
				
			}
		});
		editorWindow.addQuestionPictureAnswerButtonBrowse4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addQuestionPictureAnswerButtonBrowse4.isSelectable()) return;
				
                JFileChooser chooser = new JFileChooser(System.getProperty("user.dir") + "\\Question_Pictures");
                if (chooser.showOpenDialog(editorWindow.frame) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    
                    if (file == null) return;
                    
                    String fileName = chooser.getSelectedFile().getAbsolutePath();
                    fileName = fileName.replace(System.getProperty("user.dir"), "");
                    
                    editorWindow.addQuestionPictureAnswerPath4.setText(fileName);
                }
				
			}
		});
		editorWindow.addQuestionPictureAnswerButtonBrowse5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addQuestionPictureAnswerButtonBrowse5.isSelectable()) return;
				
                JFileChooser chooser = new JFileChooser(System.getProperty("user.dir") + "\\Question_Pictures");
                if (chooser.showOpenDialog(editorWindow.frame) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    
                    if (file == null) return;
                    
                    String fileName = chooser.getSelectedFile().getAbsolutePath();
                    fileName = fileName.replace(System.getProperty("user.dir"), "");
                    
                    editorWindow.addQuestionPictureAnswerPath5.setText(fileName);
                }
				
			}
		});
		
	//Add Tiebreaker Question
		editorWindow.buttonBackFromAddTiebreakerQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				editorWindow.frame.setSize(356, 319);
				show("EditorMenu");
			}
		});
		editorWindow.buttonSubmitAddTiebreakerQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (editorWindow.addTiebreakerQuestionTextBox.getText().equals("") || editorWindow.addTiebreakerAnswerTextBox.getText().equals("")) {return;}
				
				if (sql.addNewTiebreakerQuestion(editorWindow.addTiebreakerQuestionTextBox.getText(), editorWindow.addTiebreakerAnswerTextBox.getText())) {
					editorWindow.frame.setSize(356, 319);
					show("EditorMenu");
				}
			}
		});
		
		
	//Add Final Question
		editorWindow.buttonBackFromAddFinalCategory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				editorWindow.frame.setSize(356, 319);
				show("EditorMenu");
			}
		});
		editorWindow.buttonSubmitAddFinalCategory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (	editorWindow.addFinalCategoryNameTextBox.getText().equals("") ||
						
						editorWindow.addFinalQuestionTextBox1.getText().equals("") ||
						editorWindow.addFinalQuestionTextBox2.getText().equals("") ||
						editorWindow.addFinalQuestionTextBox3.getText().equals("") ||
						editorWindow.addFinalQuestionTextBox4.getText().equals("") ||
						editorWindow.addFinalQuestionTextBox5.getText().equals("")	) {return;}
				String strAnswers1 = editorWindow.getAnswersToString(1);
				String strAnswers2 = editorWindow.getAnswersToString(2);
				String strAnswers3 = editorWindow.getAnswersToString(3);
				String strAnswers4 = editorWindow.getAnswersToString(4);
				String strAnswers5 = editorWindow.getAnswersToString(5);
				
				String strAnswersWorth1 = editorWindow.getAnswersWorthToString(1);
				String strAnswersWorth2 = editorWindow.getAnswersWorthToString(2);
				String strAnswersWorth3 = editorWindow.getAnswersWorthToString(3);
				String strAnswersWorth4 = editorWindow.getAnswersWorthToString(4);
				String strAnswersWorth5 = editorWindow.getAnswersWorthToString(5);
				
				if (	strAnswers1.equals("") ||
						strAnswers2.equals("") ||
						strAnswers3.equals("") ||
						strAnswers4.equals("") ||
						strAnswers5.equals("") ||
						
						strAnswersWorth1.equals("") ||
						strAnswersWorth2.equals("") ||
						strAnswersWorth3.equals("") ||
						strAnswersWorth4.equals("") ||
						strAnswersWorth5.equals("")	) {return;}
				
				if (sql.addNewFinalCategory(
						editorWindow.addFinalCategoryNameTextBox.getText(),
						
						editorWindow.addFinalQuestionTextBox1.getText().toLowerCase(),
						editorWindow.addFinalQuestionTextBox2.getText().toLowerCase(),
						editorWindow.addFinalQuestionTextBox3.getText().toLowerCase(),
						editorWindow.addFinalQuestionTextBox4.getText().toLowerCase(),
						editorWindow.addFinalQuestionTextBox5.getText().toLowerCase(),
						
						strAnswers1,
						strAnswers2,
						strAnswers3,
						strAnswers4,
						strAnswers5,
						
						strAnswersWorth1,
						strAnswersWorth2,
						strAnswersWorth3,
						strAnswersWorth4,
						strAnswersWorth5)) {
					editorWindow.frame.setSize(356, 319);
					show("EditorMenu");
				}
			}
		});
		
		editorWindow.addFinalQuestionButtonAddAnswer1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonAddAnswer1.isSelectable()) {return;}
				editorWindow.addFinalCategoryAnswer(1);
			}
		});
		editorWindow.addFinalQuestionButtonRemoveAnswer1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonRemoveAnswer1.isSelectable()) {return;}
				editorWindow.removeFinalCategoryAnswer(1);
			}
		});
		editorWindow.addFinalQuestionButtonClearAnswers1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonClearAnswers1.isSelectable()) {return;}
				editorWindow.clearFinalCategoryAnswers(1);
			}
		});
		
		editorWindow.addFinalQuestionButtonAddAnswer2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonAddAnswer2.isSelectable()) {return;}
				editorWindow.addFinalCategoryAnswer(2);
			}
		});
		editorWindow.addFinalQuestionButtonRemoveAnswer2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonRemoveAnswer2.isSelectable()) {return;}
				editorWindow.removeFinalCategoryAnswer(2);
			}
		});
		editorWindow.addFinalQuestionButtonClearAnswers2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonClearAnswers2.isSelectable()) {return;}
				editorWindow.clearFinalCategoryAnswers(2);
			}
		});
		
		editorWindow.addFinalQuestionButtonAddAnswer3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonAddAnswer3.isSelectable()) {return;}
				editorWindow.addFinalCategoryAnswer(3);
			}
		});
		editorWindow.addFinalQuestionButtonRemoveAnswer3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonRemoveAnswer3.isSelectable()) {return;}
				editorWindow.removeFinalCategoryAnswer(3);
			}
		});
		editorWindow.addFinalQuestionButtonClearAnswers3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonClearAnswers3.isSelectable()) {return;}
				editorWindow.clearFinalCategoryAnswers(3);
			}
		});
		
		editorWindow.addFinalQuestionButtonAddAnswer4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonAddAnswer4.isSelectable()) {return;}
				editorWindow.addFinalCategoryAnswer(4);
			}
		});
		editorWindow.addFinalQuestionButtonRemoveAnswer4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonRemoveAnswer4.isSelectable()) {return;}
				editorWindow.removeFinalCategoryAnswer(4);
			}
		});
		editorWindow.addFinalQuestionButtonClearAnswers4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonClearAnswers4.isSelectable()) {return;}
				editorWindow.clearFinalCategoryAnswers(4);
			}
		});
		
		editorWindow.addFinalQuestionButtonAddAnswer5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonAddAnswer5.isSelectable()) {return;}
				editorWindow.addFinalCategoryAnswer(5);
			}
		});
		editorWindow.addFinalQuestionButtonRemoveAnswer5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonRemoveAnswer5.isSelectable()) {return;}
				editorWindow.removeFinalCategoryAnswer(5);
			}
		});
		editorWindow.addFinalQuestionButtonClearAnswers5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (!editorWindow.addFinalQuestionButtonClearAnswers5.isSelectable()) {return;}
				editorWindow.clearFinalCategoryAnswers(5);
			}
		});
		
	}
	
	private void setGame(int game) {
		this.game = game;
		
		gameWindow.setGame(this.game);
		adminWindow.setGame(this.game);
		
		questionSystem.resetQuestions();
		
		switch (this.game) {
			case 1:
				try {
					questionSystem.setQuestions(questionSystem.getCategoryId(adminWindow.selectGame1Category1.getSelectedIndex()), 1);
					questionSystem.setQuestions(questionSystem.getCategoryId(adminWindow.selectGame1Category2.getSelectedIndex()), 2);
					questionSystem.setQuestions(questionSystem.getCategoryId(adminWindow.selectGame1Category3.getSelectedIndex()), 3);
					questionSystem.setQuestions(questionSystem.getCategoryId(adminWindow.selectGame1Category4.getSelectedIndex()), 4);
					questionSystem.setQuestions(questionSystem.getCategoryId(adminWindow.selectGame1Category5.getSelectedIndex()), 5);
					questionSystem.setQuestions(questionSystem.getCategoryId(adminWindow.selectGame1Category6.getSelectedIndex()), 6);
				} catch (Exception e) {}
				break;
				
			case 2:
				try {
					questionSystem.setQuestions(questionSystem.getCategoryId(adminWindow.selectGame2Category1.getSelectedIndex()), 1);
					questionSystem.setQuestions(questionSystem.getCategoryId(adminWindow.selectGame2Category2.getSelectedIndex()), 2);
					questionSystem.setQuestions(questionSystem.getCategoryId(adminWindow.selectGame2Category3.getSelectedIndex()), 3);
					questionSystem.setQuestions(questionSystem.getCategoryId(adminWindow.selectGame2Category4.getSelectedIndex()), 4);
					questionSystem.setQuestions(questionSystem.getCategoryId(adminWindow.selectGame2Category5.getSelectedIndex()), 5);
					questionSystem.setQuestions(questionSystem.getCategoryId(adminWindow.selectGame2Category6.getSelectedIndex()), 6);
				} catch (Exception e) {}
				break;
				
			case 3:
				tiebreakerCheck();
				break;
				
			case 4:
				setFinalPlayers();
				questionSystem.nextFinalQuestion();
				show("FinalMenu");
				break;
				
			default:	return;
		}
		
		gameWindow.buttonC1.setText(questionSystem.getCategory(1));
		gameWindow.buttonC2.setText(questionSystem.getCategory(2));
		gameWindow.buttonC3.setText(questionSystem.getCategory(3));
		gameWindow.buttonC4.setText(questionSystem.getCategory(4));
		gameWindow.buttonC5.setText(questionSystem.getCategory(5));
		gameWindow.buttonC6.setText(questionSystem.getCategory(6));
		
		adminWindow.buttonC1.setText(questionSystem.getCategory(1));
		adminWindow.buttonC2.setText(questionSystem.getCategory(2));
		adminWindow.buttonC3.setText(questionSystem.getCategory(3));
		adminWindow.buttonC4.setText(questionSystem.getCategory(4));
		adminWindow.buttonC5.setText(questionSystem.getCategory(5));
		adminWindow.buttonC6.setText(questionSystem.getCategory(6));
	}
	
 	private void show(String element) {
 		updater.show(element);
 		
 		if (updater.getState("Game")) {scoreWindow.updatePlayerPositions();}
 		
 	//Set Window Size
 		if (updater.getState("Menu") || updater.getState("QuestionSelector") || updater.getState("PlayerCount") || updater.getState("PlayerNames")) {
 			adminWindow.frame.setSize(656, 489);
 			adminWindow.menuBanner.setVisible(!updater.getState("QuestionSelector"));
 			
 			if (updater.getState("QuestionSelector")) {
 				scoreWindow.frame.setVisible(false);
 	 			gameWindow.frame.setVisible(false);
 	 			
 				questionSystem.fetchCategories();
 				
 				Rectangle tempBounds;
 			//Game 1
 				tempBounds = adminWindow.selectGame1Category1.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectGame1Category1);
 				adminWindow.selectGame1Category1 = new JComboBox<Object>(questionSystem.getCategoryNames());
 				adminWindow.selectGame1Category1.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectGame1Category1);
 				try {adminWindow.selectGame1Category1.setSelectedIndex(0);} catch (Exception e) {}

 				tempBounds = adminWindow.selectGame1Category2.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectGame1Category2);
 				adminWindow.selectGame1Category2 = new JComboBox<Object>(questionSystem.getCategoryNames());
 				adminWindow.selectGame1Category2.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectGame1Category2);
 				try {adminWindow.selectGame1Category2.setSelectedIndex(1);} catch (Exception e) {}

 				tempBounds = adminWindow.selectGame1Category3.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectGame1Category3);
 				adminWindow.selectGame1Category3 = new JComboBox<Object>(questionSystem.getCategoryNames());
 				adminWindow.selectGame1Category3.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectGame1Category3);
 				try {adminWindow.selectGame1Category3.setSelectedIndex(2);} catch (Exception e) {}

 				tempBounds = adminWindow.selectGame1Category4.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectGame1Category4);
 				adminWindow.selectGame1Category4 = new JComboBox<Object>(questionSystem.getCategoryNames());
 				adminWindow.selectGame1Category4.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectGame1Category4);
 				try {adminWindow.selectGame1Category4.setSelectedIndex(3);} catch (Exception e) {}

 				tempBounds = adminWindow.selectGame1Category5.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectGame1Category5);
 				adminWindow.selectGame1Category5 = new JComboBox<Object>(questionSystem.getCategoryNames());
 				adminWindow.selectGame1Category5.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectGame1Category5);
 				try {adminWindow.selectGame1Category5.setSelectedIndex(4);} catch (Exception e) {}

 				tempBounds = adminWindow.selectGame1Category6.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectGame1Category6);
 				adminWindow.selectGame1Category6 = new JComboBox<Object>(questionSystem.getCategoryNames());
 				adminWindow.selectGame1Category6.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectGame1Category6);
 				try {adminWindow.selectGame1Category6.setSelectedIndex(5);} catch (Exception e) {}
 				
 			//Game 2
 				tempBounds = adminWindow.selectGame2Category1.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectGame2Category1);
 				adminWindow.selectGame2Category1 = new JComboBox<Object>(questionSystem.getCategoryNames());
 				adminWindow.selectGame2Category1.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectGame2Category1);
 				try {adminWindow.selectGame2Category1.setSelectedIndex(6);} catch (Exception e) {}

 				tempBounds = adminWindow.selectGame2Category2.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectGame2Category2);
 				adminWindow.selectGame2Category2 = new JComboBox<Object>(questionSystem.getCategoryNames());
 				adminWindow.selectGame2Category2.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectGame2Category2);
 				try {adminWindow.selectGame2Category2.setSelectedIndex(7);} catch (Exception e) {}

 				tempBounds = adminWindow.selectGame2Category3.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectGame2Category3);
 				adminWindow.selectGame2Category3 = new JComboBox<Object>(questionSystem.getCategoryNames());
 				adminWindow.selectGame2Category3.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectGame2Category3);
 				try {adminWindow.selectGame2Category3.setSelectedIndex(8);} catch (Exception e) {}

 				tempBounds = adminWindow.selectGame2Category4.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectGame2Category4);
 				adminWindow.selectGame2Category4 = new JComboBox<Object>(questionSystem.getCategoryNames());
 				adminWindow.selectGame2Category4.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectGame2Category4);
 				try {adminWindow.selectGame2Category4.setSelectedIndex(9);} catch (Exception e) {}

 				tempBounds = adminWindow.selectGame2Category5.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectGame2Category5);
 				adminWindow.selectGame2Category5 = new JComboBox<Object>(questionSystem.getCategoryNames());
 				adminWindow.selectGame2Category5.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectGame2Category5);
 				try {adminWindow.selectGame2Category5.setSelectedIndex(10);} catch (Exception e) {}

 				tempBounds = adminWindow.selectGame2Category6.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectGame2Category6);
 				adminWindow.selectGame2Category6 = new JComboBox<Object>(questionSystem.getCategoryNames());
 				adminWindow.selectGame2Category6.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectGame2Category6);
 				try {adminWindow.selectGame2Category6.setSelectedIndex(11);} catch (Exception e) {}
 				
 			//Final Jeopardy
 				tempBounds = adminWindow.selectFinalJeopardy.getBounds();
 				adminWindow.menuPanel.remove(adminWindow.selectFinalJeopardy);
 				adminWindow.selectFinalJeopardy = new JComboBox<Object>(questionSystem.getFinalCategoryNames());
 				adminWindow.selectFinalJeopardy.setBounds(tempBounds);
 				adminWindow.menuPanel.add(adminWindow.selectFinalJeopardy);
 				try {adminWindow.selectFinalJeopardy.setSelectedIndex(0);} catch (Exception e) {}
 			}
 			
 	 		if (updater.getState("PlayerNames") && scoreWindow.getPlayerCount() > 3) {
 				adminWindow.frame.setSize(656, 574);
 				adminWindow.menuPanel.setSize(640, 535);
 	 		}
 		} else
 		if (updater.getState("Game")) {
 			adminWindow.frame.setSize(1046, 579);
			gameWindow.frame.setVisible(true);
			scoreWindow.frame.setVisible(true);
 			
 			//Game Conditions
 	 		if (					game == 0					) {setGame(1);}
 	 		if (	!adminWindow.buttonC1R1.isSelectable() &&
 	 				!adminWindow.buttonC1R2.isSelectable() &&
 	 				!adminWindow.buttonC1R3.isSelectable() &&
 	 				!adminWindow.buttonC1R4.isSelectable() &&
 	 				!adminWindow.buttonC1R5.isSelectable() &&
 	 				
 	 				!adminWindow.buttonC2R1.isSelectable() &&
 	 				!adminWindow.buttonC2R2.isSelectable() &&
 	 				!adminWindow.buttonC2R3.isSelectable() &&
 	 				!adminWindow.buttonC2R4.isSelectable() &&
 	 				!adminWindow.buttonC2R5.isSelectable() &&
 	 				
 	 				!adminWindow.buttonC3R1.isSelectable() &&
 	 				!adminWindow.buttonC3R2.isSelectable() &&
 	 				!adminWindow.buttonC3R3.isSelectable() &&
 	 				!adminWindow.buttonC3R4.isSelectable() &&
 	 				!adminWindow.buttonC3R5.isSelectable() &&
 	 				
 	 				!adminWindow.buttonC4R1.isSelectable() &&
 	 				!adminWindow.buttonC4R2.isSelectable() &&
 	 				!adminWindow.buttonC4R3.isSelectable() &&
 	 				!adminWindow.buttonC4R4.isSelectable() &&
 	 				!adminWindow.buttonC4R5.isSelectable() &&
 	 				
 	 				!adminWindow.buttonC5R1.isSelectable() &&
 	 				!adminWindow.buttonC5R2.isSelectable() &&
 	 				!adminWindow.buttonC5R3.isSelectable() &&
 	 				!adminWindow.buttonC5R4.isSelectable() &&
 	 				!adminWindow.buttonC5R5.isSelectable() &&
 	 				
 	 				!adminWindow.buttonC6R1.isSelectable() &&
 	 				!adminWindow.buttonC6R2.isSelectable() &&
 	 				!adminWindow.buttonC6R3.isSelectable() &&
 	 				!adminWindow.buttonC6R4.isSelectable() &&
 	 				!adminWindow.buttonC6R5.isSelectable()		) {setGame(++game);}
 		} else
 		if (updater.getState("Question") || updater.getState("TiebreakerQuestion")) {
 			adminWindow.questionButtonBack.setVisible(true);
 			adminWindow.questionButtonShowAnswer.setEnabled(true); adminWindow.questionButtonShowAnswer.setSelectable(true);
 			adminWindow.questionButtonContinue.setVisible(false);
 			
 			adminWindow.questionPlayer1Add.setEnabled(true); 	adminWindow.questionPlayer1Add.setSelectable(true);
 			adminWindow.questionPlayer1Remove.setEnabled(true); adminWindow.questionPlayer1Remove.setSelectable(true);
 			adminWindow.questionPlayer2Add.setEnabled(true); 	adminWindow.questionPlayer2Add.setSelectable(true);
 			adminWindow.questionPlayer2Remove.setEnabled(true); adminWindow.questionPlayer2Remove.setSelectable(true);
			adminWindow.questionPlayer3Add.setEnabled(true); 	adminWindow.questionPlayer3Add.setSelectable(true);
			adminWindow.questionPlayer3Remove.setEnabled(true); adminWindow.questionPlayer3Remove.setSelectable(true);
			adminWindow.questionPlayer4Add.setEnabled(true); 	adminWindow.questionPlayer4Add.setSelectable(true);
			adminWindow.questionPlayer4Remove.setEnabled(true); adminWindow.questionPlayer4Remove.setSelectable(true);
			adminWindow.questionPlayer5Add.setEnabled(true); 	adminWindow.questionPlayer5Add.setSelectable(true);
			adminWindow.questionPlayer5Remove.setEnabled(true); adminWindow.questionPlayer5Remove.setSelectable(true);
	 		if (updater.getState("Question")) {
		 		if (questionSystem.isPictureQuestion()) {
					gameWindow.questionLabelPanel.setBounds(1240, gameWindow.answerLabelPanel.getY(), 1220, gameWindow.answerLabelPanel.getHeight());
					gameWindow.questionLabel.setBounds(gameWindow.answerLabel.getX(), gameWindow.answerLabel.getY(), 1000, gameWindow.answerLabel.getHeight());
					
					gameWindow.answerLabelPanel.setBounds(1240, gameWindow.answerLabelPanel.getY(), 1220, gameWindow.answerLabelPanel.getHeight());
					gameWindow.answerLabel.setBounds(gameWindow.answerLabel.getX(), gameWindow.answerLabel.getY(), 1000, gameWindow.answerLabel.getHeight());
					
					try {
						BufferedImage bimage = ImageIO.read(new File(questionSystem.getQuestionPictureUrl()));
						double img_width = bimage.getWidth();
						double img_height = bimage.getHeight();
						
						int new_img_width;
						int new_img_height;
						if (img_width < img_height) {
							new_img_width = (int) (Math.round((gameWindow.questionPicture.getHeight() / img_height) * img_width));
							new_img_height = gameWindow.questionPicture.getHeight();
						} else if (img_width > img_height) {
							new_img_width = gameWindow.questionPicture.getWidth();
							new_img_height = (int) (Math.round((gameWindow.questionPicture.getWidth() / img_width) * img_height));
						} else {
							new_img_width = (int) Math.round(gameWindow.questionPicture.getHeight());
							new_img_height = (int) Math.round(gameWindow.questionPicture.getHeight());
						}
						
						Image image = new ImageIcon(bimage).getImage().getScaledInstance(new_img_width, new_img_height, Image.SCALE_SMOOTH);
						gameWindow.questionPicture.setIcon(new ImageIcon(image));
					}
					catch (Exception e) {System.err.println(e.getMessage());}
					
					try {
						BufferedImage bimage = ImageIO.read(new File(questionSystem.getAnswerPictureUrl()));
						double img_width = bimage.getWidth();
						double img_height = bimage.getHeight();
						
						int new_img_width;
						int new_img_height;
						if (img_width < img_height) {
							new_img_width = (int) (Math.round((gameWindow.answerPicture.getHeight() / img_height) * img_width));
							new_img_height = gameWindow.answerPicture.getHeight();
						} else if (img_width > img_height) {
							new_img_width = gameWindow.answerPicture.getWidth();
							new_img_height = (int) (Math.round((gameWindow.answerPicture.getWidth() / img_width) * img_height));
						} else {
							new_img_width = (int) Math.round(gameWindow.answerPicture.getHeight());
							new_img_height = (int) Math.round(gameWindow.answerPicture.getHeight());
						}
						
						Image image = new ImageIcon(bimage).getImage().getScaledInstance(new_img_width, new_img_height, Image.SCALE_SMOOTH);
						gameWindow.answerPicture.setIcon(new ImageIcon(image));
					}
					catch (Exception e) {System.err.println(e.getMessage());}
				} else {
					gameWindow.questionLabelPanel.setBounds(10, gameWindow.answerLabelPanel.getY(), 2450, gameWindow.answerLabelPanel.getHeight());
					gameWindow.questionLabel.setBounds(gameWindow.answerLabel.getX(), gameWindow.answerLabel.getY(), 2230, gameWindow.answerLabel.getHeight());
					
					gameWindow.answerLabelPanel.setBounds(10, gameWindow.answerLabelPanel.getY(), 2450, gameWindow.answerLabelPanel.getHeight());
					gameWindow.answerLabel.setBounds(gameWindow.answerLabel.getX(), gameWindow.answerLabel.getY(), 2230, gameWindow.answerLabel.getHeight());
				}
	 		} else if (updater.getState("TiebreakerQuestion")) {
				gameWindow.questionLabelPanel.setBounds(10, gameWindow.answerLabelPanel.getY(), 2450, gameWindow.answerLabelPanel.getHeight());
				gameWindow.questionLabel.setBounds(gameWindow.answerLabel.getX(), gameWindow.answerLabel.getY(), 2230, gameWindow.answerLabel.getHeight());
				
				gameWindow.answerLabelPanel.setBounds(10, gameWindow.answerLabelPanel.getY(), 2450, gameWindow.answerLabelPanel.getHeight());
				gameWindow.answerLabel.setBounds(gameWindow.answerLabel.getX(), gameWindow.answerLabel.getY(), 2230, gameWindow.answerLabel.getHeight());
	 		}
 		} else
 		if (updater.getState("FinalMenu")) {
 			if (questionSystem.getCurrentFinalQuestionId() < 5) {adminWindow.finalQuestionButtonContinue.setText("Continue");}
 			else {adminWindow.finalQuestionButtonContinue.setText("Submit");}
 			
 			adminWindow.finalAnswerTextBox.setAutocompleteItems(questionSystem.getFinalAnswers(questionSystem.getCurrentFinalQuestionId()));
 			
 			showQuestion(questionSystem.getCurrentFinalQuestionId());
		} else
		if (updater.getState("FinalReveal")) {
			gameWindow.finalPlayer1Answer1Label.setVisible(false);	gameWindow.finalPlayer1Answer1WorthLabel.setVisible(false);
			gameWindow.finalPlayer1Answer2Label.setVisible(false);	gameWindow.finalPlayer1Answer2WorthLabel.setVisible(false);
			gameWindow.finalPlayer1Answer3Label.setVisible(false);	gameWindow.finalPlayer1Answer3WorthLabel.setVisible(false);
			gameWindow.finalPlayer1Answer4Label.setVisible(false);	gameWindow.finalPlayer1Answer4WorthLabel.setVisible(false);
			gameWindow.finalPlayer1Answer5Label.setVisible(false);	gameWindow.finalPlayer1Answer5WorthLabel.setVisible(false);

			gameWindow.finalPlayer2Answer1Label.setVisible(false);	gameWindow.finalPlayer2Answer1WorthLabel.setVisible(false);
			gameWindow.finalPlayer2Answer2Label.setVisible(false);	gameWindow.finalPlayer2Answer2WorthLabel.setVisible(false);
			gameWindow.finalPlayer2Answer3Label.setVisible(false);	gameWindow.finalPlayer2Answer3WorthLabel.setVisible(false);
			gameWindow.finalPlayer2Answer4Label.setVisible(false);	gameWindow.finalPlayer2Answer4WorthLabel.setVisible(false);
			gameWindow.finalPlayer2Answer5Label.setVisible(false);	gameWindow.finalPlayer2Answer5WorthLabel.setVisible(false);
			
			adminWindow.finalRevealQuestionButtonContinue.setText("Continue");
			questionSystem.setReveal(true);
			showQuestion(1);
		} else
		if (updater.getState("Results")) {
			if (scoreWindow.getFinalPlayerScore(1) > scoreWindow.getFinalPlayerScore(2)) {
				gameWindow.resultLabel.setText("<html><center>" + scoreWindow.getFinalPlayerName(1) + " Wins</center></html>");
			} else
			if (scoreWindow.getFinalPlayerScore(1) < scoreWindow.getFinalPlayerScore(2)) {
				gameWindow.resultLabel.setText("<html><center>" + scoreWindow.getFinalPlayerName(2) + " Wins</center></html>");
			} else {
				gameWindow.resultLabel.setText("It's A Tie");
			}
		}
 		
 //Set Visible Elements
 	//Admin Window
 		adminWindow.menuPanel.setVisible(updater.getState("Menu") || updater.getState("QuestionSelector") || updater.getState("PlayerCount") || updater.getState("PlayerNames"));
		adminWindow.buttonOpenEditor.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.gamePanel.setVisible(updater.getState("Game"));
 		adminWindow.questionPanel.setVisible(updater.getState("Question") || updater.getState("Answer") || updater.getState("TiebreakerQuestion") || updater.getState("TiebreakerAnswer"));
 		adminWindow.finalMenuPanel.setVisible(updater.getState("FinalMenu"));
		adminWindow.finalRevealPanel.setVisible(updater.getState("FinalReveal"));
		adminWindow.resultsPanel.setVisible(updater.getState("Results"));
 		

 		adminWindow.selectCategoriesTitle.setVisible(updater.getState("QuestionSelector"));
 		
 		adminWindow.selectGame1Heading.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectGame1Category1.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectGame1Category2.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectGame1Category3.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectGame1Category4.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectGame1Category5.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectGame1Category6.setVisible(updater.getState("QuestionSelector"));

 		adminWindow.buttonRandomiseCategories.setVisible(updater.getState("QuestionSelector"));
 		
 		adminWindow.selectGame2Heading.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectGame2Category1.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectGame2Category2.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectGame2Category3.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectGame2Category4.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectGame2Category5.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectGame2Category6.setVisible(updater.getState("QuestionSelector"));
 		
 		adminWindow.selectGame3Heading.setVisible(updater.getState("QuestionSelector"));
 		adminWindow.selectFinalJeopardy.setVisible(updater.getState("QuestionSelector"));
 		
 		adminWindow.selectPlayerCount3.setVisible(updater.getState("PlayerCount"));
 		adminWindow.selectPlayerCount4.setVisible(updater.getState("PlayerCount"));
 		adminWindow.selectPlayerCount5.setVisible(updater.getState("PlayerCount"));

		adminWindow.setPlayerName1.setVisible(updater.getState("PlayerNames"));
		adminWindow.setPlayerName2.setVisible(updater.getState("PlayerNames"));
		adminWindow.setPlayerName3.setVisible(updater.getState("PlayerNames"));
		adminWindow.setPlayerName4.setVisible(updater.getState("PlayerNames") && scoreWindow.getPlayerCount() > 3);
		adminWindow.setPlayerName5.setVisible(updater.getState("PlayerNames") && scoreWindow.getPlayerCount() > 4);
		
		adminWindow.buttonBack.setVisible(!updater.getState("QuestionSelector"));
		adminWindow.questionButtonBack.setVisible(updater.getState("Question"));
		adminWindow.questionButtonShowAnswer.setVisible(updater.getState("Question") || updater.getState("Answer")
//				|| updater.getState("TiebreakerQuestion")
				);
//		adminWindow.questionButtonShowAnswer.setSelectable(!updater.getState("TiebreakerQuestion"));
//		adminWindow.questionButtonShowAnswer.setEnabled(!updater.getState("TiebreakerQuestion"));
		adminWindow.questionButtonContinue.setVisible(updater.getState("Answer") || updater.getState("TiebreakerAnswer"));
		
		adminWindow.finalQuestionButtonBack.setVisible(questionSystem.getCurrentFinalQuestionId() != 1);
		
		adminWindow.finalRevealQuestionButtonBack.setVisible(questionSystem.getCurrentFinalQuestionId() != 1);
		
	//Score Window
		scoreWindow.scorePanel.setVisible(!updater.getState("FinalReveal") && !updater.getState("FinalMenu") && !updater.getState("Results"));
		scoreWindow.finalScorePanel.setVisible(updater.getState("FinalReveal") || updater.getState("FinalMenu"));
		scoreWindow.resultsPanel.setVisible(updater.getState("Results"));
		
	//Game Window
		gameWindow.menuPanel.setVisible(updater.getState("Menu") || updater.getState("PlayerCount") || updater.getState("PlayerNames"));
		gameWindow.gamePanel.setVisible(updater.getState("Game"));
		gameWindow.questionPanel.setVisible(updater.getState("Question") || updater.getState("TiebreakerQuestion"));
		gameWindow.questionPicturePanel.setVisible(questionSystem.isPictureQuestion() && !updater.getState("TiebreakerQuestion"));
		gameWindow.answerPanel.setVisible(updater.getState("Answer") || updater.getState("TiebreakerAnswer"));
		gameWindow.answerPicturePanel.setVisible(questionSystem.isPictureQuestion() && !updater.getState("TiebreakerAnswer"));
		gameWindow.finalMenuPanel.setVisible(updater.getState("FinalMenu"));
		gameWindow.finalPanel.setVisible(updater.getState("FinalReveal"));
		gameWindow.resultsPanel.setVisible(updater.getState("Results"));
		
 	//Editor Window
		editorWindow.menuPanel.setVisible(updater.getState("EditorMenu"));
		editorWindow.addQuestionPanel.setVisible(updater.getState("EditorAddQuestion"));
		editorWindow.addTiebreakerQuestionPanel.setVisible(updater.getState("EditorAddTiebreakerQuestion"));
		editorWindow.addFinalCategoryPanel.setVisible(updater.getState("EditorAddFinalCategory"));
		
		
 		adminWindow.frame.toFront();
 	}

 	private void showQuestion(int C, int R) {
 		questionSystem.setCurrentQuestion(C, R);
 		
		gameWindow.questionTitle.setText(questionSystem.getCategory(C));
		gameWindow.questionWorthTitle.setText(Integer.toString(questionSystem.getAnswerWorth() * game));

		gameWindow.answerTitle.setText(questionSystem.getCategory(C));
		gameWindow.answerWorthTitle.setText(Integer.toString(questionSystem.getAnswerWorth() * game));
		
 		gameWindow.questionLabel.setText("<html><center>" + questionSystem.getQuestion(C, R) + "</center></html>");
 		gameWindow.answerLabel.setText("<html><center>" + questionSystem.getAnswer(C, R) + "</center></html>");
		adminWindow.answerLabel.setText("<html><center>" + questionSystem.getAnswer(C, R) + "</center></html>");
		
		show("Question");
 	}
 	private void showQuestion(int Q) {
 		questionSystem.setCurrentQuestion(Q);
 		
 		adminWindow.finalAnswerTextBox.setText(questionSystem.getSavedAnswer(questionSystem.getCurrentTurnFinalPlayerNumber(), Q));
 		adminWindow.finalQuestionNumberTitle.setText(Integer.toString(questionSystem.getCurrentFinalQuestionId()));
 		adminWindow.finalQuestionLabel.setText("<html><center>" + questionSystem.getQuestion(Q) + "</center></html>");
 		gameWindow.finalQuestionLabel.setText("<html><center>" + questionSystem.getQuestion(Q) + "</center></html>");


 		adminWindow.finalRevealQuestionButtonBack.setVisible(questionSystem.getCurrentFinalQuestionId() > 1);
 		
		adminWindow.finalRevealShowAnswer.setEnabled(!questionSystem.isAnswerRevealed());
		adminWindow.finalRevealShowAnswer.setSelectable(!questionSystem.isAnswerRevealed());
		
		adminWindow.finalRevealShowWorth.setEnabled(questionSystem.isAnswerRevealed() && !questionSystem.isWorthRevealed());
		adminWindow.finalRevealShowWorth.setSelectable(questionSystem.isAnswerRevealed() && !questionSystem.isWorthRevealed());
		
		adminWindow.finalRevealQuestionButtonContinue.setVisible(questionSystem.isAnswerRevealed() && questionSystem.isWorthRevealed());
		if (questionSystem.getCurrentFinalQuestionId() >= 5) {adminWindow.finalRevealQuestionButtonContinue.setText("Results");}
		else {adminWindow.finalRevealQuestionButtonContinue.setText("Continue");}
		
 		adminWindow.finalRevealQuestionNumberTitle.setText(Integer.toString(questionSystem.getCurrentFinalQuestionId()));
 		adminWindow.finalRevealQuestionLabel.setText("<html><center>" + questionSystem.getQuestion(Q) + "</center></html>");
 	}
 	
 	private void showFinalAnswer(int Q) {
		questionSystem.setAnswerRevealed();

		adminWindow.finalRevealShowAnswer.setEnabled(!questionSystem.isAnswerRevealed());
		adminWindow.finalRevealShowAnswer.setSelectable(!questionSystem.isAnswerRevealed());
		
		adminWindow.finalRevealShowWorth.setEnabled(questionSystem.isAnswerRevealed() && !questionSystem.isWorthRevealed());
		adminWindow.finalRevealShowWorth.setSelectable(questionSystem.isAnswerRevealed() && !questionSystem.isWorthRevealed());

		adminWindow.finalRevealQuestionButtonContinue.setVisible(questionSystem.isAnswerRevealed() && questionSystem.isWorthRevealed());
		
		switch (Q) {
		case 1:
			gameWindow.finalPlayer1Answer1Label.setVisible(true);
			gameWindow.finalPlayer2Answer1Label.setVisible(true);
			break;
		case 2:
			gameWindow.finalPlayer1Answer2Label.setVisible(true);
			gameWindow.finalPlayer2Answer2Label.setVisible(true);
			break;
		case 3:
			gameWindow.finalPlayer1Answer3Label.setVisible(true);
			gameWindow.finalPlayer2Answer3Label.setVisible(true);
			break;
		case 4:
			gameWindow.finalPlayer1Answer4Label.setVisible(true);
			gameWindow.finalPlayer2Answer4Label.setVisible(true);
			break;
		case 5:
			gameWindow.finalPlayer1Answer5Label.setVisible(true);
			gameWindow.finalPlayer2Answer5Label.setVisible(true);
			break;
			
		default:	return;
	}
 	}
 	private void showFinalWorth(int Q) {
		questionSystem.setWorthRevealed();

		adminWindow.finalRevealShowAnswer.setEnabled(!questionSystem.isAnswerRevealed());
		adminWindow.finalRevealShowAnswer.setSelectable(!questionSystem.isAnswerRevealed());
		
		adminWindow.finalRevealShowWorth.setEnabled(questionSystem.isAnswerRevealed() && !questionSystem.isWorthRevealed());
		adminWindow.finalRevealShowWorth.setSelectable(questionSystem.isAnswerRevealed() && !questionSystem.isWorthRevealed());

		adminWindow.finalRevealQuestionButtonContinue.setVisible(questionSystem.isAnswerRevealed() && questionSystem.isWorthRevealed());
		
		switch (Q) {
			case 1:
				gameWindow.finalPlayer1Answer1WorthLabel.setVisible(true);
				gameWindow.finalPlayer2Answer1WorthLabel.setVisible(true);
				
				scoreWindow.addFinalPlayerScore(1, Integer.parseInt(gameWindow.finalPlayer1Answer1WorthLabel.getText()));
				scoreWindow.addFinalPlayerScore(2, Integer.parseInt(gameWindow.finalPlayer2Answer1WorthLabel.getText()));
				break;
			case 2:
				gameWindow.finalPlayer1Answer2WorthLabel.setVisible(true);
				gameWindow.finalPlayer2Answer2WorthLabel.setVisible(true);
				
				scoreWindow.addFinalPlayerScore(1, Integer.parseInt(gameWindow.finalPlayer1Answer2WorthLabel.getText()));
				scoreWindow.addFinalPlayerScore(2, Integer.parseInt(gameWindow.finalPlayer2Answer2WorthLabel.getText()));
				break;
			case 3:
				gameWindow.finalPlayer1Answer3WorthLabel.setVisible(true);
				gameWindow.finalPlayer2Answer3WorthLabel.setVisible(true);
				
				scoreWindow.addFinalPlayerScore(1, Integer.parseInt(gameWindow.finalPlayer1Answer3WorthLabel.getText()));
				scoreWindow.addFinalPlayerScore(2, Integer.parseInt(gameWindow.finalPlayer2Answer3WorthLabel.getText()));
				break;
			case 4:
				gameWindow.finalPlayer1Answer4WorthLabel.setVisible(true);
				gameWindow.finalPlayer2Answer4WorthLabel.setVisible(true);
				
				scoreWindow.addFinalPlayerScore(1, Integer.parseInt(gameWindow.finalPlayer1Answer4WorthLabel.getText()));
				scoreWindow.addFinalPlayerScore(2, Integer.parseInt(gameWindow.finalPlayer2Answer4WorthLabel.getText()));
				break;
			case 5:
				gameWindow.finalPlayer1Answer5WorthLabel.setVisible(true);
				gameWindow.finalPlayer2Answer5WorthLabel.setVisible(true);
				
				scoreWindow.addFinalPlayerScore(1, Integer.parseInt(gameWindow.finalPlayer1Answer5WorthLabel.getText()));
				scoreWindow.addFinalPlayerScore(2, Integer.parseInt(gameWindow.finalPlayer2Answer5WorthLabel.getText()));
				break;
				
			default:	return;
		}
 	}
 	
 	private boolean nextTiebreakerQuestion() {
 		try {
			TiebreakerQuestion tq = questionSystem.nextTiebreakerQuestion();
	 		
			gameWindow.questionTitle.setText(tq.getCategory());
			gameWindow.questionWorthTitle.setText("");
			gameWindow.answerTitle.setText(tq.getCategory());
			gameWindow.answerWorthTitle.setText("");
			
			gameWindow.questionLabel.setText("<html><center>" + tq.getQuestion() + "</center></html>");
	 		gameWindow.answerLabel.setText("<html><center>" + tq.getAnswer() + "</center></html>");
			adminWindow.answerLabel.setText("<html><center>" + tq.getAnswer() + "</center></html>");
			
			return true;
 		} catch (Exception e) {return false;}
 	}
 	
 	private void tiebreakerCheck() {
 		scoreWindow.updatePlayerPositions();
 		
 		boolean isTie = false;
 		if (	scoreWindow.totalPlayersInPosition(1) > 2 ||
 				(	scoreWindow.totalPlayersInPosition(1) == 1 &&
 					scoreWindow.totalPlayersInPosition(2) > 1	)
 			) {isTie = true;}
		
		if (isTie) {
			if (nextTiebreakerQuestion()) {show("TiebreakerQuestion");}
			else {setGame(4);}
		} else {setGame(4);}
 	}
 	private void tiebreakerAllPointsAssignedCheck() {
 		if (
 				adminWindow.questionPlayer1Add.isSelectable() ||
 				adminWindow.questionPlayer1Remove.isSelectable() ||
 				
 				adminWindow.questionPlayer2Add.isSelectable() ||
 				adminWindow.questionPlayer2Remove.isSelectable() ||
 				
 				adminWindow.questionPlayer3Add.isSelectable() ||
 				adminWindow.questionPlayer3Remove.isSelectable()
 		) {return;}
 		
 		switch (scoreWindow.getPlayerCount()) {
		case 4:
			if (
	 				adminWindow.questionPlayer4Add.isSelectable() ||
	 				adminWindow.questionPlayer4Remove.isSelectable()
			) {return;}
			break;
		case 5:
			if (
	 				adminWindow.questionPlayer4Add.isSelectable() ||
	 				adminWindow.questionPlayer4Remove.isSelectable() ||

	 				adminWindow.questionPlayer5Add.isSelectable() ||
	 				adminWindow.questionPlayer5Remove.isSelectable()
			) {return;}
			break;
 		}

 		show("TiebreakerAnswer");
 	}
 	
	private void setFinalPlayers() {
 		scoreWindow.setFinalPlayerName(1, scoreWindow.getPlayerName(scoreWindow.getPlayerNumbersPositionOrder()[0]));
 		scoreWindow.setFinalPlayerName(2, scoreWindow.getPlayerName(scoreWindow.getPlayerNumbersPositionOrder()[1]));
 	}
 	
  	private void disableCurrentQuestion(boolean showContinue) {
		adminWindow.questionButtonBack.setVisible(false);
		adminWindow.questionButtonShowAnswer.setEnabled(!showContinue); adminWindow.questionButtonShowAnswer.setSelectable(!showContinue);
		adminWindow.questionButtonContinue.setVisible(showContinue);
		
 		gameWindow.disableQuestion(questionSystem.getCurrentQuestionId());
 		adminWindow.disableQuestion(questionSystem.getCurrentQuestionId());
 	}
  	
	private void resetAll() {
  		questionSystem.resetAll();
//  		adminWindow.resetAll();
//  		gameWindow.resetAll();
  		scoreWindow.resetAll();
  		
  		show("QuestionSelector");
  	}
}
