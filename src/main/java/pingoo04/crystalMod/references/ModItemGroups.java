package pingoo04.crystalMod.references;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static pingoo04.crystalMod.Reference.*;

public class ModItemGroups
{
    public static final ItemGroup INGREDIENTS = Registry.register(Registries.ITEM_GROUP,
                                                identifier(ModID + "_ingredient_group"),
                                                    FabricItemGroup.builder().displayName(translate("ingredient.group"))
                                                            .icon(() -> new ItemStack(ModItems.FIRE_CRYSTAL_SHARD))
                                                            .entries((displayContext, entries) -> {
                                                                entries.add(ModItems.FIRE_CRYSTAL_SHARD);
                                                                entries.add(ModItems.AIR_CRYSTAL_SHARD);
                                                                entries.add(ModItems.EARTH_CRYSTAL_SHARD);
                                                                entries.add(ModItems.WATER_CRYSTAL_SHARD);
                                                                entries.add(ModItems.LIGHT_CRYSTAL_SHARD);
                                                                entries.add(ModItems.DARKNESS_CRYSTAL_SHARD);
                                                            }).build());

    public ModItemGroups()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering Item Groups");
    }
}
