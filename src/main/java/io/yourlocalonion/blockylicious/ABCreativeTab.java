package io.yourlocalonion.blockylicious;

import io.yourlocalonion.blockylicious.block.MainBlocksClass;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ABCreativeTab {
    public static final CreativeModeTab AB_CREATIVE_TAB = new CreativeModeTab("blockylicioustab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MainBlocksClass.METAL_BLOCK.get().asItem());
        }
    };
}
