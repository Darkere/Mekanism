package mekanism.generators.client.model;

import mekanism.client.render.MekanismRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelAdvancedSolarGenerator extends ModelBase
{
	ModelRenderer foot1;
	ModelRenderer foot2;
	ModelRenderer foot3;
	ModelRenderer foot1side;
	ModelRenderer foot2side;
	ModelRenderer foot3side;
	ModelRenderer smallfoot;
	ModelRenderer base;
	ModelRenderer outputbox;
	ModelRenderer outputboxbottom;
	ModelRenderer basebeam;
	ModelRenderer connectorbox;
	ModelRenderer panelpivotbar;
	ModelRenderer bar1;
	ModelRenderer bar2;
	ModelRenderer bar3;
	ModelRenderer bar4;
	ModelRenderer Panel1;
	ModelRenderer Panel2;
	ModelRenderer Panel3;
	ModelRenderer Panel4;
	ModelRenderer Panel5;
	ModelRenderer Panel6;
	ModelRenderer Panel7;
	ModelRenderer Panel8;
	ModelRenderer Panel9;
	ModelRenderer Panel10;
	ModelRenderer Panel11;
	ModelRenderer Panel12;
	ModelRenderer Inputlight;
	ModelRenderer light1;
	ModelRenderer light2;
	ModelRenderer light3;
	ModelRenderer light4;

	public ModelAdvancedSolarGenerator()
	{
		textureWidth = 128;
		textureHeight = 64;

		foot1 = new ModelRenderer(this, 16, 30);
		foot1.addBox(16F, 13F, -2F, 6, 1, 4);
		foot1.setRotationPoint(0F, 0F, 0F);
		foot1.setTextureSize(128, 64);
		foot1.mirror = true;
		setRotation(foot1, 0F, 0F, 0.7330383F);
		foot1.mirror = false;
		foot2 = new ModelRenderer(this, 16, 23);
		foot2.addBox(-2F, 13F, -22F, 4, 1, 6);
		foot2.setRotationPoint(0F, 0F, 0F);
		foot2.setTextureSize(128, 64);
		foot2.mirror = true;
		setRotation(foot2, 0.7330383F, 0F, 0F);
		foot3 = new ModelRenderer(this, 16, 30);
		foot3.addBox(-22F, 13F, -2F, 6, 1, 4);
		foot3.setRotationPoint(0F, 0F, 0F);
		foot3.setTextureSize(128, 64);
		foot3.mirror = true;
		setRotation(foot3, 0F, 0F, -0.7330383F);
		foot1side = new ModelRenderer(this, 16, 35);
		foot1side.addBox(4F, 14F, -2F, 1, 8, 4);
		foot1side.setRotationPoint(0F, 0F, 0F);
		foot1side.setTextureSize(128, 64);
		foot1side.mirror = true;
		setRotation(foot1side, 0F, 0F, 0F);
		foot1side.mirror = false;
		foot2side = new ModelRenderer(this, 0, 47);
		foot2side.addBox(-2F, 9F, -5F, 4, 13, 3);
		foot2side.setRotationPoint(0F, 0F, 0F);
		foot2side.setTextureSize(128, 64);
		foot2side.mirror = true;
		setRotation(foot2side, 0F, 0F, 0F);
		foot3side = new ModelRenderer(this, 26, 35);
		foot3side.addBox(-4.866667F, 12F, -2F, 1, 8, 4);
		foot3side.setRotationPoint(0F, 2F, 0F);
		foot3side.setTextureSize(128, 64);
		foot3side.mirror = true;
		setRotation(foot3side, 0F, 0F, 0F);
		smallfoot = new ModelRenderer(this, 38, 32);
		smallfoot.addBox(-0.5F, 21F, 5F, 1, 3, 1);
		smallfoot.setRotationPoint(0F, 0F, 0F);
		smallfoot.setTextureSize(128, 64);
		smallfoot.mirror = true;
		setRotation(smallfoot, 0F, 0F, 0F);
		base = new ModelRenderer(this, 61, 42);
		base.addBox(-4F, 10F, -4F, 8, 13, 8);
		base.setRotationPoint(0F, 0F, 0F);
		base.setTextureSize(128, 64);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		outputbox = new ModelRenderer(this, 36, 36);
		outputbox.addBox(-4F, 16F, 4F, 8, 8, 4);
		outputbox.setRotationPoint(0F, -4F, 0F);
		outputbox.setTextureSize(128, 64);
		outputbox.mirror = true;
		setRotation(outputbox, 0F, 0F, 0F);
		outputboxbottom = new ModelRenderer(this, 42, 31);
		outputboxbottom.addBox(-2F, 20F, 4F, 4, 1, 4);
		outputboxbottom.setRotationPoint(0F, 0F, 0F);
		outputboxbottom.setTextureSize(128, 64);
		outputboxbottom.mirror = true;
		setRotation(outputboxbottom, 0F, 0F, 0F);
		basebeam = new ModelRenderer(this, 0, 14);
		basebeam.addBox(-2F, -19F, -2F, 4, 29, 4);
		basebeam.setRotationPoint(0F, 0F, 0F);
		basebeam.setTextureSize(128, 64);
		basebeam.mirror = true;
		setRotation(basebeam, 0F, 0F, 0F);
		connectorbox = new ModelRenderer(this, 14, 47);
		connectorbox.addBox(-2.5F, -21F, -2.5F, 5, 3, 5);
		connectorbox.setRotationPoint(0F, 0F, 0F);
		connectorbox.setTextureSize(128, 64);
		connectorbox.mirror = true;
		setRotation(connectorbox, 0F, 0F, 0F);
		panelpivotbar = new ModelRenderer(this, 0, 0);
		panelpivotbar.addBox(-15F, -20.5F, -0.5F, 30, 2, 1);
		panelpivotbar.setRotationPoint(0F, 0F, 0F);
		panelpivotbar.setTextureSize(128, 64);
		panelpivotbar.mirror = true;
		setRotation(panelpivotbar, 0F, 0F, 0F);
		bar1 = new ModelRenderer(this, 60, 30);
		bar1.addBox(12.7F, -20.5F, -16F, 1, 1, 33);
		bar1.setRotationPoint(0F, 0F, 0F);
		bar1.setTextureSize(128, 64);
		bar1.mirror = true;
		setRotation(bar1, 0F, 0F, 0F);
		bar2 = new ModelRenderer(this, 60, 30);
		bar2.addBox(2.6F, -20.5F, -16F, 1, 1, 33);
		bar2.setRotationPoint(0F, 0F, 0F);
		bar2.setTextureSize(128, 64);
		bar2.mirror = true;
		setRotation(bar2, 0F, 0F, 0F);
		bar3 = new ModelRenderer(this, 60, 30);
		bar3.addBox(-3.6F, -20.5F, -16F, 1, 1, 33);
		bar3.setRotationPoint(0F, 0F, 0F);
		bar3.setTextureSize(128, 64);
		bar3.mirror = true;
		setRotation(bar3, 0F, 0F, 0F);
		bar4 = new ModelRenderer(this, 60, 30);
		bar4.addBox(-13.7F, -20.5F, -16F, 1, 1, 33);
		bar4.setRotationPoint(0F, 0F, 0F);
		bar4.setTextureSize(128, 64);
		bar4.mirror = true;
		setRotation(bar4, 0F, 0F, 0F);
		Panel1 = new ModelRenderer(this, 70, 10);
		Panel1.addBox(13.5F, -21F, -23.8F, 10, 1, 16);
		Panel1.setRotationPoint(0F, 0F, 0F);
		Panel1.setTextureSize(128, 64);
		Panel1.mirror = true;
		setRotation(Panel1, 0F, 0F, 0F);
		Panel2 = new ModelRenderer(this, 16, 8);
		Panel2.addBox(13.5F, -21F, -6.5F, 10, 1, 13);
		Panel2.setRotationPoint(0F, 0F, 0F);
		Panel2.setTextureSize(128, 64);
		Panel2.mirror = true;
		setRotation(Panel2, 0F, 0F, 0F);
		Panel3 = new ModelRenderer(this, 70, 10);
		Panel3.addBox(13.5F, -21F, 7.8F, 10, 1, 16);
		Panel3.setRotationPoint(0F, 0F, 0F);
		Panel3.setTextureSize(128, 64);
		Panel3.mirror = true;
		setRotation(Panel3, 0F, 0F, 0F);
		Panel4 = new ModelRenderer(this, 70, 10);
		Panel4.addBox(3F, -21F, -23.8F, 10, 1, 16);
		Panel4.setRotationPoint(0F, 0F, 0F);
		Panel4.setTextureSize(128, 64);
		Panel4.mirror = true;
		setRotation(Panel4, 0F, 0F, 0F);
		Panel5 = new ModelRenderer(this, 16, 8);
		Panel5.addBox(3F, -21F, -6.5F, 10, 1, 13);
		Panel5.setRotationPoint(0F, 0F, 0F);
		Panel5.setTextureSize(128, 64);
		Panel5.mirror = true;
		setRotation(Panel5, 0F, 0F, 0F);
		Panel6 = new ModelRenderer(this, 70, 10);
		Panel6.addBox(3F, -21F, 7.8F, 10, 1, 16);
		Panel6.setRotationPoint(0F, 0F, 0F);
		Panel6.setTextureSize(128, 64);
		Panel6.mirror = true;
		setRotation(Panel6, 0F, 0F, 0F);
		Panel7 = new ModelRenderer(this, 70, 10);
		Panel7.addBox(-13F, -21F, -23.8F, 10, 1, 16);
		Panel7.setRotationPoint(0F, 0F, 0F);
		Panel7.setTextureSize(128, 64);
		Panel7.mirror = true;
		setRotation(Panel7, 0F, 0F, 0F);
		Panel8 = new ModelRenderer(this, 16, 8);
		Panel8.addBox(-13F, -21F, -6.5F, 10, 1, 13);
		Panel8.setRotationPoint(0F, 0F, 0F);
		Panel8.setTextureSize(128, 64);
		Panel8.mirror = true;
		setRotation(Panel8, 0F, 0F, 0F);
		Panel9 = new ModelRenderer(this, 70, 10);
		Panel9.addBox(-13F, -21F, 7.8F, 10, 1, 16);
		Panel9.setRotationPoint(0F, 0F, 0F);
		Panel9.setTextureSize(128, 64);
		Panel9.mirror = true;
		setRotation(Panel9, 0F, 0F, 0F);
		Panel10 = new ModelRenderer(this, 70, 10);
		Panel10.addBox(-23.5F, -21F, -23.8F, 10, 1, 16);
		Panel10.setRotationPoint(0F, 0F, 0F);
		Panel10.setTextureSize(128, 64);
		Panel10.mirror = true;
		setRotation(Panel10, 0F, 0F, 0F);
		Panel11 = new ModelRenderer(this, 16, 8);
		Panel11.addBox(-23.5F, -21F, -6.5F, 10, 1, 13);
		Panel11.setRotationPoint(0F, 0F, 0F);
		Panel11.setTextureSize(128, 64);
		Panel11.mirror = true;
		setRotation(Panel11, 0F, 0F, 0F);
		Panel12 = new ModelRenderer(this, 70, 10);
		Panel12.addBox(-23.5F, -21F, 7.8F, 10, 1, 16);
		Panel12.setRotationPoint(0F, 0F, 0F);
		Panel12.setTextureSize(128, 64);
		Panel12.mirror = true;
		setRotation(Panel12, 0F, 0F, 0F);
		Inputlight = new ModelRenderer(this, 5, 6);
		Inputlight.addBox(-1F, 15F, 7.2F, 2, 2, 1);
		Inputlight.setRotationPoint(0F, 0F, 0F);
		Inputlight.setTextureSize(128, 64);
		Inputlight.mirror = true;
		setRotation(Inputlight, 0F, 0F, 0F);
		light1 = new ModelRenderer(this, 5, 4);
		light1.addBox(3.2F, 15F, 6F, 1, 2, 1);
		light1.setRotationPoint(0F, 0F, 0F);
		light1.setTextureSize(128, 64);
		light1.mirror = true;
		setRotation(light1, 0F, 0F, 0F);
		light2 = new ModelRenderer(this, 5, 4);
		light2.addBox(-4.2F, 15F, 6F, 1, 2, 1);
		light2.setRotationPoint(0F, 0F, 0F);
		light2.setTextureSize(128, 64);
		light2.mirror = true;
		setRotation(light2, 0F, 0F, 0F);
		light3 = new ModelRenderer(this, 5, 4);
		light3.addBox(3.2F, 15F, 2F, 1, 2, 3);
		light3.setRotationPoint(0F, 0F, 0F);
		light3.setTextureSize(128, 64);
		light3.mirror = true;
		setRotation(light3, 0F, 0F, 0F);
		light4 = new ModelRenderer(this, 5, 4);
		light4.addBox(-4.2F, 15F, 2F, 1, 2, 3);
		light4.setRotationPoint(0F, 0F, 0F);
		light4.setTextureSize(128, 64);
		light4.mirror = true;
		setRotation(light4, 0F, 0F, 0F);
	}

	public void render(float size)
	{
		foot1.render(size);
		foot2.render(size);
		foot3.render(size);
		foot1side.render(size);
		foot2side.render(size);
		foot3side.render(size);
		smallfoot.render(size);
		base.render(size);
		outputbox.render(size);
		outputboxbottom.render(size);
		basebeam.render(size);
		connectorbox.render(size);
		panelpivotbar.render(size);
		bar1.render(size);
		bar2.render(size);
		bar3.render(size);
		bar4.render(size);
		Panel1.render(size);
		Panel2.render(size);
		Panel3.render(size);
		Panel4.render(size);
		Panel5.render(size);
		Panel6.render(size);
		Panel7.render(size);
		Panel8.render(size);
		Panel9.render(size);
		Panel10.render(size);
		Panel11.render(size);
		Panel12.render(size);

		MekanismRenderer.glowOn();
		Inputlight.render(size);
		light1.render(size);
		light2.render(size);
		light3.render(size);
		light4.render(size);
		MekanismRenderer.glowOff();
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
