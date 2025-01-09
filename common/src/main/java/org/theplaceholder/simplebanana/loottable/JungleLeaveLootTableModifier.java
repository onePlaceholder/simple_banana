package org.theplaceholder.simplebanana.loottable;

import dev.architectury.event.events.common.LootEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootDataManager;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import org.jetbrains.annotations.Nullable;
import org.theplaceholder.simplebanana.item.SimpleBananaItems;

public class JungleLeaveLootTableModifier implements LootEvent.ModifyLootTable {
    @Override
    public void modifyLootTable(@Nullable LootDataManager manager, ResourceLocation resource, LootEvent.LootTableModificationContext context, boolean builtin) {
        if (resource.equals(Blocks.JUNGLE_LEAVES.getLootTable()) && builtin) {
            LootPool.Builder builder = LootPool
                    .lootPool()
                    .add(LootItem.lootTableItem(SimpleBananaItems.BANANA.get()));
            context.addPool(builder);
        }
    }
}
