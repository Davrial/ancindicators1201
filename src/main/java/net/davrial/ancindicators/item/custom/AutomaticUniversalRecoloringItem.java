
package net.davrial.ancindicators.item.custom;

import net.davrial.ancindicators.procedures.AutomaticUniversalRecoloringProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;

public class AutomaticUniversalRecoloringItem extends Item {
    public AutomaticUniversalRecoloringItem() {
        super(new Properties());
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        AutomaticUniversalRecoloringProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
        return InteractionResult.SUCCESS;
    }
}
