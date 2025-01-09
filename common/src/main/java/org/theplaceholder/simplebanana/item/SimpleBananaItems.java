package org.theplaceholder.simplebanana.item;

import dev.architectury.core.item.ArchitecturyRecordItem;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import org.theplaceholder.simplebanana.SimpleBananaMod;
import org.theplaceholder.simplebanana.sound.SimpleBananaSounds;

import java.util.function.Supplier;

public class SimpleBananaItems {
    public static final Registrar<Item> ITEMS = SimpleBananaMod.REGISTRAR_MANAGER.get().get(Registries.ITEM);

    public static final RegistrySupplier<Item> BANANA = register("banana",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build())
                    .arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<ArchitecturyRecordItem> BANANA_SPLIT = register("banana_split",
            () -> new ArchitecturyRecordItem(0, SimpleBananaSounds.BANANA_SPLIT, new Item.Properties()
                    .stacksTo(1).arch$tab(CreativeModeTabs.TOOLS_AND_UTILITIES).rarity(Rarity.RARE), 143));
    public static final RegistrySupplier<ArchitecturyRecordItem> BANANA_SPLIT_BB = register("banana_split_bb",
            () -> new ArchitecturyRecordItem(0, SimpleBananaSounds.BANANA_SPLIT_BB, new Item.Properties()
                    .stacksTo(1).arch$tab(CreativeModeTabs.TOOLS_AND_UTILITIES).rarity(Rarity.RARE), 143));

    public static <T extends Item> RegistrySupplier<T> register(String id, Supplier<T> supplier) {
        return ITEMS.register(new ResourceLocation(SimpleBananaMod.MOD_ID, id), supplier);
    }

    public static void init() {}
}
