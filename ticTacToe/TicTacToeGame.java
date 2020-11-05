package ticTacToe;

import java.util.Scanner;
public class TicTacToeGame {
	static char[] board = new char[10];

	public static void main(String[] args) {
		createBoard();
		callXorO();
		showboard();
	}
//UC3 Show The Board
private static void showboard() {
	
		System.out.println("|" +board[1] + "|" +board[2]+ "|" +board[3]+ "|" );
		System.out.println("-------");
		System.out.println("|" +board[4] + "|" +board[5]+ "|" +board[6]+ "|" );
		System.out.println("-------");
		System.out.println("|" +board[7] + "|" +board[8]+ "|" +board[9]+ "|" );
		
	}
//UC2 Select Option X or O For User
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
			if (player == 'x') {
				return 'X';
			} else if (player == 'o') {
				return 'O';
			} else {
				System.out.println("Invalid choice");
				continue;
			}
		}
	}
//UC1 Create Empty Voard
	static void createBoard() {
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
	}
}
