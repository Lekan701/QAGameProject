package com.lesson.GameChallenge;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Enter Your player name to continue - ");
		Scanner name = new Scanner(System.in); // Create a Scanner object
		String player_name = name.nextLine();
		System.out.println("Welcome to the Game " + player_name + "!");

		player p1 = new player("player_name");
		

		int[] test = p1.getposition();
		// System.out.println( "Grr x position " + test[0] + " Grr y position " +
		// test[1] );
		// System.out.println( test[0] );
		// getposition
		// game start_game = new game("game");

		treasure tres = new treasure();
		// int[] test2 = tres.getTreasurePosition();
		// System.out.println( "Treasure x position " + test2[0] + " Treasure y position
		// " + test2[1] );

		Monster_1 Grinch = new Monster_1("Grinch",
				"You're gonna die! I'm going to throw up, and then You're gonna die!");
		// int[] test3 = Grinch.getMonsterPosition();
		// System.out.println( "Monster x position " + test3[0] + " Monster y position "
		// + test3[1] );

		Board b1 = new Board();
		// Board.updateBoard(test,test2,test3);
		
		//treasure.setTreasurePos();

		while (player.game_win() != true && player.game_lose() != true) {

			System.out.println("in while");

			p1.updatePlayerPosition(5);
			b1.updateBoard(player.getposition(),treasure.getTreasurePosition(),Monster_1.getMonsterPosition());
			treasure.player_distance();
//        	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//            System.out.println("Enter 1 to move up, 2 to move down, 3 to move left, 4 to move right");
//            String userMove = myObj.nextLine();
//            if(userMove == "1") {
//            	start_game.characterMoveUp();
//            } else if(userMove == "2") {
//            	start_game.characterMoveDown();
//            } else if(userMove == "3") {
//            	start_game.characterMoveLeft();
//            } else if(userMove == "4") {
//            	start_game.characterMoveRight();
//            } else {
//            	System.out.println("Invalid Move");
//            }
		}

	}
}
