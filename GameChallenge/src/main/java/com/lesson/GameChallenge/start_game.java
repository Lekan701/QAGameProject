package com.lesson.GameChallenge;

public class start_game {

//
//	 private int health = 100;
//	 private String name = "Gary";
//	 private boolean gameOver = false;

//	 public start_game(String name) {
//	  this.name = name;
//	  System.out.println("New character created with name..." + name);
//	  //int[][] playerPos = Calling the board class to find coordinates then random coordinates within that 2-d array
//	 }

	 public int[][] characterMoveUp() {
	  int[][] up = new int[0][1];
	  return up;
	 }

	 public int[][] characterMoveDown() {
	  int[][] down = new int[0][-1];
	  return down;
	 }

	 public int[][] characterMoveLeft() {
	  int[][] left = new int[-1][0];
	  return left;
	 }

	 public int[][] characterMoveRight() {
	  int[][] right = new int[1][0];
	  return right;
	 }

	 public int[][] getPlayerPosition() {
	  int[][] currentPosition = new int[0][0];
	  return currentPosition;
	 }

	 public boolean gameOverCheck(boolean gameOver) {
	  gameOver = true;
	  //End game here...
	  return gameOver;
	 }

	 public String winGame() {
	  return "Congratulations! You have won the game";
	 }

	
	
}



