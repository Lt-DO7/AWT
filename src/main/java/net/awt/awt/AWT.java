package net.awt.awt;

import dev.amble.ait.data.schema.exterior.category.PoliceBoxCategory;
import dev.amble.ait.data.schema.exterior.variant.addon.AddonExterior;
import net.awt.awt.block.ModBlocks;
import net.awt.awt.item.ModItemGroups;
import net.awt.awt.item.ModItems;
import net.awt.awt.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.joml.Vector3f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AWT implements ModInitializer {
    public static final String MOD_ID = "awt";

    public static AddonExterior BAKER;
    public static AddonExterior SECOND;
    public static AddonExterior THIRD;

    private void registerAddonExteriors() {

    BAKER = new AddonExterior(PoliceBoxCategory.REFERENCE, MOD_ID, "baker").register();
        BAKER.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        BAKER.setDoor(new AddonExterior.Door(BAKER, true, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();


    SECOND = new AddonExterior(PoliceBoxCategory.REFERENCE, MOD_ID, "second_doctor").register();
        SECOND.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        SECOND.setDoor(new AddonExterior.Door(SECOND, true, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();


    THIRD = new AddonExterior(PoliceBoxCategory.REFERENCE, MOD_ID, "third_doctor").register();
        THIRD.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        THIRD.setDoor(new AddonExterior.Door(THIRD, true, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();
    }



    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModWorldGeneration.generateModWorldGen();
        registerAddonExteriors();


    }

    public static Identifier id(String path) {
        return new Identifier("awt", path);
    }

}