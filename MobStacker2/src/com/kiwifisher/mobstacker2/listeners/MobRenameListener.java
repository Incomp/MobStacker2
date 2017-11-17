package com.kiwifisher.mobstacker2.listeners;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import com.kiwifisher.mobstacker2.io.Settings;
import com.kiwifisher.mobstacker2.metadata.MetaTags;

public class MobRenameListener implements Listener {

    @EventHandler
    public void entityRename(PlayerInteractEntityEvent event) {

        /*
        If we should keep named mobs safe then we gotta peel em off
        	> We should probably update this to support 1.12.
         */
    	
    	/*
    	 * Ignore interactions in the off-hand.
    	 */
    	if(event.getHand() != EquipmentSlot.HAND) return;
    	
    	/*
    	 * Get the item that the player is holding. For the sake of convenience.
    	 */
    	ItemStack inHand = event.getPlayer().getInventory().getItemInMainHand();
    	
    	/*
    	 * Make sure that the player is actually holding an item in their main hand.
    	 */
    	if(inHand == null) return;
    	
        if (inHand.getType() == Material.NAME_TAG
                && event.getRightClicked() instanceof LivingEntity) {

            LivingEntity entity = (LivingEntity) event.getRightClicked();;

            /*
            Initialised blank name tag to get default name if it changes in future updates.
             */
            ItemStack normalNameTag = new ItemStack(Material.NAME_TAG, 1, (byte) 0);

            /*
            If the creature has the required data and the name tag isn't blank, then follow.
             */
            if (MetaTags.hasMetaData(entity) && !inHand.getItemMeta().getDisplayName().equalsIgnoreCase(normalNameTag.getItemMeta().getDisplayName())) {

                /*
                Set not stacking so it doesn't restack
                 */
                MetaTags.setStacking(entity, Settings.STACK_NAMED_MOBS);

                int newQuantity = MetaTags.getQuantity(entity) - 1;
                MetaTags.setQuantity(entity, 1);

                /*
                If there is more than one creature in the stack, then peel one off and don't allow it to stack again.
                 */
                if (newQuantity > 0) {

                    LivingEntity newEntity = (LivingEntity) entity.getWorld().spawnEntity(entity.getLocation(), entity.getType());
                    MetaTags.setQuantity(newEntity, newQuantity);

                }

            }


        }

    }

}
