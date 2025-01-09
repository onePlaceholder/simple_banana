package org.theplaceholder.simplebanana.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import org.theplaceholder.simplebanana.fabriclike.SimpleBananaModFabricLike;

public final class SimpleBananaModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        SimpleBananaModFabricLike.init();
    }
}
