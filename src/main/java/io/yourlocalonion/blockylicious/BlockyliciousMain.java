package io.yourlocalonion.blockylicious;

import com.mojang.logging.LogUtils;
import io.yourlocalonion.blockylicious.block.MainBlocksClass;
import io.yourlocalonion.blockylicious.item.MainItemsClass;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BlockyliciousMain.MODID)
public class BlockyliciousMain
{
    public static final String MODID = "blockylicious";
    private static final Logger LOGGER = LogUtils.getLogger();
    public BlockyliciousMain()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MainItemsClass.register(modEventBus);
        MainBlocksClass.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Common Log Message from Blockylicious");
    }
    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("Client Log Message from Blockylicious");
        }
    }
}
