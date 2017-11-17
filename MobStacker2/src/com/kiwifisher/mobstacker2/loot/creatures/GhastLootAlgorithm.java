package com.kiwifisher.mobstacker2.loot.creatures;

import com.kiwifisher.mobstacker2.loot.Loot;
import com.kiwifisher.mobstacker2.loot.LootAlgorithm;
import org.bukkit.Material;
import org.bukkit.entity.Entity;

/**
 * LootAlgorithm for Ghasts.
 *
 * @author Jikoo
 */
public class GhastLootAlgorithm extends LootAlgorithm {

    public GhastLootAlgorithm() {
        this.getLootArray().add(new Loot(Material.GHAST_TEAR, 1));
        this.getLootArray().add(new Loot(Material.SULPHUR, 2));
    }

    @Override
    public int getExp(Entity entity, int numberOfMobs) {
        return 5 * numberOfMobs;
    }

}
