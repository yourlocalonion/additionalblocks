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

public class MosaicBlockClass {
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

    public static final RegistryObject<Block> MOSAICBLOCK = regBlock("mosaicblock",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_BLACK = regBlock("mosaicblock_black",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_BLUE = regBlock("mosaicblock_blue",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_BROWN = regBlock("mosaicblock_brown",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_CYAN = regBlock("mosaicblock_cyan",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_GRAY = regBlock("mosaicblock_gray",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_GREEN = regBlock("mosaicblock_green",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_LIGHTBLUE = regBlock("mosaicblock_lightblue",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_LIGHTGRAY = regBlock("mosaicblock_lightgray",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_LIME = regBlock("mosaicblock_lime",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_MAGENTA = regBlock("mosaicblock_magenta",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_ORANGE = regBlock("mosaicblock_orange",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_PINK = regBlock("mosaicblock_pink",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_PURPLE = regBlock("mosaicblock_purple",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_RED = regBlock("mosaicblock_red",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);

    public static final RegistryObject<Block> MOSAICBLOCK_YELLOW = regBlock("mosaicblock_yellow",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(3f).requiresCorrectToolForDrops().explosionResistance(2f)), ABCreativeTab.AB_CREATIVE_TAB);
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
