import java.util.Arrays;
import java.util.List;

import util.MyConsole;

public class TicTacToe {

	static String boardBoarder = "+---+---+---+";

	static String[][] board = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Tic Tac Toe");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			displayBoard();
			String turn = "X";
			String player = "";
			int moves = 0;
			boolean winner = false;
			while (!winner) {
				player = turn;
				MyConsole.printLine(turn + "'s turn");
				int r = MyConsole.promptInt("Pick a row (1, 2, 3): ", 1, 3) - 1;
				int c = MyConsole.promptInt("Pick a column (1, 2, 3): ", 1, 3) - 1;
				// checkBoard(r,c);
				while (!board[r][c].equals(" ")) {
					MyConsole.printLine("Spot is already taken - Try again");
					r = MyConsole.promptInt("Pick a row (1, 2, 3): ") - 1;
					c = MyConsole.promptInt("Pick a column (1, 2, 3): ") - 1;
				}
				board[r][c] = turn;
				displayBoard();
				moves++;
				winner = checkForWinner(winner);
				if (moves == 9) {
					break;
				}
				if (turn == "X") {
					turn = "O";
				} else if (turn == "O") {
					turn = "X";
				}

			}
			if (winner == true) {
				MyConsole.printLine(player + " is the Winner!");
			} else
				MyConsole.printLine("Cats game!");
			MyConsole.printLine("\nGame over!");
			choice = MyConsole.promptReqString("\nContinue? (y/n): ", "n", "y");
		}
		MyConsole.printLine("Bye");
	}

	private static boolean checkForWinner(boolean winner) {
		for (int i = 0; i < 3; i++) {
			if (!board[0][i].equals(" ") && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
				winner = true;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (!board[i][0].equals(" ") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
				winner = true;
			}
		}

		if 		((!board[0][0].equals(" ") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
				|| (!board[0][2].equals(" ") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))) {
			winner = true;
		}
		return winner;
	}

	private static void displayBoard() {
		String boardString = boardBoarder + "\n";
		// loop through the rows
		for (int r = 0; r < board.length; r++) {
			// loop though the columns
			boardString += "|";
			for (int c = 0; c < board[r].length; c++) {
				boardString += " " + (board[r][c]) + " |";
			}
			boardString += "\n" + boardBoarder + "\n";

		}
		MyConsole.printLine("\n" + boardString);
	}

}