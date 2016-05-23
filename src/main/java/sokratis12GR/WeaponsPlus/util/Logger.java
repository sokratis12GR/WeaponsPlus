package sokratis12GR.WeaponsPlus.util;

import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

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
        String FileName = "Helper";
        String FormatTXT = ".txt";
        String FormatJSON = ".json";
        String FormatHTML = ".html";
        String FormatMD = ".md";

        Writer writer = null;

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(FileName + FormatTXT), "utf-8"));
            writer.write(dateFormat.format(cal.getTime()));
            writer.write("\n\nMinecraft Version: " + MinecraftForge.MC_VERSION);
            writer.write("\n\nTHIS IS STILL WIP MOD" + "\n\nMORE FEATURES ARE COMING SOON");
            writer.write("\n\nForge Version: " + ForgeVersion.buildVersion);
        } catch (IOException ex) {
            // report
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {/*ignore*/}
        }

    }
}
