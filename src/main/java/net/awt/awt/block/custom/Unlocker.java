package net.awt.awt.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.random.Random;
public class Unlocker {


    public class unlocker extends Block {

        public unlocker(Settings settings) {
            super(settings);
        }

        @Override
        public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            // Define the 4x4x4 area around the Unlocker block
            Box detectionArea = new Box(pos.add(-1, -1, -1), pos.add(1, 1, 1));

            // Iterate over each block position within the defined area
            for (BlockPos blockPos : BlockPos.iterate(
                    new BlockPos((int) detectionArea.minX, (int) detectionArea.minY, (int) detectionArea.minZ),
                    new BlockPos((int) detectionArea.maxX, (int) detectionArea.maxY, (int) detectionArea.maxZ))) {

                BlockState blockState = world.getBlockState(blockPos);
                Block block = blockState.getBlock();


                 // Schedule the next tick
                world.scheduleBlockTick(pos, this, 10); // Adjust the tick rate if needed (20 ticks = 1 second)
            }
        }
    }
}