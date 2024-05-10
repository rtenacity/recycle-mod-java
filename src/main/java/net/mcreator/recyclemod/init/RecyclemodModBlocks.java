
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.recyclemod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.recyclemod.block.WoodChipperInUseBlock;
import net.mcreator.recyclemod.block.WoodChipperBlock;
import net.mcreator.recyclemod.block.SendMachineBlock;
import net.mcreator.recyclemod.block.RoundGeneratorBlock;
import net.mcreator.recyclemod.block.PulperInUseBlock;
import net.mcreator.recyclemod.block.PulperBlock;
import net.mcreator.recyclemod.block.OvenInUseBlock;
import net.mcreator.recyclemod.block.OvenBlock;
import net.mcreator.recyclemod.block.GlassCrusherInUseBlock;
import net.mcreator.recyclemod.block.GlassCrusherBlock;
import net.mcreator.recyclemod.RecyclemodMod;

public class RecyclemodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, RecyclemodMod.MODID);
	public static final DeferredHolder<Block, Block> ROUND_GENERATOR = REGISTRY.register("round_generator", () -> new RoundGeneratorBlock());
	public static final DeferredHolder<Block, Block> PULPER = REGISTRY.register("pulper", () -> new PulperBlock());
	public static final DeferredHolder<Block, Block> PULPER_IN_USE = REGISTRY.register("pulper_in_use", () -> new PulperInUseBlock());
	public static final DeferredHolder<Block, Block> OVEN = REGISTRY.register("oven", () -> new OvenBlock());
	public static final DeferredHolder<Block, Block> OVEN_IN_USE = REGISTRY.register("oven_in_use", () -> new OvenInUseBlock());
	public static final DeferredHolder<Block, Block> SEND_MACHINE = REGISTRY.register("send_machine", () -> new SendMachineBlock());
	public static final DeferredHolder<Block, Block> GLASS_CRUSHER = REGISTRY.register("glass_crusher", () -> new GlassCrusherBlock());
	public static final DeferredHolder<Block, Block> GLASS_CRUSHER_IN_USE = REGISTRY.register("glass_crusher_in_use", () -> new GlassCrusherInUseBlock());
	public static final DeferredHolder<Block, Block> WOOD_CHIPPER = REGISTRY.register("wood_chipper", () -> new WoodChipperBlock());
	public static final DeferredHolder<Block, Block> WOOD_CHIPPER_IN_USE = REGISTRY.register("wood_chipper_in_use", () -> new WoodChipperInUseBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
