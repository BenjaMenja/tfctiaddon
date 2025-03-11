package com.benjamenja.tfctiaddon.recipes;

import com.dunk.tfc.Food.ItemFoodTFC;
import com.dunk.tfc.api.Crafting.*;
import com.dunk.tfc.api.TFCFluids;
import com.benjamenja.tfctiaddon.fluids.ModFluids;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import terramisc.core.TFCMItems;
import terramisc.core.TFCMItemsSetup;

public class ModRecipes {

    public static void initialize() {
        // Quern Recipes
        QuernRecipe groundCoffeeBeans = new QuernRecipe(new ItemStack(TFCMItems.coffee, 1), new ItemStack(TFCMItems.groundCoffee, 1));
        QuernRecipe groundGreenCoffeeBeans = new QuernRecipe(new ItemStack(TFCMItems.greenCoffee, 1), new ItemStack(TFCMItems.groundCoffee, 1));
        QuernRecipe groundCoffeeCherries = new QuernRecipe(new ItemStack(TFCMItems.coffeeCherries, 1), new ItemStack(TFCMItems.coffee, 1));
        QuernManager.getInstance().addRecipe(groundCoffeeBeans);
        QuernManager.getInstance().addRecipe(groundGreenCoffeeBeans);
        QuernManager.getInstance().addRecipe(groundCoffeeCherries);

        //// Barrel Recipes

        // Pale Ale
        ItemStack hops = ItemFoodTFC.createTag(new ItemStack(TFCMItemsSetup.hops), 1);
        FluidStack beer = new FluidStack(TFCFluids.BEER, 1000);
        FluidStack wheatbeer = new FluidStack(TFCFluids.WHEATBEER, 1000);
        FluidStack ryebeer = new FluidStack(TFCFluids.RYEBEER, 1000);
        FluidStack paleale = new FluidStack(ModFluids.fluidPaleAle, 1000);

        BarrelAlcoholRecipe paleAleRecipe = new BarrelAlcoholRecipe(hops, beer, null, paleale);
        BarrelAlcoholRecipe paleAleRecipeWheat = new BarrelAlcoholRecipe(hops, wheatbeer, null, paleale);
        BarrelAlcoholRecipe paleAleRecipeRye = new BarrelAlcoholRecipe(hops, ryebeer, null, paleale);
        BarrelManager.getInstance().addRecipe(paleAleRecipe);
        BarrelManager.getInstance().addRecipe(paleAleRecipeWheat);
        BarrelManager.getInstance().addRecipe(paleAleRecipeRye);

        // Coffee
        ItemStack groundCoffee = ItemFoodTFC.createTag(new ItemStack(TFCMItemsSetup.groundCoffee), 1);
        FluidStack freshwater = new FluidStack(TFCFluids.FRESHWATER, 1000);
        FluidStack fluidCoffeeStack = new FluidStack(ModFluids.fluidCoffee, 1000);

        BarrelRecipe coffeeRecipe = new BarrelRecipe(groundCoffee, freshwater, null, fluidCoffeeStack).setSealTime(4);
        BarrelManager.getInstance().addRecipe(coffeeRecipe);
    }
}
