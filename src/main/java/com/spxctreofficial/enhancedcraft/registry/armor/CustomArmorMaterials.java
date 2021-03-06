package com.spxctreofficial.enhancedcraft.registry.armor;

import com.spxctreofficial.enhancedcraft.registry.ECRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum CustomArmorMaterials implements ArmorMaterial {
    ETHERIUM_ARMOR("etherium", 35, new int[]{5, 8, 10, 5}, 35, ECRegistry.ETHERIUM_ARMOR_EQUIP_SOUND_EVENT, 20.0F, 0.65F, () -> {
        return Ingredient.ofItems(ECRegistry.ETHERIUM);
    }),
    AECORON_ARMOR("aecoron", 26, new int[]{3, 6, 8, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(ECRegistry.AECORON_INGOT);
    }),
    BRONZE_ARMOR("bronze", 12, new int[]{1, 5, 5, 2}, 17, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(ECRegistry.BRONZE_INGOT);
    }),
    ALLOY_ARMOR("alloy", 28, new int[]{3, 5, 7, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(ECRegistry.METAL_ALLOY);
    });

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    CustomArmorMaterials(final String name, final int durabilityMultiplier, final int[] protAmount, final int enchantability, final SoundEvent equipSound, final float toughness, final float kbResistance, final Supplier<Ingredient> ingredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protAmount;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = kbResistance;
        this.repairIngredientSupplier = new Lazy<>(ingredientSupplier);
    }

    public int getDurability(final EquipmentSlot equipmentSlot_1) {
        return BASE_DURABILITY[equipmentSlot_1.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(final EquipmentSlot equipmentSlot_1) {
        return this.protectionAmounts[equipmentSlot_1.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Environment(EnvType.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}