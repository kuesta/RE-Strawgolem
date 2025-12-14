package org.hero.strawgolem.mixin;

import net.minecraft.world.entity.player.Player;
import org.hero.strawgolem.golem.StrawGolem;
import org.hero.strawgolem.mixinInterfaces.GolemOrderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Player.class)
public class MixinPlayer implements GolemOrderer {
    @Unique // Optional, but good practice to ensure the name is unique and won't conflict
    private StrawGolem strawgolemRewrite$strawGolem = null; // The new field being added

    @Override
    public StrawGolem strawgolemRewrite$getGolem() {
        return strawgolemRewrite$strawGolem;
    }

    @Override
    public void strawgolemRewrite$setGolem(StrawGolem golem) {
        strawgolemRewrite$strawGolem = golem;
    }
}