package com.moiyri.gardenwarfare.listener;

import com.moiyri.gardenwarfare.GardenWarfare;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public final class IndicatorListener implements Listener {
    GardenWarfare plugin;
    public IndicatorListener(GardenWarfare plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        if(player.getInventory().getItemInMainHand() != null) {
            ItemStack item = player.getInventory().getItemInMainHand();
            if(item.getItemMeta().getDisplayName().equals("Indicator")) {
                e.setCancelled(true);
            }
        }
    }
}
