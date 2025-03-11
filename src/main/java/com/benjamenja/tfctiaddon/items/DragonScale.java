package com.benjamenja.tfctiaddon.items;

import com.dunk.tfc.Items.ItemTerra;
import com.dunk.tfc.api.Enums.EnumSize;
import com.dunk.tfc.api.Enums.EnumWeight;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class DragonScale extends ItemTerra {

    public DragonScale() {
        super();
        setTextureName("dragon_scale");
        setUnlocalizedName("dragon_scale");
        setCreativeTab(CreativeTabs.tabMisc);
        setWeight(EnumWeight.HEAVY);
        setSize(EnumSize.SMALL);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister registerer) {
        this.itemIcon = registerer.registerIcon("tfctiaddon:dragon_scale");
    }
}
