package com.joostmsoftware.foodsparadise.data.provider;

import com.joostmsoftware.foodsparadise.items.FoodsParadiseItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class FoodsParadiseModelProvider extends FabricModelProvider {
    public FoodsParadiseModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        FoodsParadiseItems.ITEMS.forEach((s, item) -> itemModelGenerator.register(item, Models.GENERATED));
    }
}
