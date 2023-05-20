package com.joostmsoftware.foodsparadise.data.provider;

import com.joostmsoftware.foodsparadise.items.FoodsParadiseItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class FoodsParadiseRecipeProvider extends FabricRecipeProvider {
    public FoodsParadiseRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // --- Shapeless recipes --- //
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, FoodsParadiseItems.CHOCOLATE)
                .input(Items.SUGAR)
                .input(FoodsParadiseItems.ROASTED_COCOA_BEANS)
                .input(Items.MILK_BUCKET)
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.ROASTED_COCOA_BEANS), RecipeProvider.conditionsFromItem(FoodsParadiseItems.ROASTED_COCOA_BEANS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, FoodsParadiseItems.CHOCOLATE_CHIP_COOKIE_DOUGH)
                .input(FoodsParadiseItems.COOKIE_DOUGH)
                .input(FoodsParadiseItems.CHOCOLATE)
                .criterion(RecipeProvider.hasItem(FoodsParadiseItems.COOKIE_DOUGH), RecipeProvider.conditionsFromItem(FoodsParadiseItems.COOKIE_DOUGH))
                .offerTo(exporter);

        // --- Shaped recipes --- //
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FoodsParadiseItems.COOKIE_FORM)
                .pattern(" X ")
                .pattern("X X")
                .pattern(" X ")
                .input('X', Items.IRON_INGOT)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        // --- Cooking recipes --- //
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.COCOA_BEANS),
                RecipeCategory.FOOD,
                FoodsParadiseItems.ROASTED_COCOA_BEANS,
                0.35f,
                600)
                .criterion(RecipeProvider.hasItem(Items.COCOA_BEANS), RecipeProvider.conditionsFromItem(Items.COCOA_BEANS))
                .offerTo(exporter);


    }
}
