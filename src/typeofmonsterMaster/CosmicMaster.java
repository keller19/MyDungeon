package typeOfMonsterMaster;

import typeOfMonster.Cosmic;
public class CosmicMaster extends Cosmic{

	public CosmicMaster(int attaque, int def, String name, int life, int level) {
		super(attaque, def, name, life, level);
	}

	public CosmicMaster(String name, int level) {
		super(30, 25, name, 40, level);

	}

	public CosmicMaster(String name) {
		super(25, 20, name, 35, 2);
	}
	


}
