package net.awt.awt.exterior.lego.model;


import loqor.ait.client.models.exteriors.ExteriorModel;
import loqor.ait.core.blockentities.ExteriorBlockEntity;
import loqor.ait.core.entities.FallingTardisEntity;
import loqor.ait.core.tardis.handler.DoorHandler;
import net.awt.awt.animation.OnionAnimation;
import net.awt.awt.animation.OnionAnimationConstants;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import org.joml.Vector3f;


public class LegoExteriorModel extends ExteriorModel {
	private final ModelPart root;

	public LegoExteriorModel() {
		super();
		this.root = getTexturedModelData().createModel().getChild("bone");
	}

	public void renderWithAnimations(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		matrices.push();
		// Apply any transformations if needed
		root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.pop();
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = createBone(modelPartData);
		createBack(bone);
		createTitleAboutPoliceBox(bone);
		createLamp(bone);
		createDoors(bone);
		return TexturedModelData.of(modelData, 128, 128);
	}

	private static ModelPartData createBone(ModelPartData root) {
		return root.addChild("bone", ModelPartBuilder.create()
						.uv(0, 18).cuboid(-8.0F, -27.0F, -34.0F, 16.0F, 2.0F, 16.0F, new Dilation(0.0F))
						.uv(0, 36).cuboid(-7.0F, -29.0F, -33.0F, 14.0F, 2.0F, 14.0F, new Dilation(0.0F))
						.uv(0, 0).cuboid(-8.0F, -2.0F, -34.0F, 16.0F, 2.0F, 16.0F, new Dilation(0.0F)),
				ModelTransform.pivot(0.0F, 24.0F, 26.0F));
	}

