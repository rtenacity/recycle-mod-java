package net.mcreator.recyclemod.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.recyclemod.network.RecyclemodModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnPlayerDeathProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		RecyclemodModVariables.MapVariables.get(world).score = 0;
		RecyclemodModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(6);
		RecyclemodModVariables.MapVariables.get(world).round = 0;
		RecyclemodModVariables.MapVariables.get(world).syncData(world);
	}
}
