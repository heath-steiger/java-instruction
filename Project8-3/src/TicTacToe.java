import java.util.Arrays;
import java.util.List;

import util.MyConsole;

public class TicTacToe {

	static String boardBoarder = "+---+---+---+";

	static String[][] board = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Tic Tac Toe");

		displayBoard();
		String turn = "X";
		boolean winner = false;
		while (!winner) {
			MyConsole.printLine(turn + "'s turn");
			int r = MyConsole.promptInt("Pick a row (1, 2, 3): ") - 1;
			int c = MyConsole.promptInt("Pick a column (1, 2, 3): ") - 1;
			//checkBoard(r,c);
			while (!board[r][c].equals(" ")) {
				MyConsole.printLine("Spot is already taken - Try again");
				r = MyConsole.promptInt("Pick a row (1, 2, 3): ") - 1;
				c = MyConsole.promptInt("Pick a column (1, 2, 3): ") - 1;
			}
			board[r][c] = turn;
			displayBoard();
			if (turn == "X")

			{
				turn = "O";
			} else if (turn == "O") {
				turn = "X";
			}

		}
		MyConsole.printLine("Bye");
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
		MyConsole.printLine(boardString);
	}
	
	

}