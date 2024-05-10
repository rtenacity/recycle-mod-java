
package net.mcreator.recyclemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WetPulpItem extends Item {
	public WetPulpItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
