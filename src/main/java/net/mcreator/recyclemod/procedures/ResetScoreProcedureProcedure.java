package net.mcreator.recyclemod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.recyclemod.network.RecyclemodModVariables;

public class ResetScoreProcedureProcedure {
	public static void execute(LevelAccessor world) {
		RecyclemodModVariables.MapVariables.get(world).score = 0;
		RecyclemodModVariables.MapVariables.get(world).syncData(world);
	}
}
