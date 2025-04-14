package pingoo04.temp_mod;

import net.fabricmc.api.ClientModInitializer;
import pingoo04.temp_mod.references.ModMessages;
import pingoo04.temp_mod.references.ModModelPredicateProvider;

public class Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModMessages.registerS2CPackets();
        ModModelPredicateProvider.register();
    }
}
