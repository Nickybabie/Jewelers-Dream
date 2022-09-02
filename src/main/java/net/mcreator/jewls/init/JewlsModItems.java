
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
import net.mcreator.jewls.item.RawPeridotItem;
import net.mcreator.jewls.item.RawCitrineItem;
import net.mcreator.jewls.item.RawAquamarineItem;
import net.mcreator.jewls.item.PeridotItem;
import net.mcreator.jewls.item.MalachiteItem;
import net.mcreator.jewls.item.CitrineItem;
import net.mcreator.jewls.item.AquamarineItem;
import net.mcreator.jewls.JewlsMod;

public class JewlsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JewlsMod.MODID);
	public static final RegistryObject<Item> MALACHITE = REGISTRY.register("malachite", () -> new MalachiteItem());
	public static final RegistryObject<Item> CITRINE = REGISTRY.register("citrine", () -> new CitrineItem());
	public static final RegistryObject<Item> MALACHITE_ORE = block(JewlsModBlocks.MALACHITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CITRINE_ORE = block(JewlsModBlocks.CITRINE_ORE, JewlsModTabs.TAB_JEWELERS_DREAM);
	public static final RegistryObject<Item> MALACHITE_BLOCK = block(JewlsModBlocks.MALACHITE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CITRINE_BLOCK = block(JewlsModBlocks.CITRINE_BLOCK, JewlsModTabs.TAB_JEWELERS_DREAM);
	public static final RegistryObject<Item> ROSE_QUARTZ = REGISTRY.register("rose_quartz", () -> new RoseQuartzItem());
	public static final RegistryObject<Item> RAW_CITRINE = REGISTRY.register("raw_citrine", () -> new RawCitrineItem());
	public static final RegistryObject<Item> ROSE_QUARTZ_ORE = block(JewlsModBlocks.ROSE_QUARTZ_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PERIDOT = REGISTRY.register("peridot", () -> new PeridotItem());
	public static final RegistryObject<Item> ROSE_QUARTZ_BLOCK = block(JewlsModBlocks.ROSE_QUARTZ_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PERIDOT_ORE = block(JewlsModBlocks.PERIDOT_ORE, JewlsModTabs.TAB_JEWELERS_DREAM);
	public static final RegistryObject<Item> PERIDOT_BLOCK = block(JewlsModBlocks.PERIDOT_BLOCK, JewlsModTabs.TAB_JEWELERS_DREAM);
	public static final RegistryObject<Item> AQUAMARINE = REGISTRY.register("aquamarine", () -> new AquamarineItem());
	public static final RegistryObject<Item> AQUAMARINE_ORE = block(JewlsModBlocks.AQUAMARINE_ORE, JewlsModTabs.TAB_JEWELERS_DREAM);
	public static final RegistryObject<Item> AQUAMARINE_BLOCK = block(JewlsModBlocks.AQUAMARINE_BLOCK, JewlsModTabs.TAB_JEWELERS_DREAM);
	public static final RegistryObject<Item> RAW_PERIDOT = REGISTRY.register("raw_peridot", () -> new RawPeridotItem());
	public static final RegistryObject<Item> RAW_AQUAMARINE = REGISTRY.register("raw_aquamarine", () -> new RawAquamarineItem());
	public static final RegistryObject<Item> JEWELERS_TABLE = block(JewlsModBlocks.JEWELERS_TABLE, JewlsModTabs.TAB_JEWELERS_DREAM);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
