package net.suncurve.truevillagers.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.suncurve.truevillagers.TrueVillagers;
import net.suncurve.truevillagers.item.custom.DowsingRodItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TrueVillagers.MOD_ID);

    public static final RegistryObject<Item> PIGPEN = ITEMS.register("pig_pen",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TRUEVILLAGERS_TAB)));

    public static final RegistryObject<Item> COWPEN = ITEMS.register("cow_pen",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TRUEVILLAGERS_TAB)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.TRUEVILLAGERS_TAB).durability(16)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
