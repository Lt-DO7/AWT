package net.awt.awt.exterior;

import loqor.ait.data.schema.exterior.ClientExteriorVariantSchema;
import loqor.ait.registry.impl.exterior.ClientExteriorVariantRegistry;
import net.awt.awt.exterior.block.ClientTardisLogExteriorVariant;
import net.awt.awt.exterior.onion.ClientRedOnionVariant;

public class AWTExteriorsClient {
    public static void init() {
        register(new ClientTardisLogExteriorVariant());
        register(new ClientRedOnionVariant());
    }

    public static void register(ClientExteriorVariantSchema schema) {
        ClientExteriorVariantRegistry.getInstance().register(schema);
    }
}
