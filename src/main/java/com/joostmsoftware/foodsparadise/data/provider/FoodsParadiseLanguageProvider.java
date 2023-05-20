package com.joostmsoftware.foodsparadise.data.provider;

import com.joostmsoftware.foodsparadise.items.FoodsParadiseItems;
import com.joostmsoftware.foodsparadise.util.FoodsParadiseUtil;
import com.joostmsoftware.joostmlib.JoostMLibUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class FoodsParadiseLanguageProvider extends FabricLanguageProvider {
    public FoodsParadiseLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        FoodsParadiseItems.ITEMS.forEach((s, item) -> {
            String capitalised = JoostMLibUtils.capitalizeString(s);
            translationBuilder.add(item, capitalised.replace("_", " "));
        });

        translationBuilder.add("itemGroup.foodsparadise.group", FoodsParadiseUtil.NAMESPACE);
    }
}
