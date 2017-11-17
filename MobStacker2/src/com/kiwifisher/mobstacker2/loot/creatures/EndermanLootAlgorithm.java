package com.kiwifisher.mobstacker2.loot.creatures;

import org.bukkit.Material;
import org.bukkit.entity.Entity;

import com.kiwifisher.mobstacker2.loot.Loot;
import com.kiwifisher.mobstacker2.loot.LootAlgorithm;

public class EndermanLootAlgorithm extends LootAlgorithm {

    public EndermanLootAlgorithm() {
        this.getLootArray().add(new Loot(Material.ENDER_PEARL, 0, 1));
    }

    @Override
    public int getExp(Entity entity, int numberOfMobs) {
        return 5 * numberOfMobs;
    }

}
