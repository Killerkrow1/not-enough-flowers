package net.killerkrow.nef.util;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.killerkrow.nef.NotEnoughFlowers;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MAGENTA_DYE)
                .input(ModBlocks.WOLFSBANE)
                .criterion(hasItem(ModBlocks.WOLFSBANE), conditionsFromItem(ModBlocks.WOLFSBANE))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_wolfsbane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CYAN_DYE)
                .input(ModBlocks.KAGAMI_BUD)
                .criterion(hasItem(ModBlocks.KAGAMI_BUD), conditionsFromItem(ModBlocks.KAGAMI_BUD))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_kagami_bud"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BROWN_DYE)
                .input(ModBlocks.ROOTFERN)
                .criterion(hasItem(ModBlocks.ROOTFERN), conditionsFromItem(ModBlocks.ROOTFERN))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_rootfern"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLUE_DYE)
                .input(ModBlocks.AKAMI_ROSE)
                .criterion(hasItem(ModBlocks.AKAMI_ROSE), conditionsFromItem(ModBlocks.AKAMI_ROSE))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_akami_rose"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(ModBlocks.MOONBLOOM)
                .criterion(hasItem(ModBlocks.MOONBLOOM), conditionsFromItem(ModBlocks.MOONBLOOM))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_moonbloom"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLACK_DYE)
                .input(ModBlocks.SILVERTHORN)
                .criterion(hasItem(ModBlocks.SILVERTHORN), conditionsFromItem(ModBlocks.SILVERTHORN))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_silverthorn"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.DAWN_LILLY)
                .criterion(hasItem(ModBlocks.DAWN_LILLY), conditionsFromItem(ModBlocks.DAWN_LILLY))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_dawn_lilly"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.STARBRIGHT_PETAL)
                .criterion(hasItem(ModBlocks.STARBRIGHT_PETAL), conditionsFromItem(ModBlocks.STARBRIGHT_PETAL))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_starbright_petal"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.RENMI)
                .criterion(hasItem(ModBlocks.RENMI), conditionsFromItem(ModBlocks.RENMI))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_renmi"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.GILDED_ORCHID)
                .criterion(hasItem(ModBlocks.GILDED_ORCHID), conditionsFromItem(ModBlocks.GILDED_ORCHID))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_gilded_orchid"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RED_DYE)
                .input(ModBlocks.THORNSHADE)
                .criterion(hasItem(ModBlocks.THORNSHADE), conditionsFromItem(ModBlocks.THORNSHADE))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_thornshade"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GRAY_DYE)
                .input(ModBlocks.MISTVINE)
                .criterion(hasItem(ModBlocks.MISTVINE), conditionsFromItem(ModBlocks.MISTVINE))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_mistvine"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.GLOWFERN)
                .criterion(hasItem(ModBlocks.GLOWFERN), conditionsFromItem(ModBlocks.GLOWFERN))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_glowfern"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.FROST_PETAL)
                .criterion(hasItem(ModBlocks.FROST_PETAL), conditionsFromItem(ModBlocks.FROST_PETAL))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_frost_petal"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.EMBERLOTUS)
                .criterion(hasItem(ModBlocks.EMBERLOTUS), conditionsFromItem(ModBlocks.EMBERLOTUS))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_emberlotus"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE)
                .input(ModBlocks.SPECTRAL_ORCHID)
                .criterion(hasItem(ModBlocks.SPECTRAL_ORCHID), conditionsFromItem(ModBlocks.SPECTRAL_ORCHID))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_spectral_orchid"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.PHANTOM_LACE)
                .criterion(hasItem(ModBlocks.PHANTOM_LACE), conditionsFromItem(ModBlocks.PHANTOM_LACE))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_phanom_lace"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MAGENTA_DYE)
                .input(ModBlocks.VOIDMOSS)
                .criterion(hasItem(ModBlocks.VOIDMOSS), conditionsFromItem(ModBlocks.VOIDMOSS))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_voidmoss"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RED_DYE)
                .input(ModBlocks.SCARLET_CURL)
                .criterion(hasItem(ModBlocks.SCARLET_CURL), conditionsFromItem(ModBlocks.SCARLET_CURL))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_scarlet_curl"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.STARSHADE)
                .criterion(hasItem(ModBlocks.STARSHADE), conditionsFromItem(ModBlocks.STARSHADE))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_starshade"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIME_DYE)
                .input(ModBlocks.BRIMROSE)
                .criterion(hasItem(ModBlocks.BRIMROSE), conditionsFromItem(ModBlocks.BRIMROSE))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_brimrose"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GREEN_DYE)
                .input(ModBlocks.GLASSLEAF)
                .criterion(hasItem(ModBlocks.GLASSLEAF), conditionsFromItem(ModBlocks.GLASSLEAF))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_grassleaf"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE)
                .input(ModBlocks.FLAMESPIRE)
                .criterion(hasItem(ModBlocks.FLAMESPIRE), conditionsFromItem(ModBlocks.FLAMESPIRE))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_flamespire"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.LUNAR_PEONY)
                .criterion(hasItem(ModBlocks.LUNAR_PEONY), conditionsFromItem(ModBlocks.LUNAR_PEONY))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_lunar_peony"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.BLOOMCROWN)
                .criterion(hasItem(ModBlocks.BLOOMCROWN), conditionsFromItem(ModBlocks.BLOOMCROWN))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_bloomcrown"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE)
                .input(ModBlocks.INFERNO_BELL)
                .criterion(hasItem(ModBlocks.INFERNO_BELL), conditionsFromItem(ModBlocks.INFERNO_BELL))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_inferno_bell"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE)
                .input(ModBlocks.SEARLING)
                .criterion(hasItem(ModBlocks.SEARLING), conditionsFromItem(ModBlocks.SEARLING))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_searling"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLACK_DYE)
                .input(ModBlocks.EBON_ROSE)
                .criterion(hasItem(ModBlocks.EBON_ROSE), conditionsFromItem(ModBlocks.EBON_ROSE))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_ebon_rose"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(ModBlocks.FADEWISP)
                .criterion(hasItem(ModBlocks.FADEWISP), conditionsFromItem(ModBlocks.FADEWISP))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_fadewisp"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE)
                .input(ModBlocks.GLOOMVINE)
                .criterion(hasItem(ModBlocks.GLOOMVINE), conditionsFromItem(ModBlocks.GLOOMVINE))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_gloomvine"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE)
                .input(ModBlocks.EMBERBRUSH)
                .criterion(hasItem(ModBlocks.EMBERBRUSH), conditionsFromItem(ModBlocks.EMBERBRUSH))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_emberbrush"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.SPIRESAGE)
                .criterion(hasItem(ModBlocks.SPIRESAGE), conditionsFromItem(ModBlocks.SPIRESAGE))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_spiresage"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.BRIGHTBLOOM)
                .criterion(hasItem(ModBlocks.BRIGHTBLOOM), conditionsFromItem(ModBlocks.BRIGHTBLOOM))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_brightbloom"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MAGENTA_DYE)
                .input(ModBlocks.MIRAGE_LOTUS)
                .criterion(hasItem(ModBlocks.MIRAGE_LOTUS), conditionsFromItem(ModBlocks.MIRAGE_LOTUS))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_mirage_lotus"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(ModBlocks.SHADOWTHORN)
                .criterion(hasItem(ModBlocks.SHADOWTHORN), conditionsFromItem(ModBlocks.SHADOWTHORN))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_shadowthorn"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIME_DYE)
                .input(ModBlocks.HANME)
                .criterion(hasItem(ModBlocks.HANME), conditionsFromItem(ModBlocks.HANME))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_hanme"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RED_DYE)
                .input(ModBlocks.ASHEN_BUD)
                .criterion(hasItem(ModBlocks.ASHEN_BUD), conditionsFromItem(ModBlocks.ASHEN_BUD))
                .offerTo(exporter, new Identifier(NotEnoughFlowers.MOD_ID, "dye_ashen_bud"));
    }
}