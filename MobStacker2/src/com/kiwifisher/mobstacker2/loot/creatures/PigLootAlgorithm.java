package com.kiwifisher.mobstacker2.loot.creatures;

import org.bukkit.Material;

import com.kiwifisher.mobstacker2.loot.CookableLoot;

public class PigLootAlgorithm  extends AnimalLootAlgorithm {

    public PigLootAlgorithm() {
        this.getLootArray().add(new CookableLoot(Material.PORK, Material.GRILLED_PORK, 1, 3));
    }

}
