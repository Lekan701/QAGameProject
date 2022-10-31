package com.lesson.GameChallenge;

public class Board {

	public int[][] board = null;
	public int x = 5;
	public int y = 5;

	public Board() {
		// TODO Auto-generated constructor stub

		setBoard();
		generateBoard(player.player_position, treasure.treasure_position, Monster_1.monster_position);

	}

	public void generateBoard(int[] getposition, int[] treasurePosition, int[] monsterPosition) {
		int board[][] = setBoard();
		int[] test1 = getposition;
		int[] test2 = treasurePosition;
		int[] test3 = monsterPosition;
		board[test1[0]][test1[1]] = 1;
		board[test2[0]][test2[1]] = 2;
		board[test3[0]][test3[1]] = 3;

		for (int i = 0; i < board.length; i++) {
			for (int k = 0; k < board[i].length; k++) {
				System.out.printf("%3d", board[i][k]);
			}
			System.out.println();
		}
	}

	public void updateBoard(int[] getposition, int[] treasurePosition, int[] monsterPosition) {
		int board[][] = setBoard();
		int[] test1 = getposition;
		int[] test2 = treasurePosition;
		int[] test3 = monsterPosition;
		board[test1[0]][test1[1]] = 1;
		board[test2[0]][test2[1]] = 2;
		board[test3[0]][test3[1]] = 3;

		for (int i = 0; i < board.length; i++) {
			for (int k = 0; k < board[i].length; k++) {
				System.out.printf("%3d", board[i][k]);
			}
			System.out.println();
		}
	}

	public int[][] setBoard() {
		this.board = new int[x][y];
		return board;
	}

}