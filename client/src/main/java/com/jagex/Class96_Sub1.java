package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public class Class96_Sub1 extends Class96 {

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "Lclient!apr;")
	final Class88_Sub2_Sub1 aClass88_Sub2_Sub1_1;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!afa;II[B)V", line = 9)
	Class96_Sub1(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass88_Sub2_Sub1_1 = Class88_Sub2_Sub1.method18106(arg0, Class206.aClass206_19, Class226.aClass226_22, arg1, arg2, false, arg3, Class206.aClass206_19);
		this.aClass88_Sub2_Sub1_1.method18079(false, false);
	}

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "(Lclient!afa;II[I[I)Lclient!aea;", line = 15)
	static Class96_Sub1 method1812(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = local6 * arg1 + arg3[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class96_Sub1(arg0, arg1, arg2, local4);
	}

	@OriginalMember(owner = "client!aea", name = "n", descriptor = "(Lclient!afa;II[I[I)Lclient!aea;", line = 15)
	static Class96_Sub1 method1813(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = local6 * arg1 + arg3[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class96_Sub1(arg0, arg1, arg2, local4);
	}

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "(Lclient!afa;II[I[I)Lclient!aea;", line = 15)
	static Class96_Sub1 method1814(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = local6 * arg1 + arg3[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class96_Sub1(arg0, arg1, arg2, local4);
	}
}
