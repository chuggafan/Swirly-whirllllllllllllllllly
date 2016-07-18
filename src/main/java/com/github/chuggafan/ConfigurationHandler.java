package com.github.chuggafan;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static Configuration config;
    public static void init(File file)
    {
        config = new Configuration(file);
        try
        {
            config.load();

        }
        catch(Exception e) {
            FMLLog.severe("Could not load configuration file");
        }
        finally
        {
            config.save();
        }
    }
}
