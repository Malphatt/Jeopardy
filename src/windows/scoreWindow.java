package windows;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;

import components.modelPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class scoreWindow {

	public JFrame frame;
		public final modelPanel scorePanel = new modelPanel();
			JLabel player1Name = new JLabel("Player 1");
			JLabel player1Score = new JLabel("0");
			JLabel player2Name = new JLabel("Player 2");
			JLabel player2Score = new JLabel("0");
			JLabel player3Name = new JLabel("Player 3");
			JLabel player3Score = new JLabel("0");
			JLabel player4Name = new JLabel("Player 4");
			JLabel player4Score = new JLabel("0");
			JLabel player5Name = new JLabel("Player 5");
			JLabel player5Score = new JLabel("0");
			
		public final modelPanel finalScorePanel = new modelPanel();
			JLabel finalPlayer1Name = new JLabel("Player 1");
			JLabel finalPlayer1Score = new JLabel("0");
			JLabel finalPlayer2Name = new JLabel("Player 2");
			JLabel finalPlayer2Score = new JLabel("0");
		
			private int player1Position = 1;
			private int player2Position = 1;
			private int player3Position = 1;
			private int player4Position = 1;
			private int player5Position = 1;
			
		public final modelPanel resultsPanel = new modelPanel();
			
	private int playerCount = 3;

	public scoreWindow() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("JEOPARDY Scores");
		frame.setBounds(100, 200, 956, 300); //956 //1266 //1576
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "\\Assets\\crown.png"));
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		
			scorePanel.setBounds(0, 0, 940, 1180); //940 //1250 //1560 
			scorePanel.setLayout(null);
			frame.getContentPane().add(scorePanel);
			
				player1Name.setBounds(10, 10, 300, 100);
				player1Name.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				player1Name.setForeground(Color.decode("#e1b173"));
				player1Name.setHorizontalAlignment(SwingConstants.CENTER);
				scorePanel.add(player1Name);
				
				player1Score.setBounds(10, 120, 300, 100);
				player1Score.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				player1Score.setForeground(Color.decode("#e1b173"));
				player1Score.setHorizontalAlignment(SwingConstants.CENTER);
				scorePanel.add(player1Score);
				
				player2Name.setBounds(320, 10, 300, 100);
				player2Name.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				player2Name.setForeground(Color.decode("#e1b173"));
				player2Name.setHorizontalAlignment(SwingConstants.CENTER);
				scorePanel.add(player2Name);
				
				player2Score.setBounds(320, 120, 300, 100);
				player2Score.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				player2Score.setForeground(Color.decode("#e1b173"));
				player2Score.setHorizontalAlignment(SwingConstants.CENTER);
				scorePanel.add(player2Score);
				
				player3Name.setBounds(630, 10, 300, 100);
				player3Name.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				player3Name.setForeground(Color.decode("#e1b173"));
				player3Name.setHorizontalAlignment(SwingConstants.CENTER);
				scorePanel.add(player3Name);
				
				player3Score.setBounds(630, 120, 300, 100);
				player3Score.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				player3Score.setForeground(Color.decode("#e1b173"));
				player3Score.setHorizontalAlignment(SwingConstants.CENTER);
				scorePanel.add(player3Score);
				
				player4Name.setBounds(940, 10, 300, 100);
				player4Name.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				player4Name.setForeground(Color.decode("#e1b173"));
				player4Name.setHorizontalAlignment(SwingConstants.CENTER);
				scorePanel.add(player4Name);
				
				player4Score.setBounds(940, 120, 300, 100);
				player4Score.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				player4Score.setForeground(Color.decode("#e1b173"));
				player4Score.setHorizontalAlignment(SwingConstants.CENTER);
				scorePanel.add(player4Score);
				
				player5Name.setBounds(1250, 10, 300, 100);
				player5Name.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				player5Name.setForeground(Color.decode("#e1b173"));
				player5Name.setHorizontalAlignment(SwingConstants.CENTER);
				scorePanel.add(player5Name);
				
				player5Score.setBounds(1250, 120, 300, 100);
				player5Score.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				player5Score.setForeground(Color.decode("#e1b173"));
				player5Score.setHorizontalAlignment(SwingConstants.CENTER);
				scorePanel.add(player5Score);
				
				
			finalScorePanel.setBounds(0, 0, 940, 1180); //940 //1250 //1560 
			finalScorePanel.setLayout(null);
			frame.getContentPane().add(finalScorePanel);
			
				finalPlayer1Name.setBounds(10, 10, 300, 100);
				finalPlayer1Name.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer1Name.setForeground(Color.decode("#e1b173"));
				finalPlayer1Name.setHorizontalAlignment(SwingConstants.CENTER);
				finalScorePanel.add(finalPlayer1Name);
				
				finalPlayer1Score.setBounds(10, 120, 300, 100);
				finalPlayer1Score.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer1Score.setForeground(Color.decode("#e1b173"));
				finalPlayer1Score.setHorizontalAlignment(SwingConstants.CENTER);
				finalScorePanel.add(finalPlayer1Score);
				
				finalPlayer2Name.setBounds(630, 10, 300, 100);
				finalPlayer2Name.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer2Name.setForeground(Color.decode("#e1b173"));
				finalPlayer2Name.setHorizontalAlignment(SwingConstants.CENTER);
				finalScorePanel.add(finalPlayer2Name);
				
				finalPlayer2Score.setBounds(630, 120, 300, 100);
				finalPlayer2Score.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
				finalPlayer2Score.setForeground(Color.decode("#e1b173"));
				finalPlayer2Score.setHorizontalAlignment(SwingConstants.CENTER);
				finalScorePanel.add(finalPlayer2Score);
				
			resultsPanel.setBounds(0, 0, 940, 1180); //940 //1250 //1560 
			resultsPanel.setLayout(null);
			frame.getContentPane().add(resultsPanel);
	}
	
	public void resetAll() {
		player1Name.setText("Player 1");
		player1Score.setText("0");
		player2Name.setText("Player 2");
		player2Score.setText("0");
		player3Name.setText("Player 3");
		player3Score.setText("0");
		player4Name.setText("Player 4");
		player4Score.setText("0");
		player5Name.setText("Player 5");
		player5Score.setText("0");

		finalPlayer1Name.setText("Player 1");
		finalPlayer1Score.setText("0");
		finalPlayer2Name.setText("Player 2");
		finalPlayer2Score.setText("0");
		
		updatePlayerPositions();
	}
	
	public void setPlayerCount(int count) {
		playerCount = count;
		if (playerCount==3) {
			frame.setSize(956, frame.getHeight());
			scorePanel.setSize(940, scorePanel.getHeight());
			finalScorePanel.setSize(940, finalScorePanel.getHeight());
			finalPlayer2Name.setLocation(630, finalPlayer2Name.getY());
			finalPlayer2Score.setLocation(630, finalPlayer2Score.getY());
			resultsPanel.setSize(940, finalScorePanel.getHeight());
		} else
		if (playerCount==4) {
			frame.setSize(1266, frame.getHeight());
			scorePanel.setSize(1250, scorePanel.getHeight());
			finalScorePanel.setSize(1250, finalScorePanel.getHeight());
			finalPlayer2Name.setLocation(940, finalPlayer2Name.getY());
			finalPlayer2Score.setLocation(940, finalPlayer2Score.getY());
			resultsPanel.setSize(1250, finalScorePanel.getHeight());
		} else
		if (playerCount==5) {
			frame.setSize(1576, frame.getHeight());
			scorePanel.setSize(1560, scorePanel.getHeight());
			finalScorePanel.setSize(1560, finalScorePanel.getHeight());
			finalPlayer2Name.setLocation(1250, finalPlayer2Name.getY());
			finalPlayer2Score.setLocation(1250, finalPlayer2Score.getY());
			resultsPanel.setSize(1560, finalScorePanel.getHeight());
		} else {
			System.out.println("Invalid Player Count");
		}
	}
	public int getPlayerCount() {
		return playerCount;
	}
	
	public String getPlayerName(int playerNumber) {
		switch (playerNumber) {
			case 1:		return player1Name.getText();
			case 2:		return player2Name.getText();
			case 3:		return player3Name.getText();
			case 4:		return player4Name.getText();
			case 5:		return player5Name.getText();
			
			default:	return "null";
		}
	}
	public void setPlayerName(int player, String name) {
		if (player==1) {
			player1Name.setText(name);
		} else
		if (player==2) {
			player2Name.setText(name);
		} else
		if (player==3) {
			player3Name.setText(name);
		} else
		if (player==4) {
			player4Name.setText(name);
		} else
		if (player==5) {
			player5Name.setText(name);
		} else {
			System.out.println("null player (Name)");
		}
	}
	
	public void setPlayerScore(int player, int score) {
		if (player==1) {
			player1Score.setText(Integer.toString(score));
		} else
		if (player==2) {
			player2Score.setText(Integer.toString(score));
		} else
		if (player==3) {
			player3Score.setText(Integer.toString(score));
		} else
		if (player==4) {
			player4Score.setText(Integer.toString(score));
		} else
		if (player==5) {
			player5Score.setText(Integer.toString(score));
		} else {
			System.out.println("null player (Add Score)");
		}
	}
	public int getPlayerScore(int player) {
		if (player==1) {
			return Integer.parseInt(player1Score.getText());
		} else
		if (player==2) {
			return Integer.parseInt(player2Score.getText());
		} else
		if (player==3) {
			return Integer.parseInt(player3Score.getText());
		} else
		if (player==4) {
			return Integer.parseInt(player4Score.getText());
		} else
		if (player==5) {
			return Integer.parseInt(player5Score.getText());
		} else {
			return -1;
		}
	}
	public void addPlayerScore(int player, int score) {
		if (player==1) {
			player1Score.setText(Integer.toString(getPlayerScore(1) + score));
		} else
		if (player==2) {
			player2Score.setText(Integer.toString(getPlayerScore(2) + score));
		} else
		if (player==3) {
			player3Score.setText(Integer.toString(getPlayerScore(3) + score));
		} else
		if (player==4) {
			player4Score.setText(Integer.toString(getPlayerScore(4) + score));
		} else
		if (player==5) {
			player5Score.setText(Integer.toString(getPlayerScore(5) + score));
		} else {
			System.out.println("null player (Add Score)");
		}
	}
	
	public String getFinalPlayerName(int player) {
		switch (player) {
			case 1: return finalPlayer1Name.getText();
			case 2: return finalPlayer2Name.getText();
			
			default: return "null";
		}
	}
	public void setFinalPlayerName(int player, String name) {
		switch (player) {
		case 1: finalPlayer1Name.setText(name);	return;
		case 2: finalPlayer2Name.setText(name);	return;
		
		default: return;
	}
	}
	
	public int getFinalPlayerScore(int player) {
		switch (player) {
			case 1:	return Integer.parseInt(finalPlayer1Score.getText());
			case 2:	return Integer.parseInt(finalPlayer2Score.getText());
			
			default: return -1;
		}
	}
	public void addFinalPlayerScore(int player, int score) {
		switch (player) {
			case 1:	finalPlayer1Score.setText(Integer.toString(getFinalPlayerScore(1) + score));	return;
			case 2:	finalPlayer2Score.setText(Integer.toString(getFinalPlayerScore(2) + score));	return;
			
			default: return;
		}
	}
	
