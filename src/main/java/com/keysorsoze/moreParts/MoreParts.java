package com.keysorsoze.moreParts;

import com.keysorsoze.moreParts.regestry.ItemRegistery;
import net.fabricmc.api.ModInitializer;

public class MoreParts implements ModInitializer {

    public static final String MOD_ID = "kmp";

    @Override
    public  void  onInitialize(){
        ItemRegistery.register();
    }
}
