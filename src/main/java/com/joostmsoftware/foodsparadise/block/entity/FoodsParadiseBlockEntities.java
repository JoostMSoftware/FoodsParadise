package com.joostmsoftware.foodsparadise.block.entity;

import com.joostmsoftware.foodsparadise.block.FoodsParadiseBlocks;
import com.joostmsoftware.foodsparadise.util.FoodsParadiseUtil;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class FoodsParadiseBlockEntities {
    public static BlockEntityType<BlenderBlockEntity> BLENDER;

    public static void registerBlockEntities() {
        BLENDER = Registry.register(Registries.BLOCK_ENTITY_TYPE, FoodsParadiseUtil.ID("blender"),
                FabricBlockEntityTypeBuilder.create(BlenderBlockEntity::new, FoodsParadiseBlocks.BLENDER_BLOCK).build(null));
    }
}
