package net.moonstruck.moreapples.item.custom;

import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.network.protocol.game.ServerboundResourcePackPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.VillagerData;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.MerchantOffers;


import javax.swing.text.html.parser.Entity;
import java.util.Arrays;


public class EmeraldAppleItem extends Item {
    public EmeraldAppleItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity target, InteractionHand hand) {
        if (target instanceof Villager villager) {
            // Add HERO_OF_THE_VILLAGE effect
            villager.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 5 * 60 * 20, 0));

            // Discount all trades by 30%
            // TBA

            // Remove one emerald from player's inventory
            if (!player.isCreative()) {
                stack.shrink(1);
            }

            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

}