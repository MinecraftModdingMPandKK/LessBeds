package mod.lessBeds.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = "lessbeds", name = "LessBeds", version = "0.0.0.001") 
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class LessBeds{
	
	//The instance of your mod that Forge uses.
	@Instance ("LessBeds")
	public static LessBeds instance;
	
	//Says where the client and server proxy code is loaded.
		//@SidedProxy(clientSide="kkaylium.mod.RandomUtilities.main.ClientProxy", serverSide="kkaylium.mod.RandomUtilities.main.CommonProxy")
		//public static CommonProxy proxy;

		@PreInit
		public void preInit(FMLPreInitializationEvent event)
		{
			
		}
		
		@Init
		public void load(FMLInitializationEvent event)
		{
			PlayerInts.MajorityPlayersAsleep();
			PlayerInts.SetTimeDay();
		}

		@PostInit
		public void postInit(FMLPostInitializationEvent event)
		{

		}


}
