package pixelmon.models;

import pixelmon.blocks.TileEntityAnvil;
import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelAnvil extends ModelBase
{
  //fields
    ModelRenderer AngledTB;
    ModelRenderer anvil3;
    ModelRenderer Anvil1;
    ModelRenderer AngledTF;
    ModelRenderer Anvil4;
    ModelRenderer AngledTR;
    ModelRenderer Base;
    ModelRenderer AngledBF;
    ModelRenderer AngledBR;
    ModelRenderer AngledBL;
    ModelRenderer AngledBB;
    ModelRenderer Ar6;
    ModelRenderer stufffs;
    ModelRenderer AngledTL;
    ModelRenderer anvil2;
    ModelRenderer Top;
    ModelRenderer Ar8;
    ModelRenderer Ar7;
    ModelRenderer Ar5;
    ModelRenderer BaseTop;
    ModelRenderer AR1;
    ModelRenderer Ar4;
    ModelRenderer Ar3;
    ModelRenderer Ar2;
  
  public ModelAnvil()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      AngledTB = new ModelRenderer(this, 0, 12);
      AngledTB.addBox(-3F, -2F, 1F, 6, 2, 1);
      AngledTB.setRotationPoint(1F, 16F, 0.5F);
      AngledTB.setTextureSize(64, 32);
      AngledTB.mirror = true;
      setRotation(AngledTB, -0.7853982F, 0F, 0F);
      anvil3 = new ModelRenderer(this, 46, 4);
      anvil3.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
      anvil3.setRotationPoint(6.5F, 13.2F, 0F);
      anvil3.setTextureSize(64, 32);
      anvil3.mirror = true;
      setRotation(anvil3, 0F, 0F, 0F);
      Anvil1 = new ModelRenderer(this, 38, 0);
      Anvil1.addBox(1F, -2F, -1F, 1, 3, 2);
      Anvil1.setRotationPoint(4.5F, 14F, 0F);
      Anvil1.setTextureSize(64, 32);
      Anvil1.mirror = true;
      setRotation(Anvil1, 0F, 0F, 0.9599311F);
      AngledTF = new ModelRenderer(this, 0, 12);
      AngledTF.addBox(-3F, -2F, -2F, 6, 2, 1);
      AngledTF.setRotationPoint(1F, 16F, -0.5F);
      AngledTF.setTextureSize(64, 32);
      AngledTF.mirror = true;
      setRotation(AngledTF, 0.7853982F, 0F, 0F);
      Anvil4 = new ModelRenderer(this, 27, 24);
      Anvil4.addBox(-3F, 0F, -2F, 6, 4, 4);
      Anvil4.setRotationPoint(1F, 16F, 0F);
      Anvil4.setTextureSize(64, 32);
      Anvil4.mirror = true;
      setRotation(Anvil4, 0F, 0F, 0F);
      AngledTR = new ModelRenderer(this, 26, 2);
      AngledTR.addBox(-2F, -2F, -2F, 1, 2, 4);
      AngledTR.setRotationPoint(-0.5F, 16F, 0F);
      AngledTR.setTextureSize(64, 32);
      AngledTR.mirror = true;
      setRotation(AngledTR, 0F, 0F, -0.7853982F);
      Base = new ModelRenderer(this, 23, 8);
      Base.addBox(-4F, 0F, -4F, 10, 2, 8);
      Base.setRotationPoint(-0.2F, 22F, 0F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      AngledBF = new ModelRenderer(this, 0, 12);
      AngledBF.addBox(-3F, 0F, -2F, 6, 2, 1);
      AngledBF.setRotationPoint(1F, 20F, -0.5F);
      AngledBF.setTextureSize(64, 32);
      AngledBF.mirror = true;
      setRotation(AngledBF, -0.7853982F, 0F, 0F);
      AngledBR = new ModelRenderer(this, 26, 2);
      AngledBR.addBox(-2F, 0F, -2F, 1, 2, 4);
      AngledBR.setRotationPoint(-0.5F, 20F, 0F);
      AngledBR.setTextureSize(64, 32);
      AngledBR.mirror = true;
      setRotation(AngledBR, 0F, 0F, 0.7853982F);
      AngledBL = new ModelRenderer(this, 26, 2);
      AngledBL.addBox(1F, 0F, -2F, 1, 2, 4);
      AngledBL.setRotationPoint(2.5F, 20F, 0F);
      AngledBL.setTextureSize(64, 32);
      AngledBL.mirror = true;
      setRotation(AngledBL, 0F, 0F, -0.7853982F);
      AngledBB = new ModelRenderer(this, 0, 12);
      AngledBB.addBox(-3F, 0F, 1F, 6, 2, 1);
      AngledBB.setRotationPoint(1F, 20F, 0.5F);
      AngledBB.setTextureSize(64, 32);
      AngledBB.mirror = true;
      setRotation(AngledBB, 0.7853982F, 0F, 0F);
      Ar6 = new ModelRenderer(this, 0, 6);
      Ar6.addBox(-6F, 0F, -0.5F, 5, 1, 1);
      Ar6.setRotationPoint(-2F, 14.6F, -3F);
      Ar6.setTextureSize(64, 32);
      Ar6.mirror = true;
      setRotation(Ar6, 0F, 0.5061455F, 0.0698132F);
      stufffs = new ModelRenderer(this, 54, 0);
      stufffs.addBox(-1F, 0F, -1F, 2, 1, 2);
      stufffs.setRotationPoint(4.5F, 14.1F, 0F);
      stufffs.setTextureSize(64, 32);
      stufffs.mirror = true;
      setRotation(stufffs, 0F, 0F, 0F);
      AngledTL = new ModelRenderer(this, 26, 2);
      AngledTL.addBox(1F, -2F, -2F, 1, 2, 4);
      AngledTL.setRotationPoint(2.5F, 16F, 0F);
      AngledTL.setTextureSize(64, 32);
      AngledTL.mirror = true;
      setRotation(AngledTL, 0F, 0F, 0.7853982F);
      anvil2 = new ModelRenderer(this, 45, 0);
      anvil2.addBox(-1F, 0F, -1F, 2, 1, 2);
      anvil2.setRotationPoint(6.5F, 13.5F, 0F);
      anvil2.setTextureSize(64, 32);
      anvil2.mirror = true;
      setRotation(anvil2, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 16);
      Top.addBox(-3.5F, 0F, -3.5F, 9, 2, 7);
      Top.setRotationPoint(0F, 14F, 0F);
      Top.setTextureSize(64, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      Ar8 = new ModelRenderer(this, 27, 19);
      Ar8.addBox(-5F, 0F, -1.5F, 5, 1, 3);
      Ar8.setRotationPoint(-0.6F, 14.8F, 0F);
      Ar8.setTextureSize(64, 32);
      Ar8.mirror = true;
      setRotation(Ar8, 0F, 0F, 0.1047198F);
      Ar7 = new ModelRenderer(this, 0, 6);
      Ar7.addBox(-6F, 0F, -0.5F, 6, 1, 1);
      Ar7.setRotationPoint(-2F, 14.6F, 3F);
      Ar7.setTextureSize(64, 32);
      Ar7.mirror = true;
      setRotation(Ar7, 0F, -0.5061455F, 0.0698132F);
      Ar5 = new ModelRenderer(this, 0, 9);
      Ar5.addBox(-7F, 0F, -0.5F, 7, 1, 1);
      Ar5.setRotationPoint(-0.5F, 15.2F, 0F);
      Ar5.setTextureSize(64, 32);
      Ar5.mirror = true;
      setRotation(Ar5, 0F, 0F, 0.1396263F);
      BaseTop = new ModelRenderer(this, 0, 23);
      BaseTop.addBox(-4.5F, 0F, -3.5F, 9, 2, 7);
      BaseTop.setRotationPoint(1F, 20F, 0F);
      BaseTop.setTextureSize(64, 32);
      BaseTop.mirror = true;
      setRotation(BaseTop, 0F, 0F, 0F);
      AR1 = new ModelRenderer(this, 0, 6);
      AR1.addBox(-6F, 0F, -0.5F, 5, 1, 1);
      AR1.setRotationPoint(-2F, 14.1F, -3F);
      AR1.setTextureSize(64, 32);
      AR1.mirror = true;
      setRotation(AR1, 0F, 0.5061455F, 0F);
      Ar4 = new ModelRenderer(this, 0, 6);
      Ar4.addBox(-6F, 0F, -0.5F, 6, 1, 1);
      Ar4.setRotationPoint(-2F, 14.1F, 3F);
      Ar4.setTextureSize(64, 32);
      Ar4.mirror = true;
      setRotation(Ar4, 0F, -0.5061455F, 0F);
      Ar3 = new ModelRenderer(this, 0, 9);
      Ar3.addBox(-7F, 0F, -0.5F, 7, 1, 1);
      Ar3.setRotationPoint(-0.5F, 14.1F, 0F);
      Ar3.setTextureSize(64, 32);
      Ar3.mirror = true;
      setRotation(Ar3, 0F, 0F, 0F);
      Ar2 = new ModelRenderer(this, 27, 19);
      Ar2.addBox(-5F, 0F, -1.5F, 5, 1, 3);
      Ar2.setRotationPoint(-0.6F, 14.1F, 0F);
      Ar2.setTextureSize(64, 32);
      Ar2.mirror = true;
      setRotation(Ar2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    AngledTB.render(f5);
    anvil3.render(f5);
    Anvil1.render(f5);
    AngledTF.render(f5);
    Anvil4.render(f5);
    AngledTR.render(f5);
    Base.render(f5);
    AngledBF.render(f5);
    AngledBR.render(f5);
    AngledBL.render(f5);
    AngledBB.render(f5);
    Ar6.render(f5);
    stufffs.render(f5);
    AngledTL.render(f5);
    anvil2.render(f5);
    Top.render(f5);
    Ar8.render(f5);
    Ar7.render(f5);
    Ar5.render(f5);
    BaseTop.render(f5);
    AR1.render(f5);
    Ar4.render(f5);
    Ar3.render(f5);
    Ar2.render(f5);
  }
  
  public void render(TileEntityAnvil entity, float f5){
	    AngledTB.render(f5);
	    anvil3.render(f5);
	    Anvil1.render(f5);
	    AngledTF.render(f5);
	    Anvil4.render(f5);
	    AngledTR.render(f5);
	    Base.render(f5);
	    AngledBF.render(f5);
	    AngledBR.render(f5);
	    AngledBL.render(f5);
	    AngledBB.render(f5);
	    Ar6.render(f5);
	    stufffs.render(f5);
	    AngledTL.render(f5);
	    anvil2.render(f5);
	    Top.render(f5);
	    Ar8.render(f5);
	    Ar7.render(f5);
	    Ar5.render(f5);
	    BaseTop.render(f5);
	    AR1.render(f5);
	    Ar4.render(f5);
	    Ar3.render(f5);
	    Ar2.render(f5); 
  }
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}