package net.moonstruck.moreapples.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class CoalAppleItem extends Item{
    public CoalAppleItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 14400;
    }
}
