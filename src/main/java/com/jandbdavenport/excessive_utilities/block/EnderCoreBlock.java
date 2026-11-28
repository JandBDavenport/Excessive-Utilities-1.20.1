package com.jandbdavenport.excessive_utilities.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class EnderCoreBlock extends Block {
	public EnderCoreBlock() {
		super(BlockBehaviour.Properties.of().strength(0.6f).sound(SoundType.STONE).requiresCorrectToolForDrops());
	}

	@Override
	public float getEnchantPowerBonus(BlockState state, LevelReader level, BlockPos pos) {
		return 5f;
	}
}
