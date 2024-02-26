package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aef")
public final class Class96_Sub2 extends Class96 {

	@OriginalMember(owner = "client!aef", name = "f", descriptor = "C")
	static final char aChar3 = '\u0000';

	@OriginalMember(owner = "client!aef", name = "e", descriptor = "C")
	static final char aChar4 = '\u0001';

	@OriginalMember(owner = "client!aef", name = "g", descriptor = "[F")
	static final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!aef", name = "l", descriptor = "Lclient!bf;")
	Class182 aClass182_1;

	@OriginalMember(owner = "client!aef", name = "u", descriptor = "Lclient!bv;")
	Class197 aClass197_2;

	@OriginalMember(owner = "client!aef", name = "<init>", descriptor = "(Lclient!afm;Lclient!bf;)V")
	Class96_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class182 arg1) {
		super(arg0);
		this.aClass182_1 = arg1;
		this.aClass197_2 = new Class197(arg0, 2);
		this.aClass197_2.method24905(0);
		this.aClass102_Sub3_24.method6386(1);
		if (this.aClass182_1.aBoolean675) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass197_2.method24913();
		this.aClass197_2.method24905(1);
		this.aClass102_Sub3_24.method6386(1);
		if (this.aClass182_1.aBoolean675) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass197_2.method24913();
	}

	@OriginalMember(owner = "client!aef", name = "t", descriptor = "()Z")
	@Override
	boolean method2897() {
		return true;
	}

	@OriginalMember(owner = "client!aef", name = "f", descriptor = "(Z)V")
	@Override
	void method2887(@OriginalArg(0) boolean arg0) {
		this.aClass197_2.method24907('\u0000');
		if (this.aClass182_1.aBoolean675) {
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(this.aClass182_1.aClass84_Sub3_2);
			this.aClass102_Sub3_24.method6386(0);
		}
	}

	@OriginalMember(owner = "client!aef", name = "e", descriptor = "(Z)V")
	@Override
	void method2888(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aef", name = "h", descriptor = "(II)V")
	@Override
	void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		this.aClass102_Sub3_24.method6386(1);
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
		aFloatArray1[3] = (float) this.aClass102_Sub3_24.anInt770 * local8 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray1, 0);
		if (this.aClass182_1.aBoolean675) {
			aFloatArray1[0] = 0.0F;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = 0.0F;
			aFloatArray1[3] = (float) this.aClass102_Sub3_24.anInt770 * local19 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray1, 0);
		} else {
			@Pc(121) int local121 = (int) (local19 * (float) this.aClass102_Sub3_24.anInt770 * 16.0F);
			this.aClass102_Sub3_24.method6339(this.aClass182_1.aClass84_Sub1Array3[local121 % 16]);
		}
		this.aClass102_Sub3_24.method6386(0);
	}

	@OriginalMember(owner = "client!aef", name = "l", descriptor = "(II)V")
	@Override
	void method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		this.aClass102_Sub3_24.method6386(1);
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
		aFloatArray1[3] = (float) this.aClass102_Sub3_24.anInt770 * local8 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray1, 0);
		if (this.aClass182_1.aBoolean675) {
			aFloatArray1[0] = 0.0F;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = 0.0F;
			aFloatArray1[3] = (float) this.aClass102_Sub3_24.anInt770 * local19 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray1, 0);
		} else {
			@Pc(121) int local121 = (int) (local19 * (float) this.aClass102_Sub3_24.anInt770 * 16.0F);
			this.aClass102_Sub3_24.method6339(this.aClass182_1.aClass84_Sub1Array3[local121 % 16]);
		}
		this.aClass102_Sub3_24.method6386(0);
	}

	@OriginalMember(owner = "client!aef", name = "g", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2891(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_24.method6339(arg0);
		this.aClass102_Sub3_24.method6543(arg1);
	}

	@OriginalMember(owner = "client!aef", name = "i", descriptor = "()Z")
	@Override
	boolean method2894() {
		return true;
	}

	@OriginalMember(owner = "client!aef", name = "r", descriptor = "()V")
	@Override
	void method2900() {
		this.aClass197_2.method24907('\u0001');
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
	}

	@OriginalMember(owner = "client!aef", name = "m", descriptor = "(Z)V")
	@Override
	void method2892(@OriginalArg(0) boolean arg0) {
		this.aClass197_2.method24907('\u0000');
		if (this.aClass182_1.aBoolean675) {
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(this.aClass182_1.aClass84_Sub3_2);
			this.aClass102_Sub3_24.method6386(0);
		}
	}

	@OriginalMember(owner = "client!aef", name = "j", descriptor = "(Z)V")
	@Override
	void method2889(@OriginalArg(0) boolean arg0) {
		this.aClass197_2.method24907('\u0000');
		if (this.aClass182_1.aBoolean675) {
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(this.aClass182_1.aClass84_Sub3_2);
			this.aClass102_Sub3_24.method6386(0);
		}
	}

	@OriginalMember(owner = "client!aef", name = "p", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2905(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_24.method6339(arg0);
		this.aClass102_Sub3_24.method6543(arg1);
	}

	@OriginalMember(owner = "client!aef", name = "s", descriptor = "(Z)V")
	@Override
	void method2896(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aef", name = "z", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2904(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_24.method6339(arg0);
		this.aClass102_Sub3_24.method6543(arg1);
	}

	@OriginalMember(owner = "client!aef", name = "x", descriptor = "()V")
	@Override
	void method2898() {
		this.aClass197_2.method24907('\u0001');
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
	}

	@OriginalMember(owner = "client!aef", name = "w", descriptor = "()V")
	@Override
	void method2899() {
		this.aClass197_2.method24907('\u0001');
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
	}

	@OriginalMember(owner = "client!aef", name = "u", descriptor = "()V")
	@Override
	void method2885() {
		this.aClass197_2.method24907('\u0001');
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
	}

	@OriginalMember(owner = "client!aef", name = "q", descriptor = "()V")
	@Override
	void method2901() {
		this.aClass197_2.method24907('\u0001');
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
	}

	@OriginalMember(owner = "client!aef", name = "o", descriptor = "(Z)V")
	@Override
	void method2893(@OriginalArg(0) boolean arg0) {
		this.aClass197_2.method24907('\u0000');
		if (this.aClass182_1.aBoolean675) {
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(this.aClass182_1.aClass84_Sub3_2);
			this.aClass102_Sub3_24.method6386(0);
		}
	}

	@OriginalMember(owner = "client!aef", name = "d", descriptor = "(II)V")
	@Override
	void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		this.aClass102_Sub3_24.method6386(1);
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
		aFloatArray1[3] = (float) this.aClass102_Sub3_24.anInt770 * local8 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray1, 0);
		if (this.aClass182_1.aBoolean675) {
			aFloatArray1[0] = 0.0F;
			aFloatArray1[1] = 0.0F;
			aFloatArray1[2] = 0.0F;
			aFloatArray1[3] = (float) this.aClass102_Sub3_24.anInt770 * local19 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray1, 0);
		} else {
			@Pc(121) int local121 = (int) (local19 * (float) this.aClass102_Sub3_24.anInt770 * 16.0F);
			this.aClass102_Sub3_24.method6339(this.aClass182_1.aClass84_Sub1Array3[local121 % 16]);
		}
		this.aClass102_Sub3_24.method6386(0);
	}

	@OriginalMember(owner = "client!aef", name = "k", descriptor = "(Z)V")
	@Override
	void method2886(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aef", name = "a", descriptor = "(Z)V")
	@Override
	void method2895(@OriginalArg(0) boolean arg0) {
	}
}
