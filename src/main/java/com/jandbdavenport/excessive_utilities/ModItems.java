package com.jandbdavenport.excessive_utilities;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, ExcessiveUtilities.MOD_ID);

public static final RegistryObject<Item> MAGICAL_WOOD_ITEM =
			ITEMS.register("magical_wood", () -> new BlockItem(ModBlocks.MAGICAL_WOOD.get(), new Item.Properties()));
}
