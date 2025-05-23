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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class policebox extends ExteriorModel {
	private final ModelPart tardis;
	private final ModelPart lantern;
	private final ModelPart bulb;
	private final ModelPart lanternbase;
	private final ModelPart roof;
	private final ModelPart doors;
	private final ModelPart left;
	private final ModelPart door;
	private final ModelPart right2;
	private final ModelPart base;
	private final ModelPart PCB;
	private final ModelPart posts;
	private final ModelPart wall;
	private final ModelPart right;
	private final ModelPart back;
	private final ModelPart left2;
	public policebox(ModelPart root) {
		this.tardis = root.getChild("tardis");
		this.lantern = this.tardis.getChild("lantern");
		this.bulb = this.lantern.getChild("bulb");
		this.lanternbase = this.lantern.getChild("lanternbase");
		this.roof = this.tardis.getChild("roof");
		this.doors = this.tardis.getChild("doors");
		this.left = this.doors.getChild("left");
		this.door = this.left.getChild("door");
		this.right2 = this.doors.getChild("right2");
		this.base = this.tardis.getChild("base");
		this.PCB = this.tardis.getChild("PCB");
		this.posts = this.tardis.getChild("posts");
		this.wall = this.tardis.getChild("wall");
		this.right = this.wall.getChild("right");
		this.back = this.wall.getChild("back");
		this.left2 = this.wall.getChild("left2");
	}

	public policebox() {
			this(getTexturedModelData().createModel());
		}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData tardis = modelPartData.addChild("tardis", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData lantern = tardis.addChild("lantern", ModelPartBuilder.create().uv(236, 129).cuboid(0.1258F, 2.9706F, 2.9102F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(236, 149).cuboid(0.1258F, 2.9706F, -1.9183F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(236, 235).cuboid(3.54F, 2.9706F, -0.504F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(144, 237).cuboid(-1.2884F, 2.9706F, -0.504F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(238, 112).cuboid(2.8187F, 2.6706F, -0.5111F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(126, 235).cuboid(0.1045F, 2.4706F, -0.5111F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(238, 116).cuboid(-0.5955F, 2.6706F, -0.5111F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(240, 60).cuboid(0.1116F, 2.6706F, -1.2182F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(240, 185).cuboid(0.1116F, 2.6706F, 2.196F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.7F, -60.0F, -0.6F));

		ModelPartData cube_r1 = lantern.addChild("cube_r1", ModelPartBuilder.create().uv(102, 68).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.0813F, 4.9706F, 3.4031F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r2 = lantern.addChild("cube_r2", ModelPartBuilder.create().uv(186, 71).cuboid(-2.0F, -1.0F, -1.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.04F, 4.9706F, 0.696F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r3 = lantern.addChild("cube_r3", ModelPartBuilder.create().uv(184, 71).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.6258F, 4.9706F, -0.7182F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r4 = lantern.addChild("cube_r4", ModelPartBuilder.create().uv(104, 68).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.04F, 4.9706F, 2.696F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r5 = lantern.addChild("cube_r5", ModelPartBuilder.create().uv(242, 4).cuboid(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.8329F, 4.9706F, -1.2111F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r6 = lantern.addChild("cube_r6", ModelPartBuilder.create().uv(218, 131).cuboid(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.54F, 4.9706F, 2.496F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r7 = lantern.addChild("cube_r7", ModelPartBuilder.create().uv(160, 228).cuboid(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.5955F, 4.6706F, -0.5111F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r8 = lantern.addChild("cube_r8", ModelPartBuilder.create().uv(226, 196).cuboid(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.4045F, 4.6706F, -0.5111F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r9 = lantern.addChild("cube_r9", ModelPartBuilder.create().uv(160, 232).cuboid(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.5955F, 4.6706F, 2.4889F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r10 = lantern.addChild("cube_r10", ModelPartBuilder.create().uv(160, 230).cuboid(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.4045F, 4.6706F, 2.4889F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r11 = lantern.addChild("cube_r11", ModelPartBuilder.create().uv(242, 6).cuboid(0.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.4187F, 4.9706F, -1.2111F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r12 = lantern.addChild("cube_r12", ModelPartBuilder.create().uv(242, 12).cuboid(0.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.2884F, 4.9706F, 2.496F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bulb = lantern.addChild("bulb", ModelPartBuilder.create().uv(28, 236).cuboid(-0.5813F, -3.0294F, -1.9253F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 236).cuboid(-0.5813F, -3.0294F, 1.9031F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 233).cuboid(-1.9955F, -3.0294F, -0.5111F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(138, 235).cuboid(1.8329F, -3.0294F, -0.5111F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.2F, 7.0F, 0.5F));

		ModelPartData cube_r13 = bulb.addChild("cube_r13", ModelPartBuilder.create().uv(52, 236).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.1258F, -2.0294F, 2.196F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r14 = bulb.addChild("cube_r14", ModelPartBuilder.create().uv(34, 236).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.5813F, -2.0294F, -0.5111F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r15 = bulb.addChild("cube_r15", ModelPartBuilder.create().uv(46, 236).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.9955F, -2.0294F, 1.4889F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r16 = bulb.addChild("cube_r16", ModelPartBuilder.create().uv(40, 236).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.7116F, -2.0294F, -1.2182F, 0.0F, -0.7854F, 0.0F));

		ModelPartData lanternbase = lantern.addChild("lanternbase", ModelPartBuilder.create().uv(90, 236).cuboid(0.1258F, 2.8706F, 2.6102F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(100, 236).cuboid(0.1258F, 2.8706F, -2.6325F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(160, 235).cuboid(3.2471F, 2.8706F, -0.5111F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(170, 235).cuboid(-1.9955F, 2.8706F, -0.5111F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

		ModelPartData cube_r17 = lanternbase.addChild("cube_r17", ModelPartBuilder.create().uv(236, 146).cuboid(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.5813F, 4.9706F, 3.9031F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r18 = lanternbase.addChild("cube_r18", ModelPartBuilder.create().uv(236, 143).cuboid(-3.0F, -2.0F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.54F, 4.9706F, 0.196F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r19 = lanternbase.addChild("cube_r19", ModelPartBuilder.create().uv(236, 126).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(224, 18).cuboid(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.1258F, 4.9706F, -1.2182F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r20 = lanternbase.addChild("cube_r20", ModelPartBuilder.create().uv(236, 123).cuboid(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.54F, 4.9706F, 3.196F, 0.0F, 0.7854F, 0.0F));

		ModelPartData roof = tardis.addChild("roof", ModelPartBuilder.create().uv(0, 31).cuboid(-13.5813F, -1.3F, -12.5187F, 27.0F, 2.0F, 26.0F, new Dilation(0.0F))
		.uv(66, 217).cuboid(-12.2349F, -2.9145F, -11.8651F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(204, 236).cuboid(9.7651F, -2.9145F, -11.8651F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(212, 236).cuboid(9.7651F, -2.9145F, 10.1349F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(236, 219).cuboid(-12.2349F, -2.9145F, 10.1349F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 84).cuboid(-11.5813F, -3.0F, -11.4187F, 23.0F, 2.0F, 23.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -47.2F, 0.1F));

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

		ModelPartData cube_r21 = left.addChild("cube_r21", ModelPartBuilder.create().uv(110, 233).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -41.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r22 = left.addChild("cube_r22", ModelPartBuilder.create().uv(136, 239).cuboid(-1.0F, -8.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(166, 174).cuboid(-1.0F, 12.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(134, 239).cuboid(-1.0F, 22.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(11.2078F, -34.7F, 11.3078F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r23 = left.addChild("cube_r23", ModelPartBuilder.create().uv(232, 37).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -37.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r24 = left.addChild("cube_r24", ModelPartBuilder.create().uv(234, 168).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -33.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r25 = left.addChild("cube_r25", ModelPartBuilder.create().uv(114, 236).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.8F, -34.7F, 12.0142F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r26 = left.addChild("cube_r26", ModelPartBuilder.create().uv(110, 236).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.2F, -34.7F, 12.0142F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r27 = left.addChild("cube_r27", ModelPartBuilder.create().uv(22, 241).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(224, 131).cuboid(-1.0F, 12.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(20, 241).cuboid(-1.0F, 22.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -34.7F, 12.0142F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r28 = left.addChild("cube_r28", ModelPartBuilder.create().uv(0, 233).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -21.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r29 = left.addChild("cube_r29", ModelPartBuilder.create().uv(234, 167).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -13.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r30 = left.addChild("cube_r30", ModelPartBuilder.create().uv(232, 43).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -11.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r31 = left.addChild("cube_r31", ModelPartBuilder.create().uv(234, 166).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -3.9929F, 11.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData door = left.addChild("door", ModelPartBuilder.create().uv(216, 160).cuboid(0.0F, -4.0F, -1.0F, 8.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(164, 210).cuboid(1.0F, -3.5F, -1.2F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
		.uv(172, 23).cuboid(7.0F, -0.3F, -1.6F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(180, 235).cuboid(1.5F, -3.0F, 0.0F, 3.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(152, 237).cuboid(1.5F, -1.0F, 1.0F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(150, 241).cuboid(4.2F, -2.9F, -0.1F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, -28.7F, 11.9F));

		ModelPartData cube_r32 = door.addChild("cube_r32", ModelPartBuilder.create().uv(156, 241).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.1858F, -1.0F, 2.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r33 = door.addChild("cube_r33", ModelPartBuilder.create().uv(242, 14).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.7858F, -1.0F, 2.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r34 = door.addChild("cube_r34", ModelPartBuilder.create().uv(180, 241).cuboid(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.3566F, 0.6373F, 0.8F, 0.0F, 0.0F, 1.0036F));

		ModelPartData cube_r35 = door.addChild("cube_r35", ModelPartBuilder.create().uv(242, 10).cuboid(0.0F, -3.0F, -2.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 5.2355F, -2.3071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r36 = door.addChild("cube_r36", ModelPartBuilder.create().uv(242, 8).cuboid(0.0F, -3.0F, -2.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.4078F, 1.9362F, 0.7854F, 0.0F, 0.0F));

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

		ModelPartData cube_r37 = right2.addChild("cube_r37", ModelPartBuilder.create().uv(242, 2).cuboid(0.0F, -3.0F, -2.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -23.4645F, -15.0071F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r38 = right2.addChild("cube_r38", ModelPartBuilder.create().uv(242, 0).cuboid(0.0F, -3.0F, -2.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -28.2922F, -10.7638F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r39 = right2.addChild("cube_r39", ModelPartBuilder.create().uv(240, 0).cuboid(-1.0F, -8.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 175).cuboid(-1.0F, -18.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(178, 239).cuboid(-1.0F, -28.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(176, 239).cuboid(-1.0F, -38.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.2078F, -4.7F, -12.6922F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r40 = right2.addChild("cube_r40", ModelPartBuilder.create().uv(84, 235).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -3.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r41 = right2.addChild("cube_r41", ModelPartBuilder.create().uv(84, 234).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -11.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r42 = right2.addChild("cube_r42", ModelPartBuilder.create().uv(196, 236).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.2F, -34.7F, -11.9858F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r43 = right2.addChild("cube_r43", ModelPartBuilder.create().uv(232, 39).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -37.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r44 = right2.addChild("cube_r44", ModelPartBuilder.create().uv(200, 236).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.8F, -34.7F, -11.9858F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r45 = right2.addChild("cube_r45", ModelPartBuilder.create().uv(148, 241).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 9).cuboid(-1.0F, -18.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(146, 241).cuboid(-1.0F, -28.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(144, 241).cuboid(-1.0F, -38.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, -4.7F, -11.9858F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r46 = right2.addChild("cube_r46", ModelPartBuilder.create().uv(44, 235).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -13.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r47 = right2.addChild("cube_r47", ModelPartBuilder.create().uv(46, 234).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -21.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r48 = right2.addChild("cube_r48", ModelPartBuilder.create().uv(28, 235).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -23.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r49 = right2.addChild("cube_r49", ModelPartBuilder.create().uv(28, 234).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -31.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r50 = right2.addChild("cube_r50", ModelPartBuilder.create().uv(0, 234).cuboid(-1.0F, 0.0F, -1.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -41.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r51 = right2.addChild("cube_r51", ModelPartBuilder.create().uv(0, 235).cuboid(-1.0F, -1.0F, -1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, -33.9929F, -12.6929F, -0.7854F, 0.0F, 0.0F));

		ModelPartData base = tardis.addChild("base", ModelPartBuilder.create().uv(0, 0).cuboid(-14.7813F, -2.0F, -14.2187F, 29.0F, 2.0F, 29.0F, new Dilation(0.0F))
		.uv(10, 5).cuboid(-11.5813F, -2.7F, -12.9187F, 23.0F, 1.0F, 24.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r52 = base.addChild("cube_r52", ModelPartBuilder.create().uv(76, 150).cuboid(0.0F, -2.0F, -21.0F, 1.0F, 1.0F, 22.0F, new Dilation(0.0F)), ModelTransform.of(11.458F, -1.3074F, 10.2349F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r53 = base.addChild("cube_r53", ModelPartBuilder.create().uv(122, 151).cuboid(0.0F, -2.0F, -21.0F, 1.0F, 1.0F, 22.0F, new Dilation(0.0F)), ModelTransform.of(-14.842F, -1.3074F, 10.2349F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r54 = base.addChild("cube_r54", ModelPartBuilder.create().uv(94, 82).cuboid(-21.0F, -1.0F, -1.0F, 22.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(9.7651F, -2.0145F, 14.1349F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r55 = base.addChild("cube_r55", ModelPartBuilder.create().uv(156, 65).cuboid(-21.0F, -1.0F, -1.0F, 22.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(9.7651F, -2.0145F, -12.2651F, 0.7854F, 0.0F, 0.0F));

		ModelPartData PCB = tardis.addChild("PCB", ModelPartBuilder.create().uv(156, 30).cuboid(-13.7349F, -40.785F, -14.2651F, 27.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(156, 35).cuboid(-13.7349F, -40.785F, 12.7349F, 27.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -6.6536F, 0.0F));

		ModelPartData cube_r56 = PCB.addChild("cube_r56", ModelPartBuilder.create().uv(156, 40).cuboid(-11.1115F, -38.8705F, -12.4187F, 27.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.3162F, -1.8825F, 2.6235F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r57 = PCB.addChild("cube_r57", ModelPartBuilder.create().uv(116, 25).cuboid(-11.1115F, -38.8705F, -12.4187F, 27.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(24.6838F, -1.8825F, 2.6235F, 0.0F, 1.5708F, 0.0F));

		ModelPartData posts = tardis.addChild("posts", ModelPartBuilder.create(), ModelTransform.pivot(-23.0F, 1.0F, -2.0F));

		ModelPartData cube_r58 = posts.addChild("cube_r58", ModelPartBuilder.create().uv(62, 154).cuboid(-11.7651F, -48.6145F, -11.7651F, 3.0F, 46.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.1F, 0.0F, -0.1F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r59 = posts.addChild("cube_r59", ModelPartBuilder.create().uv(168, 151).cuboid(-11.7651F, -48.6145F, -11.7651F, 3.0F, 46.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(25.1F, 0.0F, 25.1F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r60 = posts.addChild("cube_r60", ModelPartBuilder.create().uv(74, 173).cuboid(-11.7651F, -48.6145F, -11.7651F, 3.0F, 46.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.1F, 0.0F, 25.1F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r61 = posts.addChild("cube_r61", ModelPartBuilder.create().uv(50, 154).cuboid(-11.7651F, -48.6145F, -11.7651F, 3.0F, 46.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(25.1F, 0.0F, -0.1F, 0.0F, -1.5708F, 0.0F));

		ModelPartData wall = tardis.addChild("wall", ModelPartBuilder.create(), ModelTransform.pivot(11.9F, -2.0F, -2.5F));

		ModelPartData right = wall.addChild("right", ModelPartBuilder.create().uv(0, 109).cuboid(4.0F, -43.0F, -9.0F, 2.0F, 43.0F, 23.0F, new Dilation(0.0F))
		.uv(142, 101).cuboid(5.6F, -2.7F, -8.5F, 1.0F, 2.0F, 23.0F, new Dilation(0.0F))
		.uv(142, 126).cuboid(5.6F, -42.7F, -8.5F, 1.0F, 2.0F, 23.0F, new Dilation(0.0F))
		.uv(212, 209).cuboid(5.6F, -32.7F, -6.5F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(212, 199).cuboid(5.6F, -32.7F, 4.5F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(98, 194).cuboid(5.6F, -40.7F, 12.5F, 1.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(146, 210).cuboid(5.6F, -22.7F, 4.5F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(194, 208).cuboid(5.6F, -22.7F, -6.5F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(92, 194).cuboid(5.6F, -40.7F, -8.5F, 1.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(208, 189).cuboid(5.6F, -12.7F, -6.5F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(176, 208).cuboid(5.6F, -12.7F, 4.5F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(44, 175).cuboid(5.8993F, -42.7007F, 2.5F, 1.0F, 43.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 109).cuboid(5.6F, -40.7F, 1.5F, 1.0F, 38.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 0.0F, 0.0F));

		ModelPartData cube_r62 = right.addChild("cube_r62", ModelPartBuilder.create().uv(0, 236).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.6135F, -32.7007F, 9.8F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r63 = right.addChild("cube_r63", ModelPartBuilder.create().uv(232, 235).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.6135F, -32.7007F, 7.2F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r64 = right.addChild("cube_r64", ModelPartBuilder.create().uv(216, 151).cuboid(-1.0F, -1.0F, -7.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(214, 35).cuboid(-1.0F, -1.0F, -18.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(5.9071F, -35.9929F, 11.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r65 = right.addChild("cube_r65", ModelPartBuilder.create().uv(228, 235).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.6135F, -32.7007F, -3.8F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r66 = right.addChild("cube_r66", ModelPartBuilder.create().uv(192, 235).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.6135F, -32.7007F, -1.2F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r67 = right.addChild("cube_r67", ModelPartBuilder.create().uv(222, 80).cuboid(-1.0F, -2.0F, -1.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(222, 88).cuboid(-1.0F, -2.0F, -12.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(5.1858F, -21.2858F, 5.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r68 = right.addChild("cube_r68", ModelPartBuilder.create().uv(96, 239).cuboid(1.0F, -8.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 239).cuboid(1.0F, -18.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(94, 239).cuboid(1.0F, 2.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 236).cuboid(1.0F, 12.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.1865F, -22.7007F, 12.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r69 = right.addChild("cube_r69", ModelPartBuilder.create().uv(226, 187).cuboid(0.0F, -2.0F, -1.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(196, 227).cuboid(0.0F, -2.0F, -12.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(5.1865F, -29.2865F, 5.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r70 = right.addChild("cube_r70", ModelPartBuilder.create().uv(208, 240).cuboid(-1.0F, -8.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(214, 240).cuboid(-1.0F, -18.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(206, 240).cuboid(-1.0F, 2.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 177).cuboid(-1.0F, 12.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.8929F, -22.7007F, 3.7922F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r71 = right.addChild("cube_r71", ModelPartBuilder.create().uv(98, 239).cuboid(1.0F, -8.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(100, 239).cuboid(1.0F, -18.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 239).cuboid(1.0F, 2.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 239).cuboid(1.0F, 12.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.1865F, -22.7007F, 1.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r72 = right.addChild("cube_r72", ModelPartBuilder.create().uv(210, 240).cuboid(-1.0F, -8.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(212, 240).cuboid(-1.0F, -18.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(204, 240).cuboid(-1.0F, 2.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 169).cuboid(-1.0F, 12.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.8929F, -22.7007F, -7.2078F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r73 = right.addChild("cube_r73", ModelPartBuilder.create().uv(212, 227).cuboid(0.0F, -2.0F, -1.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(144, 228).cuboid(0.0F, -2.0F, 10.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(5.1865F, -39.2865F, -5.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r74 = right.addChild("cube_r74", ModelPartBuilder.create().uv(222, 96).cuboid(-1.0F, -2.0F, -1.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(222, 104).cuboid(-1.0F, -2.0F, 10.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(5.1858F, -31.2858F, -5.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r75 = right.addChild("cube_r75", ModelPartBuilder.create().uv(164, 226).cuboid(0.0F, -2.0F, -1.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(180, 226).cuboid(0.0F, -2.0F, 10.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(5.1865F, -19.2865F, -5.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r76 = right.addChild("cube_r76", ModelPartBuilder.create().uv(222, 64).cuboid(-1.0F, -2.0F, -1.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(222, 72).cuboid(-1.0F, -2.0F, 10.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(5.1858F, -11.2858F, -5.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r77 = right.addChild("cube_r77", ModelPartBuilder.create().uv(52, 222).cuboid(-1.0F, -2.0F, -1.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(34, 222).cuboid(-1.0F, -2.0F, -12.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(5.1858F, -1.2858F, 5.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r78 = right.addChild("cube_r78", ModelPartBuilder.create().uv(226, 131).cuboid(0.0F, -2.0F, -1.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(128, 226).cuboid(0.0F, -2.0F, -12.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(5.1865F, -9.2865F, 5.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData back = wall.addChild("back", ModelPartBuilder.create().uv(106, 31).cuboid(-23.4F, -43.0F, 13.9F, 23.0F, 43.0F, 2.0F, new Dilation(0.0F))
		.uv(94, 76).cuboid(-23.4F, -2.7F, 15.4F, 23.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(226, 140).cuboid(-10.4F, -12.7F, 15.4F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(230, 216).cuboid(-21.4F, -12.7F, 15.4F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(232, 26).cuboid(-21.4F, -22.7F, 15.4F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(54, 231).cuboid(-10.4F, -22.7F, 15.4F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(232, 32).cuboid(-21.4F, -32.7F, 15.4F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(232, 29).cuboid(-10.4F, -32.7F, 15.4F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(94, 79).cuboid(-23.4F, -42.7F, 15.4F, 23.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(110, 194).cuboid(-23.4F, -40.7F, 15.4F, 2.0F, 38.0F, 1.0F, new Dilation(0.0F))
		.uv(116, 194).cuboid(-2.4F, -40.7F, 15.4F, 2.0F, 38.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 193).cuboid(-13.4F, -40.7F, 15.4F, 3.0F, 38.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 175).cuboid(-12.4F, -44.7F, 15.7F, 1.0F, 45.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 193).cuboid(-13.4F, -40.7F, 14.4F, 3.0F, 38.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r79 = back.addChild("cube_r79", ModelPartBuilder.create().uv(12, 236).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-18.8F, -32.7F, 14.9858F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r80 = back.addChild("cube_r80", ModelPartBuilder.create().uv(24, 236).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-16.0F, -32.7F, 14.9858F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r81 = back.addChild("cube_r81", ModelPartBuilder.create().uv(232, 35).cuboid(-1.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(224, 62).cuboid(10.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-20.4F, -35.9922F, 15.6922F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r82 = back.addChild("cube_r82", ModelPartBuilder.create().uv(8, 236).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-7.8F, -32.7F, 14.9858F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r83 = back.addChild("cube_r83", ModelPartBuilder.create().uv(4, 236).cuboid(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -32.7F, 14.9858F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r84 = back.addChild("cube_r84", ModelPartBuilder.create().uv(134, 30).cuboid(-1.0F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(122, 150).cuboid(-12.0F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(116, 30).cuboid(-1.0F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.4F, -9.9929F, 15.6929F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r85 = back.addChild("cube_r85", ModelPartBuilder.create().uv(106, 239).cuboid(0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(74, 163).cuboid(0.0F, -28.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(130, 239).cuboid(0.0F, -38.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(126, 239).cuboid(0.0F, -18.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 239).cuboid(0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.6929F, -2.7F, 15.6929F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r86 = back.addChild("cube_r86", ModelPartBuilder.create().uv(8, 232).cuboid(-1.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(234, 159).cuboid(-12.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(54, 230).cuboid(-1.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-9.4F, -1.9922F, 15.6922F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r87 = back.addChild("cube_r87", ModelPartBuilder.create().uv(218, 240).cuboid(-1.0F, -8.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(178, 200).cuboid(-1.0F, -28.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(226, 240).cuboid(-1.0F, -38.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(222, 240).cuboid(-1.0F, -18.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(216, 240).cuboid(-1.0F, -8.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.6922F, -2.7F, 15.6922F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r88 = back.addChild("cube_r88", ModelPartBuilder.create().uv(202, 66).cuboid(-1.0F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(206, 22).cuboid(10.0F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-20.4F, -29.9929F, 15.6929F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r89 = back.addChild("cube_r89", ModelPartBuilder.create().uv(74, 154).cuboid(0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(132, 239).cuboid(0.0F, -18.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(128, 239).cuboid(0.0F, 2.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(108, 239).cuboid(0.0F, 12.0F, 0.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-20.6929F, -22.7F, 15.6929F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r90 = back.addChild("cube_r90", ModelPartBuilder.create().uv(176, 200).cuboid(-1.0F, -8.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(18, 241).cuboid(-1.0F, -18.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(224, 240).cuboid(-1.0F, 2.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(220, 240).cuboid(-1.0F, 12.0F, 1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-12.6922F, -22.7F, 15.6922F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r91 = back.addChild("cube_r91", ModelPartBuilder.create().uv(234, 162).cuboid(-1.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(234, 163).cuboid(10.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-20.4F, -21.9922F, 15.6922F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r92 = back.addChild("cube_r92", ModelPartBuilder.create().uv(232, 41).cuboid(-1.0F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(232, 42).cuboid(-12.0F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.4F, -39.9929F, 15.6929F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r93 = back.addChild("cube_r93", ModelPartBuilder.create().uv(234, 164).cuboid(-1.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(234, 165).cuboid(-12.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-9.4F, -31.9922F, 15.6922F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r94 = back.addChild("cube_r94", ModelPartBuilder.create().uv(86, 173).cuboid(-1.0F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 173).cuboid(-12.0F, 0.0F, 0.0F, 8.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.4F, -19.9929F, 15.6929F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r95 = back.addChild("cube_r95", ModelPartBuilder.create().uv(234, 160).cuboid(-1.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F))
		.uv(234, 161).cuboid(-12.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-9.4F, -11.9922F, 15.6922F, 0.7854F, 0.0F, 0.0F));

		ModelPartData left2 = wall.addChild("left2", ModelPartBuilder.create().uv(92, 84).cuboid(-25.3F, -43.0F, -9.0F, 2.0F, 43.0F, 23.0F, new Dilation(0.0F))
		.uv(142, 76).cuboid(-25.8F, -2.7F, -8.5F, 1.0F, 2.0F, 23.0F, new Dilation(0.0F))
		.uv(48, 203).cuboid(-25.8F, -12.7F, -6.5F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(206, 0).cuboid(-25.8F, -22.7F, -6.5F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(206, 10).cuboid(-25.8F, -22.7F, 4.5F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(206, 169).cuboid(-25.8F, -32.7F, -6.5F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(206, 179).cuboid(-25.8F, -32.7F, 4.5F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(128, 208).cuboid(-25.8F, -12.7F, 4.5F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(76, 109).cuboid(-25.8F, -40.7F, 1.5F, 1.0F, 38.0F, 3.0F, new Dilation(0.0F))
		.uv(28, 193).cuboid(-25.8F, -40.7F, -8.5F, 1.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(86, 194).cuboid(-25.8F, -40.7F, 12.5F, 1.0F, 38.0F, 2.0F, new Dilation(0.0F))
		.uv(116, 0).cuboid(-25.8F, -42.7F, -9.0F, 1.0F, 2.0F, 23.0F, new Dilation(0.0F))
		.uv(40, 175).cuboid(-26.0007F, -42.7007F, 2.5F, 1.0F, 43.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r96 = left2.addChild("cube_r96", ModelPartBuilder.create().uv(240, 104).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 96).cuboid(-1.0F, 2.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 88).cuboid(-1.0F, -18.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 80).cuboid(-1.0F, -28.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-24.3865F, -12.7007F, 1.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r97 = left2.addChild("cube_r97", ModelPartBuilder.create().uv(16, 235).cuboid(-1.0F, -8.0F, -1.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 211).cuboid(-1.0F, -18.0F, -1.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 202).cuboid(-1.0F, -28.0F, -1.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 193).cuboid(-1.0F, -38.0F, -1.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-24.3858F, -2.7007F, 4.4993F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r98 = left2.addChild("cube_r98", ModelPartBuilder.create().uv(34, 193).cuboid(-1.0F, -8.0F, -1.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(188, 67).cuboid(-1.0F, -18.0F, -1.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 184).cuboid(-1.0F, 2.0F, -1.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(166, 183).cuboid(-1.0F, 12.0F, -1.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-24.3858F, -22.7007F, -6.5007F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r99 = left2.addChild("cube_r99", ModelPartBuilder.create().uv(188, 235).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-24.3865F, -32.7007F, 9.8F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r100 = left2.addChild("cube_r100", ModelPartBuilder.create().uv(60, 235).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-24.3865F, -32.7007F, 7.2F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r101 = left2.addChild("cube_r101", ModelPartBuilder.create().uv(208, 199).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-24.3865F, -32.7007F, -3.8F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r102 = left2.addChild("cube_r102", ModelPartBuilder.create().uv(102, 59).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-24.3865F, -32.7007F, -1.2F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r103 = left2.addChild("cube_r103", ModelPartBuilder.create().uv(240, 72).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 64).cuboid(-1.0F, -18.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 52).cuboid(-1.0F, 2.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
		.uv(240, 44).cuboid(-1.0F, 12.0F, -1.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-24.3865F, -22.7007F, 12.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r104 = left2.addChild("cube_r104", ModelPartBuilder.create().uv(224, 178).cuboid(-1.0F, -1.0F, -7.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(224, 169).cuboid(-1.0F, -1.0F, -18.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-25.0929F, -21.9929F, 11.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r105 = left2.addChild("cube_r105", ModelPartBuilder.create().uv(224, 53).cuboid(-1.0F, -1.0F, -7.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(224, 44).cuboid(-1.0F, -1.0F, 4.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-25.0929F, -31.9929F, 0.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r106 = left2.addChild("cube_r106", ModelPartBuilder.create().uv(214, 26).cuboid(-1.0F, -1.0F, -7.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(48, 213).cuboid(-1.0F, -1.0F, 4.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-25.0929F, -35.9929F, 0.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r107 = left2.addChild("cube_r107", ModelPartBuilder.create().uv(224, 9).cuboid(-1.0F, -1.0F, -7.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(224, 0).cuboid(-1.0F, -1.0F, -18.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-25.0929F, -11.9929F, 11.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r108 = left2.addChild("cube_r108", ModelPartBuilder.create().uv(222, 112).cuboid(-1.0F, -1.0F, -7.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(70, 222).cuboid(-1.0F, -1.0F, 4.0F, 0.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-25.0929F, -1.9929F, 0.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r109 = left2.addChild("cube_r109", ModelPartBuilder.create().uv(146, 220).cuboid(-1.0F, 0.0F, -7.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(218, 219).cuboid(-1.0F, 0.0F, 4.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-25.0929F, -29.9929F, 0.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r110 = left2.addChild("cube_r110", ModelPartBuilder.create().uv(200, 219).cuboid(-1.0F, 0.0F, -7.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(182, 218).cuboid(-1.0F, 0.0F, -18.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-25.0929F, -39.9929F, 11.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r111 = left2.addChild("cube_r111", ModelPartBuilder.create().uv(164, 218).cuboid(-1.0F, 0.0F, -7.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(218, 143).cuboid(-1.0F, 0.0F, -18.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-25.0929F, -19.9929F, 11.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r112 = left2.addChild("cube_r112", ModelPartBuilder.create().uv(128, 218).cuboid(-1.0F, 0.0F, -7.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F))
		.uv(218, 123).cuboid(-1.0F, 0.0F, 4.0F, 1.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-25.0929F, -9.9929F, 0.5F, 0.0F, 0.0F, 0.7854F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		tardis.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.push();
		matrices.scale(0.375f, 0.375f, 0.375f);
		matrices.pop();
	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices,
									 VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		if (exterior.tardis().isEmpty())
			return;

		matrices.push();
		matrices.scale(0.63F, 0.63F, 0.63F);
		matrices.translate(0, -1.5f, 0);

		DoorHandler door = exterior.tardis().get().door();

		if (!AITMod.CONFIG.CLIENT.ANIMATE_DOORS) {
			this.left.getChild("leftdoor").yaw = (door.isLeftOpen() || door.isOpen()) ? -5.0F : 0.0F;
			this.right2.getChild("rightdoor").yaw = (door.isRightOpen() || door.areBothOpen())
					? 5.0F
					: 0.0F;
		} else {
			float maxRot = 90f;
			this.left.getChild("leftdoor").yaw = (float) Math.toRadians(maxRot * door.getLeftRot());
			this.right2.getChild("rightdoor").yaw = (float) -Math.toRadians(maxRot * door.getRightRot());
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
		return tardis;
	}

	@Override
	public net.minecraft.client.render.entity.animation.Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public void renderDoors(ClientTardis tardis, ExteriorBlockEntity exterior, net.minecraft.client.model.ModelPart root, net.minecraft.client.util.math.MatrixStack matrices, net.minecraft.client.render.VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, boolean isBOTI) {

	}
}