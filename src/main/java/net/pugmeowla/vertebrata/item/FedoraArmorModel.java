package net.pugmeowla.vertebrata.item;

import net.minecraft.resources.ResourceLocation;
import net.pugmeowla.vertebrata.Vertebrata;
import software.bernie.geckolib.model.GeoModel;

public class FedoraArmorModel extends GeoModel<FedoraArmorItem> {


    @Override
    public ResourceLocation getModelResource(FedoraArmorItem fedoraArmorItem) {
        return new ResourceLocation(Vertebrata.MOD_ID, "geo/fedora.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FedoraArmorItem fedoraArmorItem) {
        return new ResourceLocation(Vertebrata.MOD_ID, "textures/armor/fedora.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FedoraArmorItem fedoraArmorItem) {
        return new ResourceLocation(Vertebrata.MOD_ID, "animations/fedora.animation.json");
    }
}
