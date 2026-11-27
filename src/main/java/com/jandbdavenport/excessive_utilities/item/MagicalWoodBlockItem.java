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


public class MagicalWoodBlockItem extends BlockItem {
	public MagicalWoodBlockItem(Item.Properties properties) {
    	super(ModBlocks.MAGICAL_WOOD.get(), properties);
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(Component.translatable("tooltip.excessive_utilities.magical_wood_1").withStyle(ChatFormatting.GRAY));
		tooltip.add(Component.translatable("tooltip.excessive_utilities.magical_wood_2").withStyle(ChatFormatting.GRAY));
	}
}
