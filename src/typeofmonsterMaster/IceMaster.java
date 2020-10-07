package typeOfMonsterMaster;

import typeOfMonster.Ice;

public class IceMaster extends Ice {
	
			
	public IceMaster() {
		super();
		
	}

	public IceMaster(String name, int level) {
		super(name, level);
		this.attaque = attaque + 10;
		this.life = life + 60;
		this.def = def + 10;
	}

	public IceMaster(String name) {
		super(name);
		this.level = level + 2;
		this.life =  life + 60;
		this.attaque = attaque + 5;
		this.def = def + 5;
	}

	

}
