package me.fast.spawnplugin;

import me.fast.spawnplugin.Commands.SetSpawnCommand;
import me.fast.spawnplugin.Commands.SpawnCommand;
import me.fast.spawnplugin.Listeners.SpawnListeners;
import org.bukkit.plugin.java.JavaPlugin;
import sun.jvm.hotspot.code.ScopeDesc;

public final class SpawnPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("setspawn").setExecutor(new SetSpawnCommand(this));
        getCommand("spawn").setExecutor(new SpawnCommand(this));
        getServer().getPluginManager().registerEvents(new SpawnListeners(this), this);


    }

}