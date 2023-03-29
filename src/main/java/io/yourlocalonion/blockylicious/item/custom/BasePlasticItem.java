package io.yourlocalonion.blockylicious.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BasePlasticItem extends Item {
    public BasePlasticItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level,
                                List<Component> componentList, TooltipFlag tooltipFlag) {
        componentList.add(Component.translatable("tooltip.blockylicious.plastic"));
    }
}
