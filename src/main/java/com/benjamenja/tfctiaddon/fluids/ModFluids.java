package com.benjamenja.tfctiaddon.fluids;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;


public class ModFluids {
    public static Fluid fluidPaleAle;
    public static Fluid fluidCoffee;

    public static void initialize() {
        fluidPaleAle = new FluidPaleAle();
        FluidRegistry.registerFluid(fluidPaleAle);

        fluidCoffee = new FluidCoffee();
        FluidRegistry.registerFluid(fluidCoffee);
    }
}
