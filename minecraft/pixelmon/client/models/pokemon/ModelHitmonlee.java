// Date: 4/22/2013 7:05:55 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;


import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumArm;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleArm;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelHitmonlee extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer Body;
  
  public ModelHitmonlee()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Body = new PixelmonModelRenderer(this, "Body");
      Body.setRotationPoint(0,-1,0);
      PixelmonModelRenderer  Waist_Middle = new PixelmonModelRenderer(this, 52, 0);
      Waist_Middle.addBox(-6F, -8F, -2F, 12, 8, 4);
      Waist_Middle.setRotationPoint(0F, 8F, 0F);
      Waist_Middle.setTextureSize(128, 64);
      Waist_Middle.mirror = true;
      setRotation(Waist_Middle, 0F, 0F, 0F);
      PixelmonModelRenderer  Waist_Middle_Front = new PixelmonModelRenderer(this, 84, 0);
      Waist_Middle_Front.addBox(-5F, -4F, -1F, 10, 8, 1);
      Waist_Middle_Front.setRotationPoint(0F, 4F, -2F);
      Waist_Middle_Front.setTextureSize(128, 64);
      Waist_Middle_Front.mirror = true;
      setRotation(Waist_Middle_Front, 0F, 0F, 0F);
      PixelmonModelRenderer  Waist_Middle_Front2 = new PixelmonModelRenderer(this, 84, 9);
      Waist_Middle_Front2.addBox(-5F, -4F, -1F, 10, 8, 1);
      Waist_Middle_Front2.setRotationPoint(0F, 4F, 3F);
      Waist_Middle_Front2.setTextureSize(128, 64);
      Waist_Middle_Front2.mirror = true;
      setRotation(Waist_Middle_Front2, 0F, 0F, 0F);
      PixelmonModelRenderer  Waist_Middle_Bottom = new PixelmonModelRenderer(this, 52, 12);
      Waist_Middle_Bottom.addBox(-5F, 0F, -2F, 10, 1, 4);
      Waist_Middle_Bottom.setRotationPoint(0F, 8F, 0F);
      Waist_Middle_Bottom.setTextureSize(128, 64);
      Waist_Middle_Bottom.mirror = true;
      setRotation(Waist_Middle_Bottom, 0F, 0F, 0F);
      PixelmonModelRenderer  Body_Middle = new PixelmonModelRenderer(this, 0, 46);
      Body_Middle.addBox(-7F, -12F, -3F, 14, 12, 6);
      Body_Middle.setTextureSize(128, 64);
      Body_Middle.mirror = true;
      setRotation(Body_Middle, 0F, 0F, 0F);
      PixelmonModelRenderer  Body_Front = new PixelmonModelRenderer(this, 40, 51);
      Body_Front.addBox(-6F, -6F, -1F, 12, 12, 1);
      Body_Front.setRotationPoint(0F, -6F, -3F);
      Body_Front.setTextureSize(128, 64);
      Body_Front.mirror = true;
      setRotation(Body_Front, 0F, 0F, 0F);
      PixelmonModelRenderer  Body_Top = new PixelmonModelRenderer(this, 0, 39);
      Body_Top.addBox(-6F, -1F, -3F, 12, 1, 6);
      Body_Top.setRotationPoint(0F, -12F, 0F);
      Body_Top.setTextureSize(128, 64);
      Body_Top.mirror = true;
      setRotation(Body_Top, 0F, 0F, 0F);
      PixelmonModelRenderer  Body_Back = new PixelmonModelRenderer(this, 40, 38);
      Body_Back.addBox(-6F, -6F, 0F, 12, 12, 1);
      Body_Back.setRotationPoint(0F, -6F, 3F);
      Body_Back.setTextureSize(128, 64);
      Body_Back.mirror = true;
      setRotation(Body_Back, 0F, 0F, 0F);
      PixelmonModelRenderer  Body_Toppest = new PixelmonModelRenderer(this, 0, 34);
      Body_Toppest.addBox(-4F, -1F, -2F, 8, 1, 4);
      Body_Toppest.setRotationPoint(0F, -13F, 0F);
      Body_Toppest.setTextureSize(128, 64);
      Body_Toppest.mirror = true;
      setRotation(Body_Toppest, 0F, 0F, 0F);
      Body.addChild(Waist_Middle);
      Body.addChild(Waist_Middle_Front);
      Body.addChild(Waist_Middle_Front2);
      Body.addChild(Waist_Middle_Bottom);
      Body.addChild(Body_Middle);
      Body.addChild(Body_Front);
      Body.addChild(Body_Top);
      Body.addChild(Body_Back);
      Body.addChild(Body_Toppest);
      
      
      PixelmonModelRenderer LeftArm = new PixelmonModelRenderer(this, "Left Arm");
      LeftArm.setRotationPoint(-5.5F, -7, 0);
      PixelmonModelRenderer   Shoulder_Left = new PixelmonModelRenderer(this, 106, 22);
      Shoulder_Left.addBox(-1.5F, 0F, -1.5F, 3, 7, 3);
      Shoulder_Left.setTextureSize(128, 64);
      Shoulder_Left.mirror = true;
      setRotation(Shoulder_Left, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer   Arm_Upper_Inner_Left = new PixelmonModelRenderer(this, 106, 32);
      Arm_Upper_Inner_Left.addBox(-1F, 0F, -1F, 2, 5, 2);
      Arm_Upper_Inner_Left.setRotationPoint(-2.8F, 5F, 0F);
      Arm_Upper_Inner_Left.setTextureSize(128, 64);
      Arm_Upper_Inner_Left.mirror = true;
      setRotation(Arm_Upper_Inner_Left, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer   Arm_Lower_Inner_Left = new PixelmonModelRenderer(this, 114, 32);
      Arm_Lower_Inner_Left.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
      Arm_Lower_Inner_Left.setRotationPoint(-5.1F, 9F, 0F);
      Arm_Lower_Inner_Left.setTextureSize(128, 64);
      Arm_Lower_Inner_Left.mirror = true;
      setRotation(Arm_Lower_Inner_Left, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer   Arm_Ring_1st_Left = new PixelmonModelRenderer(this, 118, 22);
      Arm_Ring_1st_Left.addBox(-1F, 0F, -1F, 2, 1, 2);
      Arm_Ring_1st_Left.setRotationPoint(-5.3F, 9.466667F, 0F);
      Arm_Ring_1st_Left.setTextureSize(128, 64);
      Arm_Ring_1st_Left.mirror = true;
      setRotation(Arm_Ring_1st_Left, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer   Arm_Ring_2nd_Left = new PixelmonModelRenderer(this, 118, 22);
      Arm_Ring_2nd_Left.addBox(-1F, 0F, -1F, 2, 1, 2);
      Arm_Ring_2nd_Left.setRotationPoint(-5.9F, 10.466667F, 0F);
      Arm_Ring_2nd_Left.setTextureSize(128, 64);
      Arm_Ring_2nd_Left.mirror = true;
      setRotation(Arm_Ring_2nd_Left, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer   Arm_Ring_3rd_Left = new PixelmonModelRenderer(this, 118, 22);
      Arm_Ring_3rd_Left.addBox(-1F, 0F, -1F, 2, 1, 2);
      Arm_Ring_3rd_Left.setRotationPoint(-6.5F, 11.466667F, 0F);
      Arm_Ring_3rd_Left.setTextureSize(128, 64);
      Arm_Ring_3rd_Left.mirror = true;
      setRotation(Arm_Ring_3rd_Left, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer   Arm_Ring_4th_Left = new PixelmonModelRenderer(this, 118, 22);
      Arm_Ring_4th_Left.addBox(-1F, 0F, -1F, 2, 1, 2);
      Arm_Ring_4th_Left.setRotationPoint(-7.1F, 12.466667F, 0F);
      Arm_Ring_4th_Left.setTextureSize(128, 64);
      Arm_Ring_4th_Left.mirror = true;
      setRotation(Arm_Ring_4th_Left, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer   Palm_Left = new PixelmonModelRenderer(this, 106, 39);
      Palm_Left.addBox(-1F, 0F, -1.5F, 2, 2, 3);
      Palm_Left.setRotationPoint(-8F, 13.7F, 0F);
      Palm_Left.setTextureSize(128, 64);
      Palm_Left.mirror = true;
      setRotation(Palm_Left, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer   Finger_2nd_Left = new PixelmonModelRenderer(this, 118, 25);
      Finger_2nd_Left.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Finger_2nd_Left.setRotationPoint(-8.7F, 14.7F, 0F);
      Finger_2nd_Left.setTextureSize(128, 64);
      Finger_2nd_Left.mirror = true;
      setRotation(Finger_2nd_Left, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer   Finger_1st_Left = new PixelmonModelRenderer(this, 118, 25);
      Finger_1st_Left.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Finger_1st_Left.setRotationPoint(-8.7F, 14.7F, -1.5F);
      Finger_1st_Left.setTextureSize(128, 64);
      Finger_1st_Left.mirror = true;
      setRotation(Finger_1st_Left, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer   Finger_3rd_Left = new PixelmonModelRenderer(this, 118, 25);
      Finger_3rd_Left.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Finger_3rd_Left.setRotationPoint(-8.7F, 14.7F, 1.5F);
      Finger_3rd_Left.setTextureSize(128, 64);
      Finger_3rd_Left.mirror = true;
      setRotation(Finger_3rd_Left, 0F, 0F, 0.5235988F);
      LeftArm.addChild(Shoulder_Left);
      LeftArm.addChild(Arm_Upper_Inner_Left);
      LeftArm.addChild(Arm_Lower_Inner_Left);
      LeftArm.addChild(Arm_Ring_1st_Left);
      LeftArm.addChild(Arm_Ring_2nd_Left);
      LeftArm.addChild(Arm_Ring_3rd_Left);
      LeftArm.addChild(Arm_Ring_4th_Left);
      LeftArm.addChild(Palm_Left);
      LeftArm.addChild(Finger_2nd_Left);
      LeftArm.addChild(Finger_1st_Left);
      LeftArm.addChild(Finger_3rd_Left);
      Body.addChild(LeftArm);
      
      PixelmonModelRenderer RightArm = new PixelmonModelRenderer(this, "Right Arm");
      RightArm.setRotationPoint(5.5F, -7, 0);
      PixelmonModelRenderer  Shoulder_Right = new PixelmonModelRenderer(this, 106, 0);
      Shoulder_Right.addBox(-1.5F, 0F, -1.5F, 3, 7, 3);
      Shoulder_Right.setTextureSize(128, 64);
      Shoulder_Right.mirror = true;
      setRotation(Shoulder_Right, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer  Arm_Upper_Inner_Right = new PixelmonModelRenderer(this, 106, 10);
      Arm_Upper_Inner_Right.addBox(-1F, 0F, -1F, 2, 5, 2);
      Arm_Upper_Inner_Right.setRotationPoint(2.8F, 5F, 0F);
      Arm_Upper_Inner_Right.setTextureSize(128, 64);
      Arm_Upper_Inner_Right.mirror = true;
      setRotation(Arm_Upper_Inner_Right, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer  Arm_Lower_Inner_Right = new PixelmonModelRenderer(this, 114, 10);
      Arm_Lower_Inner_Right.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
      Arm_Lower_Inner_Right.setRotationPoint(5.1F, 9F, 0F);
      Arm_Lower_Inner_Right.setTextureSize(128, 64);
      Arm_Lower_Inner_Right.mirror = true;
      setRotation(Arm_Lower_Inner_Right, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer  Arm_Ring_1st_Right = new PixelmonModelRenderer(this, 118, 0);
      Arm_Ring_1st_Right.addBox(-1F, 0F, -1F, 2, 1, 2);
      Arm_Ring_1st_Right.setRotationPoint(5.3F, 9.466667F, 0F);
      Arm_Ring_1st_Right.setTextureSize(128, 64);
      Arm_Ring_1st_Right.mirror = true;
      setRotation(Arm_Ring_1st_Right, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer  Arm_Ring_2nd_Right = new PixelmonModelRenderer(this, 118, 0);
      Arm_Ring_2nd_Right.addBox(-1F, 0F, -1F, 2, 1, 2);
      Arm_Ring_2nd_Right.setRotationPoint(5.9F, 10.466667F, 0F);
      Arm_Ring_2nd_Right.setTextureSize(128, 64);
      Arm_Ring_2nd_Right.mirror = true;
      setRotation(Arm_Ring_2nd_Right, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer  Arm_Ring_3rd_Right = new PixelmonModelRenderer(this, 118, 0);
      Arm_Ring_3rd_Right.addBox(-1F, 0F, -1F, 2, 1, 2);
      Arm_Ring_3rd_Right.setRotationPoint(6.5F, 11.466667F, 0F);
      Arm_Ring_3rd_Right.setTextureSize(128, 64);
      Arm_Ring_3rd_Right.mirror = true;
      setRotation(Arm_Ring_3rd_Right, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer  Arm_Ring_4th_Right = new PixelmonModelRenderer(this, 118, 0);
      Arm_Ring_4th_Right.addBox(-1F, 0F, -1F, 2, 1, 2);
      Arm_Ring_4th_Right.setRotationPoint(7.1F, 12.466667F, 0F);
      Arm_Ring_4th_Right.setTextureSize(128, 64);
      Arm_Ring_4th_Right.mirror = true;
      setRotation(Arm_Ring_4th_Right, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer  Palm_Right = new PixelmonModelRenderer(this, 106, 17);
      Palm_Right.addBox(-1F, 0F, -1.5F, 2, 2, 3);
      Palm_Right.setRotationPoint(8F, 13.7F, 0F);
      Palm_Right.setTextureSize(128, 64);
      Palm_Right.mirror = true;
      setRotation(Palm_Right, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer  Finger_1st_Right = new PixelmonModelRenderer(this, 118, 3);
      Finger_1st_Right.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Finger_1st_Right.setRotationPoint(8.7F, 14.7F, -1.5F);
      Finger_1st_Right.setTextureSize(128, 64);
      Finger_1st_Right.mirror = true;
      setRotation(Finger_1st_Right, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer  Finger_2nd_Right = new PixelmonModelRenderer(this, 118, 3);
      Finger_2nd_Right.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Finger_2nd_Right.setRotationPoint(8.7F, 14.7F, 0F);
      Finger_2nd_Right.setTextureSize(128, 64);
      Finger_2nd_Right.mirror = true;
      setRotation(Finger_2nd_Right, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer  Finger_3rd_Right = new PixelmonModelRenderer(this, 118, 3);
      Finger_3rd_Right.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
      Finger_3rd_Right.setRotationPoint(8.7F, 14.7F, 1.5F);
      Finger_3rd_Right.setTextureSize(128, 64);
      Finger_3rd_Right.mirror = true;
      setRotation(Finger_3rd_Right, 0F, 0F, -0.5235988F);
      RightArm.addChild(Shoulder_Right);
      RightArm.addChild(Arm_Upper_Inner_Right);
      RightArm.addChild(Arm_Lower_Inner_Right);
      RightArm.addChild(Arm_Ring_1st_Right);
      RightArm.addChild(Arm_Ring_2nd_Right);
      RightArm.addChild(Arm_Ring_3rd_Right);
      RightArm.addChild(Arm_Ring_4th_Right);
      RightArm.addChild(Palm_Right);
      RightArm.addChild(Finger_1st_Right);
      RightArm.addChild(Finger_2nd_Right);
      RightArm.addChild(Finger_3rd_Right);
      Body.addChild(RightArm);
      
      
      PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this, "Left Leg");
      LeftLeg.setRotationPoint(-4.5F, 7, 0);
      PixelmonModelRenderer   Leg_Claw_1st_Left = new PixelmonModelRenderer(this, 0, 0);
      Leg_Claw_1st_Left.addBox(-0.5F, -0.5F, -2F, 1, 1, 2);
      Leg_Claw_1st_Left.setRotationPoint(-1F, 17.5F, -2.9F);
      Leg_Claw_1st_Left.setTextureSize(128, 64);
      Leg_Claw_1st_Left.mirror = true;
      setRotation(Leg_Claw_1st_Left, 0F, 0.2617994F, 0F);
      PixelmonModelRenderer   Leg_Claw_2nd_Left = new PixelmonModelRenderer(this, 0, 0);
      Leg_Claw_2nd_Left.addBox(-0.5F, -0.5F, -2F, 1, 1, 2);
      Leg_Claw_2nd_Left.setRotationPoint(0F, 17.5F, -3F);
      Leg_Claw_2nd_Left.setTextureSize(128, 64);
      Leg_Claw_2nd_Left.mirror = true;
      setRotation(Leg_Claw_2nd_Left, 0F, 0F, 0F);
      PixelmonModelRenderer   Leg_Claw_3rd_Left = new PixelmonModelRenderer(this, 0, 0);
      Leg_Claw_3rd_Left.addBox(-0.5F, -0.5F, -2F, 1, 1, 2);
      Leg_Claw_3rd_Left.setRotationPoint(1F, 17.5F, -2.9F);
      Leg_Claw_3rd_Left.setTextureSize(128, 64);
      Leg_Claw_3rd_Left.mirror = true;
      setRotation(Leg_Claw_3rd_Left, 0F, -0.2617994F, 0F);
      PixelmonModelRenderer   Leg_Bottom_Left = new PixelmonModelRenderer(this, 6, 16);
      Leg_Bottom_Left.addBox(-2F, 0F, -3F, 4, 2, 5);
      Leg_Bottom_Left.setRotationPoint(0F, 16F, 0F);
      Leg_Bottom_Left.setTextureSize(128, 64);
      Leg_Bottom_Left.mirror = true;
      setRotation(Leg_Bottom_Left, 0F, 0F, 0F);
      PixelmonModelRenderer   Leg_Middle_6th_Left = new PixelmonModelRenderer(this, 24, 9);
      Leg_Middle_6th_Left.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
      Leg_Middle_6th_Left.setRotationPoint(0F, 14F, 0F);
      Leg_Middle_6th_Left.setTextureSize(128, 64);
      Leg_Middle_6th_Left.mirror = true;
      setRotation(Leg_Middle_6th_Left, 0F, 0F, 0F);
      PixelmonModelRenderer   Leg_Middle_5th_Left = new PixelmonModelRenderer(this, 24, 9);
      Leg_Middle_5th_Left.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
      Leg_Middle_5th_Left.setRotationPoint(0F, 11.8F, 0F);
      Leg_Middle_5th_Left.setTextureSize(128, 64);
      Leg_Middle_5th_Left.mirror = true;
      setRotation(Leg_Middle_5th_Left, 0F, 0F, 0F);
      PixelmonModelRenderer   Leg_Middle_4th_Left = new PixelmonModelRenderer(this, 24, 9);
      Leg_Middle_4th_Left.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
      Leg_Middle_4th_Left.setRotationPoint(0F, 9.6F, 0F);
      Leg_Middle_4th_Left.setTextureSize(128, 64);
      Leg_Middle_4th_Left.mirror = true;
      setRotation(Leg_Middle_4th_Left, 0F, 0F, 0F);
      PixelmonModelRenderer   Leg_Middle_3rd_Left = new PixelmonModelRenderer(this, 24, 9);
      Leg_Middle_3rd_Left.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
      Leg_Middle_3rd_Left.setRotationPoint(0F, 7.4F, 0F);
      Leg_Middle_3rd_Left.setTextureSize(128, 64);
      Leg_Middle_3rd_Left.mirror = true;
      setRotation(Leg_Middle_3rd_Left, 0F, 0F, 0F);
      PixelmonModelRenderer   Leg_Middle_2nd_Left = new PixelmonModelRenderer(this, 24, 9);
      Leg_Middle_2nd_Left.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
      Leg_Middle_2nd_Left.setRotationPoint(0F, 5.2F, 0F);
      Leg_Middle_2nd_Left.setTextureSize(128, 64);
      Leg_Middle_2nd_Left.mirror = true;
      setRotation(Leg_Middle_2nd_Left, 0F, 0F, 0F);
      PixelmonModelRenderer   Leg_Middle_1st_Left = new PixelmonModelRenderer(this, 24, 9);
      Leg_Middle_1st_Left.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
      Leg_Middle_1st_Left.setRotationPoint(0F, 3F, 0F);
      Leg_Middle_1st_Left.setTextureSize(128, 64);
      Leg_Middle_1st_Left.mirror = true;
      setRotation(Leg_Middle_1st_Left, 0F, 0F, 0F);
      PixelmonModelRenderer   Leg_Inner_Bottom_Left = new PixelmonModelRenderer(this, 16, 23);
      Leg_Inner_Bottom_Left.addBox(-1F, 0F, -1F, 2, 7, 2);
      Leg_Inner_Bottom_Left.setRotationPoint(0F, 9F, 0F);
      Leg_Inner_Bottom_Left.setTextureSize(128, 64);
      Leg_Inner_Bottom_Left.mirror = true;
      setRotation(Leg_Inner_Bottom_Left, 0F, 0F, 0F);
      PixelmonModelRenderer   Leg_Inner_Top_Left = new PixelmonModelRenderer(this, 8, 23);
      Leg_Inner_Top_Left.addBox(-1F, 0F, -1F, 2, 7, 2);
      Leg_Inner_Top_Left.setRotationPoint(0F, 2F, 0F);
      Leg_Inner_Top_Left.setTextureSize(128, 64);
      Leg_Inner_Top_Left.mirror = true;
      setRotation(Leg_Inner_Top_Left, 0F, 0F, 0F);
      PixelmonModelRenderer   Knee_Left = new PixelmonModelRenderer(this, 24, 14);
      Knee_Left.addBox(-1F, 0F, -1F, 2, 2, 2);
      Knee_Left.setRotationPoint(0F, 8F, 0F);
      Knee_Left.setTextureSize(128, 64);
      Knee_Left.mirror = true;
      setRotation(Knee_Left, 0F, 0F, 0F);
      PixelmonModelRenderer   Waist_Left = new PixelmonModelRenderer(this, 36, 9);
      Waist_Left.addBox(-2F, -2F, -2F, 4, 5, 4);
      Waist_Left.setTextureSize(128, 64);
      Waist_Left.mirror = true;
      setRotation(Waist_Left, 0F, 0F, 0F);
      LeftLeg.addChild(Leg_Claw_1st_Left);
      LeftLeg.addChild(Leg_Claw_2nd_Left);
      LeftLeg.addChild(Leg_Claw_3rd_Left);
      LeftLeg.addChild(Leg_Bottom_Left);
      LeftLeg.addChild(Leg_Middle_6th_Left);
      LeftLeg.addChild(Leg_Middle_5th_Left);
      LeftLeg.addChild(Leg_Middle_4th_Left);
      LeftLeg.addChild(Leg_Middle_3rd_Left);
      LeftLeg.addChild(Leg_Middle_2nd_Left);
      LeftLeg.addChild(Leg_Middle_1st_Left);
      LeftLeg.addChild(Leg_Inner_Bottom_Left);
      LeftLeg.addChild(Leg_Inner_Top_Left);
      LeftLeg.addChild(Knee_Left);
      LeftLeg.addChild(Waist_Left);
      Body.addChild(LeftLeg);
      
      
      
      PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this, "Right Leg");
      RightLeg.setRotationPoint(4.5F, 7, 0);
      PixelmonModelRenderer Waist_Right = new PixelmonModelRenderer(this, 36, 0);
      Waist_Right.addBox(-2F, -2F, -2F, 4, 5, 4);
      Waist_Right.setTextureSize(128, 64);
      Waist_Right.mirror = true;
      setRotation(Waist_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Leg_Inner_Top_Right = new PixelmonModelRenderer(this, 6, 7);
      Leg_Inner_Top_Right.addBox(-1F, 0F, -1F, 2, 7, 2);
      Leg_Inner_Top_Right.setRotationPoint(0F, 2F, 0F);
      Leg_Inner_Top_Right.setTextureSize(128, 64);
      Leg_Inner_Top_Right.mirror = true;
      setRotation(Leg_Inner_Top_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Leg_Inner_Bottom_Right = new PixelmonModelRenderer(this, 14, 7);
      Leg_Inner_Bottom_Right.addBox(-1F, 0F, -1F, 2, 7, 2);
      Leg_Inner_Bottom_Right.setRotationPoint(0F, 9F, 0F);
      Leg_Inner_Bottom_Right.setTextureSize(128, 64);
      Leg_Inner_Bottom_Right.mirror = true;
      setRotation(Leg_Inner_Bottom_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Knee_Right = new PixelmonModelRenderer(this, 24, 5);
      Knee_Right.addBox(-1F, 0F, -1F, 2, 2, 2);
      Knee_Right.setRotationPoint(0F, 8F, 0F);
      Knee_Right.setTextureSize(128, 64);
      Knee_Right.mirror = true;
      setRotation(Knee_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Leg_Bottom_Right = new PixelmonModelRenderer(this, 6, 0);
      Leg_Bottom_Right.addBox(-2F, 0F, -3F, 4, 2, 5);
      Leg_Bottom_Right.setRotationPoint(0F, 16F, 0F);
      Leg_Bottom_Right.setTextureSize(128, 64);
      Leg_Bottom_Right.mirror = true;
      setRotation(Leg_Bottom_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Leg_Claw_2nd_Right = new PixelmonModelRenderer(this, 0, 0);
      Leg_Claw_2nd_Right.addBox(-0.5F, -0.5F, -2F, 1, 1, 2);
      Leg_Claw_2nd_Right.setRotationPoint(0F, 17.5F, -3F);
      Leg_Claw_2nd_Right.setTextureSize(128, 64);
      Leg_Claw_2nd_Right.mirror = true;
      setRotation(Leg_Claw_2nd_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Leg_Claw_3rd_Right = new PixelmonModelRenderer(this, 0, 0);
      Leg_Claw_3rd_Right.addBox(-0.5F, -0.5F, -2F, 1, 1, 2);
      Leg_Claw_3rd_Right.setRotationPoint(-1F, 17.5F, -2.9F);
      Leg_Claw_3rd_Right.setTextureSize(128, 64);
      Leg_Claw_3rd_Right.mirror = true;
      setRotation(Leg_Claw_3rd_Right, 0F, 0.2617994F, 0F);
      PixelmonModelRenderer Leg_Claw_1st_Right = new PixelmonModelRenderer(this, 0, 0);
      Leg_Claw_1st_Right.addBox(-0.5F, -0.5F, -2F, 1, 1, 2);
      Leg_Claw_1st_Right.setRotationPoint(1F, 17.5F, -2.9F);
      Leg_Claw_1st_Right.setTextureSize(128, 64);
      Leg_Claw_1st_Right.mirror = true;
      setRotation(Leg_Claw_1st_Right, 0F, -0.2617994F, 0F);
      PixelmonModelRenderer Leg_Middle_1st_Right = new PixelmonModelRenderer(this, 24, 0);
      Leg_Middle_1st_Right.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
      Leg_Middle_1st_Right.setRotationPoint(0F, 3F, 0F);
      Leg_Middle_1st_Right.setTextureSize(128, 64);
      Leg_Middle_1st_Right.mirror = true;
      setRotation(Leg_Middle_1st_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Leg_Middle_2nd_Right = new PixelmonModelRenderer(this, 24, 0);
      Leg_Middle_2nd_Right.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
      Leg_Middle_2nd_Right.setRotationPoint(0F, 5.2F, 0F);
      Leg_Middle_2nd_Right.setTextureSize(128, 64);
      Leg_Middle_2nd_Right.mirror = true;
      setRotation(Leg_Middle_2nd_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Leg_Middle_3rd_Right = new PixelmonModelRenderer(this, 24, 0);
      Leg_Middle_3rd_Right.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
      Leg_Middle_3rd_Right.setRotationPoint(0F, 7.4F, 0F);
      Leg_Middle_3rd_Right.setTextureSize(128, 64);
      Leg_Middle_3rd_Right.mirror = true;
      setRotation(Leg_Middle_3rd_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Leg_Middle_4th_Right = new PixelmonModelRenderer(this, 24, 0);
      Leg_Middle_4th_Right.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
      Leg_Middle_4th_Right.setRotationPoint(0F, 9.6F, 0F);
      Leg_Middle_4th_Right.setTextureSize(128, 64);
      Leg_Middle_4th_Right.mirror = true;
      setRotation(Leg_Middle_4th_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Leg_Middle_5th_Right = new PixelmonModelRenderer(this, 24, 0);
      Leg_Middle_5th_Right.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
      Leg_Middle_5th_Right.setRotationPoint(0F, 11.8F, 0F);
      Leg_Middle_5th_Right.setTextureSize(128, 64);
      Leg_Middle_5th_Right.mirror = true;
      setRotation(Leg_Middle_5th_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Leg_Middle_6th_Right = new PixelmonModelRenderer(this, 24, 0);
      Leg_Middle_6th_Right.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
      Leg_Middle_6th_Right.setRotationPoint(0F, 14F, 0F);
      Leg_Middle_6th_Right.setTextureSize(128, 64);
      Leg_Middle_6th_Right.mirror = true;
      setRotation(Leg_Middle_6th_Right, 0F, 0F, 0F);
      RightLeg.addChild(Waist_Right);
      RightLeg.addChild(Leg_Inner_Top_Right);
      RightLeg.addChild(Leg_Inner_Bottom_Right);
      RightLeg.addChild(Knee_Right);
      RightLeg.addChild(Leg_Bottom_Right);
      RightLeg.addChild(Leg_Claw_2nd_Right);
      RightLeg.addChild(Leg_Claw_3rd_Right);
      RightLeg.addChild(Leg_Claw_1st_Right);
      RightLeg.addChild(Leg_Middle_1st_Right);
      RightLeg.addChild(Leg_Middle_2nd_Right);
      RightLeg.addChild(Leg_Middle_3rd_Right);
      RightLeg.addChild(Leg_Middle_4th_Right);
      RightLeg.addChild(Leg_Middle_5th_Right);
      RightLeg.addChild(Leg_Middle_6th_Right);
      Body.addChild(RightLeg);
      
      
      
      ModuleArm leftArmModule = new ModuleArm(LeftArm, EnumArm.Left);
		ModuleArm rightArmModule = new ModuleArm(RightArm, EnumArm.Right);

		
		float legspeed = 0.5F;
		float legRotationLimit = 1.4F;
		
		ModuleLeg leftLegModule = new ModuleLeg(LeftLeg, EnumLeg.FrontLeft,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleLeg rightLegModule = new ModuleLeg(RightLeg, EnumLeg.FrontRight,
				EnumPhase.InPhase, legRotationLimit, legspeed);

		
		
		skeleton = new SkeletonBiped(Body, null, leftArmModule, rightArmModule,
				leftLegModule, rightLegModule);
      
      
      
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(PixelmonModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
