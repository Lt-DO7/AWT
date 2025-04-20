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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class SteampunkExterior extends ExteriorModel {
	private final ModelPart shellframe;
	private final ModelPart frametop;
	private final ModelPart framebottom;
	private final ModelPart framecorners;
	private final ModelPart walls;
	private final ModelPart floorandroof;
	private final ModelPart pipes;
	private final ModelPart backpanelbolts;
	private final ModelPart cogs;
	private final ModelPart coga;
	private final ModelPart cogb;
	private final ModelPart cogc;
	private final ModelPart cogd;
	private final ModelPart lightpanelcovers;
	private final ModelPart cornernubs;
	private final ModelPart framecorners2;
	private final ModelPart framecorners3;
	private final ModelPart framecorners4;
	private final ModelPart framecorners5;
	private final ModelPart cornernubs2;
	private final ModelPart framecorners6;
	private final ModelPart framecorners7;
	private final ModelPart framecorners8;
	private final ModelPart framecorners9;
	private final ModelPart door;
	private final ModelPart doora;
	private final ModelPart doorb;
	private final ModelPart doorc;
	private final ModelPart doord;
	private final ModelPart doore;
	private final ModelPart doorf;
	private final ModelPart bulb;
	private final ModelPart mechanism;
	private final ModelPart bb_main;
	public SteampunkExterior () {
		this.shellframe = getTexturedModelData().createModel().getChild("shellframe");
		this.frametop = getTexturedModelData().createModel().getChild("frametop");
		this.framebottom = getTexturedModelData().createModel().getChild("framebottom");
		this.framecorners = getTexturedModelData().createModel().getChild("framecorners");
		this.walls = getTexturedModelData().createModel().getChild("walls");
		this.floorandroof = getTexturedModelData().createModel().getChild("floorandroof");
		this.pipes = getTexturedModelData().createModel().getChild("pipes");
		this.backpanelbolts = getTexturedModelData().createModel().getChild("backpanelbolts");
		this.cogs = getTexturedModelData().createModel().getChild("cogs");
		this.coga = getTexturedModelData().createModel().getChild("coga");
		this.cogb = getTexturedModelData().createModel().getChild("cogb");
		this.cogc = getTexturedModelData().createModel().getChild("cogc");
		this.cogd = getTexturedModelData().createModel().getChild("cogd");
		this.lightpanelcovers = getTexturedModelData().createModel().getChild("lightpanelcovers");
		this.cornernubs = getTexturedModelData().createModel().getChild("cornernubs");
		this.framecorners2 = getTexturedModelData().createModel().getChild("framecorners2");
		this.framecorners3 = getTexturedModelData().createModel().getChild("framecorners3");
		this.framecorners4 = getTexturedModelData().createModel().getChild("framecorners4");
		this.framecorners5 = getTexturedModelData().createModel().getChild("framecorners5");
		this.cornernubs2 = getTexturedModelData().createModel().getChild("cornernubs2");
		this.framecorners6 = getTexturedModelData().createModel().getChild("framecorners6");
		this.framecorners7 = getTexturedModelData().createModel().getChild("framecorners7");
		this.framecorners8 = getTexturedModelData().createModel().getChild("framecorners8");
		this.framecorners9 = getTexturedModelData().createModel().getChild("framecorners9");
		this.door = getTexturedModelData().createModel().getChild("door");
		this.doora = getTexturedModelData().createModel().getChild("doora");
		this.doorb = getTexturedModelData().createModel().getChild("doorb");
		this.doorc = getTexturedModelData().createModel().getChild("doorc");
		this.doord = getTexturedModelData().createModel().getChild("doord");
		this.doore = getTexturedModelData().createModel().getChild("doore");
		this.doorf = getTexturedModelData().createModel().getChild("doorf");
		this.bulb = getTexturedModelData().createModel().getChild("bulb");
		this.mechanism = getTexturedModelData().createModel().getChild("mechanism");
		this.bb_main = getTexturedModelData().createModel().getChild("bb_main");
	}



	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData shellframe = modelPartData.addChild("shellframe", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData frametop = shellframe.addChild("frametop", ModelPartBuilder.create().uv(48, 102).cuboid(-11.0F, -2.0F, -11.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(96, 102).cuboid(-11.0F, -2.0F, 9.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -42.0F, 0.0F));

		ModelPartData cube_r1 = frametop.addChild("cube_r1", ModelPartBuilder.create().uv(48, 106).cuboid(-11.0F, -2.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r2 = frametop.addChild("cube_r2", ModelPartBuilder.create().uv(0, 105).cuboid(-11.0F, -2.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData framebottom = shellframe.addChild("framebottom", ModelPartBuilder.create().uv(48, 102).cuboid(-11.0F, -1.0F, -11.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(96, 102).cuboid(-11.0F, -1.0F, 9.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		ModelPartData cube_r3 = framebottom.addChild("cube_r3", ModelPartBuilder.create().uv(48, 106).cuboid(-11.0F, -2.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, 1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r4 = framebottom.addChild("cube_r4", ModelPartBuilder.create().uv(0, 105).cuboid(-11.0F, -2.0F, -1.0F, 22.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, 1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData framecorners = shellframe.addChild("framecorners", ModelPartBuilder.create().uv(96, 106).cuboid(9.0F, -42.0F, -11.0F, 2.0F, 40.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r5 = framecorners.addChild("cube_r5", ModelPartBuilder.create().uv(96, 106).cuboid(9.0F, -40.0F, -11.0F, 2.0F, 40.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r6 = framecorners.addChild("cube_r6", ModelPartBuilder.create().uv(96, 106).cuboid(9.0F, -40.0F, -11.0F, 2.0F, 40.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r7 = framecorners.addChild("cube_r7", ModelPartBuilder.create().uv(96, 106).cuboid(9.0F, -40.0F, -11.0F, 2.0F, 40.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData walls = modelPartData.addChild("walls", ModelPartBuilder.create().uv(0, 56).cuboid(-9.0F, -42.0F, 9.0F, 18.0F, 40.0F, 1.0F, new Dilation(0.0F))
		.uv(110, 22).cuboid(-9.0F, -42.0F, -10.0F, 18.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r8 = walls.addChild("cube_r8", ModelPartBuilder.create().uv(72, 0).cuboid(-9.0F, -40.0F, 0.0F, 18.0F, 40.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r9 = walls.addChild("cube_r9", ModelPartBuilder.create().uv(38, 56).cuboid(-9.0F, -40.0F, 0.0F, 18.0F, 40.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData floorandroof = modelPartData.addChild("floorandroof", ModelPartBuilder.create().uv(0, 0).cuboid(-9.0F, -2.0F, -9.0F, 18.0F, 1.0F, 18.0F, new Dilation(0.0F))
		.uv(0, 19).cuboid(-9.0F, -43.0F, -9.0F, 18.0F, 1.0F, 18.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData pipes = modelPartData.addChild("pipes", ModelPartBuilder.create().uv(48, 110).cuboid(10.0F, -32.0F, 5.0F, 2.0F, 28.0F, 2.0F, new Dilation(0.0F))
		.uv(82, 110).cuboid(10.0F, -30.0F, -5.0F, 2.0F, 22.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 109).cuboid(10.0F, -6.0F, -7.0F, 2.0F, 2.0F, 14.0F, new Dilation(0.0F))
		.uv(110, 31).cuboid(10.0F, -30.0F, -5.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(110, 27).cuboid(-8.0F, -41.0F, -12.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(74, 110).cuboid(-12.0F, -40.0F, -8.0F, 2.0F, 24.0F, 2.0F, new Dilation(0.0F))
		.uv(191, 31).cuboid(4.0F, -47.0F, 4.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData backpanelbolts = modelPartData.addChild("backpanelbolts", ModelPartBuilder.create().uv(72, 41).cuboid(-8.0F, -5.0F, 11.4F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(72, 41).cuboid(6.0F, -5.0F, 11.4F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(72, 41).cuboid(6.0F, -32.0F, 11.4F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(72, 41).cuboid(-8.0F, -32.0F, 11.4F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, -1.0F));

		ModelPartData cogs = modelPartData.addChild("cogs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData coga = cogs.addChild("coga", ModelPartBuilder.create().uv(110, 0).cuboid(0.0F, -5.5F, -5.5F, 0.0F, 11.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(-10.5F, -8.5F, -2.5F));

		ModelPartData cogb = cogs.addChild("cogb", ModelPartBuilder.create().uv(110, 0).cuboid(0.0F, -5.5F, -5.5F, 0.0F, 11.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(-10.5F, -33.5F, 2.5F));

		ModelPartData cogc = cogs.addChild("cogc", ModelPartBuilder.create().uv(56, 110).cuboid(0.0F, -4.5F, -4.5F, 0.0F, 9.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(-10.5F, -16.5F, 3.5F));

		ModelPartData cogd = cogs.addChild("cogd", ModelPartBuilder.create().uv(56, 110).cuboid(0.0F, -4.5F, -4.5F, 0.0F, 9.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(-10.5F, -24.5F, 0.5F));

		ModelPartData lightpanelcovers = modelPartData.addChild("lightpanelcovers", ModelPartBuilder.create().uv(76, 72).cuboid(2.2F, 19.0F, -20.0F, 0.0F, 8.0F, 18.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -37.0F, 11.0F));

		ModelPartData cube_r10 = lightpanelcovers.addChild("cube_r10", ModelPartBuilder.create().uv(76, 72).cuboid(-0.8F, -8.0F, -1.0F, 0.0F, 8.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 27.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cornernubs = modelPartData.addChild("cornernubs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData framecorners2 = cornernubs.addChild("framecorners2", ModelPartBuilder.create().uv(159, 10).cuboid(9.2F, -1.8F, -11.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(176, 12).cuboid(9.7F, -1.3F, -11.3F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r11 = framecorners2.addChild("cube_r11", ModelPartBuilder.create().uv(176, 12).cuboid(-0.4F, -0.5F, 0.9F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.2F, -0.8F, -10.3F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r12 = framecorners2.addChild("cube_r12", ModelPartBuilder.create().uv(176, 12).cuboid(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(10.2F, 0.2F, -10.3F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r13 = framecorners2.addChild("cube_r13", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, 0.0F, -0.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, 0.0F, -10.0F, 0.0F, -1.5708F, 1.5708F));

		ModelPartData cube_r14 = framecorners2.addChild("cube_r14", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, -0.8F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, -1.0F, -10.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData framecorners3 = cornernubs.addChild("framecorners3", ModelPartBuilder.create().uv(159, 10).cuboid(9.2F, -1.8F, -11.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(176, 12).cuboid(9.7F, -1.3F, -11.3F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r15 = framecorners3.addChild("cube_r15", ModelPartBuilder.create().uv(176, 12).cuboid(-0.4F, -0.5F, 0.9F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.2F, -0.8F, -10.3F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r16 = framecorners3.addChild("cube_r16", ModelPartBuilder.create().uv(176, 12).cuboid(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(10.2F, 0.2F, -10.3F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r17 = framecorners3.addChild("cube_r17", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, 0.0F, -0.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, 0.0F, -10.0F, 0.0F, -1.5708F, 1.5708F));

		ModelPartData cube_r18 = framecorners3.addChild("cube_r18", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, -0.8F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, -1.0F, -10.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData framecorners4 = cornernubs.addChild("framecorners4", ModelPartBuilder.create().uv(159, 10).cuboid(9.2F, -1.8F, -11.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(176, 12).cuboid(9.7F, -1.3F, -11.3F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r19 = framecorners4.addChild("cube_r19", ModelPartBuilder.create().uv(176, 12).cuboid(-0.4F, -0.5F, 0.9F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.2F, -0.8F, -10.3F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r20 = framecorners4.addChild("cube_r20", ModelPartBuilder.create().uv(176, 12).cuboid(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(10.2F, 0.2F, -10.3F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r21 = framecorners4.addChild("cube_r21", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, 0.0F, -0.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, 0.0F, -10.0F, 0.0F, -1.5708F, 1.5708F));

		ModelPartData cube_r22 = framecorners4.addChild("cube_r22", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, -0.8F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, -1.0F, -10.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData framecorners5 = cornernubs.addChild("framecorners5", ModelPartBuilder.create().uv(159, 10).cuboid(9.2F, -1.8F, -11.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(176, 12).cuboid(9.7F, -1.3F, -11.3F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r23 = framecorners5.addChild("cube_r23", ModelPartBuilder.create().uv(176, 12).cuboid(-0.4F, -0.5F, 0.9F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.2F, -0.8F, -10.3F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r24 = framecorners5.addChild("cube_r24", ModelPartBuilder.create().uv(176, 12).cuboid(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(10.2F, 0.2F, -10.3F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r25 = framecorners5.addChild("cube_r25", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, 0.0F, -0.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, 0.0F, -10.0F, 0.0F, -1.5708F, 1.5708F));

		ModelPartData cube_r26 = framecorners5.addChild("cube_r26", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, -0.8F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, -1.0F, -10.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cornernubs2 = modelPartData.addChild("cornernubs2", ModelPartBuilder.create(), ModelTransform.of(0.0F, -20.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		ModelPartData framecorners6 = cornernubs2.addChild("framecorners6", ModelPartBuilder.create().uv(159, 10).cuboid(9.2F, -1.8F, -11.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(176, 12).cuboid(9.7F, -1.3F, -11.3F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r27 = framecorners6.addChild("cube_r27", ModelPartBuilder.create().uv(176, 12).cuboid(-0.4F, -0.5F, 0.9F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.2F, -0.8F, -10.3F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r28 = framecorners6.addChild("cube_r28", ModelPartBuilder.create().uv(176, 12).cuboid(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(10.2F, 0.2F, -10.3F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r29 = framecorners6.addChild("cube_r29", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, 0.0F, -0.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, 0.0F, -10.0F, 0.0F, -1.5708F, 1.5708F));

		ModelPartData cube_r30 = framecorners6.addChild("cube_r30", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, -0.8F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, -1.0F, -10.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData framecorners7 = cornernubs2.addChild("framecorners7", ModelPartBuilder.create().uv(159, 10).cuboid(9.2F, -1.8F, -11.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(176, 12).cuboid(9.7F, -1.3F, -11.3F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r31 = framecorners7.addChild("cube_r31", ModelPartBuilder.create().uv(176, 12).cuboid(-0.4F, -0.5F, 0.9F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.2F, -0.8F, -10.3F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r32 = framecorners7.addChild("cube_r32", ModelPartBuilder.create().uv(176, 12).cuboid(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(10.2F, 0.2F, -10.3F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r33 = framecorners7.addChild("cube_r33", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, 0.0F, -0.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, 0.0F, -10.0F, 0.0F, -1.5708F, 1.5708F));

		ModelPartData cube_r34 = framecorners7.addChild("cube_r34", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, -0.8F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, -1.0F, -10.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData framecorners8 = cornernubs2.addChild("framecorners8", ModelPartBuilder.create().uv(159, 10).cuboid(9.2F, -1.8F, -11.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(176, 12).cuboid(9.7F, -1.3F, -11.3F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r35 = framecorners8.addChild("cube_r35", ModelPartBuilder.create().uv(176, 12).cuboid(-0.4F, -0.5F, 0.9F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.2F, -0.8F, -10.3F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r36 = framecorners8.addChild("cube_r36", ModelPartBuilder.create().uv(176, 12).cuboid(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(10.2F, 0.2F, -10.3F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r37 = framecorners8.addChild("cube_r37", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, 0.0F, -0.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, 0.0F, -10.0F, 0.0F, -1.5708F, 1.5708F));

		ModelPartData cube_r38 = framecorners8.addChild("cube_r38", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, -0.8F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, -1.0F, -10.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData framecorners9 = cornernubs2.addChild("framecorners9", ModelPartBuilder.create().uv(159, 10).cuboid(9.2F, -1.8F, -11.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(176, 12).cuboid(9.7F, -1.3F, -11.3F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r39 = framecorners9.addChild("cube_r39", ModelPartBuilder.create().uv(176, 12).cuboid(-0.4F, -0.5F, 0.9F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(12.2F, -0.8F, -10.3F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r40 = framecorners9.addChild("cube_r40", ModelPartBuilder.create().uv(176, 12).cuboid(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(10.2F, 0.2F, -10.3F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r41 = framecorners9.addChild("cube_r41", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, 0.0F, -0.2F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, 0.0F, -10.0F, 0.0F, -1.5708F, 1.5708F));

		ModelPartData cube_r42 = framecorners9.addChild("cube_r42", ModelPartBuilder.create().uv(159, 10).cuboid(-1.2F, -0.8F, 0.0F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(11.2F, -1.0F, -10.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData door = modelPartData.addChild("door", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 4.0F, -9.5F));

		ModelPartData doora = door.addChild("doora", ModelPartBuilder.create().uv(3, 153).cuboid(-1.5F, -18.0F, -0.5F, 3.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.5F, 0.0F, 0.0F));

		ModelPartData doorb = door.addChild("doorb", ModelPartBuilder.create().uv(18, 153).cuboid(-1.5F, -18.0F, -0.5F, 3.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.5F, 0.0F, 0.0F));

		ModelPartData doorc = door.addChild("doorc", ModelPartBuilder.create().uv(33, 154).cuboid(-1.5F, -18.0F, -0.5F, 3.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, 0.0F, 0.0F));

		ModelPartData doord = door.addChild("doord", ModelPartBuilder.create().uv(49, 153).cuboid(-1.5F, -18.0F, -0.5F, 3.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, 0.0F, 0.0F));

		ModelPartData doore = door.addChild("doore", ModelPartBuilder.create().uv(64, 153).cuboid(-1.5F, -18.0F, -0.5F, 3.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.5F, 0.0F, 0.0F));

		ModelPartData doorf = door.addChild("doorf", ModelPartBuilder.create().uv(79, 153).cuboid(-1.5F, -18.0F, -0.5F, 3.0F, 36.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-7.5F, 0.0F, 0.0F));

		ModelPartData bulb = modelPartData.addChild("bulb", ModelPartBuilder.create().uv(163, 30).cuboid(-2.0F, -44.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r43 = bulb.addChild("cube_r43", ModelPartBuilder.create().uv(192, 7).cuboid(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -44.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData mechanism = modelPartData.addChild("mechanism", ModelPartBuilder.create().uv(148, 44).cuboid(-9.0F, -0.6F, -9.0F, 18.0F, 0.0F, 18.0F, new Dilation(0.0F))
		.uv(148, 67).cuboid(-9.0F, -0.8F, -9.0F, 18.0F, 0.0F, 18.0F, new Dilation(0.0F))
		.uv(150, 90).cuboid(-8.5F, -0.4F, -8.5F, 17.0F, 0.0F, 17.0F, new Dilation(0.0F))
		.uv(149, 110).cuboid(-8.5F, -0.5F, -8.5F, 17.0F, 0.0F, 17.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 38).cuboid(-9.0F, -43.3F, -9.0F, 18.0F, 0.0F, 18.0F, new Dilation(0.0F))
		.uv(76, 41).cuboid(-9.0F, -33.0F, 10.2F, 18.0F, 31.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
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
		shellframe.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		walls.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		floorandroof.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		pipes.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		backpanelbolts.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		cogs.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		lightpanelcovers.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		cornernubs.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		cornernubs2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		door.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bulb.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		mechanism.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return null;
	}
}