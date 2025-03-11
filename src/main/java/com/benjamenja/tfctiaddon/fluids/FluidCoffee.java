package com.benjamenja.tfctiaddon.fluids;

import com.dunk.tfc.Core.FluidBaseTFC;

public class FluidCoffee extends FluidBaseTFC {

    public FluidCoffee() {
        super("FluidCoffee");
        setBaseColor(0x241301);
        setViscosity(1000);
        setDensity(1000);
    }
}
