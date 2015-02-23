package nmt.minecraft.chavezfk.Email;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Email extends JavaPlugin implements Listener {
	
	private FileConfiguration config = YamlConfiguration.loadConfiguration(new File(getDataFolder(),"plugin.yml"));
	@Override
	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(this,this);
		getLogger().info("The Email has been implemented! :D");
		
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args){
		if(cmd.getName().equalsIgnoreCase("message") && sender instanceof Player && args.length > 0){
			Player p = (Player) sender;
			p.sendMessage("youre here!");
			return true;
		}else{
			if(args.length == 0)sender.sendMessage("Incorrect usage. usage: /msg send ");
			else sender.sendMessage("you must be a player! No console commands here buddy!");
		}
		return false;
	}
}
