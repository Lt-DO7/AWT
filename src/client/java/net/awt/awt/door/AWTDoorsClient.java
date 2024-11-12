package net.awt.awt.door;

import loqor.ait.data.schema.door.ClientDoorSchema;
import loqor.ait.registry.impl.door.ClientDoorRegistry;
import net.awt.awt.door.block.ClientTardisBlockDoor;

public class AWTDoorsClient {
	public static void init() {
		register(new ClientTardisBlockDoor());
	}
	public static void register(ClientDoorSchema schema) {
		ClientDoorRegistry.register(schema);
	}
}
