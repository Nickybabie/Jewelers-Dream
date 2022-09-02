
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jewls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.jewls.block.SilverOreBlock;
import net.mcreator.jewls.block.SilverBlockBlock;
import net.mcreator.jewls.block.RoseQuartzOreBlock;
import net.mcreator.jewls.block.RoseQuartzBlockBlock;
import net.mcreator.jewls.block.PeridotOreBlock;
import net.mcreator.jewls.block.PeridotBlockBlock;
import net.mcreator.jewls.block.MalachiteOreBlock;
import net.mcreator.jewls.block.MalachiteBlockBlock;
import net.mcreator.jewls.block.JewelersTableBlock;
import net.mcreator.jewls.block.CitrineOreBlock;
import net.mcreator.jewls.block.CitrineBlockBlock;
import net.mcreator.jewls.block.AquamarineOreBlock;
import net.mcreator.jewls.block.AquamarineBlockBlock;
import net.mcreator.jewls.JewlsMod;

public class JewlsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JewlsMod.MODID);
	public static final RegistryObject<Block> MALACHITE_ORE = REGISTRY.register("malachite_ore", () -> new MalachiteOreBlock());
	public static final RegistryObject<Block> CITRINE_ORE = REGISTRY.register("citrine_ore", () -> new CitrineOreBlock());
	public static final RegistryObject<Block> MALACHITE_BLOCK = REGISTRY.register("malachite_block", () -> new MalachiteBlockBlock());
	public static final RegistryObject<Block> CITRINE_BLOCK = REGISTRY.register("citrine_block", () -> new CitrineBlockBlock());
	public static final RegistryObject<Block> ROSE_QUARTZ_ORE = REGISTRY.register("rose_quartz_ore", () -> new RoseQuartzOreBlock());
	public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = REGISTRY.register("rose_quartz_block", () -> new RoseQuartzBlockBlock());
	public static final RegistryObject<Block> PERIDOT_ORE = REGISTRY.register("peridot_ore", () -> new PeridotOreBlock());
	public static final RegistryObject<Block> PERIDOT_BLOCK = REGISTRY.register("peridot_block", () -> new PeridotBlockBlock());
	public static final RegistryObject<Block> AQUAMARINE_ORE = REGISTRY.register("aquamarine_ore", () -> new AquamarineOreBlock());
	public static final RegistryObject<Block> AQUAMARINE_BLOCK = REGISTRY.register("aquamarine_block", () -> new AquamarineBlockBlock());
	public static final RegistryObject<Block> JEWELERS_TABLE = REGISTRY.register("jewelers_table", () -> new JewelersTableBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			JewelersTableBlock.registerRenderLayer();
		}
	}
}
