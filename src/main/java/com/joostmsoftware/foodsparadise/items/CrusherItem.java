package com.joostmsoftware.foodsparadise.items;

import com.joostmsoftware.joostmlib.item.DamageableCraftingItem;

public class CrusherItem extends DamageableCraftingItem {
    public CrusherItem(Settings settings) {
        super(settings.maxCount(1).maxDamageIfAbsent(250));
    }
}
