package pingoo04.crystalMod.references;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static pingoo04.crystalMod.Reference.log;


public class ModBlocks
{
    public ModBlocks() {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering Blocks");
    }

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(name),
                new BlockItem(block, new FabricItemSettings()));
    }
}
