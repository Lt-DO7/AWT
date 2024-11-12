package net.awt.awt;

import net.awt.awt.door.AWTDoorsClient;
import net.awt.awt.exterior.AWTExteriorsClient;
import net.fabricmc.api.ClientModInitializer;

public class AWTClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.

		AWTDoorsClient.init();
		AWTExteriorsClient.init();
	}
}