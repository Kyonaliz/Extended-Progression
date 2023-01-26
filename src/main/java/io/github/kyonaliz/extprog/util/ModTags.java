package io.github.kyonaliz.extprog.util;

import com.mojang.logging.LogUtils;
import io.github.kyonaliz.extprog.ExtendedProgession;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;

public class ModTags {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static class Blocks {
        public static final TagKey<Block> NEEDS_COPPER_TOOL =
                tag("needs_copper_tool");
        public static final TagKey<Block> NEEDS_STEEL_TOOL =
                tag("needs_steel_tool");

        private static TagKey<Block> tag(String name) {
            LOGGER.debug(ExtendedProgession.MOD_ID + ':' + name + " to be added");
            return BlockTags.create(new ResourceLocation( ExtendedProgession.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
