package typeOfMonster;

import dungeon.Monster;

public class Storm extends Monster {
	
	String name;
	int life;
	int  level;
	
	public Storm() {
		
	}
	
	public Storm(String name, int atk, int def, int level, int life ){
		this.attaque =  atk;
		this.def =  def;
		}
	
	public void StormCritical( ) {
		
		System.out.println("CRITICAL !");
		System.out.println("Craint la puissance des cieux");
	}
	

	
}
