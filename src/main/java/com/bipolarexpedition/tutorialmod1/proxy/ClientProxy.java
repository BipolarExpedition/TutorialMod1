package com.bipolarexpedition.tutorialmod1.proxy;

import com.bipolarexpedition.tutorialmod1.TutorialMod1;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer(Item item, int meta, String id)
    {
        TutorialMod1.logger.info("Check registerItemRenderer >> {}", id);
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    @Override
    public void render()
    {

    }
}
