package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeh")
public class Class97_Sub2 extends Class97 {

	@OriginalMember(owner = "client!aeh", name = "m", descriptor = "C")
	static final char aChar3 = '\u0001';

	@OriginalMember(owner = "client!aeh", name = "n", descriptor = "C")
	static final char aChar4 = '\u0000';

	@OriginalMember(owner = "client!aeh", name = "w", descriptor = "[F")
	static final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!aeh", name = "f", descriptor = "Lclient!bz;")
	Class199 aClass199_1;

	@OriginalMember(owner = "client!aeh", name = "k", descriptor = "Lclient!be;")
	Class182 aClass182_2;

	@OriginalMember(owner = "client!aeh", name = "<init>", descriptor = "(Lclient!afa;Lclient!bz;)V", line = 14)
	Class97_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class199 arg1) {
		super(arg0);
		this.aClass199_1 = arg1;
		this.aClass182_2 = new Class182(arg0, 2);
		this.aClass182_2.method24557(0);
		this.aClass104_Sub1_25.method3882(1);
		if (this.aClass199_1.aBoolean577) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		this.aClass104_Sub1_25.method3882(0);
		this.aClass182_2.method24559();
		this.aClass182_2.method24557(1);
		this.aClass104_Sub1_25.method3882(1);
		if (this.aClass199_1.aBoolean577) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass104_Sub1_25.method3882(0);
		this.aClass182_2.method24559();
	}

	@OriginalMember(owner = "client!aeh", name = "e", descriptor = "()Z", line = 39)
	@Override
	boolean method2790() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "l", descriptor = "()Z", line = 39)
	@Override
	boolean method2796() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "u", descriptor = "()Z", line = 39)
	@Override
	boolean method2802() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "z", descriptor = "()Z", line = 39)
	@Override
	boolean method2798() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "p", descriptor = "()Z", line = 39)
	@Override
	boolean method2791() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "d", descriptor = "()Z", line = 39)
	@Override
	boolean method2799() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "n", descriptor = "(Z)V", line = 43)
	@Override
	void method2801(@OriginalArg(0) boolean arg0) {
		this.aClass182_2.method24563('\u0000');
		if (this.aClass199_1.aBoolean577) {
			this.aClass104_Sub1_25.method3882(1);
			this.aClass104_Sub1_25.method3887(this.aClass199_1.aClass88_Sub3_3);
			this.aClass104_Sub1_25.method3882(0);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "c", descriptor = "(Z)V", line = 43)
	@Override
	void method2800(@OriginalArg(0) boolean arg0) {
		this.aClass182_2.method24563('\u0000');
		if (this.aClass199_1.aBoolean577) {
			this.aClass104_Sub1_25.method3882(1);
			this.aClass104_Sub1_25.method3887(this.aClass199_1.aClass88_Sub3_3);
			this.aClass104_Sub1_25.method3882(0);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "m", descriptor = "(Z)V", line = 51)
	@Override
	void method2792(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "r", descriptor = "(Z)V", line = 51)
	@Override
	void method2797(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "k", descriptor = "()V", line = 54)
	@Override
	void method2793() {
		this.aClass182_2.method24563('\u0001');
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3887(null);
		this.aClass104_Sub1_25.method3882(0);
	}

	@OriginalMember(owner = "client!aeh", name = "v", descriptor = "()V", line = 54)
	@Override
	void method2795() {
		this.aClass182_2.method24563('\u0001');
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3887(null);
		this.aClass104_Sub1_25.method3882(0);
	}

	@OriginalMember(owner = "client!aeh", name = "o", descriptor = "(II)V", line = 61)
	@Override
	void method2803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		this.aClass104_Sub1_25.method3882(1);
		if (local35) {
			aFloatArray1[0] = local27;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = 0.0F;
			aFloatArray1[3] = 0.0F;
		} else {
			aFloatArray1[0] = 0.0F;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = local27;
			aFloatArray1[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray1, 0);
		aFloatArray1[0] = 0.0F;
		aFloatArray1[1] = local27;
		aFloatArray1[2] = 0.0F;
		aFloatArray1[3] = (float) this.aClass104_Sub1_25.anInt530 * local8 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray1, 0);
		if (this.aClass199_1.aBoolean577) {
			aFloatArray1[0] = 0.0F;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = 0.0F;
			aFloatArray1[3] = (float) this.aClass104_Sub1_25.anInt530 * local19 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray1, 0);
		} else {
			@Pc(121) int local121 = (int) (local19 * (float) this.aClass104_Sub1_25.anInt530 * 16.0F);
			this.aClass104_Sub1_25.method3887(this.aClass199_1.aClass88_Sub2Array3[local121 % 16]);
		}
		this.aClass104_Sub1_25.method3882(0);
	}

	@OriginalMember(owner = "client!aeh", name = "f", descriptor = "(II)V", line = 61)
	@Override
	void method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		this.aClass104_Sub1_25.method3882(1);
		if (local35) {
			aFloatArray1[0] = local27;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = 0.0F;
			aFloatArray1[3] = 0.0F;
		} else {
			aFloatArray1[0] = 0.0F;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = local27;
			aFloatArray1[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray1, 0);
		aFloatArray1[0] = 0.0F;
		aFloatArray1[1] = local27;
		aFloatArray1[2] = 0.0F;
		aFloatArray1[3] = (float) this.aClass104_Sub1_25.anInt530 * local8 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray1, 0);
		if (this.aClass199_1.aBoolean577) {
			aFloatArray1[0] = 0.0F;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = 0.0F;
			aFloatArray1[3] = (float) this.aClass104_Sub1_25.anInt530 * local19 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray1, 0);
		} else {
			@Pc(121) int local121 = (int) (local19 * (float) this.aClass104_Sub1_25.anInt530 * 16.0F);
			this.aClass104_Sub1_25.method3887(this.aClass199_1.aClass88_Sub2Array3[local121 % 16]);
		}
		this.aClass104_Sub1_25.method3882(0);
	}

	@OriginalMember(owner = "client!aeh", name = "s", descriptor = "(II)V", line = 61)
	@Override
	void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		this.aClass104_Sub1_25.method3882(1);
		if (local35) {
			aFloatArray1[0] = local27;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = 0.0F;
			aFloatArray1[3] = 0.0F;
		} else {
			aFloatArray1[0] = 0.0F;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = local27;
			aFloatArray1[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray1, 0);
		aFloatArray1[0] = 0.0F;
		aFloatArray1[1] = local27;
		aFloatArray1[2] = 0.0F;
		aFloatArray1[3] = (float) this.aClass104_Sub1_25.anInt530 * local8 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray1, 0);
		if (this.aClass199_1.aBoolean577) {
			aFloatArray1[0] = 0.0F;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = 0.0F;
			aFloatArray1[3] = (float) this.aClass104_Sub1_25.anInt530 * local19 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray1, 0);
		} else {
			@Pc(121) int local121 = (int) (local19 * (float) this.aClass104_Sub1_25.anInt530 * 16.0F);
			this.aClass104_Sub1_25.method3887(this.aClass199_1.aClass88_Sub2Array3[local121 % 16]);
		}
		this.aClass104_Sub1_25.method3882(0);
	}

	@OriginalMember(owner = "client!aeh", name = "y", descriptor = "(II)V", line = 61)
	@Override
	void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		this.aClass104_Sub1_25.method3882(1);
		if (local35) {
			aFloatArray1[0] = local27;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = 0.0F;
			aFloatArray1[3] = 0.0F;
		} else {
			aFloatArray1[0] = 0.0F;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = local27;
			aFloatArray1[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray1, 0);
		aFloatArray1[0] = 0.0F;
		aFloatArray1[1] = local27;
		aFloatArray1[2] = 0.0F;
		aFloatArray1[3] = (float) this.aClass104_Sub1_25.anInt530 * local8 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray1, 0);
		if (this.aClass199_1.aBoolean577) {
			aFloatArray1[0] = 0.0F;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = 0.0F;
			aFloatArray1[3] = (float) this.aClass104_Sub1_25.anInt530 * local19 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray1, 0);
		} else {
			@Pc(121) int local121 = (int) (local19 * (float) this.aClass104_Sub1_25.anInt530 * 16.0F);
			this.aClass104_Sub1_25.method3887(this.aClass199_1.aClass88_Sub2Array3[local121 % 16]);
		}
		this.aClass104_Sub1_25.method3882(0);
	}

	@OriginalMember(owner = "client!aeh", name = "w", descriptor = "(Lclient!bq;I)V", line = 99)
	@Override
	void method2789(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_25.method3887(arg0);
		this.aClass104_Sub1_25.method3888(arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "q", descriptor = "(Lclient!bq;I)V", line = 99)
	@Override
	void method2806(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_25.method3887(arg0);
		this.aClass104_Sub1_25.method3888(arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "x", descriptor = "(Lclient!bq;I)V", line = 99)
	@Override
	void method2807(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_25.method3887(arg0);
		this.aClass104_Sub1_25.method3888(arg1);
	}
}
