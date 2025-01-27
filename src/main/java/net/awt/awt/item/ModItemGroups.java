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
                        entries.add(ModItems.PROCESSINGUNIT);
                        entries.add(ModItems.ARTRIUMCORE);
                        entries.add(ModItems.ENERGIZEDARTRIUM);



                    }).build());

    public static final ItemGroup DALEKANIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AWT.MOD_ID, "skaro"),
            FabricItemGroup.builder().displayName(Text.translatable("item_group.awt.planet_skaro"))
                    .icon(() -> new ItemStack(ModItems.DALEKANIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DALEKANIUM);
                        entries.add(ModItems.DALEKANIUM_SCRAP);
                        entries.add(ModItems.METALERT_DUST);
                        entries.add(ModItems.CHROMITE);
                        entries.add(ModBlocks.DALEKANIUM_BLOCK);
                        entries.add(ModBlocks.DALEKANIUM_ORE);
                        entries.add(ModBlocks.KALETITE);
                        entries.add(ModBlocks.KALETITE_BRICKS);
                        entries.add(ModBlocks.CRACKED_KALETITE);
                        entries.add(ModBlocks.COBBLED_KALETITE);
                        entries.add(ModBlocks.WASTED_BUTTON);
                        entries.add(ModBlocks.WASTED_PLANK_SLAB);
                        entries.add(ModBlocks.WASTED_PLANKS);
                        entries.add(ModBlocks.WASTED_PLANK_STAIRS);
                        entries.add(ModBlocks.WASTED_BUSH_PLANT);
                        entries.add(ModBlocks.WASTED_LOG);
                        entries.add(ModBlocks.WASTED_PRESSURE_PLATE);
                        entries.add(ModBlocks.WASTED_TRAP_DOOR);
                        entries.add(ModBlocks.WASTED_DIRT);
                        entries.add(ModBlocks.WASTED_DOOR);
                        entries.add(ModBlocks.WASTEDGRASS);
                        entries.add(ModBlocks.WASTED_LEAVES);
                        entries.add(ModItems.VORTEX_MANIPULATOR);

                    }).build());

    public static final ItemGroup STEEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AWT.MOD_ID, "mondas"),
            FabricItemGroup.builder().displayName(Text.translatable("item_group.awt.planet_mondas"))
                    .icon(() -> new ItemStack(ModItems.STEEL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL);
                    }).build());

    public static final ItemGroup ROUNDEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AWT.MOD_ID, "roundel"),
            FabricItemGroup.builder().displayName(Text.translatable("item_group.awt.Roundel"))
                    .icon(() -> new ItemStack(ModBlocks.WHITE_CONCRETE_ROUNDEL)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WHITE_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.BLACK_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.CYAN_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.DIRT_ROUNDEL);
                        entries.add(ModBlocks.END_STONE_BRICKS_ROUNDEL);
                        entries.add(ModBlocks.GRAY_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.GREEN_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.POLISHED_ANDESITE_ROUNDEL);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_ROUNDEL);
                        entries.add(ModBlocks.POLISHED_DIORITE_ROUNDEL);
                        entries.add(ModBlocks.POLISHED_GRANITE_ROUNDEL);
                        entries.add(ModBlocks.QUARTZ_ROUNDEL);
                        entries.add(ModBlocks.SANDSTONE_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_ACACIA_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_BIRCH_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_CHERRY_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_DARK_OAK_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_JUNGLE_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_MANGROVE_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_OAK_LOG_ROUNDEL);
                        entries.add(ModBlocks.STRIPPED_SPRUCE_LOG_ROUNDEL);
                        entries.add(ModBlocks.BLUE_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.BROWN_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.COPPER_ROUNDEL);
                        entries.add(ModBlocks.EXPOSED_COPPER_ROUNDEL);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.LIME_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.MOSS_ROUNDEL);
                        entries.add(ModBlocks.ORANGE_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.OXIDIZED_COPPER_ROUNDEL);
                        entries.add(ModBlocks.PINK_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.PURPLE_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.RED_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.YELLOW_CONCRETE_ROUNDEL);
                        entries.add(ModBlocks.WEATHERED_COPPER_ROUNDEL);
                    }).build());


    public static void registerItemGroups() {
        AWT.LOGGER.info("Registering Item Groups for" + AWT.MOD_ID);
    }
}
