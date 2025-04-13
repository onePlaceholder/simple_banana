package org.theplaceholder.simplebanana.fabric;

import net.fabricmc.api.ModInitializer;

import org.theplaceholder.simplebanana.SimpleBananaMod;

public final class SimpleBananaModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SimpleBananaMod.init();
    }
}
