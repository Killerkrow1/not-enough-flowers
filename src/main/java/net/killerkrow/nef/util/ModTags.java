package net.killerkrow.nef.util;

import net.killerkrow.nef.NotEnoughFlowers;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> NEF_FLOWER =
                createTag("nef_flower");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(NotEnoughFlowers.MOD_ID, name));
        }
    }
}