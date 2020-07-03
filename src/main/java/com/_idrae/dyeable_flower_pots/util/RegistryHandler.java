package com._idrae.dyeable_flower_pots.util;

import com._idrae.dyeable_flower_pots.DyeableFlowerPots;
import com._idrae.dyeable_flower_pots.blocks.DyedFlowerPotBlock;
import com._idrae.dyeable_flower_pots.compat.BOPCompat;
import com._idrae.dyeable_flower_pots.compat.QuarkCompat;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

public class RegistryHandler {

    public static final String[] COLORS = {"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"};
    public static final String[] PLANT_STRINGS = {"oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling", "fern", "dandelion", "poppy", "blue_orchid", "allium", "azure_bluet", "bamboo", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy", "cornflower", "lily_of_the_valley", "wither_rose", "red_mushroom", "brown_mushroom", "dead_bush", "cactus"};
    public static final Block[] PLANTS = {
            Blocks.OAK_SAPLING,
            Blocks.SPRUCE_SAPLING,
            Blocks.BIRCH_SAPLING,
            Blocks.JUNGLE_SAPLING,
            Blocks.ACACIA_SAPLING,
            Blocks.DARK_OAK_SAPLING,
            Blocks.FERN,
            Blocks.DANDELION,
            Blocks.POPPY,
            Blocks.BLUE_ORCHID,
            Blocks.ALLIUM,
            Blocks.AZURE_BLUET,
            Blocks.BAMBOO,
            Blocks.RED_TULIP,
            Blocks.ORANGE_TULIP,
            Blocks.WHITE_TULIP,
            Blocks.PINK_TULIP,
            Blocks.OXEYE_DAISY,
            Blocks.CORNFLOWER,
            Blocks.LILY_OF_THE_VALLEY,
            Blocks.WITHER_ROSE,
            Blocks.RED_MUSHROOM,
            Blocks.BROWN_MUSHROOM,
            Blocks.DEAD_BUSH,
            Blocks.CACTUS
    };

    public static final DeferredRegister<Block> POTS = DeferredRegister.create(ForgeRegistries.BLOCKS, DyeableFlowerPots.MOD_ID);

    public static final RegistryObject<Block> WHITE_FLOWER_POT = POTS.register("white_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "white"));
    public static final RegistryObject<Block> ORANGE_FLOWER_POT = POTS.register("orange_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "orange"));
    public static final RegistryObject<Block> MAGENTA_FLOWER_POT = POTS.register("magenta_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "magenta"));
    public static final RegistryObject<Block> LIGHT_BLUE_FLOWER_POT = POTS.register("light_blue_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "light_blue"));
    public static final RegistryObject<Block> YELLOW_FLOWER_POT = POTS.register("yellow_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "yellow"));
    public static final RegistryObject<Block> LIME_FLOWER_POT = POTS.register("lime_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "lime"));
    public static final RegistryObject<Block> PINK_FLOWER_POT = POTS.register("pink_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "pink"));
    public static final RegistryObject<Block> GRAY_FLOWER_POT = POTS.register("gray_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "gray"));
    public static final RegistryObject<Block> LIGHT_GRAY_FLOWER_POT = POTS.register("light_gray_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "light_gray"));
    public static final RegistryObject<Block> CYAN_FLOWER_POT = POTS.register("cyan_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "cyan"));
    public static final RegistryObject<Block> PURPLE_FLOWER_POT = POTS.register("purple_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "purple"));
    public static final RegistryObject<Block> BLUE_FLOWER_POT = POTS.register("blue_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "blue"));
    public static final RegistryObject<Block> BROWN_FLOWER_POT = POTS.register("brown_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "brown"));
    public static final RegistryObject<Block> GREEN_FLOWER_POT = POTS.register("green_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "green"));
    public static final RegistryObject<Block> RED_FLOWER_POT = POTS.register("red_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "red"));
    public static final RegistryObject<Block> BLACK_FLOWER_POT = POTS.register("black_flower_pot", () -> new DyedFlowerPotBlock(null, () -> Blocks.AIR, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), "black"));

    public static final DeferredRegister<Block> POTTED_FLOWERS = DeferredRegister.create(ForgeRegistries.BLOCKS, DyeableFlowerPots.MOD_ID);

    public static void registerPottedFlowers() {
        for (String color : COLORS) {
            for (Block plant : PLANTS) {
                String plantString = plant.getRegistryName().getPath();
                POTTED_FLOWERS.register(color + "_potted_" + plantString, () -> new DyedFlowerPotBlock(() -> getPot(color), () -> plant, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), color));
            }
        }
    }

    public static void registerModdedPottedFlowers(IForgeRegistry<Block> registry) {

        if (ModList.get().isLoaded("biomesoplenty")) {
            for (String color : COLORS) {
                for (Block plant : BOPCompat.BOP_PLANTS) {
                    if (plant != Blocks.AIR) {
                        String plantString = plant.getRegistryName().getPath();
                        registry.register(new DyedFlowerPotBlock(() -> getPot(color), () -> plant, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), color).setRegistryName(color + "_potted_bop_" + plantString));
                    }
                }
            }
        }

        if (ModList.get().isLoaded("quark")) {
            for (String color : COLORS) {
                for (Block plant : QuarkCompat.QUARK_VANILLA_PLANTS) {
                    String plantString = plant.getRegistryName().getPath();
                    registry.register(new DyedFlowerPotBlock(() -> getPot(color), () -> plant, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), color).setRegistryName(color + "_potted_quark_" + plantString));
                }
                QuarkCompat.createRegistryEntries();
                for (Block plant : QuarkCompat.QUARK_MODDED_PLANTS) {
                    if (plant != Blocks.AIR) {
                        String plantString = plant.getRegistryName().getPath();
                        DyeableFlowerPots.LOGGER.debug(plantString);
                        registry.register(new DyedFlowerPotBlock(() -> getPot(color), () -> plant, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), color).setRegistryName(color + "_potted_quark_" + plantString));
                    }
                }
            }
        }
    }

    private static DyedFlowerPotBlock getPot(String color) {
        switch (color) {
            case "white":
                return (DyedFlowerPotBlock) RegistryHandler.WHITE_FLOWER_POT.get();
            case "orange":
                return (DyedFlowerPotBlock) RegistryHandler.ORANGE_FLOWER_POT.get();
            case "magenta":
                return (DyedFlowerPotBlock) RegistryHandler.MAGENTA_FLOWER_POT.get();
            case "light_blue":
                return (DyedFlowerPotBlock) RegistryHandler.LIGHT_BLUE_FLOWER_POT.get();
            case "yellow":
                return (DyedFlowerPotBlock) RegistryHandler.YELLOW_FLOWER_POT.get();
            case "lime":
                return (DyedFlowerPotBlock) RegistryHandler.LIME_FLOWER_POT.get();
            case "pink":
                return (DyedFlowerPotBlock) RegistryHandler.PINK_FLOWER_POT.get();
            case "gray":
                return (DyedFlowerPotBlock) RegistryHandler.GRAY_FLOWER_POT.get();
            case "light_gray":
                return (DyedFlowerPotBlock) RegistryHandler.LIGHT_GRAY_FLOWER_POT.get();
            case "cyan":
                return (DyedFlowerPotBlock) RegistryHandler.CYAN_FLOWER_POT.get();
            case "purple":
                return (DyedFlowerPotBlock) RegistryHandler.PURPLE_FLOWER_POT.get();
            case "blue":
                return (DyedFlowerPotBlock) RegistryHandler.BLUE_FLOWER_POT.get();
            case "brown":
                return (DyedFlowerPotBlock) RegistryHandler.BROWN_FLOWER_POT.get();
            case "green":
                return (DyedFlowerPotBlock) RegistryHandler.GREEN_FLOWER_POT.get();
            case "red":
                return (DyedFlowerPotBlock) RegistryHandler.RED_FLOWER_POT.get();
            default:
                return (DyedFlowerPotBlock) RegistryHandler.BLACK_FLOWER_POT.get();
        }
    }
}



