package com.ironshulkers;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block IRON_SHULKER_BOX = new Block(Block.Settings.create().strength(4.0f));

    public static void registerAllBlocks() {
        Registry.register(Registries.BLOCK, IronShulkers.createIdentifier("iron_shulker_box"), IRON_SHULKER_BOX);
        Registry.register(Registries.ITEM, IronShulkers.createIdentifier("iron_shulker_box"), new BlockItem(IRON_SHULKER_BOX, new Item.Settings()));
    }

}
