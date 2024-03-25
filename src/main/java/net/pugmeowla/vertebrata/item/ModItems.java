package net.pugmeowla.vertebrata.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.pugmeowla.vertebrata.Vertebrata;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.world.entity.EquipmentSlot.HEAD;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Vertebrata.MOD_ID);
    public static final RegistryObject<Item> FEDORA = ITEMS.register("fedora", () ->
            new ArmorItem(ModArmorMaterials.FEDORA, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> PLATYGEM = ITEMS.register("platygem",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
