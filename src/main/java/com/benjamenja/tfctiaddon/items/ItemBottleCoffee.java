package com.benjamenja.tfctiaddon.items;

import com.dunk.tfc.Core.TFCTabs;
import com.dunk.tfc.ItemSetup;
import com.dunk.tfc.Items.ItemDrink;
import com.dunk.tfc.api.Enums.EnumFoodGroup;
import com.dunk.tfc.api.Enums.EnumSize;
import com.dunk.tfc.api.Enums.EnumWeight;
import com.dunk.tfc.api.TFCItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;

public class ItemBottleCoffee extends ItemDrink {
    public ItemBottleCoffee(float v) {
        super(v);
        setUnlocalizedName("coffee");
        setCreativeTab(TFCTabs.TFC_FOODS);
        stackable = true;
        setWeight(EnumWeight.LIGHT);
        setSize(EnumSize.SMALL);
        setContainerItem(ItemSetup.glassBottle);
        setTier(1);
        setCalories(0.6F);
        setFoodGroup(EnumFoodGroup.Fruit);
        setCanDrinkInParts(true);
        setWaterRestoreRatio(0.4F);
        TFCItems.drinks.add(this);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister register)
    {
        this.itemIcon = register.registerIcon("terrafirmacraftplus:Glass Bottle Overlay");
    }
}
