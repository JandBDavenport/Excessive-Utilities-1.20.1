package com.jandbdavenport.excessive_utilities;

import com.jandbdavenport.excessive_utilities.item.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BlockItem;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, ExcessiveUtilities.MOD_ID);

public static final RegistryObject<Item> MAGICAL_WOOD_ITEM =
			ITEMS.register("magical_wood", () -> new MagicalWoodBlockItem(new Item.Properties()));

public static final RegistryObject<Item> ENDER_INFUSED_OBSIDIAN_ITEM =
			ITEMS.register("ender_infused_obsidian", () -> new BlockItem(ModBlocks.ENDER_INFUSED_OBSIDIAN.get(), new Item.Properties()));
}
