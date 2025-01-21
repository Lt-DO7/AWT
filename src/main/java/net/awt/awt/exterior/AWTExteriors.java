package net.awt.awt.exterior;

import com.mojang.serialization.Codec;
import dev.pavatus.register.unlockable.UnlockableRegistry;
import loqor.ait.api.AITRegistryEvents;
import loqor.ait.data.schema.exterior.ExteriorVariantSchema;
import loqor.ait.registry.impl.exterior.ExteriorVariantRegistry;
import net.awt.awt.AWT;
import net.awt.awt.exterior.block.TardisLogExteriorVariant;
import net.awt.awt.exterior.lego.BlueLegoExteriorVariant;
import net.awt.awt.exterior.onion.*;
import net.minecraft.util.Identifier;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.function.Function;

public class AWTExteriors extends UnlockableRegistry<ExteriorVariantSchema> {
    private static final LinkedList<ExteriorVariantSchema> EXTERIORS = new LinkedList<>();


    static {
        AITRegistryEvents.EXTERIOR_DEFAULTS.register(() -> {
            ExteriorVariantRegistry registry = ExteriorVariantRegistry.getInstance();
            EXTERIORS.forEach(registry::register);
            AWT.LOGGER.info("Registered {} exterior variants", EXTERIORS.size());
        });
    }

    protected AWTExteriors(Function<InputStream, ExteriorVariantSchema> deserializer, Codec<ExteriorVariantSchema> codec, Identifier packet, Identifier name, boolean sync) {
        super(deserializer, codec, packet, name, sync);
    }

    @Override
    public ExteriorVariantSchema fallback() {
        return ExteriorVariantRegistry.CAPSULE_DEFAULT;
    }

    public static ExteriorVariantSchema TARDIS_LOG;
    public static ExteriorVariantSchema RED_ONION;
    public static ExteriorVariantSchema YELLOW_ONION;
    public static ExteriorVariantSchema BLUE_ONION;
    public static ExteriorVariantSchema LIGHT_BLUE_ONION;
    public static ExteriorVariantSchema GREY_ONION;
    public static ExteriorVariantSchema LIME_ONION;
    public static ExteriorVariantSchema PINK_ONION;
    public static ExteriorVariantSchema PURPLE_ONION;
    public static ExteriorVariantSchema WHITE_ONION;
    public static ExteriorVariantSchema BLUE_LEGO_ONION;


    @Override
    protected void defaults() {
        TARDIS_LOG = register(new TardisLogExteriorVariant());
        RED_ONION = register(new RedOnionExteriorVariant());
        YELLOW_ONION =register(new YellowOnionExteriorVariant());
        BLUE_ONION = register(new BlueOnionExteriorVariant());
       LIGHT_BLUE_ONION = register(new LightBlueOnionExteriorVariant());
        GREY_ONION = register(new GreyOnionExteriorVariant());
       LIME_ONION = register(new LimeOnionExteriorVariant());
       PINK_ONION = register(new PinkOnionExteriorVariant());
       PURPLE_ONION = register(new PurpleOnionExteriorVariant());
       WHITE_ONION = register(new WhiteOnionExteriorVariant());
       BLUE_LEGO_ONION = register(new BlueLegoExteriorVariant());
    }
}
