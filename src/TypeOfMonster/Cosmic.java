package typeOfMonster;

import dungeon.Monster;

public class Cosmic extends Monster {
	String name;
	int life = 500;
	int level;
	
	public Cosmic(){
		
	}
	
	
	public Cosmic(int atk, int def, int level, int life){
		
		this.attaque =  atk;
		this.def =  def;
		this.level = level;
		this.life = life;
		}
	

}

