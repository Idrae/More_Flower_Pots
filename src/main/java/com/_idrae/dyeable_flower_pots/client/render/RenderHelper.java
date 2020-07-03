package com._idrae.dyeable_flower_pots.client.render;

import com._idrae.dyeable_flower_pots.util.RegistryHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

import static com._idrae.dyeable_flower_pots.DyeableFlowerPots.MOD_ID;

public class RenderHelper {

    public static void renderPottedFlowers() {
        RegistryHandler.POTTED_FLOWERS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
            if (block.getRegistryName().toString().contains("fern")) {
                Minecraft.getInstance().getBlockColors().register((p_228064_0_, p_228064_1_, p_228064_2_, p_228064_3_) -> p_228064_1_ != null && p_228064_2_ != null ? BiomeColors.getGrassColor(p_228064_1_, p_228064_2_) : GrassColors.get(0.5D, 1.0D), block);
            }
        });
        ForgeRegistries.BLOCKS.getValues().forEach(block -> {
            if (block.getRegistryName().getNamespace().equals(MOD_ID)) {
                if (block.getRegistryName().getPath().contains("potted_bop_") || block.getRegistryName().getPath().contains("potted_quark_")) {
                    RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
                }
            }
        });
    }
}
