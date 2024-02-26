package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aec")
public final class Class96_Sub1 extends Class96 {

	@OriginalMember(owner = "client!aec", name = "e", descriptor = "C")
	static final char aChar1 = '\u0001';

	@OriginalMember(owner = "client!aec", name = "f", descriptor = "C")
	static final char aChar2 = '\u0000';

	@OriginalMember(owner = "client!aec", name = "l", descriptor = "Z")
	boolean aBoolean54 = false;

	@OriginalMember(owner = "client!aec", name = "u", descriptor = "Lclient!bv;")
	Class197 aClass197_1;

	@OriginalMember(owner = "client!aec", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class96_Sub1(@OriginalArg(0) Class102_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean150) {
			this.aClass197_1 = new Class197(arg0, 2);
			this.aClass197_1.method24905(0);
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6389(34165, 7681);
			this.aClass102_Sub3_24.method6390(2, 34168, 770);
			this.aClass102_Sub3_24.method6391(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			this.aClass102_Sub3_24.method6386(0);
			this.aClass197_1.method24913();
			this.aClass197_1.method24905(1);
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6389(8448, 8448);
			this.aClass102_Sub3_24.method6390(2, 34166, 770);
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aClass102_Sub3_24.method6386(0);
			this.aClass197_1.method24913();
		}
	}

	@OriginalMember(owner = "client!aec", name = "u", descriptor = "()V")
	@Override
	void method2885() {
		if (this.aBoolean54) {
			this.aClass197_1.method24907('\u0001');
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
		} else {
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!aec", name = "t", descriptor = "()Z")
	@Override
	boolean method2897() {
		return true;
	}

	@OriginalMember(owner = "client!aec", name = "f", descriptor = "(Z)V")
	@Override
	void method2887(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class84_Sub2 local3 = this.aClass102_Sub3_24.method6369();
		if (this.aClass197_1 == null || local3 == null || !arg0) {
			this.aClass102_Sub3_24.method6391(0, 34168, 770);
			return;
		}
		this.aClass197_1.method24907('\u0000');
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass102_Sub3_24.aClass487_23.method30115(this.aClass102_Sub3_24.aFloatArray18), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_24.method6386(0);
		this.aBoolean54 = true;
	}

	@OriginalMember(owner = "client!aec", name = "e", descriptor = "(Z)V")
	@Override
	void method2888(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_24.method6389(8448, 7681);
	}

	@OriginalMember(owner = "client!aec", name = "m", descriptor = "(Z)V")
	@Override
	void method2892(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class84_Sub2 local3 = this.aClass102_Sub3_24.method6369();
		if (this.aClass197_1 == null || local3 == null || !arg0) {
			this.aClass102_Sub3_24.method6391(0, 34168, 770);
			return;
		}
		this.aClass197_1.method24907('\u0000');
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass102_Sub3_24.aClass487_23.method30115(this.aClass102_Sub3_24.aFloatArray18), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_24.method6386(0);
		this.aBoolean54 = true;
	}

	@OriginalMember(owner = "client!aec", name = "l", descriptor = "(II)V")
	@Override
	void method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aec", name = "g", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2891(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_24.method6339(arg0);
		this.aClass102_Sub3_24.method6543(arg1);
	}

	@OriginalMember(owner = "client!aec", name = "i", descriptor = "()Z")
	@Override
	boolean method2894() {
		return true;
	}

	@OriginalMember(owner = "client!aec", name = "x", descriptor = "()V")
	@Override
	void method2898() {
		if (this.aBoolean54) {
			this.aClass197_1.method24907('\u0001');
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
		} else {
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!aec", name = "o", descriptor = "(Z)V")
	@Override
	void method2893(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class84_Sub2 local3 = this.aClass102_Sub3_24.method6369();
		if (this.aClass197_1 == null || local3 == null || !arg0) {
			this.aClass102_Sub3_24.method6391(0, 34168, 770);
			return;
		}
		this.aClass197_1.method24907('\u0000');
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass102_Sub3_24.aClass487_23.method30115(this.aClass102_Sub3_24.aFloatArray18), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_24.method6386(0);
		this.aBoolean54 = true;
	}

	@OriginalMember(owner = "client!aec", name = "p", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2905(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_24.method6339(arg0);
		this.aClass102_Sub3_24.method6543(arg1);
	}

	@OriginalMember(owner = "client!aec", name = "a", descriptor = "(Z)V")
	@Override
	void method2895(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_24.method6389(8448, 7681);
	}

	@OriginalMember(owner = "client!aec", name = "s", descriptor = "(Z)V")
	@Override
	void method2896(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_24.method6389(8448, 7681);
	}

	@OriginalMember(owner = "client!aec", name = "k", descriptor = "(Z)V")
	@Override
	void method2886(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_24.method6389(8448, 7681);
	}

	@OriginalMember(owner = "client!aec", name = "w", descriptor = "()V")
	@Override
	void method2899() {
		if (this.aBoolean54) {
			this.aClass197_1.method24907('\u0001');
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
		} else {
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!aec", name = "r", descriptor = "()V")
	@Override
	void method2900() {
		if (this.aBoolean54) {
			this.aClass197_1.method24907('\u0001');
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
		} else {
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!aec", name = "q", descriptor = "()V")
	@Override
	void method2901() {
		if (this.aBoolean54) {
			this.aClass197_1.method24907('\u0001');
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
		} else {
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!aec", name = "h", descriptor = "(II)V")
	@Override
	void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aec", name = "j", descriptor = "(Z)V")
	@Override
	void method2889(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class84_Sub2 local3 = this.aClass102_Sub3_24.method6369();
		if (this.aClass197_1 == null || local3 == null || !arg0) {
			this.aClass102_Sub3_24.method6391(0, 34168, 770);
			return;
		}
		this.aClass197_1.method24907('\u0000');
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(local3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass102_Sub3_24.aClass487_23.method30115(this.aClass102_Sub3_24.aFloatArray18), 0);
		OpenGL.glScalef(1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_24.method6386(0);
		this.aBoolean54 = true;
	}

	@OriginalMember(owner = "client!aec", name = "z", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2904(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_24.method6339(arg0);
		this.aClass102_Sub3_24.method6543(arg1);
	}

	@OriginalMember(owner = "client!aec", name = "d", descriptor = "(II)V")
	@Override
	void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
