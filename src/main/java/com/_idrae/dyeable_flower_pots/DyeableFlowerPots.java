package com._idrae.dyeable_flower_pots;

import biomesoplenty.api.block.BOPBlocks;
import com._idrae.dyeable_flower_pots.util.JSONGenerator;
import com._idrae.dyeable_flower_pots.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraft.world.gen.feature.structure.DesertPyramidStructure;
import net.minecraft.world.gen.feature.structure.DesertVillagePools;
import net.minecraft.world.gen.feature.structure.Structures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;

@Mod(DyeableFlowerPots.MOD_ID)
@Mod.EventBusSubscriber(modid=DyeableFlowerPots.MOD_ID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class DyeableFlowerPots
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "dyeable_flower_pots";

    public DyeableFlowerPots() throws IOException {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::doClientStuff);
        JSONGenerator.generate();
        RegistryHandler.POTS.register(modEventBus);
        RegistryHandler.POTTED_FLOWERS.register(modEventBus);
        RegistryHandler.registerPottedFlowers();
        // RegistryHandler.registerModdedPottedFlowers();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }


    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        RegistryHandler.POTTED_FLOWERS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
            if (block.getRegistryName().toString().contains("fern")) {
                Minecraft.getInstance().getBlockColors().register((p_228064_0_, p_228064_1_, p_228064_2_, p_228064_3_) -> p_228064_1_ != null && p_228064_2_ != null ? BiomeColors.getGrassColor(p_228064_1_, p_228064_2_) : GrassColors.get(0.5D, 1.0D), block);
            }
        });
        ForgeRegistries.BLOCKS.getValues().forEach(block -> {
            if (block.getRegistryName().toString().contains("_bop_")) {
                RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
            }
        });
        // RenderTypeLookup.setRenderLayer(RegistryHandler.BLACK_FLOWER_POT.get(), RenderType.getCutout());

    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {

        final IForgeRegistry<Item> registry = event.getRegistry();
        RegistryHandler.POTS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(DyeableFlowerPotsItemGroup.INSTANCE);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
        LOGGER.info("BlockItems registered.");
    }

    @SubscribeEvent
    public static void onRegisterModdedFlowers(final RegistryEvent.Register<Block> event) {
        final IForgeRegistry<Block> registry = event.getRegistry();
        RegistryHandler.registerModdedPottedFlowers(registry);


    }

    public static class DyeableFlowerPotsItemGroup extends ItemGroup {

        public static final DyeableFlowerPotsItemGroup INSTANCE = new DyeableFlowerPotsItemGroup(ItemGroup.GROUPS.length, MOD_ID);
        private DyeableFlowerPotsItemGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.LIGHT_BLUE_FLOWER_POT.get());
        }
    }
}
