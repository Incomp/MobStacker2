package com.kiwifisher.mobstacker2.listeners;

import com.kiwifisher.mobstacker2.io.Settings;
import com.kiwifisher.mobstacker2.metadata.MetaTags;
import com.kiwifisher.mobstacker2.util.Util;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.event.player.PlayerUnleashEntityEvent;

public class MobLeashListener implements Listener {

    @EventHandler
    public void playerLeashEvent(PlayerLeashEntityEvent event) {

        if (Settings.LEASH_FULL_STACK) return;

        /*
        Get the entity being leashed
         */
        LivingEntity leashedEntity = (LivingEntity) event.getEntity();

        /*
        If configs are permitting, and is a valid stack, peel off the one we leashed and set it's restack to false so it doesn't
        just jump back in to the stack we got it from.
         */
        if (MetaTags.hasMetaData(leashedEntity) && MetaTags.getQuantity(leashedEntity) > 1 && !Settings.LEASH_FULL_STACK) {
            LivingEntity remainingStack = Util.peelAway(leashedEntity);
            MetaTags.setStacking(leashedEntity, Settings.STACK_LEASHED_ANIMALS);
        }

    }

    @EventHandler
    public void playerUnleashEvent(PlayerUnleashEntityEvent event) {
        LivingEntity entity = (LivingEntity) event.getEntity();

        /*
        If we unleash a mob that has no data (Because it was removed when we leashed it), then add the data back in
         */
        if (MetaTags.hasMetaData(entity)) {
            MetaTags.setStacking(entity, true);
            Util.respawn(entity);
        }

    }


}
