package dev.mrshawn.mrapi;

import dev.mrshawn.mrapi.utils.Common;
import org.bukkit.plugin.java.JavaPlugin;

public final class MrAPI extends JavaPlugin {

	@Override
	public void onEnable() {
		Common.log("MrAPI", "&6MrAPI started successfully!");

	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}
}
