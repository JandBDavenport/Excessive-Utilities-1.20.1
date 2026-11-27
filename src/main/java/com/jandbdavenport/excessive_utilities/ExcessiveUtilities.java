package com.jandbdavenport.excessive_utilities;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(ExcessiveUtilities.MOD_ID)
public class ExcessiveUtilities {

    public static final String MOD_ID = "excessive_utilities";
    private static final Logger LOGGER = LoggerFactory.getLogger(ExcessiveUtilities.class);

    public ExcessiveUtilities(FMLJavaModLoadingContext context) {
        LOGGER.info("Excessive Utilities loaded");
		ModBlocks.BLOCKS.register(context.getModEventBus());
		ModItems.ITEMS.register(context.getModEventBus());
    }
}
