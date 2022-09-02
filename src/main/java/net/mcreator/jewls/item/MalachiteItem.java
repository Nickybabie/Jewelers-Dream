
package net.mcreator.jewls.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.jewls.init.JewlsModTabs;

public class MalachiteItem extends Item {
	public MalachiteItem() {
		super(new Item.Properties().tab(JewlsModTabs.TAB_JEWELERS_DREAM).stacksTo(64).rarity(Rarity.COMMON));
	}
}
