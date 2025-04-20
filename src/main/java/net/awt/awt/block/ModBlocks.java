package net.awt.awt.block;

import net.awt.awt.AWT;
import net.awt.awt.block.custom.INeedMyStairsBlock;
import net.awt.awt.block.custom.RoundelBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //AWT

    public static final Block ARTRIUM_BLOCK = registerBlock("atrium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).sounds(BlockSoundGroup.COPPER).requiresTool().strength(0.1F))
            );

    //roundels

        //Misc Roundels
    public static final Block MOSS_ROUNDEL = registerBlock("moss_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).sounds(BlockSoundGroup.MOSS_BLOCK).requiresTool().strength(0.1F)));

    public static final Block DIRT_ROUNDEL = registerBlock("dirt_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.GRASS).requiresTool().strength(0.1F)));

        //Sand Roundels
    public static final Block END_STONE_BRICKS_ROUNDEL = registerBlock("end_stone_bricks_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F)));

    public static final Block POLISHED_ANDESITE_ROUNDEL = registerBlock("polished_andesite_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F)));

    public static final Block POLISHED_DEEPSLATE_ROUNDEL = registerBlock("polished_deepslate_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.POLISHED_DEEPSLATE).requiresTool().strength(1.5F, 6.0F)));

    public static final Block POLISHED_DIORITE_ROUNDEL = registerBlock("polished_diorite_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F)));

    public static final Block POLISHED_GRANITE_ROUNDEL = registerBlock("polished_granite_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F)));

    public static final Block QUARTZ_ROUNDEL = registerBlock("quartz_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F)));

    public static final Block SANDSTONE_ROUNDEL = registerBlock("sandstone_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F)));

        //Wood Roundels
    public static final Block STRIPPED_ACACIA_LOG_ROUNDEL = registerBlock("stripped_acacia_log_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_BIRCH_LOG_ROUNDEL = registerBlock("stripped_birch_log_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_CHERRY_LOG_ROUNDEL = registerBlock("stripped_cherry_log_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block STRIPPED_DARK_OAK_LOG_ROUNDEL = registerBlock("stripped_dark_oak_log_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_JUNGLE_LOG_ROUNDEL = registerBlock("stripped_jungle_log_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_MANGROVE_LOG_ROUNDEL = registerBlock("stripped_mangrove_log_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_OAK_LOG_ROUNDEL = registerBlock("stripped_oak_log_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_SPRUCE_LOG_ROUNDEL = registerBlock("stripped_spruce_log_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.WOOD)));

        //Copper Roundels
    public static final Block COPPER_ROUNDEL = registerBlock("copper_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).sounds(BlockSoundGroup.COPPER)));

    public static final Block EXPOSED_COPPER_ROUNDEL = registerBlock("exposed_copper_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).sounds(BlockSoundGroup.COPPER)));

    public static final Block OXIDIZED_COPPER_ROUNDEL = registerBlock("oxidized_copper_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).sounds(BlockSoundGroup.COPPER)));

    public static final Block WEATHERED_COPPER_ROUNDEL = registerBlock("weathered_copper_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).sounds(BlockSoundGroup.COPPER)));

        //Concrete Roundels
    public static final Block ORANGE_CONCRETE_ROUNDEL = registerBlock("orange_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block PINK_CONCRETE_ROUNDEL = registerBlock("pink_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block PURPLE_CONCRETE_ROUNDEL = registerBlock("purple_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block RED_CONCRETE_ROUNDEL = registerBlock("red_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block YELLOW_CONCRETE_ROUNDEL = registerBlock("yellow_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block WHITE_CONCRETE_ROUNDEL = registerBlock("white_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block BLACK_CONCRETE_ROUNDEL = registerBlock("black_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block CYAN_CONCRETE_ROUNDEL = registerBlock("cyan_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_BLUE_CONCRETE_ROUNDEL = registerBlock("light_blue_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block LIME_CONCRETE_ROUNDEL = registerBlock("lime_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block MAGENTA_CONCRETE_ROUNDEL = registerBlock("magenta_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block BLUE_CONCRETE_ROUNDEL = registerBlock("blue_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block BROWN_CONCRETE_ROUNDEL = registerBlock("brown_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block GRAY_CONCRETE_ROUNDEL = registerBlock("gray_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block GREEN_CONCRETE_ROUNDEL = registerBlock("green_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_GRAY_CONCRETE_ROUNDEL = registerBlock("light_gray_concrete_roundel",
            new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AWT.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(AWT.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {
        AWT.LOGGER.info("Registering ModBlocks for" + AWT.MOD_ID);


    }
}
