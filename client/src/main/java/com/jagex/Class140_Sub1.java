package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aig")
public final class Class140_Sub1 extends Class140 implements Interface36 {

	@OriginalMember(owner = "client!aig", name = "x", descriptor = "I")
	final int anInt1271;

	@OriginalMember(owner = "client!aig", name = "w", descriptor = "I")
	final int anInt1270;

	@OriginalMember(owner = "client!aig", name = "r", descriptor = "I")
	final int anInt1269;

	@OriginalMember(owner = "client!aig", name = "<init>", descriptor = "(Lclient!aqi;Lclient!co;IIIZ[B)V")
	Class140_Sub1(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6) {
		super(arg0, 32879, arg1, Class236.aClass236_21, arg2 * arg3 * arg4, arg5);
		this.anInt1271 = arg2;
		this.anInt1270 = arg3;
		this.anInt1269 = arg4;
		this.aClass102_Sub1_Sub1_9.method21429(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.anInt1324, 0, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), this.anInt1271, this.anInt1270, this.anInt1269, 0, Class102_Sub1_Sub1.method20106(this.aClass210_14), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (arg5) {
			this.method11713();
		}
	}

	@OriginalMember(owner = "client!aig", name = "br", descriptor = "()V")
	@Override
	public void method11816() {
		super.method11817();
	}

	@OriginalMember(owner = "client!aig", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aig", name = "bg", descriptor = "(Lclient!le;)V")
	@Override
	public void method11807(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}

	@OriginalMember(owner = "client!aig", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aig", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aig", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aig", name = "bl", descriptor = "()V")
	@Override
	public void method11818() {
		super.method11817();
	}

	@OriginalMember(owner = "client!aig", name = "aw", descriptor = "()V")
	@Override
	public void method11817() {
		super.method11817();
	}

	@OriginalMember(owner = "client!aig", name = "bn", descriptor = "()V")
	@Override
	public void method11819() {
		super.method11817();
	}

	@OriginalMember(owner = "client!aig", name = "ba", descriptor = "(Lclient!le;)V")
	@Override
	public void method11812(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}
}
