package net.mcreator.recyclemod.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.recyclemod.init.RecyclemodModItems;
import net.mcreator.recyclemod.init.RecyclemodModBlocks;
import net.mcreator.recyclemod.RecyclemodMod;

public class GlassCrusherRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GLASS_BOTTLE) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			world.setBlock(BlockPos.containing(x, y, z), RecyclemodModBlocks.GLASS_CRUSHER_IN_USE.get().defaultBlockState(), 3);
			RecyclemodMod.queueServerWork(20, () -> {
				world.setBlock(BlockPos.containing(x, y, z), RecyclemodModBlocks.GLASS_CRUSHER.get().defaultBlockState(), 3);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(RecyclemodModItems.CRUSHED_GLASS.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			});
		}
	}
}
