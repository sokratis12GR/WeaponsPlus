package sokratis12GR.WeaponsPlus.registry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import sokratis12GR.WeaponsPlus.resources.ConfigHandler;

/**
 * sokratis12GR.ArmorPlus.registry
 * ArmorPlus created by sokratis12GR on 6/20/2016 6:44 PM.
 */
public class ModRecipes
{
    public static void init()
    {
        addEasyModeRecipes();
        addExpertModeRecipes();
    }

    public static void addEasyModeRecipes() {
        if (ConfigHandler.enableSwordsRecipes && ConfigHandler.easyMode) {
            GameRegistry.addRecipe(new ItemStack(ModItems.COAL_SWORD, 1), "XCX", "XCX", "XSX", 'C', new ItemStack(Items.COAL, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAPIS_SWORD, 1), "XLX", "XLX", "XSX", 'L', new ItemStack(Items.DYE, 1, 4), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.REDSTONE_SWORD, 1), "XRX", "XRX", "XSX", 'R', new ItemStack(Items.REDSTONE, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_SWORD, 1), "XEX", "XEX", "XSX", 'E', new ItemStack(Items.EMERALD, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_SWORD, 1), "XOX", "XOX", "XSX", 'O', new ItemStack(Blocks.OBSIDIAN, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.GUARDIAN_SWORD, 1), "XGX", "XGX", "XSX", 'G', new ItemStack(Item.getByNameOrId("armorplus:GuardianScale"), 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.ENDER_DRAGON_SWORD, 1), "XEX", "XEX", "XSX", 'E', new ItemStack(Item.getByNameOrId("armorplus:EnderDragonScale"), 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.SUPER_STAR_SWORD, 1), "XWX", "XWX", "XSX", 'W', new ItemStack(Item.getByNameOrId("armorplus:WitherBone"), 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAVA_SWORD, 1), "XLX", "XLX", "XSX", 'L', new ItemStack(Item.getByNameOrId("armorplus:LavaCrystal"), 1), 'S', new ItemStack(Items.STICK, 1));
        }
        if (ConfigHandler.enableBattleAxesRecipes && ConfigHandler.easyMode) {
            GameRegistry.addRecipe(new ItemStack(ModItems.COAL_BATTLE_AXE, 1), "CXC", "CSC", "XSX", 'C', new ItemStack(Items.COAL, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAPIS_BATTLE_AXE, 1), "LXL", "LSL", "XSX", 'L', new ItemStack(Items.DYE, 1, 4), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.REDSTONE_BATTLE_AXE, 1), "RXR", "RSR", "XSX", 'R', new ItemStack(Items.REDSTONE, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_BATTLE_AXE, 1), "EXE", "ESE", "XSX", 'E', new ItemStack(Items.EMERALD, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_BATTLE_AXE, 1), "OXO", "OSO", "XSX", 'O', new ItemStack(Blocks.OBSIDIAN, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.GUARDIAN_BATTLE_AXE, 1), "GXG", "GSG", "XSX", 'G', new ItemStack(Item.getByNameOrId("armorplus:GuardianScale"), 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.ENDER_DRAGON_BATTLE_AXE, 1), "EXE", "ESE", "XSX", 'E', new ItemStack(Item.getByNameOrId("armorplus:EnderDragonScale"), 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.SUPER_STAR_BATTLE_AXE, 1), "WXW", "WSW", "XSX", 'W', new ItemStack(Item.getByNameOrId("armorplus:WitherBone"), 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LAVA_BATTLE_AXE, 1), new ItemStack(ModItems.OBSIDIAN_BATTLE_AXE, 1), new ItemStack(Items.LAVA_BUCKET, 1), new ItemStack(ModItems.OBSIDIAN_BATTLE_AXE, 1));
        }
        if (ConfigHandler.enableBowsRecipes && ConfigHandler.easyMode) {
            GameRegistry.addRecipe(new ItemStack(ModItems.COAL_BOW, 1), "XCS", "CXS", "XCS", 'C', new ItemStack(Items.COAL, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.COAL_BOW, 1), "SCX", "SXC", "SCX", 'C', new ItemStack(Items.COAL, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAPIS_BOW, 1), "XLS", "LXS", "XLS", 'L', new ItemStack(Items.DYE, 1, 4), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAPIS_BOW, 1), "SLX", "SXL", "SLX", 'L', new ItemStack(Items.DYE, 1, 4), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.REDSTONE_BOW, 1), "XRS", "RXS", "XRS", 'R', new ItemStack(Items.REDSTONE, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.REDSTONE_BOW, 1), "SRX", "SXR", "SRX", 'R', new ItemStack(Items.REDSTONE, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_BOW, 1), "XES", "EXS", "XES", 'E', new ItemStack(Items.EMERALD, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_BOW, 1), "SEX", "SXE", "SEX", 'E', new ItemStack(Items.EMERALD, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_BOW, 1), "XOS", "OXS", "XOS", 'O', new ItemStack(Blocks.OBSIDIAN, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_BOW, 1), "SOX", "SXO", "SOX", 'O', new ItemStack(Blocks.OBSIDIAN, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.GUARDIAN_BOW, 1), "XGS", "GXS", "XGS", 'G', new ItemStack(Item.getByNameOrId("armorplus:GuardianScale"), 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.GUARDIAN_BOW, 1), "SGX", "SXG", "SGX", 'G', new ItemStack(Item.getByNameOrId("armorplus:GuardianScale"), 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.ENDER_DRAGON_BOW, 1), "XES", "EXS", "XES", 'E', new ItemStack(Item.getByNameOrId("armorplus:EnderDragonScale"), 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.ENDER_DRAGON_BOW, 1), "SEX", "SXE", "SEX", 'E', new ItemStack(Item.getByNameOrId("armorplus:EnderDragonScale"), 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.SUPER_STAR_BOW, 1), "XWS", "WXS", "XWS", 'W', new ItemStack(Item.getByNameOrId("armorplus:WitherBone"), 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.SUPER_STAR_BOW, 1), "SWX", "SXW", "SWX", 'W', new ItemStack(Item.getByNameOrId("armorplus:WitherBone"), 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAVA_BOW, 1), "SLX", "SXL", "SLX", 'L', new ItemStack(Item.getByNameOrId("armorplus:LavaCrystal"), 1), 'S', new ItemStack(Items.STRING, 1));

        }
    }

    public static void addExpertModeRecipes() {
        if (ConfigHandler.enableSwordsRecipes && ConfigHandler.expertMode) {
            GameRegistry.addRecipe(new ItemStack(ModItems.COAL_SWORD, 1), "XCX", "XCX", "XSX", 'C', new ItemStack(Blocks.COAL_BLOCK, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAPIS_SWORD, 1), "XLX", "XLX", "XSX", 'L', new ItemStack(Blocks.LAPIS_BLOCK, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.REDSTONE_SWORD, 1), "XRX", "XRX", "XSX", 'R', new ItemStack(Blocks.REDSTONE_BLOCK, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_SWORD, 1), "XEX", "XEX", "XSX", 'E', new ItemStack(Blocks.EMERALD_BLOCK, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_SWORD, 1), "XOX", "XOX", "XSX", 'O', new ItemStack(Item.getByNameOrId("armorplus:CompressedObsidian"), 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.GUARDIAN_SWORD, 1), "XGX", "XGX", "XSX", 'G', new ItemStack(Item.getByNameOrId("armorplus:GuardianScale"), 1), 'S', new ItemStack(Items.PRISMARINE_SHARD, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.ENDER_DRAGON_SWORD, 1), "XEX", "XEX", "XSX", 'E', new ItemStack(Item.getByNameOrId("armorplus:EnderDragonScale"), 1), 'S', new ItemStack(Items.DRAGON_BREATH, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.SUPER_STAR_SWORD, 1), "XWX", "XWX", "XSX", 'W', new ItemStack(Item.getByNameOrId("armorplus:WitherBone"), 1), 'S', new ItemStack(Items.NETHER_STAR, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAVA_SWORD, 1), "XLX", "XLX", "XSX", 'L', new ItemStack(Item.getByNameOrId("armorplus:LavaCrystal"), 1), 'S', new ItemStack(Items.STICK, 1));
        }
        if (ConfigHandler.enableBattleAxesRecipes && ConfigHandler.expertMode) {
            GameRegistry.addRecipe(new ItemStack(ModItems.COAL_BATTLE_AXE, 1), "CXC", "CSC", "XSX", 'C', new ItemStack(Blocks.COAL_BLOCK, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAPIS_BATTLE_AXE, 1), "LXL", "LSL", "XSX", 'L', new ItemStack(Blocks.LAPIS_BLOCK, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.REDSTONE_BATTLE_AXE, 1), "RXR", "RSR", "XSX", 'R', new ItemStack(Blocks.REDSTONE_BLOCK, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_BATTLE_AXE, 1), "EXE", "ESE", "XSX", 'E', new ItemStack(Blocks.EMERALD_BLOCK, 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_BATTLE_AXE, 1), "OXO", "OSO", "XSX", 'O', new ItemStack(Item.getByNameOrId("armorplus:CompressedObsidian"), 1), 'S', new ItemStack(Items.STICK, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.GUARDIAN_BATTLE_AXE, 1), "GXG", "GSG", "XSX", 'G', new ItemStack(Item.getByNameOrId("armorplus:GuardianScale"), 1), 'S', new ItemStack(Items.PRISMARINE_SHARD, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.ENDER_DRAGON_BATTLE_AXE, 1), "EXE", "ESE", "XSX", 'E', new ItemStack(Item.getByNameOrId("armorplus:EnderDragonScale"), 1), 'S', new ItemStack(Items.DRAGON_BREATH, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.SUPER_STAR_BATTLE_AXE, 1), "WXW", "WSW", "XSX", 'W', new ItemStack(Item.getByNameOrId("armorplus:WitherBone"), 1), 'S', new ItemStack(Items.NETHER_STAR, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAVA_BATTLE_AXE, 1), "LXL", "LSL", "XSX", 'L', new ItemStack(Item.getByNameOrId("armorplus:LavaCrystal"), 1), 'S', new ItemStack(Items.STICK, 1));
        }
        if (ConfigHandler.enableBowsRecipes && ConfigHandler.expertMode) {
            GameRegistry.addRecipe(new ItemStack(ModItems.COAL_BOW, 1), "XCS", "CXS", "XCS", 'C', new ItemStack(Blocks.COAL_BLOCK, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.COAL_BOW, 1), "SCX", "SXC", "SCX", 'C', new ItemStack(Blocks.COAL_BLOCK, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAPIS_BOW, 1), "XLS", "LXS", "XLS", 'L', new ItemStack(Blocks.LAPIS_BLOCK, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAPIS_BOW, 1), "SLX", "SXL", "SLX", 'L', new ItemStack(Blocks.LAPIS_BLOCK, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.REDSTONE_BOW, 1), "XRS", "RXS", "XRS", 'R', new ItemStack(Blocks.REDSTONE_BLOCK, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.REDSTONE_BOW, 1), "SRX", "SXR", "SRX", 'R', new ItemStack(Blocks.REDSTONE_BLOCK, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_BOW, 1), "XES", "EXS", "XES", 'E', new ItemStack(Blocks.EMERALD_BLOCK, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_BOW, 1), "SEX", "SXE", "SEX", 'E', new ItemStack(Blocks.EMERALD_BLOCK, 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_BOW, 1), "XOS", "OXS", "XOS", 'O', new ItemStack(Item.getByNameOrId("armorplus:CompressedObsidian"), 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_BOW, 1), "SOX", "SXO", "SOX", 'O', new ItemStack(Item.getByNameOrId("armorplus:CompressedObsidian"), 1), 'S', new ItemStack(Items.STRING, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.GUARDIAN_BOW, 1), "XGS", "GXS", "XGS", 'G', new ItemStack(Item.getByNameOrId("armorplus:GuardianScale"), 1), 'S', new ItemStack(Items.PRISMARINE_SHARD, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.GUARDIAN_BOW, 1), "SGX", "SXG", "SGX", 'G', new ItemStack(Item.getByNameOrId("armorplus:GuardianScale"), 1), 'S', new ItemStack(Items.PRISMARINE_SHARD, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.ENDER_DRAGON_BOW, 1), "XES", "DXS", "XES", 'E', new ItemStack(Item.getByNameOrId("armorplus:EnderDragonScale"), 1), 'S', new ItemStack(Items.STRING, 1), 'D', new ItemStack(Items.DRAGON_BREATH, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.ENDER_DRAGON_BOW, 1), "SEX", "SXD", "SEX", 'E', new ItemStack(Item.getByNameOrId("armorplus:EnderDragonScale"), 1), 'S', new ItemStack(Items.STRING, 1), 'D', new ItemStack(Items.DRAGON_BREATH, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.SUPER_STAR_BOW, 1), "XWS", "NXS", "XWS", 'W', new ItemStack(Item.getByNameOrId("armorplus:WitherBone"), 1), 'S', new ItemStack(Items.STRING, 1), 'N', new ItemStack(Items.SKULL, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.SUPER_STAR_BOW, 1), "SWX", "SXN", "SWX", 'W', new ItemStack(Item.getByNameOrId("armorplus:WitherBone"), 1), 'S', new ItemStack(Items.STRING, 1), 'N', new ItemStack(Items.SKULL, 1, 1));
            GameRegistry.addRecipe(new ItemStack(ModItems.LAVA_BOW, 1), "SLX", "SXL", "SLX", 'L', new ItemStack(Item.getByNameOrId("armorplus:LavaCrystal"), 1), 'S', new ItemStack(Items.STRING, 1));
        }
    }
}
