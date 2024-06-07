package com.ironshulkers.entity;

import com.ironshulkers.IronShulkers;
import com.ironshulkers.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlockEntities {
    public static final BlockEntityType<IronShulkerBoxBlockEntity> IRON_SHULKER_BOX_BLOCK_ENTITY =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    IronShulkers.createIdentifier("iron_shulker_box_block_entity"),
                    FabricBlockEntityTypeBuilder.create(IronShulkerBoxBlockEntity::new, ModBlocks.IRON_SHULKER_BOX).build()
            );

    public static void registerBlockEntities() {
        IronShulkers.LOGGER.info("Registering block entities...");
    }
}
