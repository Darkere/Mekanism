package mekanism.client.model;

import mekanism.client.render.MekanismRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelChemicalInfuser extends ModelBase
{
	ModelRenderer Base;
	ModelRenderer GasExit;
	ModelRenderer GasLeft;
	ModelRenderer GasRight;
	ModelRenderer MachineCore;
	ModelRenderer TopPanel;
	ModelRenderer SidePanel;
	ModelRenderer LPanelNW;
	ModelRenderer RPanelNW;
	ModelRenderer RPanelNE;
	ModelRenderer LPanelSW;
	ModelRenderer RPanelSW;
	ModelRenderer RPanelSE;
	ModelRenderer LPanelNE;
	ModelRenderer LPanelSE;
	ModelRenderer LTopS;
	ModelRenderer RTopN;
	ModelRenderer LTopN;
	ModelRenderer RTopS;
	ModelRenderer RTopW;
	ModelRenderer RTopE;
	ModelRenderer LTopE;
	ModelRenderer LTopW;
	ModelRenderer FrontPanel;
	ModelRenderer FrontConnection;
	ModelRenderer RightConnection;
	ModelRenderer LeftConnection;
	ModelRenderer LGlassT;
	ModelRenderer RGlassT;
	ModelRenderer LGlassS;
	ModelRenderer RGlassS;
	ModelRenderer RGlassN;
	ModelRenderer LGlassN;
	ModelRenderer LGlassL;
	ModelRenderer RGlassR;
	ModelRenderer RGlassL;
	ModelRenderer LGlassR;

	public ModelChemicalInfuser()
	{
		textureWidth = 128;
		textureHeight = 128;

		Base = new ModelRenderer(this, 0, 0);
		Base.addBox(0F, 0F, 0F, 16, 1, 16);
		Base.setRotationPoint(-8F, 23F, -8F);
		Base.setTextureSize(128, 128);
		Base.mirror = true;
		setRotation(Base, 0F, 0F, 0F);
		GasExit = new ModelRenderer(this, 0, 17);
		GasExit.addBox(0F, 0F, 0F, 6, 6, 1);
		GasExit.setRotationPoint(-3F, 13F, -8F);
		GasExit.setTextureSize(128, 128);
		GasExit.mirror = true;
		setRotation(GasExit, 0F, 0F, 0F);
		GasLeft = new ModelRenderer(this, 64, 0);
		GasLeft.addBox(0F, 0F, 0F, 1, 6, 6);
		GasLeft.setRotationPoint(-8F, 13F, -3F);
		GasLeft.setTextureSize(128, 128);
		GasLeft.mirror = true;
		setRotation(GasLeft, 0F, 0F, 0F);
		GasRight = new ModelRenderer(this, 64, 0);
		GasRight.addBox(0F, 0F, 0F, 1, 6, 6);
		GasRight.setRotationPoint(7F, 13F, -3F);
		GasRight.setTextureSize(128, 128);
		GasRight.mirror = true;
		setRotation(GasRight, 0F, 0F, 0F);
		MachineCore = new ModelRenderer(this, 0, 24);
		MachineCore.addBox(0F, 0F, 0F, 10, 11, 5);
		MachineCore.setRotationPoint(-5F, 12F, -4F);
		MachineCore.setTextureSize(128, 128);
		MachineCore.mirror = true;
		setRotation(MachineCore, 0F, 0F, 0F);
		TopPanel = new ModelRenderer(this, 0, 40);
		TopPanel.addBox(0F, 0F, 0F, 2, 1, 8);
		TopPanel.setRotationPoint(-1F, 11F, -3F);
		TopPanel.setTextureSize(128, 128);
		TopPanel.mirror = true;
		setRotation(TopPanel, 0F, 0F, 0F);
		SidePanel = new ModelRenderer(this, 30, 17);
		SidePanel.addBox(0F, 0F, 0F, 2, 11, 1);
		SidePanel.setRotationPoint(-1F, 12F, 4F);
		SidePanel.setTextureSize(128, 128);
		SidePanel.mirror = true;
		setRotation(SidePanel, 0F, 0F, 0F);
		LPanelNW = new ModelRenderer(this, 78, 0);
		LPanelNW.addBox(0F, 0F, 0F, 1, 15, 1);
		LPanelNW.setRotationPoint(-6F, 8F, 1F);
		LPanelNW.setTextureSize(128, 128);
		LPanelNW.mirror = true;
		setRotation(LPanelNW, 0F, 0F, 0F);
		RPanelNW = new ModelRenderer(this, 78, 0);
		RPanelNW.addBox(0F, 0F, 0F, 1, 15, 1);
		RPanelNW.setRotationPoint(1F, 8F, 1F);
		RPanelNW.setTextureSize(128, 128);
		RPanelNW.mirror = true;
		setRotation(RPanelNW, 0F, 0F, 0F);
		RPanelNE = new ModelRenderer(this, 78, 0);
		RPanelNE.addBox(7F, 0F, 0F, 1, 15, 1);
		RPanelNE.setRotationPoint(-2F, 8F, 1F);
		RPanelNE.setTextureSize(128, 128);
		RPanelNE.mirror = true;
		setRotation(RPanelNE, 0F, 0F, 0F);
		LPanelSW = new ModelRenderer(this, 78, 0);
		LPanelSW.addBox(0F, 0F, 0F, 1, 15, 1);
		LPanelSW.setRotationPoint(-6F, 8F, 5F);
		LPanelSW.setTextureSize(128, 128);
		LPanelSW.mirror = true;
		setRotation(LPanelSW, 0F, 0F, 0F);
		RPanelSW = new ModelRenderer(this, 78, 0);
		RPanelSW.addBox(0F, 0F, 0F, 1, 15, 1);
		RPanelSW.setRotationPoint(1F, 8F, 5F);
		RPanelSW.setTextureSize(128, 128);
		RPanelSW.mirror = true;
		setRotation(RPanelSW, 0F, 0F, 0F);
		RPanelSE = new ModelRenderer(this, 78, 0);
		RPanelSE.addBox(0F, 0F, 0F, 1, 15, 1);
		RPanelSE.setRotationPoint(5F, 8F, 5F);
		RPanelSE.setTextureSize(128, 128);
		RPanelSE.mirror = true;
		setRotation(RPanelSE, 0F, 0F, 0F);
		LPanelNE = new ModelRenderer(this, 78, 0);
		LPanelNE.addBox(0F, 0F, 0F, 1, 15, 1);
		LPanelNE.setRotationPoint(-2F, 8F, 1F);
		LPanelNE.setTextureSize(128, 128);
		LPanelNE.mirror = true;
		setRotation(LPanelNE, 0F, 0F, 0F);
		LPanelSE = new ModelRenderer(this, 78, 0);
		LPanelSE.addBox(0F, 0F, 0F, 1, 15, 1);
		LPanelSE.setRotationPoint(-2F, 8F, 5F);
		LPanelSE.setTextureSize(128, 128);
		LPanelSE.mirror = true;
		setRotation(LPanelSE, 0F, 0F, 0F);
		LTopS = new ModelRenderer(this, 82, 0);
		LTopS.addBox(0F, 0F, 4F, 3, 1, 1);
		LTopS.setRotationPoint(-5F, 8F, 1F);
		LTopS.setTextureSize(128, 128);
		LTopS.mirror = true;
		setRotation(LTopS, 0F, 0F, 0F);
		RTopN = new ModelRenderer(this, 82, 0);
		RTopN.addBox(0F, 0F, 0F, 3, 1, 1);
		RTopN.setRotationPoint(2F, 8F, 1F);
		RTopN.setTextureSize(128, 128);
		RTopN.mirror = true;
		setRotation(RTopN, 0F, 0F, 0F);
		LTopN = new ModelRenderer(this, 82, 0);
		LTopN.addBox(0F, 0F, 0F, 3, 1, 1);
		LTopN.setRotationPoint(-5F, 8F, 1F);
		LTopN.setTextureSize(128, 128);
		LTopN.mirror = true;
		setRotation(LTopN, 0F, 0F, 0F);
		RTopS = new ModelRenderer(this, 82, 0);
		RTopS.addBox(0F, 0F, 4F, 3, 1, 1);
		RTopS.setRotationPoint(2F, 8F, 1F);
		RTopS.setTextureSize(128, 128);
		RTopS.mirror = true;
		setRotation(RTopS, 0F, 0F, 0F);
		RTopW = new ModelRenderer(this, 90, 0);
		RTopW.addBox(0F, 0F, 0F, 1, 1, 3);
		RTopW.setRotationPoint(1F, 8F, 2F);
		RTopW.setTextureSize(128, 128);
		RTopW.mirror = true;
		setRotation(RTopW, 0F, 0F, 0F);
		RTopE = new ModelRenderer(this, 90, 0);
		RTopE.addBox(0F, 1F, 0F, 1, 1, 3);
		RTopE.setRotationPoint(5F, 7F, 2F);
		RTopE.setTextureSize(128, 128);
		RTopE.mirror = true;
		setRotation(RTopE, 0F, 0F, 0F);
		LTopE = new ModelRenderer(this, 90, 0);
		LTopE.addBox(0F, 0F, 0F, 1, 1, 3);
		LTopE.setRotationPoint(-2F, 8F, 2F);
		LTopE.setTextureSize(128, 128);
		LTopE.mirror = true;
		setRotation(LTopE, 0F, 0F, 0F);
		LTopW = new ModelRenderer(this, 90, 0);
		LTopW.addBox(0F, 0F, 0F, 1, 1, 3);
		LTopW.setRotationPoint(-6F, 8F, 2F);
		LTopW.setTextureSize(128, 128);
		LTopW.mirror = true;
		setRotation(LTopW, 0F, 0F, 0F);
		FrontPanel = new ModelRenderer(this, 0, 49);
		FrontPanel.addBox(0F, 0F, 0F, 8, 9, 1);
		FrontPanel.setRotationPoint(-4F, 13F, -5F);
		FrontPanel.setTextureSize(128, 128);
		FrontPanel.mirror = true;
		setRotation(FrontPanel, 0F, 0F, 0F);
		FrontConnection = new ModelRenderer(this, 0, 59);
		FrontConnection.addBox(0F, 0F, 0F, 4, 4, 2);
		FrontConnection.setRotationPoint(-2F, 14F, -7F);
		FrontConnection.setTextureSize(128, 128);
		FrontConnection.mirror = true;
		setRotation(FrontConnection, 0F, 0F, 0F);
		RightConnection = new ModelRenderer(this, 98, 0);
		RightConnection.addBox(0F, 0F, 0F, 2, 4, 4);
		RightConnection.setRotationPoint(5F, 14F, -2F);
		RightConnection.setTextureSize(128, 128);
		RightConnection.mirror = true;
		setRotation(RightConnection, 0F, 0F, 0F);
		LeftConnection = new ModelRenderer(this, 98, 0);
		LeftConnection.addBox(0F, 0F, 0F, 2, 4, 4);
		LeftConnection.setRotationPoint(-7F, 14F, -2F);
		LeftConnection.setTextureSize(128, 128);
		LeftConnection.mirror = true;
		setRotation(LeftConnection, 0F, 0F, 0F);
		LGlassT = new ModelRenderer(this, 36, 17);
		LGlassT.addBox(0F, 0F, 0F, 3, 1, 3);
		LGlassT.setRotationPoint(-5F, 8F, 2F);
		LGlassT.setTextureSize(128, 128);
		LGlassT.mirror = true;
		setRotation(LGlassT, 0F, 0F, 0F);
		RGlassT = new ModelRenderer(this, 36, 17);
		RGlassT.addBox(0F, 0F, 0F, 3, 1, 3);
		RGlassT.setRotationPoint(2F, 8F, 2F);
		RGlassT.setTextureSize(128, 128);
		RGlassT.mirror = true;
		setRotation(RGlassT, 0F, 0F, 0F);
		LGlassS = new ModelRenderer(this, 48, 17);
		LGlassS.addBox(0F, 0F, 0F, 3, 14, 1);
		LGlassS.setRotationPoint(-5F, 9F, 5F);
		LGlassS.setTextureSize(128, 128);
		LGlassS.mirror = true;
		setRotation(LGlassS, 0F, 0F, 0F);
		RGlassS = new ModelRenderer(this, 48, 17);
		RGlassS.addBox(0F, 0F, 0F, 3, 14, 1);
		RGlassS.setRotationPoint(2F, 9F, 5F);
		RGlassS.setTextureSize(128, 128);
		RGlassS.mirror = true;
		setRotation(RGlassS, 0F, 0F, 0F);
		RGlassN = new ModelRenderer(this, 48, 17);
		RGlassN.addBox(0F, 0F, 0F, 3, 14, 1);
		RGlassN.setRotationPoint(2F, 9F, 1F);
		RGlassN.setTextureSize(128, 128);
		RGlassN.mirror = true;
		setRotation(RGlassN, 0F, 0F, 0F);
		LGlassN = new ModelRenderer(this, 48, 17);
		LGlassN.addBox(0F, 0F, 0F, 3, 14, 1);
		LGlassN.setRotationPoint(-5F, 9F, 1F);
		LGlassN.setTextureSize(128, 128);
		LGlassN.mirror = true;
		setRotation(LGlassN, 0F, 0F, 0F);
		LGlassL = new ModelRenderer(this, 0, 65);
		LGlassL.addBox(0F, 0F, 0F, 1, 14, 3);
		LGlassL.setRotationPoint(-6F, 9F, 2F);
		LGlassL.setTextureSize(128, 128);
		LGlassL.mirror = true;
		setRotation(LGlassL, 0F, 0F, 0F);
		RGlassR = new ModelRenderer(this, 0, 65);
		RGlassR.addBox(0F, 0F, 0F, 1, 14, 3);
		RGlassR.setRotationPoint(5F, 9F, 2F);
		RGlassR.setTextureSize(128, 128);
		RGlassR.mirror = true;
		setRotation(RGlassR, 0F, 0F, 0F);
		RGlassL = new ModelRenderer(this, 0, 65);
		RGlassL.addBox(0F, 0F, 0F, 1, 14, 3);
		RGlassL.setRotationPoint(1F, 9F, 2F);
		RGlassL.setTextureSize(128, 128);
		RGlassL.mirror = true;
		setRotation(RGlassL, 0F, 0F, 0F);
		LGlassR = new ModelRenderer(this, 0, 65);
		LGlassR.addBox(0F, 0F, 0F, 1, 14, 3);
		LGlassR.setRotationPoint(-2F, 9F, 2F);
		LGlassR.setTextureSize(128, 128);
		LGlassR.mirror = true;
		setRotation(LGlassR, 0F, 0F, 0F);
	}

	public void render(float size)
	{
		Base.render(size);
		GasExit.render(size);
		GasLeft.render(size);
		GasRight.render(size);
		MachineCore.render(size);
		TopPanel.render(size);
		SidePanel.render(size);
		LPanelNW.render(size);
		RPanelNW.render(size);
		RPanelNE.render(size);
		LPanelSW.render(size);
		RPanelSW.render(size);
		RPanelSE.render(size);
		LPanelNE.render(size);
		LPanelSE.render(size);
		LTopS.render(size);
		RTopN.render(size);
		LTopN.render(size);
		RTopS.render(size);
		RTopW.render(size);
		RTopE.render(size);
		LTopE.render(size);
		LTopW.render(size);
		FrontPanel.render(size);
		FrontConnection.render(size);

		GL11.glPushMatrix();
		GL11.glScalef(0.999F, 0.999F, 0.999F);
		RightConnection.render(size);
		LeftConnection.render(size);
		GL11.glPopMatrix();
	}

	public void renderGlass(float size)
	{
		GL11.glPushMatrix();
		MekanismRenderer.blendOn();
		GL11.glColor4f(1, 1, 1, 0.2F);

		LGlassT.render(size);
		RGlassT.render(size);
		LGlassS.render(size);
		RGlassS.render(size);
		RGlassN.render(size);
		LGlassN.render(size);
		LGlassL.render(size);
		RGlassR.render(size);
		RGlassL.render(size);
		LGlassR.render(size);

		MekanismRenderer.blendOff();
		GL11.glColor4f(1, 1, 1, 1);
		GL11.glPopMatrix();
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
