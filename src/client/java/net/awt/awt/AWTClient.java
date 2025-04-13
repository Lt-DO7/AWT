package net.awt.awt;

import net.awt.awt.tardis.model.door.*;
import net.awt.awt.tardis.model.exterior.*;
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

        AWT.SECOND.setModel(new ThirdAndSecondBaseExterior()).toClient().register();
        AWT.SECOND.toDoor().setModel(new ThirdAndSecondBaseDoor(ThirdAndSecondBaseDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.THIRD.setModel(new ThirdAndSecondBaseExterior()).toClient().register();
        AWT.THIRD.toDoor().setModel(new ThirdAndSecondBaseDoor(ThirdAndSecondBaseDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.TORCHWOODCAPSULE.setModel(new TorchwoodCapsuleExterior()).toClient().register();
        AWT.TORCHWOODCAPSULE.toDoor().setModel(new TorchwoodCapsuleDoor(TorchwoodCapsuleDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.TYPEULTANDR.setModel(new TypeUltAndrExterior()).toClient().register();
        AWT.TYPEULTANDR.toDoor().setModel(new TypeUltAndrDoor(TypeUltAndrDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.REDONION.setModel(new OnionExterior()).toClient().register();
        AWT.REDONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.YELLOWONION.setModel(new OnionExterior()).toClient().register();
        AWT.YELLOWONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.BLUEONION.setModel(new OnionExterior()).toClient().register();
        AWT.BLUEONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.WHITEONION.setModel(new OnionExterior()).toClient().register();
        AWT.WHITEONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.PURPLEONION.setModel(new OnionExterior()).toClient().register();
        AWT.PURPLEONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.GREYONION.setModel(new OnionExterior()).toClient().register();
        AWT.GREYONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.PINKONION.setModel(new OnionExterior()).toClient().register();
        AWT.PINKONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.LIGHTBLUEONION.setModel(new OnionExterior()).toClient().register();
        AWT.LIGHTBLUEONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.LIMEGREENONION.setModel(new OnionExterior()).toClient().register();
        AWT.LIMEGREENONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();

       // AWT.STEAMPUNK.setModel(new SteampunkExterior()).toClient().register();
       // AWT.STEAMPUNK.toDoor().setModel(new SteampunkDoor(SteampunkDoor.getTexturedModelData().createModel())).toClient().register();


    }

    public static void blockEntityRendererRegister() {

 }
}