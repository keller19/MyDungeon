package typeOfMonsterBoss;

import typeOfMonster.Burn;

public class BurnBoss extends Burn {

	public BurnBoss(int attaque, int def, String name, int life, int level) {
		super(attaque, def, name, life, level);
		
	}

	public BurnBoss(String name, int level) {
		super(name, level);
		
	}

	public BurnBoss(String name) {
		super(name);
		
	}
	

}
