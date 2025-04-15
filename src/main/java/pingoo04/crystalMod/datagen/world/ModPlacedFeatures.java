package pingoo04.crystalMod.datagen.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import pingoo04.crystalMod.Reference;

import java.util.List;

import static pingoo04.crystalMod.Reference.identifier;

public class ModPlacedFeatures
{

    public ModPlacedFeatures() {
        throw new AssertionError();
    }

    public static void bootstrap(Registerable<PlacedFeature> context)
    {
        Reference.LOGGER.info(">>> Generating Placed Features Data");
    }

    public static RegistryKey<PlacedFeature> registryKey(String name)
    {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, identifier(name));
    }

    private static void register(Registerable<PlacedFeature> context,
                                 RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(Registerable<PlacedFeature> context,
                                 RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier ... modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.of(modifiers)));
    }
}
