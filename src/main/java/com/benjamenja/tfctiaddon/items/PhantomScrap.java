package com.benjamenja.tfctiaddon.items;

import com.dunk.tfc.Items.ItemTerra;
import com.dunk.tfc.api.Enums.EnumSize;
import com.dunk.tfc.api.Enums.EnumWeight;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class PhantomScrap extends ItemTerra {

    public PhantomScrap() {
        super();
        setTextureName("phantom_scrap");
        setUnlocalizedName("phantom_scrap");
        setCreativeTab(CreativeTabs.tabMisc);
        setWeight(EnumWeight.HEAVY);
        setSize(EnumSize.SMALL);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister registerer) {
        this.itemIcon = registerer.registerIcon("tfctiaddon:phantom_scrap");
    }
}
