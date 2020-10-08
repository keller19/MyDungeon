package dungeon;

public abstract class Weapons {
	
	String name;
	int degats;
	int crit;
	int perfo;
	// attributs

	public Weapons() {
		
	}
	
	protected Weapons(String name, int degats , int crit , int perfo) {
			this.name = name;
			this.degats = degats;
			this.crit = crit;
			this.perfo = perfo; 
			}
			
	protected Weapons(int degats, int crit, int perfo) {
		
		this.degats = degats;
		this.crit = crit;
		this.perfo = perfo;
			
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDegats() {
		return degats;
	}
	public void setDegats(int degats) {
		this.degats = degats;
	}
	public int getCrit() {
		return crit;
	}
	public void setCrit(int crit) {
		this.crit = crit;
	}
	public int getPerfo() {
		return perfo;
	}
	public void setPerfo(int perfo) {
		this.perfo = perfo;
	}


}
