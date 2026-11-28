package com.jandbdavenport.excessive_utilities.item;

import com.jandbdavenport.excessive_utilities.ModBlocks;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import java.util.List;


public class EnderCoreBlockItem extends BlockItem {
	public EnderCoreBlockItem(Item.Properties properties) {
		super(ModBlocks.ENDER_CORE.get(), properties);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(Component.translatable("tooltip.excessive_utilities.ender_core_1").withStyle(ChatFormatting.GRAY));
		tooltip.add(Component.translatable("tooltip.excessive_utilities.ender_core_2").withStyle(ChatFormatting.GRAY));
	}
}
