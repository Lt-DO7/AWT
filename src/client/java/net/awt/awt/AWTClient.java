package net.awt.awt;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.awt.awt.models.doors.BakerDoorModel;
import net.awt.awt.models.extriors.BakerExteriorModel;
import dev.amble.ait.client.models.doors.CapsuleDoorModel;
import net.awt.core.AWTBlockEntityTypes;
import net.awt.awt.renderers.monitors.AWTScreenMonitorRenderer;


public class AWTClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        registerClientAddonExteriors();
        blockEntityRendererRegister();
    }
    private void registerClientAddonExteriors() {
        AWT.BAKER.setModel(new BakerExteriorModel()).toClient().register();


        AWT.Baker.toDoor().setModel(new BakerDoorModel(BakerDoorModel.getTexturedModelData().createModel())).toClient().register();

    };

    public static void blockEntityRendererRegister() {

 }
}