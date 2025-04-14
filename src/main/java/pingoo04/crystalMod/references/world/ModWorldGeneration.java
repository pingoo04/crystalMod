package pingoo04.crystalMod.references.world;

import static pingoo04.crystalMod.references.Reference.log;

public class ModWorldGeneration {
    public ModWorldGeneration() {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering World Generation");

        ModGeodeGeneration.generate();
        ModOreGeneration.generate();
        ModTreeGeneration.generate();
        ModFlowerGeneration.generate();
        ModEntitySpawns.addSpawns();
    }
}
