package net.awt.awt;

import net.awt.awt.block.ModBlocks;
import net.awt.awt.item.ModItemGroups;
import net.awt.awt.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AWT implements ModInitializer {
	public static final String MOD_ID = "awt";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


	}
}