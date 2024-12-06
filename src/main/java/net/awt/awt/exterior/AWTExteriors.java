package net.awt.awt.exterior;

import loqor.ait.api.AITRegistryEvents;
import loqor.ait.data.schema.exterior.ExteriorVariantSchema;
import loqor.ait.registry.impl.exterior.ExteriorVariantRegistry;
import net.awt.awt.AWT;
import net.awt.awt.exterior.block.TardisLogExteriorVariant;
import net.awt.awt.exterior.lego.BlueLegoExteriorVariant;
import net.awt.awt.exterior.onion.*;

import java.util.LinkedList;

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
        register(new YellowOnionExteriorVariant());
        register(new BlueOnionExteriorVariant());
        register(new LightBlueOnionExteriorVariant());
        register(new GreyOnionExteriorVariant());
        register(new LimeOnionExteriorVariant());
        register(new PinkOnionExteriorVariant());
        register(new PurpleOnionExteriorVariant());
        register(new WhiteOnionExteriorVariant());
        register(new BlueLegoExteriorVariant());
    }

    public static void register(ExteriorVariantSchema schema) {
        EXTERIORS.add(schema);
    }
}
