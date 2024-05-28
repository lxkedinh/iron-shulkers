package com.ironshulkers;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlocks {
    public static final Block IRON_SHULKER_BOX = new Block(Block.Settings.create().strength(4.0f));
    public static final BlockItem IRON_SHULKER_BOX_ITEM = new BlockItem(IRON_SHULKER_BOX, new Item.Settings());

    public static void registerAllBlocks() {
        Registry.register(Registries.BLOCK, IronShulkers.createIdentifier("iron_shulker_box"), IRON_SHULKER_BOX);
        Registry.register(Registries.ITEM, IronShulkers.createIdentifier("iron_shulker_box"), IRON_SHULKER_BOX_ITEM);

        registerToItemGroups();
    }

    public static void registerToItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {
            content.add(IRON_SHULKER_BOX_ITEM);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.add(IRON_SHULKER_BOX_ITEM);
        });
    }

}
