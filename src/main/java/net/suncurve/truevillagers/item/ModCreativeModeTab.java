package net.suncurve.truevillagers.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TRUEVILLAGERS_TAB = new CreativeModeTab("truevillagerstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COWPEN.get());
        }
    };
}
