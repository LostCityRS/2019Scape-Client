package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aez")
public class Class97_Sub9 extends Class97 {

	@OriginalMember(owner = "client!aez", name = "m", descriptor = "C")
	static final char aChar9 = '\u0001';

	@OriginalMember(owner = "client!aez", name = "n", descriptor = "C")
	static final char aChar10 = '\u0000';

	@OriginalMember(owner = "client!aez", name = "f", descriptor = "Z")
	boolean aBoolean70 = false;

	@OriginalMember(owner = "client!aez", name = "k", descriptor = "Lclient!be;")
	Class182 aClass182_5;

	@OriginalMember(owner = "client!aez", name = "<init>", descriptor = "(Lclient!afa;)V", line = 14)
	Class97_Sub9(@OriginalArg(0) Class104_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean83) {
			this.aClass182_5 = new Class182(arg0, 2);
			this.aClass182_5.method24557(0);
			this.aClass104_Sub1_25.method3882(1);
			this.aClass104_Sub1_25.method3894(34165, 7681);
			this.aClass104_Sub1_25.method3898(2, 34168, 770);
			this.aClass104_Sub1_25.method3903(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			this.aClass104_Sub1_25.method3882(0);
			this.aClass182_5.method24559();
			this.aClass182_5.method24557(1);
			this.aClass104_Sub1_25.method3882(1);
			this.aClass104_Sub1_25.method3894(8448, 8448);
			this.aClass104_Sub1_25.method3898(2, 34166, 770);
			this.aClass104_Sub1_25.method3903(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aClass104_Sub1_25.method3882(0);
			this.aClass182_5.method24559();
		}
	}

	@OriginalMember(owner = "client!aez", name = "e", descriptor = "()Z", line = 47)
	@Override
	boolean method2790() {
		return true;
	}

	@OriginalMember(owner = "client!aez", name = "l", descriptor = "()Z", line = 47)
	@Override
	boolean method2796() {
		return true;
	}

	@OriginalMember(owner = "client!aez", name = "u", descriptor = "()Z", line = 47)
	@Override
	boolean method2802() {
		return true;
	}

	@OriginalMember(owner = "client!aez", name = "z", descriptor = "()Z", line = 47)
	@Override
	boolean method2798() {
		return true;
	}

	@OriginalMember(owner = "client!aez", name = "p", descriptor = "()Z", line = 47)
	@Override
	boolean method2791() {
		return true;
	}

	@OriginalMember(owner = "client!aez", name = "d", descriptor = "()Z", line = 47)
	@Override
	boolean method2799() {
		return true;
	}

	@OriginalMember(owner = "client!aez", name = "c", descriptor = "(Z)V", line = 51)
	@Override
	void method2800(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class88_Sub1 local3 = this.aClass104_Sub1_25.method3838();
		if (this.aClass182_5 == null || local3 == null || !arg0) {
			this.aClass104_Sub1_25.method3903(0, 34168, 770);
			return;
		}
		this.aClass182_5.method24563('\u0000');
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3887(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass104_Sub1_25.aClass489_4.method29942(this.aClass104_Sub1_25.aFloatArray7), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_25.method3882(0);
		this.aBoolean70 = true;
	}

	@OriginalMember(owner = "client!aez", name = "n", descriptor = "(Z)V", line = 51)
	@Override
	void method2801(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class88_Sub1 local3 = this.aClass104_Sub1_25.method3838();
		if (this.aClass182_5 == null || local3 == null || !arg0) {
			this.aClass104_Sub1_25.method3903(0, 34168, 770);
			return;
		}
		this.aClass182_5.method24563('\u0000');
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3887(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass104_Sub1_25.aClass489_4.method29942(this.aClass104_Sub1_25.aFloatArray7), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_25.method3882(0);
		this.aBoolean70 = true;
	}

	@OriginalMember(owner = "client!aez", name = "m", descriptor = "(Z)V", line = 67)
	@Override
	void method2792(@OriginalArg(0) boolean arg0) {
		this.aClass104_Sub1_25.method3894(8448, 7681);
	}

	@OriginalMember(owner = "client!aez", name = "r", descriptor = "(Z)V", line = 67)
	@Override
	void method2797(@OriginalArg(0) boolean arg0) {
		this.aClass104_Sub1_25.method3894(8448, 7681);
	}

	@OriginalMember(owner = "client!aez", name = "k", descriptor = "()V", line = 71)
	@Override
	void method2793() {
		if (this.aBoolean70) {
			this.aClass182_5.method24563('\u0001');
			this.aClass104_Sub1_25.method3882(1);
			this.aClass104_Sub1_25.method3887(null);
			this.aClass104_Sub1_25.method3882(0);
		} else {
			this.aClass104_Sub1_25.method3903(0, 5890, 770);
		}
		this.aClass104_Sub1_25.method3894(8448, 8448);
		this.aBoolean70 = false;
	}

	@OriginalMember(owner = "client!aez", name = "v", descriptor = "()V", line = 71)
	@Override
	void method2795() {
		if (this.aBoolean70) {
			this.aClass182_5.method24563('\u0001');
			this.aClass104_Sub1_25.method3882(1);
			this.aClass104_Sub1_25.method3887(null);
			this.aClass104_Sub1_25.method3882(0);
		} else {
			this.aClass104_Sub1_25.method3903(0, 5890, 770);
		}
		this.aClass104_Sub1_25.method3894(8448, 8448);
		this.aBoolean70 = false;
	}

	@OriginalMember(owner = "client!aez", name = "f", descriptor = "(II)V", line = 82)
	@Override
	void method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aez", name = "s", descriptor = "(II)V", line = 82)
	@Override
	void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aez", name = "y", descriptor = "(II)V", line = 82)
	@Override
	void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aez", name = "o", descriptor = "(II)V", line = 82)
	@Override
	void method2803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aez", name = "x", descriptor = "(Lclient!bq;I)V", line = 85)
	@Override
	void method2807(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_25.method3887(arg0);
		this.aClass104_Sub1_25.method3888(arg1);
	}

	@OriginalMember(owner = "client!aez", name = "w", descriptor = "(Lclient!bq;I)V", line = 85)
	@Override
	void method2789(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_25.method3887(arg0);
		this.aClass104_Sub1_25.method3888(arg1);
	}

	@OriginalMember(owner = "client!aez", name = "q", descriptor = "(Lclient!bq;I)V", line = 85)
	@Override
	void method2806(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_25.method3887(arg0);
		this.aClass104_Sub1_25.method3888(arg1);
	}
}
