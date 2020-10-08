package dungeon;

public class Race extends Personnage{

	public Race() {
		super();
		
	}

	Race(String name, int level, int lifepoint, int exp, int force, int def, Weapons weap, String graduation) {
		super(name, level, lifepoint, exp, force, def, weap, graduation);
		
	}

	public Race(String name, int force, int def , int lifepoint) {
		Personnage.force = force;
		Personnage.def =  def;
		Personnage.lifepoint = lifepoint;
		
		
	}
	
	
}
