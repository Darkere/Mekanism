package mekanism.client.model;

import javax.annotation.Nonnull;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import mekanism.client.HolidayManager;
import mekanism.client.HolidayManager.May4;
import mekanism.client.render.MekanismRenderType;
import mekanism.client.render.MekanismRenderer;
import mekanism.client.render.MekanismRenderer.GlowInfo;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class ModelDigitalMiner extends Model {

    private static final ResourceLocation MINER_TEXTURE = MekanismUtils.getResource(ResourceType.RENDER, "digital_miner.png");
    private static final ResourceLocation OVERLAY_ON = MekanismUtils.getResource(ResourceType.RENDER, "digital_miner_overlay_on.png");
    private static final ResourceLocation OVERLAY_ON_MAY4 = MekanismUtils.getResource(ResourceType.RENDER, "digital_miner_overlay_on_may4.png");
    private static final ResourceLocation OVERLAY_OFF = MekanismUtils.getResource(ResourceType.RENDER, "digital_miner_overlay_off.png");
    private static final RenderType RENDER_TYPE_ON = MekanismRenderType.mekStandard(OVERLAY_ON);
    private static final RenderType RENDER_TYPE_ON_MAY4 = MekanismRenderType.mekStandard(OVERLAY_ON_MAY4);
    private static final RenderType RENDER_TYPE_OFF = MekanismRenderType.mekStandard(OVERLAY_OFF);

    private final RenderType RENDER_TYPE = getRenderType(MINER_TEXTURE);

    private final ModelRenderer keyboard;
    private final ModelRenderer keyboardBottom;
    private final ModelRenderer keyboardSupportExt1;
    private final ModelRenderer keyboardSupportExt2;
    private final ModelRenderer keyboardSupport1;
    private final ModelRenderer keyboardSupport2;
    private final ModelRenderer monitor1back;
    private final ModelRenderer monitor2back;
    private final ModelRenderer monitor3back;
    private final ModelRenderer monitorBar1;
    private final ModelRenderer monitorBar2;
    private final ModelRenderer led1;
    private final ModelRenderer led2;
    private final ModelRenderer led3;
    private final ModelRenderer monitorMount1;
    private final ModelRenderer monitorMount2;
    private final ModelRenderer frame1;
    private final ModelRenderer frame3;
    private final ModelRenderer plate5;
    private final ModelRenderer bracket1;
    private final ModelRenderer bracket2;
    private final ModelRenderer bracket3;
    private final ModelRenderer bracket4;
    private final ModelRenderer bracket5;
    private final ModelRenderer bracket6;
    private final ModelRenderer bracket7;
    private final ModelRenderer bracket8;
    private final ModelRenderer bracketPlate1;
    private final ModelRenderer bracketPlate2;
    private final ModelRenderer bracketPlate3;
    private final ModelRenderer bracketPlate4;
    private final ModelRenderer supportBeam1;
    private final ModelRenderer supportBeam2;
    private final ModelRenderer supportBeam3;
    private final ModelRenderer supportBeam4;
    private final ModelRenderer foot1;
    private final ModelRenderer foot2;
    private final ModelRenderer foot3;
    private final ModelRenderer foot4;
    private final ModelRenderer core;
    private final ModelRenderer powerCable1a;
    private final ModelRenderer powerCable1b;
    private final ModelRenderer powerCable2;
    private final ModelRenderer powerCable3;
    private final ModelRenderer powerConnector1;
    private final ModelRenderer powerConnector2a;
    private final ModelRenderer powerConnector2b;
    private final ModelRenderer powerCpnnector3a;
    private final ModelRenderer powerConnector3b;
    private final ModelRenderer frame2a;
    private final ModelRenderer frame2b;
    private final ModelRenderer frame2c;
    private final ModelRenderer frame2d;
    private final ModelRenderer monitor1;
    private final ModelRenderer monitor2;
    private final ModelRenderer monitor3;

    public ModelDigitalMiner() {
        super(RenderType::getEntitySolid);
        textureWidth = 256;
        textureHeight = 128;

        keyboard = new ModelRenderer(this, 120, 20);
        keyboard.addBox(0F, -3F, -1F, 10, 5, 1, false);
        keyboard.setRotationPoint(-5F, 14F, -5F);
        keyboard.setTextureSize(256, 128);
        keyboard.mirror = true;
        setRotation(keyboard, -1.082104F, 0.0174533F, 0F);
        keyboardBottom = new ModelRenderer(this, 120, 26);
        keyboardBottom.addBox(0F, -2.5F, -0.5F, 8, 4, 1, false);
        keyboardBottom.setRotationPoint(-4F, 14F, -5F);
        keyboardBottom.setTextureSize(256, 128);
        keyboardBottom.mirror = true;
        setRotation(keyboardBottom, -0.9075712F, 0F, 0F);
        keyboardSupportExt1 = new ModelRenderer(this, 138, 26);
        keyboardSupportExt1.addBox(0F, 0F, -1F, 1, 1, 1, false);
        keyboardSupportExt1.setRotationPoint(2F, 14F, -5F);
        keyboardSupportExt1.setTextureSize(256, 128);
        keyboardSupportExt1.mirror = true;
        setRotation(keyboardSupportExt1, 0F, 0F, 0F);
        keyboardSupportExt2 = new ModelRenderer(this, 138, 26);
        keyboardSupportExt2.addBox(0F, 0F, -1F, 1, 1, 1, false);
        keyboardSupportExt2.setRotationPoint(-3F, 14F, -5F);
        keyboardSupportExt2.setTextureSize(256, 128);
        keyboardSupportExt2.mirror = true;
        setRotation(keyboardSupportExt2, 0F, 0F, 0F);
        keyboardSupport1 = new ModelRenderer(this, 142, 20);
        keyboardSupport1.addBox(0F, -1F, 0F, 1, 2, 4, false);
        keyboardSupport1.setRotationPoint(-3F, 14F, -5F);
        keyboardSupport1.setTextureSize(256, 128);
        keyboardSupport1.mirror = true;
        setRotation(keyboardSupport1, 0F, 0F, 0F);
        keyboardSupport2 = new ModelRenderer(this, 142, 20);
        keyboardSupport2.addBox(0F, -1F, 0F, 1, 2, 4, false);
        keyboardSupport2.setRotationPoint(2F, 14F, -5F);
        keyboardSupport2.setTextureSize(256, 128);
        keyboardSupport2.mirror = true;
        setRotation(keyboardSupport2, 0F, 0F, 0F);
        monitor1back = new ModelRenderer(this, 88, 32);
        monitor1back.addBox(-13F, -3F, 0F, 12, 6, 1, false);
        monitor1back.setRotationPoint(-8F, 3F, -3F);
        monitor1back.setTextureSize(256, 128);
        monitor1back.mirror = true;
        setRotation(monitor1back, 0.0872665F, -0.2094395F, 0F);
        monitor2back = new ModelRenderer(this, 88, 32);
        monitor2back.addBox(0F, -4F, 0F, 12, 6, 1, false);
        monitor2back.setRotationPoint(-6F, 4F, -3F);
        monitor2back.setTextureSize(256, 128);
        monitor2back.mirror = true;
        setRotation(monitor2back, 0.0872665F, 0F, 0F);
        monitor3back = new ModelRenderer(this, 88, 32);
        monitor3back.addBox(1F, -3F, 0F, 12, 6, 1, false);
        monitor3back.setRotationPoint(8F, 3F, -3F);
        monitor3back.setTextureSize(256, 128);
        monitor3back.mirror = true;
        setRotation(monitor3back, 0.0872665F, 0.2094395F, 0F);
        monitorBar1 = new ModelRenderer(this, 114, 36);
        monitorBar1.addBox(-3.5F, -2F, -0.2F, 4, 2, 1, false);
        monitorBar1.setRotationPoint(-6F, 4F, -3F);
        monitorBar1.setTextureSize(256, 128);
        monitorBar1.mirror = true;
        setRotation(monitorBar1, 0.0872665F, -0.0523599F, 0F);
        monitorBar2 = new ModelRenderer(this, 114, 36);
        monitorBar2.addBox(0.5F, -2F, -0.2F, 4, 2, 1, false);
        monitorBar2.setRotationPoint(5F, 4F, -3F);
        monitorBar2.setTextureSize(256, 128);
        monitorBar2.mirror = true;
        setRotation(monitorBar2, 0.0872665F, 0.0523599F, 0F);
        led1 = new ModelRenderer(this, 0, 0);
        led1.addBox(-2F, 4.5F, -1.9F, 1, 1, 1, false);
        led1.setRotationPoint(-8F, 3F, -3F);
        led1.setTextureSize(256, 128);
        led1.mirror = true;
        setRotation(led1, 0.0872665F, -0.2094395F, 0F);
        led2 = new ModelRenderer(this, 0, 0);
        led2.addBox(12F, 4.466667F, -1.9F, 1, 1, 1, false);
        led2.setRotationPoint(-7F, 3F, -3F);
        led2.setTextureSize(256, 128);
        led2.mirror = true;
        setRotation(led2, 0.0872665F, 0F, 0F);
        led3 = new ModelRenderer(this, 0, 0);
        led3.addBox(12F, 4.5F, -1.9F, 1, 1, 1, false);
        led3.setRotationPoint(8F, 3F, -3F);
        led3.setTextureSize(256, 128);
        led3.mirror = true;
        setRotation(led3, 0.0872665F, 0.2094395F, 0F);
        monitorMount1 = new ModelRenderer(this, 114, 32);
        monitorMount1.addBox(0F, -1F, 0F, 2, 2, 2, false);
        monitorMount1.setRotationPoint(-4F, 3F, -3F);
        monitorMount1.setTextureSize(256, 128);
        monitorMount1.mirror = true;
        setRotation(monitorMount1, 0F, 0F, 0F);
        monitorMount2 = new ModelRenderer(this, 114, 32);
        monitorMount2.addBox(0F, -1F, 0F, 2, 2, 2, false);
        monitorMount2.setRotationPoint(2F, 3F, -3F);
        monitorMount2.setTextureSize(256, 128);
        monitorMount2.mirror = true;
        setRotation(monitorMount2, 0F, 0F, 0F);
        frame1 = new ModelRenderer(this, 0, 0);
        frame1.addBox(0F, 0F, 0F, 32, 29, 12, false);
        frame1.setRotationPoint(-16F, -8F, -1F);
        frame1.setTextureSize(256, 128);
        frame1.mirror = true;
        setRotation(frame1, 0F, 0F, 0F);
        frame3 = new ModelRenderer(this, 0, 0);
        frame3.addBox(0F, 0F, 0F, 32, 29, 12, false);
        frame3.setRotationPoint(-16F, -8F, 28F);
        frame3.setTextureSize(256, 128);
        frame3.mirror = true;
        setRotation(frame3, 0F, 0F, 0F);
        plate5 = new ModelRenderer(this, 88, 90);
        plate5.addBox(0F, 0F, 0F, 32, 5, 15, false);
        plate5.setRotationPoint(-16F, 16F, 12F);
        plate5.setTextureSize(256, 128);
        plate5.mirror = true;
        setRotation(plate5, 0F, 0F, 0F);
        bracket1 = new ModelRenderer(this, 16, 85);
        bracket1.addBox(0F, 0F, 0F, 5, 5, 2, false);
        bracket1.setRotationPoint(-21F, -5F, 0F);
        bracket1.setTextureSize(256, 128);
        bracket1.mirror = true;
        setRotation(bracket1, 0F, 0F, 0F);
        bracket2 = new ModelRenderer(this, 16, 85);
        bracket2.addBox(0F, 0F, 0F, 5, 5, 2, false);
        bracket2.setRotationPoint(-21F, -5F, 8F);
        bracket2.setTextureSize(256, 128);
        bracket2.mirror = true;
        setRotation(bracket2, 0F, 0F, 0F);
        bracket3 = new ModelRenderer(this, 16, 85);
        bracket3.addBox(0F, 0F, 0F, 5, 5, 2, false);
        bracket3.setRotationPoint(-21F, -5F, 29F);
        bracket3.setTextureSize(256, 128);
        bracket3.mirror = true;
        setRotation(bracket3, 0F, 0F, 0F);
        bracket4 = new ModelRenderer(this, 16, 85);
        bracket4.addBox(0F, 0F, 0F, 5, 5, 2, false);
        bracket4.setRotationPoint(-21F, -5F, 37F);
        bracket4.setTextureSize(256, 128);
        bracket4.mirror = true;
        setRotation(bracket4, 0F, 0F, 0F);
        bracket5 = new ModelRenderer(this, 16, 85);
        bracket5.addBox(0F, 0F, 0F, 5, 5, 2, false);
        bracket5.setRotationPoint(16F, -5F, 0F);
        bracket5.setTextureSize(256, 128);
        bracket5.mirror = true;
        setRotation(bracket5, 0F, 0F, 0F);
        bracket5.mirror = false;
        bracket6 = new ModelRenderer(this, 16, 85);
        bracket6.addBox(0F, 0F, 0F, 5, 5, 2, false);
        bracket6.setRotationPoint(16F, -5F, 8F);
        bracket6.setTextureSize(256, 128);
        bracket6.mirror = true;
        setRotation(bracket6, 0F, 0F, 0F);
        bracket7 = new ModelRenderer(this, 16, 85);
        bracket7.addBox(0F, 0F, 0F, 5, 5, 2, false);
        bracket7.setRotationPoint(16F, -5F, 29F);
        bracket7.setTextureSize(256, 128);
        bracket7.mirror = true;
        setRotation(bracket7, 0F, 0F, 0F);
        bracket8 = new ModelRenderer(this, 16, 85);
        bracket8.addBox(0F, 0F, 0F, 5, 5, 2, false);
        bracket8.setRotationPoint(16F, -5F, 37F);
        bracket8.setTextureSize(256, 128);
        bracket8.mirror = true;
        setRotation(bracket8, 0F, 0F, 0F);
        bracket8.mirror = false;
        bracketPlate1 = new ModelRenderer(this, 30, 85);
        bracketPlate1.addBox(0F, 0F, 0F, 1, 5, 6, false);
        bracketPlate1.setRotationPoint(-17F, -5F, 2F);
        bracketPlate1.setTextureSize(256, 128);
        bracketPlate1.mirror = true;
        setRotation(bracketPlate1, 0F, 0F, 0F);
        bracketPlate2 = new ModelRenderer(this, 30, 85);
        bracketPlate2.addBox(0F, 0F, 0F, 1, 5, 6, false);
        bracketPlate2.setRotationPoint(-17F, -5F, 31F);
        bracketPlate2.setTextureSize(256, 128);
        bracketPlate2.mirror = true;
        setRotation(bracketPlate2, 0F, 0F, 0F);
        bracketPlate3 = new ModelRenderer(this, 30, 85);
        bracketPlate3.addBox(0F, 0F, 0F, 1, 5, 6, false);
        bracketPlate3.setRotationPoint(16F, -5F, 2F);
        bracketPlate3.setTextureSize(256, 128);
        bracketPlate3.mirror = true;
        setRotation(bracketPlate3, 0F, 0F, 0F);
        bracketPlate4 = new ModelRenderer(this, 30, 85);
        bracketPlate4.addBox(0F, 0F, 0F, 1, 5, 6, false);
        bracketPlate4.setRotationPoint(16F, -5F, 31F);
        bracketPlate4.setTextureSize(256, 128);
        bracketPlate4.mirror = true;
        setRotation(bracketPlate4, 0F, 0F, 0F);
        supportBeam1 = new ModelRenderer(this, 0, 85);
        supportBeam1.addBox(0F, 0F, 0F, 4, 28, 8, false);
        supportBeam1.setRotationPoint(-22F, -6F, 1F);
        supportBeam1.setTextureSize(256, 128);
        supportBeam1.mirror = true;
        setRotation(supportBeam1, 0F, 0F, 0F);
        supportBeam2 = new ModelRenderer(this, 0, 85);
        supportBeam2.addBox(0F, 0F, 0F, 4, 28, 8, false);
        supportBeam2.setRotationPoint(-22F, -6F, 30F);
        supportBeam2.setTextureSize(256, 128);
        supportBeam2.mirror = true;
        setRotation(supportBeam2, 0F, 0F, 0F);
        supportBeam3 = new ModelRenderer(this, 0, 85);
        supportBeam3.addBox(0F, 0F, 0F, 4, 28, 8, false);
        supportBeam3.setRotationPoint(18F, -6F, 1F);
        supportBeam3.setTextureSize(256, 128);
        supportBeam3.mirror = true;
        setRotation(supportBeam3, 0F, 0F, 0F);
        supportBeam4 = new ModelRenderer(this, 0, 85);
        supportBeam4.addBox(0F, 0F, 0F, 4, 28, 8, false);
        supportBeam4.setRotationPoint(18F, -6F, 30F);
        supportBeam4.setTextureSize(256, 128);
        supportBeam4.mirror = true;
        setRotation(supportBeam4, 0F, 0F, 0F);
        supportBeam4.mirror = false;
        foot1 = new ModelRenderer(this, 44, 85);
        foot1.addBox(0F, 0F, 0F, 7, 2, 10, false);
        foot1.setRotationPoint(-23F, 22F, 0F);
        foot1.setTextureSize(256, 128);
        foot1.mirror = true;
        setRotation(foot1, 0F, 0F, 0F);
        foot2 = new ModelRenderer(this, 44, 85);
        foot2.addBox(0F, 0F, 0F, 7, 2, 10, false);
        foot2.setRotationPoint(-23F, 22F, 29F);
        foot2.setTextureSize(256, 128);
        foot2.mirror = true;
        setRotation(foot2, 0F, 0F, 0F);
        foot3 = new ModelRenderer(this, 44, 85);
        foot3.addBox(0F, 0F, 0F, 7, 2, 10, false);
        foot3.setRotationPoint(16F, 22F, 29F);
        foot3.setTextureSize(256, 128);
        foot3.mirror = true;
        setRotation(foot3, 0F, 0F, 0F);
        foot4 = new ModelRenderer(this, 44, 85);
        foot4.addBox(0F, 0F, 0F, 7, 2, 10, false);
        foot4.setRotationPoint(16F, 22F, 0F);
        foot4.setTextureSize(256, 128);
        foot4.mirror = true;
        setRotation(foot4, 0F, 0F, 0F);
        core = new ModelRenderer(this, 0, 41);
        core.addBox(0F, 0F, 0F, 30, 27, 17, false);
        core.setRotationPoint(-15F, -7F, 11F);
        core.setTextureSize(256, 128);
        core.mirror = true;
        setRotation(core, 0F, 0F, 0F);
        powerCable1a = new ModelRenderer(this, 88, 39);
        powerCable1a.addBox(0F, 0F, 0F, 6, 2, 11, false);
        powerCable1a.setRotationPoint(-3F, 20F, 2F);
        powerCable1a.setTextureSize(256, 128);
        powerCable1a.mirror = true;
        setRotation(powerCable1a, 0F, 0F, 0F);
        powerCable1b = new ModelRenderer(this, 94, 52);
        powerCable1b.addBox(0F, 0F, 0F, 6, 3, 6, false);
        powerCable1b.setRotationPoint(-3F, 20F, 13F);
        powerCable1b.setTextureSize(256, 128);
        powerCable1b.mirror = true;
        setRotation(powerCable1b, 0F, 0F, 0F);
        powerCable2 = new ModelRenderer(this, 42, 109);
        powerCable2.addBox(0F, 0F, 0F, 9, 6, 6, false);
        powerCable2.setRotationPoint(14F, 13F, 13F);
        powerCable2.setTextureSize(256, 128);
        powerCable2.mirror = true;
        setRotation(powerCable2, 0F, 0F, 0F);
        powerCable3 = new ModelRenderer(this, 42, 109);
        powerCable3.addBox(0F, 0F, 0F, 9, 6, 6, false);
        powerCable3.setRotationPoint(-23F, 13F, 13F);
        powerCable3.setTextureSize(256, 128);
        powerCable3.mirror = true;
        setRotation(powerCable3, 0F, 0F, 0F);
        powerConnector1 = new ModelRenderer(this, 94, 61);
        powerConnector1.addBox(0F, 0F, 0F, 8, 1, 8, false);
        powerConnector1.setRotationPoint(-4F, 23F, 12F);
        powerConnector1.setTextureSize(256, 128);
        powerConnector1.mirror = true;
        setRotation(powerConnector1, 0F, 0F, 0F);
        powerConnector2a = new ModelRenderer(this, 24, 105);
        powerConnector2a.addBox(0F, 0F, 0F, 1, 8, 8, false);
        powerConnector2a.setRotationPoint(23F, 12F, 12F);
        powerConnector2a.setTextureSize(256, 128);
        powerConnector2a.mirror = true;
        setRotation(powerConnector2a, 0F, 0F, 0F);
        powerConnector2b = new ModelRenderer(this, 24, 105);
        powerConnector2b.addBox(0F, 0F, 0F, 1, 8, 8, false);
        powerConnector2b.setRotationPoint(16F, 12F, 12F);
        powerConnector2b.setTextureSize(256, 128);
        powerConnector2b.mirror = true;
        setRotation(powerConnector2b, 0F, 0F, 0F);
        powerCpnnector3a = new ModelRenderer(this, 24, 105);
        powerCpnnector3a.addBox(0F, 0F, 0F, 1, 8, 8, false);
        powerCpnnector3a.setRotationPoint(-24F, 12F, 12F);
        powerCpnnector3a.setTextureSize(256, 128);
        powerCpnnector3a.mirror = true;
        setRotation(powerCpnnector3a, 0F, 0F, 0F);
        powerConnector3b = new ModelRenderer(this, 24, 105);
        powerConnector3b.addBox(0F, 0F, 0F, 1, 8, 8, false);
        powerConnector3b.setRotationPoint(-17F, 12F, 12F);
        powerConnector3b.setTextureSize(256, 128);
        powerConnector3b.mirror = true;
        setRotation(powerConnector3b, 0F, 0F, 0F);
        frame2a = new ModelRenderer(this, 88, 0);
        frame2a.addBox(0F, 0F, 0F, 32, 5, 15, false);
        frame2a.setRotationPoint(-16F, -8F, 12F);
        frame2a.setTextureSize(256, 128);
        frame2a.mirror = true;
        setRotation(frame2a, 0F, 0F, 0F);
        frame2b = new ModelRenderer(this, 126, 50);
        frame2b.addBox(0F, 0F, 0F, 32, 5, 15, false);
        frame2b.setRotationPoint(-16F, -2F, 12F);
        frame2b.setTextureSize(256, 128);
        frame2b.mirror = true;
        setRotation(frame2b, 0F, 0F, 0F);
        frame2c = new ModelRenderer(this, 126, 50);
        frame2c.addBox(0F, 0F, 0F, 32, 5, 15, false);
        frame2c.setRotationPoint(-16F, 4F, 12F);
        frame2c.setTextureSize(256, 128);
        frame2c.mirror = true;
        setRotation(frame2c, 0F, 0F, 0F);
        frame2d = new ModelRenderer(this, 88, 70);
        frame2d.addBox(0F, 0F, 0F, 32, 5, 15, false);
        frame2d.setRotationPoint(-16F, 10F, 12F);
        frame2d.setTextureSize(256, 128);
        frame2d.mirror = true;
        setRotation(frame2d, 0F, 0F, 0F);
        monitor1 = new ModelRenderer(this, 88, 20);
        monitor1.addBox(-14F, -5F, -2F, 14, 10, 2, false);
        monitor1.setRotationPoint(-8F, 3F, -3F);
        monitor1.setTextureSize(256, 128);
        monitor1.mirror = true;
        setRotation(monitor1, 0.0872665F, -0.2094395F, 0F);
        monitor2 = new ModelRenderer(this, 88, 20);
        monitor2.addBox(0F, -5F, -2F, 14, 10, 2, false);
        monitor2.setRotationPoint(-7F, 3F, -3F);
        monitor2.setTextureSize(256, 128);
        monitor2.mirror = true;
        setRotation(monitor2, 0.0872665F, 0F, 0F);
        monitor3 = new ModelRenderer(this, 88, 20);
        monitor3.addBox(0F, -5F, -2F, 14, 10, 2, false);
        monitor3.setRotationPoint(8F, 3F, -3F);
        monitor3.setTextureSize(256, 128);
        monitor3.mirror = true;
        setRotation(monitor3, 0.0872665F, 0.2094395F, 0F);
    }

    public void render(@Nonnull MatrixStack matrix, @Nonnull IRenderTypeBuffer renderer, int light, int overlayLight, boolean on) {
        render(matrix, renderer.getBuffer(RENDER_TYPE), light, overlayLight, 1, 1, 1, 1);
        matrix.push();
        matrix.scale(1.001F, 1.001F, 1.001F);
        matrix.translate(-0.0011, -0.0011, -0.0011);
        GlowInfo glowInfo = MekanismRenderer.enableGlow();
        boolean may4 = HolidayManager.getHoliday() instanceof May4;
        render(matrix, renderer.getBuffer(on ? (may4 ? RENDER_TYPE_ON_MAY4 : RENDER_TYPE_ON) : RENDER_TYPE_OFF), light, overlayLight, 1, 1, 1, 1);
        MekanismRenderer.disableGlow(glowInfo);
        matrix.pop();
    }

    @Override
    public void render(@Nonnull MatrixStack matrix, @Nonnull IVertexBuilder vertexBuilder, int light, int overlayLight, float red, float green, float blue,
          float alpha) {
        keyboard.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        keyboardBottom.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        keyboardSupportExt1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        keyboardSupportExt2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        keyboardSupport1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        keyboardSupport2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        monitor1back.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        monitor2back.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        monitor3back.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        monitorBar1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        monitorBar2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        led1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        led2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        led3.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        monitor1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        monitor2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        monitor3.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        monitorMount1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        monitorMount2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frame1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frame3.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        plate5.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bracket1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bracket2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bracket3.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bracket4.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bracket5.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bracket6.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bracket7.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bracket8.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bracketPlate1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bracketPlate2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bracketPlate3.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        bracketPlate4.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        supportBeam1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        supportBeam2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        supportBeam3.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        supportBeam4.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        foot1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        foot2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        foot3.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        foot4.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        core.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        powerCable1a.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        powerCable1b.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        powerCable2.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        powerCable3.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        powerConnector1.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        powerConnector2a.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        powerConnector2b.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        powerCpnnector3a.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        powerConnector3b.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frame2a.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frame2b.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frame2c.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
        frame2d.render(matrix, vertexBuilder, light, overlayLight, red, green, blue, alpha);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}