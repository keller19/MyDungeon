package typeOfMonster;

import dungeon.Monster;

public class Ice extends Monster {
	protected  int attaque = 0;
	protected  int def = 20;
	protected String name;
	protected int life = 90 ;
	protected int level = 1 ;
	
	public Ice(){
		
	}
	
	public Ice(String name){
		this.name = name;
		
	}
	
	public Ice(String name, int level){
			this.name =  name;
			this.life = life + 30;
			this.level = level;
			this.attaque =  attaque + 5;
			this.def = def + 5;
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
