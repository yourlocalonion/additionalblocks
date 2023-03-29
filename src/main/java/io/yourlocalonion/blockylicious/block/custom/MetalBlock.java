package io.yourlocalonion.blockylicious.block.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MetalBlock extends Block {
    public MetalBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable BlockGetter blockGetter,
                                List<Component> componentList, TooltipFlag tooltipFlag) {
        componentList.add(Component.translatable("tooltip.blockylicious.metal_block"));
    }
}
