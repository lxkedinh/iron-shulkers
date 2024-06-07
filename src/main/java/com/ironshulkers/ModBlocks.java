package com.ironshulkers;

import com.ironshulkers.block.IronShulkerBoxBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlocks {
    public static final Block IRON_SHULKER_BOX = new IronShulkerBoxBlock(Block.Settings.create().strength(4.0f));
    public static final BlockItem IRON_SHULKER_BOX_ITEM = new BlockItem(IRON_SHULKER_BOX, new Item.Settings());

    public static void registerBlocks() {
        IronShulkers.LOGGER.info("Registering blocks...");

        Registry.register(Registries.BLOCK, IronShulkers.createIdentifier("iron_shulker_box"), IRON_SHULKER_BOX);
        Registry.register(Registries.ITEM, IronShulkers.createIdentifier("iron_shulker_box"), IRON_SHULKER_BOX_ITEM);
    }
}
