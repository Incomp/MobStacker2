package com.kiwifisher.mobstacker2.loot.creatures;

import org.bukkit.Material;

import com.kiwifisher.mobstacker2.loot.Loot;

public class SquidLootAlgorithm extends AnimalLootAlgorithm {

    public SquidLootAlgorithm() {
        this.getLootArray().add(new Loot(Material.INK_SACK, 1, 3));
    }

}