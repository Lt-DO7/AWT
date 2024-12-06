package net.awt.awt.door.lego;

import loqor.ait.data.schema.door.DoorSchema;
import net.awt.awt.AWT;
import net.awt.awt.sound.AWTSound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

public class LegoDoorVariant extends DoorSchema {
    public static final Identifier REFERENCE = new Identifier(AWT.MOD_ID, "door/lego");

    public LegoDoorVariant() {
        super(REFERENCE);
    }

    @Override
    public boolean isDouble() {
        return false; // Assuming Lego doors are single doors
    }

    @Override
    public SoundEvent openSound() {
        return AWTSound.BLOOP; // Replace with a specific sound for Lego doors if desired
    }

    @Override
    public SoundEvent closeSound() {
        return AWTSound.BLOOP; // Replace with a specific sound for Lego doors if desired
    }

    @Override
    public Vec3d adjustPortalPos(Vec3d pos, Direction direction) {
        return switch (direction) {
            case DOWN, UP -> pos;
            case NORTH -> pos.add(0.0, 0.1, -0.4);
            case SOUTH -> pos.add(0.0, 0.1, 0.4);
            case WEST -> pos.add(-0.4, 0.1, 0.0);
            case EAST -> pos.add(0.4, 0.1, 0.0);
        };
    }
}