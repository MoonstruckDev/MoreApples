package net.moonstruck.moreapples.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;

public class SurpriseAppleItem extends Item {
    public SurpriseAppleItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
            // Calculate the explosion area
            int explosionRadius = 25; // 10 blocks in each direction from the player
            double playerX = entity.getX();
            double playerY = entity.getY();
            double playerZ = entity.getZ();

            int minX = (int) (playerX - explosionRadius);
            int maxX = (int) (playerX + explosionRadius);
            int minY = (int) (playerY - explosionRadius);
            int maxY = (int) (playerY + explosionRadius);
            int minZ = (int) (playerZ - explosionRadius);
            int maxZ = (int) (playerZ + explosionRadius);

            // Create and trigger the explosion
            Explosion explosion = new Explosion(level, entity, playerX, playerY, playerZ, explosionRadius, false, Explosion.BlockInteraction.DESTROY);
            explosion.explode();
            explosion.finalizeExplosion(true);


        return super.finishUsingItem(stack, level, entity);
    }
}
