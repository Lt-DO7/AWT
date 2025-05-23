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
public class policebox_door extends DoorModel {
	private final ModelPart tardis;
	private final ModelPart doors;
	private final ModelPart left;
	private final ModelPart door;
	private final ModelPart right2;
	public policebox_door(ModelPart root) {
		this.tardis = root.getChild("tardis");
		this.doors = this.tardis.getChild("doors");
		this.left = this.doors.getChild("left");
		this.door = this.left.getChild("door");
		this.right2 = this.doors.getChild("right2");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData tardis = modelPartData.addChild("tardis", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData doors = tardis.addChild("doors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left = doors.addChild("left", ModelPartBuilder.create().uv(182, 170).cuboid(1.5F, -25.0F, 11.2F, 10.0F, 23.0F, 1.0F, new Dilation(0.0F))
		.uv(118, 234).cuboid(9.5F, -33.0F, 11.2F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F))
		.uv(190, 99).cuboid(10.5F, -42.7F, 10.6F, 2.0F, 40.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 193).cuboid(11.5F, -44.7F, 10.3F, 1.0F, 42.0F, 1.0F, new Dilation(0.0F))
		.uv(1, 195).cuboid(0.5F, -42.7F, 10.6F, 2.0F, 38.0F, 1.0F, new Dilation(0.0F))
		.uv(192, 144).cuboid(1.5F, -4.7F, 10.6F, 11.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 230).cuboid(2.5F, -14.7F, 10.6F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(2.5F, -24.7F, 10.6F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(230, 200).cuboid(2.5F, -34.7F, 10.6F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(156, 71).cuboid(0.5F, -45.7F, 10.6F, 12.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 193).cuboid(0.5F, -42.7F, 10.6F, 2.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 230).cuboid(0.5F, -4.7F, 10.6F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(238, 248).cuboid(2.5F, -42.7F, 11.6F, 8.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-12.0F, 0.0F, -24.0F));

		ModelPartData cube_r1 = left.addChild("cube_r1", ModelPartBuilder.create().uv(110, 233).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -41.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r2 = left.addChild("cube_r2", ModelPartBuilder.create().uv(136, 239).cuboid(-1.0F, -8.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(166, 174).cuboid(-1.0F, 12.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(134, 239).cuboid(-1.0F, 22.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(11.2078F, -34.7F, 11.3078F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r3 = left.addChild("cube_r3", ModelPartBuilder.create().uv(232, 37).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -37.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r4 = left.addChild("cube_r4", ModelPartBuilder.create().uv(234, 168).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -33.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r5 = left.addChild("cube_r5", ModelPartBuilder.create().uv(114, 236).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.8F, -34.7F, 12.0142F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r6 = left.addChild("cube_r6", ModelPartBuilder.create().uv(110, 236).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.2F, -34.7F, 12.0142F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r7 = left.addChild("cube_r7", ModelPartBuilder.create().uv(22, 241).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(224, 131).cuboid(-1.0F, 12.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(20, 241).cuboid(-1.0F, 22.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -34.7F, 12.0142F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r8 = left.addChild("cube_r8", ModelPartBuilder.create().uv(0, 233).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -21.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r9 = left.addChild("cube_r9", ModelPartBuilder.create().uv(234, 167).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -13.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r10 = left.addChild("cube_r10", ModelPartBuilder.create().uv(232, 43).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -11.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r11 = left.addChild("cube_r11", ModelPartBuilder.create().uv(234, 166).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -3.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData door = left.addChild("door", ModelPartBuilder.create().uv(216, 160).cuboid(0.0F, -4.0F, -1.0F, 8.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(164, 210).cuboid(1.0F, -3.5F, -1.2F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(172, 23).cuboid(7.0F, -0.3F, -1.6F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(180, 235).cuboid(1.5F, -3.0F, 0.0F, 3.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(152, 237).cuboid(1.5F, -1.0F, 1.0F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(150, 241).cuboid(4.2F, -2.9F, -0.1F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, -28.7F, 11.9F));

		ModelPartData cube_r12 = door.addChild("cube_r12", ModelPartBuilder.create().uv(156, 241).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.1858F, -1.0F, 2.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r13 = door.addChild("cube_r13", ModelPartBuilder.create().uv(242, 14).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.7858F, -1.0F, 2.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r14 = door.addChild("cube_r14", ModelPartBuilder.create().uv(180, 241).cuboid(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.3566F, 0.6373F, 0.8F, 0.0F, 0.0F, 1.0036F));

		ModelPartData cube_r15 = door.addChild("cube_r15", ModelPartBuilder.create().uv(242, 10).cuboid(0.0F, -3.0F, -2.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 5.2355F, -2.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r16 = door.addChild("cube_r16", ModelPartBuilder.create().uv(242, 8).cuboid(0.0F, -3.0F, -2.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.4078F, 1.9362F, 0.7854F, 0.0F, 0.0F));

		ModelPartData right2 = doors.addChild("right2", ModelPartBuilder.create().uv(104, 194).cuboid(0.5F, -42.7F, -13.4F, 1.0F, 40.0F, 2.0F, new Dilation(0.0F))
		.uv(198, 59).cuboid(0.5F, -45.7F, -13.4F, 11.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(199, 134).cuboid(0.5F, -4.7F, -13.4F, 11.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(51, 110).cuboid(0.5F, -34.0F, -12.8F, 11.0F, 32.0F, 1.0F, new Dilation(0.0F))
		.uv(190, 99).cuboid(9.5F, -42.7F, -13.4F, 2.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(230, 208).cuboid(1.5F, -24.7F, -13.4F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(230, 212).cuboid(1.5F, -34.7F, -13.4F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(230, 204).cuboid(1.5F, -14.7F, -13.4F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(140, 82).cuboid(0.5F, -29.0F, -14.3F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(34, 230).cuboid(1.5F, -4.7F, -13.4F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(238, 248).cuboid(1.5F, -42.7F, -12.4F, 8.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r17 = right2.addChild("cube_r17", ModelPartBuilder.create().uv(242, 2).cuboid(0.0F, -3.0F, -2.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -23.4645F, -15.0071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r18 = right2.addChild("cube_r18", ModelPartBuilder.create().uv(242, 0).cuboid(0.0F, -3.0F, -2.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -28.2922F, -10.7638F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r19 = right2.addChild("cube_r19", ModelPartBuilder.create().uv(240, 0).cuboid(-1.0F, -8.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 175).cuboid(-1.0F, -18.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(178, 239).cuboid(-1.0F, -28.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(176, 239).cuboid(-1.0F, -38.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.2078F, -4.7F, -12.6922F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r20 = right2.addChild("cube_r20", ModelPartBuilder.create().uv(84, 235).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -3.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r21 = right2.addChild("cube_r21", ModelPartBuilder.create().uv(84, 234).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -11.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r22 = right2.addChild("cube_r22", ModelPartBuilder.create().uv(196, 236).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.2F, -34.7F, -11.9858F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r23 = right2.addChild("cube_r23", ModelPartBuilder.create().uv(232, 39).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -37.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r24 = right2.addChild("cube_r24", ModelPartBuilder.create().uv(200, 236).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.8F, -34.7F, -11.9858F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r25 = right2.addChild("cube_r25", ModelPartBuilder.create().uv(148, 241).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 9).cuboid(-1.0F, -18.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(146, 241).cuboid(-1.0F, -28.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(144, 241).cuboid(-1.0F, -38.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, -4.7F, -11.9858F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r26 = right2.addChild("cube_r26", ModelPartBuilder.create().uv(44, 235).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -13.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r27 = right2.addChild("cube_r27", ModelPartBuilder.create().uv(46, 234).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -21.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r28 = right2.addChild("cube_r28", ModelPartBuilder.create().uv(28, 235).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -23.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r29 = right2.addChild("cube_r29", ModelPartBuilder.create().uv(28, 234).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -31.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r30 = right2.addChild("cube_r30", ModelPartBuilder.create().uv(0, 234).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -41.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r31 = right2.addChild("cube_r31", ModelPartBuilder.create().uv(0, 235).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -33.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		tardis.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, AbstractLinkableBlockEntity doorEntity, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
			DoorHandler door = doorEntity.tardis().get().door();
			left.yaw = !door.isLeftOpen() && !door.isOpen() ? 0.0F : -5.0F;
			right2.yaw = !door.isRightOpen() && !door.areBothOpen() ? 0.0F : 5.0F;
		} else {
			float maxRot = 90.0F;
			left.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
			right2.yaw = (float)-Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getRightRot()));
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
		return tardis;
	}
}