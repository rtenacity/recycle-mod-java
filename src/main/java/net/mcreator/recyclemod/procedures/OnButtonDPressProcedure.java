package net.mcreator.recyclemod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.recyclemod.network.RecyclemodModVariables;

public class OnButtonDPressProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (("d").equals(RecyclemodModVariables.MapVariables.get(world).correctAnswer)) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Correct!"), false);
			RecyclemodModVariables.MapVariables.get(world).score = RecyclemodModVariables.MapVariables.get(world).score + 20;
			RecyclemodModVariables.MapVariables.get(world).syncData(world);
		} else {
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Incorrect. The correct answer is:"), false);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(RecyclemodModVariables.MapVariables.get(world).correctAnswer), false);
		}
	}
}
