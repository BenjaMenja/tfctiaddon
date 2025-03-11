package com.benjamenja.tfctiaddon.handlers;

import com.benjamenja.tfctiaddon.TFCTIAddon;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static Configuration configuration;
    public static String BlockID = "minecraft:dirt";
    public static int BlockMetaValue = 0;

    public static void initialize(String configDir) {
        if (configuration == null) {
            File path = new File(configDir + "/" + TFCTIAddon.MODID + ".cfg");
            configuration = new Configuration(path);
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        BlockID = configuration.getString("Dragon Summoner Block", Configuration.CATEGORY_GENERAL, "minecraft:dirt", "The Block ID to use the Dragon Summoner item on.");
        BlockMetaValue = configuration.getInt("Dragon Summoner Block Meta", Configuration.CATEGORY_GENERAL, 0, -1, Integer.MAX_VALUE, "The block's damage value. Used in conjunction with the block ID to specify what block to use the Dragon Summoner on.\nNote: The special value -1 denotes ANY damage value.");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(TFCTIAddon.MODID)) {
            loadConfiguration();
        }
    }

    public static Configuration getConfiguration() {
        return configuration;
    }
}
