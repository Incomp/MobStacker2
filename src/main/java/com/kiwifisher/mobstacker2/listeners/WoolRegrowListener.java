package com.kiwifisher.mobstacker2.listeners;

import com.kiwifisher.mobstacker2.metadata.MetaTags;
import com.kiwifisher.mobstacker2.util.Util;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.SheepRegrowWoolEvent;

public class WoolRegrowListener implements Listener {

    @EventHandler
    public void regrowEvent(SheepRegrowWoolEvent event) {

        if (!MetaTags.hasMetaData(event.getEntity())) return;

        Util.tryStack(event.getEntity());

    }

}
