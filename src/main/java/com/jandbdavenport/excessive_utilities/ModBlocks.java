package com.jandbdavenport.excessive_utilities;

import com.jandbdavenport.excessive_utilities.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, ExcessiveUtilities.MOD_ID);

	public static final RegistryObject<Block> MAGICAL_WOOD =
		BLOCKS.register("magical_wood", MagicalWoodBlock::new);

	public static final RegistryObject<Block> ENDER_CORE =
			BLOCKS.register("ender_core", EnderCoreBlock::new);

	public static final RegistryObject<Block> ENDER_INFUSED_OBSIDIAN =
		BLOCKS.register("ender_infused_obsidian", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
}