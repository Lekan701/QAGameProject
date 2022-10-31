package com.lesson.GameChallenge;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class treasure {

	public static int[] treasure_position = new int[2];

	public treasure() {
		// int[] treasure_position = new int[2];
		treasure_position = initialize_treasure();
		stats.setcharactersinGame("Treasure", treasure_position);
	}

	private int[] initialize_treasure() {
		int[] player_position = player.getposition();
		int grid_size = 5;// stats.grid_size();

		// this.setTreasurePosition();
		treasure_position[0] = ThreadLocalRandom.current().nextInt(0, grid_size);
		treasure_position[1] = ThreadLocalRandom.current().nextInt(0, grid_size);

		while (treasure_position[0] == player_position[0] || treasure_position[1] == player_position[1]) {
			treasure_position[0] = ThreadLocalRandom.current().nextInt(0, grid_size);
			treasure_position[1] = ThreadLocalRandom.current().nextInt(0, grid_size);
		}
		return treasure_position;
	}

	public static int[] getTreasurePosition() {
		return treasure_position;
	}

	public static void player_distance() {
		int[] player_local = new int[2];
		player_local = player.getposition();
		double distance;
		double distance_x = treasure_position[0] - player_local[0];
		double distance_y = treasure_position[1] - player_local[1];
		distance = Math.sqrt(Math.pow(distance_y, 2) + Math.pow(distance_x, 2));
		System.out.println("Distance from Treasure: " + distance);
	}
	
	public static void setTreasurePos() {
		System.out.println("Enter custom treasure position x: ");
		Scanner newCoor = new Scanner(System.in); // Create a Scanner object
		int custom_x = newCoor.nextInt();
		
		System.out.println("Enter custom treasure position x: ");
		Scanner newerCoor = new Scanner(System.in); // Create a Scanner object
		int custom_y = newerCoor.nextInt();
		
		if(custom_x <= 5 && custom_y <= 5)
		{
			treasure_position[0] = custom_x;
			treasure_position[1] = custom_y;
		}		
	}
}
