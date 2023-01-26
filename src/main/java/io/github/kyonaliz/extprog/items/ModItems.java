package io.github.kyonaliz.extprog.items;

import io.github.kyonaliz.extprog.ExtendedProgession;
import io.github.kyonaliz.extprog.items.custom.TestDebugItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Dictionary;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedProgession.MOD_ID);

    // ------------------------------ Crafting Ingredients ------------------------------
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG)));

    // ------------------------------ Tools ------------------------------
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, 1, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG).stacksTo(1)));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, 1, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG).stacksTo(1)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, 1, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG).stacksTo(1)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, 1, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG).stacksTo(1)));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER, 1, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG).stacksTo(1)));

    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL, 2, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG).stacksTo(1)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, 2, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG).stacksTo(1)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, 2, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG).stacksTo(1)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, 2, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG).stacksTo(1)));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, 2, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG).stacksTo(1)));

    // ------------------------------ Testing Item ------------------------------
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new TestDebugItem(new Item.Properties().tab(ModCreativeModeTabs.TAB_EXTPROG)));

    // ------------------------------ Registry Methods ------------------------------
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

