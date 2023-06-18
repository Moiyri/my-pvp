package com.moiyri.gardenwar.listener;

import com.moiyri.gardenwar.GardenWar;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public final class IndicatorListener implements Listener {
    GardenWar plugin;
    public IndicatorListener(GardenWar plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();
        if(item.getItemMeta().getDisplayName().equals("Indicator")) {
            e.setCancelled(true);
        }
//        try {
//
//        } catch (Exception exception) {}
    }
}
