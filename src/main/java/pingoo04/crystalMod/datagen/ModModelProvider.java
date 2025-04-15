package pingoo04.crystalMod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import pingoo04.crystalMod.references.ModItems;

import static pingoo04.crystalMod.Reference.log;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        log("Generating Block Model Data");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        log("Generating Item Model Data");

        itemModelGenerator.register(ModItems.FIRE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.AIR_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.EARTH_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATER_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARKNESS_CRYSTAL_SHARD, Models.GENERATED);
    }
}
