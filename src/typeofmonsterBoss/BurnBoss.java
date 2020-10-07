package typeOfMonsterBoss;

import typeOfMonsterMaster.BurnMaster;
public class BurnBoss  extends BurnMaster {

	public BurnBoss() {
		super();
		
	}

	public BurnBoss(String name, int level) {
		super(name, level);
		this.attaque = attaque + 20;
		this.life = life + 90;
		this.def = def + 20;
	}

	public BurnBoss(String name) {
		super(name);
		this.level = level + 3;
		this.attaque = attaque + 10;
		this.life = life + 60;
		this.def = def + 10;
	}

}
