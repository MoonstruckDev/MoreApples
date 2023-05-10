package net.moonstruck.moreapples.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;


public class EnchantedAppleItem extends Item {
    private final String variant;

    public EnchantedAppleItem(String variant, Properties properties) {
        super(properties);
        this.variant = variant;
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
