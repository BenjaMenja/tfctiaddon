package com.benjamenja.tfctiaddon.fluids;

import com.dunk.tfc.Core.FluidBaseTFC;

public class FluidPaleAle extends FluidBaseTFC {

    public FluidPaleAle() {
        super("FluidPaleAle");
        setBaseColor(0xDC7200);
        setViscosity(1000);
        setDensity(1000);
    }
}
