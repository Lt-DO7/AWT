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
public class BakerDoorModel extends DoorModel {
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	public BakerDoorModel(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone.getChild("bone3");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(38, 38).cuboid(-24.0F, -2.0F, -24.0F, 48.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(38, 38).cuboid(-24.0F, -1.0F, -24.0F, 48.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(38, 87).cuboid(-21.5F, -3.0F, -21.5F, 43.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(222, 264).cuboid(-22.0F, -72.0F, -22.0F, 6.0F, 70.0F, 6.0F, new Dilation(0.0F))
		.uv(261, 0).cuboid(16.0F, -72.0F, -22.0F, 6.0F, 70.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(-2, 91).cuboid(-24.0F, -71.0F, -19.0F, 7.0F, 5.0F, 38.0F, new Dilation(0.0F))
		.uv(64, 337).cuboid(-24.0F, -71.0F, 18.0F, 7.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r2 = bone.addChild("cube_r2", ModelPartBuilder.create().uv(64, 347).mirrored().cuboid(18.0F, -71.0F, 18.0F, 6.0F, 5.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bone2 = bone.addChild("bone2", ModelPartBuilder.create(), ModelTransform.pivot(-15.5F, 0.0F, -19.5F));

		ModelPartData cube_r3 = bone2.addChild("cube_r3", ModelPartBuilder.create().uv(266, 136).cuboid(20.0F, -66.0F, -0.5F, 1.0F, 64.0F, 1.0F, new Dilation(0.0F))
		.uv(232, 184).cuboid(19.0F, -66.0F, -16.0F, 1.0F, 64.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(15.5F, -1.0F, 19.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bone3 = bone.addChild("bone3", ModelPartBuilder.create(), ModelTransform.pivot(15.5F, 0.0F, -19.5F));

		ModelPartData cube_r4 = bone3.addChild("cube_r4", ModelPartBuilder.create().uv(13, 313).cuboid(-20.05F, -45.0F, -2.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(198, 184).cuboid(-20.0F, -66.0F, -16.0F, 1.0F, 64.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-15.5F, -1.0F, 19.5F, 0.0F, -1.5708F, 0.0F));
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
			bone3.yaw = !door.isLeftOpen() && !door.isOpen() ? 0.0F : -5.0F;
			bone2.yaw = !door.isRightOpen() && !door.areBothOpen() ? 0.0F : 5.0F;
		} else {
			float maxRot = 90.0F;
			bone3.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
			bone2.yaw = (float)-Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getRightRot()));
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