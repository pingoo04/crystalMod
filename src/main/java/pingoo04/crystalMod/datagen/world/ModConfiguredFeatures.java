package pingoo04.crystalMod.datagen.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import pingoo04.crystalMod.Reference;

public class ModConfiguredFeatures
{
    public ModConfiguredFeatures()
    {
        throw new AssertionError();
    }

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context)
    {
        Reference.LOGGER.info(">>> Generating Configured Features Data");
    }

    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                  RegistryKey<ConfiguredFeature<?, ?>> key,
                                                                                  F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }


}
