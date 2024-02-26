package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aew")
public final class Class96_Sub8 extends Class96 {

	@OriginalMember(owner = "client!aew", name = "e", descriptor = "C")
	static final char aChar7 = '\u0001';

	@OriginalMember(owner = "client!aew", name = "f", descriptor = "C")
	static final char aChar8 = '\u0000';

	@OriginalMember(owner = "client!aew", name = "i", descriptor = "[F")
	static final float[] aFloatArray3 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!aew", name = "l", descriptor = "Lclient!bv;")
	Class197 aClass197_4;

	@OriginalMember(owner = "client!aew", name = "u", descriptor = "Lclient!bf;")
	final Class182 aClass182_4;

	@OriginalMember(owner = "client!aew", name = "g", descriptor = "Lclient!aed;")
	Class84_Sub4 aClass84_Sub4_1;

	@OriginalMember(owner = "client!aew", name = "<init>", descriptor = "(Lclient!afm;Lclient!bf;)V")
	Class96_Sub8(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class182 arg1) {
		super(arg0);
		this.aClass182_4 = arg1;
		this.method2786();
		this.aClass84_Sub4_1 = new Class84_Sub4(this.aClass102_Sub3_24, Class210.aClass210_17, Class236.aClass236_21, 2, new byte[] { 0, -1 }, Class210.aClass210_17);
		this.aClass84_Sub4_1.method2029(false);
	}

