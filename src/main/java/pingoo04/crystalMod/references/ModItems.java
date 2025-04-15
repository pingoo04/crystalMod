package pingoo04.crystalMod.references;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static pingoo04.crystalMod.Reference.*;

public class ModItems
{
    public static final Item FIRE_CRYSTAL_SHARD = registerItem("fire_crystal_shard", new Item(new FabricItemSettings()));
    public static final Item WATER_CRYSTAL_SHARD = registerItem("water_crystal_shard", new Item(new FabricItemSettings()));
    public static final Item EARTH_CRYSTAL_SHARD = registerItem("earth_crystal_shard", new Item(new FabricItemSettings()));
    public static final Item AIR_CRYSTAL_SHARD = registerItem("air_crystal_shard", new Item(new FabricItemSettings()));
    public static final Item LIGHT_CRYSTAL_SHARD = registerItem("light_crystal_shard", new Item(new FabricItemSettings()));
    public static final Item DARKNESS_CRYSTAL_SHARD = registerItem("darkness_crystal_shard", new Item(new FabricItemSettings()));

    public ModItems()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering Items");
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, identifier(name), item);
    }
}
