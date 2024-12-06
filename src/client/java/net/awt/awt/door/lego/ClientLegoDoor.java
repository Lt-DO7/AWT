package net.awt.awt.door.lego;

import loqor.ait.client.models.doors.CapsuleDoorModel;
import loqor.ait.client.models.doors.DoorModel;
import loqor.ait.data.schema.door.ClientDoorSchema;
import net.awt.awt.door.lego.model.LegoDoorModel;

public class ClientLegoDoor extends ClientDoorSchema {
    public ClientLegoDoor() {
        super(LegoDoorVariant.REFERENCE);
    }

    @Override
    public DoorModel model() {
        return new LegoDoorModel(CapsuleDoorModel.getTexturedModelData().createModel());
    }
}