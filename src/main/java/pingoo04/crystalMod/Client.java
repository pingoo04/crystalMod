package pingoo04.crystalMod;

import net.fabricmc.api.ClientModInitializer;
import pingoo04.crystalMod.references.ModMessages;
import pingoo04.crystalMod.references.ModModelPredicateProvider;

public class Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModMessages.registerS2CPackets();
        ModModelPredicateProvider.register();
    }
}
