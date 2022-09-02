
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jewls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.jewls.block.PeridotOreBlock;
import net.mcreator.jewls.block.PeridotBlockBlock;
import net.mcreator.jewls.block.CitrineOreBlock;
import net.mcreator.jewls.block.CitrineBlockBlock;
import net.mcreator.jewls.block.AquamarineOreBlock;
import net.mcreator.jewls.block.AquamarineBlockBlock;
import net.mcreator.jewls.JewlsMod;

public class JewlsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JewlsMod.MODID);
	public static final RegistryObject<Block> CITRINE_ORE = REGISTRY.register("citrine_ore", () -> new CitrineOreBlock());
	public static final RegistryObject<Block> CITRINE_BLOCK = REGISTRY.register("citrine_block", () -> new CitrineBlockBlock());
	public static final RegistryObject<Block> PERIDOT_ORE = REGISTRY.register("peridot_ore", () -> new PeridotOreBlock());
	public static final RegistryObject<Block> PERIDOT_BLOCK = REGISTRY.register("peridot_block", () -> new PeridotBlockBlock());
	public static final RegistryObject<Block> AQUAMARINE_ORE = REGISTRY.register("aquamarine_ore", () -> new AquamarineOreBlock());
	public static final RegistryObject<Block> AQUAMARINE_BLOCK = REGISTRY.register("aquamarine_block", () -> new AquamarineBlockBlock());
}
