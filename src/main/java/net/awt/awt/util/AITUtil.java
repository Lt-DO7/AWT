package net.awt.awt.util;

import loqor.ait.api.AITModInitializer;
import net.awt.awt.AWT;
import net.awt.awt.door.AWTDoors;
import net.awt.awt.exterior.AWTExteriors;

public class AITUtil implements AITModInitializer {
    private static AITUtil instance;

    @Override
    public void onInitializeAIT() {
        // this is called when AIT is ready to be registered to and used with, ait related logic should be placed here
        if (isAITLoaded()) return;

        AWT.LOGGER.info("Initializing AITUtil");
        instance = this;

        AWTDoors.init();
        AWTExteriors.init();
    }

    public static AITUtil instance() {
        return instance;
    }

    public static boolean isAITLoaded() {
        return instance() != null;
    }
}
