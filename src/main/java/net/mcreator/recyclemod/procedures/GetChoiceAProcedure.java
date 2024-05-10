package net.mcreator.recyclemod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.recyclemod.network.RecyclemodModVariables;

public class GetChoiceAProcedure {
	public static String execute(LevelAccessor world) {
		return RecyclemodModVariables.MapVariables.get(world).choiceA;
	}
}
