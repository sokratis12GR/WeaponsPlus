package sokratis12GR.WeaponsPlus.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import sokratis12GR.WeaponsPlus.WeaponsPlus;
import sokratis12GR.WeaponsPlus.util.TextHelper;

import java.util.ArrayList;
import java.util.List;

public class ConfigGui extends GuiConfig {
    public ConfigGui(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(parentScreen), WeaponsPlus.MODID, false, true,
                TextHelper.localize("gui." + WeaponsPlus.MODID + ".config.title"));
    }

    private static List<IConfigElement> getConfigElements(GuiScreen parent) {
        List<IConfigElement> list = new ArrayList<IConfigElement>();

        /** adds sections declared in ConfigHandler. toLowerCase() is used because the configuration class automatically does this, so must we. */
        return list;
    }
}