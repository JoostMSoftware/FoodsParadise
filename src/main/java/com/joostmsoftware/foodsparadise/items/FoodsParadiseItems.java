package com.joostmsoftware.foodsparadise.items;

import com.joostmsoftware.foodsparadise.util.FoodsParadiseUtil;
import com.joostmsoftware.joostmlib.item.food.Food;
import com.joostmsoftware.joostmlib.item.food.FoodItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class FoodsParadiseItems {
    public static Map<String, Item> ITEMS = new HashMap<>();

    // Tools/Items
    public static Item COOKIE_FORM = new CookieFormItem(new Item.Settings());

    // Foods
    public static Item CHOCOLATE_CHIP_COOKIE = new FoodItem(new Item.Settings(), new Food(3, 0.2f));
    public static Item CHOCOLATE_CHIP_COOKIE_DOUGH = new FoodItem(new Item.Settings(), new Food(2, 0.1f));
    public static FoodItem COOKIE_DOUGH = new FoodItem(new Item.Settings(), new Food(1, 0.1f));
    public static FoodItem RAW_COOKIE = new FoodItem(new Item.Settings(), new Food(1, 0.1f));
    public static FoodItem CHOCOLATE = new FoodItem(new Item.Settings(), new Food(1, 0.1f));
    public static FoodItem ROASTED_COCOA_BEANS = new FoodItem(new Item.Settings(), new Food(1, 0.1f));

    private static void registerItem(String path, Item item) {
        Registry.register(Registries.ITEM, FoodsParadiseUtil.ID(path), item);
    }

    static {
        ITEMS.put("chocolate_chip_cookie", CHOCOLATE_CHIP_COOKIE);
        ITEMS.put("chocolate_chip_cookie_dough", CHOCOLATE_CHIP_COOKIE_DOUGH);
        ITEMS.put("chocolate", CHOCOLATE);
        ITEMS.put("cookie_dough", COOKIE_DOUGH);
        ITEMS.put("cookie_form", COOKIE_FORM);
        ITEMS.put("raw_cookie", RAW_COOKIE);
        ITEMS.put("roasted_cocoa_beans", ROASTED_COCOA_BEANS);
    }

    public static void register() {
        FoodsParadiseUtil.LOGGER.info("Registering all items");

        ITEMS.forEach(FoodsParadiseItems::registerItem);
    }
}
