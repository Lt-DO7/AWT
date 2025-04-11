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
public class ThirdAndSecondBaseDoor extends DoorModel {
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart left_door;
	private final ModelPart right_door;
	public ThirdAndSecondBaseDoor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone4 = this.bone.getChild("boner");
		this.bone5 = this.bone.getChild("bone5");
		this.left_door = this.bone.getChild("left_door");
		this.right_door = this.bone.getChild("right_door");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0, 0).cuboid(-20.0F, 3.0F, -20.0F, 7.0F, 1.0F, 40.0F, new Dilation(0.0F))
		.uv(108, 41).cuboid(-20.0F, -69.0F, -14.0F, 6.0F, 4.0F, 28.0F, new Dilation(0.0F))
		.uv(0, 81).cuboid(-17.0F, -73.0F, -17.0F, 2.0F, 4.0F, 34.0F, new Dilation(0.0F))
		.uv(40, 192).cuboid(-19.0F, -71.0F, 14.0F, 5.0F, 74.0F, 5.0F, new Dilation(0.0F))
		.uv(20, 184).cuboid(-19.0F, -71.0F, -19.0F, 5.0F, 74.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 20.0F, 0.0F));

		ModelPartData bone4 = bone.addChild("boner", ModelPartBuilder.create().uv(0, 41).cuboid(-18.0F, -65.0F, -18.0F, 3.0F, 4.0F, 36.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bone5 = bone.addChild("bone5", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, 1.0F, 0.0F));

		ModelPartData left_door = bone.addChild("left_door", ModelPartBuilder.create().uv(58, 119).cuboid(-0.5F, -30.0F, -0.5F, 1.0F, 64.0F, 14.0F, new Dilation(0.0F))
		.uv(301, 94).cuboid(-0.6F, 0.0F, 11.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 95).cuboid(-1.5F, -8.0F, 11.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(9, 48).cuboid(-1.5F, -30.0F, 11.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-15.5F, -31.0F, -13.5F));

		ModelPartData right_door = bone.addChild("right_door", ModelPartBuilder.create().uv(166, 178).cuboid(-0.5F, -30.0F, -13.5F, 1.0F, 64.0F, 14.0F, new Dilation(0.0F))
		.uv(196, 178).cuboid(-1.5F, -30.0F, -14.0F, 1.0F, 64.0F, 1.0F, new Dilation(0.0F))
		.uv(9, 48).cuboid(-1.5F, -30.0F, -12.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-15.5F, -31.0F, 13.5F));
		return TexturedModelData.of(modelData, 512, 512);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, AbstractLinkableBlockEntity doorEntity, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
			DoorHandler door = doorEntity.tardis().get().door();
			left_door.yaw = !door.isLeftOpen() && !door.isOpen() ? 0.0F : -5.0F;
			right_door.yaw = !door.isRightOpen() && !door.areBothOpen() ? 0.0F : 5.0F;
		} else {
			float maxRot = 90.0F;
			left_door.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
			right_door.yaw = (float)-Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getRightRot()));
		}

		matrices.push();
		matrices.scale(0.63F, 0.63F, 0.63F);
		matrices.translate(0.0F, -1.5F, 0.0F);
		matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(180.0F));
		super.renderWithAnimations(tardis, doorEntity, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
		matrices.pop();
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public ModelPart getPart() {
		return bone;
	}
}