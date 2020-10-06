package typeofmonster;

import dungeon.Monster;
import dungeon.Personnage;

public class Burn extends Monster {
	
	String name;
	int life;
	String level;
	
	public Burn(){
			
	}
	
	public Burn(int atk, int def){	
		this.attaque =  atk;
		this.def =  def;
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

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public static int getAttaque() {
		
		return attaque;
		
	}
	
	

}
