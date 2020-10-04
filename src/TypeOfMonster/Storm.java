package typeofmonster;

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
	
	public void StormCritical( int atk) {
		
		System.out.println("CRITICAL !");
		this.attaque = atk * 2;	
		System.out.println("Craint la puissance des cieux");
	}
	
	
	
	
	Storm stormLord = new Storm();
	Storm leviathan = new Storm();
	Storm stormOwls = new Storm();
	Storm kraken = new Storm();
	
	
}
