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

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ENCHANTED_AMETHYST_APPLE_IN_END_CITY_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register( "enchanted_amethyst_apple_in_end_city_chests", EnchantedAmethystAppleInEndCityChests.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ENCHANTED_COAL_APPLE_IN_WEAPONSMITH_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register( "enchanted_coal_apple_in_weaponsmith_chests", EnchantedCoalAppleInWeaponsmithChests.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ENCHANTED_COPPER_APPLE_IN_TOOLSMITH_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register( "enchanted_copper_apple_in_toolsmith_chests", EnchantedCopperAppleInToolsmithChests.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ENCHANTED_DIAMOND_APPLE_IN_STRONGHOLD_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register( "enchanted_diamond_apple_in_stronghold_chests", EnchantedDiamondAppleInStrongholdChests.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ENCHANTED_EMERALD_APPLE_IN_SHIPWRECK_TREASURE_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register( "enchanted_emerald_apple_in_shipwreck_treasure_chests", EnchantedEmeraldAppleInShipwreckTreasureChests.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ENCHANTED_LAPIS_APPLE_IN_BURIED_TREASURE_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register( "enchanted_lapis_apple_in_buried_treasure_chests", EnchantedLapisAppleInBuriedTreasureChests.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ENCHANTED_NETHERITE_APPLE_IN_BASTION_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register( "enchanted_netherite_apple_in_bastion_chests", EnchantedNetheriteAppleInBastionChests.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ENCHANTED_QUARTZ_APPLE_IN_RUINED_PORTAL_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register( "enchanted_quartz_apple_in_ruined_portal_chests", EnchantedQuartzAppleInRuinedPortalChests.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ENCHANTED_QUARTZ_APPLE_IN_NETHER_BRIDGE_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register( "enchanted_quartz_apple_in_nether_bridge_chests", EnchantedQuartzAppleInNetherBridgeChests.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ENCHANTED_REDSTONE_APPLE_IN_SIMPLE_DUNGEON_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register( "enchanted_redstone_apple_in_simple_dungeon_chests", EnchantedRedstoneAppleInSimpleDungeonChests.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ENCHANTED_IRON_APPLE_IN_DESERT_PYRAMID_CHESTS =
            LOOT_MODIFIER_SERIALIZERS.register( "enchanted_iron_apple_in_desert_pyramid_chests", EnchantedIronAppleInDesertPyramidChests.CODEC);


    public static void register(IEventBus bus) {
        LOOT_MODIFIER_SERIALIZERS.register(bus);
    }
}