package sokratis12GR.WeaponsPlus.resources;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;
    /**
     * Recipes
     */
    public static boolean enableSwordsRecipes;
    public static boolean enableBattleAxesRecipes;
    public static boolean enableBowsRecipes;


    public static void init(File file) {
        config = new Configuration(file);

        syncConfig();
    }

    public static void syncConfig() {
        String category;
        category = "Recipes".toLowerCase();
        enableSwordsRecipes = config.getBoolean("enableSwordsRecipes", category, true,
                "Enable/Disable The WeaponsPlus Sword's Recipes");
        enableBattleAxesRecipes = config.getBoolean("enableBattleAxesRecipes", category, true,
                "Enable/Disable The WeaponsPlus Battle Axes's Recipes");
        enableBowsRecipes = config.getBoolean("enableBowsRecipes", category, true,
                "Enable/Disable The WeaponsPlus Bows's Recipes");

        if (config.hasChanged())
            config.save();
    }
}
