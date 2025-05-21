package net.awt.awt.datagen;

import net.awt.awt.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }



    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.WHITE_CONCRETE_ROUNDEL)
                .add(ModBlocks.BLACK_CONCRETE_ROUNDEL)
                .add(ModBlocks.END_STONE_BRICKS_ROUNDEL)
                .add(ModBlocks.GRAY_CONCRETE_ROUNDEL)
                .add(ModBlocks.GREEN_CONCRETE_ROUNDEL)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_ROUNDEL)
                .add(ModBlocks.POLISHED_ANDESITE_ROUNDEL)
                .add(ModBlocks.POLISHED_DEEPSLATE_ROUNDEL)
                .add(ModBlocks.POLISHED_GRANITE_ROUNDEL)
                .add(ModBlocks.POLISHED_DIORITE_ROUNDEL)
                .add(ModBlocks.QUARTZ_ROUNDEL)
                .add(ModBlocks.SANDSTONE_ROUNDEL)
                .add(ModBlocks.CYAN_CONCRETE_ROUNDEL)
                .add(ModBlocks.YELLOW_CONCRETE_ROUNDEL)
                .add(ModBlocks.WEATHERED_COPPER_ROUNDEL)
                .add(ModBlocks.RED_CONCRETE_ROUNDEL)
                .add(ModBlocks.PURPLE_CONCRETE_ROUNDEL)
                .add(ModBlocks.PINK_CONCRETE_ROUNDEL)
                .add(ModBlocks.BROWN_CONCRETE_ROUNDEL)
                .add(ModBlocks.ORANGE_CONCRETE_ROUNDEL)
                .add(ModBlocks.OXIDIZED_COPPER_ROUNDEL)
                .add(ModBlocks.LIME_CONCRETE_ROUNDEL)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_ROUNDEL)
                .add(ModBlocks.BLUE_CONCRETE_ROUNDEL)
                .add(ModBlocks.EXPOSED_COPPER_ROUNDEL)
                .add(ModBlocks.COPPER_ROUNDEL)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ARTRIUM_BLOCK)
                .add(ModBlocks.ARTRIUM_ORE)
                .add(ModBlocks.DEEPSLATE_ARTRIUM_ORE)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")));

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")));

        getOrCreateTagBuilder(BlockTags.FENCES);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES);
        getOrCreateTagBuilder(BlockTags.WALLS);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.STRIPPED_ACACIA_LOG_ROUNDEL)
                .add(ModBlocks.STRIPPED_BIRCH_LOG_ROUNDEL)
                .add(ModBlocks.STRIPPED_CHERRY_LOG_ROUNDEL)
                .add(ModBlocks.STRIPPED_DARK_OAK_LOG_ROUNDEL)
                .add(ModBlocks.STRIPPED_JUNGLE_LOG_ROUNDEL)
                .add(ModBlocks.STRIPPED_MANGROVE_LOG_ROUNDEL)
                .add(ModBlocks.STRIPPED_OAK_LOG_ROUNDEL)
                .add(ModBlocks.STRIPPED_SPRUCE_LOG_ROUNDEL);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.MOSS_ROUNDEL)
                .add(ModBlocks.DIRT_ROUNDEL);

    }
}