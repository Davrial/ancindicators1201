
package net.davrial.ancindicators.item.custom;

import net.davrial.ancindicators.procedures.VoILLightingProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

import java.util.List;

public class VesselOfInfiniteLightItem extends Item {
    public VesselOfInfiniteLightItem() {
        super(new Properties());
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
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        VoILLightingProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, level, list, flag);
        list.add(Component.literal("§4Uncraftable, Creative Only"));
        list.add(Component.literal("§4A for-fun item that spawns light blocks"));
        list.add(Component.literal("§7Unfortunately does not currently work. Dark does, Light doesnt"));
        list.add(Component.literal("§7No idea why as I changed nothing since last testing both"));
    }
}
