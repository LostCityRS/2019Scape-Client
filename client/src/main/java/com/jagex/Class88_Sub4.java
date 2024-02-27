package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aew")
public final class Class88_Sub4 extends Class88 {

	@OriginalMember(owner = "client!aew", name = "s", descriptor = "I")
	final int anInt439;

	@OriginalMember(owner = "client!aew", name = "<init>", descriptor = "(Lclient!afa;Lclient!ck;Lclient!dg;I[BLclient!ck;)V")
	Class88_Sub4(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class206 arg5) {
		super(arg0, 3552, arg1, arg2, arg3, false);
		this.anInt439 = arg3;
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(this.anInt2543, 0, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), this.anInt439, 0, Class104_Sub1.method3926(arg5), 5121, arg4, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method18053(true);
	}

	@OriginalMember(owner = "client!aew", name = "ar", descriptor = "(Z)V")
	void method2743(@OriginalArg(0) boolean arg0) {
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glTexParameteri(this.anInt2543, 10242, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aew", name = "ap", descriptor = "(Z)V")
	void method2744(@OriginalArg(0) boolean arg0) {
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glTexParameteri(this.anInt2543, 10242, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aew", name = "ax", descriptor = "(Z)V")
	void method2745(@OriginalArg(0) boolean arg0) {
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glTexParameteri(this.anInt2543, 10242, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aew", name = "av", descriptor = "(Z)V")
	void method2746(@OriginalArg(0) boolean arg0) {
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glTexParameteri(this.anInt2543, 10242, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!aew", name = "aq", descriptor = "(Z)V")
	void method2747(@OriginalArg(0) boolean arg0) {
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glTexParameteri(this.anInt2543, 10242, arg0 ? 10497 : 33071);
	}
}
