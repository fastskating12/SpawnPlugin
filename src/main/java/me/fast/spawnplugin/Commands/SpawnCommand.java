package me.fast.spawnplugin.Commands;

import me.fast.spawnplugin.SpawnPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class SpawnCommand implements CommandExecutor {

    private final SpawnPlugin plugin;
    public SpawnCommand(SpawnPlugin plugin) {
        this.plugin = plugin;


    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            Location location = plugin.getConfig().getLocation("spawn");
            if (location != null){
                player.teleport(location);
                player.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "You have been successfully teleported to spawn!");

            }else{
                player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Please notify an admin that THERE IS NO SPAWN POINT SET!");
            }




        }



        return false;
    }
}



