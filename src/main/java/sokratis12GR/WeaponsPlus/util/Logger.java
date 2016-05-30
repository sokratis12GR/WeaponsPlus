package sokratis12GR.WeaponsPlus.util;

import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import sokratis12GR.WeaponsPlus.WeaponsPlus;
import sokratis12GR.WeaponsPlus.registry.ModItems;

import java.io.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Socrates on 4/23/2016.
 */
public class Logger {

    public static Configuration Logger;

    public static void init(File file) {
        syncConfig();
    }

    public static void syncConfig() {
        String FileName = "WeaponsPlus";
        String FileName2 = "Weapons";
        String FormatTXT = ".txt";
        String FormatJSON = ".json";
        String FormatHTML = ".html";
        String FormatMD = ".md";

        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("config" + "/" + "sokratis12GR's Mods" + "/" + WeaponsPlus.MODID + "/" + FileName + FormatHTML), "utf-8"));
            writer.write("<html>" + "<head><title>ArmorPlus</title></head>" + "<body><div style=\"background-color:#1A1A1A\">");
            writer.write("<h2 style=\"color:#DEDEDE;text-align:center\">" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "</h2>");
            writer.write("<h2 style=\"color:#DEDEDE;text-align:center\"><u>" + WeaponsPlus.MODNAME + "</u></h2>");
            writer.write("<p style=\"color:#DEDEDE;text-align:center\"><strong>" + "WeaponsPlus Version: " + WeaponsPlus.VERSION + "</strong></p>");
            writer.write("<p style=\"color:#DEDEDE;text-align:center\"><strong>" + "modid: " + WeaponsPlus.MODID + "</strong></p>");
            writer.write("<p style=\"color:#DEDEDE;text-align:center\"><strong>" + "Minecraft Version: " + MinecraftForge.MC_VERSION + "</strong></p>");
            writer.write("<p style=\"color:#DEDEDE;text-align:center\"><strong>" + "by " + "<a href=\"http://minecraft.curseforge.com/members/sokratis12GR\" style=\"color:#AA0000;text-decoration:none\">sokratis12GR</a></strong></p>");
            writer.write("<p style=\"color:#DEDEDE;text-align:center\"><strong>" + "Mod&#39;s Page: " + "<a href=\"http://minecraft.curseforge.com/projects/waeponsplus\" style=\"color:#AA0000;text-decoration:none\">WeaponsPlus</a></strong></p>\n");
            writer.write("<h2 style=\"color:#DEDEDE;text-align:center\">" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "</h2>");
            writer.write("</div></body>" + "</html>");
        } catch (IOException ex) {
            // report
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {/*ignore*/}
        }

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("config" + "/" + "sokratis12GR's Mods" + "/" + WeaponsPlus.MODID + "/" + FileName + FormatTXT), "utf-8"));
            writer.write("[ " + "( " + "WeaponsPlus" + " )" + " | " + "Don't Modify Or Delete These Files: " + FileName + FormatTXT + ", " + FileName + FormatHTML + " | " + "For More Information Click: " + FileName + FormatHTML + " ]");
        } catch (IOException ex) {
            // report
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {/*ignore*/}
        }
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("config" + "/" + "sokratis12GR's Mods" + "/" + WeaponsPlus.MODID + "/" + FileName2 + FormatTXT), "utf-8"));
            writer.write("Minecraft Version: " + MinecraftForge.MC_VERSION);
            writer.write("\n\n1. Coal Weapons: " + ModItems.COAL_SWORD.getRegistryName() + " , " + ModItems.COAL_BATTLE_AXE.getRegistryName() + " , " + ModItems.COAL_BOW.getRegistryName());
            writer.write("\n\n2. Lapis Weapons: " + ModItems.LAPIS_SWORD.getRegistryName() + " , " + ModItems.LAPIS_BATTLE_AXE.getRegistryName() + " , " + ModItems.LAPIS_BOW.getRegistryName());
            writer.write("\n\n3. Redstone Weapons: " + ModItems.REDSTONE_SWORD.getRegistryName() + " , " + ModItems.REDSTONE_BATTLE_AXE.getRegistryName() + " , " + ModItems.REDSTONE_BOW.getRegistryName());
            writer.write("\n\n4. Emerald Weapons: " + ModItems.EMERALD_SWORD.getRegistryName() + " , " + ModItems.EMERALD_BATTLE_AXE.getRegistryName() + " , " + ModItems.EMERALD_BOW.getRegistryName());
            writer.write("\n\n5. Obsidian Weapons: " + ModItems.OBSIDIAN_SWORD.getRegistryName() + " , " + ModItems.OBSIDIAN_BATTLE_AXE.getRegistryName() + " , " + ModItems.OBSIDIAN_BOW.getRegistryName());
            writer.write("\n\n6. Lava Weapons: " + ModItems.LAVA_SWORD.getRegistryName() + " , " + ModItems.LAVA_BATTLE_AXE.getRegistryName() + " , " + ModItems.LAVA_BOW.getRegistryName());
            writer.write("\n\n7. Super Star Weapons: " + ModItems.SUPER_STAR_SWORD.getRegistryName() + " , " + ModItems.SUPER_STAR_BATTLE_AXE.getRegistryName() + " , " + ModItems.SUPER_STAR_BOW.getRegistryName());
            writer.write("\n\n8. Guardian Weapons: " + ModItems.GUARDIAN_SWORD.getRegistryName() + " , " + ModItems.GUARDIAN_BATTLE_AXE.getRegistryName() + " , " + ModItems.GUARDIAN_BOW.getRegistryName());
            writer.write("\n\n9. Ender Dragon Weapons: " + ModItems.ENDER_DRAGON_SWORD.getRegistryName() + " , " + ModItems.ENDER_DRAGON_BATTLE_AXE.getRegistryName() + " , " + ModItems.ENDER_DRAGON_BOW.getRegistryName());
        } catch (IOException ex) {
            // report
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {/*ignore*/}
        }

    }
}
