package com.kiwifisher.mobstacker2.loot.creatures;

import org.bukkit.Material;
import org.bukkit.entity.Entity;

import com.kiwifisher.mobstacker2.loot.Loot;
import com.kiwifisher.mobstacker2.loot.LootAlgorithm;

public class SnowGolemLootAlgorithm extends LootAlgorithm {

    public SnowGolemLootAlgorithm() {
        this.getLootArray().add(new Loot(Material.SNOW_BALL, 0, 15));
    }

    @Override
    public int getExp(Entity entity, int numberOfMobs) {
        return 0;
    }

}
