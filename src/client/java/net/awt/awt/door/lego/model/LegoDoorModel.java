package net.awt.awt.door.lego.model;

import loqor.ait.client.models.doors.CapsuleDoorModel;
import loqor.ait.client.renderers.AITRenderLayers;
import loqor.ait.core.blockentities.DoorBlockEntity;
import loqor.ait.data.schema.exterior.ClientExteriorVariantSchema;
import loqor.ait.registry.impl.exterior.ClientExteriorVariantRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

public class LegoDoorModel extends CapsuleDoorModel {
    private static ClientExteriorVariantSchema variant;

    public LegoDoorModel(ModelPart root) {
        super(root);
        variant = ClientExteriorVariantRegistry.CAPSULE_DEFAULT;
    }

    @Override
    public void renderWithAnimations(DoorBlockEntity door, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        // Prepare the vertex consumer for rendering
        VertexConsumerProvider.Immediate immediate = MinecraftClient.getInstance().getBufferBuilders().getEntityVertexConsumers();
        vertices = immediate.getBuffer(AITRenderLayers.getEntityTranslucentCull(variant.texture()));

        // Apply transformations
        matrices.push();
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(180f)); // Flip the door if needed

        // Call the superclass render method
        super.renderWithAnimations(door, root, matrices, vertices, light, overlay, red, green, blue, alpha);

        // Restore the matrix stack
        matrices.pop();
    }
}