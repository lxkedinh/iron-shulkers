package com.ironshulkers.item;

import com.ironshulkers.IronShulkers;
import com.ironshulkers.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ModItems {
    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.IRON_SHULKER_BOX_ITEM))
            .displayName(Text.literal("Iron Shulkers"))
            .entries((context, entries) -> entries.add(ModBlocks.IRON_SHULKER_BOX_ITEM)).build();

    public static void registerItems() {
        IronShulkers.LOGGER.info("Registering items...");

        Registry.register(Registries.ITEM_GROUP, IronShulkers.createIdentifier("iron_shulkers_group"), ITEM_GROUP);

    }
}
