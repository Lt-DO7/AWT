package net.awt.awt.item.custom;

import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class VortexManipulator extends Item {
    public VortexManipulator(Settings settings) {
        super(settings.rarity(Rarity.RARE).maxCount(1).maxDamage(100).fireproof());
    }
}
