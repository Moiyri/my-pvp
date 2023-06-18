package com.moiyri.gardenwarfare.gui;

import com.moiyri.gardenwarfare.GardenWarfare;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SetupGUI implements GameGUI, Listener {
    GardenWarfare plugin;

    private ItemStack lobby;
    private ItemStack map;
    private Inventory gui;

    public SetupGUI(GardenWarfare plugin) {
        this.plugin = plugin;
        this.gui = Bukkit.createInventory(null, 9, "设置游戏");

        lobby = new ItemStack(Material.WOOL);
        ItemMeta lobbyItemMeta = lobby.getItemMeta();
        lobbyItemMeta.setDisplayName("设置大厅");
        lobby.setItemMeta(lobbyItemMeta);

        map = new ItemStack(Material.MAP);
        ItemMeta mapItemMeta = map.getItemMeta();
        mapItemMeta.setDisplayName("设置地图");
        map.setItemMeta(mapItemMeta);

        this.gui.setItem(0, lobby);
        this.gui.setItem(1, map);
    }
    public Inventory getGUI() {
        return this.gui;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if(e.getInventory().getName().equals("设置游戏")) {
            e.setCancelled(true);
        }
    }
}
