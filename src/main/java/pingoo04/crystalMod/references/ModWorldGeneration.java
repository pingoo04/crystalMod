package pingoo04.crystalMod.references;

import pingoo04.crystalMod.references.world.ModOreGeneration;

import static com.mojang.text2speech.Narrator.LOGGER;

public class ModWorldGeneration
{
    public ModWorldGeneration()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        LOGGER.info(">>> Registering World Generation");

        ModOreGeneration.generateOres();
    }

}
