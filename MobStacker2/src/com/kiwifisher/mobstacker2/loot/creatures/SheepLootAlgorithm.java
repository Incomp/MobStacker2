package com.kiwifisher.mobstacker2.loot.creatures;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Sheep;

import com.kiwifisher.mobstacker2.loot.CookableLoot;
import com.kiwifisher.mobstacker2.loot.Loot;

public class SheepLootAlgorithm extends AnimalLootAlgorithm {

    public SheepLootAlgorithm() {
        this.getLootArray().add(new CookableLoot(Material.MUTTON, Material.COOKED_MUTTON, 1, 2));
        this.getLootArray().add(new Loot(Material.WOOL, 1, 1, false) {
            @SuppressWarnings("deprecation")
			@Override
            public short getData(Entity entity) {
                if (!(entity instanceof Sheep)) {
                    return super.getData(entity);
                }
                return ((Sheep) entity).getColor().getWoolData();
            }
        });
    }

}
