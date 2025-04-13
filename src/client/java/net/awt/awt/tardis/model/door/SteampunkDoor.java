package net.awt.awt.tardis.model.door;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.block.AbstractLinkableBlockEntity;
import dev.amble.ait.client.models.doors.DoorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RotationAxis;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class SteampunkDoor extends DoorModel {
	private final ModelPart doorframe;
	private final ModelPart door;
	private final ModelPart doora;
	private final ModelPart doorb;
	private final ModelPart doorc;
	private final ModelPart doord;
	private final ModelPart doore;
	private final ModelPart doorf;
	private final ModelPart bb_main;
	public SteampunkDoor(ModelPart root) {
		this.doorframe = root.getChild("doorframe");
		this.door = root.getChild("door");
		this.doora = this.door.getChild("doora");
		this.doorb = this.door.getChild("doorb");
		this.doorc = this.door.getChild("doorc");
		this.doord = this.door.getChild("doord");
		this.doore = this.door.getChild("doore");
		this.doorf = this.door.getChild("doorf");
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData doorframe = modelPartData.addChild("doorframe", ModelPartBuilder.create().uv(0, 36).cuboid(9.0F, -42.0F, 6.0F, 2.0F, 42.0F, 3.0F, new Dilation(0.0F))
		.uv(10, 36).cuboid(-11.0F, -42.0F, 6.0F, 2.0F, 42.0F, 3.0F, new Dilation(0.0F))
		.uv(20, 36).cuboid(-11.0F, -42.0F, 6.0F, 22.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(40, 0).cuboid(-9.0F, -40.0F, 7.0F, 18.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData door = modelPartData.addChild("door", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData doora = door.addChild("doora", ModelPartBuilder.create().uv(20, 41).cuboid(-1.5F, -18.0F, -0.5F, 3.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.5F, -18.0F, 7.5F));

		ModelPartData doorb = door.addChild("doorb", ModelPartBuilder.create().uv(28, 41).cuboid(-1.5F, -18.0F, -0.5F, 3.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.5F, -18.0F, 7.5F));

		ModelPartData doorc = door.addChild("doorc", ModelPartBuilder.create().uv(36, 41).cuboid(-1.5F, -18.0F, -0.5F, 3.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, -18.0F, 7.5F));

		ModelPartData doord = door.addChild("doord", ModelPartBuilder.create().uv(44, 41).cuboid(-1.5F, -18.0F, -0.5F, 3.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, -18.0F, 7.5F));

		ModelPartData doore = door.addChild("doore", ModelPartBuilder.create().uv(52, 41).cuboid(-1.5F, -18.0F, -0.5F, 3.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.5F, -18.0F, 7.5F));

		ModelPartData doorf = door.addChild("doorf", ModelPartBuilder.create().uv(60, 41).cuboid(-1.5F, -18.0F, -0.5F, 3.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.5F, -18.0F, 7.5F));

		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).cuboid(8.0F, 0.0F, -11.0F, 2.0F, 0.0F, 18.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(8.0F, -36.0F, -11.0F, 2.0F, 0.0F, 18.0F, new Dilation(0.0F))
		.uv(40, 9).cuboid(-8.0F, -39.0F, 5.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = bb_main.addChild("cube_r1", ModelPartBuilder.create().uv(40, 9).cuboid(-8.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -38.0F, 9.0F, 0.0F, 3.1416F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		doorframe.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		door.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public ModelPart getPart() {
		return null;
	}
}