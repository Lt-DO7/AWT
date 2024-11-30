package net.awt.awt.block.custom;

import loqor.ait.core.blocks.CoralPlantBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.random.Random;


public class TimeGrowerBlock extends Block {

    public TimeGrowerBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        // Define the 16x16x16 area around the TimeGrower block
        Box growthArea = new Box(pos.add(-8, -8, -8), pos.add(8, 8, 8));

        // Iterate over each block position within the defined area
        for (BlockPos blockPos : BlockPos.iterate(
                new BlockPos((int) growthArea.minX, (int) growthArea.minY, (int) growthArea.minZ),
                new BlockPos((int) growthArea.maxX, (int) growthArea.maxY, (int) growthArea.maxZ))) {

            BlockState blockState = world.getBlockState(blockPos);
            Block block = blockState.getBlock();

            // Check if the block is a CropBlock or CoralPlantBlock
            if (block instanceof CropBlock cropBlock) {
                updateBlockAge(world, blockPos, blockState, cropBlock.getMaxAge(), CropBlock.AGE);
            } else if (block instanceof CoralPlantBlock coralPlantBlock) {
                updateBlockAge(world, blockPos, blockState, coralPlantBlock.getMaxAge(), CoralPlantBlock.AGE);
            }
        }

        // Schedule the next tick for periodic crop growth acceleration
        world.scheduleBlockTick(pos, this, 10); // Adjust the tick rate if needed (20 ticks = 1 second)
    }

    private static void updateBlockAge(ServerWorld world, BlockPos pos, BlockState state, int maxAge, IntProperty ageProperty) {
        int age = state.get(ageProperty);

        // Check if the block is not fully grown
        if (age < maxAge) {
            // Increment the block age by an amount
            world.setBlockState(pos, state.with(ageProperty, Math.min(age + 100, maxAge)));
        }
    }
}
