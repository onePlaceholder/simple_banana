package org.theplaceholder.simplebanana.sound;

import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import org.theplaceholder.simplebanana.SimpleBananaMod;

public class SimpleBananaSounds {
    public static final Registrar<SoundEvent> SOUND_EVENTS = SimpleBananaMod.REGISTRAR_MANAGER.get().get(Registries.SOUND_EVENT);

    public static final RegistrySupplier<SoundEvent> BANANA_SPLIT = register("banana_split");
    public static final RegistrySupplier<SoundEvent> BANANA_SPLIT_BB = register("banana_split_bb");

    public static RegistrySupplier<SoundEvent> register(String id) {
        ResourceLocation location = new ResourceLocation(SimpleBananaMod.MOD_ID, id);
        return SOUND_EVENTS.register(location, () -> SoundEvent.createVariableRangeEvent(location));
    }

    public static void init() {}
}
