package net.awt.awt.door.onion;

import loqor.ait.client.models.doors.CapsuleDoorModel;
import loqor.ait.client.models.doors.DoorModel;
import loqor.ait.data.schema.door.ClientDoorSchema;
import net.awt.awt.door.onion.model.OnionDoorModel;

public class ClientOnionDoor extends ClientDoorSchema {
    public ClientOnionDoor() {
        super(OnionDoorVariant.REFERENCE);
    }

    public DoorModel model() {
        return new OnionDoorModel(CapsuleDoorModel.getTexturedModelData().createModel());
    }
}