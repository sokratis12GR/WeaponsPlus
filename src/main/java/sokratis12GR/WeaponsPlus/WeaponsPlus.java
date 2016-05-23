package sokratis12GR.WeaponsPlus;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sokratis12GR.WeaponsPlus.client.gui.CreativeTabWeaponsPlus;
import sokratis12GR.WeaponsPlus.command.CommandWeaponsPlus;
import sokratis12GR.WeaponsPlus.registry.ModItems;
import sokratis12GR.WeaponsPlus.resources.GlobalEventsWeaponsPlus;
import sokratis12GR.WeaponsPlus.util.TextHelper;

import java.io.File;

@Mod(modid = WeaponsPlus.MODID, name = WeaponsPlus.MODNAME, version = WeaponsPlus.VERSION /**, dependencies = "required-after:ArmorPlus@[1.14.0-1.9.4,)" */, guiFactory = WeaponsPlus.GUIFACTORY, updateJSON = "https://raw.githubusercontent.com/sokratis12GR/VersionUpdate/gh-pages/WeaponsPlus.json")
public class WeaponsPlus {
    public static final String MODID = "weaponsplus";
    public static final String VERSION = "1.2.1";
    public static final String MODNAME = "WeaponsPlus";
    public static final String CLIENTPROXY = "sokratis12GR.WeaponsPlus.ClientProxy";
    public static final String COMMONPROXY = "sokratis12GR.WeaponsPlus.CommonProxy";
    public static final String GUIFACTORY = "sokratis12GR.WeaponsPlus.client.gui.ConfigGuiFactory";

    @SidedProxy(clientSide = WeaponsPlus.CLIENTPROXY, serverSide = WeaponsPlus.COMMONPROXY)
    public static CommonProxy proxy;

    public static CreativeTabs TAB_WEAPONSPLUS = new CreativeTabWeaponsPlus(WeaponsPlus.MODID + ".creativeTab");
    public static Logger logger = LogManager.getLogger(WeaponsPlus.MODNAME);
    public GuiHandler GuiHandler = new GuiHandler();

    @Mod.Instance(MODID)
    public static WeaponsPlus instance;
    public static File configDir;

