package io.github.animeavi.cobbleslate;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.animeavi.cobbleslate.events.DeepslateDamageEvent;

public final class Cobbleslate extends JavaPlugin {
    @Override
    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new DeepslateDamageEvent(), this);
    }
}
