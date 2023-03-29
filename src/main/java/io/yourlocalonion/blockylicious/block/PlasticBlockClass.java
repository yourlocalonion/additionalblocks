package io.yourlocalonion.blockylicious.block;

import io.yourlocalonion.blockylicious.ABCreativeTab;
import io.yourlocalonion.blockylicious.BlockyliciousMain;
import io.yourlocalonion.blockylicious.item.MainItemsClass;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class PlasticBlockClass {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BlockyliciousMain.MODID);

    private static <T extends Block> RegistryObject<T> regBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> ret = BLOCKS.register(name, block);
        regBlockItem(name, ret, tab);
        return ret;
    }
    private static <T extends Block> RegistryObject<Item> regBlockItem(String name, Supplier<T> block, CreativeModeTab tab) {
        return MainItemsClass.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static final RegistryObject<Block> PLASTICBLOCK = regBlock("plasticblock",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_BLACK = regBlock("plasticblock_black",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_BLUE = regBlock("plasticblock_blue",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_BROWN = regBlock("plasticblock_brown",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_CYAN = regBlock("plasticblock_cyan",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_GRAY = regBlock("plasticblock_gray",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_GREEN = regBlock("plasticblock_green",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_LIGHTBLUE = regBlock("plasticblock_lightblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_LIGHTGRAY = regBlock("plasticblock_lightgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_LIME = regBlock("plasticblock_lime",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_MAGENTA = regBlock("plasticblock_magenta",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_ORANGE = regBlock("plasticblock_orange",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_PINK = regBlock("plasticblock_pink",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_PURPLE = regBlock("plasticblock_purple",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_RED = regBlock("plasticblock_red",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> PLASTICBLOCK_YELLOW = regBlock("plasticblock_yellow",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
