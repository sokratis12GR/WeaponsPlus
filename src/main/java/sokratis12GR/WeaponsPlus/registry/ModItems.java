package sokratis12GR.WeaponsPlus.registry;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import sokratis12GR.WeaponsPlus.items.battleaxes.*;
import sokratis12GR.WeaponsPlus.items.bows.*;
import sokratis12GR.WeaponsPlus.items.swords.*;

public class ModItems {

    /**
     * Swords
     */
    public static Item.ToolMaterial SWORD_COAL_MATERIAL = EnumHelper.addToolMaterial("SWORD_COAL_MATERIAL", 1, 59, 1.0F, 0.5F, 15);
    public static Item.ToolMaterial SWORD_LAPIS_MATERIAL = EnumHelper.addToolMaterial("SWORD_LAPIS_MATERIAL", 1, 250, 1.0F, 1.0F, 30);
    public static Item.ToolMaterial SWORD_REDSTONE_MATERIAL = EnumHelper.addToolMaterial("SWORD_REDSTONE_MATERIAL", 1, 200, 1.0F, 1.5F, 20);
    public static Item.ToolMaterial SWORD_EMERALD_MATERIAL = EnumHelper.addToolMaterial("SWORD_EMERALD_MATERIAL", 1, 1561, 1.0F, 3.5F, 20);
    public static Item.ToolMaterial SWORD_OBSIDIAN_MATERIAL = EnumHelper.addToolMaterial("SWORD_OBSIDIAN_MATERIAL", 1, 1500, 1.0F, 2.0F, 20);
    public static Item.ToolMaterial SWORD_LAVA_MATERIAL = EnumHelper.addToolMaterial("SWORD_LAVA_MATERIAL", 1, 1750, 1.0F, 1.5F, 20);
    public static Item.ToolMaterial SWORD_SUPER_STAR_MATERIAL = EnumHelper.addToolMaterial("SWORD_SUPER_STAR_MATERIAL", 1, 1750, 0.0F, 4.0F, 20);
    public static Item.ToolMaterial SWORD_GUARDIAN_MATERIAL = EnumHelper.addToolMaterial("SWORD_GUARDIAN_MATERIAL", 1, 500, 1.0F, 2.0F, 30);
    public static Item.ToolMaterial SWORD_ENDER_DRAGON_MATERIAL = EnumHelper.addToolMaterial("SWORD_ENDER_DRAGON_MATERIAL", 1, 2000, 1.0F, 5.0F, 20);
    /**
     * BattleAxes
     */
    public static Item.ToolMaterial BATTLE_AXE_COAL_MATERIAL = EnumHelper.addToolMaterial("BATTLE_AXE_COAL_MATERIAL", 1, 59, 1.0F, 2.5F, 15);
    public static Item.ToolMaterial BATTLE_AXE_LAPIS_MATERIAL = EnumHelper.addToolMaterial("BATTLE_AXE_LAPIS_MATERIAL", 1, 250, 1.0F, 3.0F, 30);
    public static Item.ToolMaterial BATTLE_AXE_REDSTONE_MATERIAL = EnumHelper.addToolMaterial("BATTLE_AXE_REDSTONE_MATERIAL", 1, 200, 1.0F, 3.5F, 20);
    public static Item.ToolMaterial BATTLE_AXE_EMERALD_MATERIAL = EnumHelper.addToolMaterial("BATTLE_AXE_EMERALD_MATERIAL", 1, 1561, 1.0F, 5.5F, 20);
    public static Item.ToolMaterial BATTLE_AXE_OBSIDIAN_MATERIAL = EnumHelper.addToolMaterial("BATTLE_AXE_OBSIDIAN_MATERIAL", 1, 1500, 1.0F, 4.0F, 20);
    public static Item.ToolMaterial BATTLE_AXE_LAVA_MATERIAL = EnumHelper.addToolMaterial("BATTLE_AXE_LAVA_MATERIAL", 1, 1750, 1.0F, 3.5F, 20);
    public static Item.ToolMaterial BATTLE_AXE_SUPER_STAR_MATERIAL = EnumHelper.addToolMaterial("BATTLE_AXE_SUPER_STAR_MATERIAL", 1, 1750, 0.0F, 6.0F, 20);
    public static Item.ToolMaterial BATTLE_AXE_GUARDIAN_MATERIAL = EnumHelper.addToolMaterial("BATTLE_AXE_GUARDIAN_MATERIAL", 1, 500, 1.0F, 4.0F, 30);
    public static Item.ToolMaterial BATTLE_AXE_ENDER_DRAGON_MATERIAL = EnumHelper.addToolMaterial("BATTLE_AXE_ENDER_DRAGON_MATERIAL", 1, 2000, 1.0F, 7.0F, 20);

