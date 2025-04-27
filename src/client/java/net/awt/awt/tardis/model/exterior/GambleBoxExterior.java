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
public class GambleBoxExterior extends ExteriorModel {
	private final ModelPart Body;
	private final ModelPart Posts;
	private final ModelPart Doors;
	private final ModelPart right_door;
	private final ModelPart left_door;
	private final ModelPart Walls;
	private final ModelPart PCB;
	private final ModelPart Roof;

	public GambleBoxExterior(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Posts = root.getChild("Posts");
		this.Doors = root.getChild("Doors");
		this.right_door = root.getChild("right_door");
		this.left_door = root.getChild("left_door");
		this.Walls = root.getChild("Walls");
		this.PCB = root.getChild("PCB");
		this.Roof = root.getChild("Roof");
	}

	public GambleBoxExterior() {
		super();
		this.Body = getTexturedModelData().createModel().getChild("Body");
		this.Posts = this.Body.getChild("Posts");
		this.Doors = this.Body.getChild("Doors");
		this.right_door = this.Body.getChild("right_door");
		this.left_door = this.Body.getChild("left_door");
		this.Walls = this.Body.getChild("Walls");
		this.PCB = this.Body.getChild("PCB");
		this.Roof = this.Body.getChild("Roof");
	}

	@Override
	public ModelPart getPart() {
		return Body;
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Body = modelPartData.addChild("Body", ModelPartBuilder.create().uv(0, 0).cuboid(-12.4187F, -2.6145F, -12.4187F, 24.8374F, 1.6145F, 24.8374F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 25.0F, 0.0F));

		ModelPartData Posts = Body.addChild("Posts", ModelPartBuilder.create().uv(84, 27).cuboid(-11.7651F, -42.1386F, -11.7651F, 2.6145F, 39.5242F, 2.6145F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = Posts.addChild("cube_r1", ModelPartBuilder.create().uv(0, 148).cuboid(-11.7651F, -42.1386F, -11.7651F, 2.6145F, 39.5242F, 2.6145F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r2 = Posts.addChild("cube_r2", ModelPartBuilder.create().uv(102, 129).cuboid(-11.7651F, -42.1386F, -11.7651F, 2.6145F, 39.5242F, 2.6145F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r3 = Posts.addChild("cube_r3", ModelPartBuilder.create().uv(90, 129).cuboid(-11.7651F, -42.1386F, -11.7651F, 2.6145F, 39.5242F, 2.6145F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData Doors = Body.addChild("Doors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_door = Doors.addChild("right_door", ModelPartBuilder.create().uv(36, 129).cuboid(0.3268F, -19.2817F, -0.3268F, 8.497F, 35.9489F, 0.6536F, new Dilation(0.0F))
		.uv(72, 129).cuboid(0.3268F, -19.2817F, -0.6536F, 9.1506F, 35.9489F, 0.0F, new Dilation(0.0F))
		.uv(80, 54).cuboid(6.2094F, -6.2093F, -0.9804F, 0.6536F, 1.3072F, 0.6536F, new Dilation(0.0F)), ModelTransform.pivot(-8.8238F, -19.2817F, -10.131F));

		ModelPartData left_door = Doors.addChild("left_door", ModelPartBuilder.create().uv(53, 129).cuboid(-9.3268F, -19.3328F, -0.3268F, 9.0F, 37.0F, 0.6536F, new Dilation(0.0F))
		.uv(80, 50).cuboid(-8.1702F, -6.863F, -0.9804F, 0.6536F, 2.6145F, 0.6536F, new Dilation(0.0F)), ModelTransform.pivot(8.8238F, -19.2817F, -10.131F));

		ModelPartData Walls = Body.addChild("Walls", ModelPartBuilder.create().uv(0, 71).cuboid(-10.4579F, -42.2169F, -9.1506F, 0.6536F, 39.6025F, 18.3012F, new Dilation(0.0F))
		.uv(100, 0).cuboid(-10.7847F, -42.2169F, -9.1506F, 0.0F, 39.6025F, 18.3012F, new Dilation(0.0F))
		.uv(96, 27).cuboid(-9.1506F, -39.2169F, -10.4579F, 0.6536F, 36.6025F, 0.6536F, new Dilation(0.0F))
		.uv(136, 16).cuboid(8.497F, -39.2169F, -10.4579F, 0.6536F, 36.6025F, 0.6536F, new Dilation(0.0F))
		.uv(136, 54).cuboid(-8.497F, -39.2169F, -10.4579F, 16.994F, 0.6536F, 0.6536F, new Dilation(0.0F))
		.uv(140, 16).cuboid(8.497F, -39.2169F, -10.7847F, 0.6536F, 36.6025F, 0.0F, new Dilation(0.0F))
		.uv(80, 70).cuboid(-8.497F, -39.2169F, -10.7847F, 16.994F, 0.6536F, 0.0F, new Dilation(0.0F))
		.uv(142, 16).cuboid(-9.1506F, -39.2169F, -10.7847F, 0.6536F, 36.6025F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Wall_r1 = Walls.addChild("Wall_r1", ModelPartBuilder.create().uv(0, 129).cuboid(-10.9481F, -42.2169F, -9.1506F, 0.0F, 0.6025F, 18.3012F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -22.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData Wall_r2 = Walls.addChild("Wall_r2", ModelPartBuilder.create().uv(114, 116).cuboid(-10.7847F, -42.2169F, -9.1506F, 0.0F, 39.6025F, 18.3012F, new Dilation(0.0F))
		.uv(76, 71).cuboid(-10.4579F, -42.2169F, -9.1506F, 0.6536F, 39.6025F, 18.3012F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData Wall_r3 = Walls.addChild("Wall_r3", ModelPartBuilder.create().uv(114, 58).cuboid(-10.9481F, -42.2169F, -9.1506F, 0.0F, 39.6025F, 18.3012F, new Dilation(0.0F))
		.uv(38, 71).cuboid(-10.4579F, -42.2169F, -9.1506F, 0.6536F, 39.6025F, 18.3012F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData PCB = Body.addChild("PCB", ModelPartBuilder.create().uv(136, 0).cuboid(-11.1115F, -40.8314F, -12.4187F, 22.2229F, 2.2681F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.6536F, 0.0F));

		ModelPartData cube_r4 = PCB.addChild("cube_r4", ModelPartBuilder.create().uv(136, 12).cuboid(-11.1115F, -38.8705F, -12.4187F, 22.2229F, 2.2681F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.9608F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r5 = PCB.addChild("cube_r5", ModelPartBuilder.create().uv(136, 8).cuboid(-11.1115F, -38.8705F, -12.4187F, 22.2229F, 2.2681F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.9608F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r6 = PCB.addChild("cube_r6", ModelPartBuilder.create().uv(136, 4).cuboid(-11.1115F, -38.8705F, -12.4187F, 22.2229F, 2.2681F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.9608F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData Roof = Body.addChild("Roof", ModelPartBuilder.create().uv(0, 27).cuboid(-10.4579F, -42.4459F, -10.4579F, 20.9157F, 1.6145F, 20.9157F, new Dilation(0.0F))
		.uv(144, 24).cuboid(-11.0941F, -42.5219F, -11.0941F, 1.9262F, 1.0F, 1.9262F, new Dilation(0.05F))
		.uv(144, 27).cuboid(-11.0941F, -42.5219F, 9.1679F, 1.9262F, 1.0F, 1.9262F, new Dilation(0.05F))
		.uv(144, 30).cuboid(9.1679F, -42.5219F, -11.0941F, 1.9262F, 1.0F, 1.9262F, new Dilation(0.05F))
		.uv(144, 33).cuboid(9.1679F, -42.5219F, 9.1679F, 1.9262F, 1.0F, 1.9262F, new Dilation(0.05F))
		.uv(0, 50).cuboid(-9.8042F, -43.1536F, -9.8042F, 19.6085F, 1.3072F, 19.6085F, new Dilation(0.0F))
		.uv(96, 65).cuboid(-1.9608F, -43.7531F, -1.9608F, 3.9217F, 1.0F, 3.9217F, new Dilation(0.0F))
		.uv(144, 16).cuboid(-1.9608F, -47.782F, -1.9608F, 3.9217F, 0.6536F, 3.9217F, new Dilation(0.0F))
		.uv(144, 21).cuboid(-1.0392F, -48.7284F, -0.9608F, 2.0F, 1.4F, 1.9217F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.6536F, 0.0F));

		ModelPartData cube_r7 = Roof.addChild("cube_r7", ModelPartBuilder.create().uv(100, 58).cuboid(-1.3072F, -47.7902F, -1.3072F, 2.6145F, 3.5753F, 2.6145F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5685F, 0.0F, 0.0F, 0.7854F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
	}

	@Override
	public net.minecraft.client.render.entity.animation.Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public void renderDoors(ClientTardis tardis, ExteriorBlockEntity exterior, net.minecraft.client.model.ModelPart root, net.minecraft.client.util.math.MatrixStack matrices, net.minecraft.client.render.VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, boolean isBOTI) {

	}
}