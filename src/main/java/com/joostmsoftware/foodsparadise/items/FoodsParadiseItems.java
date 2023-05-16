package com.joostmsoftware.foodsparadise.items;

import com.joostmsoftware.foodsparadise.util.FoodsParadiseUtil;
import com.joostmsoftware.joostmlib.food.Food;
import com.joostmsoftware.joostmlib.food.FoodItem;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class FoodsParadiseItems {
    public static Map<String, Item> ITEMS = new HashMap<>();

    // Tools
    public static Item COOKIE_FORM = new CookieFormItem(new Item.Settings());

    // Foods
    public static Item TEST_COOKIE = new FoodItem(new Item.Settings(), new Food(2, 0.2f));
    public static Item ICE_CREAM = new FoodItem(new Item.Settings(), new Food(7, 0.8f).addEffect(StatusEffects.SPEED, 500, 0.2f));
    public static FoodItem COOKIE_DOUGH = new FoodItem(new Item.Settings(), new Food(1, 0.1f));
    public static FoodItem RAW_COOKIE = new FoodItem(new Item.Settings(), new Food(1, 0.1f));

    private static void registerItem(String path, Item item) {
        Registry.register(Registries.ITEM, FoodsParadiseUtil.ID(path), item);
    }

    static {
        ITEMS.put("test_cookie", TEST_COOKIE);
        ITEMS.put("ice_cream", ICE_CREAM);
        ITEMS.put("cookie_dough", COOKIE_DOUGH);
        ITEMS.put("cookie_form", COOKIE_FORM);
        ITEMS.put("raw_cookie", RAW_COOKIE);
    }

    public static void register() {
        FoodsParadiseUtil.LOGGER.info("Registering all items");

        ITEMS.forEach(FoodsParadiseItems::registerItem);
    }
}
