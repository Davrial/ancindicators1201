package net.davrial.ancindicators.block.custom;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class IndicatorSlabBlock extends SlabBlock {
	public IndicatorSlabBlock() {
		super(Properties.copy(Blocks.PACKED_MUD).sound(SoundType.BONE_BLOCK).mapColor(MapColor.QUARTZ).dynamicShape());
	}

}
