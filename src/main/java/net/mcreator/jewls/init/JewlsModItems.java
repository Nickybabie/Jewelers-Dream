
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jewls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.jewls.item.RoseQuartzItem;
import net.mcreator.jewls.item.MalachiteItem;
import net.mcreator.jewls.JewlsMod;

public class JewlsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JewlsMod.MODID);
	public static final RegistryObject<Item> MALACHITE = REGISTRY.register("malachite", () -> new MalachiteItem());
	public static final RegistryObject<Item> MALACHITE_ORE = block(JewlsModBlocks.MALACHITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MALACHITE_BLOCK = block(JewlsModBlocks.MALACHITE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ROSE_QUARTZ = REGISTRY.register("rose_quartz", () -> new RoseQuartzItem());
	public static final RegistryObject<Item> ROSE_QUARTZ_ORE = block(JewlsModBlocks.ROSE_QUARTZ_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ROSE_QUARTZ_BLOCK = block(JewlsModBlocks.ROSE_QUARTZ_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
