package com.ldsdb.paimonfood;

import com.ldsdb.paimonfood.block.BlockRegistry;
import com.ldsdb.paimonfood.config.Config;
import com.ldsdb.paimonfood.item.ItemRegistry;
import com.ldsdb.paimonfood.loot.LootModifierRegistry;
import com.ldsdb.paimonfood.util.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class PaimonFood {
    public PaimonFood() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        ItemRegistry.ITEMS.register(bus);
        BlockRegistry.BLOCKS.register(bus);
        LootModifierRegistry.GLM.register(bus);

        ModLoadingContext.get().registerConfig(Type.COMMON, Config.SPEC, Reference.MOD_ID + "-common.toml");
    }
}