package com.benjamenja.tfctiaddon.items;

import com.benjamenja.tfctiaddon.handlers.ConfigurationHandler;
import com.dunk.tfc.Items.ItemTerra;
import com.dunk.tfc.api.Enums.EnumSize;
import com.dunk.tfc.api.Enums.EnumWeight;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import static com.benjamenja.tfctiaddon.TFCTIAddon.LOG;

public class DragonSummoner extends ItemTerra {

    public DragonSummoner() {
        super();
        setTextureName("dragon_summoner");
        setUnlocalizedName("dragon_summoner");
        setCreativeTab(CreativeTabs.tabMisc);
        setWeight(EnumWeight.HEAVY);
        setSize(EnumSize.HUGE);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par1, float par2, float par3, float par4) {
        Block block = world.getBlock(x, y, z);
        int configMeta = ConfigurationHandler.BlockMetaValue;
        if (configMeta == -1) {
            configMeta = block.getDamageValue(world, x, y, z);
        }
        LOG.info("Block Clicked: {}", ConfigurationHandler.BlockID);
        if (!world.isRemote) {
            if (block == Block.getBlockFromName(ConfigurationHandler.BlockID) && block.getDamageValue(world, x, y, z) == configMeta) {
                String entityName = "EnderDragon";
                if (EntityList.stringToClassMapping.containsKey(entityName)) {
                    Entity conjuredEntity = EntityList.createEntityByName(entityName, world);
                    conjuredEntity.setPosition(x, y, z);
                    world.spawnEntityInWorld(conjuredEntity);
                }
                --stack.stackSize;
            }
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister registerer) {
        this.itemIcon = registerer.registerIcon("tfctiaddon:dragon_summoner");
    }

    public boolean checkSummonRitual() {
        return false;
    }
}
