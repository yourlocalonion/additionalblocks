package io.yourlocalonion.blockylicious.item;

import io.yourlocalonion.blockylicious.ABCreativeTab;
import io.yourlocalonion.blockylicious.BlockyliciousMain;
import io.yourlocalonion.blockylicious.item.custom.BasePlasticItem;
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
            () -> new BasePlasticItem(new Item.Properties()
                    .tab(ABCreativeTab.AB_CREATIVE_TAB)));

    public static final RegistryObject<Item> PLASTIC_RED = ITEMS.register("plastic_red",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_ORANGE = ITEMS.register("plastic_orange",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_YELLOW = ITEMS.register("plastic_yellow",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_LIME = ITEMS.register("plastic_lime",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_GREEN = ITEMS.register("plastic_green",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_CYAN = ITEMS.register("plastic_cyan",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_LIGHTBLUE = ITEMS.register("plastic_lightblue",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_BLUE = ITEMS.register("plastic_blue",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_PURPLE = ITEMS.register("plastic_purple",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_MAGENTA = ITEMS.register("plastic_magenta",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_PINK = ITEMS.register("plastic_pink",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );
    public static final RegistryObject<Item> PLASTIC_BLACK = ITEMS.register("plastic_black",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_BROWN = ITEMS.register("plastic_brown",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_GRAY = ITEMS.register("plastic_gray",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static final RegistryObject<Item> PLASTIC_LIGHTGRAY = ITEMS.register("plastic_lightgray",
            () -> new BasePlasticItem(new Item.Properties().tab(ABCreativeTab.AB_CREATIVE_TAB))
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
