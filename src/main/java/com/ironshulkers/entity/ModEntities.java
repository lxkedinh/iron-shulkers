package com.ironshulkers.entity;

import com.ironshulkers.IronShulkers;

public class ModEntities {
    public static void registerEntities() {
        IronShulkers.LOGGER.info("Registering entities...");

        ModBlockEntities.registerBlockEntities();
    }
}
