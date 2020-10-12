package dungeon;

import typeOfMonster.*; import typeOfMonsterBoss.*; import typeOfMonsterMaster.*;

import weaponsBang.*;

public class CreateObjet {
		
      //creation des armes 
     public static Fusil[] metal = new Fusil[] {new Fusil("petite lance",0,0,0), new Fusil("Lance flamme", 15, 15, 5),new Fusil("Pompe chasseur de démon ", 20 , 50, 5),new Fusil("Fusil aspire âme", 30, 50 , 10),new Fusil("Fusil empoisonné  ", 35, 55, 15),new Fusil("AK47 du Rider", 75, 40, 15)};
     public static Sword[] acier = new Sword[] { new Sword("Lame du prince gobelins", 20, 50, 15), new Sword("Epée du chevalier errant", 30, 60, 15), new Sword("Escalibur", 50, 75, 30) ,  new Sword("Epée des lumiéres ", 65, 60, 45)} ;
    
  // Creation des monstres niveau 1-2
 	public static Burn[] tableau = new Burn[]{ new Burn("piflamme"),new Burn("Cochongrier"), new Burn("Flammeche", 2),new Burn("Salamandre", 2) };	
 	public static  Cosmic[] tableau1 = new Cosmic[] {new Cosmic("Ovni"), new Cosmic("Marsien"), new Cosmic("Asteroïdozor", 2), new Cosmic("rongeur galactique", 2)};
 	public static Dead[] tableau2 = new Dead[] {new Dead("fantome"),new Dead("necrolarme"),new Dead("Revenant comique", 2),new Dead("Casper", 2)};
     public static Ice[] tableau3 = new Ice[] { new Ice("Scarabée du froid"), new Ice("MisterFreeza"), new Ice("Malhommes des neiges", 2),new Ice("IcyCold", 2)};
     public static Storm[] tableau4 =  new Storm [] {new Storm("pingeon electrique"),new Storm("roucoule"),new Storm("Nuage Triste", 2),new Storm("Tornade passion", 2)};
 		
 	//Creation des monstres niveau 3-4;
     public static BurnMaster[] tableau5 =  new BurnMaster[]{ new BurnMaster("Souimanga"),new BurnMaster("Cochonfeu"), new BurnMaster("Dracofeu", 4),new BurnMaster("immolation", 4) };	
     public static  CosmicMaster[] tableau6 = new CosmicMaster[] {new CosmicMaster("asteroide grincheux"), new CosmicMaster("Venusien"), new CosmicMaster("Huissier de namek", 4), new CosmicMaster("Huissier de Kaïos", 4)};
     public static DeadMaster[] tableau7 = new DeadMaster[] {new DeadMaster("goule"),new DeadMaster("banshee"),new DeadMaster("Revenant malheureux", 4),new DeadMaster("Casper le genie", 4)};
     public static IceMaster[] tableau8 = new IceMaster[] { new IceMaster("oiseau glinçant"), new IceMaster("Banshee Hyvernal"), new IceMaster("Vouivre hyvernale", 4),new IceMaster("Dame blanche", 4)};
     public static StormMaster[] tableau9 =  new StormMaster[] {new StormMaster("electroGang"),new StormMaster("revenant HDMI"),new StormMaster("neutron paisible", 4),new StormMaster("eclair malhonnette", 4)};
     
 	//Creation des monstres niveau 5-6;
      public static BurnBoss[] tableau10 =  new BurnBoss[]{ new BurnBoss("Phoenix"),new BurnBoss("Dragon du feu"), new BurnBoss("Ifrit", 6),new BurnBoss("Arés", 6) };	
      public static  CosmicBoss[] tableau11 = new CosmicBoss[] {new CosmicBoss("Kameya"), new CosmicBoss("C-17"), new CosmicBoss("Beerus", 6), new CosmicBoss("Vision Celeste", 6)};
      public static DeadBoss[] tableau12 = new DeadBoss[] {new DeadBoss("Revenant de l'ordre"),new DeadBoss("Gadiateur aveugle"),new DeadBoss("Comte Dracula", 6),new DeadBoss("Hades", 6)};
      public static IceBoss[] tableau13 = new IceBoss[] { new IceBoss("Mamouth Laineux"), new IceBoss("Pingouin rechauffé"), new IceBoss("Colosse du froid", 6),new IceBoss("Geant Viking", 6)};
      public static StormBoss[] tableau14 =  new StormBoss[] {new StormBoss("Kraken"),new StormBoss("Triton"),new StormBoss("Leviathan", 6),new StormBoss("Zeus", 6)};
   	
     
}
