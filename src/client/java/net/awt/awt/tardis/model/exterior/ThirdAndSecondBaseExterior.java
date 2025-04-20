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
public class ThirdAndSecondBaseExterior extends ExteriorModel {
	private final ModelPart root;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart left_door;
	private final ModelPart right_door;
	public ThirdAndSecondBaseExterior() {
		this.root = getTexturedModelData().createModel().getChild("root");
		this.bone4 = this.root.getChild("boner");
		this.bone5 = this.root.getChild("bone5");
		this.left_door = this.root.getChild("left_door");
		this.right_door = this.root.getChild("right_door");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create().uv(0, 0).cuboid(-20.0F, 3.0F, -20.0F, 40.0F, 1.0F, 40.0F, new Dilation(0.0F))
		.uv(108, 41).cuboid(-20.0F, -69.0F, -14.0F, 40.0F, 4.0F, 28.0F, new Dilation(0.0F))
		.uv(0, 81).cuboid(-17.0F, -73.0F, -17.0F, 34.0F, 4.0F, 34.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.0F, -76.0F, -4.0F, 8.0F, 3.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 11).cuboid(-4.0F, -84.0F, -4.0F, 8.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(-3.0F, -85.0F, -3.0F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(20, 24).cuboid(-2.0F, -82.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(4, 11).cuboid(-3.5F, -82.0F, 2.5F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 11).cuboid(2.5F, -82.0F, 2.5F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(2.5F, -82.0F, -3.5F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 0).cuboid(-3.5F, -82.0F, -3.5F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 192).cuboid(-19.0F, -71.0F, 14.0F, 5.0F, 74.0F, 5.0F, new Dilation(0.0F))
		.uv(166, 113).cuboid(-14.0F, -61.0F, 15.0F, 28.0F, 64.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 119).cuboid(-14.0F, -61.0F, -16.0F, 28.0F, 64.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 197).cuboid(-0.5F, -61.0F, -17.0F, 1.0F, 64.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 197).cuboid(-0.5F, -61.0F, 16.0F, 1.0F, 64.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 184).cuboid(-19.0F, -71.0F, -19.0F, 5.0F, 74.0F, 5.0F, new Dilation(0.0F))
		.uv(88, 119).cuboid(14.0F, -71.0F, 14.0F, 5.0F, 74.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 184).cuboid(14.0F, -71.0F, -19.0F, 5.0F, 74.0F, 5.0F, new Dilation(0.0F))
		.uv(108, 113).cuboid(15.0F, -61.0F, -14.0F, 1.0F, 64.0F, 28.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 20.0F, 0.0F));

		ModelPartData cube_r1 = root.addChild("cube_r1", ModelPartBuilder.create().uv(60, 197).cuboid(-0.5F, -61.0F, 16.0F, 1.0F, 64.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 81).cuboid(-20.0F, -69.0F, -14.0F, 40.0F, 4.0F, 28.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bone4 = root.addChild("boner", ModelPartBuilder.create().uv(0, 41).cuboid(-18.0F, -65.0F, -18.0F, 36.0F, 4.0F, 36.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bone5 = root.addChild("bone5", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, 1.0F, 0.0F));

		ModelPartData left_door = root.addChild("left_door", ModelPartBuilder.create().uv(58, 119).cuboid(-0.5F, -30.0F, -0.5F, 1.0F, 64.0F, 14.0F, new Dilation(0.0F))
		.uv(301, 94).cuboid(-0.6F, 0.0F, 11.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 95).cuboid(-1.5F, -8.0F, 11.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(9, 48).cuboid(-1.5F, -30.0F, 11.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-15.5F, -31.0F, -13.5F));

		ModelPartData right_door = root.addChild("right_door", ModelPartBuilder.create().uv(166, 178).cuboid(-0.5F, -30.0F, -13.5F, 1.0F, 64.0F, 14.0F, new Dilation(0.0F))
		.uv(196, 178).cuboid(-1.5F, -30.0F, -14.0F, 1.0F, 64.0F, 1.0F, new Dilation(0.0F))
		.uv(9, 48).cuboid(-1.5F, -30.0F, -12.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-15.5F, -31.0F, 13.5F));
		return TexturedModelData.of(modelData, 512, 512);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return root;
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return null;
	}

	@Override
	public void renderDoors(ClientTardis tardis, ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, boolean isBOTI) {

	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices,
									 VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		if (exterior.tardis().isEmpty())
			return;

		matrices.push();
		matrices.scale(0.63F, 0.63F, 0.63F);
		matrices.translate(0, -1.5f, 0);
		matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(90));

		DoorHandler door = exterior.tardis().get().door();



		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
			left_door.yaw = (door.isLeftOpen() || door.isOpen()) ? -5.0F : 0.0F;
			right_door.yaw = (door.isRightOpen() || door.areBothOpen())
					? 5.0F
					: 0.0F;
		} else {
			float maxRot = 90f;
			left_door.yaw = (float) Math.toRadians(maxRot * door.getLeftRot());
			right_door.yaw = (float) -Math.toRadians(maxRot * door.getRightRot());
		}

		super.renderWithAnimations(tardis, exterior, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
		matrices.pop();
	}

	@Override
	public <T extends Entity & Linkable> void renderEntity(T falling, ModelPart root, MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		matrices.push();
		matrices.scale(0.63F, 0.63F, 0.63F);
		matrices.translate(0, -1.5f, 0);
		super.renderEntity(falling, root, matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.pop();
	}
}