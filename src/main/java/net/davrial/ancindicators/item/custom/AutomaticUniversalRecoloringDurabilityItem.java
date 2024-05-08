
package net.davrial.ancindicators.item.custom;

import net.davrial.ancindicators.procedures.AutomaticUniversalRecoloringProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;

public class AutomaticUniversalRecoloringDurabilityItem extends Item {
    public AutomaticUniversalRecoloringDurabilityItem() {
        super(new Properties().durability(64));
    }



    @Override
    public int getEnchantmentValue() {
        return 1;
    }


    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
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
