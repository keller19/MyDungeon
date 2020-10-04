package typeofmonster;

import dungeon.Monster;

public class Ice extends Monster {

	String name;
	int life;
	String level;
	
	public Ice(){
		
	}
	
	
  public Ice(int atk, int def){
		
		this.attaque =  atk;
		this.def =  def;
	}
  
  public void IceCritical( int atk) {
		
		System.out.println("CRITICAL !");
		this.attaque = atk * 2;	
		System.out.println("La veangence est un plat qui se mange froid !");
	}
  
  
  Ice SantaClaus = new Ice();
  Ice SnowAngel = new Ice();
  Ice colossal = new Ice();
  Ice Wyvern = new Ice();

}
