package typeOfMonsterMaster;

import typeOfMonster.Storm;

public class StormMaster extends Storm {
	int critical = 10;
	
	public StormMaster() {
		super();
		
	}

	public StormMaster(String name, int level) {
		super(name, level);
		this.attaque = attaque + 10;
		this.def = 10;
		
	}

	public StormMaster(String name) {
		super(name);
		
	}

	
	
	
	
}
