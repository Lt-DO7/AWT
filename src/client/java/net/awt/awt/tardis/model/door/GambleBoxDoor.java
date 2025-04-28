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
public class GambleBoxDoor extends DoorModel {
	private final ModelPart left_door;
	private final ModelPart right_door;
	private final ModelPart Posts;
	private final ModelPart Walls;
	private final ModelPart PCB;
	public GambleBoxDoor(ModelPart root) {
		this.left_door = root.getChild("left_door");
		this.right_door = root.getChild("right_door");
		this.Posts = root.getChild("Posts");
		this.Walls = root.getChild("Walls");
		this.PCB = root.getChild("PCB");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData left_door = modelPartData.addChild("left_door", ModelPartBuilder.create().uv(54, 129).cuboid(-8.8238F, -19.2817F, -0.3268F, 9.0F, 35.9489F, 0.6536F, new Dilation(0.0F))
		.uv(80, 50).cuboid(-8.1702F, -6.863F, -0.9804F, 0.6536F, 2.6145F, 0.6536F, new Dilation(0.0F)), ModelTransform.pivot(8.8238F, 7.7183F, -6.131F));

		ModelPartData right_door = modelPartData.addChild("right_door", ModelPartBuilder.create().uv(35, 129).cuboid(-0.1762F, -19.2817F, -0.3268F, 9.0F, 35.9489F, 0.6536F, new Dilation(0.0F))
		.uv(72, 129).cuboid(0.3268F, -19.2817F, -0.6536F, 9.1506F, 35.9489F, 0.0F, new Dilation(0.0F))
		.uv(80, 54).cuboid(6.2094F, -6.2093F, -0.9804F, 0.6536F, 1.3072F, 0.6536F, new Dilation(0.0F)), ModelTransform.pivot(-8.8238F, 7.7183F, -6.131F));

		ModelPartData Posts = modelPartData.addChild("Posts", ModelPartBuilder.create().uv(84, 27).cuboid(-11.7651F, -42.1386F, -11.7651F, 2.6145F, 39.5242F, 2.6145F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 27.0F, 4.0F));

		ModelPartData cube_r1 = Posts.addChild("cube_r1", ModelPartBuilder.create().uv(90, 129).cuboid(-11.7651F, -42.1386F, -11.7651F, 2.6145F, 39.5242F, 2.6145F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData Walls = modelPartData.addChild("Walls", ModelPartBuilder.create().uv(96, 27).cuboid(-9.1506F, -39.2169F, -10.4579F, 0.6536F, 36.6025F, 0.6536F, new Dilation(0.0F))
		.uv(136, 16).cuboid(8.497F, -39.2169F, -10.4579F, 0.6536F, 36.6025F, 0.6536F, new Dilation(0.0F))
		.uv(136, 54).cuboid(-8.497F, -39.2169F, -10.4579F, 16.994F, 0.6536F, 0.6536F, new Dilation(0.0F))
		.uv(140, 16).cuboid(8.497F, -39.2169F, -10.7847F, 0.6536F, 36.6025F, 0.0F, new Dilation(0.0F))
		.uv(80, 70).cuboid(-8.497F, -39.2169F, -10.7847F, 16.994F, 0.6536F, 0.0F, new Dilation(0.0F))
		.uv(142, 16).cuboid(-9.1506F, -39.2169F, -10.7847F, 0.6536F, 36.6025F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 27.0F, 4.0F));

		ModelPartData Wall_r1 = Walls.addChild("Wall_r1", ModelPartBuilder.create().uv(0, 129).cuboid(-10.9481F, -42.2169F, -9.1506F, 0.0F, 0.6025F, 18.3012F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -22.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData PCB = modelPartData.addChild("PCB", ModelPartBuilder.create().uv(136, 0).cuboid(-11.1115F, -40.8314F, -12.4187F, 22.2229F, 2.2681F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 26.3464F, 4.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		left_door.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		right_door.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Posts.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Walls.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		PCB.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, AbstractLinkableBlockEntity doorEntity, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
			DoorHandler door = doorEntity.tardis().get().door();
			left_door.yaw = !door.isLeftOpen() && !door.isOpen() ? 0 : 0;
			right_door.yaw = !door.isRightOpen() && !door.areBothOpen() ? 0 : 0;
		} else {
			float maxRot = 90.0F;
			left_door.yaw = (float)(Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getLeftRot())));
			right_door.yaw = (float)-Math.toRadians((double)(maxRot * doorEntity.tardis().get().door().getRightRot()));
		}

		matrices.push();
		matrices.scale(0, 0, 0);
		matrices.translate(0.0F, 0F, 0);
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
		return null;
    }
}