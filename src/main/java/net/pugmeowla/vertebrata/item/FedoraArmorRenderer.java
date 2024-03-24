package net.pugmeowla.vertebrata.item;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FedoraArmorRenderer extends GeoArmorRenderer<FedoraArmorItem> {
        public FedoraArmorRenderer() {
            super(new FedoraArmorModel());
    }
}