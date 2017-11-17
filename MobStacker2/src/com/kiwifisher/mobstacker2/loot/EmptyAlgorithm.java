package com.kiwifisher.mobstacker2.loot;

import com.google.common.collect.ImmutableList;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * Empty LootAlgorithm to be shared between entity types without drops.
 *
 * @author Jikoo
 */
public final class EmptyAlgorithm extends LootAlgorithm {

    private static EmptyAlgorithm instance;

    protected static EmptyAlgorithm getInstance() {
        if (instance == null) {
            instance = new EmptyAlgorithm();
        }
        return instance;
    }

    private EmptyAlgorithm() {}

    private final List<ItemStack> loot = ImmutableList.of();

    @Override
    public int getExp(Entity entity, int numberOfMobs) {
        return 0;
    }

    @Override
    public List<ItemStack> getRandomLoot(Entity entity, int numberOfMobs, boolean playerKill, int looting) {
        return loot;
    }

}