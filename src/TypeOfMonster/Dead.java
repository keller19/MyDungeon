package typeOfMonster;

import dungeon.Monster;

public class Dead extends Monster {
	String name;
	int life;
	String level;
	
	public Dead(){}
	
	public Dead(int atk, int def){
		this.attaque =  atk;
		this.def =  def;
		}
	
	public void StormCritical( int atk) {
		
		System.out.println("CRITICAL !");
		this.attaque = atk * 2;	
		System.out.println("La mort te va si bien...");
	}
	

}

	
