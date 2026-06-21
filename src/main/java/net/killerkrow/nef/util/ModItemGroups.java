package net.killerkrow.nef.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.killerkrow.nef.NotEnoughFlowers;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NOT_ENOUGH_FLOWERS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NotEnoughFlowers.MOD_ID, "astraven_logo"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.nef_flower_tab"))
                    .icon(() -> new ItemStack(ModBlocks.ASTRAVEN)).entries((displayContext, entries) -> {

                        entries.add(ModItems.REVERENCE_STEM);
                        entries.add(ModItems.REVERENCE_BERRY);
                        entries.add(ModItems.BOWL_OF_REVERENCE_BERRIES);
                        entries.add(ModItems.GOLDEN_REVERENCE_BERRY);
                        entries.add(ModBlocks.ASTRAVEN);
                        entries.add(ModBlocks.WOLFSBANE);
                        entries.add(ModBlocks.KAGAMI_BUD);
                        entries.add(ModBlocks.ROOTFERN);
                        entries.add(ModBlocks.AKAMI_ROSE);
                        entries.add(ModBlocks.HANME);
                        entries.add(ModBlocks.ASHEN_BUD);
                        entries.add(ModBlocks.MOONBLOOM);
                        entries.add(ModBlocks.SHADOWTHORN);
                        entries.add(ModBlocks.SILVERTHORN);
                        entries.add(ModBlocks.DAWN_LILLY);
                        entries.add(ModBlocks.STARBRIGHT_PETAL);
                        entries.add(ModBlocks.RENMI);
                        entries.add(ModBlocks.GILDED_ORCHID);
                        entries.add(ModBlocks.THORNSHADE);
                        entries.add(ModBlocks.MISTVINE);
                        entries.add(ModBlocks.GLOWFERN);
                        entries.add(ModBlocks.FROST_PETAL);
                        entries.add(ModBlocks.EMBERLOTUS);
                        entries.add(ModBlocks.SPECTRAL_ORCHID);
                        entries.add(ModBlocks.PHANTOM_LACE);
                        entries.add(ModBlocks.VOIDMOSS);
                        entries.add(ModBlocks.SCARLET_CURL);
                        entries.add(ModBlocks.STARSHADE);
                        entries.add(ModBlocks.BRIMROSE);
                        entries.add(ModBlocks.GLASSLEAF);
                        entries.add(ModBlocks.FLAMESPIRE);
                        entries.add(ModBlocks.LUNAR_PEONY);
                        entries.add(ModBlocks.BLOOMCROWN);
                        entries.add(ModBlocks.INFERNO_BELL);
                        entries.add(ModBlocks.SEARLING);
                        entries.add(ModBlocks.EBON_ROSE);
                        entries.add(ModBlocks.FADEWISP);
                        entries.add(ModBlocks.GLOOMVINE);
                        entries.add(ModBlocks.EMBERBRUSH);
                        entries.add(ModBlocks.SPIRESAGE);
                        entries.add(ModBlocks.BRIGHTBLOOM);
                        entries.add(ModBlocks.MIRAGE_LOTUS);

                    }).build());

    public static void registerItemGroups() {
        NotEnoughFlowers.LOGGER.info("Registering Item Groups for " + NotEnoughFlowers.MOD_ID);
    }
}
