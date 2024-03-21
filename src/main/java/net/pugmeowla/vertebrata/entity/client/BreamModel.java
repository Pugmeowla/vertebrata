package net.pugmeowla.vertebrata.entity.client;
// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class
BreamModel<T extends Entity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor

    private final ModelPart Spine;

    public BreamModel(ModelPart root) {
        this.Spine = root.getChild("Spine");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Spine = partdefinition.addOrReplaceChild("Spine", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -3.0F, -2.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(20, 20).addBox(-0.5F, -5.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(7, 11).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(18, 25).addBox(-1.0F, -4.0F, 3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(14, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition tailbody = Spine.addOrReplaceChild("tailbody", CubeListBuilder.create().texOffs(26, 17).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(6, 25).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

        PartDefinition tail = tailbody.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(26, 25).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 13).addBox(0.0F, -3.0F, 2.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 41).addBox(0.0F, -5.0F, 4.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(0.0F, 3.0F, 4.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 1.0F));

        PartDefinition head = Spine.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.5F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(14, 0).addBox(-1.0F, -3.0F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 4).addBox(-1.0F, -1.25F, -4.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 0).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.0F));

        PartDefinition pectorals = Spine.addOrReplaceChild("pectorals", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition L = pectorals.addOrReplaceChild("L", CubeListBuilder.create(), PartPose.offset(1.5F, -1.0F, -2.0F));

        PartDefinition left_r1 = L.addOrReplaceChild("left_r1", CubeListBuilder.create().texOffs(18, 14).addBox(0.0F, -3.0F, 0.0F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.4835F, 0.0F));

        PartDefinition R = pectorals.addOrReplaceChild("R", CubeListBuilder.create(), PartPose.offset(-1.5F, -1.0F, -2.0F));

        PartDefinition right_r1 = R.addOrReplaceChild("right_r1", CubeListBuilder.create().texOffs(18, 14).addBox(0.25F, -3.0F, 3.0F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, -1.6581F, 0.0F));

        PartDefinition dorsals = Spine.addOrReplaceChild("dorsals", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition dorsal = dorsals.addOrReplaceChild("dorsal", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -9.0F, -4.5F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition dorsalback = dorsals.addOrReplaceChild("dorsalback", CubeListBuilder.create().texOffs(12, 13).addBox(0.0F, -7.0F, 2.5F, 0.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition pelvicfins = Spine.addOrReplaceChild("pelvicfins", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = pelvicfins.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 20).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.5236F));

        PartDefinition cube_r2 = pelvicfins.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, -1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition analfin = Spine.addOrReplaceChild("analfin", CubeListBuilder.create().texOffs(0, 34).addBox(1.0F, -1.5F, 5.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 1.0F, -1.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Spine.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}