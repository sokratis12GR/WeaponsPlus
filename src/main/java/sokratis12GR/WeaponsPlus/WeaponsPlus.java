package sokratis12GR.WeaponsPlus;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sokratis12GR.WeaponsPlus.client.gui.CreativeTabWeaponsPlus;
import sokratis12GR.WeaponsPlus.command.CommandWeaponsPlus;
import sokratis12GR.WeaponsPlus.registry.ModItems;
import sokratis12GR.WeaponsPlus.registry.ModRecipes;
import sokratis12GR.WeaponsPlus.resources.ConfigHandler;
import sokratis12GR.WeaponsPlus.resources.GlobalEventsWeaponsPlus;
import sokratis12GR.WeaponsPlus.util.TextHelper;

import java.io.File;

@Mod(modid = WeaponsPlus.MODID, name = WeaponsPlus.MODNAME, version = WeaponsPlus.VERSION, acceptedMinecraftVersions = "[1.9.4, 1.10]", dependencies = "required-after:armorplus@[1.9.4-3.1.5.2,)", guiFactory = WeaponsPlus.GUIFACTORY, updateJSON = "https://raw.githubusercontent.com/sokratis12GR/VersionUpdate/gh-pages/WeaponsPlus.json")
public class WeaponsPlus {
    public static final String MODID = "weaponsplus";
    public static final String VERSION = "1.9.4-2.0.0.0";
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
        ModRecipes.init();
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger.info(TextHelper.localize("info." + WeaponsPlus.MODID + ".console.load.preInit"));
        ModItems.init();
        configDir = new File(event.getModConfigurationDirectory() + "/" + "sokratis12GR's Mods" + "/" + WeaponsPlus.MODID);
        configDir.mkdirs();
        sokratis12GR.WeaponsPlus.util.Logger.init(new File(configDir.getPath()));
        ConfigHandler.init(new File(configDir.getPath(), WeaponsPlus.MODID + ".cfg"));
        proxy.registerRenderers(this);
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
