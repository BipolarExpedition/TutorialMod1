package com.bipolarexpedition.tutorialmod1.objects.blocks;

import com.bipolarexpedition.tutorialmod1.init.BlockInit;

import com.bipolarexpedition.tutorialmod1.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;


public class BlockBase extends Block
{
    public BlockBase(String name, Material material, float hardness, float resistance, int miningLevel, String tool)
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, miningLevel);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

    }

}
