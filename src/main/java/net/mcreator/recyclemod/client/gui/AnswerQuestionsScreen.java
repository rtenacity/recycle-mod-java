package net.mcreator.recyclemod.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.recyclemod.world.inventory.AnswerQuestionsMenu;
import net.mcreator.recyclemod.procedures.GetQuestionProcedure;
import net.mcreator.recyclemod.procedures.GetChoiceDProcedure;
import net.mcreator.recyclemod.procedures.GetChoiceCProcedure;
import net.mcreator.recyclemod.procedures.GetChoiceBProcedure;
import net.mcreator.recyclemod.procedures.GetChoiceAProcedure;
import net.mcreator.recyclemod.network.AnswerQuestionsButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AnswerQuestionsScreen extends AbstractContainerScreen<AnswerQuestionsMenu> {
	private final static HashMap<String, Object> guistate = AnswerQuestionsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_a;
	Button button_b;
	Button button_c;
	Button button_d;

	public AnswerQuestionsScreen(AnswerQuestionsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 417;
		this.imageHeight = 167;
	}

	private static final ResourceLocation texture = new ResourceLocation("recyclemod:textures/screens/answer_questions.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				GetQuestionProcedure.execute(world), 11, 13, -12829636, false);
		guiGraphics.drawString(this.font,

				GetChoiceAProcedure.execute(world), 11, 35, -12829636, false);
		guiGraphics.drawString(this.font,

				GetChoiceBProcedure.execute(world), 11, 55, -12829636, false);
		guiGraphics.drawString(this.font,

				GetChoiceCProcedure.execute(world), 11, 75, -12829636, false);
		guiGraphics.drawString(this.font,

				GetChoiceDProcedure.execute(world), 11, 95, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_a = Button.builder(Component.translatable("gui.recyclemod.answer_questions.button_a"), e -> {
			if (true) {
				PacketDistributor.SERVER.noArg().send(new AnswerQuestionsButtonMessage(0, x, y, z));
				AnswerQuestionsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 133, this.topPos + 135, 30, 20).build();
		guistate.put("button:button_a", button_a);
		this.addRenderableWidget(button_a);
		button_b = Button.builder(Component.translatable("gui.recyclemod.answer_questions.button_b"), e -> {
			if (true) {
				PacketDistributor.SERVER.noArg().send(new AnswerQuestionsButtonMessage(1, x, y, z));
				AnswerQuestionsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 170, this.topPos + 135, 30, 20).build();
		guistate.put("button:button_b", button_b);
		this.addRenderableWidget(button_b);
		button_c = Button.builder(Component.translatable("gui.recyclemod.answer_questions.button_c"), e -> {
			if (true) {
				PacketDistributor.SERVER.noArg().send(new AnswerQuestionsButtonMessage(2, x, y, z));
				AnswerQuestionsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 210, this.topPos + 135, 30, 20).build();
		guistate.put("button:button_c", button_c);
		this.addRenderableWidget(button_c);
		button_d = Button.builder(Component.translatable("gui.recyclemod.answer_questions.button_d"), e -> {
			if (true) {
				PacketDistributor.SERVER.noArg().send(new AnswerQuestionsButtonMessage(3, x, y, z));
				AnswerQuestionsButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 249, this.topPos + 135, 30, 20).build();
		guistate.put("button:button_d", button_d);
		this.addRenderableWidget(button_d);
	}
}
