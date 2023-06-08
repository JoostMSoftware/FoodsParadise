package com.joostmsoftware.foodsparadise.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BlenderBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inv = DefaultedList.ofSize(5, ItemStack.EMPTY);
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 100;
    private int fuelTime = 0;
    private int maxFuelTime = 0;

    public BlenderBlockEntity(BlockPos pos, BlockState state) {
        super(FoodsParadiseBlockEntities.BLENDER, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> BlenderBlockEntity.this.progress;
                    case 1 -> BlenderBlockEntity.this.maxProgress;
                    case 2 -> BlenderBlockEntity.this.fuelTime;
                    case 3 -> BlenderBlockEntity.this.maxFuelTime;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> BlenderBlockEntity.this.progress = value;
                    case 1 -> BlenderBlockEntity.this.maxProgress = value;
                    case 2 -> BlenderBlockEntity.this.fuelTime = value;
                    case 3 -> BlenderBlockEntity.this.maxFuelTime = value;
                }
            }

            @Override
            public int size() {
                return 4;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inv;
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("blenderblock.displayname");
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inv);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inv);
        super.readNbt(nbt);
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return
    }

    public static void tick(World world, BlockPos blockPos, BlockState blockState, BlenderBlockEntity entity) {

    }
}
