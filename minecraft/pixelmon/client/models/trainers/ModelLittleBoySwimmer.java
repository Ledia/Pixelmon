// Date: 2/17/2013 1:28:55 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.client.models.trainers;

import pixelmon.entities.pixelmon.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelLittleBoySwimmer extends ModelBase
{
  //fields
    ModelRenderer RightLeg;
    ModelRenderer LeftLeg;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Armtube1;
    ModelRenderer Armtube2;
    ModelRenderer Bodytube1;
    ModelRenderer Bodytube2;
    ModelRenderer Bodytube3;
    ModelRenderer Bodytube4;
    ModelRenderer RightArm;
    ModelRenderer LeftArm;
    ModelRenderer BodyPiece;
    ModelRenderer RightArmPiece;
    ModelRenderer LeftArmPiece;
  
  public ModelLittleBoySwimmer()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      BodyPiece = new ModelRenderer(this, "BodyPiece");
      BodyPiece.setRotationPoint(0, 0, 0);
      RightLeg = new ModelRenderer(this, 0, 0);
      RightLeg.addBox(0F, 0F, 0F, 1, 4, 1);
      RightLeg.setRotationPoint(-2F, 20F, 0F);
      RightLeg.setTextureSize(64, 32);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      BodyPiece.addChild(RightLeg);
      LeftLeg = new ModelRenderer(this, 0, 0);
      LeftLeg.addBox(0F, 0F, 0F, 1, 4, 1);
      LeftLeg.setRotationPoint(0F, 20F, 0F);
      LeftLeg.setTextureSize(64, 32);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      BodyPiece.addChild(LeftLeg);
      Body = new ModelRenderer(this, 12, 0);
      Body.addBox(0F, 0F, 0F, 4, 6, 2);
      Body.setRotationPoint(-2.5F, 14F, -0.5F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      BodyPiece.addChild(Body);
      Head = new ModelRenderer(this, 41, 0);
      Head.addBox(-2F, -4F, -1.5F, 4, 4, 3);
      Head.setRotationPoint(-0.5F, 14F, 0.5F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      BodyPiece.addChild(Head);
      RightArmPiece = new ModelRenderer(this, "Right Arm");
      RightArmPiece.setRotationPoint(-2.5F, 14, 0.5F);
      Armtube1 = new ModelRenderer(this, 26, 0);
      Armtube1.addBox(0F, 0F, 0F, 1, 3, 3);
      Armtube1.setRotationPoint(-1F, -1.5F, -1.5F);
      Armtube1.setTextureSize(64, 32);
      Armtube1.mirror = true;
      setRotation(Armtube1, 0F, 0F, 0F);
      RightArmPiece.addChild(Armtube1);
      LeftArmPiece = new ModelRenderer(this, "Left Arm");
      LeftArmPiece.setRotationPoint(1.5F, 14, 0.5F);
      Armtube2 = new ModelRenderer(this, 26, 0);
      Armtube2.addBox(0F, 0F, 0F, 1, 3, 3);
      Armtube2.setRotationPoint(0, -1.5F, -1.5F);
      Armtube2.setTextureSize(64, 32);
      Armtube2.mirror = true;
      setRotation(Armtube2, 0F, 0F, 0F);
      LeftArmPiece.addChild(Armtube2);
      Bodytube1 = new ModelRenderer(this, 0, 16);
      Bodytube1.addBox(0F, 0F, 0F, 4, 1, 1);
      Bodytube1.setRotationPoint(-2.5F, 18F, -1.5F);
      Bodytube1.setTextureSize(64, 32);
      Bodytube1.mirror = true;
      setRotation(Bodytube1, 0F, 0F, 0F);
      BodyPiece.addChild(Bodytube1);
      Bodytube2 = new ModelRenderer(this, 0, 13);
      Bodytube2.addBox(0F, 0F, 0F, 1, 1, 4);
      Bodytube2.setRotationPoint(1.5F, 18F, -1.5F);
      Bodytube2.setTextureSize(64, 32);
      Bodytube2.mirror = true;
      setRotation(Bodytube2, 0F, 0F, 0F);
      BodyPiece.addChild(Bodytube2);
      Bodytube3 = new ModelRenderer(this, 0, 16);
      Bodytube3.addBox(0F, 0F, 0F, 4, 1, 1);
      Bodytube3.setRotationPoint(-2.5F, 18F, 1.5F);
      Bodytube3.setTextureSize(64, 32);
      Bodytube3.mirror = true;
      setRotation(Bodytube3, 0F, 0F, 0F);
      BodyPiece.addChild(Bodytube3);
      Bodytube4 = new ModelRenderer(this, 0, 13);
      Bodytube4.addBox(0F, 0F, 0F, 1, 1, 4);
      Bodytube4.setRotationPoint(-3.5F, 18F, -1.5F);
      Bodytube4.setTextureSize(64, 32);
      Bodytube4.mirror = true;
      setRotation(Bodytube4, 0F, 0F, 0F);
      BodyPiece.addChild(Bodytube4);
      RightArm = new ModelRenderer(this, 0, 23);
      RightArm.addBox(-1F, 0F, -0.5F, 1, 5, 1);
      RightArm.setTextureSize(64, 32);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 0F, 0.2443461F);
      RightArmPiece.addChild(RightArm);
      LeftArm = new ModelRenderer(this, 0, 23);
      LeftArm.addBox(0F, 0F, -0.5F, 1, 5, 1);
      LeftArm.setTextureSize(64, 32);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, -0.2443461F);
      LeftArmPiece.addChild(LeftArm);
      BodyPiece.addChild(LeftArmPiece);
      BodyPiece.addChild(RightArmPiece);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    
    BodyPiece.render(f5);
    
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    
    Head.rotateAngleY = f3 / (180F / (float) Math.PI);
	Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
	RightLeg.rotateAngleY = 0.0F;
	LeftLeg.rotateAngleY = 0.0F;
	RightArmPiece.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * .5F * f1;
	LeftArmPiece.rotateAngleX = MathHelper.cos(f * 0.6662F) * .5F * f1;
  }

}
