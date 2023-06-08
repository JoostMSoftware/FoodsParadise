package com.joostmsoftware.foodsparadise.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class FoodsParadiseBlocks {

    public static Block BLENDER_BLOCK = new BlenderBlock(FabricBlockSettings.of(Material.METAL));

    public static void register() {

    }
}
