package pingoo04.temp_mod.references;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static pingoo04.temp_mod.references.Reference.LOGGER;
import static pingoo04.temp_mod.references.Reference.identifier;

public class ModRecipes
{
    public ModRecipes()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        LOGGER.info(">>> Registering Recipes");
    }

    private static void register(String name, RecipeSerializer<?> serializer)
    {
        Registry.register(Registries.RECIPE_SERIALIZER, identifier(name), serializer);
    }

    private static void register(String name, RecipeType<?> recipesType)
    {
        Registry.register(Registries.RECIPE_TYPE, identifier(name), recipesType);
    }
}
