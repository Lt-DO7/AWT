package net.awt.awt.door.block;

import loqor.ait.client.models.doors.DoorModel;
import loqor.ait.data.schema.door.ClientDoorSchema;
import net.awt.awt.door.block.model.TardisBlockDoorModel;

public class ClientTardisBlockDoor extends ClientDoorSchema {
    public ClientTardisBlockDoor() {
        super(TardisBlockDoorVariant.REFERENCE);
    }

    @Override
    public DoorModel model() {
        return new TardisBlockDoorModel(); // todo
    }
}
