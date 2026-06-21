package net.killerkrow.nef.util;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent REVERENCE_BERRY = new FoodComponent.Builder().alwaysEdible().hunger(5).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .build();
    public static final FoodComponent BOWL_OF_REVERENCE_BERRIES = new FoodComponent.Builder().alwaysEdible().hunger(12).saturationModifier(0.7f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 300), 1)
            .build();
    public static final FoodComponent REVERENCE_STEM = new FoodComponent.Builder().alwaysEdible().hunger(1).saturationModifier(1f).build();
    public static final FoodComponent GOLDEN_REVERENCE_BERRY = new FoodComponent.Builder().alwaysEdible().hunger(8).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.SATURATION, 600), 1)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.ABSORPTION, 200,2),  1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F)
            .build();

}
