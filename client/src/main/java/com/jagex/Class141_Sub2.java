package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ail")
public class Class141_Sub2 extends Class141 implements Interface44 {

	@OriginalMember(owner = "client!ail", name = "v", descriptor = "I")
	static final int anInt1350 = 34069;

	@OriginalMember(owner = "client!ail", name = "<init>", descriptor = "(Lclient!aqv;IZ[[I)V", line = 13)
	Class141_Sub2(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Class206.aClass206_22, Class226.aClass226_22, arg1 * arg1 * 6, arg2);
		@Pc(13) int local13;
		for (local13 = 0; local13 < 6; local13++) {
			for (@Pc(18) int local18 = 0; local18 < arg3[local13].length; local18++) {
				@Pc(30) int local30 = arg3[local13][local18];
				arg3[local13][local18] = local30 & 0xFF00FF00 | (local30 & 0xFF) << 16 | local30 >> 16 & 0xFF;
			}
		}
		this.aClass104_Sub2_Sub2_8.method21061(this);
		if (arg2) {
			for (local13 = 0; local13 < 6; local13++) {
				this.method11426(local13 + 34069, arg1, arg1, arg3[local13]);
			}
		} else {
			for (local13 = 0; local13 < 6; local13++) {
				OpenGL.glTexImage2Di(local13 + 34069, 0, Class104_Sub2_Sub2.method21339(this.aClass206_15, this.aClass226_16), arg1, arg1, 0, Class104_Sub2_Sub2.method21334(this.aClass206_15), this.aClass104_Sub2_Sub2_8.anInt2963, arg3[local13], 0);
			}
		}
	}

	@OriginalMember(owner = "client!ail", name = "aj", descriptor = "()V", line = 34)
	@Override
	public void method11412() {
		super.method11412();
	}

	@OriginalMember(owner = "client!ail", name = "aa", descriptor = "()V", line = 34)
	@Override
	public void method11417() {
		super.method11412();
	}

	@OriginalMember(owner = "client!ail", name = "af", descriptor = "()V", line = 34)
	@Override
	public void method11411() {
		super.method11412();
	}

	@OriginalMember(owner = "client!ail", name = "ay", descriptor = "(Lclient!lt;)V", line = 38)
	@Override
	public void method11414(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!ail", name = "ab", descriptor = "(Lclient!lt;)V", line = 38)
	@Override
	public void method11415(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!ail", name = "az", descriptor = "(Lclient!lt;)V", line = 38)
	@Override
	public void method11416(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!ail", name = "m", descriptor = "()V", line = 42)
	@Override
	public void method30884() {
		super.method30884();
	}

	@OriginalMember(owner = "client!ail", name = "u", descriptor = "()V", line = 42)
	@Override
	public void method30885() {
		super.method30884();
	}
}
