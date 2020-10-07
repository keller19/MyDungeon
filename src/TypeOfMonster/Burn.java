package typeOfMonster;

import dungeon.Monster;

public class Burn extends Monster {
	
	protected  int attaque = 15;
	protected  int def = 5;
	protected String name;
	protected int life = 40 ;
	protected int level = 1 ;
	
	public Burn(){
			
	}
	
	public Burn(String name){
		this.name = name;
		
	}
	
	public Burn(String name, int level){
			this.name =  name;
			this.life = life + 15;
			this.level = level;
			this.attaque=  attaque + 10 ;
			this.def = def + 0 ;
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

	
	
	
	
	
}
