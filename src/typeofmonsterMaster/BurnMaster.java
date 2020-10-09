package typeOfMonsterMaster;
import typeOfMonster.Burn;

public class BurnMaster extends Burn {

	public BurnMaster(int attaque, int def, String name, int life, int level) {
		super(attaque, def, name, life, level);
	}

	public BurnMaster(String name, int level) {
		super(20, 25, name, 30, level);
	}

	public BurnMaster(String name) {
		super(20, 15,name, 30,2);
		
	}	
}
