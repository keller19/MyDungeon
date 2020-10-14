package dungeon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Bienvenue à toi dans le monde fou de KellerWorld \n");
		System.out.println("Comment vous appellez vous ?  ");
		String joueur = in.nextLine();
		Personnage le_gamer = new Personnage(joueur); 
		TheGameEngine.Game(le_gamer);
				
  }
	
}
