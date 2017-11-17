package com.kiwifisher.mobstacker2.loot.creatures;

import org.bukkit.Material;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;

import com.kiwifisher.mobstacker2.loot.Loot;
import com.kiwifisher.mobstacker2.loot.LootAlgorithm;
import com.kiwifisher.mobstacker2.loot.RareLoot;

public class ZombieLootAlgorithm extends LootAlgorithm {

    public ZombieLootAlgorithm() {
        this.getLootArray().add(new Loot(Material.ROTTEN_FLESH, 0, 2));
        this.getLootArray().add(new RareLoot(Material.IRON_INGOT));
        this.getLootArray().add(new RareLoot(Material.CARROT_ITEM));
        this.getLootArray().add(new RareLoot(Material.POTATO_ITEM));
    }

    @Override
    public int getExp(Entity entity, int numberOfMobs) {
        // Babies drop 12 exp.
        if (entity instanceof Ageable && !((Ageable) entity).isAdult()) {
            return 12 * numberOfMobs;
        }
        // Adults drop 5 exp per.
        return 5 * numberOfMobs;
    }

}
