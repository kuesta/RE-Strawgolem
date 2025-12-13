package org.hero.strawgolem.mixin;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StemBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.hero.strawgolem.mixinInterfaces.StemFruit;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;


@Mixin(StemBlock.class)
public class MixinStemBlock implements StemFruit {
    @Shadow @Final private ResourceKey<Block> fruit;


    @Override
    public Block strawgolemRewrite$getFruit() {
        return BuiltInRegistries.BLOCK.get(fruit);
    }
}
