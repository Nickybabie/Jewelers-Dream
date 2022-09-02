
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jewls.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class JewlsModTabs {
	public static CreativeModeTab TAB_JEWELERS_DREAM;

	public static void load() {
		TAB_JEWELERS_DREAM = new CreativeModeTab("tabjewelers_dream") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(JewlsModItems.RAW_PERIDOT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
