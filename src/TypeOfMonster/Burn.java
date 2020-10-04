package typeofmonster;

import dungeon.Monster;

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
	
   public void BurnCritical( int atk) {
		
		System.out.println("CRITICAL !");
		this.attaque = atk * 2;	
		System.out.println("Que le feu te consume haha ");
		
	 }
	
	Burn ifrit = new Burn();
	Burn phoenix = new Burn();
	Burn dragon = new Burn();
	Burn fire_Elephant = new Burn();
		

}
