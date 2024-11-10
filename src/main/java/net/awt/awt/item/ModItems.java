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
    public static final Item artrium = registerItem("artrium", new Item(new FabricItemSettings()));
    public static final Item blunt = registerItem("blunt", new Item(new FabricItemSettings()));

 private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
     entries.add(artrium);
 }

private static Item registerItem(String name, Item item){
    return Registry.register(Registries.ITEM, new Identifier(AWT.MOD_ID, name), item);
}
    public static void registerModItems() {
        AWT.LOGGER.info("Registering Mod Items for" + AWT.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
}


    }
