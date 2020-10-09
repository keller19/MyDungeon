package typeOfMonster;

import dungeon.Monster;


public class Ice extends Monster {

	public Ice(int attaque, int def, String name, int life, int level) {
		super(attaque, def, name, life, level);
		// TODO Auto-generated constructor stub
	}

	public Ice(String name) {
		super(0, 15,name, 35,0);
		// TODO Auto-generated constructor stub
	}

	public Ice(String name,int level) {
		super(5, 20, name,40,level);
		
	}


}
