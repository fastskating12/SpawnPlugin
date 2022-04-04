package me.fast.spawnplugin.Commands;

import me.fast.spawnplugin.SpawnPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {

    private final SpawnPlugin plugin;

    public SetSpawnCommand(SpawnPlugin plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player pLayer = (Player) sender;
            Location location = pLayer.getLocation();
            plugin.getConfig().set("spawn", location);
            plugin.saveConfig();
            pLayer.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Spawn Location Set! Cords are: " + ChatColor.ITALIC + "X: " + location.getBlockX() + " Y: " + location.getBlockY() + " Z: " + location.getBlockZ() + ".");

    }else{
        System.out.println("Hey! This is only for player's.");
        }



        return false;

}}