	private static void createBack(ModelPartData bone) {
		ModelPartData back = bone.addChild("Back", ModelPartBuilder.create()
						.uv(80, 68).cuboid(-4.0F, -11.5F, 1.25F, 3.0F, 23.0F, 2.0F, new Dilation(0.0F))
						.uv(58, 82).cuboid(7.0F, -11.5F, 1.25F, 3.0F, 23.0F, 2.0F, new Dilation(0.0F))
						.uv(68, 82).cuboid(9.0F, -11.5F, -0.75F, 2.0F, 23.0F, 3.0F, new Dilation(0.0F))
						.uv(10, 85).cuboid(-5.0F, -11.5F, -0.75F, 2.0F, 23.0F, 3.0F, new Dilation(0.0F))
						.uv(0, 52).cuboid(-1.95F, -11.5F, -0.75F, 10.0F, 23.0F, 2.0F, new Dilation(0.0F)),
				ModelTransform.pivot(-3.0F, -13.5F, -21.25F));

		back.addChild("cube_r1", ModelPartBuilder.create()
						.uv(38, 52).cuboid(-0.25F, -11.5F, 4.0F, 5.0F, 23.0F, 2.0F, new Dilation(0.0F))
						.uv(24, 52).cuboid(-0.25F, -11.5F, -6.0F, 5.0F, 23.0F, 2.0F, new Dilation(0.0F)),
				ModelTransform.of(3.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
	}

	private static void createTitleAboutPoliceBox(ModelPartData bone) {
		ModelPartData title = bone.addChild("title_about_police_box", ModelPartBuilder.create()
						.uv(78, 0).cuboid(-6.0F, -1.0F, -8.1F, 12.0F, 2.0F, 0.0F, new Dilation(0.0F)),
				ModelTransform.pivot(0.0F, -26.0F, -26.0F));

		title.addChild("cube_r2", ModelPartBuilder.create()
						.uv(24, 80).cuboid(-7.0F, -2.0F, -8.1F, 12.0F, 2.0F, 0.0F, new Dilation(0.0F)),
				ModelTransform.of(-1.0F, 1.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		title.addChild("cube_r3", ModelPartBuilder.create()
						.uv(78, 14).cuboid(-7.0F, -2.0F, -8.1F, 12.0F, 2.0F, 0.0F, new Dilation(0.0F)),
				ModelTransform.of(0.0F, 1.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

		title.addChild("cube_r4", ModelPartBuilder.create()
						.uv(80, 28).cuboid(-7.0F, -2.0F, -8.1F, 12.0F, 2.0F, 0.0F, new Dilation(0.0F)),
				ModelTransform.of(0.0F, 1.0F, 1.0F, 0.0F, -1.5708F, 0.0F));
	}

	private static void createLamp(ModelPartData bone) {
		ModelPartData lamp = bone.addChild("lamp", ModelPartBuilder.create(),
				ModelTransform.pivot(0.0243F, -31.1F, -26.0F));

		lamp.addChild("cube_r5", ModelPartBuilder.create()
						.uv(56, 39).cuboid(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)),
				ModelTransform.of(-0.0243F, 1.1F, 0.0F, 0.0F, -0.7854F, 0.0F));

		lamp.addChild("cube_r6", ModelPartBuilder.create()
						.uv(90, 76).cuboid(-1.5F, -1.5F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
						.uv(90, 67).cuboid(-2.0F, -2.5F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)),
				ModelTransform.of(-0.0243F, 1.1F, 0.0F, 0.0F, 0.7854F, 0.0F));

		lamp.addChild("cube_r7", ModelPartBuilder.create()
						.uv(90, 72).cuboid(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)),
				ModelTransform.of(-0.0243F, 2.1F, 0.0F, 0.0F, 0.7418F, 0.0F));

		lamp.addChild("cube_r8", ModelPartBuilder.create()
						.uv(56, 36).cuboid(0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)),
				ModelTransform.of(-0.0243F, -1.9F, 2.0F, 0.0F, 0.7854F, 0.0F));
	}

	private static void createDoors(ModelPartData bone) {
		ModelPartData doorR = bone.addChild("DoorR", ModelPartBuilder.create()
						.uv(56, 44).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
						.uv(-2, 85).cuboid(-1.0F, -22.0F, -7.0F, 3.0F, 23.0F, 3.0F, new Dilation(0.0F))
						.uv(47, 79).cuboid(-2.0F, -22.0F, -8.0F, 3.0F, 23.0F, 3.0F, new Dilation(0.0F))
						.uv(66, 55).cuboid(-5.95F, -22.0F, -6.0F, 4.0F, 23.0F, 3.0F, new Dilation(0.0F)),
				ModelTransform.pivot(6.0F, -3.0F, -26.0F));

		doorR.addChild("cube_r9", ModelPartBuilder.create()
						.uv(64, 0).cuboid(-5.0F, -23.0F, -1.0F, 5.0F, 23.0F, 2.0F, new Dilation(0.0F)),
				ModelTransform.of(-1.0F, 1.0F, -5.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData doorL = bone.addChild("DoorL", ModelPartBuilder.create()
						.uv(66, 29).cuboid(2.05F, -22.0F, -6.0F, 4.0F, 23.0F, 3.0F, new Dilation(0.0F))
						.uv(79, 41).cuboid(-1.0F, -22.0F, -8.0F, 3.0F, 23.0F, 3.0F, new Dilation(0.0F))
						.uv(90, 42).cuboid(-2.0F, -22.0F, -7.0F, 3.0F, 23.0F, 3.0F, new Dilation(0.0F))
						.uv(56, 42).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)),
				ModelTransform.pivot(-6.0F, -3.0F, -26.0F));

		doorL.addChild("cube_r10", ModelPartBuilder.create()
						.uv(52, 52).cuboid(-5.0F, -23.0F, -1.0F, 5.0F, 23.0F, 2.0F, new Dilation(0.0F)),
				ModelTransform.of(1.0F, 1.0F, -5.0F, 0.0F, 1.5708F, 0.0F));
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.DoorStateEnum doorStateEnum) {
		return null; // Implement door animations if needed
	}

	@Override
	public ModelPart getPart() {
		return root; // Return the root part for rendering
	}
}