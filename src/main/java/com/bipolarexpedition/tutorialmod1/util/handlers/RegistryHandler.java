package com.bipolarexpedition.tutorialmod1.util.handlers;

import com.bipolarexpedition.tutorialmod1.TutorialMod1;
import com.bipolarexpedition.tutorialmod1.init.BlockInit;
import com.bipolarexpedition.tutorialmod1.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ItemInit.ITEMS)
        {
            TutorialMod1.proxy.registerItemRenderer(item, 0, "inventory");
        }
        for(Block block : BlockInit.BLOCKS)
        {
            TutorialMod1.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    public static void preInitRegistries()
    {

    }
    public static void postInitRegistries()
    {

    }
    public static void initRegistries()
    {
        TutorialMod1.proxy.render();
    }
    public static void serverRegistries()
    {

    }
}
