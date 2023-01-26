package io.github.kyonaliz.extprog.items.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class TestDebugItem extends Item {
    public TestDebugItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            outputRandomNumber(player);
        }

        return super.use(level, player, hand);
    }

    private void outputRandomNumber(Player player) {
        player.sendSystemMessage(Component.literal("List of Tool Tiers: " + listTiers()));
    }

    private String listTiers() {
        List<Tier>  listed = TierSortingRegistry.getSortedTiers();
        String toReturn = "";
        for (Tier item : listed) {
            toReturn = toReturn.concat("\n-> " + TierSortingRegistry.getName(item).toString());
        }
        return toReturn;
    }
}
