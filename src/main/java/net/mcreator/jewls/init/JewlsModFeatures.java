
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jewls.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.jewls.world.features.ores.SilverOreFeature;
import net.mcreator.jewls.world.features.ores.RoseQuartzOreFeature;
import net.mcreator.jewls.world.features.ores.PeridotOreFeature;
import net.mcreator.jewls.world.features.ores.MalachiteOreFeature;
import net.mcreator.jewls.world.features.ores.CitrineOreFeature;
import net.mcreator.jewls.world.features.ores.AquamarineOreFeature;
import net.mcreator.jewls.JewlsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class JewlsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, JewlsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> MALACHITE_ORE = register("malachite_ore", MalachiteOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, MalachiteOreFeature.GENERATE_BIOMES, MalachiteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CITRINE_ORE = register("citrine_ore", CitrineOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CitrineOreFeature.GENERATE_BIOMES, CitrineOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ROSE_QUARTZ_ORE = register("rose_quartz_ore", RoseQuartzOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RoseQuartzOreFeature.GENERATE_BIOMES,
					RoseQuartzOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERIDOT_ORE = register("peridot_ore", PeridotOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PeridotOreFeature.GENERATE_BIOMES, PeridotOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AQUAMARINE_ORE = register("aquamarine_ore", AquamarineOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, AquamarineOreFeature.GENERATE_BIOMES, AquamarineOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SILVER_ORE = register("silver_ore", SilverOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES, SilverOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
