package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aet")
public class Class97_Sub6 extends Class97 {

	@OriginalMember(owner = "client!aet", name = "m", descriptor = "C")
	static final char aChar5 = '\u0001';

	@OriginalMember(owner = "client!aet", name = "n", descriptor = "C")
	static final char aChar6 = '\u0000';

	@OriginalMember(owner = "client!aet", name = "l", descriptor = "[F")
	static final float[] aFloatArray4 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!aet", name = "f", descriptor = "Lclient!be;")
	Class182 aClass182_3;

	@OriginalMember(owner = "client!aet", name = "k", descriptor = "Lclient!bz;")
	final Class199 aClass199_3;

	@OriginalMember(owner = "client!aet", name = "w", descriptor = "Lclient!aew;")
	Class88_Sub4 aClass88_Sub4_1;

	@OriginalMember(owner = "client!aet", name = "<init>", descriptor = "(Lclient!afa;Lclient!bz;)V", line = 16)
	Class97_Sub6(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class199 arg1) {
		super(arg0);
		this.aClass199_3 = arg1;
		this.method2662();
		this.aClass88_Sub4_1 = new Class88_Sub4(this.aClass104_Sub1_25, Class206.aClass206_19, Class226.aClass226_22, 2, new byte[] { 0, -1 }, Class206.aClass206_19);
		this.aClass88_Sub4_1.method2743(false);
	}

	@OriginalMember(owner = "client!aet", name = "u", descriptor = "()Z", line = 24)
	@Override
	boolean method2802() {
		return true;
	}

	@OriginalMember(owner = "client!aet", name = "z", descriptor = "()Z", line = 24)
	@Override
	boolean method2798() {
		return true;
	}

	@OriginalMember(owner = "client!aet", name = "d", descriptor = "()Z", line = 24)
	@Override
	boolean method2799() {
		return true;
	}

	@OriginalMember(owner = "client!aet", name = "l", descriptor = "()Z", line = 24)
	@Override
	boolean method2796() {
		return true;
	}

	@OriginalMember(owner = "client!aet", name = "p", descriptor = "()Z", line = 24)
	@Override
	boolean method2791() {
		return true;
	}

	@OriginalMember(owner = "client!aet", name = "e", descriptor = "()Z", line = 24)
	@Override
	boolean method2790() {
		return true;
	}

