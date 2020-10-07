package typeOfMonsterMaster;

import typeOfMonster.Storm;

public class StormMaster extends Storm {

	
	public StormMaster() {
		super();
		
	}

	public StormMaster(String name, int level) {
		super(name, level);
		this.attaque = attaque + 10;
		this.life = life + 60;
		this.def = def + 10;
		
	}

	public StormMaster(String name) {
		super(name);
		this.level = level + 2;
		this.life =  life + 60;
		this.def = def + 5;
		this.attaque = attaque + 5;
	}

	
	
	
	
}
