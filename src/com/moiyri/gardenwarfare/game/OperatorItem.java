package com.moiyri.gardenwarfare.game;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class OperatorItem {
    public static ItemStack getIndicator() {
        ItemStack indicator = new ItemStack(Material.STICK);
        ItemMeta indicatorItemMeta = indicator.getItemMeta();
        indicatorItemMeta.setDisplayName("Indicator");
        List<String> indicatorLore = new ArrayList<>();
        indicatorLore.add("Indicator for GardenWarfare");
        indicatorItemMeta.setLore(indicatorLore);
        indicator.setItemMeta(indicatorItemMeta);
        return indicator;
    }
}
