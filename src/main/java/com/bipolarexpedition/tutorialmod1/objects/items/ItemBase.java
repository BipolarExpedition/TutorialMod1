package com.bipolarexpedition.tutorialmod1.objects.items;

import com.bipolarexpedition.tutorialmod1.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemBase extends Item {
    public ItemBase(String name)
    {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        ItemInit.ITEMS.add(this);
    }
}
