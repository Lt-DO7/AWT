package net.awt.awt.util;

import dev.pavatus.register.Registries;
import dev.pavatus.register.api.RegistryEvents;
import loqor.ait.api.AITModInitializer;
import net.awt.awt.door.AWTDoors;
import net.awt.awt.exterior.AWTExteriors;

public class AITUtil implements AITModInitializer {
	private static AITUtil instance;

	static {
		RegistryEvents.INIT.register(AITUtil::init);
	}

	@Override
	public void onInitializeAIT() {
		// this is called when AIT is ready to be registered to and used with, ait related logic should be placed here
		// fixme, ait is a mess so this is a lie ^
		if (isAITLoaded()) return;

		instance = this;

		AWTDoors.init();
		AWTExteriors.init();
	}

	public static void init(Registries registries, Registries.InitType type) {
		if (isAITLoaded()) return;

		instance = new AITUtil();
		instance.onInitializeAIT();
	}

	public static AITUtil instance() {
		return instance;
	}
	public static boolean isAITLoaded() {
		return instance() != null;
	}
}