    public static File getConfigDir() {
        return configDir;
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info(TextHelper.localize("info." + WeaponsPlus.MODID + ".console.load.init"));
        NetworkRegistry.INSTANCE.registerGuiHandler(this, GuiHandler);
        MinecraftForge.EVENT_BUS.register(new GlobalEventsWeaponsPlus());

    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger.info(TextHelper.localize("info." + WeaponsPlus.MODID + ".console.load.preInit"));
        ModItems.init();
        configDir = new File(event.getModConfigurationDirectory() + "/" + WeaponsPlus.MODID);
        configDir.mkdirs();
        sokratis12GR.WeaponsPlus.util.Logger.init(new File(configDir.getPath()));
        proxy.registerRenderers(this);
        /** Recipes */

        /** Shaped */

        /** Swords */
        GameRegistry.addRecipe(new ItemStack(ModItems.COAL_SWORD, 1), new Object[]
                {"XCX", "XCX", "XSX", Character.valueOf('C'), new ItemStack(Items.COAL, 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        GameRegistry.addRecipe(new ItemStack(ModItems.LAPIS_SWORD, 1), new Object[]
                {"XLX", "XLX", "XSX", Character.valueOf('L'), new ItemStack(Blocks.LAPIS_BLOCK, 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        GameRegistry.addRecipe(new ItemStack(ModItems.REDSTONE_SWORD, 1), new Object[]
                {"XRX", "XRX", "XSX", Character.valueOf('R'), new ItemStack(Blocks.REDSTONE_BLOCK, 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_SWORD, 1), new Object[]
                {"XEX", "XEX", "XSX", Character.valueOf('E'), new ItemStack(Items.EMERALD, 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_SWORD, 1), new Object[]
                {"XOX", "XOX", "XSX", Character.valueOf('O'), new ItemStack(Blocks.OBSIDIAN, 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        GameRegistry.addRecipe(new ItemStack(ModItems.GUARDIAN_SWORD, 1), new Object[]
                {"XPX", "XPX", "XSX", Character.valueOf('P'), new ItemStack(Items.PRISMARINE_SHARD, 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        GameRegistry.addRecipe(new ItemStack(ModItems.ENDER_DRAGON_SWORD, 1), new Object[]
                {"XEX", "XEX", "XSX", Character.valueOf('E'), new ItemStack(Item.getByNameOrId("armorplus:EnderDragonScale"), 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        /** Battle Axes */
        GameRegistry.addRecipe(new ItemStack(ModItems.COAL_BATTLE_AXE, 1), new Object[]
                {"CXC", "CSC", "XSX", Character.valueOf('C'), new ItemStack(Items.COAL, 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        GameRegistry.addRecipe(new ItemStack(ModItems.LAPIS_BATTLE_AXE, 1), new Object[]
                {"LXL", "LSL", "XSX", Character.valueOf('L'), new ItemStack(Blocks.LAPIS_BLOCK, 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        GameRegistry.addRecipe(new ItemStack(ModItems.REDSTONE_BATTLE_AXE, 1), new Object[]
                {"RXR", "RSR", "XSX", Character.valueOf('R'), new ItemStack(Blocks.REDSTONE_BLOCK, 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_BATTLE_AXE, 1), new Object[]
                {"EXE", "ESE", "XSX", Character.valueOf('E'), new ItemStack(Items.EMERALD, 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        GameRegistry.addRecipe(new ItemStack(ModItems.OBSIDIAN_BATTLE_AXE, 1), new Object[]
                {"OXO", "OSO", "XSX", Character.valueOf('O'), new ItemStack(Blocks.OBSIDIAN, 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        GameRegistry.addRecipe(new ItemStack(ModItems.GUARDIAN_BATTLE_AXE, 1), new Object[]
                {"PXP", "PSP", "XSX", Character.valueOf('P'), new ItemStack(Items.PRISMARINE_SHARD, 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});
        GameRegistry.addRecipe(new ItemStack(ModItems.ENDER_DRAGON_BATTLE_AXE, 1), new Object[]
                {"EXE", "ESE", "XSX", Character.valueOf('E'), new ItemStack(Item.getByNameOrId("armorplus:EnderDragonScale"), 1), Character.valueOf('S'), new ItemStack(Items.STICK, 1),});

        /** Shapeless */

        /** Swords */
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LAVA_SWORD, 1), new Object[]
                {new ItemStack(ModItems.OBSIDIAN_SWORD, 1), new ItemStack(Items.LAVA_BUCKET, 1), new ItemStack(ModItems.OBSIDIAN_SWORD, 1),});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SUPER_STAR_SWORD, 1), new Object[]
                {new ItemStack(ModItems.OBSIDIAN_SWORD, 1), new ItemStack(Items.NETHER_STAR, 1), new ItemStack(ModItems.OBSIDIAN_SWORD, 1),});
        /** Battle Axes */
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LAVA_BATTLE_AXE, 1), new Object[]
                {new ItemStack(ModItems.OBSIDIAN_BATTLE_AXE, 1), new ItemStack(Items.LAVA_BUCKET, 1), new ItemStack(ModItems.OBSIDIAN_BATTLE_AXE, 1),});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SUPER_STAR_BATTLE_AXE, 1), new Object[]
                {new ItemStack(ModItems.OBSIDIAN_BATTLE_AXE, 1), new ItemStack(Items.NETHER_STAR, 1), new ItemStack(ModItems.OBSIDIAN_BATTLE_AXE, 1),});
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info(TextHelper.localize("info." + WeaponsPlus.MODID + ".console.load.postInit"));
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandWeaponsPlus());
    }

    public static class GuiHandler implements IGuiHandler {
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            return null;
        }

        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
            return null;
        }
    }
}
