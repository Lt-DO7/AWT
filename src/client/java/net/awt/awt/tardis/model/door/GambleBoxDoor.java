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
	private final ModelPart Body;
	private final ModelPart Posts;
	private final ModelPart Doors;
	private final ModelPart right_door;
	private final ModelPart left_door;
	private final ModelPart PCB;
	public GambleBoxDoor(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Posts = root.getChild("Posts");
		this.Doors = root.getChild("Doors");
		this.right_door = root.getChild("right_door");
		this.left_door = root.getChild("left_door");
		this.PCB = root.getChild("PCB");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Body = modelPartData.addChild("Body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 25.0F, 0.0F));

		ModelPartData Posts = Body.addChild("Posts", ModelPartBuilder.create().uv(84, 27).cuboid(-11.7651F, -42.1386F, -11.7651F, 2.6145F, 39.5242F, 2.6145F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = Posts.addChild("cube_r1", ModelPartBuilder.create().uv(90, 129).cuboid(-11.7651F, -42.1386F, -11.7651F, 2.6145F, 39.5242F, 2.6145F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData Doors = Body.addChild("Doors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_door = Doors.addChild("right_door", ModelPartBuilder.create().uv(36, 129).cuboid(0.3268F, -19.2817F, -0.3268F, 8.497F, 35.9489F, 0.6536F, new Dilation(0.0F))
		.uv(72, 129).cuboid(0.3268F, -19.2817F, -0.6536F, 9.1506F, 35.9489F, 0.0F, new Dilation(0.0F))
		.uv(80, 54).cuboid(6.2094F, -6.2093F, -0.9804F, 0.6536F, 1.3072F, 0.6536F, new Dilation(0.0F)), ModelTransform.pivot(-8.8238F, -19.2817F, -10.131F));

		ModelPartData left_door = Doors.addChild("left_door", ModelPartBuilder.create().uv(53, 129).cuboid(-9.3268F, -19.3328F, -0.3268F, 9.0F, 37.0F, 0.6536F, new Dilation(0.0F))
		.uv(80, 50).cuboid(-8.1702F, -6.863F, -0.9804F, 0.6536F, 2.6145F, 0.6536F, new Dilation(0.0F)), ModelTransform.pivot(8.8238F, -19.2817F, -10.131F));

		ModelPartData PCB = Body.addChild("PCB", ModelPartBuilder.create().uv(136, 0).cuboid(-11.1115F, -40.8314F, -12.4187F, 22.2229F, 2.2681F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.6536F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
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
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public ModelPart getPart() {
		return Body;
	}
}