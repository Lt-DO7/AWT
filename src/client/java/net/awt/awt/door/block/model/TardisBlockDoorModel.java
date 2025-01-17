package net.awt.awt.door.block.model;

import loqor.ait.client.models.doors.DoorModel;
import loqor.ait.core.tardis.handler.DoorHandler;
import net.awt.awt.exterior.block.model.TardisBlockExteriorModel;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.animation.Animation;

public class TardisBlockDoorModel extends DoorModel {
	private final ModelPart root;

	public TardisBlockDoorModel() {
		super();

		this.root = TardisBlockExteriorModel.getTexturedModelData().createModel().getChild("root");
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState animationDoorState) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public ModelPart getPart() {
		return this.root;
	}
}
