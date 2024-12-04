package net.awt.awt.datagen;

import net.awt.awt.block.ModBlocks;
import net.awt.awt.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ARTRIUM_ORE);

        addDrop(ModBlocks.ARTRIUM_ORE, copperLikeOreDrops(ModBlocks.ARTRIUM_ORE, ModItems.ARTRIUM));
        addDrop(ModBlocks.DEEPSLATE_ARTRIUM_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_ARTRIUM_ORE, ModItems.ARTRIUM));
        addDrop(ModBlocks.ARTRIUM_BLOCK, drops(ModBlocks.ARTRIUM_BLOCK));
        addDrop(ModBlocks.MOSS_ROUNDEL, drops(ModBlocks.MOSS_ROUNDEL));
        addDrop(ModBlocks.DIRT_ROUNDEL, drops(ModBlocks.DIRT_ROUNDEL));
        addDrop(ModBlocks.END_STONE_BRICKS_ROUNDEL, drops(ModBlocks.END_STONE_BRICKS_ROUNDEL));
        addDrop(ModBlocks.POLISHED_ANDESITE_ROUNDEL, drops(ModBlocks.POLISHED_ANDESITE_ROUNDEL));
        addDrop(ModBlocks.POLISHED_DEEPSLATE_ROUNDEL, drops(ModBlocks.POLISHED_DEEPSLATE_ROUNDEL));
        addDrop(ModBlocks.POLISHED_DIORITE_ROUNDEL, drops(ModBlocks.POLISHED_DIORITE_ROUNDEL));
        addDrop(ModBlocks.POLISHED_GRANITE_ROUNDEL, drops(ModBlocks.POLISHED_GRANITE_ROUNDEL));
        addDrop(ModBlocks.QUARTZ_ROUNDEL, drops(ModBlocks.QUARTZ_ROUNDEL));
        addDrop(ModBlocks.SANDSTONE_ROUNDEL, drops(ModBlocks.SANDSTONE_ROUNDEL));
        addDrop(ModBlocks.STRIPPED_ACACIA_LOG_ROUNDEL, drops(ModBlocks.STRIPPED_ACACIA_LOG_ROUNDEL));
        addDrop(ModBlocks.STRIPPED_BIRCH_LOG_ROUNDEL, drops(ModBlocks.STRIPPED_BIRCH_LOG_ROUNDEL));
        addDrop(ModBlocks.STRIPPED_CHERRY_LOG_ROUNDEL, drops(ModBlocks.STRIPPED_CHERRY_LOG_ROUNDEL));
        addDrop(ModBlocks.STRIPPED_DARK_OAK_LOG_ROUNDEL, drops(ModBlocks.STRIPPED_DARK_OAK_LOG_ROUNDEL));
        addDrop(ModBlocks.STRIPPED_JUNGLE_LOG_ROUNDEL, drops(ModBlocks.STRIPPED_JUNGLE_LOG_ROUNDEL));
        addDrop(ModBlocks.STRIPPED_MANGROVE_LOG_ROUNDEL, drops(ModBlocks.STRIPPED_MANGROVE_LOG_ROUNDEL));
        addDrop(ModBlocks.STRIPPED_OAK_LOG_ROUNDEL, drops(ModBlocks.STRIPPED_OAK_LOG_ROUNDEL));
        addDrop(ModBlocks.STRIPPED_SPRUCE_LOG_ROUNDEL, drops(ModBlocks.STRIPPED_SPRUCE_LOG_ROUNDEL));
        addDrop(ModBlocks.COPPER_ROUNDEL, drops(ModBlocks.COPPER_ROUNDEL));
        addDrop(ModBlocks.EXPOSED_COPPER_ROUNDEL, drops(ModBlocks.EXPOSED_COPPER_ROUNDEL));
        addDrop(ModBlocks.OXIDIZED_COPPER_ROUNDEL, drops(ModBlocks.OXIDIZED_COPPER_ROUNDEL));
        addDrop(ModBlocks.WEATHERED_COPPER_ROUNDEL, drops(ModBlocks.WEATHERED_COPPER_ROUNDEL));
        addDrop(ModBlocks.ORANGE_CONCRETE_ROUNDEL, drops(ModBlocks.ORANGE_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.PINK_CONCRETE_ROUNDEL, drops(ModBlocks.PINK_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.PURPLE_CONCRETE_ROUNDEL, drops(ModBlocks.PURPLE_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.RED_CONCRETE_ROUNDEL, drops(ModBlocks.RED_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.YELLOW_CONCRETE_ROUNDEL, drops(ModBlocks.YELLOW_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.WHITE_CONCRETE_ROUNDEL, drops(ModBlocks.WHITE_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.BLACK_CONCRETE_ROUNDEL, drops(ModBlocks.BLACK_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.CYAN_CONCRETE_ROUNDEL, drops(ModBlocks.CYAN_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_ROUNDEL, drops(ModBlocks.LIGHT_BLUE_CONCRETE_ROUNDEL));

        addDrop(ModBlocks.LIME_CONCRETE_ROUNDEL, drops(ModBlocks.LIME_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.MAGENTA_CONCRETE_ROUNDEL, drops(ModBlocks.MAGENTA_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.BLUE_CONCRETE_ROUNDEL, drops(ModBlocks.BLUE_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.BROWN_CONCRETE_ROUNDEL, drops(ModBlocks.BROWN_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.GRAY_CONCRETE_ROUNDEL, drops(ModBlocks.GRAY_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.GREEN_CONCRETE_ROUNDEL, drops(ModBlocks.GREEN_CONCRETE_ROUNDEL));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_ROUNDEL, drops(ModBlocks.LIGHT_GRAY_CONCRETE_ROUNDEL));

    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 1.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}