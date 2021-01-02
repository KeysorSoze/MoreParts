package com.keysorsoze.moreparts;

import com.keysorsoze.moreparts.regestry.ItemRegistery;
import net.fabricmc.api.ModInitializer;

public class MoreParts implements ModInitializer {

    public static final String MOD_ID = "moreparts";

    @Override
    public  void  onInitialize(){
        ItemRegistery.register();
    }
}
