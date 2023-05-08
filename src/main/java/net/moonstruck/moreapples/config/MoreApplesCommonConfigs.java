package net.moonstruck.moreapples.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class MoreApplesCommonConfigs {

    public static ForgeConfigSpec.BooleanValue disableEmeraldApple;

    public static void init() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        builder.comment("My Mod Configuration");

        disableEmeraldApple = builder.comment("Set to true to disable Emerald Apple").define("disableEmeraldApple", false);

        ForgeConfigSpec spec = builder.build();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, spec);
    }
}
