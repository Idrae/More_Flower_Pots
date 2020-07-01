package com._idrae.dyeable_flower_pots.blocks;

import com._idrae.dyeable_flower_pots.DyeableFlowerPots;
import com._idrae.dyeable_flower_pots.util.RegistryHandler;
import com.google.common.collect.Maps;
import net.minecraft.block.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.GrassColors;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.function.Supplier;

public class DyedFlowerPotBlock extends Block {

    private static final Map<Block, Block> field_196451_b = Maps.newHashMap();
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);
    private final Block flower;

    private final Map<net.minecraft.util.ResourceLocation, java.util.function.Supplier<? extends Block>> fullPots;
    private final java.util.function.Supplier<DyedFlowerPotBlock> emptyPot;
    private final java.util.function.Supplier<? extends Block> flowerDelegate;

    public DyedFlowerPotBlock(@Nullable Supplier<DyedFlowerPotBlock> emptyPot, Supplier<? extends Block> flowerIn, Block.Properties properties, String color) {
        super(properties);
        // this.flower = null; // Unused, redirected by coremod
        this.flower = flowerIn.get();
        this.flowerDelegate = flowerIn;
        if (emptyPot == null) {
            this.fullPots = Maps.newHashMap();
            this.emptyPot = null;
        } else {
            this.fullPots = java.util.Collections.emptyMap();
            this.emptyPot = emptyPot;
        }

        if (flowerIn.get() != Blocks.AIR) {
            switch (color) {
                case "white":
                    ((DyedFlowerPotBlock) RegistryHandler.WHITE_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "orange":
                    ((DyedFlowerPotBlock) RegistryHandler.ORANGE_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "magenta":
                    ((DyedFlowerPotBlock) RegistryHandler.MAGENTA_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "light_blue":
                    ((DyedFlowerPotBlock) RegistryHandler.LIGHT_BLUE_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "yellow":
                    ((DyedFlowerPotBlock) RegistryHandler.YELLOW_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "lime":
                    ((DyedFlowerPotBlock) RegistryHandler.LIME_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "pink":
                    ((DyedFlowerPotBlock) RegistryHandler.PINK_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "gray":
                    ((DyedFlowerPotBlock) RegistryHandler.GRAY_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "light_gray":
                    ((DyedFlowerPotBlock) RegistryHandler.LIGHT_GRAY_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "cyan":
                    ((DyedFlowerPotBlock) RegistryHandler.CYAN_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "purple":
                    ((DyedFlowerPotBlock) RegistryHandler.PURPLE_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "blue":
                    ((DyedFlowerPotBlock) RegistryHandler.BLUE_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "brown":
                    ((DyedFlowerPotBlock) RegistryHandler.BROWN_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "green":
                    ((DyedFlowerPotBlock) RegistryHandler.GREEN_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                case "red":
                    ((DyedFlowerPotBlock) RegistryHandler.RED_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
                default:
                    ((DyedFlowerPotBlock) RegistryHandler.BLACK_FLOWER_POT.get()).addPlant(flowerIn.get().getRegistryName(), () -> this);
                    break;
            }
        }
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack itemstack = player.getHeldItem(handIn);
        Item item = itemstack.getItem();
        Block block = item instanceof BlockItem ? getEmptyPot().fullPots.getOrDefault(((BlockItem)item).getBlock().getRegistryName(), Blocks.AIR.delegate).get() : Blocks.AIR;
        boolean flag = block == Blocks.AIR;
        boolean flag1 = this.flower == Blocks.AIR;
        if (flag != flag1) {
            if (flag1) {
                worldIn.setBlockState(pos, block.getDefaultState(), 3);
                player.addStat(Stats.POT_FLOWER);
                if (!player.abilities.isCreativeMode) {
                    itemstack.shrink(1);
                }
            } else {
                ItemStack itemstack1 = new ItemStack(this.flower);
                if (itemstack.isEmpty()) {
                    player.setHeldItem(handIn, itemstack1);
                } else if (!player.addItemStackToInventory(itemstack1)) {
                    player.dropItem(itemstack1, false);
                }
                worldIn.setBlockState(pos, getEmptyPot().getDefaultState(), 3);
            }

            return ActionResultType.SUCCESS;
        } else {
            return ActionResultType.CONSUME;
        }
    }

    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return this.flower == Blocks.AIR ? super.getItem(worldIn, pos, state) : new ItemStack(this.flower);
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        return facing == Direction.DOWN && !stateIn.isValidPosition(worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public Block func_220276_d() {
        return flowerDelegate.get();
    }

    public DyedFlowerPotBlock getEmptyPot() {
        return emptyPot == null ? this : emptyPot.get();
    }

    public void addPlant(net.minecraft.util.ResourceLocation flower, java.util.function.Supplier<? extends Block> fullPot) {
        if (getEmptyPot() != this) {
            throw new IllegalArgumentException("Cannot add plant to non-empty pot: " + this);
        }
        fullPots.put(flower, fullPot);

    }

}
