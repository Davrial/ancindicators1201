
package net.davrial.ancindicators.block.custom;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.material.MapColor;

public class DirectionalIndicatorBlockUpBlock extends Block {
	public DirectionalIndicatorBlockUpBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
