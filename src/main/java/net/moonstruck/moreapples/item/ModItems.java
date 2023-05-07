package net.moonstruck.moreapples.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.moonstruck.moreapples.moreapples;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, moreapples.MOD_ID);

    public static final RegistryObject<Item> IRON_APPLE = ITEMS.register("iron_apple",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 8 * 60 * 20, 0), 1.0f)
                            .build())
            ));
    public static final RegistryObject<Item> AMETHYST_APPLE = ITEMS.register("amethyst_apple",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 8 * 60 * 20, 0), 1.0f)
                            .build())
            ));

    public static final RegistryObject<Item> EMERALD_APPLE = ITEMS.register("emerald_apple",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationMod(8f)
                    .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 8 * 60 * 20, 0), 3.0f)
                    .build())
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
