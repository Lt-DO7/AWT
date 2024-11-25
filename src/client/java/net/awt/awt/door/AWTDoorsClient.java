package net.awt.awt.door;

import loqor.ait.data.schema.door.ClientDoorSchema;
import loqor.ait.registry.impl.door.ClientDoorRegistry;
import net.awt.awt.door.block.ClientTardisBlockDoor;
import net.awt.awt.door.onion.ClientOnionDoor;

public class AWTDoorsClient {
	public static void init() {
		register(new ClientTardisBlockDoor());
		register(new ClientOnionDoor());
	}
	public static void register(ClientDoorSchema schema) {
		ClientDoorRegistry.register(schema);
	}
}
