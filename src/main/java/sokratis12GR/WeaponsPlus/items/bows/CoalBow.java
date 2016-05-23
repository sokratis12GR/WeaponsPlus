package sokratis12GR.WeaponsPlus.items.bows;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.*;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import sokratis12GR.WeaponsPlus.WeaponsPlus;

import javax.annotation.Nullable;

/**
 * Created by Socrates on 4/19/2016.
 */
public class CoalBow extends ItemBow {


    public CoalBow() {
        this.setMaxDamage(59);
        setRegistryName("CoalBow");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName("CoalBow");     // Used for localization (en_US.lang)
        GameRegistry.register(this);
        this.setCreativeTab(WeaponsPlus.TAB_WEAPONSPLUS);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(1, attacker);
        if (target instanceof EntityLivingBase) {
            ((EntityLivingBase) target).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 180, 0, false, true));
        }
        return true;
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == Items.COAL;
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return (TextFormatting.GRAY + I18n.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(WeaponsPlus.MODID + ":" + "CoalBow", "inventory"));
    }

}
