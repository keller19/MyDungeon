package typeOfMonsterBoss;

import typeOfMonsterMaster.IceMaster;

public class IceBoss extends IceMaster {

	public IceBoss() {
		super();
		
	}

	public IceBoss(String name, int level) {
		super(name, level);
		this.attaque = attaque + 20;
		this.life = life + 90;
		this.def = def + 20;
		
	}

	public IceBoss(String name) {
		super(name);
		this.level = level + 3;
		this.attaque = attaque + 10;
		this.life = life + 60;
		this.def = def + 10;
		
	}

}