// Player Positions
	public void updatePlayerPositions() {
		ArrayList<int[]> playerScoreList = new ArrayList<int[]>();
		
		playerScoreList.add(new int[] {getPlayerScore(1), 1});
		playerScoreList.add(new int[] {getPlayerScore(2), 2});
		playerScoreList.add(new int[] {getPlayerScore(3), 3});
		if (getPlayerCount() > 3) {playerScoreList.add(new int[] {getPlayerScore(4), 4});}
		if (getPlayerCount() > 4) {playerScoreList.add(new int[] {getPlayerScore(5), 5});}
		
		int[][] playerScoreArray = new int[playerScoreList.size()][];
		
		for (int i = 0; i < playerScoreList.size(); i++) {
			playerScoreArray[i] = playerScoreList.get(i);
		}
		
	// Sort Position Order
		playerScoreArray = sortByScore(playerScoreArray);
		
		for (int i = 0; i < playerScoreArray.length; i++) {
			switch (playerScoreArray[i][1]) {
				case 1:	player1Position = i + 1;	break;
				case 2:	player2Position = i + 1;	break;
				case 3:	player3Position = i + 1;	break;
				case 4:	player4Position = i + 1;	break;
				case 5:	player5Position = i + 1;	break;
			}
		}
		for (int i = 0; i < playerScoreArray.length - 1; i++) {
			if (playerScoreArray[i][0] == playerScoreArray[i + 1][0]) {
				switch (playerScoreArray[i][1]) {
					case 1:
						switch (playerScoreArray[i + 1][1]) {
							case 2:	player2Position = player1Position;	break;
							case 3:	player3Position = player1Position;	break;
							case 4:	player4Position = player1Position;	break;
							case 5:	player5Position = player1Position;	break;
						}
						break;
					case 2:
						switch (playerScoreArray[i + 1][1]) {
							case 1:	player1Position = player2Position;	break;
							case 3:	player3Position = player2Position;	break;
							case 4:	player4Position = player2Position;	break;
							case 5:	player5Position = player2Position;	break;
						}
						break;
					case 3:
						switch (playerScoreArray[i + 1][1]) {
							case 1:	player1Position = player3Position;	break;
							case 2:	player1Position = player3Position;	break;
							case 4:	player4Position = player3Position;	break;
							case 5:	player5Position = player3Position;	break;
						}
						break;
					case 4:
						switch (playerScoreArray[i + 1][1]) {
							case 1:	player1Position = player4Position;	break;
							case 2:	player2Position = player4Position;	break;
							case 3:	player3Position = player4Position;	break;
							case 5:	player5Position = player4Position;	break;
						}
						break;
					case 5:
						switch (playerScoreArray[i + 1][1]) {
							case 1:	player1Position = player5Position;	break;
							case 2:	player2Position = player5Position;	break;
							case 3:	player3Position = player5Position;	break;
							case 4:	player4Position = player5Position;	break;
						}
						break;
				}
			}
		}
	}
	private int[][] sortByScore(int[][] playerScoreArray) {
		int arrLength = playerScoreArray.length;
		for (int j = 0; j < arrLength; j++) {
			int[] key = playerScoreArray[j];
			int i = j - 1;
			
			while ((i > -1) && (playerScoreArray[i][0] < key[0])) {
				playerScoreArray[i + 1] = playerScoreArray[i];
				i--;
			}
			playerScoreArray[i + 1] = key;
		}
		
		return playerScoreArray;
	}
	
	public String[] getPlayerNamesPositionOrder() {
		ArrayList<String> tempList = new ArrayList<String>();
		
		int i = tempList.size() + 1;
		while (i <= getPlayerCount()) {
			if (player1Position == i) {tempList.add(player1Name.getText());}
			if (player2Position == i) {tempList.add(player2Name.getText());}
			if (player3Position == i) {tempList.add(player3Name.getText());}
			if (getPlayerCount() < 3 && player4Position == i) {tempList.add(player4Name.getText());}
			if (getPlayerCount() < 4 && player5Position == i) {tempList.add(player5Name.getText());}
			i = tempList.size() + 1;
		}
		
		String[] strTempList = new String[tempList.size()];
		for(int j = 0; j < tempList.size(); j++) {
			strTempList[j] = tempList.get(j);
		}
		
		return strTempList;
	}
	public int[] getPlayerNumbersPositionOrder() {
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		
		while (tempList.size() < getPlayerCount()) {
			int i = tempList.size() + 1;
			
			if (player1Position == i) {tempList.add(1);}
			if (player2Position == i) {tempList.add(2);}
			if (player3Position == i) {tempList.add(3);}
			if (getPlayerCount() > 3 && player4Position == i) {tempList.add(4);}
			if (getPlayerCount() > 4 && player5Position == i) {tempList.add(5);}
		}
		
		int[] intTempList = new int[tempList.size()];
		for (int j = 0; j < tempList.size(); j++) {
			intTempList[j] = tempList.get(j);
		}
		
		return intTempList;
	}
	public int getPlayerPosition(int playerNumber) {
		switch (playerNumber) {
			case 1:		return player1Position;
			case 2:		return player2Position;
			case 3:		return player3Position;
			case 4:		return player4Position;
			case 5:		return player5Position;
			
			default:	return 0;
		}
	}
	public int totalPlayersInPosition(int position) {
		int returnValue = 0;
		
		if (player1Position == position) {++returnValue;}
		if (player2Position == position) {++returnValue;}
		if (player3Position == position) {++returnValue;}
		if (getPlayerCount() > 3 && player4Position == position) {++returnValue;}
		if (getPlayerCount() > 4 && player5Position == position) {++returnValue;}
		
		return returnValue;
	}
}
