package com.ironshulkers.block;

import com.ironshulkers.entity.IronShulkerBoxBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class IronShulkerBoxBlock extends Block implements BlockEntityProvider {

    public IronShulkerBoxBlock(Settings settings) {
       super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        }
        Inventory blockEntity = (Inventory) world.getBlockEntity(pos);

        if (!player.getMainHandStack().isEmpty()) {
            if (blockEntity.getStack(0).isEmpty()) {
                blockEntity.setStack(0, player.getMainHandStack().copy());
                player.getMainHandStack().setCount(0);
            } else {
                player.sendMessage(Text.literal("The first slot holds " + blockEntity.getStack(0) + "."));
            }
        } else {
            player.setStackInHand(Hand.MAIN_HAND, blockEntity.getStack(0).copy());
            blockEntity.setStack(0, ItemStack.EMPTY);
        }

        return ActionResult.SUCCESS;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new IronShulkerBoxBlockEntity(pos, state);
    }
}
