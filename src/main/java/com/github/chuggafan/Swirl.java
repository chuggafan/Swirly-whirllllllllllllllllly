package com.github.chuggafan;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = Swirl.MODID, version = Swirl.VERSION)
public class Swirl
{
    public static final String MODID = "Swirl";
    public static final String VERSION = "1.0";
    public static CreativeTabs tab = new CreativeTabs("Swirl") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return new net.minecraft.item.ItemEgg();
        }
    };
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        config.save();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code

    }
}
