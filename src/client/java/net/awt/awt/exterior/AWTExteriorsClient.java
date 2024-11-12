package net.awt.awt.exterior;

import loqor.ait.data.schema.exterior.ClientExteriorVariantSchema;
import loqor.ait.registry.impl.exterior.ClientExteriorVariantRegistry;
import net.awt.awt.exterior.block.ClientTardisLogExteriorVariant;

public class AWTExteriorsClient {
	public static void init() {
		register(new ClientTardisLogExteriorVariant());
	}
	public static void register(ClientExteriorVariantSchema schema) {
		ClientExteriorVariantRegistry.getInstance().register(schema);
	}
}
