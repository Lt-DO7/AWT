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
	private  ModelPart bone;
	private  ModelPart shellframe;
	private  ModelPart frametop;
	private  ModelPart framebottom;
	private  ModelPart framecorners;
	private  ModelPart walls;
	private  ModelPart rightdoor;
	private  ModelPart leftdoor;
	private  ModelPart floorandroof;
	public TorchwoodCapsuleExterior(ModelPart root) {
		super();
		this.bone = getTexturedModelData().createModel().getChild("bone");
		this.shellframe = this.bone.getChild("shellframe");
		this.frametop = this.shellframe.getChild("frametop");
		this.framebottom = this.shellframe.getChild("framebottom");
		this.framecorners = this.shellframe.getChild("framecorners");
		this.walls = this.bone.getChild("walls");
		this.rightdoor = this.bone.getChild("rightdoor");
		this.leftdoor = this.bone.getChild("leftdoor");
		this.floorandroof = this.bone.getChild("floorandroof");
	}

	public TorchwoodCapsuleExterior() {
		this(getTexturedModelData().createModel());
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 16.0F, 0.0F));

		ModelPartData shellframe = bone.addChild("shellframe", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData frametop = shellframe.addChild("frametop", ModelPartBuilder.create().uv(2, 79).cuboid(-9.0F, -2.0F, -11.0F, 18.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(2, 83).cuboid(-9.0F, -2.0F, 9.0F, 18.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -42.0F, 0.0F));

		ModelPartData cube_r1 = frametop.addChild("cube_r1", ModelPartBuilder.create().uv(0, 91).cuboid(-11.0F, -2.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r2 = frametop.addChild("cube_r2", ModelPartBuilder.create().uv(0, 87).cuboid(-11.0F, -2.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData framebottom = shellframe.addChild("framebottom", ModelPartBuilder.create().uv(2, 95).cuboid(-9.0F, -1.0F, -11.0F, 18.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(98, 41).cuboid(-9.0F, -1.0F, 9.0F, 18.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		ModelPartData cube_r3 = framebottom.addChild("cube_r3", ModelPartBuilder.create().uv(96, 49).cuboid(-11.0F, -2.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, 1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r4 = framebottom.addChild("cube_r4", ModelPartBuilder.create().uv(96, 45).cuboid(-11.0F, -2.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, 1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData framecorners = shellframe.addChild("framecorners", ModelPartBuilder.create().uv(48, 79).cuboid(9.0F, -42.0F, -11.0F, 2.0F, 40.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r5 = framecorners.addChild("cube_r5", ModelPartBuilder.create().uv(96, 53).cuboid(9.0F, -40.0F, -11.0F, 2.0F, 40.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r6 = framecorners.addChild("cube_r6", ModelPartBuilder.create().uv(64, 79).cuboid(9.0F, -40.0F, -11.0F, 2.0F, 40.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r7 = framecorners.addChild("cube_r7", ModelPartBuilder.create().uv(56, 79).cuboid(9.0F, -40.0F, -11.0F, 2.0F, 40.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData walls = bone.addChild("walls", ModelPartBuilder.create().uv(0, 38).cuboid(-9.0F, -42.0F, 9.0F, 18.0F, 40.0F, 1.0F, new Dilation(0.0F))
		.uv(96, 95).cuboid(-9.0F, -42.0F, -10.0F, 18.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r8 = walls.addChild("cube_r8", ModelPartBuilder.create().uv(76, 0).cuboid(-9.0F, -40.0F, 0.0F, 18.0F, 40.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r9 = walls.addChild("cube_r9", ModelPartBuilder.create().uv(38, 38).cuboid(-9.0F, -40.0F, 0.0F, 18.0F, 40.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData rightdoor = bone.addChild("rightdoor", ModelPartBuilder.create().uv(76, 78).cuboid(0.0F, -38.0F, -10.0F, 9.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leftdoor = bone.addChild("leftdoor", ModelPartBuilder.create().uv(76, 41).cuboid(-9.0F, -38.0F, -10.0F, 9.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData floorandroof = bone.addChild("floorandroof", ModelPartBuilder.create().uv(0, 0).cuboid(-9.0F, -2.0F, -9.0F, 18.0F, 1.0F, 18.0F, new Dilation(0.0F))
		.uv(0, 19).cuboid(-9.0F, -43.0F, -9.0F, 18.0F, 1.0F, 18.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
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
		matrices.scale(0, 0, 0);
		matrices.translate(0, 0, 0);

		DoorHandler door = exterior.tardis().get().door();

		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
			this.leftdoor.getChild("leftdoor").yaw = (door.isLeftOpen() || door.isOpen()) ? -5.0F : 0.0F;
			this.rightdoor.getChild("rightdoor").yaw = (door.isRightOpen() || door.areBothOpen())
					? 5.0F
					: 0.0F;
		} else {
			float maxRot = 90f;
			this.leftdoor.getChild("leftdoor").yaw = (float) Math.toRadians(maxRot * door.getLeftRot());
			this.rightdoor.getChild("rightdoor").yaw = (float) -Math.toRadians(maxRot * door.getRightRot());
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

	@Override
	public ModelPart getPart() {
		return bone;
	}

	@Override
	public net.minecraft.client.render.entity.animation.Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public void renderDoors(ClientTardis tardis, ExteriorBlockEntity exterior, net.minecraft.client.model.ModelPart root, net.minecraft.client.util.math.MatrixStack matrices, net.minecraft.client.render.VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, boolean isBOTI) {

	}
}