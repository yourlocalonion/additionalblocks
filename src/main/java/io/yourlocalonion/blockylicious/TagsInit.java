package io.yourlocalonion.blockylicious;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TagsInit {
    private static TagKey<Block> cTagBlock(String tag) {
        return BlockTags.create(new ResourceLocation(BlockyliciousMain.MODID, tag));
    }

    private static TagKey<Item> cTagItem(String tag) {
        return ItemTags.create(new ResourceLocation(BlockyliciousMain.MODID, tag));
    }

    public static final TagKey<Item> COLORED_PLASTICS = cTagItem("colored_plastics");
    public static final TagKey<Item> PLASTICS = cTagItem("plastics");
}
