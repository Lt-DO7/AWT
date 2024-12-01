package net.awt.awt.exterior.onion;

import net.minecraft.util.Identifier;

public class ClientGreyOnionVariant extends ClientOnionVariant {
    public ClientGreyOnionVariant() {
        super("grey");
    }

    @Override
    public Identifier emission() {
        return null;
    }
}
