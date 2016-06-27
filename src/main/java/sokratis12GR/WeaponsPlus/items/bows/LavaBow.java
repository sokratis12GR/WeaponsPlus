package sokratis12GR.WeaponsPlus.items.bows;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import sokratis12GR.WeaponsPlus.WeaponsPlus;

/**
 * Created by Socrates on 4/19/2016.
 */
public class LavaBow extends ItemBow {


    public LavaBow() {
        this.setMaxDamage(1750);
        setRegistryName("LavaBow");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName("LavaBow");     // Used for localization (en_US.lang)
        GameRegistry.register(this);
        this.setCreativeTab(WeaponsPlus.TAB_WEAPONSPLUS);
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return (TextFormatting.GOLD + I18n.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(WeaponsPlus.MODID + ":" + "LavaBow", "inventory"));
    }

}
