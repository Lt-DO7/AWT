package net.awt.awt.exterior.onion.model;

import loqor.ait.api.link.v2.Linkable;
import loqor.ait.client.models.exteriors.ExteriorModel;
import loqor.ait.core.blockentities.ExteriorBlockEntity;
import loqor.ait.core.entities.FallingTardisEntity;
import loqor.ait.core.tardis.handler.DoorHandler;
import net.awt.awt.animation.OnionAnimation;
import net.awt.awt.animation.OnionAnimationConstants;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.RotationAxis;
import org.joml.Vector3f;

public class OnionExteriorModel extends ExteriorModel {
    private final ModelPart root;

    public OnionExteriorModel() {
        super();

        this.root = getTexturedModelData().createModel().getChild("Root");
    }


    @Override
    public void renderWithAnimations(ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.push();

        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180f));
        matrices.translate(0, -1.55, 0);

        root.getChild("Body").getChild("OmgitsaUFO").visible = exterior.tardis().get().door().isOpen();

        if (OnionAnimation.isOnion(exterior)) {
            Animation anim = OnionAnimationConstants.forState(exterior.tardis().get().travel().getState());
            long running = Float.valueOf((Math.max(1.0f - ((float) exterior.getAnimation().getTimeLeft() / exterior.getAnimation().getStartTime()), 0) * 15000)).longValue();
            alpha = 1f;
            if (anim != null) {
                this.root.resetTransform();
                this.root.traverse().forEach(ModelPart::resetTransform);
                AnimationHelper.animate(this, anim, running, 1, new Vector3f());
            }
        }

        super.renderWithAnimations(exterior, root, matrices, vertices, light, overlay, red, green, blue, alpha);

        matrices.pop();
    }

    @Override
    public <T extends Entity & Linkable> void renderEntity(T falling, ModelPart root, MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.push();

        matrices.translate(0, -1.55, 0);

        super.renderEntity(falling, root, matrices, vertexConsumer, light, overlay, red, green, blue, alpha);

        matrices.pop();
    }

    @Override
    public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState animationDoorState) {
        return Animation.Builder.create(0).build();
    }

    @Override
    public ModelPart getPart() {
        return root;
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Root = modelPartData.addChild("Root", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, 3.5F, -7.0F, 16.0F, 10.0F, 14.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -23.5F, 0.0F));

        ModelPartData topbottom_r1 = Root.addChild("topbottom_r1", ModelPartBuilder.create().uv(0, 48).cuboid(-2.0F, -7.0F, -7.0F, 12.0F, 14.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 12.5F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData frontback_r1 = Root.addChild("frontback_r1", ModelPartBuilder.create().uv(0, 24).cuboid(-8.0F, -9.0F, -7.0F, 16.0F, 10.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 12.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData Body = Root.addChild("Body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.5F, 0.0F));

        ModelPartData Hat = Body.addChild("Hat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.0F, 0.0F));

        ModelPartData Top_r1 = Hat.addChild("Top_r1", ModelPartBuilder.create().uv(60, 44).cuboid(10.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData Mid_r1 = Hat.addChild("Mid_r1", ModelPartBuilder.create().uv(36, 76).cuboid(10.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData Low_r1 = Hat.addChild("Low_r1", ModelPartBuilder.create().uv(52, 48).cuboid(10.0F, -5.0F, -5.0F, 1.0F, 10.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData OmgitsaUFO = Body.addChild("OmgitsaUFO", ModelPartBuilder.create().uv(88, 44).cuboid(-5.0F, 0.0F, -5.0F, 10.0F, 35.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData GetInLoserWereGoingShopping = OmgitsaUFO.addChild("GetInLoserWereGoingShopping", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 3.0F, 0.0F));

        ModelPartData Arrow_r1 = GetInLoserWereGoingShopping.addChild("Arrow_r1", ModelPartBuilder.create().uv(0, -2).cuboid(0.0F, -4.0F, -3.5F, 0.0F, 8.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(-0.25F, 19.0F, 5.25F, 0.0F, -1.5708F, 0.0F));

        ModelPartData Petals = Body.addChild("Petals", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -12.5F, 0.0F));

        // todo
        ModelPartData three_r1 = Petals.addChild("3_r1", ModelPartBuilder.create().uv(0, 76).cuboid(0.0F, 1.0F, -3.0F, 0.0F, 8.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.5133F, 0.0F, -1.5708F));

        ModelPartData two_r1 = Petals.addChild("2_r1", ModelPartBuilder.create().uv(74, 66).cuboid(0.0F, 1.0F, -3.0F, 0.0F, 8.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.2566F, 0.0F, -1.5708F));

        ModelPartData one_r1 = Petals.addChild("1_r1", ModelPartBuilder.create().uv(74, 52).cuboid(0.0F, 1.0F, -3.0F, 0.0F, 8.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

        ModelPartData five_r1 = Petals.addChild("5_r1", ModelPartBuilder.create().uv(24, 76).cuboid(0.0F, 1.0F, -3.0F, 0.0F, 8.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.2566F, 0.0F, -1.5708F));

        ModelPartData four_r1 = Petals.addChild("4_r1", ModelPartBuilder.create().uv(12, 76).cuboid(0.0F, 1.0F, -3.0F, 0.0F, 8.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 2.5133F, 0.0F, -1.5708F));

        ModelPartData Leg1 = Root.addChild("Leg1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.25F, -8.25F));

        ModelPartData Hip_r1 = Leg1.addChild("Hip_r1", ModelPartBuilder.create().uv(60, 36).cuboid(0.25F, -2.0F, -2.0F, 7.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, -0.75F, -1.5708F, -0.3927F, -1.5708F));

        ModelPartData Joint1 = Leg1.addChild("Joint1", ModelPartBuilder.create(), ModelTransform.of(0.0F, 1.5F, -0.75F, -0.3927F, 0.0F, 0.0F));

        ModelPartData leg_r1 = Joint1.addChild("leg_r1", ModelPartBuilder.create().uv(60, 0).cuboid(-13.75F, -1.0F, -1.0F, 15.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData Joint2 = Joint1.addChild("Joint2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 14.0F, 0.0F));

        ModelPartData leg_r2 = Joint2.addChild("leg_r2", ModelPartBuilder.create().uv(60, 20).cuboid(-11.75F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData Joint3 = Joint2.addChild("Joint3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

        ModelPartData leg_r3 = Joint3.addChild("leg_r3", ModelPartBuilder.create().uv(60, 24).cuboid(-11.75F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData Leg2 = Root.addChild("Leg2", ModelPartBuilder.create(), ModelTransform.of(7.1447F, 12.25F, 4.125F, -3.1416F, -1.0472F, 3.1416F));

        ModelPartData Hip_r2 = Leg2.addChild("Hip_r2", ModelPartBuilder.create().uv(52, 68).cuboid(0.25F, -2.0F, -2.0F, 7.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, -0.75F, -1.5708F, -0.3927F, -1.5708F));

        ModelPartData Joint4 = Leg2.addChild("Joint4", ModelPartBuilder.create(), ModelTransform.of(0.0F, 1.5F, -0.75F, -0.3927F, 0.0F, 0.0F));

        ModelPartData leg_r4 = Joint4.addChild("leg_r4", ModelPartBuilder.create().uv(60, 4).cuboid(-13.75F, -1.0F, -1.0F, 15.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData Joint5 = Joint4.addChild("Joint5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 14.0F, 0.0F));

        ModelPartData leg_r5 = Joint5.addChild("leg_r5", ModelPartBuilder.create().uv(60, 28).cuboid(-11.75F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData Joint6 = Joint5.addChild("Joint6", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

        ModelPartData leg_r6 = Joint6.addChild("leg_r6", ModelPartBuilder.create().uv(60, 32).cuboid(-11.75F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData Leg3 = Root.addChild("Leg3", ModelPartBuilder.create(), ModelTransform.of(-7.1447F, 12.25F, 4.125F, -3.1416F, 1.0472F, 3.1416F));

        ModelPartData Hip_r3 = Leg3.addChild("Hip_r3", ModelPartBuilder.create().uv(74, 44).cuboid(0.25F, -2.0F, -2.0F, 7.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, -0.75F, -1.5708F, -0.3927F, -1.5708F));

        ModelPartData Joint7 = Leg3.addChild("Joint7", ModelPartBuilder.create(), ModelTransform.of(0.0F, 1.5F, -0.75F, -0.3927F, 0.0F, 0.0F));

        ModelPartData leg_r7 = Joint7.addChild("leg_r7", ModelPartBuilder.create().uv(60, 8).cuboid(-13.75F, -1.0F, -1.0F, 15.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData Joint8 = Joint7.addChild("Joint8", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 14.0F, 0.0F));

        ModelPartData leg_r8 = Joint8.addChild("leg_r8", ModelPartBuilder.create().uv(60, 12).cuboid(-11.75F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));

        ModelPartData Joint9 = Joint8.addChild("Joint9", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

        ModelPartData leg_r9 = Joint9.addChild("leg_r9", ModelPartBuilder.create().uv(60, 16).cuboid(-11.75F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.5708F));
        return TexturedModelData.of(modelData, 128, 128);
    }
}
