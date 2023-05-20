package com.joostmsoftware.foodsparadise.data.recipes;

import com.joostmsoftware.foodsparadise.items.FoodsParadiseItems;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class FoodsParadiseVanillaRecipes {
    public static void initialiseRecipes(Consumer<RecipeJsonProvider> exporter) {
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.COCOA_BEANS),
                        RecipeCategory.FOOD,
                        FoodsParadiseItems.ROASTED_COCOA_BEANS,
                        0.35f,
                        600)
                .criterion(RecipeProvider.hasItem(Items.COCOA_BEANS), RecipeProvider.conditionsFromItem(Items.COCOA_BEANS))
                .offerTo(exporter);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(FoodsParadiseItems.RAW_COOKIE),
                        RecipeCategory.FOOD,
                        FoodsParadiseItems.COOKIE,
                        0.35f,
                        300)
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.RAW_COOKIE), RecipeProvider.conditionsFromItem(FoodsParadiseItems.RAW_COOKIE))
                .offerTo(exporter);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(FoodsParadiseItems.RAW_CHOCOLATE_CHIP_COOKIE),
                        RecipeCategory.FOOD,
                        FoodsParadiseItems.CHOCOLATE_CHIP_COOKIE,
                        0.35f,
                        300)
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.RAW_CHOCOLATE_CHIP_COOKIE), RecipeProvider.conditionsFromItem(FoodsParadiseItems.RAW_CHOCOLATE_CHIP_COOKIE))
                .offerTo(exporter);
    }
}
