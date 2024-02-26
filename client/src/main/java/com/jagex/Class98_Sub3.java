package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aet")
public final class Class98_Sub3 extends Class98 {

	@OriginalMember(owner = "client!aet", name = "t", descriptor = "Lclient!lb;")
	final Interface34 anInterface34_2;

	@OriginalMember(owner = "client!aet", name = "t", descriptor = "(Lclient!afa;II[I[I)Lclient!aet;")
	static Class98_Sub3 method2709(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(11) int local11;
		@Pc(22) int local22;
		@Pc(24) int local24;
		if (!arg0.method21204(Class210.aClass210_17, Class236.aClass236_21)) {
			@Pc(51) int[] local51 = new int[arg1 * arg2];
			for (local11 = 0; local11 < arg2; local11++) {
				local22 = local11 * arg1 + arg3[local11];
				for (local24 = 0; local24 < arg4[local11]; local24++) {
					local51[local22++] = -16777216;
				}
			}
			return new Class98_Sub3(arg0, arg1, arg2, local51);
		}
		@Pc(9) byte[] local9 = new byte[arg1 * arg2];
		for (local11 = 0; local11 < arg2; local11++) {
			local22 = local11 * arg1 + arg3[local11];
			for (local24 = 0; local24 < arg4[local11]; local24++) {
				local9[local22++] = -1;
			}
		}
		return new Class98_Sub3(arg0, arg1, arg2, local9);
	}

	@OriginalMember(owner = "client!aet", name = "f", descriptor = "(Lclient!afa;II[I[I)Lclient!aet;")
	static Class98_Sub3 method2710(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(11) int local11;
		@Pc(22) int local22;
		@Pc(24) int local24;
		if (!arg0.method21204(Class210.aClass210_17, Class236.aClass236_21)) {
			@Pc(51) int[] local51 = new int[arg1 * arg2];
			for (local11 = 0; local11 < arg2; local11++) {
				local22 = local11 * arg1 + arg3[local11];
				for (local24 = 0; local24 < arg4[local11]; local24++) {
					local51[local22++] = -16777216;
				}
			}
			return new Class98_Sub3(arg0, arg1, arg2, local51);
		}
		@Pc(9) byte[] local9 = new byte[arg1 * arg2];
		for (local11 = 0; local11 < arg2; local11++) {
			local22 = local11 * arg1 + arg3[local11];
			for (local24 = 0; local24 < arg4[local11]; local24++) {
				local9[local22++] = -1;
			}
		}
		return new Class98_Sub3(arg0, arg1, arg2, local9);
	}

	@OriginalMember(owner = "client!aet", name = "<init>", descriptor = "(Lclient!afa;II[I)V")
	Class98_Sub3(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface34_2 = arg0.method21206(arg1, arg2, false, arg3);
		this.anInterface34_2.method11656(false, false);
	}

	@OriginalMember(owner = "client!aet", name = "<init>", descriptor = "(Lclient!afa;II[B)V")
	Class98_Sub3(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface34_2 = arg0.method21179(Class210.aClass210_17, arg1, arg2, false, arg3);
		this.anInterface34_2.method11656(false, false);
	}
}
