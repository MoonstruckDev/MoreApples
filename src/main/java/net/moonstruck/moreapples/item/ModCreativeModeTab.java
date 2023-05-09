package net.moonstruck.moreapples.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOREAPPLES_TAB = new CreativeModeTab("MoreApples") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMETHYST_APPLE.get());
        }
    };
}
