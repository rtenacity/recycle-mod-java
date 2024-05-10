package net.mcreator.recyclemod.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.recyclemod.RecyclemodMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnRightClickVillagerProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Villager) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"give @a minecraft:paper");
			entity.setDeltaMovement(new Vec3(0, 0, 3));
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo((x + 10), y, z, 100);
			RecyclemodMod.queueServerWork(20, () -> {
				if (!entity.level().isClientSide())
					entity.discard();
			});
		}
		if (entity instanceof Cow) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"give @a minecraft:glass_bottle");
			entity.setDeltaMovement(new Vec3(0, 0, 3));
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo((x + 10), y, z, 100);
			RecyclemodMod.queueServerWork(20, () -> {
				if (!entity.level().isClientSide())
					entity.discard();
			});
		}
		if (entity instanceof Sheep) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"give @a minecraft:stick");
			entity.setDeltaMovement(new Vec3(0, 0, 3));
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo((x + 10), y, z, 100);
			RecyclemodMod.queueServerWork(20, () -> {
				if (!entity.level().isClientSide())
					entity.discard();
			});
		}
	}
}
