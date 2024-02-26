package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aek")
public final class Class98_Sub1 extends Class98 {

	@OriginalMember(owner = "client!aek", name = "t", descriptor = "Lclient!apr;")
	final Class84_Sub1_Sub1 aClass84_Sub1_Sub1_1;

	@OriginalMember(owner = "client!aek", name = "t", descriptor = "(Lclient!afm;II[I[I)Lclient!aek;")
	static Class98_Sub1 method2136(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = local6 * arg1 + arg3[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class98_Sub1(arg0, arg1, arg2, local4);
	}

	@OriginalMember(owner = "client!aek", name = "f", descriptor = "(Lclient!afm;II[I[I)Lclient!aek;")
	static Class98_Sub1 method2137(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = local6 * arg1 + arg3[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class98_Sub1(arg0, arg1, arg2, local4);
	}

	@OriginalMember(owner = "client!aek", name = "<init>", descriptor = "(Lclient!afm;II[B)V")
	Class98_Sub1(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass84_Sub1_Sub1_1 = Class84_Sub1_Sub1.method18376(arg0, Class210.aClass210_17, Class236.aClass236_21, arg1, arg2, false, arg3, Class210.aClass210_17);
		this.aClass84_Sub1_Sub1_1.method18355(false, false);
	}
}
