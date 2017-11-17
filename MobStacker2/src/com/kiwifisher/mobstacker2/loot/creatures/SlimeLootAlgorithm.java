package com.kiwifisher.mobstacker2.loot.creatures;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Slime;
import org.bukkit.inventory.ItemStack;

import com.kiwifisher.mobstacker2.loot.Loot;
import com.kiwifisher.mobstacker2.loot.LootAlgorithm;

public class SlimeLootAlgorithm extends LootAlgorithm {

    public SlimeLootAlgorithm() {
        this.getLootArray().add(new Loot(Material.SLIME_BALL, 0, 2));
    }

    @Override
    public int getExp(Entity entity, int numberOfMobs) {
        if (!(entity instanceof Slime)) {
            return 0;
        }

        return (((Slime) entity).getSize() + 1) * numberOfMobs;
    }

    @Override
    public List<ItemStack> getRandomLoot(Entity entity, int numberOfMobs, boolean playerKill, int looting) {
        if (!(entity instanceof Slime)) {
            return new ArrayList<>();
        }

        if (((Slime) entity).getSize() == 0) {
            return super.getRandomLoot(entity, numberOfMobs, playerKill, looting);
        }

        return new ArrayList<>();
    }

}
