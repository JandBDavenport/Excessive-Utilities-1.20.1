package com.jandbdavenport.excessive_utilities;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> TABS =
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExcessiveUtilities.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB =
		TABS.register("creative_tab", () -> CreativeModeTab.builder()
				.title(Component.translatable("itemGroup.excessive_utilities"))
				.icon(() -> new ItemStack(ModItems.MAGICAL_WOOD_ITEM.get()))
				.displayItems((parameters, output) -> {
					for (RegistryObject<Item> entry : ModItems.ITEMS.getEntries()) {
						output.accept(entry.get());
					}
				})
				.build());
}
