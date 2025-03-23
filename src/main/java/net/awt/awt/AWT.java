package net.awt.awt;

import net.awt.awt.block.ModBlocks;
import net.awt.awt.item.ModItemGroups;
import net.awt.awt.item.ModItems;
import net.awt.awt.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AWT implements ModInitializer {
    public static final String MOD_ID = "awt";

    public static AddonExterior BAKER;

    @Override

    public void onInitialize() {

        registerAddonExteriors();

        RegistryContainer.register(AWTItems.class, MOD_ID);

        RegistryContainer.register(AWTBlocks.class, MOD_ID);

        RegistryContainer.register(AWTBlockEntityTypes.class, MOD_ID);

    }

    private void registerAddonExteriors() {

    BAKER = new AddonExterior(PoliceBoxCategory.REFERENCE, MOD_ID, "baker").register();



        BAKER.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));


        BAKER.setDoor(new AddonExterior.Door(


    BAKER, false, SoundEvents.BLOCK_IRON_DOOR_OPEN,


    net.minecraft.sound.SoundEvents.BLOCK_IRON_DOOR_CLOSE))


            .toDoor().register();
    }





    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModWorldGeneration.generateModWorldGen();
    }

    public static Identifier id(String path) {
        return new Identifier("awt", path);
    }
}