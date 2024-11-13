package net.awt.awt.item;

import net.awt.awt.AWT;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	public static final Item ARTRIUM = registerItem("artrium", new Item(new FabricItemSettings()));
	public static final Item LIGHTSABER = registerItem("lightsaber", new Item(new FabricItemSettings()));

	public static final Item DALEKANIUM = registerItem("dalekanium_ingot", new Item(new FabricItemSettings()));
	public static final Item DALEKANIUM_SCRAP = registerItem("dalekanium_scrap", new Item(new FabricItemSettings()));
	public static final Item STEEL = registerItem("steel_ingot", new Item(new FabricItemSettings()));
	public static final Item CHROMITE = registerItem("chromite", new Item(new FabricItemSettings()));
	public static final Item METALERT_DUST = registerItem("metalert_dust", new Item(new FabricItemSettings()));

	private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
		entries.add(ARTRIUM);
	}

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(AWT.MOD_ID, name), item);
	}

	public static void registerModItems() {
		AWT.LOGGER.info("Registering Mod Items for" + AWT.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
	}


}
