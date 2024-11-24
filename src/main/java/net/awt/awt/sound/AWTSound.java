package net.awt.awt.sound;

import net.awt.awt.AWT;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class AWTSound {
	public static final SoundEvent BLOOP = register("bloop");

	public static SoundEvent register(String id) {
		Identifier identifier = new Identifier(AWT.MOD_ID, id);
		return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
	}
	public static void init() {
	}
}
