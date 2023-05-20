package com.joostmsoftware.foodsparadise.data;

import com.joostmsoftware.foodsparadise.data.providers.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class FoodsParadiseDatagenEntrypoint implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(FoodsParadiseModelProvider::new);
        pack.addProvider(FoodsParadiseRecipeProvider::new);
        pack.addProvider(FoodsParadiseLanguageProvider::new);
    }
}
