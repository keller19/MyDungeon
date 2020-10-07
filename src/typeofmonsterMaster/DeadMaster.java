package typeOfMonsterMaster;

import typeOfMonster.Dead;

public class DeadMaster extends Dead{
	
	public DeadMaster() {
		super();
		
	}

	public DeadMaster(String name, int level) {
		super(name, level);
		this.attaque = attaque + 10;
		this.life = life + 60;
		this.def = def + 10;
		
	}

	public DeadMaster(String name) {
		super(name);
		this.level = level + 2;
		this.life =  life + 60;
		this.attaque = attaque + 5;
		this.def = def + 5;
	}



}
