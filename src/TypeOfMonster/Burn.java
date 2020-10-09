package typeOfMonster;
import dungeon.*;

public class Burn extends Monster {

	
	public Burn(int attaque, int def, String name, int life, int level) {
		super(attaque, def, name, life, level);
	}

	public Burn(String name) {
		super(10 , 5,name, 20,1);
	}
	
	public Burn(String name,int level) {
		super(15, 20, name, 25, level);
	}
	
}
