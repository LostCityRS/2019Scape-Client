package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ads")
public final class Class84_Sub3 extends Class84 {

	@OriginalMember(owner = "client!ads", name = "r", descriptor = "I")
	final int anInt311;

	@OriginalMember(owner = "client!ads", name = "q", descriptor = "I")
	final int anInt310;

	@OriginalMember(owner = "client!ads", name = "h", descriptor = "I")
	final int anInt312;

	@OriginalMember(owner = "client!ads", name = "<init>", descriptor = "(Lclient!afm;Lclient!co;Lclient!dy;III[BLclient!co;)V")
	Class84_Sub3(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) Class210 arg7) {
		super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
		this.anInt311 = arg3;
		this.anInt310 = arg4;
		this.anInt312 = arg5;
		this.aClass102_Sub3_34.method6339(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.anInt2587, 0, Class102_Sub3.method6411(this.aClass210_16, this.aClass236_17), this.anInt311, this.anInt310, this.anInt312, 0, Class102_Sub3.method6423(arg7), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method18340(true);
	}

	@OriginalMember(owner = "client!ads", name = "<init>", descriptor = "(Lclient!afm;Lclient!co;Lclient!dy;III)V")
	Class84_Sub3(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
		this.anInt311 = arg3;
		this.anInt310 = arg4;
		this.anInt312 = arg5;
		this.aClass102_Sub3_34.method6339(this);
		OpenGL.glTexImage3Dub(this.anInt2587, 0, Class102_Sub3.method6411(this.aClass210_16, this.aClass236_17), this.anInt311, this.anInt310, this.anInt312, 0, Class102_Sub3.method6423(this.aClass210_16), 5121, null, 0);
		this.method18340(true);
	}

	@OriginalMember(owner = "client!ads", name = "ab", descriptor = "(IIIIIII)V")
	void method1778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass102_Sub3_34.method6339(this);
		OpenGL.glCopyTexSubImage3D(this.anInt2587, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ads", name = "ag", descriptor = "(IIIIIII)V")
	void method1779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass102_Sub3_34.method6339(this);
		OpenGL.glCopyTexSubImage3D(this.anInt2587, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ads", name = "al", descriptor = "(IIIIIII)V")
	void method1780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass102_Sub3_34.method6339(this);
		OpenGL.glCopyTexSubImage3D(this.anInt2587, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
		OpenGL.glFlush();
	}
}
