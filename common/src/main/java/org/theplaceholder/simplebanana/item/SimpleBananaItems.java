package org.theplaceholder.simplebanana.item;

import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import org.theplaceholder.simplebanana.SimpleBananaMod;

import java.util.function.Supplier;

public class SimpleBananaItems {
    public static final Registrar<Item> ITEMS = SimpleBananaMod.REGISTRAR_MANAGER.get().get(Registries.ITEM);

    public static final RegistrySupplier<Item> BANANA = register("banana",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(5).saturationModifier(0.6F).build())
                    .arch$tab(CreativeModeTabs.FOOD_AND_DRINKS)));

    public static final RegistrySupplier<Item> BANANA_SPLIT = register("banana_split",
            () -> new Item(new Item.Properties()
                    .stacksTo(1).arch$tab(CreativeModeTabs.TOOLS_AND_UTILITIES).rarity(Rarity.RARE)
                    .jukeboxPlayable(SimpleBananaJukeboxSongs.BANANA_SPLIT)));
    public static final RegistrySupplier<Item> BANANA_SPLIT_BB = register("banana_split_bb",
            () -> new Item(new Item.Properties()
                    .stacksTo(1).arch$tab(CreativeModeTabs.TOOLS_AND_UTILITIES).rarity(Rarity.RARE)
                    .jukeboxPlayable(SimpleBananaJukeboxSongs.BANANA_SPLIT_BB)));

    public static <T extends Item> RegistrySupplier<T> register(String id, Supplier<T> supplier) {
        return ITEMS.register(ResourceLocation.tryBuild(SimpleBananaMod.MOD_ID, id), supplier);
    }

    public static void init() {}
}
