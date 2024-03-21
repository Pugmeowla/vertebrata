package net.pugmeowla.vertebrata.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.pugmeowla.vertebrata.Vertebrata;
import net.pugmeowla.vertebrata.entity.custom.EntityBream;
import net.pugmeowla.vertebrata.entity.client.BreamModel;

public class BreamRenderer extends MobRenderer<EntityBream, BreamModel<EntityBream>> {

    public BreamRenderer(EntityRendererProvider.Context renderManager, BreamModel<EntityBream> model) {
        super(renderManager, model, 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityBream animatable) {
        return new ResourceLocation(Vertebrata.MOD_ID, "textures/entity/bream/main.png");
    }
}
