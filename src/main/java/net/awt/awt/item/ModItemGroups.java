package net.awt.awt.item;

import net.awt.awt.AWT;
import net.awt.awt.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	public static final ItemGroup ARTRIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
			new Identifier(AWT.MOD_ID, "artrium"),
			FabricItemGroup.builder().displayName(Text.translatable("itemgroup.artrium"))
					.icon(() -> new ItemStack(ModItems.ARTRIUM)).entries((displayContext, entries) -> {
						entries.add(ModItems.ARTRIUM);
						entries.add(ModBlocks.ARTRIUM_ORE);
						entries.add(ModBlocks.ARTRIUM_BLOCK);
						entries.add(ModBlocks.DEEPSLATE_ARTRIUM_ORE);
						entries.add(ModBlocks.TIME_GROWER);

					}).build());


	public static void registerItemGroups() {
		AWT.LOGGER.info("Registering Item Groups for" + AWT.MOD_ID);
	}
}
