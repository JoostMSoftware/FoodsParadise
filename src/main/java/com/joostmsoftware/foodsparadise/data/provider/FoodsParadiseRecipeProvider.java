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


        // --- Shaped recipes --- //
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FoodsParadiseItems.COOKIE_FORM)
                .pattern(" X ")
                .pattern("X X")
                .pattern(" X ")
                .input('X', Items.IRON_INGOT)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, FoodsParadiseItems.COOKIE_DOUGH)
                .pattern("AAA")
                .pattern(" X ")
                .pattern("YZY")
                .input('X', Items.SUGAR)
                .input('Y', Items.EGG)
                .input('Z', Items.MILK_BUCKET)
                .input('A', FoodsParadiseItems.WHEAT_FLOWER)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);


        // --- Vanilla cooking recipes --- //
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
