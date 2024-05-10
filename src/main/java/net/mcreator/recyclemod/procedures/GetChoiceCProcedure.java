package net.mcreator.recyclemod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.recyclemod.network.RecyclemodModVariables;

public class GetChoiceCProcedure {
	public static String execute(LevelAccessor world) {
		return RecyclemodModVariables.MapVariables.get(world).chioiceC;
	}
}
