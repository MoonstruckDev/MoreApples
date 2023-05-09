package net.moonstruck.moreapples.item;

import net.minecraft.advancements.Advancement;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.moonstruck.moreapples.config.MoreApplesCommonConfigs;
import net.moonstruck.moreapples.item.custom.CoalAppleItem;
import net.moonstruck.moreapples.moreapples;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, moreapples.MOD_ID);

    public static final RegistryObject<Item> IRON_APPLE = ITEMS.register("iron_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 8 * 60 * 20, 0), 1.0f)
                            .build())
            ));
    public static final RegistryObject<Item> AMETHYST_APPLE = ITEMS.register("amethyst_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 8 * 60 * 20, 0), 1.0f)
                            .build())
            ));

    public static final RegistryObject<Item> EMERALD_APPLE = ITEMS.register("emerald_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 8 * 60 * 20, 0), 3.0f)
                            .build())
            ));

    public static final RegistryObject<Item> COAL_APPLE = ITEMS.register("coal_apple",
            () -> new CoalAppleItem(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
            ));

    public static final RegistryObject<Item> COPPER_APPLE = ITEMS.register("copper_apple",
            () -> new CoalAppleItem(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
            ));


    public static final RegistryObject<Item> LAPIS_APPLE = ITEMS.register("lapis_apple",
            () -> new CoalAppleItem(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
            ));

    public static final RegistryObject<Item> QUARTZ_APPLE = ITEMS.register("quartz_apple",
            () -> new CoalAppleItem(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
            ));

    public static final RegistryObject<Item> NETHERITE_APPLE = ITEMS.register("netherite_apple",
            () -> new CoalAppleItem(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
            ));

    public static final RegistryObject<Item> REDSTONE_APPLE = ITEMS.register("redstone_apple",
            () -> new CoalAppleItem(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
            ));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
