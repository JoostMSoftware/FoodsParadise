package com.joostmsoftware.foodsparadise.data.recipes;

import com.joostmsoftware.foodsparadise.items.FoodsParadiseItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class FoodsParadiseShapelessRecipes {
    public static void initialiseRecipes(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, FoodsParadiseItems.CHOCOLATE)
                .input(Items.SUGAR)
                .input(FoodsParadiseItems.ROASTED_COCOA_BEANS)
                .input(Items.MILK_BUCKET)
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.ROASTED_COCOA_BEANS), RecipeProvider.conditionsFromItem(FoodsParadiseItems.ROASTED_COCOA_BEANS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, FoodsParadiseItems.CHOCOLATE_CHIP_COOKIE_DOUGH)
                .input(FoodsParadiseItems.COOKIE_DOUGH)
                .input(FoodsParadiseItems.CHOCOLATE_BITS)
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.COOKIE_DOUGH), RecipeProvider.conditionsFromItem(FoodsParadiseItems.COOKIE_DOUGH))
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.CHOCOLATE_BITS), RecipeProvider.conditionsFromItem(FoodsParadiseItems.CHOCOLATE_BITS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, FoodsParadiseItems.RAW_COOKIE)
                .input(FoodsParadiseItems.COOKIE_DOUGH)
                .input(FoodsParadiseItems.COOKIE_FORM)
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.COOKIE_DOUGH), RecipeProvider.conditionsFromItem(FoodsParadiseItems.COOKIE_DOUGH))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, FoodsParadiseItems.RAW_CHOCOLATE_CHIP_COOKIE)
                .input(FoodsParadiseItems.CHOCOLATE_CHIP_COOKIE_DOUGH)
                .input(FoodsParadiseItems.COOKIE_FORM)
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.CHOCOLATE_CHIP_COOKIE_DOUGH), RecipeProvider.conditionsFromItem(FoodsParadiseItems.CHOCOLATE_CHIP_COOKIE_DOUGH))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, FoodsParadiseItems.CHOCOLATE_BITS)
                .input(FoodsParadiseItems.CHOCOLATE)
                .input(FoodsParadiseItems.CRUSHER)
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.CHOCOLATE), RecipeProvider.conditionsFromItem(FoodsParadiseItems.CHOCOLATE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, FoodsParadiseItems.WHEAT_FLOWER)
                .input(Items.WHEAT)
                .input(FoodsParadiseItems.CRUSHER)
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.CRUSHER), RecipeProvider.conditionsFromItem(FoodsParadiseItems.CRUSHER))
                .criterion(RecipeProvider.hasItem(Items.WHEAT), RecipeProvider.conditionsFromItem(Items.WHEAT))
                .offerTo(exporter);
    }
}