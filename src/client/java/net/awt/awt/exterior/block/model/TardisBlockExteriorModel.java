package net.awt.awt.exterior.block.model;

import loqor.ait.api.link.v2.Linkable;
import loqor.ait.client.models.exteriors.ExteriorModel;
import loqor.ait.core.blockentities.ExteriorBlockEntity;
import loqor.ait.core.entities.FallingTardisEntity;
import loqor.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class TardisBlockExteriorModel extends ExteriorModel {
    private final ModelPart root;

    public TardisBlockExteriorModel() {
        super();

        this.root = getTexturedModelData().createModel().getChild("root");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -1.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-8.0F, -17.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 9.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 32);
    }

    @Override
    public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState animationDoorState) {
        return Animation.Builder.create(0).build();
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }

    @Override
    public void renderWithAnimations(ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.push();

        matrices.translate(0, -1.5, 0);

        super.renderWithAnimations(exterior, root, matrices, vertices, light, overlay, red, green, blue, alpha);

        matrices.pop();
    }

    @Override
    public <T extends Entity & Linkable> void renderEntity(T falling, ModelPart root, MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.push();

        matrices.translate(0, -1.5, 0);

        super.renderEntity(falling, root, matrices, vertexConsumer, light, overlay, red, green, blue, alpha);

        matrices.pop();
    }
}

