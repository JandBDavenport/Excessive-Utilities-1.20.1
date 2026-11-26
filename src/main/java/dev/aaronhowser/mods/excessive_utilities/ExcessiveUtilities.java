package dev.aaronhowser.mods.excessive_utilities;

import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(ExcessiveUtilities.MOD_ID)
public class ExcessiveUtilities {

    public static final String MOD_ID = "excessive_utilities";
    private static final Logger LOGGER = LoggerFactory.getLogger(ExcessiveUtilities.class);

    public ExcessiveUtilities() {
        LOGGER.info("Excessive Utilities 1.20.1 port loaded");
    }
}
