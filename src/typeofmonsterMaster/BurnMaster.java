package typeOfMonsterMaster;

import typeOfMonster.Burn;

public class BurnMaster extends Burn {
	
	public BurnMaster() {
		super();
	}

	
	public BurnMaster(String name, int level) {
		super(name, level);
		this.attaque = attaque + 15;
		this.life = life + 15;
		this.def = def + 10;
	}

	
	public BurnMaster(String name) {
		super(name);
		this.level = level + 2;
		this.attaque = attaque + 10;
		this.life =  life + 10;
		this.def = def + 5;
	}
	
	

	
	

}
