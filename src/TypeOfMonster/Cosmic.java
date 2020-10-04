package typeofmonster;

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
	
	public void StormCritical( int atk) {
		System.out.println("CRITICAL !");
		this.attaque = atk * 2;	
		System.out.println("Par la puissance du big bang ! ");
		
	}
	
	Cosmic titan = new Cosmic();
	Cosmic Jupiter = new Cosmic();
	Cosmic Uranus = new Cosmic();
	Cosmic Univers_X = new Cosmic();
	

}

