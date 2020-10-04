
public class Personnage {

	//attributs
	private int exp;
	private int lifepoint;
	private int def;
	private int agil;
	private int strong;
	private String name;
	public Weapons weapon;
	
	
	
	//methods
	public void Personnage(int exp, int lifepoint, int def, int agil, int strong, String name, Weapons weapon) {
		
		this.exp = exp;
		this.lifepoint =  lifepoint;
		this.def = def;
		this.agil = agil;
		this.strong = strong;
		this.name = name;
		this.weapon =  weapon;
		
	}
	
	
	
	
	
}
