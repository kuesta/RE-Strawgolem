package org.hero.strawgolem.golem;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;

public class StrawGolem extends AbstractGolem implements GeoAnimatable {
    protected StrawGolem(EntityType<? extends AbstractGolem> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return null;
    }

    @Override
    public double getTick(Object o) {
        return 0;
    }

    public int golemStatus() {
        // basic code to check how dead a golem is
        return getMaxHealth() >= getHealth() ? 0 : getMaxHealth() / 3 > getHealth() ? 1 : 2;

    }
}
