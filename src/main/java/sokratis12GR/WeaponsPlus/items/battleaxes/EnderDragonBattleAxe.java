package sokratis12GR.WeaponsPlus.items.battleaxes;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
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
public class EnderDragonBattleAxe extends ItemSword {


    public EnderDragonBattleAxe(Item.ToolMaterial material) {
        super(material);
        setRegistryName("EnderDragonBattleAxe");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName("EnderDragonBattleAxe");     // Used for localization (en_US.lang)
        GameRegistry.register(this);
        this.setCreativeTab(WeaponsPlus.TAB_WEAPONSPLUS);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(1, attacker);
        if (target instanceof EntityLivingBase) {
            ((EntityLivingBase) target).addPotionEffect(new PotionEffect(MobEffects.WITHER, 60, 3, false, true));
        }
        return true;
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == Item.getByNameOrId("armorplus:EnderDragonScale");
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return (TextFormatting.DARK_PURPLE + I18n.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(WeaponsPlus.MODID + ":" + "EnderDragonBattleAxe", "inventory"));
    }

}
