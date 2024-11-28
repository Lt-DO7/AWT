package net.awt.awt.block;

import net.awt.awt.AWT;
import net.awt.awt.block.custom.RoundelBlock;
import net.awt.awt.block.custom.TimeGrowerBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

public class ModBlocks {
	//AWT
	public static final Block ARTRIUM_ORE = registerBlock("artrium_ore",
			new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.STONE)));
	public static final Block TIME_GROWER = registerBlock("time_grower",
			new TimeGrowerBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));
	public static final Block ARTRIUM_BLOCK = registerBlock("artrium_block",
			new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));
	public static final Block DEEPSLATE_ARTRIUM_ORE = registerBlock("deepslate_artrium_ore",
			new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.DEEPSLATE)));
	public static final Block Unlocker = registerBlock("unlocker",
			new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));

	//DDWA
	public static final Block DALEKANIUM_BLOCK = registerBlock("dalekanium_block",
			new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));
	public static final Block DALEKANIUM_ORE = registerBlock("dalekanium_ore",
			new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.STONE)));
	public static final Block KALETITE = registerBlock("kaletite",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block KALETITE_BRICKS = registerBlock("kaletite_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.STONE)));
	public static final Block CRACKED_KALETITE = registerBlock("cracked_kaletite",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block COBBLED_KALETITE = registerBlock("cobbled_kaletite",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block WASTED_BUSH_PLANT = registerBlock("wasted_bush_plant",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block WASTED_BUTTON = registerBlock("wasted_button",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block WASTED_DIRT = registerBlock("wasted_dirt",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block WASTED_DOOR = registerBlock("wasted_door",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block WASTED_LEAVES = registerBlock("wasted_leaves",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block WASTED_LOG = registerBlock("wasted_log",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block WASTED_PLANK_SLAB = registerBlock("wasted_plank_slab",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block WASTED_PLANK_STAIRS = registerBlock("wasted_plank_stairs",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block WASTED_PLANKS = registerBlock("wasted_planks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block WASTED_PRESSURE_PLATE = registerBlock("wasted_pressure_plate",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block WASTED_TRAP_DOOR = registerBlock("wasted_trap_door",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block WASTEDGRASS = registerBlock("wastedgrass",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));



	//roundel
	public static final Block WHITE_CONCRETE_ROUNDEL = registerBlock("white_concrete_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block BLACK_CONCRETE_ROUNDEL = registerBlock("black_concrete_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block CYAN_CONCRETE_ROUNDEL = registerBlock("cyan_concrete_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block DIRT_ROUNDEL = registerBlock("dirt_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block END_STONE_BRICKS_ROUNDEL = registerBlock("end_stone_bricks_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block GRAY_CONCRETE_ROUNDEL = registerBlock("gray_concrete_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block GREEN_CONCRETE_ROUNDEL = registerBlock("green_concrete_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block LIGHT_GRAY_CONCRETE_ROUNDEL = registerBlock("light_gray_concrete_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block POLISHED_ANDESITE_ROUNDEL = registerBlock("polished_andesite_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block POLISHED_DEEPSLATE_ROUNDEL = registerBlock("polished_deepslate_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block POLISHED_DIORITE_ROUNDEL = registerBlock("polished_diorite_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block POLISHED_GRANITE_ROUNDEL = registerBlock("polished_granite_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block QUARTZ_ROUNDEL = registerBlock("quartz_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block SANDSTONE_ROUNDEL = registerBlock("sandstone_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));
	public static final Block STRIPPED_ACACIA_LOG_ROUNDEL = registerBlock("stripped_acacia_log_roundel",
			new RoundelBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));


	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(AWT.MOD_ID, name), block);
	}


	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, new Identifier(AWT.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings()));

	}

	public static void registerModBlocks() {
		AWT.LOGGER.info("Registering ModBlocks for" + AWT.MOD_ID);


//Dino was here
// Tay was here also
// duzo was here also also
// go kys i'm not here -tendo
	}
}
