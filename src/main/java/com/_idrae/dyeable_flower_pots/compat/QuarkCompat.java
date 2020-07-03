package com._idrae.dyeable_flower_pots.compat;

import com._idrae.dyeable_flower_pots.DyeableFlowerPots;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashSet;
import java.util.Set;

public class QuarkCompat {

    public static final Block[] QUARK_VANILLA_PLANTS = {

            Blocks.BEETROOTS,
            Blocks.SWEET_BERRY_BUSH,
            Blocks.CARROTS,
            Blocks.CHORUS_FLOWER,
            Blocks.COCOA,
            Blocks.GRASS,
            Blocks.LILAC,
            Blocks.MELON_STEM,
            Blocks.NETHER_WART,
            Blocks.PEONY,
            Blocks.POTATOES,
            Blocks.PUMPKIN_STEM,
            Blocks.ROSE_BUSH,
            Blocks.SEA_PICKLE,
            Blocks.SUGAR_CANE,
            Blocks.SUNFLOWER,
            Blocks.WHEAT
    };

    private static final IForgeRegistry<Block> BLOCK_REGISTRY = GameRegistry.findRegistry(Block.class);

    public static Set<Block> QUARK_MODDED_PLANTS = new HashSet<>();

    public static void createRegistryEntries() {
        QUARK_MODDED_PLANTS.add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("quark", "blue_blossom_sapling")));
        QUARK_MODDED_PLANTS.add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("quark", "glowshroom")));
        QUARK_MODDED_PLANTS.add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("quark", "lavender_blossom_sapling")));
        QUARK_MODDED_PLANTS.add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("quark", "orange_blossom_sapling")));
        QUARK_MODDED_PLANTS.add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("quark", "pink_blossom_sapling")));
        QUARK_MODDED_PLANTS.add(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("quark", "yellow_blossom_sapling")));
    }


    public static final String[] QUARK_MODDED_PLANT_STRINGS = {
            "blue_blossom_sapling",
            "glowshroom",
            "lavender_blossom_sapling",
            "orange_blossom_sapling",
            "pink_blossom_sapling",
            "yellow_blossom_sapling"
    };

    public static void test1() {
        // IForgeRegistry<Block> test = GameRegistry.findRegistry(Block.class);
        // Block testBlock = test.getValue(new ResourceLocation("quark", "orange_blossom_sapling"));
        Block testBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("quark", "orange_blossom_sapling"));
        DyeableFlowerPots.LOGGER.debug("111111111111111111111111111111111111111111111111111");
        DyeableFlowerPots.LOGGER.debug(testBlock.getRegistryName().getPath());
    }
}
