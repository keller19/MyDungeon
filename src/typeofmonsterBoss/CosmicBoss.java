package typeOfMonsterBoss;

import typeOfMonsterMaster.CosmicMaster;

public class CosmicBoss  extends CosmicMaster{

	public CosmicBoss() {
		super();
		
	}

	public CosmicBoss(String name, int level) {
		super(name, level);
		this.attaque = attaque + 20;
		this.life = life + 90;
		this.def = def + 20;
		
	}

	public CosmicBoss(String name) {
		super(name);
		this.level = level + 3;
		this.attaque = attaque + 10;
		this.life = life + 60;
		this.def = def + 10;
	}

}
