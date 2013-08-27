package mod.lessBeds.main;

import java.util.Iterator;

import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EnumStatus;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.server.management.PlayerManager;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;

public class PlayerInts {
	
	public static int majority;
	
	public static Boolean MajorityPlayersAsleep()
	{	
	int playersOnline = PlayerManager.players.size();
	int playersAsleep = PlayerSleepInBedEvent.getTimesSleepEventCalled;
	
	if (playersOnline % 2 == 0)
	{
	 majority = playersOnline / 2; 
	} 
	else
	{
	 majority = playersOnline + 1 / 2;
	}
	if (playersAsleep >= majority)
	{
		return true;
	}
	else
	{
		return false;
	}
  }

	public static void SetTimeDay()
	{
		if(MajorityPlayersAsleep()){
			//EntityPlayer.wakeUpPlayer(false, false, true);
			
            PlayerSleepInBedEvent.getTimesSleepEventCalled = 0;
		}
	}
}
