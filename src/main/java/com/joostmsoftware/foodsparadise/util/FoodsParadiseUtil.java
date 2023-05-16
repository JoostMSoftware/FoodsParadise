package com.joostmsoftware.foodsparadise.util;

import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodsParadiseUtil {
    public static String NAMESPACE = "Foods Paradise";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAMESPACE);
    private static final String MODID = "foodsparadise";

    @Contract(value = "_ -> new", pure = true)
    public static @NotNull Identifier ID(String path) {
        return new Identifier(MODID, path);
    }
}
