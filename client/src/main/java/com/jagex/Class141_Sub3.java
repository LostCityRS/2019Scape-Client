package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!air")
public class Class141_Sub3 extends Class141 implements Interface35 {

	@OriginalMember(owner = "client!air", name = "v", descriptor = "I")
	final int anInt1376;

	@OriginalMember(owner = "client!air", name = "o", descriptor = "I")
	final int anInt1377;

	@OriginalMember(owner = "client!air", name = "s", descriptor = "I")
	final int anInt1378;

	@OriginalMember(owner = "client!air", name = "<init>", descriptor = "(Lclient!aqv;Lclient!ck;IIIZ[B)V", line = 15)
	Class141_Sub3(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6) {
		super(arg0, 32879, arg1, Class226.aClass226_22, arg2 * arg3 * arg4, arg5);
		this.anInt1376 = arg2;
		this.anInt1377 = arg3;
		this.anInt1378 = arg4;
		this.aClass104_Sub2_Sub2_8.method21061(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.anInt1373, 0, Class104_Sub2_Sub2.method21339(this.aClass206_15, this.aClass226_16), this.anInt1376, this.anInt1377, this.anInt1378, 0, Class104_Sub2_Sub2.method21334(this.aClass206_15), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (arg5) {
			this.method11422();
		}
	}

	@OriginalMember(owner = "client!air", name = "aa", descriptor = "()V", line = 29)
	@Override
	public void method11417() {
		super.method11412();
	}

	@OriginalMember(owner = "client!air", name = "aj", descriptor = "()V", line = 29)
	@Override
	public void method11412() {
		super.method11412();
	}

	@OriginalMember(owner = "client!air", name = "af", descriptor = "()V", line = 29)
	@Override
	public void method11411() {
		super.method11412();
	}

	@OriginalMember(owner = "client!air", name = "az", descriptor = "(Lclient!lt;)V", line = 33)
	@Override
	public void method11416(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!air", name = "ay", descriptor = "(Lclient!lt;)V", line = 33)
	@Override
	public void method11414(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!air", name = "ab", descriptor = "(Lclient!lt;)V", line = 33)
	@Override
	public void method11415(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!air", name = "m", descriptor = "()V", line = 37)
	@Override
	public void method30884() {
		super.method30884();
	}

	@OriginalMember(owner = "client!air", name = "u", descriptor = "()V", line = 37)
	@Override
	public void method30885() {
		super.method30884();
	}
}
