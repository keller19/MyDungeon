package dungeon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		/* Scanner in = new Scanner(System.in);		
		String joueur = in.nextLine();
		Personnage le_gamer = new Personnage(joueur); 
		*/		
		System.out.println(Dungeon.tableau5[3].getName());
		System.out.println(Dungeon.tableau5[3].getLevel());
		System.out.println(Dungeon.tableau5[3].getAttaque());
		System.out.println(Dungeon.tableau5[3].getLife());
		
	}

}
