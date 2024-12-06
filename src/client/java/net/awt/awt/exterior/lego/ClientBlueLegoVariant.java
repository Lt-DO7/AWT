package net.awt.awt.exterior.lego;

import net.minecraft.util.Identifier;

public class ClientBlueLegoVariant extends ClientLegoVariant {
    public ClientBlueLegoVariant() {
        super("red");
    }

    @Override
    public Identifier emission() {
        return null; // No emission texture for the blue Lego variant
    }
}