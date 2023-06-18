package com.moiyri.gardenwarfare.gui;

import com.moiyri.gardenwarfare.GardenWarfare;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class ChooseAHeroGUI implements Listener, GameGUI {
    GardenWarfare plugin;

    Inventory gui;

    public ChooseAHeroGUI(GardenWarfare plugin) {
        this.plugin = plugin;
    }

    public Inventory getGUI() {
        return this.gui;
    }
}
