package net.awt.awt.block.custom;

import loqor.ait.core.AITBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.State;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class time_grower extends Block {

    public time_grower(Settings settings) {
        super(settings);
    }
    // This method is responsible for growing crops (speeding up the growth)
    private void grow(World world, BlockPos pos, BlockState state) {
        if (state.getBlock() instanceof PlantBlock cropBlock) {
            int currentAge = cropBlock.getAge(state);
            int maxAge = cropBlock.getMaxAge();


            // If the plant isn't fully grown, increase its growth stage
            if (currentAge < maxAge) {
                // Increase age (grow faster)
                BlockState newState = cropBlock.withage(currentAge + 1); // Get the new BlockState with increased age
                world.setBlockState(pos, newState, 3); // Update the block state to reflect the new age
            }
        }
    }

    // This method is called every tick to check and grow nearby plants
    public void onTick(World world, BlockPos pos, BlockState state) {
        // Create a 16-block radius around the block to check for plants
        Box box = new Box(pos.add(-16, -16, -16), pos.add(16, 16, 16));

        // Iterate through all blocks within the 16-block radius
        for (int x = -16; x <= 16; x++) {
            for (int y = -16; y <= 16; y++) {
                for (int z = -16; z <= 16; z++) {
                    BlockPos blockPos = pos.add(x, y, z);
                    BlockState nearbyBlockState = world.getBlockState(blockPos);
                    Block nearbyBlock = nearbyBlockState.getBlock();

                    // If the block is a CropBlock (e.g., wheat, carrots), speed up its growth
                    if (nearbyBlock instanceof CropBlock) {
                        grow(world, blockPos, nearbyBlockState);
                    }
                }
            }
        }

        // Add the yellow particle border effect around the 16x16 area
        addYellowParticleBorder(world, pos);
    }

    // Add yellow particle effects along the 16x16 border
    private void addYellowParticleBorder(World world, BlockPos pos) {
        // Check if the world is a ServerWorld, because particle effects should be on the client
        if (world instanceof ServerWorld) {
            // Loop over the 16x16 area around the block to create particles
            for (int x = -16; x <= 16; x++) {
                for (int z = -16; z <= 16; z++) {
                    // Only create particles along the edge of the box (border)
                    if (Math.abs(x) == 16 || Math.abs(z) == 16) {
                        // Calculate the particle positions and spawn them
                        BlockPos particlePos = pos.add(x, 0, z);
                        // Spawn a flash particle at the border of the 16x16 area
                        ((ServerWorld) world).spawnParticles(ParticleTypes.FLASH, particlePos.getX() + 0.5, particlePos.getY() + 0.5, particlePos.getZ() + 0.5, 1, 0.0, 0.0, 0.0, 0.1);
                    }
                }
            }
        }
    }
}