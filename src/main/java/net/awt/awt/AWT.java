package net.awt.awt;

import dev.amble.ait.data.schema.exterior.variant.addon.AddonExterior;
import net.awt.awt.block.ModBlocks;
import net.awt.awt.item.ModItemGroups;
import net.awt.awt.item.ModItems;
import net.awt.awt.sound.AWTSound;
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
    public static AddonExterior TORCHWOODCAPSULE;
    public static AddonExterior TYPEULTANDR;
    public static AddonExterior REDONION;
    public static AddonExterior YELLOWONION;
    public static AddonExterior BLUEONION;
    public static AddonExterior WHITEONION;
    public static AddonExterior PURPLEONION;
    public static AddonExterior GREYONION;
    public static AddonExterior PINKONION;
    public static AddonExterior LIGHTBLUEONION;
    public static AddonExterior LIMEGREENONION;
    public static AddonExterior STEAMPUNK;



    private void registerAddonExteriors() {

    BAKER = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "baker").register();
        BAKER.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        BAKER.setDoor(new AddonExterior.Door(BAKER, true, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();


    SECOND = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "second").register();
        SECOND.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        SECOND.setDoor(new AddonExterior.Door(SECOND, true, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();


    THIRD = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "third").register();
        THIRD.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        THIRD.setDoor(new AddonExterior.Door(THIRD, true, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        TORCHWOODCAPSULE = new AddonExterior(new Identifier(MOD_ID, "awtcapsules"), MOD_ID, "torchwoodcapsule").register();
        TORCHWOODCAPSULE.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        TORCHWOODCAPSULE.setDoor(new AddonExterior.Door(TORCHWOODCAPSULE, true, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        TYPEULTANDR = new AddonExterior(new Identifier(MOD_ID, "awtcapsules"), MOD_ID, "typeultandr").register();
        TYPEULTANDR.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        TYPEULTANDR.setDoor(new AddonExterior.Door(TYPEULTANDR, true, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();

        REDONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "redonion").register();
        REDONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        REDONION.setDoor(new AddonExterior.Door(REDONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        YELLOWONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "yellowonion").register();
        YELLOWONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        YELLOWONION.setDoor(new AddonExterior.Door(YELLOWONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        BLUEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "blueonion").register();
        BLUEONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        BLUEONION.setDoor(new AddonExterior.Door(BLUEONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        WHITEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "whiteonion").register();
        WHITEONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        WHITEONION.setDoor(new AddonExterior.Door(WHITEONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        PURPLEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "purpleonion").register();
        PURPLEONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        PURPLEONION.setDoor(new AddonExterior.Door(PURPLEONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        GREYONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "greyonion").register();
        GREYONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        GREYONION.setDoor(new AddonExterior.Door(GREYONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        PINKONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "pinkonion").register();
        PINKONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        PINKONION.setDoor(new AddonExterior.Door(PINKONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        LIGHTBLUEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "lightblueonion").register();
        LIGHTBLUEONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        LIGHTBLUEONION.setDoor(new AddonExterior.Door(LIGHTBLUEONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        LIMEGREENONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "limegreenonion").register();
        LIMEGREENONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        LIMEGREENONION.setDoor(new AddonExterior.Door(LIMEGREENONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        STEAMPUNK = new AddonExterior(new Identifier(MOD_ID, "awtcapsules"), MOD_ID, "steampunk").register();
        STEAMPUNK.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        STEAMPUNK.setDoor(new AddonExterior.Door(STEAMPUNK, true, SoundEvents.BLOCK_IRON_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE)).toDoor().register();


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