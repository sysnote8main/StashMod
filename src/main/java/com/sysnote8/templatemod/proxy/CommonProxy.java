package com.sysnote8.templatemod.proxy;

import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

public class CommonProxy {
    public void onConstruction(FMLConstructionEvent event) {}
    public void preInit(FMLPreInitializationEvent event) {}
    public void init(FMLInitializationEvent event) {}
    public void postInit(FMLPostInitializationEvent event) {}
    public void onLoad(FMLLoadEvent event) {}
    public void serverAboutToStart(FMLServerAboutToStartEvent event) {}
    public void serverStarting(FMLServerStartingEvent event) {}
    public void serverStarted(FMLServerStartedEvent event) {}
    public void serverStopping(FMLServerStoppingEvent event) {}
    public void serverStopped(FMLServerStoppedEvent event) {}
}
