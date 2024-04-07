package me.frawlah.bwplaycmd;

import com.andrei1058.bedwars.api.BedWars;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        if (Bukkit.getPluginManager().getPlugin("BedWars1058") == null) {
            getLogger().severe("BedWars1058 was not found!");
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        } else {
            getLogger().info("BedWars1058 was found!");
            BedWars bedWarsAPI = Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider();
            getCommand("play").setExecutor(new PlayCommands());
            getLogger().info("BedWars1058-PlayCommand addon enabled!");
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("BedWars1058-PlayCommand addon disabled!");
        getLogger().info("Goodbye! ❤");
    }
}
