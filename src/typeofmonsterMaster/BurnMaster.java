package typeOfMonsterMaster;

import dungeon.Monster;
import typeOfMonster.Burn;

public class BurnMaster extends Burn {

	/*
	String name;
	int level;
	*/
	public BurnMaster() {
		super();
	}

	
	public BurnMaster(String name, int level) {
		super(name, level + 1);
		Monster.attaque =  attaque + 30;
		Monster.def = def + 10;
	}

	
	public BurnMaster(String name) {
		super(name);

	}
	/*
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}

	*/
	

}
