package pingoo04.crystalMod.references;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import static pingoo04.crystalMod.references.Reference.log;

public class ModRegistries
{
    public static void register()
    {
        registerFuels();
        registerModCompostables();
        registerCommands();
        registerEvents();
        registerPotionRecipes();
        registerCustomTrades();
        registerStrippables();
        registerFlammables();
        registerAttributes();
        registerOxidizables();
        createPortal();
    }

    private static void createPortal() {
        log("Registering Custom Portals");
    }

    private static void registerOxidizables() {
        log("Registering Oxidizables");
    }

    private static void registerAttributes() {
        log("Registering Attributes");
    }

    private static void registerFlammables() {
        log("Registering Flammables");
    }

    private static void registerStrippables() {
        log("Registering Strippables");
    }

    private static void registerCustomTrades() {
        log("Registering CustomTrades");
    }

    private static void registerPotionRecipes() {
        log("Registering Potion Recipes");
    }

    private static void registerEvents() {
        log("Registering Events");
    }

    private static void registerCommands() {
        log("Registering Commands");
    }

    private static void registerModCompostables() {
        log("Registering Compostables");
    }

    private static void registerFuels()
    {
        log("Registering Fuels");
        FuelRegistry registry = FuelRegistry.INSTANCE;
    }
}
