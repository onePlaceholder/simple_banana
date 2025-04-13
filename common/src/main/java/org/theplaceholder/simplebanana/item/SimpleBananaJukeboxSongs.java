package org.theplaceholder.simplebanana.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.JukeboxSong;
import org.theplaceholder.simplebanana.SimpleBananaMod;

public class SimpleBananaJukeboxSongs {
    public static final ResourceKey<JukeboxSong> BANANA_SPLIT = register("banana_split");
    public static final ResourceKey<JukeboxSong> BANANA_SPLIT_BB = register("banana_split_bb");

    public static ResourceKey<JukeboxSong> register(String id) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.tryBuild(SimpleBananaMod.MOD_ID, id));
    }
}
