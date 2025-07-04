package com.onepieceworld.plugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class WaterDamageListener implements Listener {
    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player player && FruitManager.hasFruit(player)) {
            if (player.getLocation().getBlock().getType() == Material.WATER) {
                e.setCancelled(false);
                player.damage(2.0);
                player.sendMessage("§cYou are weakened by water due to your Devil Fruit!");
            }
        }
    }
}