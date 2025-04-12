package net.awt.awt.tardis.model.exterior;

import dev.amble.ait.client.models.exteriors.ExteriorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.blockentities.ExteriorBlockEntity;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

import java.util.prefs.NodeChangeEvent;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class TypeUltAndrExterior extends ExteriorModel {
	private final ModelPart floorroofceiling;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart doorframe;
	private final ModelPart doorframe2;
	private final ModelPart topframecorner;
	private final ModelPart topframecorner2;
	private final ModelPart topframecorner3;
	private final ModelPart topframecorner4;
	private final ModelPart bottomframecorner;
	private final ModelPart bottomframecorner2;
	private final ModelPart bottomframecorner3;
	private final ModelPart bottomframecorner4;
	private final ModelPart door1;
	private final ModelPart door2;
	private NodeChangeEvent root;

	public TypeUltAndrExterior() {
		this.floorroofceiling  = getTexturedModelData().createModel().getChild("floorroofceiling");
		this.bone = getTexturedModelData().createModel().getChild("bone");
		this.bone2 = getTexturedModelData().createModel().getChild("bone2");
		this.bone4 = getTexturedModelData().createModel().getChild("bone4");
		this.bone3 = getTexturedModelData().createModel().getChild("bone3");
		this.bone5 = getTexturedModelData().createModel().getChild("bone5");
		this.doorframe = getTexturedModelData().createModel().getChild("doorframe");
		this.doorframe2 = getTexturedModelData().createModel().getChild("doorframe2");
		this.topframecorner = getTexturedModelData().createModel().getChild("topframecorner");
		this.topframecorner2 = getTexturedModelData().createModel().getChild("topframecorner2");
		this.topframecorner3 = getTexturedModelData().createModel().getChild("topframecorner3");
		this.topframecorner4 = getTexturedModelData().createModel().getChild("topframecorner4");
		this.bottomframecorner = getTexturedModelData().createModel().getChild("bottomframecorner");
		this.bottomframecorner2 = getTexturedModelData().createModel().getChild("bottomframecorner2");
		this.bottomframecorner3 = getTexturedModelData().createModel().getChild("bottomframecorner3");
		this.bottomframecorner4 = getTexturedModelData().createModel().getChild("bottomframecorner4");
		this.door1 = getTexturedModelData().createModel().getChild("door1");
		this.door2 = getTexturedModelData().createModel().getChild("door2");
    }
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData floorroofceiling = modelPartData.addChild("floorroofceiling", ModelPartBuilder.create().uv(0, 0).cuboid(-12.0F, 37.0F, -12.0F, 24.0F, 1.0F, 24.0F, new Dilation(0.0F))
		.uv(0, 25).cuboid(-12.0F, -8.0F, -12.0F, 24.0F, 1.0F, 24.0F, new Dilation(0.0F))
		.uv(96, 0).cuboid(-10.0F, -1.0F, -10.0F, 20.0F, 1.0F, 20.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -14.0F, 0.0F));

		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0, 50).cuboid(10.0F, -38.0F, -11.0F, 1.0F, 37.0F, 22.0F, new Dilation(0.0F))
		.uv(46, 50).cuboid(-11.0F, -38.0F, -11.0F, 1.0F, 37.0F, 22.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(92, 50).cuboid(0.0F, -37.0F, -11.0F, 1.0F, 37.0F, 22.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 10.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bone2 = modelPartData.addChild("bone2", ModelPartBuilder.create().uv(96, 21).cuboid(-12.0F, -40.0F, -12.0F, 24.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(96, 24).cuboid(-12.0F, -40.0F, 11.0F, 24.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 18.0F, 0.0F));

		ModelPartData cube_r2 = bone2.addChild("cube_r2", ModelPartBuilder.create().uv(96, 30).cuboid(-12.0F, -2.0F, -1.0F, 24.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -38.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r3 = bone2.addChild("cube_r3", ModelPartBuilder.create().uv(96, 27).cuboid(-12.0F, -2.0F, -1.0F, 24.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-12.0F, -38.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bone4 = modelPartData.addChild("bone4", ModelPartBuilder.create().uv(96, 33).cuboid(-12.0F, -40.0F, -11.8F, 24.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(96, 36).cuboid(-12.0F, -40.0F, 10.8F, 24.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r4 = bone4.addChild("cube_r4", ModelPartBuilder.create().uv(96, 42).cuboid(-12.0F, -2.0F, -0.8F, 24.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -38.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r5 = bone4.addChild("cube_r5", ModelPartBuilder.create().uv(96, 39).cuboid(-12.0F, -2.0F, -1.2F, 24.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-12.0F, -38.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bone3 = modelPartData.addChild("bone3", ModelPartBuilder.create().uv(97, 45).cuboid(-10.0F, -44.0F, -11.0F, 20.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 109).cuboid(-10.0F, -44.0F, 10.0F, 20.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r6 = bone3.addChild("cube_r6", ModelPartBuilder.create().uv(33, 114).cuboid(-10.0F, -6.0F, -1.0F, 20.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, -38.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r7 = bone3.addChild("cube_r7", ModelPartBuilder.create().uv(79, 109).cuboid(-10.0F, -6.0F, -1.0F, 20.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-11.0F, -38.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bone5 = modelPartData.addChild("bone5", ModelPartBuilder.create().uv(0, 109).cuboid(10.0F, -45.0F, -12.0F, 2.0F, 44.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 109).cuboid(-12.0F, -45.0F, -12.0F, 2.0F, 44.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 109).cuboid(-12.0F, -45.0F, 10.0F, 2.0F, 44.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 109).cuboid(10.0F, -45.0F, 10.0F, 2.0F, 44.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData doorframe = modelPartData.addChild("doorframe", ModelPartBuilder.create().uv(86, 114).cuboid(8.0F, -38.0F, -11.0F, 2.0F, 37.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 114).cuboid(-10.0F, -38.0F, -11.0F, 2.0F, 37.0F, 1.0F, new Dilation(0.0F))
		.uv(98, 114).cuboid(-9.0F, -38.0F, -11.0F, 18.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData doorframe2 = modelPartData.addChild("doorframe2", ModelPartBuilder.create().uv(89, 158).cuboid(8.0F, -37.0F, -10.2F, 1.0F, 36.0F, 0.0F, new Dilation(0.0F))
		.uv(96, 158).cuboid(-9.0F, -37.0F, -10.2F, 1.0F, 36.0F, 0.0F, new Dilation(0.0F))
		.uv(101, 158).cuboid(-9.0F, -37.0F, -10.2F, 18.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, -1.0F));

		ModelPartData topframecorner = modelPartData.addChild("topframecorner", ModelPartBuilder.create().uv(2, 2).cuboid(10.2F, -46.2F, -12.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(3, 2).cuboid(11.2F, -46.2F, -12.2F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(1, 2).cuboid(9.2F, -46.2F, -12.2F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 2).cuboid(8.2F, -46.2F, -12.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r8 = topframecorner.addChild("cube_r8", ModelPartBuilder.create().uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -44.0F, -11.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r9 = topframecorner.addChild("cube_r9", ModelPartBuilder.create().uv(0, 2).cuboid(-2.8F, -0.8F, -0.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(1, 2).cuboid(-1.8F, -1.8F, -0.2F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(3, 2).cuboid(0.2F, -3.8F, -0.2F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-0.8F, -2.8F, -0.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -46.0F, -12.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData topframecorner2 = modelPartData.addChild("topframecorner2", ModelPartBuilder.create().uv(2, 2).cuboid(10.2F, -46.2F, -12.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(3, 2).cuboid(11.2F, -46.2F, -12.2F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(1, 2).cuboid(9.2F, -46.2F, -12.2F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 2).cuboid(8.2F, -46.2F, -12.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r10 = topframecorner2.addChild("cube_r10", ModelPartBuilder.create().uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -44.0F, -11.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r11 = topframecorner2.addChild("cube_r11", ModelPartBuilder.create().uv(0, 2).cuboid(-2.8F, -0.8F, -0.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(1, 2).cuboid(-1.8F, -1.8F, -0.2F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(3, 2).cuboid(0.2F, -3.8F, -0.2F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-0.8F, -2.8F, -0.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -46.0F, -12.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData topframecorner3 = modelPartData.addChild("topframecorner3", ModelPartBuilder.create().uv(2, 2).cuboid(10.2F, -46.2F, -12.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(3, 2).cuboid(11.2F, -46.2F, -12.2F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(1, 2).cuboid(9.2F, -46.2F, -12.2F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 2).cuboid(8.2F, -46.2F, -12.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r12 = topframecorner3.addChild("cube_r12", ModelPartBuilder.create().uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -44.0F, -11.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r13 = topframecorner3.addChild("cube_r13", ModelPartBuilder.create().uv(0, 2).cuboid(-2.8F, -0.8F, -0.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(1, 2).cuboid(-1.8F, -1.8F, -0.2F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(3, 2).cuboid(0.2F, -3.8F, -0.2F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-0.8F, -2.8F, -0.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -46.0F, -12.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData topframecorner4 = modelPartData.addChild("topframecorner4", ModelPartBuilder.create().uv(2, 2).cuboid(10.2F, -46.2F, -12.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(3, 2).cuboid(11.2F, -46.2F, -12.2F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(1, 2).cuboid(9.2F, -46.2F, -12.2F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 2).cuboid(8.2F, -46.2F, -12.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r14 = topframecorner4.addChild("cube_r14", ModelPartBuilder.create().uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-1.2F, -2.2F, -0.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -44.0F, -11.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r15 = topframecorner4.addChild("cube_r15", ModelPartBuilder.create().uv(0, 2).cuboid(-2.8F, -0.8F, -0.2F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(1, 2).cuboid(-1.8F, -1.8F, -0.2F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(3, 2).cuboid(0.2F, -3.8F, -0.2F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-0.8F, -2.8F, -0.2F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, -46.0F, -12.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData bottomframecorner = modelPartData.addChild("bottomframecorner", ModelPartBuilder.create().uv(2, 2).cuboid(10.2F, -2.0F, -12.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r16 = bottomframecorner.addChild("cube_r16", ModelPartBuilder.create().uv(2, 2).cuboid(-1.2F, -1.0F, -0.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -1.0F, -11.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bottomframecorner2 = modelPartData.addChild("bottomframecorner2", ModelPartBuilder.create().uv(2, 2).cuboid(10.2F, -2.0F, -12.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r17 = bottomframecorner2.addChild("cube_r17", ModelPartBuilder.create().uv(2, 2).cuboid(-1.2F, -1.0F, -0.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -1.0F, -11.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bottomframecorner3 = modelPartData.addChild("bottomframecorner3", ModelPartBuilder.create().uv(2, 2).cuboid(10.2F, -2.0F, -12.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r18 = bottomframecorner3.addChild("cube_r18", ModelPartBuilder.create().uv(2, 2).cuboid(-1.2F, -1.0F, -0.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -1.0F, -11.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bottomframecorner4 = modelPartData.addChild("bottomframecorner4", ModelPartBuilder.create().uv(2, 2).cuboid(10.2F, -2.0F, -12.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r19 = bottomframecorner4.addChild("cube_r19", ModelPartBuilder.create().uv(2, 2).cuboid(-1.2F, -1.0F, -0.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, -1.0F, -11.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData door1 = modelPartData.addChild("door1", ModelPartBuilder.create().uv(141, 118).cuboid(-8.025F, -16.0F, -0.475F, 8.0F, 35.0F, 1.0F, new Dilation(0.0F))
		.uv(194, 151).cuboid(-8.025F, -3.0F, -0.675F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(194, 151).cuboid(-7.025F, -2.0F, -0.675F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(194, 151).cuboid(-6.025F, -1.0F, -0.675F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(8.025F, 4.0F, -10.525F));

		ModelPartData door2 = modelPartData.addChild("door2", ModelPartBuilder.create().uv(167, 118).cuboid(-0.025F, -16.0F, -0.475F, 8.0F, 35.0F, 1.0F, new Dilation(0.0F))
		.uv(194, 151).cuboid(6.975F, -3.0F, -0.675F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
		.uv(194, 151).cuboid(5.975F, -2.0F, -0.675F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(194, 151).cuboid(4.975F, -1.0F, -0.675F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.975F, 4.0F, -10.525F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState animationDoorState) {
		return null;
	}

	@Override
	public void renderDoors(ClientTardis clientTardis, ExteriorBlockEntity exteriorBlockEntity, ModelPart modelPart, MatrixStack matrixStack, VertexConsumer vertexConsumer, int i, int i1, float v, float v1, float v2, float v3, boolean b) {

	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		floorroofceiling.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bone2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bone4.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bone3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bone5.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		doorframe.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		doorframe2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		topframecorner.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		topframecorner2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		topframecorner3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		topframecorner4.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bottomframecorner.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bottomframecorner2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bottomframecorner3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bottomframecorner4.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		door1.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		door2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return getTexturedModelData().createModel();
	}
}