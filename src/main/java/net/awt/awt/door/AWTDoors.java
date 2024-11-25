package net.awt.awt.door;

import loqor.ait.data.schema.door.DoorSchema;
import loqor.ait.registry.impl.door.DoorRegistry;
import net.awt.awt.door.block.TardisBlockDoorVariant;
import net.awt.awt.door.onion.OnionDoorVariant;

public class AWTDoors {
	public static void init() {
		register(new TardisBlockDoorVariant());
		register(new OnionDoorVariant());
	}

	public static void register(DoorSchema schema) {
		DoorRegistry.register(schema);
	}
}
