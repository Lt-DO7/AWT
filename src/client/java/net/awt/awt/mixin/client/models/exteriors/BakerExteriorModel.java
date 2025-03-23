// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class tom_baker extends EntityModel<Entity> {
	private final ModelPart body;
	private final ModelPart rightdoor;
	private final ModelPart leftdoor;
	public tom_baker(ModelPart root) {
		this.body = root.getChild("body");
		this.rightdoor = this.body.getChild("rightdoor");
		this.leftdoor = this.body.getChild("leftdoor");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(129, 49).cuboid(-24.0F, -72.0F, -18.0F, 48.0F, 5.0F, 36.0F, new Dilation(0.0F))
		.uv(0, 285).mirrored().cuboid(-24.0F, -72.0F, 18.0F, 48.0F, 5.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(106, 138).cuboid(-16.0F, -76.0F, -21.0F, 32.0F, 4.0F, 42.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-24.0F, -2.0F, -24.0F, 48.0F, 1.0F, 48.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-24.0F, -1.0F, -24.0F, 48.0F, 1.0F, 48.0F, new Dilation(0.0F))
		.uv(0, 49).cuboid(-21.5F, -3.0F, -21.5F, 43.0F, 1.0F, 43.0F, new Dilation(0.0F))
		.uv(129, 95).cuboid(-19.5F, -78.0F, -19.5F, 39.0F, 2.0F, 39.0F, new Dilation(0.0F))
		.uv(0, 13).cuboid(-2.5F, -83.0F, -2.5F, 5.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(16, 15).cuboid(-2.0F, -88.0F, -2.0F, 4.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 19).cuboid(-1.5F, -89.0F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.5F, -82.0F, -4.5F, 9.0F, 4.0F, 9.0F, new Dilation(0.0F))
		.uv(222, 264).cuboid(-22.0F, -76.0F, -22.0F, 6.0F, 74.0F, 6.0F, new Dilation(0.0F))
		.uv(198, 264).cuboid(-22.0F, -76.0F, 16.0F, 6.0F, 74.0F, 6.0F, new Dilation(0.0F))
		.uv(261, 0).cuboid(16.0F, -76.0F, -22.0F, 6.0F, 74.0F, 6.0F, new Dilation(0.0F))
		.uv(260, 258).cuboid(16.0F, -76.0F, 16.0F, 6.0F, 74.0F, 6.0F, new Dilation(0.0F))
		.uv(132, 184).cuboid(-20.0F, -67.0F, -16.0F, 1.0F, 64.0F, 32.0F, new Dilation(0.0F))
		.uv(254, 264).cuboid(-21.0F, -67.0F, -0.5F, 1.0F, 64.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = body.addChild("cube_r1", ModelPartBuilder.create().uv(246, 264).cuboid(-21.0F, -66.0F, -0.5F, 1.0F, 64.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 180).cuboid(-20.0F, -66.0F, -16.0F, 1.0F, 64.0F, 32.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r2 = body.addChild("cube_r2", ModelPartBuilder.create().uv(250, 264).cuboid(-21.0F, -66.0F, -0.5F, 1.0F, 64.0F, 1.0F, new Dilation(0.0F))
		.uv(66, 180).cuboid(-20.0F, -66.0F, -16.0F, 1.0F, 64.0F, 32.0F, new Dilation(0.0F))
		.uv(0, 134).cuboid(-16.0F, -75.0F, -21.0F, 32.0F, 4.0F, 42.0F, new Dilation(0.0F))
		.uv(0, 285).mirrored().cuboid(-24.0F, -71.0F, 18.0F, 48.0F, 5.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r3 = body.addChild("cube_r3", ModelPartBuilder.create().uv(0, 93).cuboid(-24.0F, -71.0F, -18.0F, 48.0F, 5.0F, 36.0F, new Dilation(0.0F))
		.uv(0, 285).cuboid(-24.0F, -71.0F, 18.0F, 48.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r4 = body.addChild("cube_r4", ModelPartBuilder.create().uv(0, 285).cuboid(-24.0F, -71.0F, 18.0F, 48.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData rightdoor = body.addChild("rightdoor", ModelPartBuilder.create(), ModelTransform.pivot(-15.5F, 0.0F, -19.5F));

		ModelPartData cube_r5 = rightdoor.addChild("cube_r5", ModelPartBuilder.create().uv(266, 136).cuboid(20.0F, -66.0F, -0.5F, 1.0F, 64.0F, 1.0F, new Dilation(0.0F))
		.uv(232, 184).cuboid(19.0F, -66.0F, -16.0F, 1.0F, 64.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(15.5F, -1.0F, 19.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData leftdoor = body.addChild("leftdoor", ModelPartBuilder.create(), ModelTransform.pivot(15.5F, 0.0F, -19.5F));

		ModelPartData cube_r6 = leftdoor.addChild("cube_r6", ModelPartBuilder.create().uv(13, 313).cuboid(-20.05F, -45.0F, -2.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(198, 184).cuboid(-20.0F, -66.0F, -16.0F, 1.0F, 64.0F, 16.0F, new Dilation(0.0F)), ModelTransform.of(-15.5F, -1.0F, 19.5F, 0.0F, -1.5708F, 0.0F));
		return TexturedModelData.of(modelData, 512, 512);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}