package pingoo04.crystalMod.references;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static pingoo04.crystalMod.references.Reference.LOGGER;
import static pingoo04.crystalMod.references.Reference.identifier;

public class ModItems
{
    public ModItems()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        LOGGER.info(">>> Registering Items");
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, identifier(name), item);
    }
}
