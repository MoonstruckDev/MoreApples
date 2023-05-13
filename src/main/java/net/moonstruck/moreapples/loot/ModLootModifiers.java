package net.moonstruck.moreapples.loot;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.moonstruck.moreapples.MoreApples.MOD_ID;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM =
            LOOT_MODIFIER_SERIALIZERS.register("add_item", AddItemModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> REDSTONE_APPLE_IN_DESERT_CHEST =
            LOOT_MODIFIER_SERIALIZERS.register("redstone_apple_in_desert_chest", RedstoneAppleInDesertChest.CODEC);


	public static void register(IEventBus modEventBus) { LOOT_MODIFIER_SERIALIZERS.register(modEventBus); }
}
