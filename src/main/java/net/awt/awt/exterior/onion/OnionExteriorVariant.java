package net.awt.awt.exterior.onion;

import loqor.ait.core.blockentities.ExteriorBlockEntity;
import loqor.ait.core.tardis.animation.ExteriorAnimation;
import loqor.ait.data.Loyalty;
import loqor.ait.data.schema.door.DoorSchema;
import loqor.ait.data.schema.exterior.ExteriorVariantSchema;
import loqor.ait.data.schema.exterior.category.AdaptiveCategory;
import loqor.ait.registry.impl.door.DoorRegistry;
import net.awt.awt.AWT;
import net.awt.awt.animation.OnionAnimation;
import net.awt.awt.door.onion.OnionDoorVariant;
import net.minecraft.util.Identifier;

public abstract class OnionExteriorVariant extends ExteriorVariantSchema {
    protected OnionExteriorVariant(String name) {
        super(AdaptiveCategory.REFERENCE, new Identifier(AWT.MOD_ID, "exterior/onion/" + name),
                new Loyalty(Loyalty.Type.OWNER));
    }

    @Override
    public ExteriorAnimation animation(ExteriorBlockEntity be) {
        return new OnionAnimation(be);
    }

    @Override
    public DoorSchema door() {
        return DoorRegistry.REGISTRY.get(OnionDoorVariant.REFERENCE);
    }
}