    /**
     * Swords
     */
    public static CoalSword COAL_SWORD;
    public static LapisSword LAPIS_SWORD;
    public static RedstoneSword REDSTONE_SWORD;
    public static EmeraldSword EMERALD_SWORD;
    public static ObsidianSword OBSIDIAN_SWORD;
    public static LavaSword LAVA_SWORD;
    public static SuperStarSword SUPER_STAR_SWORD;
    public static GuardianSword GUARDIAN_SWORD;
    public static EnderDragonSword ENDER_DRAGON_SWORD;
    /**
     * BattleAxes
     */
    public static CoalBattleAxe COAL_BATTLE_AXE;
    public static LapisBattleAxe LAPIS_BATTLE_AXE;
    public static RedstoneBattleAxe REDSTONE_BATTLE_AXE;
    public static EmeraldBattleAxe EMERALD_BATTLE_AXE;
    public static ObsidianBattleAxe OBSIDIAN_BATTLE_AXE;
    public static LavaBattleAxe LAVA_BATTLE_AXE;
    public static SuperStarBattleAxe SUPER_STAR_BATTLE_AXE;
    public static GuardianBattleAxe GUARDIAN_BATTLE_AXE;
    public static EnderDragonBattleAxe ENDER_DRAGON_BATTLE_AXE;
    /**
     * Bows
     */
    public static CoalBow COAL_BOW;
    public static LapisBow LAPIS_BOW;
    public static RedstoneBow REDSTONE_BOW;
    public static EmeraldBow EMERALD_BOW;
    public static ObsidianBow OBSIDIAN_BOW;
    public static LavaBow LAVA_BOW;
    public static SuperStarBow SUPER_STAR_BOW;
    public static GuardianBow GUARDIAN_BOW;
    public static EnderDragonBow ENDER_DRAGON_BOW;

    public static void init() {
        /** Swords */
        COAL_SWORD = new CoalSword(SWORD_COAL_MATERIAL);
        LAPIS_SWORD = new LapisSword(SWORD_LAPIS_MATERIAL);
        REDSTONE_SWORD = new RedstoneSword(SWORD_REDSTONE_MATERIAL);
        EMERALD_SWORD = new EmeraldSword(SWORD_EMERALD_MATERIAL);
        OBSIDIAN_SWORD = new ObsidianSword(SWORD_OBSIDIAN_MATERIAL);
        LAVA_SWORD = new LavaSword(SWORD_LAVA_MATERIAL);
        SUPER_STAR_SWORD = new SuperStarSword(SWORD_SUPER_STAR_MATERIAL);
        GUARDIAN_SWORD = new GuardianSword(SWORD_GUARDIAN_MATERIAL);
        ENDER_DRAGON_SWORD = new EnderDragonSword(SWORD_ENDER_DRAGON_MATERIAL);
        /** BattleAxes */
        COAL_BATTLE_AXE = new CoalBattleAxe(BATTLE_AXE_COAL_MATERIAL);
        LAPIS_BATTLE_AXE = new LapisBattleAxe(BATTLE_AXE_LAPIS_MATERIAL);
        REDSTONE_BATTLE_AXE = new RedstoneBattleAxe(BATTLE_AXE_REDSTONE_MATERIAL);
        EMERALD_BATTLE_AXE = new EmeraldBattleAxe(BATTLE_AXE_EMERALD_MATERIAL);
        OBSIDIAN_BATTLE_AXE = new ObsidianBattleAxe(BATTLE_AXE_OBSIDIAN_MATERIAL);
        LAVA_BATTLE_AXE = new LavaBattleAxe(BATTLE_AXE_LAVA_MATERIAL);
        SUPER_STAR_BATTLE_AXE = new SuperStarBattleAxe(BATTLE_AXE_SUPER_STAR_MATERIAL);
        GUARDIAN_BATTLE_AXE = new GuardianBattleAxe(BATTLE_AXE_GUARDIAN_MATERIAL);
        ENDER_DRAGON_BATTLE_AXE = new EnderDragonBattleAxe(BATTLE_AXE_ENDER_DRAGON_MATERIAL);
        /** Bows */
        COAL_BOW = new CoalBow();
        LAPIS_BOW = new LapisBow();
        REDSTONE_BOW = new RedstoneBow();
        EMERALD_BOW = new EmeraldBow();
        OBSIDIAN_BOW = new ObsidianBow();
        LAVA_BOW = new LavaBow();
        SUPER_STAR_BOW = new SuperStarBow();
        GUARDIAN_BOW = new GuardianBow();
        ENDER_DRAGON_BOW = new EnderDragonBow();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        /** Swords */
        COAL_SWORD.initModel();
        LAPIS_SWORD.initModel();
        REDSTONE_SWORD.initModel();
        EMERALD_SWORD.initModel();
        OBSIDIAN_SWORD.initModel();
        LAVA_SWORD.initModel();
        SUPER_STAR_SWORD.initModel();
        GUARDIAN_SWORD.initModel();
        ENDER_DRAGON_SWORD.initModel();
        /** BattleAxes */
        COAL_BATTLE_AXE.initModel();
        LAPIS_BATTLE_AXE.initModel();
        REDSTONE_BATTLE_AXE.initModel();
        EMERALD_BATTLE_AXE.initModel();
        OBSIDIAN_BATTLE_AXE.initModel();
        LAVA_BATTLE_AXE.initModel();
        SUPER_STAR_BATTLE_AXE.initModel();
        GUARDIAN_BATTLE_AXE.initModel();
        ENDER_DRAGON_BATTLE_AXE.initModel();
        /** Bows */
        COAL_BOW.initModel();
        LAPIS_BOW.initModel();
        REDSTONE_BOW.initModel();
        EMERALD_BOW.initModel();
        OBSIDIAN_BOW.initModel();
        LAVA_BOW.initModel();
        SUPER_STAR_BOW.initModel();
        GUARDIAN_BOW.initModel();
        ENDER_DRAGON_BOW.initModel();
    }
}
