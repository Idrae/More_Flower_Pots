package com._idrae.dyeable_flower_pots.util;

import com._idrae.dyeable_flower_pots.compat.BOPCompat;
import com._idrae.dyeable_flower_pots.compat.QuarkCompat;
import net.minecraft.block.Block;

import java.io.FileWriter;
import java.io.IOException;

// Messy file, used for practical reasons, not in actual code
public class JSONGenerator {

    private static final String[] quarkVanillaPlantNames = {
            "berries",
            "carrot",
            "grass",
            "lilac",
            "potato",
            "rose",
            "sugar_cane",
            "wheat"
    };

    public static void generate() throws IOException {
        // Generate JSON files

        for (String color : RegistryHandler.COLORS) {

            /*

            FileWriter writer = new FileWriter(color + "_flower_pot.json");
            writer.append("{\n");
            writer.append("\t\"type\": \"minecraft:block\",\n");
            writer.append("\t\"pools\": [\n");
            writer.append("\t\t{\n");
            writer.append("\t\t\t\"rolls\": 1,\n");
            writer.append("\t\t\t\"entries\": [\n");
            writer.append("\t\t\t\t{\n");
            writer.append("\t\t\t\t\t\"type\": \"minecraft:item\",\n");
            writer.append("\t\t\t\t\t\"name\": \"dyeable_flower_pots:" + color + "_flower_pot\"\n");
            writer.append("\t\t\t\t}\n");
            writer.append("\t\t\t],\n");
            writer.append("\t\t\t\"conditions\": [\n");
            writer.append("\t\t\t\t{\n");
            writer.append("\t\t\t\t\t\"condition\": \"minecraft:survives_explosion\"\n");
            writer.append("\t\t\t\t}\n");
            writer.append("\t\t\t]\n");
            writer.append("\t\t}\n");
            writer.append("\t]\n");
            writer.append("}");
            writer.flush();
            writer.close();

            for (Block plant : RegistryHandler.PLANTS) {
                String plantString = plant.getRegistryName().toString().replace("minecraft:", "");
                FileWriter writer1 = new FileWriter(color + "_potted_" + plantString + ".json");
                writer1.append("{\n");
                writer1.append("\t\"type\": \"minecraft:block\",\n");
                writer1.append("\t\"pools\": [\n");
                writer1.append("\t\t{\n");
                writer1.append("\t\t\t\"rolls\": 1,\n");
                writer1.append("\t\t\t\"entries\": [\n");
                writer1.append("\t\t\t\t{\n");
                writer1.append("\t\t\t\t\t\"type\": \"minecraft:item\",\n");
                writer1.append("\t\t\t\t\t\"name\": \"dyeable_flower_pots:" + color + "_flower_pot\"\n");
                writer1.append("\t\t\t\t}\n");
                writer1.append("\t\t\t],\n");
                writer1.append("\t\t\t\"conditions\": [\n");
                writer1.append("\t\t\t\t{\n");
                writer1.append("\t\t\t\t\t\"condition\": \"minecraft:survives_explosion\"\n");
                writer1.append("\t\t\t\t}\n");
                writer1.append("\t\t\t]\n");
                writer1.append("\t\t},\n");
                writer1.append("\t\t{\n");
                writer1.append("\t\t\t\"rolls\": 1,\n");
                writer1.append("\t\t\t\"entries\": [\n");
                writer1.append("\t\t\t\t{\n");
                writer1.append("\t\t\t\t\t\"type\": \"minecraft:item\",\n");
                writer1.append("\t\t\t\t\t\"name\": \"minecraft:" + plantString + "\"\n");
                writer1.append("\t\t\t\t}\n");
                writer1.append("\t\t\t],\n");
                writer1.append("\t\t\t\"conditions\": [\n");
                writer1.append("\t\t\t\t{\n");
                writer1.append("\t\t\t\t\t\"condition\": \"minecraft:survives_explosion\"\n");
                writer1.append("\t\t\t\t}\n");
                writer1.append("\t\t\t]\n");
                writer1.append("\t\t}\n");
                writer1.append("\t]\n");
                writer1.append("}");
                writer1.flush();
                writer1.close();
            }

             */
            /*
            for (Block plant : QuarkCompat.QUARK_VANILLA_PLANTS) {
                String plantString = plant.getRegistryName().getPath();
                FileWriter writer1 = new FileWriter(color + "_potted_quark_" + plantString +".json");
                writer1.append("{\n");
                writer1.append("\t\"type\": \"minecraft:block\",\n");
                writer1.append("\t\"pools\": [\n");
                writer1.append("\t\t{\n");
                writer1.append("\t\t\t\"rolls\": 1,\n");
                writer1.append("\t\t\t\"entries\": [\n");
                writer1.append("\t\t\t\t{\n");
                writer1.append("\t\t\t\t\t\"type\": \"minecraft:item\",\n");
                writer1.append("\t\t\t\t\t\"name\": \"dyeable_flower_pots:" + color + "_flower_pot\"\n");
                writer1.append("\t\t\t\t}\n");
                writer1.append("\t\t\t],\n");
                writer1.append("\t\t\t\"conditions\": [\n");
                writer1.append("\t\t\t\t{\n");
                writer1.append("\t\t\t\t\t\"condition\": \"minecraft:survives_explosion\"\n");
                writer1.append("\t\t\t\t}\n");
                writer1.append("\t\t\t]\n");
                writer1.append("\t\t},\n");
                writer1.append("\t\t{\n");
                writer1.append("\t\t\t\"rolls\": 1,\n");
                writer1.append("\t\t\t\"entries\": [\n");
                writer1.append("\t\t\t\t{\n");
                writer1.append("\t\t\t\t\t\"type\": \"minecraft:item\",\n");
                writer1.append("\t\t\t\t\t\"name\": \"minecraft:" + plantString + "\"\n");
                writer1.append("\t\t\t\t}\n");
                writer1.append("\t\t\t],\n");
                writer1.append("\t\t\t\"conditions\": [\n");
                writer1.append("\t\t\t\t{\n");
                writer1.append("\t\t\t\t\t\"condition\": \"minecraft:survives_explosion\"\n");
                writer1.append("\t\t\t\t}\n");
                writer1.append("\t\t\t]\n");
                writer1.append("\t\t}\n");
                writer1.append("\t]\n");
                writer1.append("}");
                writer1.flush();
                writer1.close();
            }

             */







            /*
            FileWriter writer = new FileWriter(color + "_potted_bamboo.json");
            writer.append("{\n");
            writer.append("\t\"ambientocclusion\": false,\n");
            writer.append("\t\"textures\": {\n");
            writer.append("\t\t\"particle\": \"dyeable_flower_pots:blocks/" + color + "_flower_pot\",\n");
            writer.append("\t\t\"flowerpot\": \"dyeable_flower_pots:blocks/" + color + "_flower_pot\",\n");
            writer.append("\t\t\"dirt\": \"block/dirt\",\n");
            writer.append("\t\t\"bamboo\": \"block/bamboo_stalk\",\n");
            writer.append("\t\t\"leaf\": \"block/bamboo_singleleaf\"\n");
            writer.append("\t}\n");
            writer.flush();
            writer.close();

             */
            /*
            FileWriter writer = new FileWriter(color + "_potted_bop_sprout.json");
            writer.append("{\n");
            writer.append("\t\"ambientocclusion\": false,\n");
            writer.append("\t\"textures\": {\n");
            writer.append("\t\t\"particle\": \"dyeable_flower_pots:blocks/" + color + "_flower_pot\",\n");
            writer.append("\t\t\"flowerpot\": \"dyeable_flower_pots:blocks/" + color + "_flower_pot\",\n");
            writer.append("\t\t\"dirt\": \"block/dirt\",\n");
            writer.append("\t\t\"plant\": \"biomesoplenty:block/potted_sprout\"\n");
            writer.append("\t}\n");
            writer.flush();
            writer.close();

             */

            /*
            FileWriter writer = new FileWriter(color + "_potted_cactus.json");
            writer.append("{\n");
            writer.append("\t\"ambientocclusion\": false,\n");
            writer.append("\t\"textures\": {\n");
            writer.append("\t\t\"particle\": \"dyeable_flower_pots:blocks/" + color + "_flower_pot\",\n");
            writer.append("\t\t\"flowerpot\": \"dyeable_flower_pots:blocks/" + color + "_flower_pot\",\n");
            writer.append("\t\t\"dirt\": \"block/dirt\",\n");
            writer.append("\t\t\"cactus\": \"block/cactus_side\"\n");
            writer.append("\t},\n");
            writer.flush();
            writer.close();
             */


            /*
            FileWriter writer = new FileWriter(color + "_potted_bamboo.json");
            writer.append("{ \"variants\": { \"\": { \"model\": \"dyeable_flower_pots:block/" + color + "_potted_bamboo\" } } }");
            writer.flush();
            writer.close();

             */

            /*
            FileWriter writer = new FileWriter(color + "_flower_pot.json");

            writer.append("{ \"variants\": { \"\": { \"model\": \"dyeable_flower_pots:block/" + color + "_flower_pot\" } } }");
            writer.flush();
            writer.close();
            for (String plant : RegistryHandler.PLANTS) {
                FileWriter writer1 = new FileWriter(color + "_potted_" + plant + ".json");
                writer1.append("{ \"variants\": { \"\": { \"model\": \"dyeable_flower_pots:block/" + color + "_potted_" + plant + "\" } } }");
                writer1.flush();
                writer1.close();
            }
             */
            /*
            for (String plant : RegistryHandler.BOP_PLANT_STRINGS) {
                FileWriter writer1 = new FileWriter(color + "_potted_bop_" + plant + ".json");
                writer1.append("{ \"variants\": { \"\": { \"model\": \"dyeable_flower_pots:block/" + color + "_potted_bop_" + plant + "\" } } }");
                writer1.flush();
                writer1.close();
            }
             */
            /*
            for (Block plant : QuarkCompat.QUARK_VANILLA_PLANTS) {
                String plantString = plant.getRegistryName().getPath();
                FileWriter writer1 = new FileWriter(color + "_potted_quark_" + plantString + ".json");
                writer1.append("{ \"variants\": { \"\": { \"model\": \"dyeable_flower_pots:block/" + color + "_potted_quark_" + plantString + "\" } } }");
                writer1.flush();
                writer1.close();
            }
             */
            /*
            for (Block plant : QuarkCompat.QUARK_MODDED_PLANTS) {
                String plantString = plant.getRegistryName().getPath();
                FileWriter writer1 = new FileWriter(color + "_potted_quark_" + plantString + ".json");
                writer1.append("{ \"variants\": { \"\": { \"model\": \"dyeable_flower_pots:block/" + color + "_potted_quark_" + plantString + "\" } } }");
                writer1.flush();
                writer1.close();
            }

             */
            /*
            for (int i=0; i<QuarkCompat.QUARK_MODDED_PLANT_STRINGS.length; ++i) {
                FileWriter writer = new FileWriter(color + "_potted_quark_" + QuarkCompat.QUARK_MODDED_PLANT_STRINGS[i] + ".json");
                writer.append("{\n");
                writer.append("\t\"parent\": \"dyeable_flower_pots:block/" + color +"_flower_pot_cross\",\n");
                writer.append("\t\"textures\": {\n");
                writer.append("\t\t\"plant\": \"quark:block/potted/" + QuarkCompat.QUARK_MODDED_PLANT_STRINGS[i] + "\"\n");
                writer.append("\t}\n");
                writer.append("}");
                writer.flush();
                writer.close();
            }

             */
            /*
            FileWriter writer = new FileWriter(color + "_potted_quark_peony.json");
            writer.append("{\n");
            writer.append("\t\"parent\": \"dyeable_flower_pots:block/" + color +"_flower_pot_cross\",\n");
            writer.append("\t\"textures\": {\n");
            writer.append("\t\t\"plant\": \"quark:block/potted/peony\"\n");
            writer.append("\t}\n");
            writer.append("}");
            writer.flush();
            writer.close();

             */




            /*
            FileWriter writer = new FileWriter(color + "_potted_quark_sunflower.json");
            writer.append("{\n");
            writer.append("\t\"ambientocclusion\": false,\n");
            writer.append("\t\"textures\": {\n");
            writer.append("\t\t\"2\": \"quark:block/potted/sunflower\",\n");
            writer.append("\t\t\"flowerpot\": \"dyeable_flower_pots:block/" + color + "_flower_pot\",\n");
            writer.append("\t\t\"particle\": \"dyeable_flower_pots:block/" + color + "_flower_pot\",\n");
            writer.append("\t\t\"dirt\": \"minecraft:block/dirt\"\n");
            writer.append("\t},\n");
            writer.flush();
            writer.close();

             */



            /*
            for (Block plant : QuarkCompat.QUARK_VANILLA_PLANTS) {
                String plantString = plant.getRegistryName().getPath();
                FileWriter writer = new FileWriter(color + "_potted_quark_" + plantString + ".json");
                writer.append("{\n");
                writer.append("\t\"parent\": \"dyeable_flower_pots:block/" + color +"_flower_pot_cross\",\n");
                writer.append("\t\"textures\": {\n");
                writer.append("\t\t\"plant\": \"quark:block/potted/" + plantString + "\"\n");
                writer.append("\t}\n");
                writer.append("}");
                writer.flush();
                writer.close();
            }

             */

            /*
            FileWriter writer = new FileWriter(color + "_flower_pot_cross.json");
            writer.append("{\n");
            writer.append("\t\"ambientocclusion\": false,\n");
            writer.append("\t\"textures\": {\n");
            writer.append("\t\t\"particle\": \"dyeable_flower_pots:blocks/" + color + "_flower_pot\",\n");
            writer.append("\t\t\"flowerpot\": \"dyeable_flower_pots:blocks/" + color + "_flower_pot\",\n");
            writer.append("\t\t\"dirt\": \"block/dirt\"\n");
            writer.append("\t},");
            writer.flush();
            writer.close();

             */


            /*
            FileWriter writer = new FileWriter(color + "_flower_pot.json");
            writer.append("{\n");
            writer.append("\t\"parent\": \"item/generated\",\n");
            writer.append("\t\"textures\": {\n");
            writer.append("\t\t\"layer0\": \"dyeable_flower_pots:items/" + color + "_flower_pot\"\n");
            writer.append("\t}\n");
            writer.append("}");
            writer.flush();
            writer.close();

             */
            /*
            for (String plant : RegistryHandler.PLANTS) {
                FileWriter writer = new FileWriter(color + "_potted_" + plant + ".json");
                writer.append("{\n");
                writer.append("\t\"parent\": \"dyeable_flower_pots:block/" + color +"_flower_pot_cross\",\n");
                writer.append("\t\"textures\": {\n");
                writer.append("\t\t\"plant\": \"block/" + plant + "\"\n");
                writer.append("\t}\n");
                writer.append("}");
                writer.flush();
                writer.close();
            }
             */
            /*
            for (String plant : RegistryHandler.BOP_PLANT_STRINGS) {
                FileWriter writer = new FileWriter(color + "_potted_bop_" + plant + ".json");
                writer.append("{\n");
                writer.append("\t\"parent\": \"dyeable_flower_pots:block/" + color +"_flower_pot_cross\",\n");
                writer.append("\t\"textures\": {\n");
                writer.append("\t\t\"plant\": \"biomesoplenty:block/" + plant + "\"\n");
                writer.append("\t}\n");
                writer.append("}");
                writer.flush();
                writer.close();
            }

             */
        }
    }
}
