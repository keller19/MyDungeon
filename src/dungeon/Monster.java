package dungeon;

import battle.*;

public class Monster implements FightsActions<Personnage>{

	protected  int attaque = 10;
	protected   int def = 5;
	protected   String name;
	protected  int life;
	protected  int level = 0 ;

	protected Monster(String name) {
		
	}	
	
	protected Monster(int attaque, int def, String name, int life, int level) {
		this.attaque += attaque;
		this.def += def;
		this.name += name;
		this.life += life;
		this.level += level;
	}

	public int getAttaque() {
		return attaque;
	}


	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	@Override
	public void attack(Personnage p) {
	}

	@Override
	public void defense(Personnage p) {
		
		
	}

	

	
	
}
