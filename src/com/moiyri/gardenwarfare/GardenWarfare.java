package com.moiyri.gardenwarfare;

import com.moiyri.gardenwarfare.gui.SetupGUI;
import com.moiyri.gardenwarfare.listener.IndicatorListener;
import com.moiyri.gardenwarfare.manager.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class GardenWarfare extends JavaPlugin {
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
        this.getCommand("gardenwarfare").setExecutor(manager);
    }
}
