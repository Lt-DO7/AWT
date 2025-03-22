package net.awt.awt;

import net.awt.client.models.doors.BakerDoorModel;
import net.awt.client.models.exteriors.BakerExteriorModel;
import net.awt.client.renderers.monitors.AWTMonitorRenderer;
import net.awt.client.renderers.monitors.AWTScreenMonitorRenderer;
import net.awt.core.AWTBlockEntityTypes;
import dev.amble.ait.client.models.doors.CapsuleDoorModel;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class AWTClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        registerClientAddonExteriors();
        blockEntityRendererRegister();
    }

    private void registerClientAddonExteriors() {
        AWT.Baker.setModel(new BakerExteriorModel()).toClient().register();
        AWT.Baker.toDoor().setModel(new BakerDoorModel(BakerDoorModel.getTexturedModelData().createModel())).toClient().register();

    };
    public static void blockEntityRendererRegister() {

        BlockEntityRendererFactories.register(AWTTypes.AWT_MONITOR_BLOCK_ENTITY_TYPE, AWTMonitorRenderer::new);
        BlockEntityRendererFactories.register(AWTBlockEntityTypes.AWT_SCREEN_MONITOR_BLOCK_ENTITY_TYPE, AWTScreenMonitorRenderer::new);
    }
}

}