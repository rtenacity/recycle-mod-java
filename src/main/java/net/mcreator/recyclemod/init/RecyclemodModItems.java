
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.recyclemod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.recyclemod.item.WoodChipsItem;
import net.mcreator.recyclemod.item.WetPulpItem;
import net.mcreator.recyclemod.item.DryPulpItem;
import net.mcreator.recyclemod.item.CrushedGlassItem;
import net.mcreator.recyclemod.RecyclemodMod;

public class RecyclemodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, RecyclemodMod.MODID);
	public static final DeferredHolder<Item, Item> ROUND_GENERATOR = block(RecyclemodModBlocks.ROUND_GENERATOR);
	public static final DeferredHolder<Item, Item> PULPER = block(RecyclemodModBlocks.PULPER);
	public static final DeferredHolder<Item, Item> PULPER_IN_USE = block(RecyclemodModBlocks.PULPER_IN_USE);
	public static final DeferredHolder<Item, Item> WET_PULP = REGISTRY.register("wet_pulp", () -> new WetPulpItem());
	public static final DeferredHolder<Item, Item> OVEN = block(RecyclemodModBlocks.OVEN);
	public static final DeferredHolder<Item, Item> OVEN_IN_USE = block(RecyclemodModBlocks.OVEN_IN_USE);
	public static final DeferredHolder<Item, Item> DRY_PULP = REGISTRY.register("dry_pulp", () -> new DryPulpItem());
	public static final DeferredHolder<Item, Item> SEND_MACHINE = block(RecyclemodModBlocks.SEND_MACHINE);
	public static final DeferredHolder<Item, Item> GLASS_CRUSHER = block(RecyclemodModBlocks.GLASS_CRUSHER);
	public static final DeferredHolder<Item, Item> GLASS_CRUSHER_IN_USE = block(RecyclemodModBlocks.GLASS_CRUSHER_IN_USE);
	public static final DeferredHolder<Item, Item> WOOD_CHIPPER = block(RecyclemodModBlocks.WOOD_CHIPPER);
	public static final DeferredHolder<Item, Item> WOOD_CHIPPER_IN_USE = block(RecyclemodModBlocks.WOOD_CHIPPER_IN_USE);
	public static final DeferredHolder<Item, Item> WOOD_CHIPS = REGISTRY.register("wood_chips", () -> new WoodChipsItem());
	public static final DeferredHolder<Item, Item> CRUSHED_GLASS = REGISTRY.register("crushed_glass", () -> new CrushedGlassItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
