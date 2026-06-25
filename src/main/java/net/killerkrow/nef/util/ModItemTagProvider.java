package net.killerkrow.nef.util;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ItemTags.FLOWERS)
                .add(ModBlocks.ASTRAVEN.asItem(), ModBlocks.WOLFSBANE.asItem(), ModBlocks.KAGAMI_BUD.asItem(), ModBlocks.ROOTFERN.asItem(),
                        ModBlocks.AKAMI_ROSE.asItem(), ModBlocks.HANME.asItem(), ModBlocks.ASTRAVEN.asItem(), ModBlocks.MOONBLOOM.asItem(),
                        ModBlocks.SILVERTHORN.asItem(), ModBlocks.DAWN_LILLY.asItem(), ModBlocks.STARBRIGHT_PETAL.asItem(), ModBlocks.RENMI.asItem(),
                        ModBlocks.GILDED_ORCHID.asItem(), ModBlocks.THORNSHADE.asItem(), ModBlocks.MISTVINE.asItem(), ModBlocks.GLOWFERN.asItem(),
                        ModBlocks.FROST_PETAL.asItem(), ModBlocks.EMBERLOTUS.asItem(), ModBlocks.SPECTRAL_ORCHID.asItem(), ModBlocks.PHANTOM_LACE.asItem(),
                        ModBlocks.VOIDMOSS.asItem(), ModBlocks.SCARLET_CURL.asItem(), ModBlocks.STARSHADE.asItem(), ModBlocks.BRIMROSE.asItem(),
                        ModBlocks.GLASSLEAF.asItem(), ModBlocks.FLAMESPIRE.asItem(), ModBlocks.LUNAR_PEONY.asItem(), ModBlocks.BLOOMCROWN.asItem(),
                        ModBlocks.INFERNO_BELL.asItem(), ModBlocks.SEARLING.asItem(), ModBlocks.EBON_ROSE.asItem(), ModBlocks.FADEWISP.asItem(),
                        ModBlocks.GLOOMVINE.asItem(), ModBlocks.EMBERBRUSH.asItem(), ModBlocks.SPIRESAGE.asItem(), ModBlocks.BRIGHTBLOOM.asItem(),
                        ModBlocks.MIRAGE_LOTUS.asItem(), ModBlocks.SHADOWTHORN.asItem(), ModBlocks.ASHEN_BUD.asItem()
                );

        getOrCreateTagBuilder(ModTags.Items.NEF_FLOWER)
                .add(ModBlocks.ASTRAVEN.asItem(), ModBlocks.WOLFSBANE.asItem(), ModBlocks.KAGAMI_BUD.asItem(), ModBlocks.ROOTFERN.asItem(),
                        ModBlocks.AKAMI_ROSE.asItem(), ModBlocks.HANME.asItem(), ModBlocks.ASTRAVEN.asItem(), ModBlocks.MOONBLOOM.asItem(),
                        ModBlocks.SILVERTHORN.asItem(), ModBlocks.DAWN_LILLY.asItem(), ModBlocks.STARBRIGHT_PETAL.asItem(), ModBlocks.RENMI.asItem(),
                        ModBlocks.GILDED_ORCHID.asItem(), ModBlocks.THORNSHADE.asItem(), ModBlocks.MISTVINE.asItem(), ModBlocks.GLOWFERN.asItem(),
                        ModBlocks.FROST_PETAL.asItem(), ModBlocks.EMBERLOTUS.asItem(), ModBlocks.SPECTRAL_ORCHID.asItem(), ModBlocks.PHANTOM_LACE.asItem(),
                        ModBlocks.VOIDMOSS.asItem(), ModBlocks.SCARLET_CURL.asItem(), ModBlocks.STARSHADE.asItem(), ModBlocks.BRIMROSE.asItem(),
                        ModBlocks.GLASSLEAF.asItem(), ModBlocks.FLAMESPIRE.asItem(), ModBlocks.LUNAR_PEONY.asItem(), ModBlocks.BLOOMCROWN.asItem(),
                        ModBlocks.INFERNO_BELL.asItem(), ModBlocks.SEARLING.asItem(), ModBlocks.EBON_ROSE.asItem(), ModBlocks.FADEWISP.asItem(),
                        ModBlocks.GLOOMVINE.asItem(), ModBlocks.EMBERBRUSH.asItem(), ModBlocks.SPIRESAGE.asItem(), ModBlocks.BRIGHTBLOOM.asItem(),
                        ModBlocks.MIRAGE_LOTUS.asItem(), ModBlocks.SHADOWTHORN.asItem(), ModBlocks.ASHEN_BUD.asItem()
                );
    }
}