// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

package net.awt.client.models.doors;

import dev.amble.ait.AITMod;
import dev.amble.ait.api.link.v2.block.AbstractLinkableBlockEntity;
import dev.amble.ait.client.models.doors.DoorModel;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.Animation.Builder;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

public class BakerDoorModel extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r4;

	public BakerDoorModel() {
		texWidth = 512;
		texHeight = 512;

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 24.0F, 0.0F);
		bone.texOffs(38, 38).addBox(-24.0F, -2.0F, -24.0F, 48.0F, 1.0F, 10.0F, 0.0F, false);
		bone.texOffs(38, 38).addBox(-24.0F, -1.0F, -24.0F, 48.0F, 1.0F, 10.0F, 0.0F, false);
		bone.texOffs(38, 87).addBox(-21.5F, -3.0F, -21.5F, 43.0F, 1.0F, 5.0F, 0.0F, false);
		bone.texOffs(222, 264).addBox(-22.0F, -72.0F, -22.0F, 6.0F, 70.0F, 6.0F, 0.0F, false);
		bone.texOffs(261, 0).addBox(16.0F, -72.0F, -22.0F, 6.0F, 70.0F, 6.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -1.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.texOffs(-2, 91).addBox(-24.0F, -71.0F, -19.0F, 7.0F, 5.0F, 38.0F, 0.0F, false);
		cube_r1.texOffs(64, 337).addBox(-24.0F, -71.0F, 18.0F, 7.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -1.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
		cube_r2.texOffs(64, 347).addBox(18.0F, -71.0F, 18.0F, 6.0F, 5.0F, 1.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setPos(-15.5F, 0.0F, -19.5F);
		bone.addChild(bone2);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(15.5F, -1.0F, 19.5F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
		cube_r3.texOffs(266, 136).addBox(20.0F, -66.0F, -0.5F, 1.0F, 64.0F, 1.0F, 0.0F, false);
		cube_r3.texOffs(232, 184).addBox(19.0F, -66.0F, -16.0F, 1.0F, 64.0F, 16.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(15.5F, 0.0F, -19.5F);
		bone.addChild(bone3);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-15.5F, -1.0F, 19.5F);
		bone3.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
		cube_r4.texOffs(13, 313).addBox(-20.05F, -45.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r4.texOffs(198, 184).addBox(-20.0F, -66.0F, -16.0F, 1.0F, 64.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}