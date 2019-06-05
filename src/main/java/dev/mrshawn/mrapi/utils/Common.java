package dev.mrshawn.mrapi.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Common {


	public static void log(String... messages) {
		for (final String message : messages)
			log(message);
	}

	public static void log(String sender, String messages) {
		tell(Bukkit.getConsoleSender(), "[" + sender + "] " + messages);
	}

	public static void tell(CommandSender toWhom, String... messages) {
		for (final String message : messages)
			tell(toWhom, message);
	}

	public static void tell(CommandSender toWhom, String message) {
		toWhom.sendMessage(colorize(message));
	}

	public static String colorize(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}

}
