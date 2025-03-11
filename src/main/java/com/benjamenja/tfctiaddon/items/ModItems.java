package com.benjamenja.tfctiaddon.items;

import com.dunk.tfc.ItemSetup;
import com.benjamenja.tfctiaddon.fluids.ModFluids;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;

public class ModItems {

    public static Item paleAle;
    public static Item bottleCoffee;
    public static Item phantomScrap;
    public static Item dragonScale;
    public static Item dragonSummoner;

    public static void initialize() {
        paleAle = new ItemPaleAle(1000.0F);
        GameRegistry.registerItem(paleAle, paleAle.getUnlocalizedName());
        FluidStack bottlePaleAle = new FluidStack(ModFluids.fluidPaleAle, 1000);
        ItemStack fullPaleAleBottle = new ItemStack(paleAle);
        ItemStack emptyPaleAleBottle = new ItemStack(ItemSetup.glassBottle);
        FluidContainerRegistry.registerFluidContainer(bottlePaleAle, fullPaleAleBottle, emptyPaleAleBottle);

        bottleCoffee = new ItemBottleCoffee(1000.0F);
        GameRegistry.registerItem(bottleCoffee, bottleCoffee.getUnlocalizedName());
        FluidStack coffeeContainer = new FluidStack(ModFluids.fluidCoffee, 1000);
        ItemStack fullCoffeeBottle = new ItemStack(bottleCoffee);
        ItemStack emptyCoffeeBottle = new ItemStack(ItemSetup.glassBottle);
        FluidContainerRegistry.registerFluidContainer(coffeeContainer, fullCoffeeBottle, emptyCoffeeBottle);

        phantomScrap = new PhantomScrap();
        GameRegistry.registerItem(phantomScrap, phantomScrap.getUnlocalizedName());
        dragonScale = new DragonScale();
        GameRegistry.registerItem(dragonScale, dragonScale.getUnlocalizedName());
        dragonSummoner = new DragonSummoner();
        GameRegistry.registerItem(dragonSummoner, dragonSummoner.getUnlocalizedName());
    }
}
