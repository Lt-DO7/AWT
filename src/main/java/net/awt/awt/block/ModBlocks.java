package net.awt.awt.block;

import net.awt.awt.AWT;
import net.awt.awt.block.custom.TimeGrowerBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

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

	//DDWA
	public static final Block DALEKANIUM_BLOCK = registerBlock("dalekanium_block",
			new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));


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
	}
}
