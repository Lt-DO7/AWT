package net.awt.awt.tardis.model.door;

import dev.amble.ait.client.models.doors.DoorModel;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class TypeUltAndrDoor extends DoorModel {
	private ModelPart doorframe;
	private ModelPart doorframe3;
	private ModelPart doorframe2;
	private ModelPart door1;
	private ModelPart door2;

	public TypeUltAndrDoor(ModelPart model) {

        this.doorframe = doorframe;
        this.doorframe3 = doorframe3;
        this.doorframe2 = doorframe2;
        this.door1 = door1;
        this.door2 = door2;
    }

	public TypeUltAndrDoor Doors(ModelPart root) {
		this.doorframe = root.getChild("doorframe");
		this.doorframe3 = root.getChild("doorframe3");
		this.doorframe2 = root.getChild("doorframe2");
		this.door1 = root.getChild("door1");
		this.door2 = root.getChild("door2");
        return null;
    }
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData doorframe = modelPartData.addChild("doorframe", ModelPartBuilder.create().uv(1, 7).cuboid(8.0F, -36.0F, 6.0F, 3.0F, 36.0F, 2.0F, new Dilation(0.0F))
		.uv(13, 7).cuboid(-11.0F, -36.0F, 6.0F, 3.0F, 36.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-11.0F, -38.0F, 6.0F, 22.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData doorframe3 = modelPartData.addChild("doorframe3", ModelPartBuilder.create().uv(2, 55).cuboid(8.0F, -36.0F, 7.2F, 1.0F, 36.0F, 0.0F, new Dilation(0.0F))
		.uv(16, 55).cuboid(-9.0F, -36.0F, 7.2F, 1.0F, 36.0F, 0.0F, new Dilation(0.0F))
		.uv(4, 49).cuboid(-9.0F, -36.0F, 7.2F, 18.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 1.0F));

		ModelPartData doorframe2 = modelPartData.addChild("doorframe2", ModelPartBuilder.create().uv(55, 7).cuboid(10.0F, -38.0F, 7.0F, 1.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(65, 7).cuboid(-11.0F, -38.0F, 7.0F, 1.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(53, 1).cuboid(-11.0F, -38.0F, 7.0F, 22.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData door1 = modelPartData.addChild("door1", ModelPartBuilder.create().uv(73, 47).cuboid(0.0625F, -16.75F, -0.4125F, 8.0F, 35.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 91).cuboid(7.0625F, -3.75F, 0.7875F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(39, 91).cuboid(6.0625F, -2.75F, 0.7875F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(39, 91).cuboid(5.0625F, -1.75F, 0.7875F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(1.0625F, 11.25F, -0.6125F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(1.0625F, 2.25F, -0.6125F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(1.0625F, -6.75F, -0.6125F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(1.0625F, -15.75F, -0.6125F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.0625F, 5.75F, 7.4125F));

		ModelPartData door2 = modelPartData.addChild("door2", ModelPartBuilder.create().uv(100, 46).cuboid(-8.0625F, -16.75F, -0.4125F, 8.0F, 35.0F, 1.0F, new Dilation(0.0F))
		.uv(61, 91).cuboid(-8.0625F, -3.75F, 0.7875F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(61, 91).cuboid(-7.0625F, -2.75F, 0.7875F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(61, 91).cuboid(-6.0625F, -1.75F, 0.7875F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(-7.0625F, 11.25F, -0.6125F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(-7.0625F, 2.25F, -0.6125F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(-7.0625F, -6.75F, -0.6125F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F))
		.uv(70, 95).cuboid(-7.0625F, -15.75F, -0.6125F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0625F, 5.75F, 7.4125F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState animationDoorState) {
		return null;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		doorframe.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		doorframe3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		doorframe2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		door1.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		door2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return getTexturedModelData().createModel();
	}
}