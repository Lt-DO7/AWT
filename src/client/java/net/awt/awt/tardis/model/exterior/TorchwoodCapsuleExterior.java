package net.awt.awt.tardis.model.exterior;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.tardis.link.v2.Linkable;
import dev.amble.ait.client.models.exteriors.ExteriorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.blockentities.ExteriorBlockEntity;
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
public class TorchwoodCapsuleExterior extends ExteriorModel {
	private final ModelPart shellframe;
	private final ModelPart walls;
	private final ModelPart floorandroof;
	private final ModelPart leftdoor;
	private final ModelPart rightdoor;
	public TorchwoodCapsuleExterior() {
		this.shellframe = getTexturedModelData().createModel().getChild("shellframe");
		this.walls = getTexturedModelData().createModel().getChild("walls");
		this.floorandroof = getTexturedModelData().createModel().getChild("floorandroof");
		this.leftdoor = getTexturedModelData().createModel().getChild("leftdoor");
		this.rightdoor = getTexturedModelData().createModel().getChild("rightdoor");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData shellframe = modelPartData.addChild("shellframe", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData walls = modelPartData.addChild("walls", ModelPartBuilder.create().uv(0, 38).cuboid(-9.0F, -42.0F, 9.0F, 18.0F, 40.0F, 1.0F, new Dilation(0.0F))
		.uv(96, 95).cuboid(-9.0F, -42.0F, -10.0F, 18.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = walls.addChild("cube_r1", ModelPartBuilder.create().uv(76, 0).cuboid(-9.0F, -40.0F, 0.0F, 18.0F, 40.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r2 = walls.addChild("cube_r2", ModelPartBuilder.create().uv(38, 38).cuboid(-9.0F, -40.0F, 0.0F, 18.0F, 40.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData floorandroof = modelPartData.addChild("floorandroof", ModelPartBuilder.create().uv(0, 0).cuboid(-9.0F, -2.0F, -9.0F, 18.0F, 1.0F, 18.0F, new Dilation(0.0F))
		.uv(0, 19).cuboid(-9.0F, -43.0F, -9.0F, 18.0F, 1.0F, 18.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData leftdoor = modelPartData.addChild("leftdoor", ModelPartBuilder.create().uv(76, 41).cuboid(-9.0F, -38.0F, -10.0F, 9.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData rightdoor = modelPartData.addChild("rightdoor", ModelPartBuilder.create().uv(76, 78).cuboid(0.0F, -38.0F, -10.0F, 9.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState animationDoorState) {
		return null;
	}

	@Override
	public void renderDoors(ClientTardis clientTardis, ExteriorBlockEntity exteriorBlockEntity, ModelPart modelPart, MatrixStack matrixStack, VertexConsumer vertexConsumer, int i, int i1, float v, float v1, float v2, float v3, boolean b) {

	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		shellframe.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		walls.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		floorandroof.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leftdoor.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		rightdoor.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return getTexturedModelData().createModel();
	}
}