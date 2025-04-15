package pingoo04.crystalMod;

import net.fabricmc.api.ModInitializer;

import pingoo04.crystalMod.references.world.ModWorldGeneration;
import pingoo04.crystalMod.references.*;

import static pingoo04.crystalMod.Reference.logBackRGB256;

public class Main implements ModInitializer {

	public static boolean DEBUG = true;

	@Override
	public void onInitialize()
	{
		logBackRGB256("Initializing", 255, 255, 0, 255, 0, 127);

		ModItems.register();
		ModBlocks.register();
		ModItemGroups.register();
		ModCommands.register();
		ModBlockEntities.register();
		ModScreenHandlers.register();
		ModRecipes.register();
		ModWorldGeneration.register();
		ModMessages.registerC2SPackets();
		ModEffects.register();

		ModRegistries.register();
	}
}