package dungeon;

public class Personnage {
	
	private static String name;
	private static	int level = 0;
	private static int  lifepoint = 50;
	private static int  exp = 0;
	private static int force = 0;
	private static int def = 15;
	private static Weapons weap;
	private static Armor armor;
	private static String graduation = "Student";
	
	//methods
	public Personnage(){}
	
	
	public Personnage(String name) {
		this.name = name;
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
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public static int getLifepoint() {
		return lifepoint;
	}


	public void setLifepoint(int lifepoint) {
		this.lifepoint = lifepoint;
	}


	public static int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public static int getForce() {
		return force;
	}


	public void setForce(int force) {
		this.force = force;
	}
	
	public static int getDef() {
		return def;
	}
	
	public void setDef(int def) {
		this.def = def;
	}


	public static Weapons getWeap() {
		return weap;
	}


	public void setWeap(Weapons weap) {
		this.weap = weap;
	}


	public  static String getGraduation() {
		return graduation;
	}


	public  void setGraduation(String graduation) {
		this.graduation = graduation;
	}


		public void levelUp() {
			
			if (Personnage.getExp() == 100 ) {
				System.out.println("Felicitations vous avez atteint le niveau 1 ");
				setLevel(1);
				setGraduation("Ecuyer");
				setForce(15);
				setDef(20);
				setLifepoint(100);
			}
			
			if (Personnage.getExp() == 200) {
				System.out.println("Felicitations vous avez atteint le niveau 2 ");
				setLevel(2);
				setGraduation("Sergent");
				setForce(20);
				setDef(25);
				setLifepoint(150);
			}
			
			if (Personnage.getExp() == 300 ) {
				System.out.println("Felicitations vous avez atteint le niveau 3");
				setLevel(3);
				setGraduation("capitaine");
				setForce(25);
				setDef(30);
				setLifepoint(200);
			}
			
			if (Personnage.getExp() == 400 ) {
				System.out.println("Felicitations vous avez atteint le niveau 4 ");
				setLevel(4);
				setGraduation("Chevalier");
				setForce(30);
				setDef(35);
				setLifepoint(250);
			}
			if (Personnage.getExp() == 500 ) {
				System.out.println("Felicitations vous avez atteint le niveau 5 ");
				setLevel(5);
				setGraduation("Commandant");
				setForce(35);
				setDef(40);
				setLifepoint(300);
			}
			if (Personnage.getExp() == 600 ) {
				System.out.println("Felicitations vous avez atteint le niveau 6  ");
				setLevel(6);
				setGraduation("Terreur draconique");
				setForce(40);
				setDef(45);
				setLifepoint(350);
			}
			if (Personnage.getExp() == 700 ) {
				System.out.println("Felicitations vous avez atteint le niveau 7 ");
				setLevel(7);
				setGraduation("Grand duc de l'ordre cosmique");
				setForce(55);
				setDef(50); 
				setLifepoint(400);
			}
			
		}
		



}

	

