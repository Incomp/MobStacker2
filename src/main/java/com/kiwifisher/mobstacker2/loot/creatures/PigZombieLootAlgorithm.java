package com.kiwifisher.mobstacker2.loot.creatures;

import com.kiwifisher.mobstacker2.loot.Loot;
import com.kiwifisher.mobstacker2.loot.LootAlgorithm;
import com.kiwifisher.mobstacker2.loot.RareLoot;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class PigZombieLootAlgorithm extends ZombieLootAlgorithm {

    public PigZombieLootAlgorithm() {
        for (Iterator<Loot> iterator = this.getLootArray().iterator(); iterator.hasNext();) {
            if (iterator.next() instanceof RareLoot) {
                iterator.remove();
            }
        }

        this.getLootArray().add(new Loot(Material.GOLD_NUGGET, 1));
        this.getLootArray().add(new RareLoot(Material.GOLD_INGOT));
        // TODO: sword?
    }

}
