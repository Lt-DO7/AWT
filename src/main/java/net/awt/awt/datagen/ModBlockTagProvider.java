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
		getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
				.add(ModBlocks.ARTRIUM_BLOCK)
				.add(ModBlocks.ARTRIUM_ORE)
				.add(ModBlocks.KALETITE)
				.add(ModBlocks.COBBLED_KALETITE)
				.add(ModBlocks.CRACKED_KALETITE)
				.add(ModBlocks.KALETITE_BRICKS)
				.add(ModBlocks.DALEKANIUM_ORE)
				.add(ModBlocks.DALEKANIUM_BLOCK)
				.add(ModBlocks.DEEPSLATE_ARTRIUM_ORE);


		getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

		getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
				.add(ModBlocks.ARTRIUM_BLOCK)
				.add(ModBlocks.DEEPSLATE_ARTRIUM_ORE)
				.add(ModBlocks.DALEKANIUM_ORE)
				.add(ModBlocks.ARTRIUM_ORE);

		getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

		getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")));

		getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")));

		getOrCreateTagBuilder(BlockTags.FENCES);
		getOrCreateTagBuilder(BlockTags.FENCE_GATES);
		getOrCreateTagBuilder(BlockTags.WALLS);

		getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN);
	}
}