package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	private static final Scanner sc = new Scanner(System.in);

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
		char board[] = new char[10];
		for (int i = 1; i < board.length; i++)
			board[i] = ' ';
		return board;
	}

	private static char[] choiceBoard(char[] board, char choice, int pos) {
		board[pos] = choice;
		int posComputer = (int) (10 * (Math.random())) + 1;
		while (board[posComputer] != ' ') {
			posComputer = (int) (10 * (Math.random())) + 1;
		}
		char compLetter = (choice == 'O') ? 'X' : 'O';
		if (board[posComputer] == ' ') {
			board[posComputer] = compLetter;
		}
		return board;
	}

	private static void printBoard(char[] board) {
		for (int i = 1; i < board.length; i++) {
			System.out.print("[" + board[i] + "]");
			if (i % 3 == 0) {
				System.out.println();
				System.out.println("---------");
			}
		}
	}

	/*
	 * private static boolean checkDraw(char[] board) { boolean flag = false; for
	 * (int i = 1; i < board.length; i++) { if (board[i] == ' ') ; flag = true; }
	 * return flag; }
	 */

	/*
	 * private static boolean checkWin(char[] board) { for (int a = 0; a < 8; a++) {
	 * StringBuilder line = null; switch (a) { case 0: line = new
	 * StringBuilder().append(board[1]).append(board[2]).append(board[3]); break;
	 * case 1: line = new
	 * StringBuilder().append(board[4]).append(board[5]).append(board[6]); break;
	 * case 2: line = new
	 * StringBuilder().append(board[7]).append(board[8]).append(board[9]); break;
	 * case 3: line = new
	 * StringBuilder().append(board[1]).append(board[4]).append(board[7]); break;
	 * case 4: line = new
	 * StringBuilder().append(board[2]).append(board[5]).append(board[8]); break;
	 * case 5: line = new
	 * StringBuilder().append(board[3]).append(board[6]).append(board[9]); break;
	 * case 6: line = new
	 * StringBuilder().append(board[1]).append(board[5]).append(board[9]); break;
	 * case 7: line = new
	 * StringBuilder().append(board[3]).append(board[5]).append(board[7]); break; }
	 * if (line.equals("XXX") || line.equals("OOO")) { return true; } } return
	 * false; }
	 */

	public static void main(String[] args) {

		createBoard();
		char[] board = TicTacToe.createBoard();
		printBoard(board);
		//while (checkWin(board)||checkDraw(board)) {
			board = TicTacToe.userChoice(board);
			printBoard(board);
		}

	}

}
