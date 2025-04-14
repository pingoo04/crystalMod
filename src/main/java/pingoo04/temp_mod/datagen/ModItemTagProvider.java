package pingoo04.temp_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import pingoo04.temp_mod.references.Reference;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider
{

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        Reference.LOGGER.info(">>> Generating Item Tag Data");

        getOrCreateTagBuilder(ItemTags.AXES);
        getOrCreateTagBuilder(ItemTags.PICKAXES);
        getOrCreateTagBuilder(ItemTags.SHOVELS);
        getOrCreateTagBuilder(ItemTags.SWORDS);
        getOrCreateTagBuilder(ItemTags.HOES);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR);

        getOrCreateTagBuilder(ItemTags.COPPER_ORES);

    }
}
