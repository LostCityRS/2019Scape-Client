package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zz")
public final class Class723 {

	@OriginalMember(owner = "client!zz", name = "g", descriptor = "(Lclient!yy;Lclient!zw;I)I")
	public static int method37340(@OriginalArg(0) Class697 arg0, @OriginalArg(1) Class720 arg1, @OriginalArg(2) int arg2) {
		return Class697.aClass697_4 == arg0 ? 443 : arg2 + 50000;
	}

	@OriginalMember(owner = "client!zz", name = "u", descriptor = "(Lclient!yy;Lclient!zw;I)I")
	public static int method37341(@OriginalArg(0) Class697 arg0, @OriginalArg(1) Class720 arg1, @OriginalArg(2) int arg2) {
		return Class697.aClass697_4 == arg0 ? 43594 : arg2 + 40000;
	}

	@OriginalMember(owner = "client!zz", name = "l", descriptor = "(Lclient!yy;Lclient!zw;I)I")
	public static int method37342(@OriginalArg(0) Class697 arg0, @OriginalArg(1) Class720 arg1, @OriginalArg(2) int arg2) {
		return Class697.aClass697_4 == arg0 ? 43594 : arg2 + 40000;
	}

	@OriginalMember(owner = "client!zz", name = "kx", descriptor = "(Lclient!hx;IIS)V")
	public static void method37343(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray20 != null) {
			@Pc(10) Class80_Sub42 local10 = new Class80_Sub42();
			local10.aClass327_3 = arg0;
			local10.anObjectArray4 = arg0.anObjectArray20;
			Class279.method26847(local10, -637963678);
		}
		client.aBoolean728 = true;
		Class86.anInt284 = arg0.anInt4087 * 291333713;
		client.anInt3526 = arg0.anInt4094 * 351812633;
		Class542.anInt5121 = arg1 * 1261177955;
		Class34.anInt107 = arg2 * -581720177;
		client.anInt3527 = arg0.anInt4167 * 1060301249;
		Class107_Sub1.anInt682 = arg0.anInt4107 * 1605378757;
		client.anInt3502 = arg0.anInt4108 * 1694448135;
		Class296.method26998(arg0, -918253291);
	}

	@OriginalMember(owner = "client!zz", name = "o", descriptor = "(IIIILclient!abg;ZI)V")
	static void method37344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class33 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(8) long local8 = (long) (arg0 | (arg5 ? Integer.MIN_VALUE : 0));
		@Pc(13) Class80_Sub3 local13 = (Class80_Sub3) Class80_Sub3.aClass24_9.method560(local8);
		if (local13 == null) {
			local13 = new Class80_Sub3();
			Class80_Sub3.aClass24_9.method563(local13, local8);
		}
		if (local13.anIntArray179.length <= arg1) {
			@Pc(33) int[] local33 = new int[arg1 + 1];
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(40) Class33[] local40 = null;
			if (local13.aClass33Array1 != null) {
				local40 = new Class33[arg1 + 1];
			}
			@Pc(51) int local51;
			for (local51 = 0; local51 < local13.anIntArray179.length; local51++) {
				local33[local51] = local13.anIntArray179[local51];
				local38[local51] = local13.anIntArray178[local51];
				if (local13.aClass33Array1 != null) {
					local40[local51] = local13.aClass33Array1[local51];
				}
			}
			for (local51 = local13.anIntArray179.length; local51 < arg1; local51++) {
				local33[local51] = -1;
				local38[local51] = 0;
			}
			local13.anIntArray179 = local33;
			local13.anIntArray178 = local38;
			local13.aClass33Array1 = local40;
		}
		local13.anIntArray179[arg1] = arg2;
		local13.anIntArray178[arg1] = arg3;
		if (arg4 != null) {
			if (local13.aClass33Array1 == null) {
				local13.aClass33Array1 = new Class33[local13.anIntArray179.length];
			}
			local13.aClass33Array1[arg1] = arg4;
		} else if (local13.aClass33Array1 != null) {
			local13.aClass33Array1[arg1] = null;
		}
	}

	@OriginalMember(owner = "client!zz", name = "ee", descriptor = "(IB)V")
	public static void method37345(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 < 1) {
			Class159_Sub1.anInt2024 = Class159_Sub1.anInt2016 * 1716757035;
		} else {
			Class159_Sub1.anInt2024 = arg0 * 1367340173;
		}
	}

	@OriginalMember(owner = "client!zz", name = "aib", descriptor = "(Lclient!yp;B)V")
	static void method37346(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(17) Class80_Sub1_Sub17 local17 = Class71.aClass510_2.method30536(local12, 1595390616);
		if (local17.anIntArray277 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local17.anIntArray277.length;
		}
	}

	@OriginalMember(owner = "client!zz", name = "y", descriptor = "(Lclient!yp;I)V")
	static void method37347(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], 1963114200)).method28035(Class672.aClass134_1, (short) 255) ? 1 : 0;
	}

	@OriginalMember(owner = "client!zz", name = "<init>", descriptor = "()V")
	Class723() throws Throwable {
		throw new Error();
	}
}
