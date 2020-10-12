package dungeon;
import java.util.Scanner;
import java.util.Random;

public class TheGameEngine {
	
	 static Scanner in = new Scanner(System.in);
	 static char choix;
	 static int choisir;
	
	 public static void Game(Personnage name){
			
		System.out.println("Bienvenue " + name.getName());
		System.out.println("Les combats vont être rude choisissez une arme \n"
				+ "1. Lame du prince gobelins\n"
				+ "2. Lance flamme");
		do {
			
		System.out.println("1 ou 2");
		
		if (choisir == 1) {
	    name.setWeap(CreateObjet.acier[1]);
	    
		} else if (choisir == 2){
		name.setWeap(CreateObjet.acier[2]);
		} else if(choisir != 1 && choisir != 2) {
			break;
		}
	
		} while(choisir != 1 && choisir != 2);
		TheGameEngine.QuestionsGame(name);
		
		System.out.println("La bataille va donc commencer ! ");
		
		do {
			
		// Je prevois de continuer ici le combat
			
		} while(true);
	
	}

	public void Loose(Personnage name){
		
		if(name.getLifepoint() == 0) {			
			System.out.println();
			
		}			
	}
		
	public static void QuestionsGame(Personnage name) {
		
		 	 
  do {
			System.out.println("Voulez vous voir vos stats ? (o/n)");
			 choix = in.next().charAt(0);
		if (choix == 'o') {
			System.out.println("Voici vos stats " + name.getName());
			name.showStats(name);			
		} else if(choix == 'n' ) { 
			
		}else if(choix != 'o' && choix != 'n') {
			System.out.println("Uniquement le caractére o & n !!!!!");
		}
		
		}while(choix != 'o' && choix != 'n');	
			
	}
	
	public static void QuestionForActions(Personnage name) {
		

		do{
			int salle = 1;
		System.out.println("Que souhaitez vous accomplir \n"
				+ "1.Allez au combat !\n"
				+ "2. Voir mon armes \n"
				+ "3. Voir mes stats");
		choisir = in.nextInt();		
		if(choisir == 1) {
			
			do {
			System.out.println("Bienvenue dans la salle numero " + salle);
			if(name.getGraduation() == "Etudiant" && name.getGraduation() == "Ecuyer") {
				
				MonsterInvocation();
				
				
			}
			}while(true);
			
		}else if(choisir == 2){
			
		}else if(choisir == 3){
			
		}else { 
			
			System.out.println("cela ne fait pas parti des propositions, Veuillez recommencer ");

		}
		
		}while(choisir != 1 && choisir !=2 && choisir != 3);
		
	}
	
	
	public static Monster MonsterInvocation() {
		 Random rand = new Random();
		int monsterLvl1;
		int choixType = rand.nextInt(5);
		int levelMonster = rand.nextInt(21);
		
		if(choixType >= 0 && choixType<= 3) {
			
			return CreateObjet.tableau[choixType];
			
		}else if(choixType >= 4 && choixType <=7) {
			
			return CreateObjet.tableau1[choixType];
			
		}else if(choixType >= 8 && choixType <=12) {
			
			return CreateObjet.tableau2[choixType];
			
		}else if(choixType >= 13 && choixType <=15) {
			
			return CreateObjet.tableau3[choixType];
			
		}else if(choixType >= 16 && choixType <= 20) {
			
			return CreateObjet.tableau4[choixType];
			
		}
		
		return null;
				
	}
	
	public static Monster MonsterMasterInvocation() {
		 Random rand = new Random();
		int monsterLvl1;
		int choixType = rand.nextInt(5);
		int levelMonster = rand.nextInt(21);
		
        if(choixType >= 0 && choixType<= 3) {
			
			return CreateObjet.tableau5[choixType];
			
		}else if(choixType >= 4 && choixType <=7) {
			
			return CreateObjet.tableau6[choixType];
			
		}else if(choixType >= 8 && choixType <=12) {
			
			return CreateObjet.tableau7[choixType];
			
		}else if(choixType >= 13 && choixType <=15) {
			
			return CreateObjet.tableau8[choixType];
			
		}else if(choixType >= 16 && choixType <= 20) {
			
			return CreateObjet.tableau9[choixType];
			
		}
		
		return null;
	}
	
	public static Monster MonsterBossInvocation() {
		 Random rand = new Random();
		int monsterLvl1;
		int choixType = rand.nextInt(5);
		int levelMonster = rand.nextInt(21);
		
        if(choixType >= 0 && choixType<= 3) {
			
			return CreateObjet.tableau10[choixType];
			
		}else if(choixType >= 4 && choixType <=7) {
			
			return CreateObjet.tableau11[choixType];
			
		}else if(choixType >= 8 && choixType <=12) {
			
			return CreateObjet.tableau12[choixType];
			
		}else if(choixType >= 13 && choixType <=15) {
			
			return CreateObjet.tableau13[choixType];
			
		}else if(choixType >= 16 && choixType <= 20) {
			
			return CreateObjet.tableau14[choixType];
			
		}
		
		return null;
	}

}