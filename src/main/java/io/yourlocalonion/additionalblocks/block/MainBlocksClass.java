package io.yourlocalonion.additionalblocks.block;

import io.yourlocalonion.additionalblocks.ABCreativeTab;
import io.yourlocalonion.additionalblocks.AdditionalBlocksMain;
import io.yourlocalonion.additionalblocks.item.MainItemsClass;
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

public class MainBlocksClass {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AdditionalBlocksMain.MODID);
    private static <T extends Block> RegistryObject<T> regBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> ret = BLOCKS.register(name, block);
        regBlockItem(name, ret, tab);
        return ret;
    }
    private static <T extends Block> RegistryObject<Item> regBlockItem(String name, Supplier<T> block, CreativeModeTab tab) {
        return MainItemsClass.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static final RegistryObject<Block> METAL_BLOCK = regBlock("metal_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ABCreativeTab.AB_CREATIVE_TAB);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
