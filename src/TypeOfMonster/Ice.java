package typeOfMonster;

import dungeon.Monster;

public class Ice extends Monster {
	String name;
	int life = 60 ;
	int level = 1 ;
	
	public Ice(){
		
	}
	
	public Ice(String name){
		this.name = name;
		
	}
	
	public Ice(String name, int level){
			this.name =  name;
			this.life = life + 30;
			this.level = level;
			Monster.attaque =  attaque + 10;
			Monster.def = def + 10;
	}


}
