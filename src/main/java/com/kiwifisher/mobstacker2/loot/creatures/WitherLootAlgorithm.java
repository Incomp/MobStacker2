package com.kiwifisher.mobstacker2.loot.creatures;

import com.kiwifisher.mobstacker2.loot.Loot;
import com.kiwifisher.mobstacker2.loot.LootAlgorithm;
import org.bukkit.Material;
import org.bukkit.entity.Entity;

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