
package net.mcreator.jewls.world.features.ores;

public class AquamarineOreFeature extends OreFeature {

	public static AquamarineOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new AquamarineOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("jewls:aquamarine_ore", FEATURE,
				new OreConfiguration(AquamarineOreFeatureRuleTest.INSTANCE, JewlsModBlocks.AQUAMARINE_ORE.get().defaultBlockState(), 8));
		PLACED_FEATURE = PlacementUtils.register("jewls:aquamarine_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(13), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(1), VerticalAnchor.absolute(77)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public AquamarineOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class AquamarineOreFeatureRuleTest extends RuleTest {

		static final AquamarineOreFeatureRuleTest INSTANCE = new AquamarineOreFeatureRuleTest();

		private static final com.mojang.serialization.Codec<AquamarineOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<AquamarineOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("jewls:aquamarine_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE);
			}

			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
