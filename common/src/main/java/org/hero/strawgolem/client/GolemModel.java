package org.hero.strawgolem.client;

import net.minecraft.resources.ResourceLocation;
import org.hero.strawgolem.Constants;
import org.hero.strawgolem.golem.StrawGolem;
import software.bernie.geckolib.model.GeoModel;

public class GolemModel extends GeoModel<StrawGolem> {
    private static final ResourceLocation model = ResourceLocation.tryBuild(Constants.MOD_ID, "geo/strawgolem.geo.json");
    private static final ResourceLocation animation = ResourceLocation.tryBuild(Constants.MOD_ID, "animations/strawgolem.animation.json");

    private static final ResourceLocation[] textures = {
            ResourceLocation.tryBuild(Constants.MOD_ID, "textures/strawgolem_golem.png"),
            ResourceLocation.tryBuild(Constants.MOD_ID, "textures/strawgolem_golem_old.png"),
            ResourceLocation.tryBuild(Constants.MOD_ID, "textures/strawgolem_golem_dying.png")
    };
    @Override
    public ResourceLocation getModelResource(StrawGolem strawGolem) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(StrawGolem strawGolem) {
        return textures[strawGolem.golemStatus()];
    }

    @Override
    public ResourceLocation getAnimationResource(StrawGolem strawGolem) {
        return animation;
    }
}
