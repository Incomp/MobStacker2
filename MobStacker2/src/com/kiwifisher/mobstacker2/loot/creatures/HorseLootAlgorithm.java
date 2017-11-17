package com.kiwifisher.mobstacker2.loot.creatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Horse;
import org.bukkit.inventory.ItemStack;

import com.kiwifisher.mobstacker2.loot.Loot;

public class HorseLootAlgorithm extends AnimalLootAlgorithm {

    public HorseLootAlgorithm() {
        this.getLootArray().add(new Loot(Material.LEATHER, 0, 2));
    }

    @SuppressWarnings("deprecation")
	@Override
    public List<ItemStack> getRandomLoot(Entity entity, int numberOfMobs, boolean playerKill, int looting) {

        if (!(entity instanceof Horse)) {
            return new ArrayList<>();
        }

        Horse horse = (Horse) entity;

        if (!horse.isAdult()) {
            return new ArrayList<>();
        }

        switch (horse.getVariant()) {
            case SKELETON_HORSE:
                return Arrays.asList(new ItemStack(Material.BONE, 1));
            case UNDEAD_HORSE:
                return Arrays.asList(new ItemStack(Material.ROTTEN_FLESH, 1));
            case DONKEY:
            case HORSE:
            case MULE:
            default:
                return super.getRandomLoot(entity, numberOfMobs, playerKill, looting);
        }

    }
}
