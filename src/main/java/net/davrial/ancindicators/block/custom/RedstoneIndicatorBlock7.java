package net.davrial.ancindicators.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.MapColor;


public class RedstoneIndicatorBlock7 extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;


	public RedstoneIndicatorBlock7() {

		super(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).sound(SoundType.BONE_BLOCK).mapColor(MapColor.FIRE).emissiveRendering((bs, br, bp) -> true));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));

	}

	/*public RedstoneIndicatorTemplateBlock() {
		super(BlockBehaviour.Properties.of()
		.instrument(NoteBlockInstrument.BASEDRUM)
		.mapColor(MapColor.FIRE).sound(SoundType.STONE)
		.strength(1f, 10f).hasPostProcess((bs, br, bp) -> true)
		.emissiveRendering((bs, br, bp) -> true));
	}*/


	//How much light is blocked
	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}


	//Does it emit redstone signal?
	@Override
	public boolean isSignalSource(BlockState state) {
		return true;
	}

	//What redstone signal strength?
	@Override
	public int getSignal(BlockState blockstate, BlockGetter blockAccess, BlockPos pos, Direction direction) {
		return 7;
	}

	//	^^^		REDSTONE SIGNAL POWER HERE		^^^


	//Does redstone always connect?
	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}

	//Rotation
	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

}