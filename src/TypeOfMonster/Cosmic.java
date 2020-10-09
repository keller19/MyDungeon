package typeOfMonster;

import dungeon.Monster;

public class Cosmic extends Monster {

	public Cosmic(int attaque, int def, String name, int life, int level) {
		super(attaque, def, name, life, level);
	}

	public Cosmic(String name) {
		super(15, 10, name, 25, 1);
	}
	
	public Cosmic(String name,int level) {
		super(20, 15, name,30,level);
		
	}



		
}

