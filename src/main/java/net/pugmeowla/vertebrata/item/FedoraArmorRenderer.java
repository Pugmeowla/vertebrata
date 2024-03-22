package net.pugmeowla.vertebrata.item;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.pugmeowla.vertebrata.item.FedoraArmorItem;
import net.pugmeowla.vertebrata.item.GeoArmorRenderer;

public class FedoraArmorRenderer extends GeoArmorRenderer<FedoraArmorItem> {
        public FedoraArmorRenderer() {
            super(new FedoraArmorRenderer());
    }

    public void prepForRender(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
    }
}