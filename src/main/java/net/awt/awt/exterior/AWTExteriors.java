package net.awt.awt.exterior;

import dev.pavatus.register.api.RegistryEvents;
import loqor.ait.api.AITRegistryEvents;
import loqor.ait.data.schema.exterior.ExteriorVariantSchema;
import loqor.ait.registry.impl.exterior.ExteriorVariantRegistry;
import net.awt.awt.AWT;
import net.awt.awt.exterior.block.TardisLogExteriorVariant;
import net.awt.awt.exterior.onion.RedOnionExteriorVariant;
import net.minecraft.util.Identifier;

import java.util.LinkedList;
import java.util.Objects;

public class AWTExteriors {
	private static final LinkedList<ExteriorVariantSchema> EXTERIORS = new LinkedList<>();

	static {
		AITRegistryEvents.EXTERIOR_DEFAULTS.register(() -> {
			ExteriorVariantRegistry registry = ExteriorVariantRegistry.getInstance();
			EXTERIORS.forEach(registry::register);
			AWT.LOGGER.info("Registered {} exterior variants", EXTERIORS.size());
		});
	}

	public static void init() {
		register(new TardisLogExteriorVariant());
		register(new RedOnionExteriorVariant());
	}

	public static void register(ExteriorVariantSchema schema) {
		EXTERIORS.add(schema);
	}
}
