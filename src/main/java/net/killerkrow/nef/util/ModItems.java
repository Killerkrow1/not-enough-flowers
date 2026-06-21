package net.killerkrow.nef.util;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killerkrow.nef.NotEnoughFlowers;
import net.killerkrow.nef.init.BerryItem;
import net.killerkrow.nef.init.GoldenBerryItem;
import net.minecraft.item.Item;
import net.minecraft.item.StewItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item REVERENCE_BERRY = registerItem("reverence_berry",
            new BerryItem(ModBlocks.REVERENCE_VINES, new FabricItemSettings().food(ModFoodComponents.REVERENCE_BERRY)));
    public static final Item GOLDEN_REVERENCE_BERRY = registerItem("golden_reverence_berry",
            new GoldenBerryItem(new FabricItemSettings().food(ModFoodComponents.GOLDEN_REVERENCE_BERRY).maxCount(16)));
    public static final Item REVERENCE_STEM = registerItem("reverence_stem",
            new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_STEM)));
    public static final Item BOWL_OF_REVERENCE_BERRIES = registerItem("bowl_of_reverence_berries",
            new StewItem(new FabricItemSettings().food(ModFoodComponents.BOWL_OF_REVERENCE_BERRIES).maxCount(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NotEnoughFlowers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NotEnoughFlowers.LOGGER.info("Registering Mod Items for " + NotEnoughFlowers.MOD_ID);
    }
}
