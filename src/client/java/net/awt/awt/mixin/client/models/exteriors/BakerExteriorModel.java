// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

package net.awt.client.models.exteriors;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.link.v2.Linkable;
import dev.amble.ait.client.models.exteriors.ExteriorModel;
import dev.amble.ait.core.blockentities.ExteriorBlockEntity;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class BakerExteriorModel extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer rightdoor;
	private final ModelRenderer cube_r6;
	private final ModelRenderer leftdoor;
	private final ModelRenderer cube_r7;

	public BakerExteriorModel() {
		texWidth = 512;
		texHeight = 512;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);
		body.texOffs(129, 49).addBox(-24.0F, -72.0F, -18.0F, 48.0F, 5.0F, 36.0F, 0.0F, false);
		body.texOffs(106, 138).addBox(-16.0F, -76.0F, -21.0F, 32.0F, 4.0F, 42.0F, 0.0F, false);
		body.texOffs(0, 0).addBox(-24.0F, -2.0F, -24.0F, 48.0F, 1.0F, 48.0F, 0.0F, false);
		body.texOffs(0, 0).addBox(-24.0F, -1.0F, -24.0F, 48.0F, 1.0F, 48.0F, 0.0F, false);
		body.texOffs(0, 49).addBox(-21.5F, -3.0F, -21.5F, 43.0F, 1.0F, 43.0F, 0.0F, false);
		body.texOffs(129, 95).addBox(-19.5F, -78.0F, -19.5F, 39.0F, 2.0F, 39.0F, 0.0F, false);
		body.texOffs(0, 13).addBox(-2.5F, -83.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		body.texOffs(16, 15).addBox(-2.0F, -88.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		body.texOffs(0, 19).addBox(-1.5F, -89.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		body.texOffs(0, 0).addBox(-4.5F, -82.0F, -4.5F, 9.0F, 4.0F, 9.0F, 0.0F, false);
		body.texOffs(222, 264).addBox(-22.0F, -76.0F, -22.0F, 6.0F, 74.0F, 6.0F, 0.0F, false);
		body.texOffs(198, 264).addBox(-22.0F, -76.0F, 16.0F, 6.0F, 74.0F, 6.0F, 0.0F, false);
		body.texOffs(261, 0).addBox(16.0F, -76.0F, -22.0F, 6.0F, 74.0F, 6.0F, 0.0F, false);
		body.texOffs(260, 258).addBox(16.0F, -76.0F, 16.0F, 6.0F, 74.0F, 6.0F, 0.0F, false);
		body.texOffs(132, 184).addBox(-20.0F, -67.0F, -16.0F, 1.0F, 64.0F, 32.0F, 0.0F, false);
		body.texOffs(254, 264).addBox(-21.0F, -67.0F, -0.5F, 1.0F, 64.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -1.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
		cube_r1.texOffs(246, 264).addBox(-21.0F, -66.0F, -0.5F, 1.0F, 64.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(0, 180).addBox(-20.0F, -66.0F, -16.0F, 1.0F, 64.0F, 32.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -1.0F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
		cube_r2.texOffs(250, 264).addBox(-21.0F, -66.0F, -0.5F, 1.0F, 64.0F, 1.0F, 0.0F, false);
		cube_r2.texOffs(66, 180).addBox(-20.0F, -66.0F, -16.0F, 1.0F, 64.0F, 32.0F, 0.0F, false);
		cube_r2.texOffs(0, 134).addBox(-16.0F, -75.0F, -21.0F, 32.0F, 4.0F, 42.0F, 0.0F, false);
		cube_r2.texOffs(0, 285).addBox(-24.0F, -71.0F, 18.0F, 48.0F, 5.0F, 1.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, -1.0F, 0.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.texOffs(0, 93).addBox(-24.0F, -71.0F, -18.0F, 48.0F, 5.0F, 36.0F, 0.0F, false);
		cube_r3.texOffs(0, 285).addBox(-24.0F, -71.0F, 18.0F, 48.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, -1.0F, 0.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -3.1416F, 0.0F, 3.1416F);
		cube_r4.texOffs(0, 285).addBox(-24.0F, -71.0F, 18.0F, 48.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, -1.0F, 0.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.0F);
		cube_r5.texOffs(0, 285).addBox(-24.0F, -71.0F, 18.0F, 48.0F, 5.0F, 1.0F, 0.0F, true);

		rightdoor = new ModelRenderer(this);
		rightdoor.setPos(-15.5F, 0.0F, -19.5F);
		body.addChild(rightdoor);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(15.5F, -1.0F, 19.5F);
		rightdoor.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 1.5708F, 0.0F);
		cube_r6.texOffs(266, 136).addBox(20.0F, -66.0F, -0.5F, 1.0F, 64.0F, 1.0F, 0.0F, false);
		cube_r6.texOffs(232, 184).addBox(19.0F, -66.0F, -16.0F, 1.0F, 64.0F, 16.0F, 0.0F, false);

		leftdoor = new ModelRenderer(this);
		leftdoor.setPos(15.5F, 0.0F, -19.5F);
		body.addChild(leftdoor);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(-15.5F, -1.0F, 19.5F);
		leftdoor.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -1.5708F, 0.0F);
		cube_r7.texOffs(13, 313).addBox(-20.05F, -45.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.texOffs(198, 184).addBox(-20.0F, -66.0F, -16.0F, 1.0F, 64.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}