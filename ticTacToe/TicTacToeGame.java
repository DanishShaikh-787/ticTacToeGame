package ticTacToe;

import java.util.Scanner;
public class TicTacToeGame {
	static char[] board = new char[10];

	public static void main(String[] args) {
		createBoard();
		callXorO();
	}
//UC2
	public static void callXorO() {
		char player = ' ';
		char computer = ' ';
		player = selectOption();
		if (player == 'X') {
			computer = 'O';
		} else {
			computer = 'X';
		}
		System.out.println(player + " your option player " + computer + " is computer");
	}
	private static char selectOption() {
		char player = 'X';
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Select either X or O");
			player = sc.next().charAt(0);
			if (player == 'X') {
				return 'X';
			} else if (player == 'O') {
				return 'O';
			} else {
				System.out.println("Invalid choice");
				continue;
			}
		}
	}
//UC1
	static void createBoard() {
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
	}
}
