package pingoo04.crystalMod.references;

import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static pingoo04.crystalMod.references.Reference.log;

public class ModMessages
{
    public ModMessages()
    {
        throw new AssertionError();
    }

    public static void registerC2SPackets()
    {
        log("Registering C2S Messages");
    }

    public static void registerS2CPackets()
    {
        log("Registering S2C Messages");
    }

    public static void sendToClientPlayerEntities(World world, BlockPos pos, Identifier message, PacketByteBuf data)
    {
        PlayerLookup.tracking((ServerWorld) world, pos).forEach(player ->
                                                                    ServerPlayNetworking.send(player, message, data));
    }
}
