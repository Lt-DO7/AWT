package net.awt.awt.door.onion.model;

import loqor.ait.client.models.doors.CapsuleDoorModel;
import loqor.ait.client.renderers.AITRenderLayers;
import loqor.ait.core.blockentities.DoorBlockEntity;
import loqor.ait.data.schema.exterior.ClientExteriorVariantSchema;
import loqor.ait.registry.impl.exterior.ClientExteriorVariantRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.OutlineVertexConsumerProvider;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;

public class OnionDoorModel extends CapsuleDoorModel {
	private static ClientExteriorVariantSchema variant;

	public OnionDoorModel(ModelPart root) {
		super(root);

		variant = ClientExteriorVariantRegistry.CAPSULE_DEFAULT;
	}

	@Override
	public void renderWithAnimations(DoorBlockEntity door, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		VertexConsumerProvider.Immediate immediate = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
		vertices = immediate.getBuffer(AITRenderLayers.getEntityTranslucentCull(variant.texture()));

		super.renderWithAnimations(door, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
	}
}
