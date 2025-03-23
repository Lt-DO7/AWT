package net.awt.awt;

import net.awt.client.models.exteriors.BakerExteriorModel;
import net.awt.client.renderers.monitors.AWTMonitorRenderer;
import net.awt.client.renderers.monitors.AWTScreenMonitorRenderer;
import net.awt.core.AWTBlockEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class AWTClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        registerClientAddonExteriors();
        blockEntityRendererRegister();
    }

}