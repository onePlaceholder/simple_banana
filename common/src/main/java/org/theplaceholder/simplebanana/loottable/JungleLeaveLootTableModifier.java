package org.theplaceholder.simplebanana.loottable;

import dev.architectury.event.events.common.LootEvent;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.BinomialDistributionGenerator;
import org.theplaceholder.simplebanana.item.SimpleBananaItems;

public class JungleLeaveLootTableModifier implements LootEvent.ModifyLootTable {
    @Override
    public void modifyLootTable(ResourceKey<LootTable> resource, LootEvent.LootTableModificationContext context, boolean builtin) {
        if (resource.location().equals(Blocks.JUNGLE_LEAVES.getLootTable().location()) && builtin) {
            LootPool.Builder builder = LootPool.lootPool()
                    .setRolls(BinomialDistributionGenerator.binomial(1, 0.0625f))
                    .add(LootItem.lootTableItem(SimpleBananaItems.BANANA.get()));
            context.addPool(builder);
        }
    }
}
