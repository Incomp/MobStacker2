package com.kiwifisher.mobstacker2.loot.creatures;

import org.bukkit.Material;
import org.bukkit.entity.Entity;

import com.kiwifisher.mobstacker2.loot.Loot;
import com.kiwifisher.mobstacker2.loot.LootAlgorithm;

/**
 * LootAlgorithm for Withers.
 *
 * @author Jikoo
 */
public class WitherLootAlgorithm extends LootAlgorithm {

    public WitherLootAlgorithm() {
        this.getLootArray().add(new Loot(Material.NETHER_STAR, 1, 1));
    }

    @Override
    public int getExp(Entity entity, int numberOfMobs) {
        return 50 * numberOfMobs;
    }

}