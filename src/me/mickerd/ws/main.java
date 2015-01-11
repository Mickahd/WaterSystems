package me.mickerd.ws;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	static Plugin plugin = null;
	
	public void onEnable(){
		plugin = this;
	}
	
	public void onDisable(){
		plugin = null;
	}

	public static Plugin getPlugin(){
		return plugin;
	}
}
