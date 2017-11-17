package com.kiwifisher.mobstacker2.loot.creatures;

import org.bukkit.Material;
import org.bukkit.entity.Entity;

import com.kiwifisher.mobstacker2.loot.Loot;
import com.kiwifisher.mobstacker2.loot.LootAlgorithm;

public class CreeperLootAlgorithm extends LootAlgorithm {

    public CreeperLootAlgorithm() {
        this.getLootArray().add(new Loot(Material.SULPHUR, 0, 2));
    }

    @Override
    public int getExp(Entity entity, int numberOfMobs) {
        return 5 * numberOfMobs;
    }

}
