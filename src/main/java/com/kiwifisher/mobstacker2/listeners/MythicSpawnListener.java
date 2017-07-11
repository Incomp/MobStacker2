package com.kiwifisher.mobstacker2.listeners;

import com.kiwifisher.mobstacker2.io.Settings;
import com.kiwifisher.mobstacker2.metadata.MetaTags;
import net.elseland.xikage.MythicMobs.API.Bukkit.Events.MythicMobSpawnEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class MythicSpawnListener implements Listener {

    @EventHandler(priority = EventPriority.LOWEST)
    public void onMythicSpawn(MythicMobSpawnEvent event) {

        if (MetaTags.hasMetaData(event.getLivingEntity()) && !Settings.SPAWN_TYPES.contains("MYTHIC_MOBS")) {

            MetaTags.setSpawnReason(event.getLivingEntity(), "MYTHIC_MOBS");

        }

    }

}
