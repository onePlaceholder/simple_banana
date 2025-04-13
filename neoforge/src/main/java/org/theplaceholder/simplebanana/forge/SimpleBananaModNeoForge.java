package org.theplaceholder.simplebanana.forge;

import net.neoforged.fml.common.Mod;
import org.theplaceholder.simplebanana.SimpleBananaMod;

@Mod(SimpleBananaMod.MOD_ID)
public final class SimpleBananaModNeoForge {
    public SimpleBananaModNeoForge() {
        SimpleBananaMod.init();
    }
}
