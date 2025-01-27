package net.awt.awt.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import javax.naming.Context;

public class VortexManipulator extends Item {
    public VortexManipulator(Settings settings) {
        super(settings.rarity(Rarity.RARE).maxCount(1).maxDamage(100).fireproof());
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {

        }
        return super.use(world, user, hand);
    }
}
