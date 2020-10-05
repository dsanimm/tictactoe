package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {

	private static char[] createBoard() {
		char board[] = new char[11];
		for (int i = 1; i < 11; i++)
			board[i] = ' ';
		return board;
	}

	private static char[] choiceBoard(char[] board, char choice, int pos) {
		board[pos] = choice;
		int posComputer = (int) (10 * (Math.random())) + 1;
		char compLetter = (choice == 'O') ? 'X' : 'O';
		if (board[posComputer] == ' ') {
			board[posComputer] = compLetter;
		}
		return board;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TicTacToe obj = new TicTacToe();
		char[] board = obj.createBoard();
		System.out.println("Choose X or O");
		char choice = sc.next().charAt(0);
		System.out.println("Choose position for X or O");
		int pos = sc.nextInt();
		board = obj.choiceBoard(board, choice, pos);

	}

}
