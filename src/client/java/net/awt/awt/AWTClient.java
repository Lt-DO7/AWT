package net.awt.awt;

import net.awt.awt.tardis.model.door.*;
import net.awt.awt.tardis.model.exterior.*;
import net.fabricmc.api.ClientModInitializer;
import org.joml.Vector3f;


public class AWTClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        registerClientAddonExteriors();
        blockEntityRendererRegister();
    }
    private void registerClientAddonExteriors() {
        AWT.BAKER.setModel(new BakerExteriorModel()).toClient().register();
        AWT.BAKER.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        //AWT.BAKER.setPortalWidth(1f);
       // AWT.BAKER.setPortalHeight(2f);
        AWT.BAKER.toDoor().setModel(new BakerDoorModel(BakerDoorModel.getTexturedModelData().createModel())).toClient().register();

        AWT.SECOND.setModel(new ThirdAndSecondBaseExterior()).toClient().register();
        AWT.SECOND.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        AWT.SECOND.toDoor().setModel(new ThirdAndSecondBaseDoor(ThirdAndSecondBaseDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.THIRD.setModel(new ThirdAndSecondBaseExterior()).toClient().register();
        AWT.THIRD.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));
        AWT.THIRD.toDoor().setModel(new ThirdAndSecondBaseDoor(ThirdAndSecondBaseDoor.getTexturedModelData().createModel())).toClient().register();

        AWT.REDONION.setModel(new OnionExterior()).toClient().register();
        AWT.REDONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        AWT.REDONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        AWT.YELLOWONION.setModel(new OnionExterior()).toClient().register();
        AWT.YELLOWONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        AWT.YELLOWONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        AWT.BLUEONION.setModel(new OnionExterior()).toClient().register();
        AWT.BLUEONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        AWT.BLUEONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        AWT.WHITEONION.setModel(new OnionExterior()).toClient().register();
        AWT.WHITEONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        AWT.WHITEONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        AWT.PURPLEONION.setModel(new OnionExterior()).toClient().register();
        AWT.PURPLEONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        AWT.PURPLEONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        AWT.GREYONION.setModel(new OnionExterior()).toClient().register();
        AWT.GREYONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        AWT.GREYONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        AWT.PINKONION.setModel(new OnionExterior()).toClient().register();
        AWT.PINKONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        AWT.PINKONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        AWT.LIGHTBLUEONION.setModel(new OnionExterior()).toClient().register();
        AWT.LIGHTBLUEONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        AWT.LIGHTBLUEONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        AWT.LIMEGREENONION.setModel(new OnionExterior()).toClient().register();
        AWT.LIMEGREENONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        AWT.LIMEGREENONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        AWT.MULTIONION.setModel(new OnionExterior()).toClient().register();
        AWT.MULTIONION.toDoor().setModel(new OnionDoor(OnionDoor.getTexturedModelData().createModel())).toClient().register();
        AWT.MULTIONION.setSonicItemTranslations(new Vector3f(0.15f, 1.122f, 0.94f));

        AWT.CUBE.setModel(new CubeExterior()).toClient().register();
        AWT.CUBE.toDoor().setModel(new CubeDoor(CubeDoor.getTexturedModelData().createModel())).toClient().register();
        AWT.CUBE.setSonicItemTranslations(new Vector3f(0, 0, 0));

        AWT.ATRIUM.setModel(new AtriumExterior()).toClient().register();
        AWT.ATRIUM.toDoor().setModel(new AtriumDoor(AtriumDoor.getTexturedModelData().createModel())).toClient().register();
        AWT.ATRIUM.setSonicItemTranslations(new Vector3f(0, 0, 0));

        AWT.POLICEBOX.setModel(new policebox()).toClient().register();
        AWT.POLICEBOX.toDoor().setModel(new policebox_door(policebox_door.getTexturedModelData().createModel())).toClient().register();
        AWT.POLICEBOX.setSonicItemTranslations(new Vector3f(0, 0, 0));

    }

    public static void blockEntityRendererRegister() {

 }
}