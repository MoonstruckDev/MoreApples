package net.moonstruck.moreapples.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.moonstruck.moreapples.item.custom.CoalAppleItem;
import net.moonstruck.moreapples.item.custom.EnchantedAppleItem;

import static net.moonstruck.moreapples.MoreApples.MOD_ID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

	public static final RegistryObject<Item> IRON_APPLE = ITEMS.register("iron_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2 * 60 * 20, 0), 1.0f)
                            .build())
            ));
    public static final RegistryObject<Item> AMETHYST_APPLE = ITEMS.register("amethyst_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 2 * 60 * 20, 0), 1.0f)
                            .build())
            ));

    public static final RegistryObject<Item> EMERALD_APPLE = ITEMS.register("emerald_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 2 * 60 * 20, 0), 3.0f)
                            .build())
            ));

    public static final RegistryObject<Item> COAL_APPLE = ITEMS.register("coal_apple",
            () -> new CoalAppleItem(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)));

    public static final RegistryObject<Item> COPPER_APPLE = ITEMS.register("copper_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationMod(0.6F)
                            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 2 * 60 * 20, 1), 1.0F)
                            .build())
            ));


    public static final RegistryObject<Item> LAPIS_APPLE = ITEMS.register("lapis_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 2 * 60 * 20, 0), 3.0f)
                            .build())
            ));

    public static final RegistryObject<Item> QUARTZ_APPLE = ITEMS.register("quartz_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2 * 60 * 20, 0), 3.0f)
                            .build())
            ));

    public static final RegistryObject<Item> NETHERITE_APPLE = ITEMS.register("netherite_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 4 * 60 * 20, 0), 3.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4 * 60 * 20, 0), 3.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 4 * 60 * 20, 0), 3.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 2 * 60 * 20, 0), 3.0f)
                            .build())
			));

    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2 * 60 * 20, 0), 3.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2 * 60 * 20, 0), 3.0f)
                            .build())
            ));

    public static final RegistryObject<Item> REDSTONE_APPLE = ITEMS.register("redstone_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)));

    /** Enchanted Variants */
    public static final RegistryObject<Item> ENCHANTED_IRON_APPLE = ITEMS.register("enchanted_iron_apple",
            () -> new EnchantedAppleItem("iron_apple", new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 8 * 60 * 20, 0), 1.0f)
                            .build())
            ));
    public static final RegistryObject<Item> ENCHANTED_AMETHYST_APPLE = ITEMS.register("enchanted_amethyst_apple",
            () -> new EnchantedAppleItem("amethyst_apple",new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 8 * 60 * 20, 0), 1.0f)
                            .build())
            ));

    public static final RegistryObject<Item> ENCHANTED_EMERALD_APPLE = ITEMS.register("enchanted_emerald_apple",
            () -> new EnchantedAppleItem("emerald",new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 8 * 60 * 20, 0), 3.0f)
                            .build())
            ));

    public static final RegistryObject<Item> ENCHANTED_COAL_APPLE = ITEMS.register("enchanted_coal_apple",
            () -> new EnchantedAppleItem("coal_apple",new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
            ));

    public static final RegistryObject<Item> ENCHANTED_COPPER_APPLE = ITEMS.register("enchanted_copper_apple",
            () -> new EnchantedAppleItem("copper_apple",new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationMod(0.6F)
                            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 2 * 60 * 20, 1), 1.0F)
                            .build())
            ));


    public static final RegistryObject<Item> ENCHANTED_LAPIS_APPLE = ITEMS.register("enchanted_lapis_apple",
            () -> new EnchantedAppleItem("lapis_apple",new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 2 * 60 * 20, 0), 3.0f)
                            .build())
            ));

    public static final RegistryObject<Item> ENCHANTED_QUARTZ_APPLE = ITEMS.register("enchanted_quartz_apple",
            () -> new EnchantedAppleItem("quartz_apple",new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(8)
                            .saturationMod(8f)
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2 * 60 * 20, 0), 3.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 0), 3.0f)
                            .build())
            ));

    public static final RegistryObject<Item> ENCHANTED_NETHERITE_APPLE = ITEMS.register("enchanted_netherite_apple",
            () -> new EnchantedAppleItem("netherite_apple",new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
            ));

    public static final RegistryObject<Item> ENCHANTED_REDSTONE_APPLE = ITEMS.register("enchanted_redstone_apple",
            () -> new EnchantedAppleItem("redstone_apple",new Item.Properties().tab(ModCreativeModeTab.MOREAPPLES_TAB)
            ));

    public static void register(IEventBus modEventBus) { ITEMS.register(modEventBus); }
}
