package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adr")
public final class Class84_Sub2 extends Class84 {

	@OriginalMember(owner = "client!adr", name = "z", descriptor = "I")
	static final int anInt294 = 34073;

	@OriginalMember(owner = "client!adr", name = "d", descriptor = "I")
	static final int anInt295 = 34072;

	@OriginalMember(owner = "client!adr", name = "h", descriptor = "I")
	static final int anInt296 = 34071;

	@OriginalMember(owner = "client!adr", name = "q", descriptor = "I")
	static final int anInt297 = 34070;

	@OriginalMember(owner = "client!adr", name = "r", descriptor = "I")
	static final int anInt298 = 34069;

	@OriginalMember(owner = "client!adr", name = "p", descriptor = "I")
	static final int anInt299 = 34074;

	@OriginalMember(owner = "client!adr", name = "v", descriptor = "I")
	final int anInt300;

	@OriginalMember(owner = "client!adr", name = "<init>", descriptor = "(Lclient!afm;Lclient!co;Lclient!dy;IZ[[BLclient!co;)V")
	Class84_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) Class210 arg6) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.anInt300 = arg3;
		this.aClass102_Sub3_34.method6339(this);
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			OpenGL.glTexImage2Dub(local20 + 34069, 0, Class102_Sub3.method6411(this.aClass210_16, this.aClass236_17), arg3, arg3, 0, Class102_Sub3.method6423(arg6), 5121, arg5[local20], 0);
		}
		this.method18340(true);
	}

	@OriginalMember(owner = "client!adr", name = "<init>", descriptor = "(Lclient!afm;Lclient!co;Lclient!dy;I)V")
	Class84_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, false);
		this.anInt300 = arg3;
		this.aClass102_Sub3_34.method6339(this);
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			OpenGL.glTexImage2Dub(local20 + 34069, 0, Class102_Sub3.method6411(this.aClass210_16, this.aClass236_17), arg3, arg3, 0, Class102_Sub3.method6423(this.aClass210_16), 5121, null, 0);
		}
		this.method18340(true);
	}

	@OriginalMember(owner = "client!adr", name = "<init>", descriptor = "(Lclient!afm;Lclient!co;Lclient!dy;IZ[[I)V")
	Class84_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[][] arg5) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.anInt300 = arg3;
		this.aClass102_Sub3_34.method6339(this);
		@Pc(22) int local22;
		if (arg4) {
			for (local22 = 0; local22 < 6; local22++) {
				method18325(local22 + 34069, Class102_Sub3.method6411(this.aClass210_16, this.aClass236_17), arg3, arg3, 32993, this.aClass102_Sub3_34.anInt812, arg5[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, Class102_Sub3.method6411(this.aClass210_16, this.aClass236_17), arg3, arg3, 0, 32993, this.aClass102_Sub3_34.anInt812, arg5[local22], 0);
			}
		}
		this.method18340(true);
	}

	@OriginalMember(owner = "client!adr", name = "ag", descriptor = "(II)Lclient!do;")
	Interface18 method1739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class216(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!adr", name = "ab", descriptor = "(II)Lclient!do;")
	Interface18 method1740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class216(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!adr", name = "al", descriptor = "(II)Lclient!do;")
	Interface18 method1741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class216(this, arg0, arg1);
	}
}
