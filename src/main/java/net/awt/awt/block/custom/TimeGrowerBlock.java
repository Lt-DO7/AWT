package net.awt.awt.block.custom;

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

			// Check if the block is a CropBlock
			if (block instanceof CropBlock cropBlock) {
				IntProperty ageProperty = CropBlock.AGE; // Assuming this property is accessible for standard crops
				int currentAge = blockState.get(ageProperty);
				int maxAge = cropBlock.getMaxAge();

				// Increase the crop's age if it's not fully grown
				if (currentAge < maxAge) {
					world.setBlockState(blockPos, blockState.with(ageProperty, Math.min(currentAge + 5, maxAge)), 2);
				}
			}
		}

		// Schedule the next tick for periodic crop growth acceleration
		world.scheduleBlockTick(pos, this, 20); // Adjust the tick rate if needed (20 ticks = 1 second)
	}
}
