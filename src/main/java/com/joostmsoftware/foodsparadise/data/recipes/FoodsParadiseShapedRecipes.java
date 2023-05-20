package com.joostmsoftware.foodsparadise.data.recipes;

import com.joostmsoftware.foodsparadise.items.FoodsParadiseItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class FoodsParadiseShapedRecipes {
    public static void initialiseRecipes(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FoodsParadiseItems.COOKIE_FORM)
                .pattern(" X ")
                .pattern("X X")
                .pattern(" X ")
                .input('X', Items.IRON_INGOT)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, FoodsParadiseItems.RAW_COOKIE_DOUGH)
                .pattern("AAA")
                .pattern(" X ")
                .pattern("YZY")
                .input('X', Items.SUGAR)
                .input('Y', Items.EGG)
                .input('Z', Items.MILK_BUCKET)
                .input('A', FoodsParadiseItems.WHEAT_FLOUR)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
    }
}
