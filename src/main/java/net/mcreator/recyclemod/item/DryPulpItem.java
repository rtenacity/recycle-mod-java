
package net.mcreator.recyclemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DryPulpItem extends Item {
	public DryPulpItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
