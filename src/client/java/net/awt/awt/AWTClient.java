package net.awt.awt;

import net.awt.awt.tardis.model.door.BakerDoorModel;
import net.awt.awt.tardis.model.door.ThirdAndSecondBaseDoor;
import net.awt.awt.tardis.model.exterior.BakerExteriorModel;
import net.awt.awt.tardis.model.exterior.ThirdAndSecondBaseExterior;
import net.fabricmc.api.ClientModInitializer;


public class AWTClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        registerClientAddonExteriors();
        blockEntityRendererRegister();
    }
    private void registerClientAddonExteriors() {
        AWT.BAKER.setModel(new BakerExteriorModel()).toClient().register();
        AWT.BAKER.toDoor().setModel(new BakerDoorModel(BakerDoorModel.getTexturedModelData().createModel())).toClient().register();

        AWT.SECOND.setModel(new ThirdAndSecondBaseExterior());
        AWT.SECOND.toDoor().setModel(new ThirdAndSecondBaseDoor(ThirdAndSecondBaseDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.THIRD.setModel(new ThirdAndSecondBaseExterior());
        AWT.THIRD.toDoor().setModel(new ThirdAndSecondBaseDoor(ThirdAndSecondBaseDoor.getTexturedModelData().createModel())).toClient().register();
    }

    public static void blockEntityRendererRegister() {

 }
}