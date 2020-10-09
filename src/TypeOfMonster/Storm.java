package typeOfMonster;

import dungeon.Monster;


public class Storm extends Monster {

	public Storm(int attaque, int def, String name, int life, int level) {
		super(attaque, def, name, life, level);
		// TODO Auto-generated constructor stub
	}

	public Storm(String name) {
		super(20, 0, name,10 , 1);
		// TODO Auto-generated constructor stub
	}
	
	public Storm(String name,int level) {
		super(25, 5, name,15,level);
		
	}


	
}
