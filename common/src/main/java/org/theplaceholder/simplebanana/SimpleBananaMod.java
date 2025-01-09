package org.theplaceholder.simplebanana;

import com.google.common.base.Suppliers;
import dev.architectury.event.events.common.LootEvent;
import dev.architectury.registry.registries.RegistrarManager;
import org.theplaceholder.simplebanana.item.SimpleBananaItems;
import org.theplaceholder.simplebanana.loottable.JungleLeaveLootTableModifier;
import org.theplaceholder.simplebanana.sound.SimpleBananaSounds;

import java.util.function.Supplier;

public final class SimpleBananaMod {
    public static final String MOD_ID = "simple_banana";
    public static final Supplier<RegistrarManager> REGISTRAR_MANAGER = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));

    public static void init() {
        SimpleBananaSounds.init();
        SimpleBananaItems.init();

        LootEvent.MODIFY_LOOT_TABLE.register(new JungleLeaveLootTableModifier());
    }
}
