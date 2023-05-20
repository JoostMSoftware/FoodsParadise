package com.joostmsoftware.foodsparadise.data.provider;

import com.joostmsoftware.foodsparadise.data.recipes.FoodsParadiseShapedRecipes;
import com.joostmsoftware.foodsparadise.data.recipes.FoodsParadiseShapelessRecipes;
import com.joostmsoftware.foodsparadise.data.recipes.FoodsParadiseVanillaRecipes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;

import java.util.function.Consumer;

public class FoodsParadiseRecipeProvider extends FabricRecipeProvider {
    public FoodsParadiseRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // --- Shapeless recipes --- //
        FoodsParadiseShapelessRecipes.initialiseRecipes(exporter);


        // --- Shaped recipes --- //
        FoodsParadiseShapedRecipes.initialiseRecipes(exporter);


        // --- Vanilla cooking recipes --- //
        FoodsParadiseVanillaRecipes.initialiseRecipes(exporter);

    }
}
