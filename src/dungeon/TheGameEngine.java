package dungeon;

import java.util.Scanner;


public class TheGameEngine {
	
	static Scanner in = new Scanner(System.in);
	static char choix;
	static int choisir;
	
	
	public static void Game(Personnage name){
		
		System.out.println("Bienvenue " + name.getName());
		name.levelUp();
		TheGameEngine.QuestionsGame(name);
		name.levelUp();
		System.out.println("Les combats vont être rude choisissez une arme \n"
				+ "1. Lame du prince gobelins\n"
				+ "2. Lance flamme");
		do {
			
		System.out.println("1 ou 2");
		choisir = in.nextInt();		
		if (choisir == 1) {
	    name.setWeap(CreateObjet.acier[0]);
		} else if (choisir == 2) {
		name.setWeap(CreateObjet.acier[0]);
		} else if(choisir != 1 && choisir != 2) {
			break;
		}
	}while(choisir != 1 && choix !=  2);
		
		System.out.println("Allez l'aventure va commencer");
		
		do{
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}while(1 > 3);
	}
	
	
	
	
	
	public static void QuestionsGame(Personnage name) {
		 	 
  do {
			System.out.println("Voulez vous voir vos stats ? (o/n)");
			 choix = in.next().charAt(0);
		if (choix == 'o') {
			System.out.println("Voici vos stats " + name.getName());
			name.showStats();			
		} else if(choix == 'n' ) { 
			
		}else if(choix != 'o' && choix != 'n') {
			System.out.println("Uniquement le caractére o & n !!!!!");
		}
		
		}while(choix != 'o' && choix != 'n');	
		
		
	}

}
