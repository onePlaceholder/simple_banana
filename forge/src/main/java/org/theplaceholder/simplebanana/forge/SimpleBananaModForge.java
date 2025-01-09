package org.theplaceholder.simplebanana.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.theplaceholder.simplebanana.SimpleBananaMod;

@Mod(SimpleBananaMod.MOD_ID)
public final class SimpleBananaModForge {
    public SimpleBananaModForge() {
        EventBuses.registerModEventBus(SimpleBananaMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        SimpleBananaMod.init();
    }
}
