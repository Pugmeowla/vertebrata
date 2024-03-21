package net.pugmeowla.vertebrata.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pugmeowla.vertebrata.Vertebrata;
import net.pugmeowla.vertebrata.entity.custom.EntityBream;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Vertebrata.MOD_ID);

    public static final RegistryObject<EntityType<EntityBream>> BREAM = ENTITIES.register("bream",
            () -> EntityType.Builder.of(EntityBream::new, MobCategory.CREATURE)
                    .sized(0.6F, 0.85F) // Hitbox Size
                    .build(new ResourceLocation(Vertebrata.MOD_ID, "bream").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
