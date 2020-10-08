package typeOfMonster;


import dungeon.Monster;


public class Dead extends Monster {
	protected  int attaque = 5;
	protected  int def = 15;
	protected String name;
	protected int life = 70;
	protected int level = 1 ;
	
	public Dead(){
		
	}
	public Dead(String name){
		this.name = name;
		
	}
	
	public Dead(String name, int level){
			this.name =  name;
			this.life = life + 10;
			this.level = level;
			this.attaque =  attaque + 5;
			this.def = def + 5;
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

	
