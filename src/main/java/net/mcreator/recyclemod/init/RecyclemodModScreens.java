
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.recyclemod.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.recyclemod.client.gui.AnswerQuestionsScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RecyclemodModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RecyclemodModMenus.ANSWER_QUESTIONS.get(), AnswerQuestionsScreen::new);
	}
}
