package typeOfMonsterMaster;

import typeOfMonster.Cosmic;
public class CosmicMaster extends Cosmic{
	
	public CosmicMaster() {
		super();
		
	}

	
	public CosmicMaster(String name, int level) {
		super(name, level);
		this.attaque = attaque + 10;
		this.life = life + 40;
		this.def = def + 10;
		
	}

	
	public CosmicMaster(String name) {
		super(name);
		this.level = level + 2;
		this.life =  life + 30;
		this.attaque = attaque + 5;
		this.def = def + 5;
	}



}
