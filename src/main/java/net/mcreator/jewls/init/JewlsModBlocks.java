
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jewls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.jewls.block.RoseQuartzOreBlock;
import net.mcreator.jewls.block.RoseQuartzBlockBlock;
import net.mcreator.jewls.block.MalachiteOreBlock;
import net.mcreator.jewls.block.MalachiteBlockBlock;
import net.mcreator.jewls.JewlsMod;

public class JewlsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JewlsMod.MODID);
	public static final RegistryObject<Block> MALACHITE_ORE = REGISTRY.register("malachite_ore", () -> new MalachiteOreBlock());
	public static final RegistryObject<Block> MALACHITE_BLOCK = REGISTRY.register("malachite_block", () -> new MalachiteBlockBlock());
	public static final RegistryObject<Block> ROSE_QUARTZ_ORE = REGISTRY.register("rose_quartz_ore", () -> new RoseQuartzOreBlock());
	public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = REGISTRY.register("rose_quartz_block", () -> new RoseQuartzBlockBlock());
}
