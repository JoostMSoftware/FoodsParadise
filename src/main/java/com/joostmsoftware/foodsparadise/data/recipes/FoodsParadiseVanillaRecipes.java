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

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(FoodsParadiseItems.COOKIE_DOUGH),
                        RecipeCategory.FOOD,
                        FoodsParadiseItems.COOKIE,
                        0.35f,
                        300)
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.COOKIE_DOUGH), RecipeProvider.conditionsFromItem(FoodsParadiseItems.COOKIE_DOUGH))
                .offerTo(exporter);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(FoodsParadiseItems.CHOCOLATE_CHIP_COOKIE_DOUGH),
                        RecipeCategory.FOOD,
                        FoodsParadiseItems.CHOCOLATE_CHIP_COOKIE,
                        0.35f,
                        300)
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.CHOCOLATE_CHIP_COOKIE_DOUGH), RecipeProvider.conditionsFromItem(FoodsParadiseItems.CHOCOLATE_CHIP_COOKIE_DOUGH))
                .offerTo(exporter);
    }
}
