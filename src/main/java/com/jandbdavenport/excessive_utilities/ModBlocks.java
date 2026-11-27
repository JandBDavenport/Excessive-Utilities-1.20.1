package com.jandbdavenport.excessive_utilities;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, ExcessiveUtilities.MOD_ID);

public static final RegistryObject<Block> MAGICAL_WOOD =
		BLOCKS.register("magical_wood", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
}