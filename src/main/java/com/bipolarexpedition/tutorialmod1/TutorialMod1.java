package com.bipolarexpedition.tutorialmod1;

import com.bipolarexpedition.tutorialmod1.proxy.CommonProxy;
import com.bipolarexpedition.tutorialmod1.util.Reference;
import com.bipolarexpedition.tutorialmod1.util.handlers.RegistryHandler;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TutorialMod1
{
    public static Logger logger;

    @Mod.Instance
    public static TutorialMod1 instance;

    @SidedProxy(serverSide = Reference.COMMON_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    public TutorialMod1()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        RegistryHandler.preInitRegistries();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        RegistryHandler.initRegistries();
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        RegistryHandler.postInitRegistries();
    }

    @EventHandler
    public void serverInit(FMLServerStartingEvent event)
    {
        RegistryHandler.serverRegistries();
    }
}
