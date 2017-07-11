package com.kiwifisher.mobstacker2.loot.creatures;

import com.kiwifisher.mobstacker2.loot.Loot;
import com.kiwifisher.mobstacker2.loot.LootAlgorithm;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SquidLootAlgorithm extends AnimalLootAlgorithm {

    public SquidLootAlgorithm() {
        this.getLootArray().add(new Loot(Material.INK_SACK, 1, 3));
    }

}