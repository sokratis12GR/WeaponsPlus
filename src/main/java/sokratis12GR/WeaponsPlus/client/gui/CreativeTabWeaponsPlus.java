package sokratis12GR.WeaponsPlus.client.gui;

//Creates your creative tab.

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sokratis12GR.WeaponsPlus.WeaponsPlus;
import sokratis12GR.WeaponsPlus.registry.ModItems;

public class CreativeTabWeaponsPlus extends CreativeTabs {

  public CreativeTabWeaponsPlus(String tabLabel) {
      super(tabLabel);
      setBackgroundImageName(WeaponsPlus.MODID + "(WIP)" + ".png"); // Automagically has tab_ applied to it. Make sure you change the texture name.
  }

  public boolean hasSearchBar() {
      return true;
  }

  //The tab icon is what you return here.
  @Override
  public ItemStack getIconItemStack() {
      return new ItemStack(ModItems.COAL_SWORD);
  }

  @Override
  public Item getTabIconItem() {
      return new Item();
  }
}