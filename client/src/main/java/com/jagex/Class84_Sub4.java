package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aed")
public final class Class84_Sub4 extends Class84 {

	@OriginalMember(owner = "client!aed", name = "r", descriptor = "I")
	final int anInt350;

	@OriginalMember(owner = "client!aed", name = "<init>", descriptor = "(Lclient!afm;Lclient!co;Lclient!dy;I[BLclient!co;)V")
	Class84_Sub4(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class210 arg5) {
		super(arg0, 3552, arg1, arg2, arg3, false);
		this.anInt350 = arg3;
		this.aClass102_Sub3_34.method6339(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(this.anInt2587, 0, Class102_Sub3.method6411(this.aClass210_16, this.aClass236_17), this.anInt350, 0, Class102_Sub3.method6423(arg5), 5121, arg4, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method18340(true);
	}

	@OriginalMember(owner = "client!aed", name = "ag", descriptor = "(Z)V")
	void method2029(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_34.method6339(this);
		OpenGL.glTexParameteri(this.anInt2587, 10242, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aed", name = "ah", descriptor = "(Z)V")
	void method2030(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_34.method6339(this);
		OpenGL.glTexParameteri(this.anInt2587, 10242, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aed", name = "al", descriptor = "(Z)V")
	void method2031(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_34.method6339(this);
		OpenGL.glTexParameteri(this.anInt2587, 10242, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aed", name = "ab", descriptor = "(Z)V")
	void method2032(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_34.method6339(this);
		OpenGL.glTexParameteri(this.anInt2587, 10242, arg0 ? 10497 : 33071);
	}
}
