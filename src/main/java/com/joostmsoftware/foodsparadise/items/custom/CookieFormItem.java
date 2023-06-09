package com.joostmsoftware.foodsparadise.items.custom;

import com.joostmsoftware.joostmlib.item.DamageableCraftingItem;
import org.jetbrains.annotations.NotNull;

public class CookieFormItem extends DamageableCraftingItem {

    public CookieFormItem(@NotNull Settings settings) {
        super(settings.maxCount(1).maxDamageIfAbsent(100));
    }
}