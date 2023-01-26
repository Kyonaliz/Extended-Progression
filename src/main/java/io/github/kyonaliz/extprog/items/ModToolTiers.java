package io.github.kyonaliz.extprog.items;

import com.mojang.logging.LogUtils;
import io.github.kyonaliz.extprog.ExtendedProgession;
import io.github.kyonaliz.extprog.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import org.slf4j.Logger;

import java.util.List;

public class ModToolTiers {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static Tier COPPER;
    public static Tier STEEL;
    static {
        COPPER = TierSortingRegistry.registerTier(
                new ForgeTier(1, 143, 5.0f, 1.5f, 2, ModTags.Blocks.NEEDS_COPPER_TOOL,
                        () -> Ingredient.of(Items.COPPER_INGOT)),
                new ResourceLocation(ExtendedProgession.MOD_ID, "copper"), List.of(Tiers.STONE), List.of(Tiers.IRON)
        );
        STEEL = TierSortingRegistry.registerTier(
                new ForgeTier(2, 543, 7.0f, 2.5f, 14, ModTags.Blocks.NEEDS_STEEL_TOOL,
                        () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
                new ResourceLocation(ExtendedProgession.MOD_ID, "steel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND)
        );
    }

}
