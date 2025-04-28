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
public class TorchwoodCapsuleDoor extends DoorModel {
	private final ModelPart bone;
	private final ModelPart shellframe;
	private final ModelPart frametop;
	private final ModelPart framebottom;
	private final ModelPart framecorners;
	private final ModelPart walls;
	private final ModelPart rightdoor;
	private final ModelPart leftdoor;
	public TorchwoodCapsuleDoor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.shellframe = this.bone.getChild("shellframe");
		this.frametop = this.shellframe.getChild("frametop");
		this.framebottom = this.shellframe.getChild("framebottom");
		this.framecorners = this.shellframe.getChild("framecorners");
		this.walls = this.bone.getChild("walls");
		this.rightdoor = this.bone.getChild("rightdoor");
		this.leftdoor = this.bone.getChild("leftdoor");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 16.0F, 0.0F));

		ModelPartData shellframe = bone.addChild("shellframe", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData frametop = shellframe.addChild("frametop", ModelPartBuilder.create().uv(2, 79).cuboid(-9.0F, -2.0F, -11.0F, 18.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -42.0F, 0.0F));

		ModelPartData framebottom = shellframe.addChild("framebottom", ModelPartBuilder.create().uv(98, 41).cuboid(-9.0F, -1.0F, 9.0F, 18.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		ModelPartData framecorners = shellframe.addChild("framecorners", ModelPartBuilder.create().uv(48, 79).cuboid(9.0F, -42.0F, -11.0F, 2.0F, 40.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = framecorners.addChild("cube_r1", ModelPartBuilder.create().uv(96, 53).cuboid(9.0F, -40.0F, -11.0F, 2.0F, 40.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData walls = bone.addChild("walls", ModelPartBuilder.create().uv(96, 95).cuboid(-9.0F, -42.0F, -10.0F, 18.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData rightdoor = bone.addChild("rightdoor", ModelPartBuilder.create().uv(76, 78).cuboid(0.0F, -38.0F, -10.0F, 9.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leftdoor = bone.addChild("leftdoor", ModelPartBuilder.create().uv(76, 41).cuboid(-9.0F, -38.0F, -10.0F, 9.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
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
			leftdoor.yaw = !door.isLeftOpen() && !door.isOpen() ? 0.0F : -5.0F;
			rightdoor.yaw = !door.isRightOpen() && !door.areBothOpen() ? 0.0F : 5.0F;
		} else {
			float maxRot = 90.0F;
			leftdoor.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
			rightdoor.yaw = (float)-Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getRightRot()));
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