package dungeon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String joueur = "Gabriel";
		Personnage le_gamer = new Personnage(joueur); 
				
		System.out.println(le_gamer.getLifepoint());
		
	}

}
