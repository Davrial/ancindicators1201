
package net.davrial.ancindicators.item.custom;

import net.davrial.ancindicators.procedures.EraserRightclickedOnBlockProcedure;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.state.BlockState;

import java.util.stream.Stream;

public class Eraser1Item extends Item {
    public Eraser1Item() {
        super(new Properties());
    }

    @Override
    public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
        return Stream.of(BlockTags.create(new ResourceLocation("tag:all_erasable_blocks"))).anyMatch(blockstate::is) ? 0f : 1;
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        EraserRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
        return InteractionResult.SUCCESS;
    }
}
