package sokratis12GR.WeaponsPlus.resources;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import sokratis12GR.WeaponsPlus.WeaponsPlus;
import sokratis12GR.WeaponsPlus.registry.ModItems;
import sokratis12GR.WeaponsPlus.util.TextHelper;

public class GlobalEventsWeaponsPlus {
    @SubscribeEvent
    public void onPlayerCraftedItem(PlayerEvent.ItemCraftedEvent event) {

        Item i = event.crafting.getItem();

        ItemStack itemStack = event.crafting;

        /** Swords */
        if (i == ModItems.LAPIS_SWORD)
            itemStack.addEnchantment(Enchantment.getEnchantmentByLocation("looting"), 3);
        if (i == ModItems.GUARDIAN_SWORD)
            itemStack.addEnchantment(Enchantment.getEnchantmentByLocation("sharpness"), 1);
        /** BattleAxes */
        if (i == ModItems.LAPIS_BATTLE_AXE)
            itemStack.addEnchantment(Enchantment.getEnchantmentByLocation("looting"), 3);
        if (i == ModItems.GUARDIAN_BATTLE_AXE)
            itemStack.addEnchantment(Enchantment.getEnchantmentByLocation("sharpness"), 1);
        /** Bows */
        if (i == ModItems.LAPIS_BOW)
            itemStack.addEnchantment(Enchantment.getEnchantmentByLocation("looting"), 3);
        if (i == ModItems.GUARDIAN_BOW)
            itemStack.addEnchantment(Enchantment.getEnchantmentByLocation("power"), 1);
    }

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        ConfigHandler.syncConfig();
        WeaponsPlus.logger.info(TextHelper.localize("info." + WeaponsPlus.MODID + ".console.config.refresh"));
    }
}