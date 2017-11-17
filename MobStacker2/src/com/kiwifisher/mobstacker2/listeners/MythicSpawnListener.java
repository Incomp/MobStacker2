package com.kiwifisher.mobstacker2.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import com.kiwifisher.mobstacker2.io.Settings;
import com.kiwifisher.mobstacker2.metadata.MetaTags;

import io.lumine.xikage.mythicmobs.api.bukkit.events.MythicMobSpawnEvent;

public class MythicSpawnListener implements Listener {

    @SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.LOWEST)
    public void onMythicSpawn(MythicMobSpawnEvent event) {

        if (MetaTags.hasMetaData(event.getLivingEntity()) && !Settings.SPAWN_TYPES.contains("MYTHIC_MOBS")) {

            MetaTags.setSpawnReason(event.getLivingEntity(), "MYTHIC_MOBS");

        }

    }

}
