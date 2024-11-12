package net.awt.awt.door;

import loqor.ait.data.schema.door.DoorSchema;
import loqor.ait.registry.impl.door.DoorRegistry;
import net.awt.awt.door.block.TardisBlockDoorVariant;

public class AWTDoors {
	public static void init() {
		register(new TardisBlockDoorVariant());
	}

	public static void register(DoorSchema schema) {
		DoorRegistry.register(schema);
	}
}
