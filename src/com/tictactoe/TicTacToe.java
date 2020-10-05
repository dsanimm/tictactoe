package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	static Scanner sc = new Scanner(System.in);

	private static char[] userChoice(char[] board) {
		System.out.println("Choose X or O");
		char choice = sc.next().charAt(0);
		System.out.println("Choose position for X or O");
		int pos = sc.nextInt();
		if (board[pos] == ' ')
			board = TicTacToe.choiceBoard(board, choice, pos);
		else
			System.out.println("Wrong Choice");
		return board;
	}

	private static char[] createBoard() {
		char board[] = new char[11];
		for (int i = 1; i < 11; i++)
			board[i] = ' ';
		return board;
	}

	private static char[] choiceBoard(char[] board, char choice, int pos) {
		board[pos] = choice;
		int posComputer = (int) (10 * (Math.random())) + 1;
		while (posComputer != ' ') {
			posComputer = (int) (10 * (Math.random())) + 1;
		}
		char compLetter = (choice == 'O') ? 'X' : 'O';
		if (board[posComputer] == ' ') {
			board[posComputer] = compLetter;
		}
		return board;
	}

	private static void printBoard(char[] board) {
		for (int i = 1; i < 10; i++) {
			System.out.print("[" + board[i] + "]");
			if (i % 3 == 0) {
				System.out.println();
				System.out.println("---------");
			}
		}
	}

	public static void main(String[] args) {

		TicTacToe obj = new TicTacToe();
		TicTacToe.createBoard();
		char[] board = TicTacToe.createBoard();
		TicTacToe.printBoard(board);
		board = TicTacToe.userChoice(board);
		TicTacToe.printBoard(board);

	}

}
