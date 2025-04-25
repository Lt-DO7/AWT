// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.awt.awt.entity.client;

import net.awt.awt.entity.cutsom.CybermanEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public abstract class Cyberman<T extends CybermanEntity> extends SinglePartEntityModel<T> {
	private final ModelPart protocyberman;
	private final ModelPart head;
	private final ModelPart handlebars2;
	private final ModelPart torso;
	private final ModelPart chestpiece;
	private final ModelPart Larm;
	private final ModelPart handlebars;
	private final ModelPart Rarm;
	private final ModelPart handlebars3;
	private final ModelPart Lleg;
	private final ModelPart Rleg;
	public Cyberman(ModelPart root) {
		this.protocyberman = root.getChild("protocyberman");
		this.head = root.getChild("head");
		this.handlebars2 = root.getChild("handlebars2");
		this.torso = root.getChild("torso");
		this.chestpiece = root.getChild("chestpiece");
		this.Larm = root.getChild("Larm");
		this.handlebars = root.getChild("handlebars");
		this.Rarm = root.getChild("Rarm");
		this.handlebars3 = root.getChild("handlebars3");
		this.Lleg = root.getChild("Lleg");
		this.Rleg = root.getChild("Rleg");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData protocyberman = modelPartData.addChild("protocyberman", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 16.0F, -1.0F));

		ModelPartData head = protocyberman.addChild("head", ModelPartBuilder.create().uv(40, 54).cuboid(-9.0F, -23.5F, 7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-12.0F, -30.5F, 4.25F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, 7.25F, -8.0F));

		ModelPartData handlebars2 = head.addChild("handlebars2", ModelPartBuilder.create().uv(16, 54).cuboid(-13.0F, -28.0F, 7.0F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(26, 54).cuboid(-5.0F, -28.0F, 7.0F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(48, 54).cuboid(-3.0F, -33.0F, 8.0F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 55).cuboid(-14.0F, -33.0F, 8.0F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 14).cuboid(-13.0F, -33.0F, 8.0F, 10.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 30).cuboid(-10.0F, -32.0F, 5.0F, 4.0F, 3.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData torso = protocyberman.addChild("torso", ModelPartBuilder.create().uv(0, 43).cuboid(-11.0F, -13.0F, 6.5F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(32, 0).cuboid(-12.0F, -15.5F, 6.0F, 8.0F, 3.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(-12.5F, -23.25F, 5.5F, 9.0F, 8.0F, 5.0F, new Dilation(0.0F))
		.uv(42, 37).cuboid(-9.0F, -15.25F, 5.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(4, 59).cuboid(-9.0F, -12.0F, 7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, 8.0F, -8.0F));

		ModelPartData chestpiece = torso.addChild("chestpiece", ModelPartBuilder.create().uv(52, 59).cuboid(-9.0F, -21.0F, 5.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(62, 26).cuboid(-10.0F, -21.0F, 5.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(62, 30).cuboid(-7.0F, -21.0F, 5.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 4).cuboid(-9.0F, -19.0F, 5.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(62, 23).cuboid(-9.0F, -22.0F, 5.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Larm = protocyberman.addChild("Larm", ModelPartBuilder.create().uv(16, 60).cuboid(-4.05F, -22.0F, 6.875F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(20, 40).cuboid(-3.55F, -23.0F, 5.875F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F))
		.uv(52, 37).cuboid(-2.55F, -13.0F, 5.875F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, 8.0F, -8.0F));

		ModelPartData handlebars = Larm.addChild("handlebars", ModelPartBuilder.create().uv(24, 60).cuboid(-1.05F, -16.25F, 7.125F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(60, 59).cuboid(-1.05F, -22.25F, 7.125F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(36, 54).cuboid(0.95F, -21.75F, 7.625F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Rarm = protocyberman.addChild("Rarm", ModelPartBuilder.create().uv(4, 55).cuboid(-14.05F, -22.0F, 7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(36, 40).cuboid(-16.55F, -23.0F, 6.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.0F))
		.uv(52, 42).cuboid(-16.55F, -13.0F, 6.0F, 3.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, 8.0F, -8.0F));

		ModelPartData handlebars3 = Rarm.addChild("handlebars3", ModelPartBuilder.create().uv(56, 0).cuboid(-17.05F, -16.25F, 6.75F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 58).cuboid(-17.05F, -22.25F, 6.75F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(12, 55).cuboid(-18.05F, -21.75F, 7.25F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Lleg = protocyberman.addChild("Lleg", ModelPartBuilder.create().uv(32, 7).cuboid(0.75F, 7.0F, -4.25F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 16).cuboid(0.25F, -2.0F, -2.5F, 5.0F, 9.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 48).cuboid(0.5F, -3.75F, -2.0F, 4.0F, 3.0F, 4.0F, new Dilation(0.0F))
		.uv(48, 23).cuboid(3.25F, -4.0F, -2.5F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(52, 47).cuboid(2.25F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Rleg = protocyberman.addChild("Rleg", ModelPartBuilder.create().uv(42, 30).cuboid(-4.5F, 7.0F, -4.25F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 29).cuboid(-5.25F, -2.0F, -2.5F, 5.0F, 9.0F, 5.0F, new Dilation(0.0F))
		.uv(48, 16).cuboid(-4.5F, -3.75F, -2.0F, 4.0F, 3.0F, 4.0F, new Dilation(0.0F))
		.uv(52, 7).cuboid(-5.25F, -4.0F, -2.5F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(52, 53).cuboid(-3.25F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void setAngles(CybermanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		protocyberman.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
	@Override
	public ModelPart getPart(){
		return protocyberman;
	}
}