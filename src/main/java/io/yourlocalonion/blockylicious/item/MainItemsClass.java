package io.yourlocalonion.blockylicious.item;

import io.yourlocalonion.blockylicious.ABCreativeTab;
import io.yourlocalonion.blockylicious.BlockyliciousMain;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MainItemsClass {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BlockyliciousMain.MODID);

    public static final RegistryObject<Item> RUBBER_PELLET = ITEMS.register("rubber_pellet",
            () -> new Item(new Item.Properties()
                    .tab(ABCreativeTab.AB_CREATIVE_TAB)));

    public static final RegistryObject<Item> POLYMER_PELLET = ITEMS.register("polymer_pellet",
            () -> new Item(new Item.Properties()
                    .tab(ABCreativeTab.AB_CREATIVE_TAB)));

    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic",
            () -> new Item(new Item.Properties()
                    .tab(ABCreativeTab.AB_CREATIVE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
