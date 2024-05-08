
package net.davrial.ancindicators.item.custom;

import net.davrial.ancindicators.procedures.ModNameAndBlockNameExtracterGetterProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class GetterStickItem extends Item {
    public GetterStickItem() {
        super(new Properties());
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        ModNameAndBlockNameExtracterGetterProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
        return InteractionResult.SUCCESS;
    }
}
