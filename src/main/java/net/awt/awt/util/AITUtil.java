package net.awt.awt.util;

import loqor.ait.api.AITModInitializer;

public class AITUtil implements AITModInitializer {
	private static AITUtil instance;

	@Override
	public void onInitializeAIT() {
		// this is called when AIT is ready to be registered to and used with, ait related logic should be placed here
		instance = this;
	}

	public static AITUtil instance() {
		return instance;
	}
	public static boolean isAITLoaded() {
		return instance() != null;
	}
}
