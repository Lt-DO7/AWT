package net.awt.awt.door.block;

import loqor.ait.data.schema.door.DoorSchema;
import net.awt.awt.AWT;
import net.minecraft.util.Identifier;

public class TardisBlockDoorVariant extends DoorSchema {
	public static final Identifier REFERENCE = new Identifier(AWT.MOD_ID, "door/block");

	public TardisBlockDoorVariant() {
		super(REFERENCE);
	}

	@Override
	public boolean isDouble() {
		return false;
	}
}
