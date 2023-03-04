package io.yourlocalonion.additionalblocks;

import io.yourlocalonion.additionalblocks.block.MainBlocksClass;
import io.yourlocalonion.additionalblocks.item.MainItemsClass;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ABCreativeTab {
    public static final CreativeModeTab AB_CREATIVE_TAB = new CreativeModeTab("additionalblockstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MainBlocksClass.METAL_BLOCK.get().asItem());
        }
    };
}
