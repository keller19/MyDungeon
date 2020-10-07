package typeOfMonsterBoss;

import typeOfMonsterMaster.StormMaster;

public class StormBoss extends StormMaster {

	public StormBoss() {
		super();
		
	}

	public StormBoss(String name, int level) {
		super(name, level);
		this.attaque = attaque + 25;
		this.life = life + 100;
		this.def = def + 20;
		
	}

	public StormBoss(String name) {
		super(name);
		this.level = level + 3;
		this.attaque = attaque + 25;
		this.life = life + 90;
		this.def = def + 20;
	}

}
