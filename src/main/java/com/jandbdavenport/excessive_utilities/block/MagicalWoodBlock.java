package com.jandbdavenport.excessive_utilities.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;

public class MagicalWoodBlock extends Block {
	public MagicalWoodBlock() {
		super(BlockBehaviour.Properties.of().strength(0.6f).sound(SoundType.STONE));
	}

	@Override
	public float getEnchantPowerBonus(BlockState state, LevelReader level, BlockPos pos) {
		return 2.5f;
	}
}
