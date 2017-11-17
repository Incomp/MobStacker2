package com.kiwifisher.mobstacker2.loot;

import org.bukkit.Material;

public class RareLoot extends Loot {

    public RareLoot(Material material) {
        super(material, 1, 1, 0.025, false);
    }

    public RareLoot(Material material, short data) {
        super(material, data, 1, 1, 0.025, false);
    }

    @Override
    public double getDropChance(int looting) {
        return Math.min(1, super.getDropChance(looting) + 0.01 * looting);
    }

}
