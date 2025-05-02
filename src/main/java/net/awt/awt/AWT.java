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
    public static AddonExterior REDONION;
    public static AddonExterior YELLOWONION;
    public static AddonExterior BLUEONION;
    public static AddonExterior WHITEONION;
    public static AddonExterior PURPLEONION;
    public static AddonExterior GREYONION;
    public static AddonExterior PINKONION;
    public static AddonExterior LIGHTBLUEONION;
    public static AddonExterior LIMEGREENONION;
    public static AddonExterior MULTIONION;



    private void registerAddonExteriors() {

    BAKER = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "baker").register();

        BAKER.setDoor(new AddonExterior.Door(BAKER, true, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_WOODEN_DOOR_CLOSE)).toDoor().register();
     //      .toDoor().register();
     //   BAKER.hasPortals();
     //   BAKER.setPortalTranslations((pos, b) -> {
     //       return switch(b) {
    //            case 0 -> pos.add(0, -0.35, -0.37); // NORTH
    //            case 1, 2, 3 -> pos.add(0, -0.35, -0.37); // NORTH EAST p n
    //            case 4 -> pos.add(0, -0.35, 0); // EAST
    //            case 5, 6, 7 -> pos.add(0, -0.35, 0.37); // SOUTH EAST p p
   //             case 8 -> pos.add(0, -0.35, 0.37); // SOUTH
    //            case 9, 10, 11 -> pos.add(-0, -0.35, 0.37); // SOUTH WEST n p
    //            case 12 -> pos.add(-0, -0.35, 0); // WEST
    //            case 13, 14, 15 -> pos.add(-0, -0.35, -0.37); // NORTH WEST n n
   //             default -> pos;
    //        };
   //     });
   //     BAKER.toDoor().setPortalTranslations((pos, b) -> {
   //         return switch(b) {
   //             case DOWN, UP -> pos;
   //             case NORTH -> pos.add(0, -0.2, -0.4);
   //             case SOUTH -> pos.add(0, -0.2, 0.4);
   //             case WEST -> pos.add(-0, -0.2, 0);
   //             case EAST -> pos.add(0, -0.2, 0);
   //         };
   //     });



    SECOND = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "second").register();
        SECOND.setDoor(new AddonExterior.Door(SECOND, true, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_WOODEN_DOOR_CLOSE)).toDoor().register();


    THIRD = new AddonExterior(new Identifier(MOD_ID, "awtboxes"), MOD_ID, "third").register();
        THIRD.setDoor(new AddonExterior.Door(THIRD, true, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, net.minecraft.sound.SoundEvents.BLOCK_WOODEN_DOOR_CLOSE)).toDoor().register();

        REDONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "redonion").register();
        REDONION.setDoor(new AddonExterior.Door(REDONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        YELLOWONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "yellowonion").register();
        YELLOWONION.setDoor(new AddonExterior.Door(YELLOWONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        BLUEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "blueonion").register();
        BLUEONION.setDoor(new AddonExterior.Door(BLUEONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        WHITEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "whiteonion").register();
        WHITEONION.setDoor(new AddonExterior.Door(WHITEONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        PURPLEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "purpleonion").register();
        PURPLEONION.setDoor(new AddonExterior.Door(PURPLEONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        GREYONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "greyonion").register();
        GREYONION.setDoor(new AddonExterior.Door(GREYONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        PINKONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "pinkonion").register();
        PINKONION.setDoor(new AddonExterior.Door(PINKONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        LIGHTBLUEONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "lightblueonion").register();
        LIGHTBLUEONION.setDoor(new AddonExterior.Door(LIGHTBLUEONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        LIMEGREENONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "limegreenonion").register();
        LIMEGREENONION.setDoor(new AddonExterior.Door(LIMEGREENONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

        MULTIONION = new AddonExterior(new Identifier(MOD_ID, "onion"), MOD_ID, "multionion").register();
        MULTIONION.setDoor(new AddonExterior.Door(MULTIONION, false, net.awt.awt.sound.AWTSound.BLOOP, net.awt.awt.sound.AWTSound.BLOOP)).toDoor().register();

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