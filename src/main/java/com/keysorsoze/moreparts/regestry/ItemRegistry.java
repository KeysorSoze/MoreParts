package com.keysorsoze.moreparts.regestry;

import com.keysorsoze.moreparts.MoreParts;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ItemRegistry {
    //Creative tab per item
    public static final Item COAL_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item CHARCOAL_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item DIAMOND_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item EMERALD_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    //Register new item
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MoreParts.MOD_ID,"coal_nugget" ), COAL_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(MoreParts.MOD_ID,"charcoal_nugget" ), CHARCOAL_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(MoreParts.MOD_ID,"diamond_shard" ), DIAMOND_SHARD);
        Registry.register(Registry.ITEM, new Identifier(MoreParts.MOD_ID,"emerald_shard" ), EMERALD_SHARD);


    }
    //Register fuel
    public static void registerFuel() {
        FuelRegistry.INSTANCE.add(COAL_NUGGET, 200);
        FuelRegistry.INSTANCE.add(CHARCOAL_NUGGET, 200);
    }
}
