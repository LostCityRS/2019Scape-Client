package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ait")
public final class Class140_Sub3 extends Class140 implements Interface42 {

	@OriginalMember(owner = "client!ait", name = "x", descriptor = "I")
	static final int anInt1329 = 34069;

	@OriginalMember(owner = "client!ait", name = "<init>", descriptor = "(Lclient!aqi;IZ[[I)V")
	Class140_Sub3(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Class210.aClass210_24, Class236.aClass236_21, arg1 * arg1 * 6, arg2);
		@Pc(13) int local13;
		for (local13 = 0; local13 < 6; local13++) {
			for (@Pc(18) int local18 = 0; local18 < arg3[local13].length; local18++) {
				@Pc(30) int local30 = arg3[local13][local18];
				arg3[local13][local18] = local30 & 0xFF00FF00 | (local30 & 0xFF) << 16 | local30 >> 16 & 0xFF;
			}
		}
		this.aClass102_Sub1_Sub1_9.method21429(this);
		if (arg2) {
			for (local13 = 0; local13 < 6; local13++) {
				this.method11714(local13 + 34069, arg1, arg1, arg3[local13]);
			}
		} else {
			for (local13 = 0; local13 < 6; local13++) {
				OpenGL.glTexImage2Di(local13 + 34069, 0, Class102_Sub1_Sub1.method20103(this.aClass210_14, this.aClass236_15), arg1, arg1, 0, Class102_Sub1_Sub1.method20106(this.aClass210_14), this.aClass102_Sub1_Sub1_9.anInt2837, arg3[local13], 0);
			}
		}
	}

	@OriginalMember(owner = "client!ait", name = "aw", descriptor = "()V")
	@Override
	public void method11817() {
		super.method11817();
	}

	@OriginalMember(owner = "client!ait", name = "bg", descriptor = "(Lclient!le;)V")
	@Override
	public void method11807(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}

	@OriginalMember(owner = "client!ait", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		super.method30837();
	}

	@OriginalMember(owner = "client!ait", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		super.method30837();
	}

	@OriginalMember(owner = "client!ait", name = "bn", descriptor = "()V")
	@Override
	public void method11819() {
		super.method11817();
	}

	@OriginalMember(owner = "client!ait", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		super.method30837();
	}

	@OriginalMember(owner = "client!ait", name = "bl", descriptor = "()V")
	@Override
	public void method11818() {
		super.method11817();
	}

	@OriginalMember(owner = "client!ait", name = "br", descriptor = "()V")
	@Override
	public void method11816() {
		super.method11817();
	}

	@OriginalMember(owner = "client!ait", name = "ba", descriptor = "(Lclient!le;)V")
	@Override
	public void method11812(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}

	@OriginalMember(owner = "client!ait", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		super.method30837();
	}
}
