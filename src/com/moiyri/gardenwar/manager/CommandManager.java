package com.moiyri.gardenwar.manager;

import com.moiyri.gardenwar.GardenWar;
import com.moiyri.gardenwar.game.OperatorItem;
import com.moiyri.gardenwar.gui.SetupGUI;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CommandManager implements CommandExecutor {
    public GardenWar plugin;
    public CommandManager(GardenWar plugin) {
        this.plugin = plugin;
    }
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("gardenwar") || label.equalsIgnoreCase("gw")) {
            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("setup")) {
                    if(sender instanceof Player) {
                        return this.setupCommand((Player) sender);
                    }
                } else if(args[0].equalsIgnoreCase("indicator")) {
                    if(sender instanceof Player) {
                        Player player = (Player) sender;
                        player.getInventory().addItem(OperatorItem.getIndicator());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean setupCommand(Player player) {
        try {
            SetupGUI setupGUI = new SetupGUI(plugin);

            player.openInventory(setupGUI.getGUI());
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }
}
