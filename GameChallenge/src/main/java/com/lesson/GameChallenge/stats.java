package com.lesson.GameChallenge;

import java.util.HashMap;

public class stats {

	
	private static  HashMap<String,int[]> characters = new HashMap<String,int[]>();

	public static int grid_size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void setcharactersinGame(String name, int[] location){
		characters.put(name, location);
	}
	
	public HashMap<String,int[]> getcharactersinGame(){
		return characters;
	}

}
