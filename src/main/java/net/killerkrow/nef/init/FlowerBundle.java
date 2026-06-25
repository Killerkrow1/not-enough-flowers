package net.killerkrow.nef.init;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlowerBundle extends Item {
    // Define the tag key pointing to your modded tag (e.g., "mymod:my_tag")
    private static final TagKey<Item> NEF_FLOWER = TagKey.of(RegistryKeys.ITEM, new Identifier("nef", "nef_flower"));
    private static final TagKey<Item> FLOWER = TagKey.of(RegistryKeys.ITEM, new Identifier("minecraft", "flowers"));
    private final Random random = new Random();

    public FlowerBundle(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        if (!world.isClient() && !user.isSneaking()) {
            // Every item from that tag list
            var optionalTag = world.getRegistryManager().get(RegistryKeys.ITEM).getEntryList(NEF_FLOWER);

            if (optionalTag.isPresent()) {
                List<RegistryEntry<Item>> tagEntries = optionalTag.get().stream().toList();

                if (!tagEntries.isEmpty()) {
                    for (int i = 0; i < 5; i++) {
                        RegistryEntry<Item> randomEntry = tagEntries.get(random.nextInt(tagEntries.size()));
                        ItemStack rewardStack = new ItemStack(randomEntry.value());

                        if (!user.getInventory().insertStack(rewardStack)) {
                            user.dropItem(rewardStack, false);
                        }
                    }

                    // I got hungry
                    if (!user.getAbilities().creativeMode) {
                        itemStack.decrement(1);
                    }

                    // mp3 go
                    world.playSound(null, user.getX(), user.getY(), user.getZ(),
                            SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1.0F, 1.0F);

                    return TypedActionResult.success(itemStack, true);
                }
            }
            return TypedActionResult.pass(itemStack);
        }
        else {
            // Every item from that tag list
            var optionalTag = world.getRegistryManager().get(RegistryKeys.ITEM).getEntryList(FLOWER);

            if (optionalTag.isPresent()) {
                List<RegistryEntry<Item>> tagEntries = optionalTag.get().stream().toList();

                if (!tagEntries.isEmpty()) {
                    for (int i = 0; i < 5; i++) {
                        RegistryEntry<Item> randomEntry = tagEntries.get(random.nextInt(tagEntries.size()));
                        ItemStack rewardStack = new ItemStack(randomEntry.value());

                        if (!user.getInventory().insertStack(rewardStack)) {
                            user.dropItem(rewardStack, false);
                        }
                    }

                    // I got hungry
                    if (!user.getAbilities().creativeMode) {
                        itemStack.decrement(1);
                    }

                    // mp3 go
                    world.playSound(null, user.getX(), user.getY(), user.getZ(),
                            SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1.0F, 1.0F);

                    return TypedActionResult.success(itemStack, true);
                }
            }
        }
        return TypedActionResult.pass(itemStack);
    }

    // tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.nef.flowerbundle.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("[SHIFT]").formatted(Formatting.DARK_GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}