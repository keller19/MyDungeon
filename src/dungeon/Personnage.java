package dungeon;

import battle.*;

public class Personnage implements FightsActions<Monster>{
	
	private  String name;
	protected  int level = 0;
	protected  int  lifepoint = 50;
	protected  int  exp = 0;
	protected  int force = 10;
	protected  int def = 15;
	protected  Weapons weap;
	protected  String graduation = "Etudiant";
	
	
	public Personnage(){}
	
	
	public Personnage(String name) {
		this.name = name;
	}
	
	public Personnage(Weapons weap) {
		
		this.weap = weap;
		
	}
	
	
	public Personnage(String name, int level, int lifepoint, int exp, int force,int def, Weapons weap, String graduation){
		
		this.name = name;
		 this.level = level;
		 this.lifepoint = lifepoint;
		 this.exp = exp;
		 this.force = force;
		 this.def =  def;
		 this.weap = weap;
		 this.graduation = graduation;

	}
	
	
	public  String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public  int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getLifepoint() {
		return lifepoint;
	}


	public void setLifepoint(int lifepoint) {
		this.lifepoint = lifepoint;
	}


	public  int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public  int getForce() {
		return force;
	}


	public void setForce(int force) {
		this.force = force;
	}
	
	public int getDef() {
		return def;
	}
	
	public void setDef(int def) {
		this.def = def;
	}


	public Weapons getWeap() {
		return weap;
	}


	public void setWeap(Weapons weap) {
		this.weap = weap;
	}


	public String getGraduation() {
		return graduation;
	}


	public  void setGraduation(String graduation) {
		this.graduation = graduation;
	}


	
	
	
	
		public void levelUp(Personnage name) {
			
			if (name.getExp() == 100 ) {
				System.out.println("Felicitations vous avez atteint le niveau 1 ");
				setLevel(1);
				setGraduation("Ecuyer");
				setForce(15);
				setDef(20);
				setLifepoint(100);
			}else if (name.getExp() == 200) {
				System.out.println("Felicitations vous avez atteint le niveau 2 ");
				setLevel(2);
				setGraduation("Sergent");
				setForce(20);
				setDef(25);
				setLifepoint(150);
			}else if (name.getExp() == 300 ) {
				System.out.println("Felicitations vous avez atteint le niveau 3");
				setLevel(3);
				setGraduation("capitaine");
				setForce(25);
				setDef(30);
				setLifepoint(200);
			} else if (name.getExp() == 400 ) {
				System.out.println("Felicitations vous avez atteint le niveau 4 ");
				setLevel(4);
				setGraduation("Chevalier");
				setForce(30);
				setDef(35);
				setLifepoint(250);
			}else if (name.getExp() == 500 ) {
				System.out.println("Felicitations vous avez atteint le niveau 5 ");
				setLevel(5);
				setGraduation("Commandant");
				setForce(35);
				setDef(40);
				setLifepoint(300);
			} else if (name.getExp() == 600 ) {
				System.out.println("Felicitations vous avez atteint le niveau 6  ");
				setLevel(6);
				setGraduation("Terreur draconique");
				setForce(40);
				setDef(45);
				setLifepoint(350);
			}else if (name.getExp() == 700 ) {
				System.out.println("Felicitations vous avez atteint le niveau 7 ");
				setLevel(7);
				setGraduation("Grand duc de l'ordre cosmique");
				setForce(55);
				setDef(50); 
				setLifepoint(400);
			}
			
		}
		
		public void showStats(Personnage name) {
			
			System.out.println("Nom du joueur " +name.getName());
			System.out.println("Niveau " + name.getLevel());
			System.out.println("Force " + name.getForce());
			System.out.println("Defense " +name.getDef());
			System.out.println("Experience " +name.getExp());
			System.out.println("Grade " + name.getGraduation());
			System.out.println("Armes " + weap.giveName());
			
		}
		
		@Override
		 public void attack(Monster p) {
			
		 p.setLife((this.getForce() + this.weap.getDegats())- p.getLife());
			
		}
 	

		@Override
		public void defense(Monster p) {
			
			p.setLife(this.getForce() / 2);
			
		}
		
}