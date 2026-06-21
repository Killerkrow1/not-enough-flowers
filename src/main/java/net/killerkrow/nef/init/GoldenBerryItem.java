package net.killerkrow.nef.init;

import net.killerkrow.nef.util.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GoldenBerryItem extends Item {
    public GoldenBerryItem(Item.Settings settings) {
        super(settings);
    }


    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Enables the enchanted shimmer
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient() && user instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) user;

            ItemStack rewardItem = new ItemStack(ModItems.REVERENCE_STEM);

            if (!player.getInventory().insertStack(rewardItem)) {
                player.dropItem(rewardItem, false);
            }
        }

        return super.finishUsing(stack, world, user);
    }
}