	@OriginalMember(owner = "client!aew", name = "y", descriptor = "()V")
	void method2785() {
		this.aClass197_4 = new Class197(this.aClass102_Sub3_24, 2);
		this.aClass197_4.method24905(0);
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6389(7681, 260);
		this.aClass102_Sub3_24.method6390(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.aClass102_Sub3_24.method6386(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass182_4.aBoolean675) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass197_4.method24913();
		this.aClass197_4.method24905(1);
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aClass102_Sub3_24.method6390(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.aClass102_Sub3_24.method6386(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass182_4.aBoolean675) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass197_4.method24913();
	}

	@OriginalMember(owner = "client!aew", name = "t", descriptor = "()Z")
	@Override
	boolean method2897() {
		return true;
	}

	@OriginalMember(owner = "client!aew", name = "f", descriptor = "(Z)V")
	@Override
	void method2887(@OriginalArg(0) boolean arg0) {
		if (this.aClass102_Sub3_24.anInt801 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass102_Sub3_24.anInt801;
			this.aClass102_Sub3_24.method6386(1);
			aFloatArray3[0] = 0.0F;
			aFloatArray3[1] = 0.0F;
			aFloatArray3[2] = local10;
			aFloatArray3[3] = this.aClass102_Sub3_24.aFloat69 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray3, 0);
			OpenGL.glPopMatrix();
			this.aClass102_Sub3_24.method6365(0.5F, (float) this.aClass102_Sub3_24.anInt801);
			this.aClass102_Sub3_24.method6339(this.aClass84_Sub4_1);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass197_4.method24907('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aew", name = "e", descriptor = "(Z)V")
	@Override
	void method2888(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_24.method6389(260, 8448);
	}

	@OriginalMember(owner = "client!aew", name = "i", descriptor = "()Z")
	@Override
	boolean method2894() {
		return true;
	}

	@OriginalMember(owner = "client!aew", name = "l", descriptor = "(II)V")
	@Override
	void method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass182_4.aBoolean675) {
				this.aClass102_Sub3_24.method6339(this.aClass182_4.aClass84_Sub3_1);
				aFloatArray3[0] = 0.0F;
				aFloatArray3[1] = 0.0F;
				aFloatArray3[2] = 0.0F;
				aFloatArray3[3] = (float) (this.aClass102_Sub3_24.anInt770 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray3, 0);
			} else {
				@Pc(53) int local53 = this.aClass102_Sub3_24.anInt770 % 4000 * 16 / 4000;
				this.aClass102_Sub3_24.method6339(this.aClass182_4.aClass84_Sub1Array2[local53]);
			}
		} else if (this.aClass182_4.aBoolean675) {
			this.aClass102_Sub3_24.method6339(this.aClass182_4.aClass84_Sub3_1);
			aFloatArray3[0] = 0.0F;
			aFloatArray3[1] = 0.0F;
			aFloatArray3[2] = 0.0F;
			aFloatArray3[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray3, 0);
		} else {
			this.aClass102_Sub3_24.method6339(this.aClass182_4.aClass84_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!aew", name = "g", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2891(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aew", name = "j", descriptor = "(Z)V")
	@Override
	void method2889(@OriginalArg(0) boolean arg0) {
		if (this.aClass102_Sub3_24.anInt801 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass102_Sub3_24.anInt801;
			this.aClass102_Sub3_24.method6386(1);
			aFloatArray3[0] = 0.0F;
			aFloatArray3[1] = 0.0F;
			aFloatArray3[2] = local10;
			aFloatArray3[3] = this.aClass102_Sub3_24.aFloat69 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray3, 0);
			OpenGL.glPopMatrix();
			this.aClass102_Sub3_24.method6365(0.5F, (float) this.aClass102_Sub3_24.anInt801);
			this.aClass102_Sub3_24.method6339(this.aClass84_Sub4_1);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass197_4.method24907('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aew", name = "m", descriptor = "(Z)V")
	@Override
	void method2892(@OriginalArg(0) boolean arg0) {
		if (this.aClass102_Sub3_24.anInt801 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass102_Sub3_24.anInt801;
			this.aClass102_Sub3_24.method6386(1);
			aFloatArray3[0] = 0.0F;
			aFloatArray3[1] = 0.0F;
			aFloatArray3[2] = local10;
			aFloatArray3[3] = this.aClass102_Sub3_24.aFloat69 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray3, 0);
			OpenGL.glPopMatrix();
			this.aClass102_Sub3_24.method6365(0.5F, (float) this.aClass102_Sub3_24.anInt801);
			this.aClass102_Sub3_24.method6339(this.aClass84_Sub4_1);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass197_4.method24907('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aew", name = "o", descriptor = "(Z)V")
	@Override
	void method2893(@OriginalArg(0) boolean arg0) {
		if (this.aClass102_Sub3_24.anInt801 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass102_Sub3_24.anInt801;
			this.aClass102_Sub3_24.method6386(1);
			aFloatArray3[0] = 0.0F;
			aFloatArray3[1] = 0.0F;
			aFloatArray3[2] = local10;
			aFloatArray3[3] = this.aClass102_Sub3_24.aFloat69 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray3, 0);
			OpenGL.glPopMatrix();
			this.aClass102_Sub3_24.method6365(0.5F, (float) this.aClass102_Sub3_24.anInt801);
			this.aClass102_Sub3_24.method6339(this.aClass84_Sub4_1);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass197_4.method24907('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aew", name = "s", descriptor = "(Z)V")
	@Override
	void method2896(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_24.method6389(260, 8448);
	}

	@OriginalMember(owner = "client!aew", name = "a", descriptor = "(Z)V")
	@Override
	void method2895(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_24.method6389(260, 8448);
	}

	@OriginalMember(owner = "client!aew", name = "k", descriptor = "(Z)V")
	@Override
	void method2886(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_24.method6389(260, 8448);
	}

	@OriginalMember(owner = "client!aew", name = "d", descriptor = "(II)V")
	@Override
	void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass182_4.aBoolean675) {
				this.aClass102_Sub3_24.method6339(this.aClass182_4.aClass84_Sub3_1);
				aFloatArray3[0] = 0.0F;
				aFloatArray3[1] = 0.0F;
				aFloatArray3[2] = 0.0F;
				aFloatArray3[3] = (float) (this.aClass102_Sub3_24.anInt770 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray3, 0);
			} else {
				@Pc(53) int local53 = this.aClass102_Sub3_24.anInt770 % 4000 * 16 / 4000;
				this.aClass102_Sub3_24.method6339(this.aClass182_4.aClass84_Sub1Array2[local53]);
			}
		} else if (this.aClass182_4.aBoolean675) {
			this.aClass102_Sub3_24.method6339(this.aClass182_4.aClass84_Sub3_1);
			aFloatArray3[0] = 0.0F;
			aFloatArray3[1] = 0.0F;
			aFloatArray3[2] = 0.0F;
			aFloatArray3[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray3, 0);
		} else {
			this.aClass102_Sub3_24.method6339(this.aClass182_4.aClass84_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!aew", name = "w", descriptor = "()V")
	@Override
	void method2899() {
		this.aClass197_4.method24907('\u0001');
		if (this.aClass102_Sub3_24.anInt801 > 0) {
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6365(1.0F, 0.0F);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aew", name = "v", descriptor = "()V")
	void method2786() {
		this.aClass197_4 = new Class197(this.aClass102_Sub3_24, 2);
		this.aClass197_4.method24905(0);
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6389(7681, 260);
		this.aClass102_Sub3_24.method6390(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.aClass102_Sub3_24.method6386(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass182_4.aBoolean675) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass197_4.method24913();
		this.aClass197_4.method24905(1);
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aClass102_Sub3_24.method6390(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.aClass102_Sub3_24.method6386(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass182_4.aBoolean675) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass197_4.method24913();
	}

	@OriginalMember(owner = "client!aew", name = "r", descriptor = "()V")
	@Override
	void method2900() {
		this.aClass197_4.method24907('\u0001');
		if (this.aClass102_Sub3_24.anInt801 > 0) {
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6365(1.0F, 0.0F);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aew", name = "q", descriptor = "()V")
	@Override
	void method2901() {
		this.aClass197_4.method24907('\u0001');
		if (this.aClass102_Sub3_24.anInt801 > 0) {
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6365(1.0F, 0.0F);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aew", name = "h", descriptor = "(II)V")
	@Override
	void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass182_4.aBoolean675) {
				this.aClass102_Sub3_24.method6339(this.aClass182_4.aClass84_Sub3_1);
				aFloatArray3[0] = 0.0F;
				aFloatArray3[1] = 0.0F;
				aFloatArray3[2] = 0.0F;
				aFloatArray3[3] = (float) (this.aClass102_Sub3_24.anInt770 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray3, 0);
			} else {
				@Pc(53) int local53 = this.aClass102_Sub3_24.anInt770 % 4000 * 16 / 4000;
				this.aClass102_Sub3_24.method6339(this.aClass182_4.aClass84_Sub1Array2[local53]);
			}
		} else if (this.aClass182_4.aBoolean675) {
			this.aClass102_Sub3_24.method6339(this.aClass182_4.aClass84_Sub3_1);
			aFloatArray3[0] = 0.0F;
			aFloatArray3[1] = 0.0F;
			aFloatArray3[2] = 0.0F;
			aFloatArray3[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray3, 0);
		} else {
			this.aClass102_Sub3_24.method6339(this.aClass182_4.aClass84_Sub1Array2[0]);
		}
	}

	@OriginalMember(owner = "client!aew", name = "x", descriptor = "()V")
	@Override
	void method2898() {
		this.aClass197_4.method24907('\u0001');
		if (this.aClass102_Sub3_24.anInt801 > 0) {
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6365(1.0F, 0.0F);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aew", name = "z", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2904(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aew", name = "p", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2905(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aew", name = "u", descriptor = "()V")
	@Override
	void method2885() {
		this.aClass197_4.method24907('\u0001');
		if (this.aClass102_Sub3_24.anInt801 > 0) {
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6365(1.0F, 0.0F);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aew", name = "n", descriptor = "()V")
	void method2787() {
		this.aClass197_4 = new Class197(this.aClass102_Sub3_24, 2);
		this.aClass197_4.method24905(0);
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6389(7681, 260);
		this.aClass102_Sub3_24.method6390(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.aClass102_Sub3_24.method6386(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass182_4.aBoolean675) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass197_4.method24913();
		this.aClass197_4.method24905(1);
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aClass102_Sub3_24.method6390(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.aClass102_Sub3_24.method6386(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass182_4.aBoolean675) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass197_4.method24913();
	}
}
