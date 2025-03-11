package com.benjamenja.tfctiaddon;

import com.benjamenja.tfctiaddon.fluids.ModFluids;
import com.benjamenja.tfctiaddon.handlers.ConfigurationHandler;
import com.benjamenja.tfctiaddon.items.ModItems;
import com.benjamenja.tfctiaddon.recipes.ModRecipes;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = TFCTIAddon.MODID, version = TFCTIAddon.VERSION, dependencies = "required-after:terrafirmacraftplus;"+" required-after:tfcm")
public class TFCTIAddon
{
    public static final String MODID = "tfctiaddon";
    public static final String VERSION = "1.0";
    public static final Logger LOG = LogManager.getLogger("Compat");

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        String configDir = event.getModConfigurationDirectory().toString();
        ConfigurationHandler.initialize(configDir);
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        LOG.info("Pre-Initialization Complete");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
        ModFluids.initialize();
        ModItems.initialize();
        ModRecipes.initialize();
        LOG.info("Initialization Complete");
    }
}
