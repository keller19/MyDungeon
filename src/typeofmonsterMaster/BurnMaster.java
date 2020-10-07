package typeOfMonsterMaster;

import typeOfMonster.Burn;

public class BurnMaster extends Burn {

	
	public BurnMaster() {
		super();
	}

	
	public BurnMaster(String name, int level) {
		super(name, level + 1);
		this.attaque = attaque + 10;
		this.def = 10;
	}

	
	public BurnMaster(String name) {
		super(name);

	}
	
	

	
	

}
