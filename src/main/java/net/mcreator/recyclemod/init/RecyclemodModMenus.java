
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.recyclemod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.recyclemod.world.inventory.AnswerQuestionsMenu;
import net.mcreator.recyclemod.RecyclemodMod;

public class RecyclemodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, RecyclemodMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<AnswerQuestionsMenu>> ANSWER_QUESTIONS = REGISTRY.register("answer_questions", () -> IMenuTypeExtension.create(AnswerQuestionsMenu::new));
}
