package typeOfMonsterBoss;

import typeOfMonsterMaster.DeadMaster;

public class DeadBoss extends DeadMaster {

	public DeadBoss() {
		super();

	}

	public DeadBoss(String name, int level) {
		super(name, level);
		this.attaque = attaque + 20;
		this.life = life + 90;
		this.def = def + 20;
	}

	public DeadBoss(String name) {
		super(name);
		this.level = level + 3;
		this.attaque = attaque + 10;
		this.life = life + 60;
		this.def = def + 10;
	}

}
