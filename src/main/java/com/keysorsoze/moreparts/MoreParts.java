package com.keysorsoze.moreparts;

import com.keysorsoze.moreparts.regestry.ItemRegistry;
import net.fabricmc.api.ModInitializer;

public class MoreParts implements ModInitializer {

    public static final String MOD_ID = "moreparts";

    @Override
    public  void  onInitialize(){
        ItemRegistry.registerItems();
        ItemRegistry.registerFuel();
    }
}


/*
* I believe it is as simple as FuelRegistry.INSTANCE.add(ITEM_IDENTIFIER, fuelTicks);
* */