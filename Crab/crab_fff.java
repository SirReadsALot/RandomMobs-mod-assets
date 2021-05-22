// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports


public class crab_fff extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bb_main;
	private final ModelRenderer bb_main_r1;
	private final ModelRenderer bb_main_r2;
	private final ModelRenderer bb_main_r3;
	private final ModelRenderer bb_main_r4;
	private final ModelRenderer bb_main_r5;
	private final ModelRenderer bb_main_r6;

	public crab_fff() {
		textureWidth = 32;
		textureHeight = 32;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(cube_r1);
		setRotationAngle(cube_r1, 3.1249F, -0.0403F, -2.7486F);
		cube_r1.setTextureOffset(16, 5).addBox(2.75F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3927F);
		cube_r2.setTextureOffset(5, 16).addBox(2.75F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(cube_r3);
		setRotationAngle(cube_r3, -2.5474F, -0.0403F, -2.7486F);
		cube_r3.setTextureOffset(16, 0).addBox(2.0F, 0.25F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.6109F, 0.0F, -0.3927F);
		cube_r4.setTextureOffset(14, 13).addBox(2.0F, 0.25F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(cube_r5);
		setRotationAngle(cube_r5, 2.7322F, -0.0403F, -2.7486F);
		cube_r5.setTextureOffset(0, 9).addBox(2.0F, 0.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, -0.3927F);
		cube_r6.setTextureOffset(0, 0).addBox(2.0F, 0.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 5).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(14, 10).addBox(-2.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(4, 14).addBox(1.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bb_main_r1 = new ModelRenderer(this);
		bb_main_r1.setRotationPoint(4.0F, 0.25F, 1.0F);
		bb_main.addChild(bb_main_r1);
		setRotationAngle(bb_main_r1, -2.9234F, 0.2182F, 3.1416F);
		bb_main_r1.setTextureOffset(6, 9).addBox(1.25F, -1.75F, 4.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bb_main_r2 = new ModelRenderer(this);
		bb_main_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(bb_main_r2);
		setRotationAngle(bb_main_r2, 0.2182F, -2.8362F, 0.0F);
		bb_main_r2.setTextureOffset(8, 13).addBox(1.25F, -1.75F, 4.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bb_main_r3 = new ModelRenderer(this);
		bb_main_r3.setRotationPoint(4.0F, 0.25F, 1.0F);
		bb_main.addChild(bb_main_r3);
		setRotationAngle(bb_main_r3, 2.9234F, 0.2182F, 3.1416F);
		bb_main_r3.setTextureOffset(10, 10).addBox(1.25F, -3.0F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bb_main_r4 = new ModelRenderer(this);
		bb_main_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(bb_main_r4);
		setRotationAngle(bb_main_r4, -0.2182F, -2.8362F, 0.0F);
		bb_main_r4.setTextureOffset(0, 14).addBox(1.25F, -3.0F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		bb_main_r5 = new ModelRenderer(this);
		bb_main_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(bb_main_r5);
		setRotationAngle(bb_main_r5, -0.1309F, -2.8362F, 0.0F);
		bb_main_r5.setTextureOffset(0, 9).addBox(1.25F, -2.75F, 0.25F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		bb_main_r6 = new ModelRenderer(this);
		bb_main_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(bb_main_r6);
		setRotationAngle(bb_main_r6, 0.2182F, -0.3054F, 0.0F);
		bb_main_r6.setTextureOffset(10, 5).addBox(1.5F, -2.75F, -3.75F, 1.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		main.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}