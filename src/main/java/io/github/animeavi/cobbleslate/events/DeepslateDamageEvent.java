package io.github.animeavi.cobbleslate.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.Arrays;

public class DeepslateDamageEvent implements Listener {
    @EventHandler
    public void deepslateDamage(BlockDamageEvent event) {
        ArrayList<Material> deepslate_materials = new ArrayList<Material>(Arrays.asList(Material.DEEPSLATE, Material.COBBLED_DEEPSLATE));
        if (deepslate_materials.indexOf(event.getBlock().getType()) == -1) {
            return;
        }

        int tickrate = 20;
        // Give player Haste potion with no visible indicators (hand animation will be faster though)
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1 * tickrate, 2, false, false, false));
    }
}
