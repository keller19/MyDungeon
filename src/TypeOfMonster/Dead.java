package typeOfMonster;
import dungeon.Monster;


public class Dead extends Monster {

	public Dead(int attaque, int def, String name, int life, int level) {
		super(attaque, def, name, life, level);
	}

	public Dead(String name) {
		super(5,10, name,30, 1);
		
	}
	
	public Dead(String name,int level) {
		super(10, 15, name,35,level);
		
	}
	
}