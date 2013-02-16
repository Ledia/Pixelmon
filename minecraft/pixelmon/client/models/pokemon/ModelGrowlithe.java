// Date: 7/06/2012 5:27:57 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.Module;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.quadruped.SkeletonQuadruped;

public class ModelGrowlithe extends PixelmonModelBase {
	// fields
	PixelmonModelRenderer Body;

	public ModelGrowlithe() {
		textureWidth = 64;
		textureHeight = 32;
		setTextureOffset("Head.Head", 0, 0);

		Body = new PixelmonModelRenderer(this, 0, 0);
		Body.addBox(0F, 0F, 0F, 4, 4, 10);
		Body.setRotationPoint(-3F, 16.5F, -2F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		PixelmonModelRenderer Back = new PixelmonModelRenderer(this, 27, 22);
		Back.addBox(0F, 0F, 0F, 4, 1, 9);
		Back.setRotationPoint(0, -0.2F, 1);
		Back.setTextureSize(64, 32);
		Back.mirror = true;
		Body.addChild(Back);
		PixelmonModelRenderer legFR = new PixelmonModelRenderer(this, 0, 15);
		legFR.addBox(-1F, 0F, -1F, 2, 4, 2);
		legFR.setRotationPoint(0, 3.5F, 2);
		legFR.setTextureSize(64, 32);
		legFR.mirror = true;
		Body.addChild(legFR);
		PixelmonModelRenderer legFL = new PixelmonModelRenderer(this, 0, 15);
		legFL.addBox(-1F, 0F, -1F, 2, 4, 2);
		legFL.setRotationPoint(4F, 3.5F, 2F);
		legFL.setTextureSize(64, 32);
		legFL.mirror = true;
		Body.addChild(legFL);
		PixelmonModelRenderer legBL = new PixelmonModelRenderer(this, 0, 15);
		legBL.addBox(-1F, 0F, -1F, 2, 4, 2);
		legBL.setRotationPoint(4, 3.5F, 8);
		legBL.setTextureSize(64, 32);
		legBL.mirror = true;
		Body.addChild(legBL);
		PixelmonModelRenderer legBR = new PixelmonModelRenderer(this, 0, 15);
		legBR.addBox(-1F, 0F, -1F, 2, 4, 2);
		legBR.setRotationPoint(0, 3.5F, 8);
		legBR.setTextureSize(64, 32);
		legBR.mirror = true;
		Body.addChild(legBR);

		PixelmonModelRenderer Belly = new PixelmonModelRenderer(this, 0, 22);
		Belly.addBox(0F, 0F, 0F, 4, 1, 9);
		Belly.setRotationPoint(0, 2.7F, -0.5F);
		Belly.setTextureSize(64, 32);
		Belly.mirror = true;
		Body.addChild(Belly);
		PixelmonModelRenderer Neck = new PixelmonModelRenderer(this, 44, 14);
		Neck.addBox(0F, 0F, 0F, 3, 3, 4);
		Neck.setRotationPoint(0.5F, -1.6F, 0);
		Neck.setTextureSize(64, 32);
		Neck.mirror = true;
		setRotation(Neck, -0.8179294F, 0F, 0F);
		Body.addChild(Neck);
		PixelmonModelRenderer Shoulder1 = new PixelmonModelRenderer(this, 0, 0);
		Shoulder1.addBox(0.1F, -1F, -1F, 1, 2, 2);
		Shoulder1.setRotationPoint(2.3F, 2.8F, 8);
		Shoulder1.setTextureSize(64, 32);
		Shoulder1.mirror = true;
		setRotation(Shoulder1, 0F, 0F, -0.1858931F);
		Body.addChild(Shoulder1);
		PixelmonModelRenderer Shoulder2 = new PixelmonModelRenderer(this, 0, 0);
		Shoulder2.addBox(0.1F, -1F, -1F, 1, 2, 2);
		Shoulder2.setRotationPoint(3.7F, 2.8F, 2);
		Shoulder2.setTextureSize(64, 32);
		Shoulder2.mirror = true;
		setRotation(Shoulder2, 0F, 0F, -0.1858931F);
		Body.addChild(Shoulder2);
		PixelmonModelRenderer Shoulder3 = new PixelmonModelRenderer(this, 0, 0);
		Shoulder3.addBox(-1F, -1F, -1F, 1, 2, 2);
		Shoulder3.setRotationPoint(-0.3F, 2.8F, 8);
		Shoulder3.setTextureSize(64, 32);
		Shoulder3.mirror = true;
		setRotation(Shoulder3, 0F, 0F, 0.185895F);
		Body.addChild(Shoulder3);
		PixelmonModelRenderer Shoulder4 = new PixelmonModelRenderer(this, 0, 0);
		Shoulder4.addBox(0F, -1F, -1F, 1, 2, 2);
		Shoulder4.setRotationPoint(-0.8F, 2.6F, 2);
		Shoulder4.setTextureSize(64, 32);
		Shoulder4.mirror = true;
		setRotation(Shoulder4, 0F, 0F, 0.185895F);
		Body.addChild(Shoulder4);
		PixelmonModelRenderer Tail = new PixelmonModelRenderer(this, "Tail");
		Tail.setRotationPoint(2f, -0.3777777f, 10);
		PixelmonModelRenderer Main_Bushy_Tail_Bit = new PixelmonModelRenderer(this, 29, 14);
		Main_Bushy_Tail_Bit.addBox(-2F, -2F, -1F, 4, 4, 3);
		Main_Bushy_Tail_Bit.setRotationPoint(0, 0, 0);
		Main_Bushy_Tail_Bit.setTextureSize(64, 32);
		Main_Bushy_Tail_Bit.mirror = true;
		setRotation(Main_Bushy_Tail_Bit, -0.5948578F, 0F, 0F);
		Tail.addChild(Main_Bushy_Tail_Bit);
		PixelmonModelRenderer Normal_Bushy_Tail_Bit = new PixelmonModelRenderer(this, 31, 14);
		Normal_Bushy_Tail_Bit.addBox(-1.533333F, -1F, 0F, 3, 2, 3);
		Normal_Bushy_Tail_Bit.setRotationPoint(0, -1.13333F, -1);
		Normal_Bushy_Tail_Bit.setTextureSize(64, 32);
		Normal_Bushy_Tail_Bit.mirror = true;
		setRotation(Normal_Bushy_Tail_Bit, 0.2602503F, 0F, 0F);
		Tail.addChild(Normal_Bushy_Tail_Bit);
		PixelmonModelRenderer Minority_Bushy_Tail_Bit = new PixelmonModelRenderer(this, 29, 18);
		Minority_Bushy_Tail_Bit.addBox(-1F, -1F, 0F, 2, 1, 2);
		Minority_Bushy_Tail_Bit.setRotationPoint(0, -1.63333F, 3F);
		Minority_Bushy_Tail_Bit.setTextureSize(64, 32);
		Minority_Bushy_Tail_Bit.mirror = true;
		setRotation(Minority_Bushy_Tail_Bit, -0.2602503F, 0F, 0F);
		Tail.addChild(Minority_Bushy_Tail_Bit);
		Body.addChild(Tail);
		PixelmonModelRenderer Covers1 = new PixelmonModelRenderer(this, 0, 0);
		Covers1.addBox(0F, 0F, 0F, 1, 3, 3);
		Covers1.setRotationPoint(-0.1F, 0.8F, 7);
		Covers1.setTextureSize(64, 32);
		Covers1.mirror = true;
		Body.addChild(Covers1);
		PixelmonModelRenderer Covers2 = new PixelmonModelRenderer(this, 0, 0);
		Covers2.addBox(0F, 0F, 0F, 1, 2, 2);
		Covers2.setRotationPoint(-0.3F, -0.2F, 8);
		Covers2.setTextureSize(64, 32);
		Covers2.mirror = true;
		Body.addChild(Covers2);
		PixelmonModelRenderer Covers3 = new PixelmonModelRenderer(this, 0, 0);
		Covers3.addBox(0F, 0F, 0F, 1, 3, 3);
		Covers3.setRotationPoint(3.1F, 0.8F, 7);
		Covers3.setTextureSize(64, 32);
		Covers3.mirror = true;
		setRotation(Covers3, 0F, 0F, 0F);
		Body.addChild(Covers3);
		PixelmonModelRenderer Covers4 = new PixelmonModelRenderer(this, 0, 0);
		Covers4.addBox(0F, 0F, 0F, 1, 2, 2);
		Covers4.setRotationPoint(3.2F, -0.2F, 8F);
		Covers4.setTextureSize(64, 32);
		Covers4.mirror = true;
		Body.addChild(Covers4);

		PixelmonModelRenderer Head = getHead();
		Body.addChild(Head);
		Module head = new ModuleHead(Head);
		skeleton = new SkeletonQuadruped(Body, head, legFL, legFR, legBL, legBR, 1.3f, 1.3f, 0.662f);
	}

	private PixelmonModelRenderer getHead() {
		PixelmonModelRenderer Head = new PixelmonModelRenderer(this, 46, 0);
		Head.addBox(-2.5F, -4F, -4F, 5, 5, 4);
		Head.setRotationPoint(2, 0.2F, 1);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		PixelmonModelRenderer Tongue = new PixelmonModelRenderer(this, 24, 14);
		Tongue.addBox(0F, 1F, 0F, 1, 1, 1);
		Tongue.setRotationPoint(-1.5F + 1F, 16F - 16.7F, -5.7F + 1F);
		Tongue.setTextureSize(64, 32);
		Tongue.mirror = true;
		setRotation(Tongue, -0.1487195F, 0F, 0F);
		Head.addChild(Tongue);
		PixelmonModelRenderer Ear_Bridge_1 = new PixelmonModelRenderer(this, 0, 0);
		Ear_Bridge_1.addBox(0F, 0F, 0F, 2, 1, 1);
		Ear_Bridge_1.setRotationPoint(-4F + 1F, 12.1F - 16.7F, -4F + 1F);
		Ear_Bridge_1.setTextureSize(64, 32);
		Ear_Bridge_1.mirror = true;
		setRotation(Ear_Bridge_1, 0F, 0F, 0.1487195F);
		Head.addChild(Ear_Bridge_1);
		PixelmonModelRenderer Ear_Tip_2 = new PixelmonModelRenderer(this, 0, 0);
		Ear_Tip_2.addBox(0F, 0F, 0F, 2, 1, 1);
		Ear_Tip_2.setRotationPoint(1F + 1F, 12F - 16.7F, -4F + 1F);
		Ear_Tip_2.setTextureSize(64, 32);
		Ear_Tip_2.mirror = true;
		setRotation(Ear_Tip_2, 0F, 0F, 0.1487144F);
		Head.addChild(Ear_Tip_2);
		PixelmonModelRenderer Ear_Tip_1 = new PixelmonModelRenderer(this, 0, 0);
		Ear_Tip_1.addBox(0F, -2F, -0.5F, 1, 2, 1);
		Ear_Tip_1.setRotationPoint(-3F + 1F, 13.2F - 16.7F, -3.5F + 1F);
		Ear_Tip_1.setTextureSize(64, 32);
		Ear_Tip_1.mirror = true;
		setRotation(Ear_Tip_1, 0F, 0F, -1.710223F);
		Head.addChild(Ear_Tip_1);
		PixelmonModelRenderer Ear_Bridge_2 = new PixelmonModelRenderer(this, 0, 0);
		Ear_Bridge_2.addBox(0F, 0F, 0F, 1, 2, 1);
		Ear_Bridge_2.setRotationPoint(1F + 1F, 12F - 16.7F, -4F + 1F);
		Ear_Bridge_2.setTextureSize(64, 32);
		Ear_Bridge_2.mirror = true;
		setRotation(Ear_Bridge_2, 0F, 0F, 0.3346075F);
		Head.addChild(Ear_Bridge_2);
		PixelmonModelRenderer Upper_Muzzle = new PixelmonModelRenderer(this, 31, 16);
		Upper_Muzzle.addBox(0F, 0F, 0F, 3, 1, 2);
		Upper_Muzzle.setRotationPoint(-2.5F + 1F, 15F - 16.7F, -6F + 1F);
		Upper_Muzzle.setTextureSize(64, 32);
		Upper_Muzzle.mirror = true;
		setRotation(Upper_Muzzle, 0F, 0F, 0F);
		Head.addChild(Upper_Muzzle);
		PixelmonModelRenderer Hair_Tuft1 = new PixelmonModelRenderer(this, 34, 18);
		Hair_Tuft1.addBox(0F, 0F, 0F, 1, 4, 1);
		Hair_Tuft1.setRotationPoint(-1.5F + 1F, 11F - 16.7F, -1.5F + 1F);
		Hair_Tuft1.setTextureSize(64, 32);
		Hair_Tuft1.mirror = true;
		Head.addChild(Hair_Tuft1);
		setRotation(Hair_Tuft1, -0.669215F, 0F, 0F);
		PixelmonModelRenderer Hair_Tuft2 = new PixelmonModelRenderer(this, 34, 18);
		Hair_Tuft2.addBox(0F, 0F, 0F, 1, 4, 1);
		Hair_Tuft2.setRotationPoint(-1.5F + 1F, 10.16667F - 16.7F, -2F + 1F);
		Hair_Tuft2.setTextureSize(64, 32);
		Hair_Tuft2.mirror = true;
		setRotation(Hair_Tuft2, -0.5948578F, 0F, 0F);
		Head.addChild(Hair_Tuft2);
		PixelmonModelRenderer Hair_Tuft3 = new PixelmonModelRenderer(this, 37, 17);
		Hair_Tuft3.addBox(0F, 0F, 0F, 1, 3, 1);
		Hair_Tuft3.setRotationPoint(-1.5F + 1F, 10F - 16.7F, -3.2F + 1F);
		Hair_Tuft3.setTextureSize(64, 32);
		Hair_Tuft3.mirror = true;
		Head.addChild(Hair_Tuft3);
		setRotation(Hair_Tuft3, -0.2602503F, 0F, 0F);
		PixelmonModelRenderer Hair_Tuft4 = new PixelmonModelRenderer(this, 36, 17);
		Hair_Tuft4.addBox(0F, 0F, 0F, 1, 3, 1);
		Hair_Tuft4.setRotationPoint(-1.5F + 1F, 10.2F - 16.7F, -4F + 1F);
		Hair_Tuft4.setTextureSize(64, 32);
		Hair_Tuft4.mirror = true;
		setRotation(Hair_Tuft4, -0.0371786F, 0F, 0F);
		Head.addChild(Hair_Tuft4);
		PixelmonModelRenderer Hair_Tuft5 = new PixelmonModelRenderer(this, 32, 14);
		Hair_Tuft5.addBox(0F, 0F, 0F, 1, 3, 1);
		Hair_Tuft5.setRotationPoint(-1.5F + 1F, 10.7F - 16.7F, -4.5F + 1F);
		Hair_Tuft5.setTextureSize(64, 32);
		Hair_Tuft5.mirror = true;
		setRotation(Hair_Tuft5, -0.1487144F, 0F, 0F);
		Head.addChild(Hair_Tuft5);
		PixelmonModelRenderer Nose = new PixelmonModelRenderer(this, 34, 10);
		Nose.addBox(0F, 0F, 0F, 1, 1, 3);
		Nose.setRotationPoint(-1.5F + 1F, 15F - 16.7F, -6.7F + 1F);
		Nose.setTextureSize(64, 32);
		Nose.mirror = true;
		setRotation(Nose, 0.1115358F, 0F, 0F);
		Head.addChild(Nose);
		PixelmonModelRenderer Muzzle_Bottom = new PixelmonModelRenderer(this, 8, 17);
		Muzzle_Bottom.addBox(0F, 0F, 0F, 5, 2, 2);
		Muzzle_Bottom.setRotationPoint(-3.5F + 1F, 15.6F - 16.7F, -6F + 1F);
		Muzzle_Bottom.setTextureSize(64, 32);
		Muzzle_Bottom.mirror = true;
		Head.addChild(Muzzle_Bottom);
		setRotation(Muzzle_Bottom, 0F, 0F, 0F);
		PixelmonModelRenderer Top_of_Head = new PixelmonModelRenderer(this, 0, 0);
		Top_of_Head.addBox(0F, 0F, 0F, 3, 1, 3);
		Top_of_Head.setRotationPoint(-2.5F + 1F, 12.4F - 16.7F, -4.5F + 1F);
		Top_of_Head.setTextureSize(64, 32);
		Top_of_Head.mirror = true;
		setRotation(Top_of_Head, 0F, 0F, 0F);
		Head.addChild(Top_of_Head);
		return Head;
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Body.render(f5);
	}

	private void setRotation(PixelmonModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {

	}

}
