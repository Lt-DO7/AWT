package net.awt.awt.data.schema.exterior.category;

import loqor.ait.data.schema.exterior.ExteriorCategorySchema;
import loqor.ait.data.schema.exterior.ExteriorVariantSchema;
import net.awt.awt.AWT;
import net.awt.awt.exterior.AWTExteriors;
import net.minecraft.util.Identifier;

public class OnionCategory extends ExteriorCategorySchema {
    public static final Identifier REFERENCE = AWT.id("exterior/onion");

    public OnionCategory() {
        super(REFERENCE, "booth");
    }

    @Override
    public boolean hasPortals() {
        return true;
    }

    @Override
    public ExteriorVariantSchema getDefaultVariant() {
        return AWTExteriors.RED_ONION;
    }
}
