package com.weallplaycast.wapcutil;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

@Mod(modid = WAPCUtil.MODID, name = "WAPC Utilities", version = WAPCUtil.VERSION)
public class WAPCUtil {
    public static final String MODID = "wapcutil";
    public static final String VERSION = "1.0";

    public static final ItemSword sword = (ItemSword) new ItemSword(Item.ToolMaterial.IRON).setTextureName(WAPCUtil.MODID + ":sword");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        sword.setUnlocalizedName("sword");
        sword.setCreativeTab(CreativeTabs.tabCombat);
        GameRegistry.registerItem(sword, sword.getUnlocalizedName());
    }
}
