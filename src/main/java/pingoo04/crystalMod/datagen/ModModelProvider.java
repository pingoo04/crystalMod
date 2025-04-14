package pingoo04.crystalMod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import pingoo04.crystalMod.references.Reference;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        Reference.LOGGER.info(">>> Generating Block Model Data");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        Reference.LOGGER.info(">>> Generating Item Model Data");
    }
}
