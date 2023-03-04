package io.yourlocalonion.additionalblocks.item;

import io.yourlocalonion.additionalblocks.AdditionalBlocksMain;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MainItemsClass {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalBlocksMain.MODID);

    //TODO: make itemsssssssssssssssssklngeu4ijrhehoglin

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
