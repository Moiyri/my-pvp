package com.moiyri.gardenwar;

import com.moiyri.gardenwar.gui.SetupGUI;
import com.moiyri.gardenwar.listener.IndicatorListener;
import com.moiyri.gardenwar.manager.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class GardenWar extends JavaPlugin {
    @Override
    public void onEnable() {
        this.setupCommandManager();
        this.setupListener();
        getLogger().info("Hello!");
    }

    @Override
    public void onDisable() {

    }

    public void setupListener() {
        getServer().getPluginManager().registerEvents(new SetupGUI(this), this);
        getServer().getPluginManager().registerEvents(new IndicatorListener(this),this);
    }

    public void setupCommandManager() {
        CommandManager manager = new CommandManager(this);
        this.getCommand("gardenwar").setExecutor(manager);
    }
}
