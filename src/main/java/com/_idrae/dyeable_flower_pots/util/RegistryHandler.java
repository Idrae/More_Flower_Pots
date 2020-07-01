package com._idrae.dyeable_flower_pots.util;

import com._idrae.dyeable_flower_pots.DyeableFlowerPots;
import com._idrae.dyeable_flower_pots.blocks.DyedFlowerPotBlock;
import com._idrae.dyeable_flower_pots.compat.BOPCompat;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

public class RegistryHandler {

    public static final String[] COLORS = {"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"};
    // public static final String[] PLANTS = {"oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling", "fern", "dandelion", "poppy", "blue_orchid", "allium", "azure_bluet", "bamboo", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy", "cornflower", "lily_of_the_valley", "wither_rose", "red_mushroom", "brown_mushroom", "dead_bush", "cactus"};
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

    /*
    public static final String[] QUARK_VANILLA_PLANT_STRINGS = {
            "beetroot",
            "berries",
            "carrot",
            "chorus",
            "cocoa_beans",
            "grass",
            "lilac",
            "melon",
            "nether_wart",
            "peony",
            "potato",
            "pumpkin",
            "rose",
            "sea_pickle",
            "sugar_cane",
            "sunflower",
            "wheat",
    };

     */

    public static final String[] BOP_PLANT_STRINGS = {
            "origin_sapling",
            "flowering_oak_sapling",
            "rainbow_birch_sapling",
            "yellow_autumn_sapling",
            "orange_autumn_sapling",
            "maple_sapling",
            "fir_sapling",
            "redwood_sapling",
            "white_cherry_sapling",
            "pink_cherry_sapling",
            "mahogany_sapling",
            "jacaranda_sapling",
            "palm_sapling",
            "willow_sapling",
            "dead_sapling",
            "magic_sapling",
            "umbran_sapling",
            "hellbark_sapling",
            "rose",
            "violet",
            "lavender",
            "wildflower",
            "orange_cosmos",
            "pink_daffodil",
            "pink_hibiscus",
            "glowflower",
            "wilted_lily",
            "burning_blossom",
            "sprout",
            "toadstool",
            "glowshroom"
    };

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

    public static final String[] QUARK_MODDED_PLANT_STRINGS = {
            "blue_blossom_sapling",
            "glowshroom",
            "lavender_blossom_sapling",
            "orange_blossom_sapling",
            "pink_blossom_sapling",
            "yellow_blossom_sapling"

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
                String plantString = plant.getRegistryName().toString().replace("minecraft:", "");
                POTTED_FLOWERS.register(color + "_potted_" + plantString, () -> new DyedFlowerPotBlock(() -> getPot(color), () -> plant, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), color));
            }
        }
    }


    public static void registerModdedPottedFlowers(IForgeRegistry<Block> registry) {

        /*
        if (ModList.get().isLoaded("biomesoplenty")) {
            for (String color : COLORS) {
                for (String plantString : BOP_PLANT_STRINGS) {
                    ResourceLocation plantLoc = new ResourceLocation("biomesoplenty", plantString);
                    if (ForgeRegistries.BLOCKS.containsKey(plantLoc)) {
                        Block bopPlant = ForgeRegistries.BLOCKS.getValue(plantLoc);
                        POTTED_FLOWERS.register(color + "_potted_bop_" + plantString, () -> new DyedFlowerPotBlock(() -> getPot(color), () -> bopPlant, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), color));
                    }
                }
            }
        }
         */
        if (ModList.get().isLoaded("biomesoplenty")) {
            DyeableFlowerPots.LOGGER.debug("1111111111111111");
            for (String color : COLORS) {
                int i = 0;
                for (Block plant : BOPCompat.BOP_PLANTS) {
                    registry.register(new DyedFlowerPotBlock(() -> getPot(color), () -> plant, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), color).setRegistryName(color + "_potted_bop_" + BOP_PLANT_STRINGS[i]));
                    ++i;
                }
            }
        }

        /*
        if (ModList.get().isLoaded("quark")) {
            for (String color : COLORS) {
                for (Block plant : QUARK_VANILLA_PLANTS) {
                    String plantString = plant.getRegistryName().toString().replace("minecraft:", "");
                    POTTED_FLOWERS.register(color + "_potted_quark_" + plantString, () -> new DyedFlowerPotBlock(() -> getPot(color), () -> plant, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), color));
                }
                for (String plantString : QUARK_MODDED_PLANT_STRINGS) {
                    ResourceLocation plantLoc = new ResourceLocation("quark", plantString);
                    if (ForgeRegistries.BLOCKS.containsKey(plantLoc)) {
                        Block quarkPlant = ForgeRegistries.BLOCKS.getValue(plantLoc);
                        POTTED_FLOWERS.register(color + "_potted_quark_" + plantString, () -> new DyedFlowerPotBlock(() -> getPot(color), () -> quarkPlant, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0f).notSolid(), color));
                    }
                }
            }
        }

         */

    }

    /*
    public static void registerModdedPottedFlowersExp() {

        for (String color : COLORS) {
            for (Block block: ForgeRegistries.BLOCKS.getValues()) {
                if (block.getRegistryName().getNamespace() != "minecraft" && block.getRegistryName().getNamespace() != "dyeable_flower_pots") {
                    if (block instanceof FlowerPotBlock) {
                        Block flower = ((FlowerPotBlock) block).func_220276_d().getBlock();

                    }
                }
            }
        }
    }
    */

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



