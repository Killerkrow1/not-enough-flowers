package net.killerkrow.nef.util;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.killerkrow.nef.NotEnoughFlowers;
import net.killerkrow.nef.init.ReverenceSack;
import net.killerkrow.nef.init.ReverenceVines;
import net.killerkrow.nef.init.ReverenceVinesPlant;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.WHITE_WOOL;
import static net.minecraft.block.Blocks.register;

public class ModBlocks {

    //Flowers n Stuff
    public static final Block ASTRAVEN = registerBlock("astraven",
            new FlowerBlock(StatusEffects.INSTANT_DAMAGE, 1000,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_ASTRAVEN = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_astraven"),
            new FlowerPotBlock(ASTRAVEN, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block WOLFSBANE = registerBlock("wolfsbane",
            new FlowerBlock(StatusEffects.INSTANT_DAMAGE, 1,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_WOLFSBANE = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_wolfsbane"),
            new FlowerPotBlock(WOLFSBANE, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block KAGAMI_BUD = registerBlock("kagami_bud",
            new FlowerBlock(StatusEffects.INSTANT_DAMAGE, 1,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_KAGAMI_BUD = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_kagami_bud"),
            new FlowerPotBlock(KAGAMI_BUD, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block ROOTFERN = registerBlock("rootfern",
            new FlowerBlock(StatusEffects.HUNGER, 5,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_ROOTFERN = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_rootfern"),
            new FlowerPotBlock(ROOTFERN, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block AKAMI_ROSE = registerBlock("akami_rose",
            new FlowerBlock(StatusEffects.GLOWING, 15,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_AKAMI_ROSE = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_akami_rose"),
            new FlowerPotBlock(AKAMI_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block HANME = registerBlock("hanme",
            new FlowerBlock(StatusEffects.HERO_OF_THE_VILLAGE, 45,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_HANME = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_hanme"),
            new FlowerPotBlock(HANME, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block ASHEN_BUD = registerBlock("ashen_bud",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_ASHEN_BUD = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_ashen_bud"),
            new FlowerPotBlock(ASHEN_BUD, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block MOONBLOOM = registerBlock("moonbloom",
            new FlowerBlock(StatusEffects.INVISIBILITY, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_MOONBLOOM = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_moonbloom"),
            new FlowerPotBlock(MOONBLOOM, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block SILVERTHORN = registerBlock("silverthorn",
            new FlowerBlock(StatusEffects.RESISTANCE, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_SILVERTHORN = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_silverthorn"),
            new FlowerPotBlock(SILVERTHORN, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block DAWN_LILLY = registerBlock("dawn_lilly",
            new FlowerBlock(StatusEffects.SPEED, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_DAWN_LILLY = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_dawn_lilly"),
            new FlowerPotBlock(DAWN_LILLY, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block STARBRIGHT_PETAL = registerBlock("starbright_petal",
            new FlowerBlock(StatusEffects.HEALTH_BOOST, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_STARBRIGHT_PETAL = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_starbright_petal"),
            new FlowerPotBlock(STARBRIGHT_PETAL, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block RENMI = registerBlock("renmi",
            new FlowerBlock(StatusEffects.POISON, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_RENMI = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_renmi"),
            new FlowerPotBlock(RENMI, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block GILDED_ORCHID = registerBlock("gilded_orchid",
            new FlowerBlock(StatusEffects.STRENGTH, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_GILDED_ORCHID = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_gilded_orchid"),
            new FlowerPotBlock(GILDED_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block THORNSHADE = registerBlock("thornshade",
            new FlowerBlock(StatusEffects.WITHER, 10,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_THORNSHADE = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_thornshade"),
            new FlowerPotBlock(THORNSHADE, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block MISTVINE = registerBlock("mistvine",
            new FlowerBlock(StatusEffects.BLINDNESS, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_MISTVINE = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_mistvine"),
            new FlowerPotBlock(MISTVINE, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block GLOWFERN = registerBlock("glowfern",
            new FlowerBlock(StatusEffects.GLOWING, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_GLOWFERN = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_flowfern"),
            new FlowerPotBlock(GLOWFERN, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block FROST_PETAL = registerBlock("frost_petal",
            new FlowerBlock(StatusEffects.SLOWNESS, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_FROST_PETAL = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_frost_petal"),
            new FlowerPotBlock(FROST_PETAL, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block EMBERLOTUS = registerBlock("emberlotus",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 60,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_EMBERLOTUS = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_emberlotus"),
            new FlowerPotBlock(EMBERLOTUS, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block SPECTRAL_ORCHID = registerBlock("spectral_orchid",
            new FlowerBlock(StatusEffects.LEVITATION, 5,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_SPECTRAL_ORCHID = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_spectral_orchid"),
            new FlowerPotBlock(SPECTRAL_ORCHID, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block PHANTOM_LACE = registerBlock("phantom_lace",
            new FlowerBlock(StatusEffects.LEVITATION, 15,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_PHANTOM_LACE = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_phantom_lace"),
            new FlowerPotBlock(PHANTOM_LACE, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block VOIDMOSS = registerBlock("voidmoss",
            new FlowerBlock(StatusEffects.LEVITATION, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_VOIDMOSS = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_voidmoss"),
            new FlowerPotBlock(VOIDMOSS, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block SCARLET_CURL = registerBlock("scarlet_curl",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_SCARLET_CURL = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_scarlet_curl"),
            new FlowerPotBlock(SCARLET_CURL, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block STARSHADE = registerBlock("starshade",
            new FlowerBlock(StatusEffects.GLOWING, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_STARSHADE = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_starshade"),
            new FlowerPotBlock(STARSHADE, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block BRIMROSE = registerBlock("brimrose",
            new FlowerBlock(StatusEffects.POISON, 20,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_BRIMROSE = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_brimrose"),
            new FlowerPotBlock(BRIMROSE, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block GLASSLEAF = registerBlock("glassleaf",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_GLASSLEAF = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_glassleaf"),
            new FlowerPotBlock(GLASSLEAF, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block FLAMESPIRE = registerBlock("flamespire",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_FLAMESPIRE = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_flamespire"),
            new FlowerPotBlock(FLAMESPIRE, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block LUNAR_PEONY = registerBlock("lunar_peony",
            new FlowerBlock(StatusEffects.INVISIBILITY, 6,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_LUNAR_PEONY = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_lunar_peony"),
            new FlowerPotBlock(LUNAR_PEONY, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block BLOOMCROWN = registerBlock("bloomcrown",
            new FlowerBlock(StatusEffects.SATURATION, 5,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_BLOOMCROWN = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_bloomcrown"),
            new FlowerPotBlock(BLOOMCROWN, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block INFERNO_BELL = registerBlock("inferno_bell",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 5,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_INFERNO_BELL = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_inferno_bell"),
            new FlowerPotBlock(INFERNO_BELL, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block SEARLING = registerBlock("searling",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 5,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_SEARLING = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_searling"),
            new FlowerPotBlock(SEARLING, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block EBON_ROSE = registerBlock("ebon_rose",
            new FlowerBlock(StatusEffects.WEAKNESS, 15,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_EBON_ROSE = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_ebon_rose"),
            new FlowerPotBlock(EBON_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block FADEWISP = registerBlock("fadewisp",
            new FlowerBlock(StatusEffects.INVISIBILITY, 15,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_FADEWISP = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_fadewisp"),
            new FlowerPotBlock(FADEWISP, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block GLOOMVINE = registerBlock("gloomvine",
            new FlowerBlock(StatusEffects.WITHER, 15,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_GLOOMVINE = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_gloomvine"),
            new FlowerPotBlock(GLOOMVINE, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block EMBERBRUSH = registerBlock("emberbrush",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 15,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_EMBERBRUSH = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_emberbrush"),
            new FlowerPotBlock(EMBERBRUSH, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block SPIRESAGE = registerBlock("spiresage",
            new FlowerBlock(StatusEffects.WITHER, 15,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_SPIRESAGE = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_spiresage"),
            new FlowerPotBlock(SPIRESAGE, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block BRIGHTBLOOM = registerBlock("brightbloom",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 15,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_BRIGHTBLOOM = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_brightbloom"),
            new FlowerPotBlock(BRIGHTBLOOM, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block MIRAGE_LOTUS = registerBlock("mirage_lotus",
            new FlowerBlock(StatusEffects.INVISIBILITY, 15,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_MIRAGE_LOTUS = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_mirage_lotus"),
            new FlowerPotBlock(MIRAGE_LOTUS, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block SHADOWTHORN = registerBlock("shadowthorn",
            new FlowerBlock(StatusEffects.BLINDNESS, 30,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_SHADOWTHORN = Registry.register(Registries.BLOCK, new Identifier(NotEnoughFlowers.MOD_ID, "potted_shadowthorn"),
            new FlowerPotBlock(SHADOWTHORN, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

    public static final Block REVERENCE_VINES = register("reverence_vines",
            new ReverenceVines(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .ticksRandomly()
                            .noCollision()
                            .luminance(CaveVines.getLuminanceSupplier(14))
                            .breakInstantly()
                            .sounds(BlockSoundGroup.CAVE_VINES)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block REVERENCE_VINES_PLANT = register("reverence_vines_plant",
            new ReverenceVinesPlant(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .luminance(CaveVines.getLuminanceSupplier(14))
                            .breakInstantly()
                            .sounds(BlockSoundGroup.CAVE_VINES)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block REVERENCE_BERRY_SACK = registerBlock("reverence_berry_sack",
            new ReverenceSack(FabricBlockSettings.copyOf(WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new  Identifier(NotEnoughFlowers.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NotEnoughFlowers.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        NotEnoughFlowers.LOGGER.info("Registering ModBlocks for " + NotEnoughFlowers.MOD_ID);
    }
}