package dungeon;

import typeOfMonster.*; import typeOfMonsterBoss.*; import typeOfMonsterMaster.*;

public class Dungeon {
		
	// Creation des monstres niveau 1-2

  public static Burn[] tableau = new Burn[]{ new Burn("piflamme"),new Burn("Cochongrier"), new Burn("Flammeche", 2),new Burn("Salamandre", 2) };	
   public static  Cosmic[] tableau1 = new Cosmic[] {new Cosmic("Ovni"), new Cosmic("Marsien"), new Cosmic("Asteroïdozor", 2), new Cosmic("rongeur galactique", 2)};
   public static Dead[] tableau2 = new Dead[] {new Dead("fantome"),new Dead("necrolarme"),new Dead("Revenant comique", 2),new Dead("Casper", 2)};
    public static Ice[] tableau3 = new Ice[] { new Ice("Scarabée du froid"), new Ice("MisterFreeza"), new Ice("Malhommes des neiges", 2),new Ice("IcyCold", 2)};
    public static Storm[] tableau4 =  new Storm [] {new Storm("pingeon electrique"),new Storm("roucoule"),new Storm("Nuage Triste", 2),new Storm("Tornade passion", 2)};
	
	
	//Creation des monstres niveau 2-3;
    public static BurnMaster[] tableau5 =  new BurnMaster[]{ new BurnMaster("piflamme"),new BurnMaster("Cochongrier"), new BurnMaster("Dracofeu", 2),new BurnMaster("Salamandre", 2) };	
    public static  CosmicMaster[] tableau6 = new CosmicMaster[] {new CosmicMaster("Ovni"), new CosmicMaster("Marsien"), new CosmicMaster("Asteroïdozor", 2), new CosmicMaster("rongeur galactique", 2)};
    public static DeadMaster[] tableau7 = new DeadMaster[] {new DeadMaster("fantome"),new DeadMaster("necrolarme"),new DeadMaster("Revenant comique", 2),new DeadMaster("Casper", 2)};
     public static IceMaster[] tableau8 = new IceMaster[] { new IceMaster("Scarabée du froid"), new IceMaster("MisterFreeza"), new IceMaster("Malhommes des neiges", 2),new IceMaster("IcyCold", 2)};
     public static StormMaster[] tableau9 =  new StormMaster[] {new StormMaster("pingeon electrique"),new StormMaster("roucoule"),new StormMaster("Nuage Triste", 2),new StormMaster("Tornade passion", 2)};
 	
    
	//Creation des monstres niveau 3-5;
	
	
}
