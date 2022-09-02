
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jewls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.jewls.block.GfdOreBlock;
import net.mcreator.jewls.block.GfdBlockBlock;
import net.mcreator.jewls.JewlsMod;

public class JewlsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JewlsMod.MODID);
	public static final RegistryObject<Block> GFD_ORE = REGISTRY.register("gfd_ore", () -> new GfdOreBlock());
	public static final RegistryObject<Block> GFD_BLOCK = REGISTRY.register("gfd_block", () -> new GfdBlockBlock());
}
