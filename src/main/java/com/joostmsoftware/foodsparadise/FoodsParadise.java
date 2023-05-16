package com.joostmsoftware.foodsparadise;

import com.joostmsoftware.foodsparadise.items.FoodsParadiseItems;
import com.joostmsoftware.foodsparadise.util.FoodsParadiseUtil;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FoodsParadise implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		FoodsParadiseItems.register();

		FoodsParadiseUtil.LOGGER.info("Hello Fabric world!");
	}

	public ItemGroup GROUP = FabricItemGroup.builder(FoodsParadiseUtil.ID("group"))
			.icon(() -> new ItemStack(FoodsParadiseItems.TEST_COOKIE))
			.entries((displayContext, entries) -> {
				FoodsParadiseItems.ITEMS.forEach((s, item) -> entries.add(item));
			})
			.build();
}
