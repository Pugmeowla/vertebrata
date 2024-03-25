package net.pugmeowla.vertebrata.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pugmeowla.vertebrata.Vertebrata;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Vertebrata.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VERTEBRATA_TAB = CREATIVE_MODE_TABS.register("vertebrata_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FEDORA.get()))
                    .title(Component.translatable("creativetab.vertebrata_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FEDORA.get());

                        pOutput.accept(Items.DIAMOND);


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}