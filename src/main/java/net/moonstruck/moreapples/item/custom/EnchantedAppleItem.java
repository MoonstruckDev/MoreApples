package net.moonstruck.moreapples.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import org.jetbrains.annotations.NotNull;


public class EnchantedAppleItem extends Item {
    private final String variant;

    public EnchantedAppleItem(String variant, Properties properties) {
        super(properties);
        this.variant = variant;
    }

    @Override
    public @NotNull Rarity getRarity(@NotNull ItemStack stack) { return Rarity.EPIC; }

    @Override
    public boolean isFoil(@NotNull ItemStack stack) { return true; }
}
