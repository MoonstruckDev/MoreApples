package net.moonstruck.moreapples.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOREAPPLES_TAB = new CreativeModeTab("MoreApples") {
        @Override
        public @NotNull ItemStack makeIcon() { return new ItemStack(ModItems.AMETHYST_APPLE.get()); }
    };
}
