
package net.mcreator.recyclemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WoodChipsItem extends Item {
	public WoodChipsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
