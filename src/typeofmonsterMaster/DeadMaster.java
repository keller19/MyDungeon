package typeOfMonsterMaster;

import typeOfMonster.Dead;

public class DeadMaster extends Dead{
	
	int critical = 10;
	
	public DeadMaster() {
		super();
		
	}

	public DeadMaster(String name, int level) {
		super(name, level);
		
	}

	public DeadMaster(String name) {
		super(name);
		
	}



}
