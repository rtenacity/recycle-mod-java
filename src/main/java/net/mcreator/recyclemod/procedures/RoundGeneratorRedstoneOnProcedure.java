package net.mcreator.recyclemod.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.recyclemod.world.inventory.AnswerQuestionsMenu;
import net.mcreator.recyclemod.network.RecyclemodModVariables;
import net.mcreator.recyclemod.init.RecyclemodModItems;
import net.mcreator.recyclemod.RecyclemodMod;

import java.util.Comparator;

import io.netty.buffer.Unpooled;

public class RoundGeneratorRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Entity villager = null;
		double i = 0;
		double zed = 0;
		double choice = 0;
		double itemNum = 0;
		double diamonds = 0;
		RecyclemodModVariables.MapVariables.get(world).round = RecyclemodModVariables.MapVariables.get(world).round + 1;
		RecyclemodModVariables.MapVariables.get(world).syncData(world);
		if (RecyclemodModVariables.MapVariables.get(world).round > 10) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("You already beat the game!"), false);
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("Round " + RecyclemodModVariables.MapVariables.get(world).round)), false);
			zed = 44;
			i = 0;
			while (i < 5) {
				choice = Math.floor(Math.random() * 3);
				if (choice == 0) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((zed - i), (-59), (-4)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon minecraft:villager ~ ~ ~ {Tags:[\"game\"]}");
				}
				if (choice == 1) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((zed - i), (-59), (-4)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon minecraft:sheep ~ ~ ~ {Tags:[\"game\"]}");
				}
				if (choice == 2) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((zed - i), (-59), (-4)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"summon minecraft:cow ~ ~ ~ {Tags:[\"game\"]}");
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((zed - i), (-60), (-4)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect give @e[tag=game] minecraft:slowness infinite 255 true");
				i = i + 1;
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"bossbar set recyclemod:timer value 600");
			RecyclemodMod.queueServerWork(20, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"bossbar set recyclemod:timer value 580");
				RecyclemodMod.queueServerWork(20, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"bossbar set recyclemod:timer value 560");
					RecyclemodMod.queueServerWork(20, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"bossbar set recyclemod:timer value 540");
						RecyclemodMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"bossbar set recyclemod:timer value 520");
							RecyclemodMod.queueServerWork(20, () -> {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "bossbar set recyclemod:timer value 500");
								RecyclemodMod.queueServerWork(20, () -> {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"bossbar set recyclemod:timer value 480");
									RecyclemodMod.queueServerWork(20, () -> {
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
													"bossbar set recyclemod:timer value 460");
										RecyclemodMod.queueServerWork(20, () -> {
											if (world instanceof ServerLevel _level)
												_level.getServer().getCommands().performPrefixedCommand(
														new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
														"bossbar set recyclemod:timer value 440");
											RecyclemodMod.queueServerWork(20, () -> {
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
															"bossbar set recyclemod:timer value 420");
												RecyclemodMod.queueServerWork(20, () -> {
													if (world instanceof ServerLevel _level)
														_level.getServer().getCommands().performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																"bossbar set recyclemod:timer value 400");
													RecyclemodMod.queueServerWork(20, () -> {
														if (world instanceof ServerLevel _level)
															_level.getServer().getCommands().performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																	"bossbar set recyclemod:timer value 380");
														RecyclemodMod.queueServerWork(20, () -> {
															if (world instanceof ServerLevel _level)
																_level.getServer().getCommands().performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																		"bossbar set recyclemod:timer value 360");
															RecyclemodMod.queueServerWork(20, () -> {
																if (world instanceof ServerLevel _level)
																	_level.getServer().getCommands().performPrefixedCommand(
																			new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																			"bossbar set recyclemod:timer value 340");
																RecyclemodMod.queueServerWork(20, () -> {
																	if (world instanceof ServerLevel _level)
																		_level.getServer().getCommands().performPrefixedCommand(
																				new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																				"bossbar set recyclemod:timer value 320");
																	RecyclemodMod.queueServerWork(20, () -> {
																		if (world instanceof ServerLevel _level)
																			_level.getServer().getCommands().performPrefixedCommand(
																					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																					"bossbar set recyclemod:timer value 300");
																		RecyclemodMod.queueServerWork(20, () -> {
																			if (world instanceof ServerLevel _level)
																				_level.getServer().getCommands().performPrefixedCommand(
																						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																						"bossbar set recyclemod:timer value 280");
																			RecyclemodMod.queueServerWork(20, () -> {
																				if (world instanceof ServerLevel _level)
																					_level.getServer().getCommands().performPrefixedCommand(
																							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																									.withSuppressedOutput(),
																							"bossbar set recyclemod:timer value 280");
																				RecyclemodMod.queueServerWork(20, () -> {
																					if (world instanceof ServerLevel _level)
																						_level.getServer().getCommands().performPrefixedCommand(
																								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																										.withSuppressedOutput(),
																								"bossbar set recyclemod:timer value 260");
																					RecyclemodMod.queueServerWork(20, () -> {
																						if (world instanceof ServerLevel _level)
																							_level.getServer().getCommands().performPrefixedCommand(
																									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																											.withSuppressedOutput(),
																									"bossbar set recyclemod:timer value 240");
																						RecyclemodMod.queueServerWork(20, () -> {
																							if (world instanceof ServerLevel _level)
																								_level.getServer().getCommands().performPrefixedCommand(
																										new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																												.withSuppressedOutput(),
																										"bossbar set recyclemod:timer value 220");
																							RecyclemodMod.queueServerWork(20, () -> {
																								if (world instanceof ServerLevel _level)
																									_level.getServer().getCommands().performPrefixedCommand(
																											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																													.withSuppressedOutput(),
																											"bossbar set recyclemod:timer value 200");
																								RecyclemodMod.queueServerWork(20, () -> {
																									if (world instanceof ServerLevel _level)
																										_level.getServer().getCommands().performPrefixedCommand(
																												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																														.withSuppressedOutput(),
																												"bossbar set recyclemod:timer value 180");
																									RecyclemodMod.queueServerWork(20, () -> {
																										if (world instanceof ServerLevel _level)
																											_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
																													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "bossbar set recyclemod:timer value 160");
																										RecyclemodMod.queueServerWork(20, () -> {
																											if (world instanceof ServerLevel _level)
																												_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level,
																														4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "bossbar set recyclemod:timer value 140");
																											RecyclemodMod.queueServerWork(20, () -> {
																												if (world instanceof ServerLevel _level)
																													_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
																															_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																															"bossbar set recyclemod:timer value 120");
																												RecyclemodMod.queueServerWork(20, () -> {
																													if (world instanceof ServerLevel _level)
																														_level.getServer().getCommands()
																																.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
																																		Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																																		"bossbar set recyclemod:timer value 100");
																													RecyclemodMod.queueServerWork(20, () -> {
																														if (world instanceof ServerLevel _level)
																															_level.getServer().getCommands()
																																	.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
																																			Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																																			"bossbar set recyclemod:timer value 80");
																														RecyclemodMod.queueServerWork(20, () -> {
																															if (world instanceof ServerLevel _level)
																																_level.getServer().getCommands()
																																		.performPrefixedCommand(
																																				new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
																																						Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																																				"bossbar set recyclemod:timer value 60");
																															RecyclemodMod.queueServerWork(20, () -> {
																																if (world instanceof ServerLevel _level)
																																	_level.getServer().getCommands()
																																			.performPrefixedCommand(
																																					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
																																							Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																																					"bossbar set recyclemod:timer value 40");
																																RecyclemodMod.queueServerWork(20, () -> {
																																	if (world instanceof ServerLevel _level)
																																		_level.getServer().getCommands().performPrefixedCommand(
																																				new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
																																						Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																																				"bossbar set recyclemod:timer value 20");
																																	RecyclemodMod.queueServerWork(20, () -> {
																																		if (world instanceof ServerLevel _level)
																																			_level.getServer().getCommands().performPrefixedCommand(
																																					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
																																							Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																																					"bossbar set recyclemod:timer value 0");
																																		if (!world.isClientSide() && world.getServer() != null)
																																			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Time's up!"), false);
																																		if (((Entity) world
																																				.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 10000000, 10000000, 10000000), e -> true)
																																				.stream().sorted(new Object() {
																																					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																																						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																																					}
																																				}.compareDistOf(x, y, z)).findFirst().orElse(null))
																																				.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
																																			for (int _idx = 0; _idx < _modHandler.getSlots(); _idx++) {
																																				ItemStack itemstackiterator = _modHandler.getStackInSlot(_idx).copy();
																																				if (Items.PAPER == itemstackiterator.getItem()) {
																																					RecyclemodModVariables.MapVariables
																																							.get(world).does_have = RecyclemodModVariables.MapVariables.get(world).does_have
																																									+ itemstackiterator.getCount();
																																					RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																				}
																																				if (RecyclemodModItems.WET_PULP.get() == itemstackiterator.getItem()) {
																																					RecyclemodModVariables.MapVariables
																																							.get(world).does_have = RecyclemodModVariables.MapVariables.get(world).does_have
																																									+ itemstackiterator.getCount();
																																					RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																				}
																																				if (RecyclemodModItems.DRY_PULP.get() == itemstackiterator.getItem()) {
																																					RecyclemodModVariables.MapVariables
																																							.get(world).does_have = RecyclemodModVariables.MapVariables.get(world).does_have
																																									+ itemstackiterator.getCount();
																																					RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																				}
																																				if (Blocks.GLASS.asItem() == itemstackiterator.getItem()) {
																																					RecyclemodModVariables.MapVariables
																																							.get(world).does_have = RecyclemodModVariables.MapVariables.get(world).does_have
																																									+ itemstackiterator.getCount();
																																					RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																				}
																																				if (RecyclemodModItems.CRUSHED_GLASS.get() == itemstackiterator.getItem()) {
																																					RecyclemodModVariables.MapVariables
																																							.get(world).does_have = RecyclemodModVariables.MapVariables.get(world).does_have
																																									+ itemstackiterator.getCount();
																																					RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																				}
																																				if (Items.STICK == itemstackiterator.getItem()) {
																																					RecyclemodModVariables.MapVariables
																																							.get(world).does_have = RecyclemodModVariables.MapVariables.get(world).does_have
																																									+ itemstackiterator.getCount();
																																					RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																				}
																																				if (RecyclemodModItems.WOOD_CHIPS.get() == itemstackiterator.getItem()) {
																																					RecyclemodModVariables.MapVariables
																																							.get(world).does_have = RecyclemodModVariables.MapVariables.get(world).does_have
																																									+ itemstackiterator.getCount();
																																					RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																				}
																																			}
																																		}
																																		if (RecyclemodModVariables.MapVariables.get(world).does_have != 0) {
																																			((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 10000000, 10000000, 10000000),
																																					e -> true).stream().sorted(new Object() {
																																						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																																							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																																						}
																																					}.compareDistOf(x, y, z)).findFirst().orElse(null)).hurt(new DamageSource(world.registryAccess()
																																							.registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 2);
																																			if (!world.isClientSide() && world.getServer() != null)
																																				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Lost a life!"), false);
																																		}
																																		RecyclemodModVariables.MapVariables.get(world).does_have = 0;
																																		RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																		RecyclemodModVariables.MapVariables.get(world).question = "What is meant by the expression Going Green?";
																																		RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																		RecyclemodModVariables.MapVariables.get(world).choiceA = "A) Becoming more environmentally aware";
																																		RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																		RecyclemodModVariables.MapVariables
																																				.get(world).choiceB = "B) Reducing the amount of pollution and waste you create";
																																		RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																		RecyclemodModVariables.MapVariables.get(world).chioiceC = "C) Planting a tree";
																																		RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																		RecyclemodModVariables.MapVariables.get(world).choiceD = "D) All of the above";
																																		RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																		RecyclemodModVariables.MapVariables.get(world).correctAnswer = "d";
																																		RecyclemodModVariables.MapVariables.get(world).syncData(world);
																																		if (!world.isClientSide() && world.getServer() != null)
																																			world.getServer().getPlayerList()
																																					.broadcastSystemMessage(Component.literal("Now, answer a question for some points"), false);
																																		SetQuestionProcedure.execute(world);
																																		RecyclemodMod.queueServerWork(25, () -> {
																																			if (((Entity) world.getEntitiesOfClass(Player.class,
																																					AABB.ofSize(new Vec3(x, y, z), 10000000, 10000000, 10000000), e -> true).stream()
																																					.sorted(new Object() {
																																						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																																							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																																						}
																																					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof ServerPlayer _ent) {
																																				BlockPos _bpos = BlockPos.containing(x, y, z);
																																				_ent.openMenu(new MenuProvider() {
																																					@Override
																																					public Component getDisplayName() {
																																						return Component.literal("AnswerQuestions");
																																					}

																																					@Override
																																					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
																																						return new AnswerQuestionsMenu(id, inventory,
																																								new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
																																					}
																																				}, _bpos);
																																			}
																																		});
																																		if (RecyclemodModVariables.MapVariables.get(world).round == 10) {
																																			if (!world.isClientSide() && world.getServer() != null)
																																				world.getServer().getPlayerList()
																																						.broadcastSystemMessage(Component.literal("Congrats on beating the game!"), false);
																																		}
																																	});
																																});
																															});
																														});
																													});
																												});
																											});
																										});
																									});
																								});
																							});
																						});
																					});
																				});
																			});
																		});
																	});
																});
															});
														});
													});
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
		}
	}
}
