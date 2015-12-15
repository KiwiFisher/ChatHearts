package com.kiwifisher.chathearts;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatHearts extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onChatEvent(AsyncPlayerChatEvent event) {
        if (event.getMessage().contains("<3") && event.getPlayer().hasPermission("chathearts.use")) {
            event.setMessage(event.getMessage().replace("<3", ChatColor.RED + "\u2764" + ChatColor.RESET));
        }
    }

}
