package typeOfMonster;

import dungeon.Monster;

public class Dead extends Monster {
	String name;
	int life = 60;
	int level = 1 ;
	
	public Dead(){
		
	}
	public Dead(String name){
		this.name = name;
		
	}
	
	public Dead(String name, int level){
			this.name =  name;
			this.life = life + 30;
			this.level = level;
			Monster.attaque =  attaque + 10;
			Monster.def = def + 10;
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

	
