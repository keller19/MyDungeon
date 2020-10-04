package typeofmonster;

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

}
