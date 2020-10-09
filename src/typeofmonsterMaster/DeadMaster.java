package typeOfMonsterMaster;

import typeOfMonster.Dead;

public class DeadMaster extends Dead{

	public DeadMaster(int attaque, int def, String name, int life, int level) {
		super(attaque, def, name, life, level);
	
	}

	public DeadMaster(String name, int level) {
		super(15, 20, name,40,level);
	}

	public DeadMaster(String name) {
		super(10,15, name,35, 2);
	}
	

}