	@OriginalMember(owner = "client!aet", name = "n", descriptor = "(Z)V", line = 28)
	@Override
	void method2801(@OriginalArg(0) boolean arg0) {
		if (this.aClass104_Sub1_25.anInt563 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass104_Sub1_25.anInt563;
			this.aClass104_Sub1_25.method3882(1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = local10;
			aFloatArray4[3] = this.aClass104_Sub1_25.aFloat30 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray4, 0);
			OpenGL.glPopMatrix();
			this.aClass104_Sub1_25.method3819(0.5F, (float) this.aClass104_Sub1_25.anInt563);
			this.aClass104_Sub1_25.method3887(this.aClass88_Sub4_1);
			this.aClass104_Sub1_25.method3882(0);
		}
		this.aClass182_3.method24563('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aet", name = "c", descriptor = "(Z)V", line = 28)
	@Override
	void method2800(@OriginalArg(0) boolean arg0) {
		if (this.aClass104_Sub1_25.anInt563 > 0) {
			@Pc(10) float local10 = -0.5F / (float) this.aClass104_Sub1_25.anInt563;
			this.aClass104_Sub1_25.method3882(1);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = local10;
			aFloatArray4[3] = this.aClass104_Sub1_25.aFloat30 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray4, 0);
			OpenGL.glPopMatrix();
			this.aClass104_Sub1_25.method3819(0.5F, (float) this.aClass104_Sub1_25.anInt563);
			this.aClass104_Sub1_25.method3887(this.aClass88_Sub4_1);
			this.aClass104_Sub1_25.method3882(0);
		}
		this.aClass182_3.method24563('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aet", name = "m", descriptor = "(Z)V", line = 51)
	@Override
	void method2792(@OriginalArg(0) boolean arg0) {
		this.aClass104_Sub1_25.method3894(260, 8448);
	}

	@OriginalMember(owner = "client!aet", name = "r", descriptor = "(Z)V", line = 51)
	@Override
	void method2797(@OriginalArg(0) boolean arg0) {
		this.aClass104_Sub1_25.method3894(260, 8448);
	}

	@OriginalMember(owner = "client!aet", name = "k", descriptor = "()V", line = 55)
	@Override
	void method2793() {
		this.aClass182_3.method24563('\u0001');
		if (this.aClass104_Sub1_25.anInt563 > 0) {
			this.aClass104_Sub1_25.method3882(1);
			this.aClass104_Sub1_25.method3887(null);
			this.aClass104_Sub1_25.method3819(1.0F, 0.0F);
			this.aClass104_Sub1_25.method3882(0);
		}
		this.aClass104_Sub1_25.method3894(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aet", name = "v", descriptor = "()V", line = 55)
	@Override
	void method2795() {
		this.aClass182_3.method24563('\u0001');
		if (this.aClass104_Sub1_25.anInt563 > 0) {
			this.aClass104_Sub1_25.method3882(1);
			this.aClass104_Sub1_25.method3887(null);
			this.aClass104_Sub1_25.method3819(1.0F, 0.0F);
			this.aClass104_Sub1_25.method3882(0);
		}
		this.aClass104_Sub1_25.method3894(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aet", name = "y", descriptor = "(II)V", line = 69)
	@Override
	void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass199_3.aBoolean577) {
				this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub3_2);
				aFloatArray4[0] = 0.0F;
				aFloatArray4[1] = 0.0F;
				aFloatArray4[2] = 0.0F;
				aFloatArray4[3] = (float) (this.aClass104_Sub1_25.anInt530 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
			} else {
				@Pc(53) int local53 = this.aClass104_Sub1_25.anInt530 % 4000 * 16 / 4000;
				this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub2Array2[local53]);
			}
		} else if (this.aClass199_3.aBoolean577) {
			this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub3_2);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = 0.0F;
			aFloatArray4[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
		} else {
			this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub2Array2[0]);
		}
	}

	@OriginalMember(owner = "client!aet", name = "o", descriptor = "(II)V", line = 69)
	@Override
	void method2803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass199_3.aBoolean577) {
				this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub3_2);
				aFloatArray4[0] = 0.0F;
				aFloatArray4[1] = 0.0F;
				aFloatArray4[2] = 0.0F;
				aFloatArray4[3] = (float) (this.aClass104_Sub1_25.anInt530 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
			} else {
				@Pc(53) int local53 = this.aClass104_Sub1_25.anInt530 % 4000 * 16 / 4000;
				this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub2Array2[local53]);
			}
		} else if (this.aClass199_3.aBoolean577) {
			this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub3_2);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = 0.0F;
			aFloatArray4[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
		} else {
			this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub2Array2[0]);
		}
	}

	@OriginalMember(owner = "client!aet", name = "s", descriptor = "(II)V", line = 69)
	@Override
	void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass199_3.aBoolean577) {
				this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub3_2);
				aFloatArray4[0] = 0.0F;
				aFloatArray4[1] = 0.0F;
				aFloatArray4[2] = 0.0F;
				aFloatArray4[3] = (float) (this.aClass104_Sub1_25.anInt530 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
			} else {
				@Pc(53) int local53 = this.aClass104_Sub1_25.anInt530 % 4000 * 16 / 4000;
				this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub2Array2[local53]);
			}
		} else if (this.aClass199_3.aBoolean577) {
			this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub3_2);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = 0.0F;
			aFloatArray4[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
		} else {
			this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub2Array2[0]);
		}
	}

	@OriginalMember(owner = "client!aet", name = "f", descriptor = "(II)V", line = 69)
	@Override
	void method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass199_3.aBoolean577) {
				this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub3_2);
				aFloatArray4[0] = 0.0F;
				aFloatArray4[1] = 0.0F;
				aFloatArray4[2] = 0.0F;
				aFloatArray4[3] = (float) (this.aClass104_Sub1_25.anInt530 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
			} else {
				@Pc(53) int local53 = this.aClass104_Sub1_25.anInt530 % 4000 * 16 / 4000;
				this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub2Array2[local53]);
			}
		} else if (this.aClass199_3.aBoolean577) {
			this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub3_2);
			aFloatArray4[0] = 0.0F;
			aFloatArray4[1] = 0.0F;
			aFloatArray4[2] = 0.0F;
			aFloatArray4[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray4, 0);
		} else {
			this.aClass104_Sub1_25.method3887(this.aClass199_3.aClass88_Sub2Array2[0]);
		}
	}

	@OriginalMember(owner = "client!aet", name = "w", descriptor = "(Lclient!bq;I)V", line = 96)
	@Override
	void method2789(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aet", name = "q", descriptor = "(Lclient!bq;I)V", line = 96)
	@Override
	void method2806(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aet", name = "x", descriptor = "(Lclient!bq;I)V", line = 96)
	@Override
	void method2807(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aet", name = "b", descriptor = "()V", line = 99)
	void method2662() {
		this.aClass182_3 = new Class182(this.aClass104_Sub1_25, 2);
		this.aClass182_3.method24557(0);
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3894(7681, 260);
		this.aClass104_Sub1_25.method3898(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.aClass104_Sub1_25.method3882(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass199_3.aBoolean577) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass182_3.method24559();
		this.aClass182_3.method24557(1);
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3894(8448, 8448);
		this.aClass104_Sub1_25.method3898(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.aClass104_Sub1_25.method3882(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass199_3.aBoolean577) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass182_3.method24559();
	}

	@OriginalMember(owner = "client!aet", name = "h", descriptor = "()V", line = 99)
	void method2663() {
		this.aClass182_3 = new Class182(this.aClass104_Sub1_25, 2);
		this.aClass182_3.method24557(0);
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3894(7681, 260);
		this.aClass104_Sub1_25.method3898(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.aClass104_Sub1_25.method3882(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass199_3.aBoolean577) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass182_3.method24559();
		this.aClass182_3.method24557(1);
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3894(8448, 8448);
		this.aClass104_Sub1_25.method3898(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.aClass104_Sub1_25.method3882(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass199_3.aBoolean577) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass182_3.method24559();
	}
}
