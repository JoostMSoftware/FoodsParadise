package com.joostmsoftware.foodsparadise.items.custom;

import com.joostmsoftware.joostmlib.item.DamageableCraftingItem;
import org.jetbrains.annotations.NotNull;

public class CrusherItem extends DamageableCraftingItem {
    public CrusherItem(@NotNull Settings settings) {
        super(settings.maxCount(1).maxDamageIfAbsent(250));
    }
}
