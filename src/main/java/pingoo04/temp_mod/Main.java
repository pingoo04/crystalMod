package pingoo04.temp_mod;

import net.fabricmc.api.ModInitializer;

import pingoo04.temp_mod.references.ModWorldGeneration;
import pingoo04.temp_mod.references.*;

import static pingoo04.temp_mod.references.Reference.LOGGER;

public class Main implements ModInitializer {


	@Override
	public void onInitialize() {
		LOGGER.info(">>> Initializing");

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
	}
}