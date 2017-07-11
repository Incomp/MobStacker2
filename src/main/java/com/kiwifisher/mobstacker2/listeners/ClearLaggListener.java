package com.kiwifisher.mobstacker2.listeners;

import com.kiwifisher.mobstacker2.io.Settings;
import com.kiwifisher.mobstacker2.util.Util;
import me.minebuilders.clearlag.events.EntityRemoveEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ClearLaggListener implements Listener {

    @EventHandler
    public void onClear(EntityRemoveEvent event) {

        if (Settings.CLEAR_LAG) {

            Util.countAllStacks(true);

        }

    }

}
