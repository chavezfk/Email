package nmt.minecraft.chavezfk.Email;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Email extends JavaPlugin implements Listener {
	@Override
	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(this,this);
		getLogger().info("The Email has been implemented! :D");
		
	}
}
