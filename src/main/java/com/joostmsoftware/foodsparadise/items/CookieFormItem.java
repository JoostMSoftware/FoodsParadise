package com.joostmsoftware.foodsparadise.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class CookieFormItem extends Item {

    public CookieFormItem(@NotNull Settings settings) {
        super(settings.maxCount(1).maxDamageIfAbsent(20));
    }

    @Override
    public void onCraft(@NotNull ItemStack stack, World world, PlayerEntity player) {
        stack.damage(1, Random.create(), (ServerPlayerEntity) player);
        super.onCraft(stack, world, player);
    }

    @Override
    public boolean isDamageable() {
        return true;
    }
}