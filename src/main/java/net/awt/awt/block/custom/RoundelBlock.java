package net.awt.awt.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

public class RoundelBlock extends Block {
    public static final EnumProperty<Direction> FACING = EnumProperty.of("facing", Direction.class);

    public RoundelBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        // Get the player's facing direction (this will set the block to face the direction the player is facing)
        return this.getDefaultState().with(FACING, context.getPlayer().getHorizontalFacing());
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState facingState, WorldAccess world, BlockPos pos, BlockPos facingPos) {
        // Update the facing if a neighboring block is adjacent
        if (facing == state.get(FACING).getOpposite()) {
            return state.with(FACING, facing);
        }
        return super.getStateForNeighborUpdate(state, facing, facingState, world, pos, facingPos);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        // Add the facing property to the block's state manager
        builder.add(FACING);
    }
}